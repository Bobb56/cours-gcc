package compiler.frontend;

import java.util.*;

import ir.core.*;
import ir.terminator.IRCondBr;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.SimpleCBaseVisitor;
import antlr.SimpleCParser;
import antlr.SimpleCParser.AddExprContext;
import antlr.SimpleCParser.BlockStatementContext;
import antlr.SimpleCParser.CmpGtExprContext;
import antlr.SimpleCParser.CmpLtExprContext;
import antlr.SimpleCParser.DivExprContext;
import antlr.SimpleCParser.ExprNodeContext;
import antlr.SimpleCParser.ExpressionContext;
import antlr.SimpleCParser.FunctionArgumentContext;
import antlr.SimpleCParser.FunctionCallContext;
import antlr.SimpleCParser.FunctionDefinitionContext;
import antlr.SimpleCParser.IdNodeContext;
import antlr.SimpleCParser.IntNodeContext;
import antlr.SimpleCParser.IntTypeContext;
import antlr.SimpleCParser.MulExprContext;
import antlr.SimpleCParser.OppExprContext;
import antlr.SimpleCParser.ReturnStatementContext;
import antlr.SimpleCParser.StatementContext;
import antlr.SimpleCParser.SubExprContext;
import antlr.SimpleCParser.TypeContext;
import antlr.SimpleCParser.UintTypeContext;
import antlr.SimpleCParser.WhileStatementContext;
import antlr.SimpleCParser.ForStatementContext;
import antlr.SimpleCParser.IfStatementContext;
import antlr.SimpleCParser.DeclStatementContext;
import antlr.SimpleCParser.AssignStatementContext;
import antlr.SimpleCParser.TranslationUnitContext;
import ir.instruction.IRAddInstruction;
import ir.instruction.IRCompareGtInstruction;
import ir.instruction.IRCompareLtInstruction;
import ir.instruction.IRConstantInstruction;
import ir.instruction.IRDivInstruction;
import ir.instruction.IRFunctionCallInstruction;
import ir.instruction.IRMulInstruction;
import ir.instruction.IRSubInstruction;
import ir.terminator.IRGoto;
import ir.terminator.IRReturn;
import compiler.dataflow.PhiSimplification;

public class IRBuilder extends SimpleCBaseVisitor<BuilderResult> {

	IRTopLevel top;
	IRFunction currentFunction = null;
	IRBlock currentBlock = null;
	SymbolTable symbolTable;
	protected HashMap<IRBlock, Boolean> sealedBlocks;
	protected Set<IRBlock> worklist;

	public static IRTopLevel buildTopLevel(ParseTree t) {
		IRBuilder builder = new IRBuilder();
		builder.visit(t);
		builder.simplifyAllPhis();
		return builder.top;
	}

	public IRBuilder() {
		sealedBlocks = new HashMap<IRBlock, Boolean>();
		top = new IRTopLevel();
		symbolTable = null;
	}

	IRType translateType(TypeContext t) {
		if (t instanceof IntTypeContext) {
			return IRType.INT;
		}
		else if (t instanceof UintTypeContext) {
			return IRType.UINT;
		}
		return null;
	}

	protected void simplifyAllPhis() {
		for(IRFunction f : this.top.getFunctions()) {
			PhiSimplification a = new PhiSimplification(f);
			a.runAnalysis();
		}
	}

	protected void seal(IRBlock b) {
		sealedBlocks.put(b, true);

		for (Map.Entry<IRPhiOperation, String> phi : b.getPendingPhis().entrySet()) {
			for (IRBlock pred : b.getPredecessors()) {
				phi.getKey().addOperand(findSSAValueRec(pred, phi.getValue()));
			}
		}
	}

	@Override
	public BuilderResult visitTranslationUnit(TranslationUnitContext ctx) {
		SymbolChecker symbolChecker = new SymbolChecker();
		symbolChecker.visit(ctx);

		this.symbolTable = symbolChecker.getTable();

		symbolTable.enterIRBlock();
		visitChildren(ctx);
		symbolTable.exitIRBlock();
		return null;
	}

