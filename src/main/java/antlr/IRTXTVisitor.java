// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IRTXTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IRTXTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link IRTXTParser#irType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(IRTXTParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRINT}
	 * labeled alternative in {@link IRTXTParser#irType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRINT(IRTXTParser.IRINTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRUINT}
	 * labeled alternative in {@link IRTXTParser#irType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRUINT(IRTXTParser.IRUINTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRCHAR}
	 * labeled alternative in {@link IRTXTParser#irType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRCHAR(IRTXTParser.IRCHARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRFLOAT}
	 * labeled alternative in {@link IRTXTParser#irType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRFLOAT(IRTXTParser.IRFLOATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRADDR}
	 * labeled alternative in {@link IRTXTParser#irType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRADDR(IRTXTParser.IRADDRContext ctx);
	/**
	 * Visit a parse tree produced by {@link IRTXTParser#irTop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIrTop(IRTXTParser.IrTopContext ctx);
	/**
	 * Visit a parse tree produced by {@link IRTXTParser#irFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIrFunction(IRTXTParser.IrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IRTXTParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(IRTXTParser.FunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IRTXTParser#irBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIrBlock(IRTXTParser.IrBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRCommonOperation}
	 * labeled alternative in {@link IRTXTParser#irOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRCommonOperation(IRTXTParser.IRCommonOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRConstantOperation}
	 * labeled alternative in {@link IRTXTParser#irOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRConstantOperation(IRTXTParser.IRConstantOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRCallOperation}
	 * labeled alternative in {@link IRTXTParser#irOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRCallOperation(IRTXTParser.IRCallOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRStoreOperation}
	 * labeled alternative in {@link IRTXTParser#irOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRStoreOperation(IRTXTParser.IRStoreOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRCondBr}
	 * labeled alternative in {@link IRTXTParser#irTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRCondBr(IRTXTParser.IRCondBrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRGoto}
	 * labeled alternative in {@link IRTXTParser#irTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRGoto(IRTXTParser.IRGotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IRReturn}
	 * labeled alternative in {@link IRTXTParser#irTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIRReturn(IRTXTParser.IRReturnContext ctx);
}