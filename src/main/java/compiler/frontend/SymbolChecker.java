package compiler.frontend;

import org.antlr.v4.runtime.tree.ParseTree;

import antlr.SimpleCBaseVisitor;
import antlr.SimpleCParser;

public class SymbolChecker extends SimpleCBaseVisitor<Boolean> {
    protected SymbolTable symbolTable;

    public Boolean visitTranslationUnit(SimpleCParser.TranslationUnitContext ctx) {
        boolean curState = true;
        for (ParseTree c : ctx.children)
            curState = (curState && this.visit(c));
        return curState;
    }

    public Boolean visitFunctionDefinition(SimpleCParser.FunctionDefinitionContext ctx) {
        symbolTable.insert(ctx.name.getText());

        boolean curState = true;
        symbolTable.initializeScope(ctx);

        int num_args = ctx.args.size();
        for (ParseTree c : ctx.args) {
            curState = (curState && this.visit(c));
        }
        curState = (curState && this.visit(ctx.body));
        symbolTable.finalizeScope();
        return curState;
    }

    public Boolean visitFunctionArgument(SimpleCParser.FunctionArgumentContext ctx) {
        symbolTable.insert(ctx.name.getText());
        return true;
    }

    public Boolean visitVoidType(SimpleCParser.VoidTypeContext ctx) {
        return true;
    }

    public Boolean visitIntType(SimpleCParser.IntTypeContext ctx) {
        return true;
    }

    public Boolean visitUintType(SimpleCParser.UintTypeContext ctx) {
        return true;
    }

    @Override
    public Boolean visitBlockStatement(SimpleCParser.BlockStatementContext ctx) {
        symbolTable.initializeScope(ctx);
        boolean curState = true;
        for (ParseTree child : ctx.statements) {
            curState = (curState && this.visit(child));
        }
        symbolTable.finalizeScope();
        return curState;
    }

    @Override
    public Boolean visitReturnStatement(SimpleCParser.ReturnStatementContext ctx) {
        return visit(ctx.expr);
    }

    @Override
    public Boolean visitExpressionStatement(SimpleCParser.ExpressionStatementContext ctx) {
        return this.visit(ctx.expr);
    }

    @Override
    public Boolean visitExprNode(SimpleCParser.ExprNodeContext ctx) {
        return this.visit(ctx.expr1);
    }

    @Override
    public Boolean visitMulExpr(SimpleCParser.MulExprContext ctx) {
        return this.visit(ctx.expr1)
                && this.visit(ctx.expr2);
    }

    @Override
    public Boolean visitOppExpr(SimpleCParser.OppExprContext ctx) {
        return this.visit(ctx.expr1);
    }

    @Override
    public Boolean visitIntNode(SimpleCParser.IntNodeContext ctx) {
        return true;
    }

    @Override
    public Boolean visitDivExpr(SimpleCParser.DivExprContext ctx) {
        return this.visit(ctx.expr1)
                && this.visit(ctx.expr2);
    }

    @Override
    public Boolean visitCmpLtExpr(SimpleCParser.CmpLtExprContext ctx) {
        return this.visit(ctx.expr1)
                && this.visit(ctx.expr2);
    }

    @Override
    public Boolean visitIdNode(SimpleCParser.IdNodeContext ctx) {
        return symbolTable.lookup(ctx.name.getText()) != null;
    }

    @Override
    public Boolean visitCmpGtExpr(SimpleCParser.CmpGtExprContext ctx) {
        return this.visit(ctx.expr1)
                && this.visit(ctx.expr2);
    }

    @Override
    public Boolean visitSubExpr(SimpleCParser.SubExprContext ctx) {
        return this.visit(ctx.expr1)
                && this.visit(ctx.expr2);
    }

    @Override
    public Boolean visitAddExpr(SimpleCParser.AddExprContext ctx) {
        return this.visit(ctx.expr1)
                && this.visit(ctx.expr2);
    }

    @Override
    public Boolean visitFunctionCall(SimpleCParser.FunctionCallContext ctx) {
        boolean curState = (symbolTable.lookup(ctx.name.getText()) != null);

        for (ParseTree child : ctx.args) {
            curState = (curState && this.visit(child));
        }
        return curState;
    }

    @Override
    public Boolean visitAssign(SimpleCParser.AssignContext ctx) {
        return this.visit(ctx.expr) && (symbolTable.lookup(ctx.var.getText()) != null);
    }

    @Override
    public Boolean visitAssignStatement(SimpleCParser.AssignStatementContext ctx) {
        return this.visit(ctx.expr);
    }

    @Override
    public Boolean visitDeclStatement(SimpleCParser.DeclStatementContext ctx) {
        // varType présent si nécessaire
        symbolTable.insert(ctx.var.getText());
        return this.visit(ctx.expr);
    }

    @Override
    public Boolean visitWhileStatement(SimpleCParser.WhileStatementContext ctx) {
        return this.visit(ctx.expr)
                && this.visit(ctx.whileBlock);
    }

    @Override
    public Boolean visitIfStatement(SimpleCParser.IfStatementContext ctx) {
        return this.visit(ctx.expr)
                && this.visit(ctx.ifBlock)
                && (ctx.elseBlock == null || this.visit(ctx.elseBlock));
    }

    @Override
    public Boolean visitForStatement(SimpleCParser.ForStatementContext ctx) {
        return this.visit(ctx.expr1)
                && this.visit(ctx.expr2)
                && this.visit(ctx.expr3)
                && this.visit(ctx.forBlock);
    }
}