	@Override
	public BuilderResult visitFunctionDefinition(FunctionDefinitionContext ctx) {
		//We build the list of arg types
		ArrayList<IRType> argTypes = new ArrayList<IRType>();
		for (FunctionArgumentContext a : ctx.args) {
			argTypes.add(translateType(a.argType));
		}

		//We instantiate a new function and add it in the toplevel
		IRFunction func = new IRFunction(ctx.name.getText(), translateType(ctx.returnType), argTypes);
		top.addFunction(func);

		symbolTable.enterIRBlock();

		//We mark the newly created function as currentFunction : blocks will be added inside
		currentFunction = func;

		IRBlock entryBlock = createBlock(func);
		currentBlock = entryBlock;
		int i=0;
		for (FunctionArgumentContext a : ctx.args) {
			symbolTable.insert(a.name.getText(), a.type()).addValue(entryBlock, func.getArgs().get(i));
			i++;
		}
		seal(entryBlock);

		//Recursive call to the body to get its IR
		BuilderResult body = visitBlockStatement(ctx.body);

		entryBlock.addTerminator(new IRGoto(body.entry));

		//We connect the result with the entry block and seal the body
		seal(body.entry);

		symbolTable.exitIRBlock();

		//Don't care about the value returned
		return null;
	}

	@Override
	public BuilderResult visitStatement(StatementContext ctx) {
		return this.visit(ctx.children.getFirst());
	}

	@Override
	public BuilderResult visitBlockStatement(BlockStatementContext ctx) {
		symbolTable.enterIRBlock();

		//We create a new block, save it as in point and current point
		IRBlock in =  createBlock(currentFunction);
		IRBlock current = in;
		currentBlock = current;

		//Recursive call for each child
		for (StatementContext s : ctx.statements) {
			BuilderResult r = visit(s);
			if (r.hasBlock) {
				//We have to insert blocks from recursive call
				current.addTerminator(new IRGoto(r.entry));
				seal(r.entry);
				current = r.exit;
				currentBlock = current;
			}
		}

		symbolTable.exitIRBlock();
		return new BuilderResult(true, in, current, null);
	}

	@Override
	public BuilderResult visitWhileStatement(WhileStatementContext ctx) {
		IRBlock inBlock = currentFunction.addBlock();
		IRBlock outBlock = currentFunction.addBlock();
		currentBlock = inBlock;

		BuilderResult exprResult = this.visit(ctx.expr);
		BuilderResult whileResult = this.visit(ctx.whileBlock);

		// whileBlock is currentBlock
		currentBlock.addTerminator(new IRGoto(inBlock));

		IRCondBr condTerm = new IRCondBr(exprResult.value, whileResult.entry, outBlock);
		inBlock.addTerminator(condTerm);

		seal(whileResult.entry);
		seal(outBlock);
		return (new BuilderResult(true, inBlock, outBlock, null));
	}

	@Override
	public BuilderResult visitIfStatement(IfStatementContext ctx) {
		IRBlock inBlock = currentFunction.addBlock();
		IRBlock outBlock = currentFunction.addBlock();
		currentBlock = inBlock;

		BuilderResult exprResult = this.visit(ctx.expr);
		BuilderResult thenResult = this.visit(ctx.ifBlock);
		// thenBlock is currentBlock
		currentBlock.addTerminator(new IRGoto(outBlock));

		if(ctx.elseBlock != null) {
			BuilderResult elseResult = this.visit(ctx.elseBlock);
			IRCondBr condTerm = new IRCondBr(exprResult.value, thenResult.entry, elseResult.entry);
			inBlock.addTerminator(condTerm);
			seal(elseResult.entry);

			// elseBlock is currentBlock
			currentBlock.addTerminator(new IRGoto(outBlock));
		}
		else {
			IRCondBr condTerm = new IRCondBr(exprResult.value, thenResult.entry, outBlock);
			inBlock.addTerminator(condTerm);
		}
		seal(thenResult.entry);

		seal(outBlock);
		return (new BuilderResult(true, inBlock, outBlock, null));
	}

