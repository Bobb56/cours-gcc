// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCParser}.
 */
public interface SimpleCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(SimpleCParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(SimpleCParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SimpleCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SimpleCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgument(SimpleCParser.FunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgument(SimpleCParser.FunctionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(SimpleCParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(SimpleCParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(SimpleCParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(SimpleCParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UintType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterUintType(SimpleCParser.UintTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UintType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitUintType(SimpleCParser.UintTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SimpleCParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SimpleCParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#declStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclStatement(SimpleCParser.DeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#declStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclStatement(SimpleCParser.DeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SimpleCParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SimpleCParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(SimpleCParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(SimpleCParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimpleCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimpleCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SimpleCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SimpleCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimpleCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimpleCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimpleCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimpleCParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNode(SimpleCParser.ExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNode(SimpleCParser.ExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(SimpleCParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(SimpleCParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OppExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOppExpr(SimpleCParser.OppExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OppExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOppExpr(SimpleCParser.OppExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntNode(SimpleCParser.IntNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntNode(SimpleCParser.IntNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(SimpleCParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(SimpleCParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CmpLtExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmpLtExpr(SimpleCParser.CmpLtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CmpLtExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmpLtExpr(SimpleCParser.CmpLtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdNode(SimpleCParser.IdNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdNode(SimpleCParser.IdNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CmpGtExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmpGtExpr(SimpleCParser.CmpGtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CmpGtExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmpGtExpr(SimpleCParser.CmpGtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(SimpleCParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(SimpleCParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(SimpleCParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(SimpleCParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(SimpleCParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(SimpleCParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SimpleCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SimpleCParser.FunctionCallContext ctx);
}