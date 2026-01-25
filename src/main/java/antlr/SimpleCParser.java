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
public class SimpleCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IDENTIFIER=24, 
		INTEGER=25, WS=26;
	public static final int
		RULE_translationUnit = 0, RULE_functionDefinition = 1, RULE_functionArgument = 2, 
		RULE_type = 3, RULE_statement = 4, RULE_blockStatement = 5, RULE_declStatement = 6, 
		RULE_assign = 7, RULE_assignStatement = 8, RULE_ifStatement = 9, RULE_whileStatement = 10, 
		RULE_forStatement = 11, RULE_returnStatement = 12, RULE_expressionStatement = 13, 
		RULE_expression = 14, RULE_functionCall = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "functionDefinition", "functionArgument", "type", 
			"statement", "blockStatement", "declStatement", "assign", "assignStatement", 
			"ifStatement", "whileStatement", "forStatement", "returnStatement", "expressionStatement", 
			"expression", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'['", "']'", "'void'", "'int'", "'unsigned int'", 
			"'{'", "'}'", "'='", "';'", "'if'", "'else'", "'while'", "'for'", "'return'", 
			"'*'", "'/'", "'+'", "'-'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENTIFIER", "INTEGER", "WS"
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

	public SimpleCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				functionDefinition();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0 );
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeContext returnType;
		public Token name;
		public FunctionArgumentContext functionArgument;
		public List<FunctionArgumentContext> args = new ArrayList<FunctionArgumentContext>();
		public BlockStatementContext body;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpleCParser.IDENTIFIER, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((FunctionDefinitionContext)_localctx).returnType = type();
			setState(38);
			((FunctionDefinitionContext)_localctx).name = match(IDENTIFIER);
			setState(39);
			match(T__0);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					((FunctionDefinitionContext)_localctx).functionArgument = functionArgument();
					((FunctionDefinitionContext)_localctx).args.add(((FunctionDefinitionContext)_localctx).functionArgument);
					setState(41);
					match(T__1);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0) {
				{
				setState(48);
				((FunctionDefinitionContext)_localctx).functionArgument = functionArgument();
				((FunctionDefinitionContext)_localctx).args.add(((FunctionDefinitionContext)_localctx).functionArgument);
				}
			}

			setState(51);
			match(T__2);
			setState(52);
			((FunctionDefinitionContext)_localctx).body = blockStatement();
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
		public TypeContext argType;
		public Token name;
		public Token size;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpleCParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(SimpleCParser.INTEGER, 0); }
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitFunctionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((FunctionArgumentContext)_localctx).argType = type();
			setState(55);
			((FunctionArgumentContext)_localctx).name = match(IDENTIFIER);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(56);
				match(T__3);
				setState(57);
				((FunctionArgumentContext)_localctx).size = match(INTEGER);
				setState(58);
				match(T__4);
				}
			}

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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends TypeContext {
		public VoidTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UintTypeContext extends TypeContext {
		public UintTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterUintType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitUintType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitUintType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new UintTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__7);
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
	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public DeclStatementContext declStatement() {
			return getRuleContext(DeclStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				returnStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				assignStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				declStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				forStatement();
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
	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__8);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 52667330L) != 0) {
				{
				{
				setState(77);
				((BlockStatementContext)_localctx).statement = statement();
				((BlockStatementContext)_localctx).statements.add(((BlockStatementContext)_localctx).statement);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__9);
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
	public static class DeclStatementContext extends ParserRuleContext {
		public TypeContext varType;
		public Token var;
		public ExpressionContext expr;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpleCParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclStatementContext declStatement() throws RecognitionException {
		DeclStatementContext _localctx = new DeclStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((DeclStatementContext)_localctx).varType = type();
			setState(86);
			((DeclStatementContext)_localctx).var = match(IDENTIFIER);
			setState(87);
			match(T__10);
			setState(88);
			((DeclStatementContext)_localctx).expr = expression(0);
			setState(89);
			match(T__11);
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
	public static class AssignContext extends ParserRuleContext {
		public Token var;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(SimpleCParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((AssignContext)_localctx).var = match(IDENTIFIER);
			setState(92);
			match(T__10);
			setState(93);
			((AssignContext)_localctx).expr = expression(0);
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
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignContext expr;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((AssignStatementContext)_localctx).expr = assign();
			setState(96);
			match(T__11);
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
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expr;
		public BlockStatementContext ifBlock;
		public StatementContext elseBlock;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__12);
			setState(99);
			match(T__0);
			setState(100);
			((IfStatementContext)_localctx).expr = expression(0);
			setState(101);
			match(T__2);
			setState(102);
			((IfStatementContext)_localctx).ifBlock = blockStatement();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(103);
				match(T__13);
				setState(104);
				((IfStatementContext)_localctx).elseBlock = statement();
				}
			}

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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expr;
		public StatementContext whileBlock;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__14);
			setState(108);
			match(T__0);
			setState(109);
			((WhileStatementContext)_localctx).expr = expression(0);
			setState(110);
			match(T__2);
			setState(111);
			((WhileStatementContext)_localctx).whileBlock = statement();
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
	public static class ForStatementContext extends ParserRuleContext {
		public DeclStatementContext expr1;
		public ExpressionContext expr2;
		public AssignContext expr3;
		public StatementContext forBlock;
		public DeclStatementContext declStatement() {
			return getRuleContext(DeclStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__15);
			setState(114);
			match(T__0);
			setState(115);
			((ForStatementContext)_localctx).expr1 = declStatement();
			setState(116);
			((ForStatementContext)_localctx).expr2 = expression(0);
			setState(117);
			match(T__11);
			setState(118);
			((ForStatementContext)_localctx).expr3 = assign();
			setState(119);
			match(T__2);
			setState(120);
			((ForStatementContext)_localctx).forBlock = statement();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__16);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 52428802L) != 0) {
				{
				setState(123);
				((ReturnStatementContext)_localctx).expr = expression(0);
				}
			}

			setState(126);
			match(T__11);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((ExpressionStatementContext)_localctx).expr = expression(0);
			setState(129);
			match(T__11);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNodeContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitExprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OppExprContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OppExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterOppExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitOppExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitOppExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntNodeContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(SimpleCParser.INTEGER, 0); }
		public IntNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterIntNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitIntNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitIntNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpLtExprContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmpLtExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterCmpLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitCmpLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitCmpLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdNodeContext extends ExpressionContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(SimpleCParser.IDENTIFIER, 0); }
		public IdNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterIdNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitIdNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitIdNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpGtExprContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmpGtExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterCmpGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitCmpGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitCmpGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExpressionContext {
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new OppExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(T__20);
				setState(133);
				((OppExprContext)_localctx).expr1 = expression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExprNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(T__0);
				setState(135);
				((ExprNodeContext)_localctx).expr1 = expression(0);
				setState(136);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new IdNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				((IdNodeContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new IntNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(INTEGER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						((MulExprContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(144);
						match(T__17);
						setState(145);
						((MulExprContext)_localctx).expr2 = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExpressionContext(_parentctx, _parentState));
						((DivExprContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(147);
						match(T__18);
						setState(148);
						((DivExprContext)_localctx).expr2 = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						((AddExprContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(150);
						match(T__19);
						setState(151);
						((AddExprContext)_localctx).expr2 = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubExprContext(new ExpressionContext(_parentctx, _parentState));
						((SubExprContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(153);
						match(T__20);
						setState(154);
						((SubExprContext)_localctx).expr2 = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new CmpLtExprContext(new ExpressionContext(_parentctx, _parentState));
						((CmpLtExprContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(156);
						match(T__21);
						setState(157);
						((CmpLtExprContext)_localctx).expr2 = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new CmpGtExprContext(new ExpressionContext(_parentctx, _parentState));
						((CmpGtExprContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						match(T__22);
						setState(160);
						((CmpGtExprContext)_localctx).expr2 = expression(7);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext expression;
		public List<ExpressionContext> args = new ArrayList<ExpressionContext>();
		public TerminalNode IDENTIFIER() { return getToken(SimpleCParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCListener ) ((SimpleCListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCVisitor ) return ((SimpleCVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((FunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(167);
			match(T__0);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					((FunctionCallContext)_localctx).expression = expression(0);
					((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).expression);
					setState(169);
					match(T__1);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 52428802L) != 0) {
				{
				setState(176);
				((FunctionCallContext)_localctx).expression = expression(0);
				((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).expression);
				}
			}

			setState(179);
			match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		",\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004K\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005R\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\tj\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f}\b"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u008e\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a2\b\u000e\n"+
		"\u000e\f\u000e\u00a5\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00ac\b\u000f\n\u000f\f\u000f\u00af\t\u000f"+
		"\u0001\u000f\u0003\u000f\u00b2\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0000\u0001\u001c\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u00c1\u0000!\u0001\u0000"+
		"\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000"+
		"\u0006@\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nL\u0001\u0000"+
		"\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000"+
		"\u0010_\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014k"+
		"\u0001\u0000\u0000\u0000\u0016q\u0001\u0000\u0000\u0000\u0018z\u0001\u0000"+
		"\u0000\u0000\u001a\u0080\u0001\u0000\u0000\u0000\u001c\u008d\u0001\u0000"+
		"\u0000\u0000\u001e\u00a6\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001"+
		"\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001\u0000\u0000\u0000"+
		"%&\u0003\u0006\u0003\u0000&\'\u0005\u0018\u0000\u0000\'-\u0005\u0001\u0000"+
		"\u0000()\u0003\u0004\u0002\u0000)*\u0005\u0002\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+(\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000002\u0003\u0004\u0002\u000010\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0003"+
		"\u0000\u000045\u0003\n\u0005\u00005\u0003\u0001\u0000\u0000\u000067\u0003"+
		"\u0006\u0003\u00007;\u0005\u0018\u0000\u000089\u0005\u0004\u0000\u0000"+
		"9:\u0005\u0019\u0000\u0000:<\u0005\u0005\u0000\u0000;8\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=A\u0005"+
		"\u0006\u0000\u0000>A\u0005\u0007\u0000\u0000?A\u0005\b\u0000\u0000@=\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"A\u0007\u0001\u0000\u0000\u0000BK\u0003\n\u0005\u0000CK\u0003\u001a\r"+
		"\u0000DK\u0003\u0018\f\u0000EK\u0003\u0010\b\u0000FK\u0003\f\u0006\u0000"+
		"GK\u0003\u0012\t\u0000HK\u0003\u0014\n\u0000IK\u0003\u0016\u000b\u0000"+
		"JB\u0001\u0000\u0000\u0000JC\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000"+
		"\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\t\u0001"+
		"\u0000\u0000\u0000LP\u0005\t\u0000\u0000MO\u0003\b\u0004\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0005\n\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0003\u0006"+
		"\u0003\u0000VW\u0005\u0018\u0000\u0000WX\u0005\u000b\u0000\u0000XY\u0003"+
		"\u001c\u000e\u0000YZ\u0005\f\u0000\u0000Z\r\u0001\u0000\u0000\u0000[\\"+
		"\u0005\u0018\u0000\u0000\\]\u0005\u000b\u0000\u0000]^\u0003\u001c\u000e"+
		"\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0003\u000e\u0007\u0000`a\u0005"+
		"\f\u0000\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0005\r\u0000\u0000cd"+
		"\u0005\u0001\u0000\u0000de\u0003\u001c\u000e\u0000ef\u0005\u0003\u0000"+
		"\u0000fi\u0003\n\u0005\u0000gh\u0005\u000e\u0000\u0000hj\u0003\b\u0004"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0013\u0001"+
		"\u0000\u0000\u0000kl\u0005\u000f\u0000\u0000lm\u0005\u0001\u0000\u0000"+
		"mn\u0003\u001c\u000e\u0000no\u0005\u0003\u0000\u0000op\u0003\b\u0004\u0000"+
		"p\u0015\u0001\u0000\u0000\u0000qr\u0005\u0010\u0000\u0000rs\u0005\u0001"+
		"\u0000\u0000st\u0003\f\u0006\u0000tu\u0003\u001c\u000e\u0000uv\u0005\f"+
		"\u0000\u0000vw\u0003\u000e\u0007\u0000wx\u0005\u0003\u0000\u0000xy\u0003"+
		"\b\u0004\u0000y\u0017\u0001\u0000\u0000\u0000z|\u0005\u0011\u0000\u0000"+
		"{}\u0003\u001c\u000e\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005\f\u0000\u0000\u007f\u0019"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u001c\u000e\u0000\u0081\u0082"+
		"\u0005\f\u0000\u0000\u0082\u001b\u0001\u0000\u0000\u0000\u0083\u0084\u0006"+
		"\u000e\uffff\uffff\u0000\u0084\u0085\u0005\u0015\u0000\u0000\u0085\u008e"+
		"\u0003\u001c\u000e\u0005\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0088"+
		"\u0003\u001c\u000e\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u008e"+
		"\u0001\u0000\u0000\u0000\u008a\u008e\u0005\u0018\u0000\u0000\u008b\u008e"+
		"\u0003\u001e\u000f\u0000\u008c\u008e\u0005\u0019\u0000\u0000\u008d\u0083"+
		"\u0001\u0000\u0000\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u00a3\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\n\u000b\u0000\u0000\u0090\u0091\u0005\u0012\u0000\u0000\u0091\u00a2\u0003"+
		"\u001c\u000e\f\u0092\u0093\n\n\u0000\u0000\u0093\u0094\u0005\u0013\u0000"+
		"\u0000\u0094\u00a2\u0003\u001c\u000e\u000b\u0095\u0096\n\t\u0000\u0000"+
		"\u0096\u0097\u0005\u0014\u0000\u0000\u0097\u00a2\u0003\u001c\u000e\n\u0098"+
		"\u0099\n\b\u0000\u0000\u0099\u009a\u0005\u0015\u0000\u0000\u009a\u00a2"+
		"\u0003\u001c\u000e\t\u009b\u009c\n\u0007\u0000\u0000\u009c\u009d\u0005"+
		"\u0016\u0000\u0000\u009d\u00a2\u0003\u001c\u000e\b\u009e\u009f\n\u0006"+
		"\u0000\u0000\u009f\u00a0\u0005\u0017\u0000\u0000\u00a0\u00a2\u0003\u001c"+
		"\u000e\u0007\u00a1\u008f\u0001\u0000\u0000\u0000\u00a1\u0092\u0001\u0000"+
		"\u0000\u0000\u00a1\u0095\u0001\u0000\u0000\u0000\u00a1\u0098\u0001\u0000"+
		"\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u001d\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0018"+
		"\u0000\u0000\u00a7\u00ad\u0005\u0001\u0000\u0000\u00a8\u00a9\u0003\u001c"+
		"\u000e\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0003\u001c\u000e\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u001f\u0001\u0000"+
		"\u0000\u0000\u000e#-1;@JPi|\u008d\u00a1\u00a3\u00ad\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}