	public BuilderResult visitForStatement(ForStatementContext ctx) {
		IRBlock inBlock = currentFunction.addBlock();
		IRBlock condBlock = currentFunction.addBlock();
		IRBlock outBlock = currentFunction.addBlock();
		currentBlock = inBlock;

		// DeclStatement
		this.visit(ctx.expr1);
		inBlock.addTerminator(new IRGoto(condBlock));

		// Now we switch to condBlock
		currentBlock = condBlock;
		BuilderResult exprResult = this.visit(ctx.expr2);

		BuilderResult forResult = this.visit(ctx.forBlock);

		// Incrementation
		this.visit(ctx.expr3);

		// forBlock is currentBlock
		currentBlock.addTerminator(new IRGoto(condBlock));

		IRCondBr condTerm = new IRCondBr(exprResult.value, forResult.entry, outBlock);
		condBlock.addTerminator(condTerm);

		seal(forResult.entry);
		seal(outBlock);
		seal(condBlock);
		return (new BuilderResult(true, inBlock, outBlock, null));
	}


	/****************************************************************************
	 *  Return/call statements
	 *
	 ****************************************************************************/

	@Override
	public BuilderResult visitReturnStatement(ReturnStatementContext ctx) {
		BuilderResult res = this.visit(ctx.expr);
		IRReturn newInstr = new IRReturn(res.value);
		currentBlock.addOperation(newInstr);
		return new BuilderResult(false, null, null, null);
	}

	@Override
	public BuilderResult visitFunctionCall(FunctionCallContext ctx) {
		//We gather arg values
		ArrayList<IRValue> args = new ArrayList<IRValue>();
		for (ExpressionContext a : ctx.args) {
			BuilderResult res = this.visit(a);
			assert(res.value != null);
			args.add(res.value);
		}

		IRType returnType = IRType.UINT;
		IRFunction func = null;
		for (IRFunction f : top.getFunctions()) {
			if (f.getName().equals(ctx.name.getText())) {
				returnType = f.getReturnType();
				func = f;
			}
		}
		IRFunctionCallInstruction funcCall = new IRFunctionCallInstruction(func, returnType, args);
		currentBlock.addOperation(funcCall);

		return new BuilderResult(false, null, null, funcCall.getResult());
	}

	/****************************************************************************
	 *  Non control flow statements
	 *
	 ****************************************************************************/

	public BuilderResult visitDeclStatement(DeclStatementContext ctx) {
		BuilderResult res = ctx.expr.accept(this);
		this.symbolTable.lookup(ctx.var.getText()).addValue(currentBlock, res.value);
		return new BuilderResult(false, null, null, res.value);
	}

	public BuilderResult visitAssignStatement(AssignStatementContext ctx) {
		return ctx.expr.accept(this);
	}

	public BuilderResult visitAssign(SimpleCParser.AssignContext ctx) {
		// Ajout à la table des symboles
		BuilderResult res = visit(ctx.expr);
		this.symbolTable.lookup(ctx.var.getText()).addValue(currentBlock, res.value);
		return new BuilderResult(false, null, null, res.value);
	}

