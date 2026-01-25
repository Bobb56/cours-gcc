// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(SimpleCParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SimpleCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(SimpleCParser.FunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(SimpleCParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(SimpleCParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UintType}
	 * labeled alternative in {@link SimpleCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUintType(SimpleCParser.UintTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SimpleCParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#declStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStatement(SimpleCParser.DeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SimpleCParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(SimpleCParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SimpleCParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SimpleCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SimpleCParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNode(SimpleCParser.ExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(SimpleCParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OppExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOppExpr(SimpleCParser.OppExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNode(SimpleCParser.IntNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(SimpleCParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CmpLtExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpLtExpr(SimpleCParser.CmpLtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdNode}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdNode(SimpleCParser.IdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CmpGtExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpGtExpr(SimpleCParser.CmpGtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(SimpleCParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(SimpleCParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(SimpleCParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SimpleCParser.FunctionCallContext ctx);
}