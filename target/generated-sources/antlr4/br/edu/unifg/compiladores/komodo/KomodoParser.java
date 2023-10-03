// Generated from br\edu\u005Cunifg\compiladores\komodo\Komodo.g4 by ANTLR 4.5.1
package br.edu.unifg.compiladores.komodo;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KomodoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, CONSTRUCTOR=2, METHOD=3, PACKAGE=4, INTERFACE=5, VAR=6, STRING=7, 
		NUMBER=8, BOOLEAN=9, ARRAY=10, IF=11, IMPORT=12, ELSE=13, ELIF=14, WHILE=15, 
		RETURN=16, GLOBAL=17, FUNCTION=18, INPUT=19, IMPLEMENTS=20, PRINT=21, 
		NULL=22, NEW=23, THIS=24, TRUE=25, FALSE=26, CONCAT=27, VAR_DECLARATION=28, 
		GLOBAL_VAR_DECLARATION=29, OPENBRACE=30, CLOSEBRACE=31, OPENBRACK=32, 
		CLOSEBRACK=33, OPENPAREN=34, CLOSEPAREN=35, SEMICOLON=36, DOUBLEQUOTE=37, 
		DOUBLEDOT=38, DOT=39, COMMA=40, LESSTHAN=41, GREATERTHAN=42, LESSTHANEQUALS=43, 
		GREATERTHANEQUALS=44, EQUALS=45, NOTEQUALS=46, ADD=47, SUB=48, MUL=49, 
		DIV=50, MOD=51, ASSIGN=52, ADD_ASSIGN=53, SUB_ASSIGN=54, MUL_ASSIGN=55, 
		DIV_ASSIGN=56, AND=57, OR=58, NOT=59, ESC_SEQ=60, WS=61, BLOCK_COMMENT=62, 
		COMMENT_LINE=63, STRING_LITERAL=64, NUM=65, BOOL=66, VARIABLE_NAME=67, 
		ID=68, ARR=69;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_statement = 2, RULE_varDeclaration = 3, 
		RULE_dataType = 4, RULE_stringLL = 5, RULE_expression = 6, RULE_functionDeclaresao = 7, 
		RULE_parameters = 8, RULE_parameter = 9, RULE_returnType = 10, RULE_returnStatement = 11, 
		RULE_functionBody = 12;
	public static final String[] ruleNames = {
		"start", "program", "statement", "varDeclaration", "dataType", "stringLL", 
		"expression", "functionDeclaresao", "parameters", "parameter", "returnType", 
		"returnStatement", "functionBody"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'constructor'", "'method'", "'package'", "'interface'", 
		"'var'", "'string'", "'number'", "'boolean'", "'array'", "'if'", "'import'", 
		"'else'", "'elif'", "'while'", "'return'", "'global'", "'function'", "'input'", 
		"'implements'", "'print'", "'null'", "'new'", "'this'", "'true'", "'false'", 
		null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'\"'", 
		"':'", "'.'", "','", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", null, 
		"'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'&&'", 
		"'||'", "'!'", "'\\''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "CONSTRUCTOR", "METHOD", "PACKAGE", "INTERFACE", "VAR", 
		"STRING", "NUMBER", "BOOLEAN", "ARRAY", "IF", "IMPORT", "ELSE", "ELIF", 
		"WHILE", "RETURN", "GLOBAL", "FUNCTION", "INPUT", "IMPLEMENTS", "PRINT", 
		"NULL", "NEW", "THIS", "TRUE", "FALSE", "CONCAT", "VAR_DECLARATION", "GLOBAL_VAR_DECLARATION", 
		"OPENBRACE", "CLOSEBRACE", "OPENBRACK", "CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", 
		"SEMICOLON", "DOUBLEQUOTE", "DOUBLEDOT", "DOT", "COMMA", "LESSTHAN", "GREATERTHAN", 
		"LESSTHANEQUALS", "GREATERTHANEQUALS", "EQUALS", "NOTEQUALS", "ADD", "SUB", 
		"MUL", "DIV", "MOD", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND", "OR", "NOT", "ESC_SEQ", "WS", "BLOCK_COMMENT", "COMMENT_LINE", 
		"STRING_LITERAL", "NUM", "BOOL", "VARIABLE_NAME", "ID", "ARR"
	};
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
	public String getGrammarFileName() { return "Komodo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KomodoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KomodoParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			program();
			setState(27);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				statement();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR || _la==FUNCTION );
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
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public FunctionDeclaresaoContext functionDeclaresao() {
			return getRuleContext(FunctionDeclaresaoContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				varDeclaration();
				setState(35);
				match(SEMICOLON);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				functionDeclaresao();
				setState(38);
				match(SEMICOLON);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KomodoParser.VAR, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode DOUBLEDOT() { return getToken(KomodoParser.DOUBLEDOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KomodoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(VAR);
				setState(43);
				match(VARIABLE_NAME);
				setState(44);
				match(DOUBLEDOT);
				setState(45);
				dataType();
				setState(46);
				match(ASSIGN);
				setState(47);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(VAR);
				setState(50);
				match(VARIABLE_NAME);
				setState(51);
				match(DOUBLEDOT);
				setState(52);
				dataType();
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KomodoParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(KomodoParser.NUMBER, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StringLLContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(KomodoParser.STRING_LITERAL, 0); }
		public StringLLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterStringLL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitStringLL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitStringLL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLLContext stringLL() throws RecognitionException {
		StringLLContext _localctx = new StringLLContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stringLL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(STRING_LITERAL);
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
		public TerminalNode STRING_LITERAL() { return getToken(KomodoParser.STRING_LITERAL, 0); }
		public TerminalNode NUM() { return getToken(KomodoParser.NUM, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class FunctionDeclaresaoContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(KomodoParser.FUNCTION, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionDeclaresaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaresao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterFunctionDeclaresao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitFunctionDeclaresao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitFunctionDeclaresao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclaresaoContext functionDeclaresao() throws RecognitionException {
		FunctionDeclaresaoContext _localctx = new FunctionDeclaresaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaresao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FUNCTION);
			setState(62);
			match(VARIABLE_NAME);
			setState(63);
			match(OPENPAREN);
			setState(65);
			_la = _input.LA(1);
			if (_la==VARIABLE_NAME) {
				{
				setState(64);
				parameters();
				}
			}

			setState(67);
			match(CLOSEPAREN);
			setState(69);
			_la = _input.LA(1);
			if (_la==DOUBLEDOT) {
				{
				setState(68);
				returnType();
				}
			}

			setState(71);
			match(OPENBRACE);
			setState(72);
			functionBody();
			setState(73);
			match(CLOSEBRACE);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KomodoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KomodoParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			parameter();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(76);
				match(COMMA);
				setState(77);
				parameter();
				}
				}
				setState(82);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode DOUBLEDOT() { return getToken(KomodoParser.DOUBLEDOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VARIABLE_NAME);
			setState(84);
			match(DOUBLEDOT);
			setState(85);
			dataType();
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode DOUBLEDOT() { return getToken(KomodoParser.DOUBLEDOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(DOUBLEDOT);
			setState(88);
			dataType();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KomodoParser.RETURN, 0); }
		public List<StringLLContext> stringLL() {
			return getRuleContexts(StringLLContext.class);
		}
		public StringLLContext stringLL(int i) {
			return getRuleContext(StringLLContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(KomodoParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(KomodoParser.CONCAT, i);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(RETURN);
			setState(91);
			stringLL();
			setState(92);
			match(CONCAT);
			setState(93);
			match(VARIABLE_NAME);
			setState(94);
			match(CONCAT);
			setState(95);
			stringLL();
			setState(96);
			match(SEMICOLON);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<ReturnStatementContext> returnStatement() {
			return getRuleContexts(ReturnStatementContext.class);
		}
		public ReturnStatementContext returnStatement(int i) {
			return getRuleContext(ReturnStatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				returnStatement();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RETURN );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Gj\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\6\3!\n\3\r\3\16\3\"\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"8\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\tD\n\t\3\t\3\t\5\tH\n"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nQ\n\n\f\n\16\nT\13\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16f\n\16\r\16"+
		"\16\16g\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\t\n\3\2B"+
		"Cc\2\34\3\2\2\2\4 \3\2\2\2\6*\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\f;\3\2\2"+
		"\2\16=\3\2\2\2\20?\3\2\2\2\22M\3\2\2\2\24U\3\2\2\2\26Y\3\2\2\2\30\\\3"+
		"\2\2\2\32e\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37!\5\6\4"+
		"\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$%\5\b\5\2%"+
		"&\7&\2\2&+\3\2\2\2\'(\5\20\t\2()\7&\2\2)+\3\2\2\2*$\3\2\2\2*\'\3\2\2\2"+
		"+\7\3\2\2\2,-\7\b\2\2-.\7E\2\2./\7(\2\2/\60\5\n\6\2\60\61\7\66\2\2\61"+
		"\62\5\16\b\2\628\3\2\2\2\63\64\7\b\2\2\64\65\7E\2\2\65\66\7(\2\2\668\5"+
		"\n\6\2\67,\3\2\2\2\67\63\3\2\2\28\t\3\2\2\29:\t\2\2\2:\13\3\2\2\2;<\7"+
		"B\2\2<\r\3\2\2\2=>\t\3\2\2>\17\3\2\2\2?@\7\24\2\2@A\7E\2\2AC\7$\2\2BD"+
		"\5\22\n\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\7%\2\2FH\5\26\f\2GF\3\2\2\2"+
		"GH\3\2\2\2HI\3\2\2\2IJ\7 \2\2JK\5\32\16\2KL\7!\2\2L\21\3\2\2\2MR\5\24"+
		"\13\2NO\7*\2\2OQ\5\24\13\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\23"+
		"\3\2\2\2TR\3\2\2\2UV\7E\2\2VW\7(\2\2WX\5\n\6\2X\25\3\2\2\2YZ\7(\2\2Z["+
		"\5\n\6\2[\27\3\2\2\2\\]\7\22\2\2]^\5\f\7\2^_\7\35\2\2_`\7E\2\2`a\7\35"+
		"\2\2ab\5\f\7\2bc\7&\2\2c\31\3\2\2\2df\5\30\r\2ed\3\2\2\2fg\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2h\33\3\2\2\2\t\"*\67CGRg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}