	@Override
	public BuilderResult visitAddExpr(AddExprContext ctx) {
		BuilderResult res1 = ctx.expr1.accept(this);
		BuilderResult res2 = ctx.expr2.accept(this);

		IRAddInstruction instr = new IRAddInstruction(res1.value, res2.value);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitSubExpr(SubExprContext ctx) {

		BuilderResult res1 = ctx.expr1.accept(this);
		BuilderResult res2 = ctx.expr2.accept(this);

		IRSubInstruction instr = new IRSubInstruction(res1.value, res2.value);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitMulExpr(MulExprContext ctx) {

		BuilderResult res1 = ctx.expr1.accept(this);
		BuilderResult res2 = ctx.expr2.accept(this);

		IRMulInstruction instr = new IRMulInstruction(res1.value, res2.value);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitDivExpr(DivExprContext ctx) {

		BuilderResult res1 = ctx.expr1.accept(this);
		BuilderResult res2 = ctx.expr2.accept(this);

		IRDivInstruction instr = new IRDivInstruction(res1.value, res2.value);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitCmpGtExpr(CmpGtExprContext ctx) {

		BuilderResult res1 = ctx.expr1.accept(this);
		BuilderResult res2 = ctx.expr2.accept(this);

		IRCompareGtInstruction instr = new IRCompareGtInstruction(res1.value, res2.value);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitCmpLtExpr(CmpLtExprContext ctx) {

		BuilderResult res1 = ctx.expr1.accept(this);
		BuilderResult res2 = ctx.expr2.accept(this);

		IRCompareLtInstruction instr = new IRCompareLtInstruction(res1.value, res2.value);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitOppExpr(OppExprContext ctx) {

		BuilderResult res1 = ctx.expr1.accept(this);

		IRConstantInstruction<Integer> zeroCst = new IRConstantInstruction<Integer>(IRType.INT, 0);
		IRSubInstruction instr = new IRSubInstruction(zeroCst.getResult(), res1.value);
		currentBlock.addOperation(zeroCst);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitExprNode(ExprNodeContext ctx) {

		BuilderResult res1 = ctx.expr1.accept(this);

		return new BuilderResult(false, null, null, res1.value);
	}

	@Override
	public BuilderResult visitIntNode(IntNodeContext ctx) {
		Integer val = Integer.parseInt(ctx.children.getFirst().getText());
		IRConstantInstruction<Integer> instr = new IRConstantInstruction<Integer>(IRType.INT, val);
		currentBlock.addOperation(instr);

		return new BuilderResult(false, null, null, instr.getResult());
	}

	@Override
	public BuilderResult visitIdNode(IdNodeContext ctx) {
		IRValue val = findSSAValueRec(currentBlock, ctx.name.getText());
		return new BuilderResult(false, null, null, val);
	}

	@Override
	public BuilderResult visitExpressionStatement(SimpleCParser.ExpressionStatementContext ctx) {
		return visit(ctx.expr);
	}

	private IRBlock createBlock(IRFunction f) {
		return f.addBlock();
	}

	public IRValue findSSAValueRec(IRBlock block, String varname) {
		IRValue val = symbolTable.lookup(varname).values.get(block);
		if (val != null) {
			// la variable a été écrite dans le bloc
			return val;
		}
		else {
			if (sealedBlocks.get(block) != null) {
				// le bloc a été seal
				if (block.getPredecessors().size() == 1) {
					return findSSAValueRec(block.getPredecessors().getFirst(), varname);
				}
				else {
					// on crée un phi du type de la variable
					IRPhiOperation phi = new IRPhiOperation(translateType(symbolTable.lookup(varname).type));

					// mise à jour de la valeur de la variable dans la table des symboles
					symbolTable.lookup(varname).addValue(block, phi.getResult());

					for (IRBlock pred : block.getPredecessors()) {
						// on ajoute chaque valeur récupérée dans les blocs précédents aux opérandes du phi
						phi.addOperand(findSSAValueRec(pred, varname));
					}

					// ajout du phi au bloc
					block.addPhi(phi);

					return phi.getResult();
				}
			}
			else {
				// le bloc n'a pas été seal
				IRPhiOperation phi = new IRPhiOperation(translateType(symbolTable.lookup(varname).type));
				block.addPhi(phi);
				symbolTable.lookup(varname).addValue(block, phi.getResult());
				block.addPendingPhi(phi, varname);

				return phi.getResult();
			}
		}
	}
}
