// Generated from Ulang.g4 by ANTLR 4.8

package xyz.xindoo.ulang.g4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOL=2, BREAK=3, BYTE=4, CHAR=5, CONTINUE=6, DEFAULT=7, DO=8, 
		DOUBLE=9, ELSE=10, FLOAT=11, FOR=12, IF=13, GOTO=14, INT=15, LONG=16, 
		NATIVE=17, RETURN=18, SHORT=19, STATIC=20, VOID=21, WHILE=22, FUNCTION=23, 
		STRING=24, DECIMAL_LITERAL=25, HEX_LITERAL=26, OCT_LITERAL=27, BINARY_LITERAL=28, 
		FLOAT_LITERAL=29, HEX_FLOAT_LITERAL=30, BOOL_LITERAL=31, CHAR_LITERAL=32, 
		STRING_LITERAL=33, NULL_LITERAL=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, 
		LBRACK=39, RBRACK=40, SEMI=41, COMMA=42, DOT=43, ASSIGN=44, GT=45, LT=46, 
		BANG=47, TILDE=48, QUESTION=49, COLON=50, EQUAL=51, LE=52, GE=53, NOTEQUAL=54, 
		AND=55, OR=56, INC=57, DEC=58, ADD=59, SUB=60, MUL=61, DIV=62, BITAND=63, 
		BITOR=64, CARET=65, MOD=66, ADD_ASSIGN=67, SUB_ASSIGN=68, MUL_ASSIGN=69, 
		DIV_ASSIGN=70, AND_ASSIGN=71, OR_ASSIGN=72, XOR_ASSIGN=73, MOD_ASSIGN=74, 
		LSHIFT_ASSIGN=75, RSHIFT_ASSIGN=76, URSHIFT_ASSIGN=77, ARROW=78, COLONCOLON=79, 
		AT=80, ELLIPSIS=81, WS=82, COMMENT=83, LINE_COMMENT=84, IDENTIFIER=85;
	public static final int
		RULE_prog = 0, RULE_blockStatement = 1, RULE_functionDef = 2, RULE_formalParameters = 3, 
		RULE_formalParameterList = 4, RULE_formalParameter = 5, RULE_fieldDeclaration = 6, 
		RULE_variableDeclarators = 7, RULE_variableDeclarator = 8, RULE_variableDeclaratorId = 9, 
		RULE_variableInitializer = 10, RULE_statement = 11, RULE_assignment = 12, 
		RULE_forControl = 13, RULE_forInit = 14, RULE_parExpression = 15, RULE_expressionList = 16, 
		RULE_functionCall = 17, RULE_expression = 18, RULE_arguments = 19, RULE_primary = 20, 
		RULE_literal = 21, RULE_integerLiteral = 22, RULE_floatLiteral = 23, RULE_typeType = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "blockStatement", "functionDef", "formalParameters", "formalParameterList", 
			"formalParameter", "fieldDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "statement", "assignment", 
			"forControl", "forInit", "parExpression", "expressionList", "functionCall", 
			"expression", "arguments", "primary", "literal", "integerLiteral", "floatLiteral", 
			"typeType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'bool'", "'break'", "'byte'", "'char'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'float'", "'for'", "'if'", 
			"'goto'", "'int'", "'long'", "'native'", "'return'", "'short'", "'static'", 
			"'void'", "'while'", "'func'", "'string'", null, null, null, null, null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
			"'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOL", "BREAK", "BYTE", "CHAR", "CONTINUE", "DEFAULT", "DO", 
			"DOUBLE", "ELSE", "FLOAT", "FOR", "IF", "GOTO", "INT", "LONG", "NATIVE", 
			"RETURN", "SHORT", "STATIC", "VOID", "WHILE", "FUNCTION", "STRING", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "Ulang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			blockStatement();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(UlangParser.SEMI, 0); }
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
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blockStatement);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				variableDeclarators();
				setState(53);
				match(SEMI);
				}
				break;
			case EOF:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case RETURN:
			case WHILE:
			case FUNCTION:
			case RBRACE:
			case SEMI:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << FUNCTION) | (1L << SEMI))) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(55);
					statement();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(UlangParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UlangParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UlangParser.LBRACE, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(UlangParser.RBRACE, 0); }
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(FUNCTION);
			setState(64);
			match(IDENTIFIER);
			setState(65);
			formalParameters();
			setState(66);
			match(LBRACE);
			setState(67);
			blockStatement();
			setState(68);
			match(RBRACE);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(UlangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UlangParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LPAREN);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(71);
				formalParameterList();
				}
			}

			setState(74);
			match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UlangParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			formalParameter();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				formalParameter();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			typeType();
			setState(85);
			variableDeclaratorId();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(UlangParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			variableDeclarators();
			setState(88);
			match(SEMI);
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UlangParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			typeType();
			setState(91);
			variableDeclarator();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				variableDeclarator();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(UlangParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			variableDeclaratorId();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(100);
				match(ASSIGN);
				setState(101);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UlangParser.IDENTIFIER, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			expression(0);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(UlangParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<TerminalNode> LBRACE() { return getTokens(UlangParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UlangParser.LBRACE, i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UlangParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UlangParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(UlangParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(UlangParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(UlangParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(UlangParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(UlangParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(UlangParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(UlangParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UlangParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(UlangParser.CONTINUE, 0); }
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(IF);
				setState(109);
				parExpression();
				setState(110);
				match(LBRACE);
				setState(111);
				blockStatement();
				setState(112);
				match(RBRACE);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(113);
					match(ELSE);
					setState(114);
					match(LBRACE);
					setState(115);
					blockStatement();
					setState(116);
					match(RBRACE);
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(FOR);
				setState(121);
				forControl();
				setState(122);
				match(LBRACE);
				setState(123);
				blockStatement();
				setState(124);
				match(RBRACE);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(WHILE);
				setState(127);
				parExpression();
				setState(128);
				match(LBRACE);
				setState(129);
				blockStatement();
				setState(130);
				match(RBRACE);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(DO);
				setState(133);
				match(LBRACE);
				setState(134);
				blockStatement();
				setState(135);
				match(RBRACE);
				setState(136);
				match(WHILE);
				setState(137);
				parExpression();
				setState(138);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(RETURN);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (DECIMAL_LITERAL - 25)) | (1L << (FLOAT_LITERAL - 25)) | (1L << (BOOL_LITERAL - 25)) | (1L << (STRING_LITERAL - 25)) | (1L << (NULL_LITERAL - 25)) | (1L << (LPAREN - 25)) | (1L << (IDENTIFIER - 25)))) != 0)) {
					{
					setState(141);
					expression(0);
					}
				}

				setState(144);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(BREAK);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(146);
					match(IDENTIFIER);
					}
				}

				setState(149);
				match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(CONTINUE);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(151);
					match(IDENTIFIER);
					}
				}

				setState(154);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				match(SEMI);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 9);
				{
				setState(156);
				functionDef();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 10);
				{
				setState(157);
				assignment();
				setState(158);
				match(SEMI);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token aop;
		public TerminalNode IDENTIFIER() { return getToken(UlangParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(UlangParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UlangParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UlangParser.SUB_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IDENTIFIER);
			setState(163);
			((AssignmentContext)_localctx).aop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (ASSIGN - 44)) | (1L << (ADD_ASSIGN - 44)) | (1L << (SUB_ASSIGN - 44)))) != 0)) ) {
				((AssignmentContext)_localctx).aop = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			expression(0);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public TerminalNode LPAREN() { return getToken(UlangParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(UlangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(UlangParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(UlangParser.RPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LPAREN);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || _la==IDENTIFIER) {
				{
				setState(167);
				forInit();
				}
			}

			setState(170);
			match(SEMI);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (DECIMAL_LITERAL - 25)) | (1L << (FLOAT_LITERAL - 25)) | (1L << (BOOL_LITERAL - 25)) | (1L << (STRING_LITERAL - 25)) | (1L << (NULL_LITERAL - 25)) | (1L << (LPAREN - 25)) | (1L << (IDENTIFIER - 25)))) != 0)) {
				{
				setState(171);
				expression(0);
				}
			}

			setState(174);
			match(SEMI);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (DECIMAL_LITERAL - 25)) | (1L << (FLOAT_LITERAL - 25)) | (1L << (BOOL_LITERAL - 25)) | (1L << (STRING_LITERAL - 25)) | (1L << (NULL_LITERAL - 25)) | (1L << (LPAREN - 25)) | (1L << (IDENTIFIER - 25)))) != 0)) {
				{
				setState(175);
				((ForControlContext)_localctx).forUpdate = expressionList();
				}
			}

			setState(178);
			match(RPAREN);
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

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forInit);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				variableDeclarators();
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(UlangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UlangParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(LPAREN);
			setState(185);
			expression(0);
			setState(186);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UlangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UlangParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expression(0);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				expression(0);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UlangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(UlangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UlangParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IDENTIFIER);
			setState(197);
			match(LPAREN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (DECIMAL_LITERAL - 25)) | (1L << (FLOAT_LITERAL - 25)) | (1L << (BOOL_LITERAL - 25)) | (1L << (STRING_LITERAL - 25)) | (1L << (NULL_LITERAL - 25)) | (1L << (LPAREN - 25)) | (1L << (IDENTIFIER - 25)))) != 0)) {
				{
				setState(198);
				expressionList();
				}
			}

			setState(201);
			match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token bop;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(UlangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(UlangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UlangParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(UlangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(UlangParser.SUB, 0); }
		public TerminalNode EQUAL() { return getToken(UlangParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(UlangParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(UlangParser.AND, 0); }
		public TerminalNode OR() { return getToken(UlangParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(204);
				primary();
				}
				break;
			case 2:
				{
				setState(205);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (MUL - 61)) | (1L << (DIV - 61)) | (1L << (MOD - 61)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(219);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(221);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(222);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(UlangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UlangParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LPAREN);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (DECIMAL_LITERAL - 25)) | (1L << (FLOAT_LITERAL - 25)) | (1L << (BOOL_LITERAL - 25)) | (1L << (STRING_LITERAL - 25)) | (1L << (NULL_LITERAL - 25)) | (1L << (LPAREN - 25)) | (1L << (IDENTIFIER - 25)))) != 0)) {
				{
				setState(229);
				expressionList();
				}
			}

			setState(232);
			match(RPAREN);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(UlangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UlangParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(UlangParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primary);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(LPAREN);
				setState(235);
				expression(0);
				setState(236);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case FLOAT_LITERAL:
			case BOOL_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(IDENTIFIER);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(UlangParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(UlangParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(UlangParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(NULL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(UlangParser.DECIMAL_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(DECIMAL_LITERAL);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(UlangParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(FLOAT_LITERAL);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UlangListener ) ((UlangListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UlangVisitor ) return ((UlangVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__0);
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
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\5\3@\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5K\n\5\3\5\3\5\3\6\3\6\3\6\7\6R\n"+
		"\6\f\6\16\6U\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\ta\n\t\f\t"+
		"\16\td\13\t\3\n\3\n\3\n\5\ni\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\ry\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0091\n\r\3\r\3\r"+
		"\3\r\5\r\u0096\n\r\3\r\3\r\3\r\5\r\u009b\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00a3\n\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00ab\n\17\3\17\3\17\5"+
		"\17\u00af\n\17\3\17\3\17\5\17\u00b3\n\17\3\17\3\17\3\20\3\20\5\20\u00b9"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00c2\n\22\f\22\16\22\u00c5"+
		"\13\22\3\23\3\23\3\23\5\23\u00ca\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u00d1"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u00e2\n\24\f\24\16\24\u00e5\13\24\3\25\3\25\5\25\u00e9"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f3\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00fa\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\3"+
		"&\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\4\2..E"+
		"F\4\2?@DD\3\2=>\4\2\65\6588\2\u010e\2\64\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2"+
		"\bH\3\2\2\2\nN\3\2\2\2\fV\3\2\2\2\16Y\3\2\2\2\20\\\3\2\2\2\22e\3\2\2\2"+
		"\24j\3\2\2\2\26l\3\2\2\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34\u00a8\3"+
		"\2\2\2\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00be\3\2\2\2$\u00c6\3\2\2\2"+
		"&\u00d0\3\2\2\2(\u00e6\3\2\2\2*\u00f2\3\2\2\2,\u00f9\3\2\2\2.\u00fb\3"+
		"\2\2\2\60\u00fd\3\2\2\2\62\u00ff\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\66"+
		"\67\5\20\t\2\678\7+\2\28@\3\2\2\29;\5\30\r\2:9\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?\66\3\2\2\2?<\3\2\2\2@\5\3\2\2\2AB"+
		"\7\31\2\2BC\7W\2\2CD\5\b\5\2DE\7\'\2\2EF\5\4\3\2FG\7(\2\2G\7\3\2\2\2H"+
		"J\7%\2\2IK\5\n\6\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7&\2\2M\t\3\2\2\2N"+
		"S\5\f\7\2OP\7,\2\2PR\5\f\7\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T"+
		"\13\3\2\2\2US\3\2\2\2VW\5\62\32\2WX\5\24\13\2X\r\3\2\2\2YZ\5\20\t\2Z["+
		"\7+\2\2[\17\3\2\2\2\\]\5\62\32\2]b\5\22\n\2^_\7,\2\2_a\5\22\n\2`^\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\21\3\2\2\2db\3\2\2\2eh\5\24\13\2f"+
		"g\7.\2\2gi\5\26\f\2hf\3\2\2\2hi\3\2\2\2i\23\3\2\2\2jk\7W\2\2k\25\3\2\2"+
		"\2lm\5&\24\2m\27\3\2\2\2no\7\17\2\2op\5 \21\2pq\7\'\2\2qr\5\4\3\2rx\7"+
		"(\2\2st\7\f\2\2tu\7\'\2\2uv\5\4\3\2vw\7(\2\2wy\3\2\2\2xs\3\2\2\2xy\3\2"+
		"\2\2y\u00a3\3\2\2\2z{\7\16\2\2{|\5\34\17\2|}\7\'\2\2}~\5\4\3\2~\177\7"+
		"(\2\2\177\u00a3\3\2\2\2\u0080\u0081\7\30\2\2\u0081\u0082\5 \21\2\u0082"+
		"\u0083\7\'\2\2\u0083\u0084\5\4\3\2\u0084\u0085\7(\2\2\u0085\u00a3\3\2"+
		"\2\2\u0086\u0087\7\n\2\2\u0087\u0088\7\'\2\2\u0088\u0089\5\4\3\2\u0089"+
		"\u008a\7(\2\2\u008a\u008b\7\30\2\2\u008b\u008c\5 \21\2\u008c\u008d\7+"+
		"\2\2\u008d\u00a3\3\2\2\2\u008e\u0090\7\24\2\2\u008f\u0091\5&\24\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00a3\7+"+
		"\2\2\u0093\u0095\7\5\2\2\u0094\u0096\7W\2\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a3\7+\2\2\u0098\u009a\7\b"+
		"\2\2\u0099\u009b\7W\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a3\7+\2\2\u009d\u00a3\7+\2\2\u009e\u00a3\5\6\4"+
		"\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\7+\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"n\3\2\2\2\u00a2z\3\2\2\2\u00a2\u0080\3\2\2\2\u00a2\u0086\3\2\2\2\u00a2"+
		"\u008e\3\2\2\2\u00a2\u0093\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009d\3\2"+
		"\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\7W\2\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\5&\24\2\u00a7\33\3\2\2\2\u00a8"+
		"\u00aa\7%\2\2\u00a9\u00ab\5\36\20\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7+\2\2\u00ad\u00af\5&\24\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\7+"+
		"\2\2\u00b1\u00b3\5\"\22\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\7&\2\2\u00b5\35\3\2\2\2\u00b6\u00b9\5\20\t"+
		"\2\u00b7\u00b9\5\"\22\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\37\3\2\2\2\u00ba\u00bb\7%\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\7&\2\2"+
		"\u00bd!\3\2\2\2\u00be\u00c3\5&\24\2\u00bf\u00c0\7,\2\2\u00c0\u00c2\5&"+
		"\24\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7W\2\2\u00c7"+
		"\u00c9\7%\2\2\u00c8\u00ca\5\"\22\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7&\2\2\u00cc%\3\2\2\2\u00cd\u00ce"+
		"\b\24\1\2\u00ce\u00d1\5*\26\2\u00cf\u00d1\5$\23\2\u00d0\u00cd\3\2\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00e3\3\2\2\2\u00d2\u00d3\f\7\2\2\u00d3\u00d4"+
		"\t\3\2\2\u00d4\u00e2\5&\24\b\u00d5\u00d6\f\6\2\2\u00d6\u00d7\t\4\2\2\u00d7"+
		"\u00e2\5&\24\7\u00d8\u00d9\f\5\2\2\u00d9\u00da\t\5\2\2\u00da\u00e2\5&"+
		"\24\6\u00db\u00dc\f\4\2\2\u00dc\u00dd\79\2\2\u00dd\u00e2\5&\24\5\u00de"+
		"\u00df\f\3\2\2\u00df\u00e0\7:\2\2\u00e0\u00e2\5&\24\4\u00e1\u00d2\3\2"+
		"\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\'\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7%\2\2\u00e7\u00e9"+
		"\5\"\22\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00eb\7&\2\2\u00eb)\3\2\2\2\u00ec\u00ed\7%\2\2\u00ed\u00ee\5&\24"+
		"\2\u00ee\u00ef\7&\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f3\5,\27\2\u00f1\u00f3"+
		"\7W\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"+\3\2\2\2\u00f4\u00fa\5.\30\2\u00f5\u00fa\5\60\31\2\u00f6\u00fa\7#\2\2"+
		"\u00f7\u00fa\7!\2\2\u00f8\u00fa\7$\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5"+
		"\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"-\3\2\2\2\u00fb\u00fc\7\33\2\2\u00fc/\3\2\2\2\u00fd\u00fe\7\37\2\2\u00fe"+
		"\61\3\2\2\2\u00ff\u0100\7\3\2\2\u0100\63\3\2\2\2\31<?JSbhx\u0090\u0095"+
		"\u009a\u00a2\u00aa\u00ae\u00b2\u00b8\u00c3\u00c9\u00d0\u00e1\u00e3\u00e8"+
		"\u00f2\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}