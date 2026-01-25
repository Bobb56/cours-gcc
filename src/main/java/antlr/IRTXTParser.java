// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IRTXTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, IDENTIFIER=21, IRVALUE=22, INTEGER=23, WS=24;
	public static final int
		RULE_irType = 0, RULE_irTop = 1, RULE_irFunction = 2, RULE_functionArgument = 3, 
		RULE_irBlock = 4, RULE_irOperation = 5, RULE_irTerminator = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"irType", "irTop", "irFunction", "functionArgument", "irBlock", "irOperation", 
			"irTerminator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'INT'", "'UINT'", "'CHAR'", "'FLOAT'", "'ADDR'", "'function'", 
			"'('", "','", "')'", "':'", "'{'", "'}'", "'='", "'call'", "'store'", 
			"'condbr'", "'?'", "'goto'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IDENTIFIER", "IRVALUE", 
			"INTEGER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IRTXTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IrTypeContext extends ParserRuleContext {
		public IrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irType; }
	 
		public IrTypeContext() { }
		public void copyFrom(IrTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends IrTypeContext {
		public VoidTypeContext(IrTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRFLOATContext extends IrTypeContext {
		public IRFLOATContext(IrTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRFLOAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRFLOAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRADDRContext extends IrTypeContext {
		public IRADDRContext(IrTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRADDR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRADDR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRADDR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRCHARContext extends IrTypeContext {
		public IRCHARContext(IrTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRCHAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRCHAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRCHAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRINTContext extends IrTypeContext {
		public IRINTContext(IrTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRINT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRUINTContext extends IrTypeContext {
		public IRUINTContext(IrTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRUINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRUINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRUINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrTypeContext irType() throws RecognitionException {
		IrTypeContext _localctx = new IrTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_irType);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new IRINTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new IRUINTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new IRCHARContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new IRFLOATContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(18);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new IRADDRContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(19);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IrTopContext extends ParserRuleContext {
		public List<IrFunctionContext> irFunction() {
			return getRuleContexts(IrFunctionContext.class);
		}
		public IrFunctionContext irFunction(int i) {
			return getRuleContext(IrFunctionContext.class,i);
		}
		public IrTopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irTop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIrTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIrTop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIrTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrTopContext irTop() throws RecognitionException {
		IrTopContext _localctx = new IrTopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_irTop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				irFunction();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IrFunctionContext extends ParserRuleContext {
		public Token name;
		public FunctionArgumentContext functionArgument;
		public List<FunctionArgumentContext> args = new ArrayList<FunctionArgumentContext>();
		public IrTypeContext retType;
		public IrBlockContext irBlock;
		public List<IrBlockContext> blocks = new ArrayList<IrBlockContext>();
		public TerminalNode IDENTIFIER() { return getToken(IRTXTParser.IDENTIFIER, 0); }
		public IrTypeContext irType() {
			return getRuleContext(IrTypeContext.class,0);
		}
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public List<IrBlockContext> irBlock() {
			return getRuleContexts(IrBlockContext.class);
		}
		public IrBlockContext irBlock(int i) {
			return getRuleContext(IrBlockContext.class,i);
		}
		public IrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrFunctionContext irFunction() throws RecognitionException {
		IrFunctionContext _localctx = new IrFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_irFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__6);
			setState(28);
			((IrFunctionContext)_localctx).name = match(IDENTIFIER);
			setState(29);
			match(T__7);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((IrFunctionContext)_localctx).functionArgument = functionArgument();
					((IrFunctionContext)_localctx).args.add(((IrFunctionContext)_localctx).functionArgument);
					setState(31);
					match(T__8);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IRVALUE) {
				{
				setState(38);
				((IrFunctionContext)_localctx).functionArgument = functionArgument();
				((IrFunctionContext)_localctx).args.add(((IrFunctionContext)_localctx).functionArgument);
				}
			}

			setState(41);
			match(T__9);
			setState(42);
			match(T__10);
			setState(43);
			((IrFunctionContext)_localctx).retType = irType();
			setState(44);
			match(T__11);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				((IrFunctionContext)_localctx).irBlock = irBlock();
				((IrFunctionContext)_localctx).blocks.add(((IrFunctionContext)_localctx).irBlock);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(50);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentContext extends ParserRuleContext {
		public Token id;
		public IrTypeContext type;
		public TerminalNode IRVALUE() { return getToken(IRTXTParser.IRVALUE, 0); }
		public IrTypeContext irType() {
			return getRuleContext(IrTypeContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitFunctionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((FunctionArgumentContext)_localctx).id = match(IRVALUE);
			setState(53);
			match(T__10);
			setState(54);
			((FunctionArgumentContext)_localctx).type = irType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IrBlockContext extends ParserRuleContext {
		public Token id;
		public IrOperationContext irOperation;
		public List<IrOperationContext> operations = new ArrayList<IrOperationContext>();
		public IrTerminatorContext terminator;
		public TerminalNode IDENTIFIER() { return getToken(IRTXTParser.IDENTIFIER, 0); }
		public IrTerminatorContext irTerminator() {
			return getRuleContext(IrTerminatorContext.class,0);
		}
		public List<IrOperationContext> irOperation() {
			return getRuleContexts(IrOperationContext.class);
		}
		public IrOperationContext irOperation(int i) {
			return getRuleContext(IrOperationContext.class,i);
		}
		public IrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIrBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIrBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrBlockContext irBlock() throws RecognitionException {
		IrBlockContext _localctx = new IrBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_irBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((IrBlockContext)_localctx).id = match(IDENTIFIER);
			setState(57);
			match(T__11);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==IRVALUE) {
				{
				{
				setState(58);
				((IrBlockContext)_localctx).irOperation = irOperation();
				((IrBlockContext)_localctx).operations.add(((IrBlockContext)_localctx).irOperation);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			((IrBlockContext)_localctx).terminator = irTerminator();
			setState(65);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IrOperationContext extends ParserRuleContext {
		public IrOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irOperation; }
	 
		public IrOperationContext() { }
		public void copyFrom(IrOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRCommonOperationContext extends IrOperationContext {
		public Token res;
		public Token op;
		public Token IRVALUE;
		public List<Token> operands = new ArrayList<Token>();
		public IrTypeContext type;
		public List<TerminalNode> IRVALUE() { return getTokens(IRTXTParser.IRVALUE); }
		public TerminalNode IRVALUE(int i) {
			return getToken(IRTXTParser.IRVALUE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(IRTXTParser.IDENTIFIER, 0); }
		public IrTypeContext irType() {
			return getRuleContext(IrTypeContext.class,0);
		}
		public IRCommonOperationContext(IrOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRCommonOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRCommonOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRCommonOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRStoreOperationContext extends IrOperationContext {
		public Token val;
		public Token dest;
		public List<TerminalNode> IRVALUE() { return getTokens(IRTXTParser.IRVALUE); }
		public TerminalNode IRVALUE(int i) {
			return getToken(IRTXTParser.IRVALUE, i);
		}
		public IRStoreOperationContext(IrOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRStoreOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRStoreOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRStoreOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRCallOperationContext extends IrOperationContext {
		public Token res;
		public Token func;
		public Token IRVALUE;
		public List<Token> operands = new ArrayList<Token>();
		public IrTypeContext type;
		public List<TerminalNode> IRVALUE() { return getTokens(IRTXTParser.IRVALUE); }
		public TerminalNode IRVALUE(int i) {
			return getToken(IRTXTParser.IRVALUE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(IRTXTParser.IDENTIFIER, 0); }
		public IrTypeContext irType() {
			return getRuleContext(IrTypeContext.class,0);
		}
		public IRCallOperationContext(IrOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRCallOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRCallOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRCallOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRConstantOperationContext extends IrOperationContext {
		public Token res;
		public Token val;
		public IrTypeContext type;
		public TerminalNode IRVALUE() { return getToken(IRTXTParser.IRVALUE, 0); }
		public TerminalNode INTEGER() { return getToken(IRTXTParser.INTEGER, 0); }
		public IrTypeContext irType() {
			return getRuleContext(IrTypeContext.class,0);
		}
		public IRConstantOperationContext(IrOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRConstantOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRConstantOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRConstantOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrOperationContext irOperation() throws RecognitionException {
		IrOperationContext _localctx = new IrOperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_irOperation);
		int _la;
		try {
			int _alt;
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IRCommonOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((IRCommonOperationContext)_localctx).res = match(IRVALUE);
				setState(68);
				match(T__13);
				setState(69);
				((IRCommonOperationContext)_localctx).op = match(IDENTIFIER);
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						((IRCommonOperationContext)_localctx).IRVALUE = match(IRVALUE);
						((IRCommonOperationContext)_localctx).operands.add(((IRCommonOperationContext)_localctx).IRVALUE);
						setState(71);
						match(T__8);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IRVALUE) {
					{
					setState(77);
					((IRCommonOperationContext)_localctx).IRVALUE = match(IRVALUE);
					((IRCommonOperationContext)_localctx).operands.add(((IRCommonOperationContext)_localctx).IRVALUE);
					}
				}

				setState(80);
				match(T__10);
				setState(81);
				((IRCommonOperationContext)_localctx).type = irType();
				}
				break;
			case 2:
				_localctx = new IRConstantOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((IRConstantOperationContext)_localctx).res = match(IRVALUE);
				setState(83);
				match(T__13);
				setState(84);
				((IRConstantOperationContext)_localctx).val = match(INTEGER);
				setState(85);
				match(T__10);
				setState(86);
				((IRConstantOperationContext)_localctx).type = irType();
				}
				break;
			case 3:
				_localctx = new IRCallOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((IRCallOperationContext)_localctx).res = match(IRVALUE);
				setState(88);
				match(T__13);
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					match(T__14);
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__14 );
				setState(94);
				((IRCallOperationContext)_localctx).func = match(IDENTIFIER);
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						((IRCallOperationContext)_localctx).IRVALUE = match(IRVALUE);
						((IRCallOperationContext)_localctx).operands.add(((IRCallOperationContext)_localctx).IRVALUE);
						setState(96);
						match(T__8);
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IRVALUE) {
					{
					setState(102);
					((IRCallOperationContext)_localctx).IRVALUE = match(IRVALUE);
					((IRCallOperationContext)_localctx).operands.add(((IRCallOperationContext)_localctx).IRVALUE);
					}
				}

				setState(105);
				match(T__10);
				setState(106);
				((IRCallOperationContext)_localctx).type = irType();
				}
				break;
			case 4:
				_localctx = new IRStoreOperationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(T__15);
				setState(108);
				((IRStoreOperationContext)_localctx).val = match(IRVALUE);
				setState(109);
				((IRStoreOperationContext)_localctx).dest = match(IRVALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IrTerminatorContext extends ParserRuleContext {
		public IrTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irTerminator; }
	 
		public IrTerminatorContext() { }
		public void copyFrom(IrTerminatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRCondBrContext extends IrTerminatorContext {
		public Token val;
		public Token IDENTIFIER;
		public List<Token> dests = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(IRTXTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IRTXTParser.IDENTIFIER, i);
		}
		public TerminalNode IRVALUE() { return getToken(IRTXTParser.IRVALUE, 0); }
		public IRCondBrContext(IrTerminatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRCondBr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRCondBr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRCondBr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRGotoContext extends IrTerminatorContext {
		public Token dest;
		public TerminalNode IDENTIFIER() { return getToken(IRTXTParser.IDENTIFIER, 0); }
		public IRGotoContext(IrTerminatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRGoto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IRReturnContext extends IrTerminatorContext {
		public Token val;
		public TerminalNode IRVALUE() { return getToken(IRTXTParser.IRVALUE, 0); }
		public IRReturnContext(IrTerminatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).enterIRReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRTXTListener ) ((IRTXTListener)listener).exitIRReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IRTXTVisitor ) return ((IRTXTVisitor<? extends T>)visitor).visitIRReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrTerminatorContext irTerminator() throws RecognitionException {
		IrTerminatorContext _localctx = new IrTerminatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_irTerminator);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new IRCondBrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__16);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IRVALUE) {
					{
					setState(113);
					((IRCondBrContext)_localctx).val = match(IRVALUE);
					}
				}

				setState(116);
				match(T__17);
				setState(117);
				((IRCondBrContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((IRCondBrContext)_localctx).dests.add(((IRCondBrContext)_localctx).IDENTIFIER);
				setState(118);
				match(T__10);
				setState(119);
				((IRCondBrContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((IRCondBrContext)_localctx).dests.add(((IRCondBrContext)_localctx).IDENTIFIER);
				}
				break;
			case T__18:
				_localctx = new IRGotoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__18);
				setState(121);
				((IRGotoContext)_localctx).dest = match(IDENTIFIER);
				}
				break;
			case T__19:
				_localctx = new IRReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(T__19);
				setState(123);
				((IRReturnContext)_localctx).val = match(IRVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000"+
		"\u0001\u0001\u0004\u0001\u0018\b\u0001\u000b\u0001\f\u0001\u0019\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\"\b\u0002\n\u0002\f\u0002%\t\u0002\u0001\u0002\u0003\u0002(\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"/\b\u0002\u000b\u0002\f\u00020\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004<\b\u0004\n\u0004\f\u0004?\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005I\b\u0005\n\u0005\f\u0005L\t\u0005\u0001\u0005\u0003\u0005O\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005[\b\u0005"+
		"\u000b\u0005\f\u0005\\\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"b\b\u0005\n\u0005\f\u0005e\t\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006}\b\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u0000\u0000\u008c\u0000\u0014\u0001\u0000\u0000\u0000"+
		"\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000"+
		"\u00064\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\nn\u0001\u0000"+
		"\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e\u0015\u0005\u0001\u0000"+
		"\u0000\u000f\u0015\u0005\u0002\u0000\u0000\u0010\u0015\u0005\u0003\u0000"+
		"\u0000\u0011\u0015\u0005\u0004\u0000\u0000\u0012\u0015\u0005\u0005\u0000"+
		"\u0000\u0013\u0015\u0005\u0006\u0000\u0000\u0014\u000e\u0001\u0000\u0000"+
		"\u0000\u0014\u000f\u0001\u0000\u0000\u0000\u0014\u0010\u0001\u0000\u0000"+
		"\u0000\u0014\u0011\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005\u0007\u0000\u0000\u001c\u001d\u0005\u0015\u0000"+
		"\u0000\u001d#\u0005\b\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000"+
		"\u001f \u0005\t\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0006\u0003\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)*\u0005\n\u0000\u0000*+\u0005\u000b\u0000"+
		"\u0000+,\u0003\u0000\u0000\u0000,.\u0005\f\u0000\u0000-/\u0003\b\u0004"+
		"\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0005"+
		"\r\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0016\u0000\u0000"+
		"56\u0005\u000b\u0000\u000067\u0003\u0000\u0000\u00007\u0007\u0001\u0000"+
		"\u0000\u000089\u0005\u0015\u0000\u00009=\u0005\f\u0000\u0000:<\u0003\n"+
		"\u0005\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0003\f\u0006\u0000AB\u0005\r\u0000\u0000"+
		"B\t\u0001\u0000\u0000\u0000CD\u0005\u0016\u0000\u0000DE\u0005\u000e\u0000"+
		"\u0000EJ\u0005\u0015\u0000\u0000FG\u0005\u0016\u0000\u0000GI\u0005\t\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MO\u0005\u0016\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u000b\u0000"+
		"\u0000Qo\u0003\u0000\u0000\u0000RS\u0005\u0016\u0000\u0000ST\u0005\u000e"+
		"\u0000\u0000TU\u0005\u0017\u0000\u0000UV\u0005\u000b\u0000\u0000Vo\u0003"+
		"\u0000\u0000\u0000WX\u0005\u0016\u0000\u0000XZ\u0005\u000e\u0000\u0000"+
		"Y[\u0005\u000f\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^c\u0005\u0015\u0000\u0000_`\u0005\u0016\u0000\u0000`b\u0005"+
		"\t\u0000\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fh\u0005\u0016\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u000b"+
		"\u0000\u0000jo\u0003\u0000\u0000\u0000kl\u0005\u0010\u0000\u0000lm\u0005"+
		"\u0016\u0000\u0000mo\u0005\u0016\u0000\u0000nC\u0001\u0000\u0000\u0000"+
		"nR\u0001\u0000\u0000\u0000nW\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000"+
		"\u0000o\u000b\u0001\u0000\u0000\u0000pr\u0005\u0011\u0000\u0000qs\u0005"+
		"\u0016\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0005\u0012\u0000\u0000uv\u0005\u0015\u0000"+
		"\u0000vw\u0005\u000b\u0000\u0000w}\u0005\u0015\u0000\u0000xy\u0005\u0013"+
		"\u0000\u0000y}\u0005\u0015\u0000\u0000z{\u0005\u0014\u0000\u0000{}\u0005"+
		"\u0016\u0000\u0000|p\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}\r\u0001\u0000\u0000\u0000\u000e\u0014\u0019"+
		"#\'0=JN\\cgnr|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}