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
		NULL=22, NEW=23, THIS=24, TRUE=25, FALSE=26, CONCAT=27, OPENBRACE=28, 
		CLOSEBRACE=29, OPENBRACK=30, CLOSEBRACK=31, OPENPAREN=32, CLOSEPAREN=33, 
		SEMICOLON=34, DOUBLEQUOTE=35, DOUBLEDOT=36, DOT=37, COMMA=38, LESSTHAN=39, 
		GREATERTHAN=40, LESSTHANEQUALS=41, GREATERTHANEQUALS=42, EQUALS=43, NOTEQUALS=44, 
		ADD=45, SUB=46, MUL=47, DIV=48, MOD=49, ASSIGN=50, ADD_ASSIGN=51, SUB_ASSIGN=52, 
		MUL_ASSIGN=53, DIV_ASSIGN=54, AND=55, OR=56, NOT=57, ESC_SEQ=58, WS=59, 
		BLOCK_COMMENT=60, COMMENT_LINE=61, STRING_LITERAL=62, NUM=63, BOOL=64, 
		VARIABLE_NAME=65, ID=66, ARR=67;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_statement = 2, RULE_varDeclaration = 3, 
		RULE_dataType = 4, RULE_expression = 5, RULE_logicalExpression = 6, RULE_logicalTerm = 7, 
		RULE_comparisonExpression = 8, RULE_concatenation = 9, RULE_concatenationElement = 10, 
		RULE_functionDeclaration = 11, RULE_parameters = 12, RULE_parameter = 13, 
		RULE_returnType = 14, RULE_returnStatement = 15, RULE_functionBody = 16, 
		RULE_printStatement = 17, RULE_inputStatement = 18, RULE_ifStatement = 19, 
		RULE_elifStatement = 20, RULE_elseStatement = 21;
	public static final String[] ruleNames = {
		"start", "program", "statement", "varDeclaration", "dataType", "expression", 
		"logicalExpression", "logicalTerm", "comparisonExpression", "concatenation", 
		"concatenationElement", "functionDeclaration", "parameters", "parameter", 
		"returnType", "returnStatement", "functionBody", "printStatement", "inputStatement", 
		"ifStatement", "elifStatement", "elseStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'constructor'", "'method'", "'package'", "'interface'", 
		"'var'", "'string'", "'number'", "'boolean'", "'array'", "'if'", "'import'", 
		"'else'", "'elif'", "'while'", "'return'", "'global'", "'function'", "'input'", 
		"'implements'", "'print'", "'null'", "'new'", "'this'", "'true'", "'false'", 
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'\"'", "':'", 
		"'.'", "','", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", null, "'-'", 
		"'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'&&'", "'||'", 
		"'!'", "'\\''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "CONSTRUCTOR", "METHOD", "PACKAGE", "INTERFACE", "VAR", 
		"STRING", "NUMBER", "BOOLEAN", "ARRAY", "IF", "IMPORT", "ELSE", "ELIF", 
		"WHILE", "RETURN", "GLOBAL", "FUNCTION", "INPUT", "IMPLEMENTS", "PRINT", 
		"NULL", "NEW", "THIS", "TRUE", "FALSE", "CONCAT", "OPENBRACE", "CLOSEBRACE", 
		"OPENBRACK", "CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", "SEMICOLON", "DOUBLEQUOTE", 
		"DOUBLEDOT", "DOT", "COMMA", "LESSTHAN", "GREATERTHAN", "LESSTHANEQUALS", 
		"GREATERTHANEQUALS", "EQUALS", "NOTEQUALS", "ADD", "SUB", "MUL", "DIV", 
		"MOD", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND", "OR", "NOT", "ESC_SEQ", "WS", "BLOCK_COMMENT", "COMMENT_LINE", 
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
			setState(44);
			program();
			setState(45);
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
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (VAR - 6)) | (1L << (IF - 6)) | (1L << (FUNCTION - 6)) | (1L << (INPUT - 6)) | (1L << (PRINT - 6)) | (1L << (NULL - 6)) | (1L << (TRUE - 6)) | (1L << (FALSE - 6)) | (1L << (OPENPAREN - 6)) | (1L << (NOT - 6)) | (1L << (STRING_LITERAL - 6)) | (1L << (NUM - 6)) | (1L << (BOOL - 6)) | (1L << (VARIABLE_NAME - 6)) | (1L << (ARR - 6)))) != 0) );
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(66);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				varDeclaration();
				setState(53);
				match(SEMICOLON);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				functionDeclaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				printStatement();
				setState(57);
				match(SEMICOLON);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				inputStatement();
				setState(60);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				ifStatement();
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case OPENPAREN:
			case NOT:
			case STRING_LITERAL:
			case NUM:
			case BOOL:
			case VARIABLE_NAME:
			case ARR:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				expression();
				setState(64);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(VAR);
			setState(69);
			match(VARIABLE_NAME);
			setState(70);
			match(DOUBLEDOT);
			setState(71);
			dataType();
			setState(74);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(72);
				match(ASSIGN);
				setState(73);
				expression();
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KomodoParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(KomodoParser.NUMBER, 0); }
		public TerminalNode ARRAY() { return getToken(KomodoParser.ARRAY, 0); }
		public TerminalNode BOOLEAN() { return getToken(KomodoParser.BOOLEAN, 0); }
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
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << ARRAY))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			logicalExpression();
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(KomodoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KomodoParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(KomodoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(KomodoParser.OR, i);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logicalExpression);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				logicalTerm();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(81);
					match(AND);
					setState(82);
					logicalTerm();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				logicalTerm();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(89);
					match(OR);
					setState(90);
					logicalTerm();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				comparisonExpression();
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

	public static class LogicalTermContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(KomodoParser.NOT, 0); }
		public LogicalTermContext logicalTerm() {
			return getRuleContext(LogicalTermContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public TerminalNode TRUE() { return getToken(KomodoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KomodoParser.FALSE, 0); }
		public LogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitLogicalTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitLogicalTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalTermContext logicalTerm() throws RecognitionException {
		LogicalTermContext _localctx = new LogicalTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalTerm);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case NULL:
			case STRING_LITERAL:
			case NUM:
			case BOOL:
			case VARIABLE_NAME:
			case ARR:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				comparisonExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(NOT);
				setState(101);
				logicalTerm();
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(OPENPAREN);
				setState(103);
				logicalExpression();
				setState(104);
				match(CLOSEPAREN);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				match(FALSE);
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<ConcatenationContext> concatenation() {
			return getRuleContexts(ConcatenationContext.class);
		}
		public ConcatenationContext concatenation(int i) {
			return getRuleContext(ConcatenationContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(KomodoParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(KomodoParser.NOTEQUALS, 0); }
		public TerminalNode LESSTHAN() { return getToken(KomodoParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(KomodoParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHANEQUALS() { return getToken(KomodoParser.LESSTHANEQUALS, 0); }
		public TerminalNode GREATERTHANEQUALS() { return getToken(KomodoParser.GREATERTHANEQUALS, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparisonExpression);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				concatenation();
				setState(111);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANEQUALS) | (1L << GREATERTHANEQUALS) | (1L << EQUALS) | (1L << NOTEQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(112);
				concatenation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				concatenation();
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

	public static class ConcatenationContext extends ParserRuleContext {
		public List<ConcatenationElementContext> concatenationElement() {
			return getRuleContexts(ConcatenationElementContext.class);
		}
		public ConcatenationElementContext concatenationElement(int i) {
			return getRuleContext(ConcatenationElementContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(KomodoParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(KomodoParser.CONCAT, i);
		}
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_concatenation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			concatenationElement();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCAT) {
				{
				{
				setState(118);
				match(CONCAT);
				setState(119);
				concatenationElement();
				}
				}
				setState(124);
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

	public static class ConcatenationElementContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(KomodoParser.STRING_LITERAL, 0); }
		public TerminalNode NUM() { return getToken(KomodoParser.NUM, 0); }
		public TerminalNode NULL() { return getToken(KomodoParser.NULL, 0); }
		public TerminalNode ARR() { return getToken(KomodoParser.ARR, 0); }
		public TerminalNode BOOL() { return getToken(KomodoParser.BOOL, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public ConcatenationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenationElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterConcatenationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitConcatenationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitConcatenationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenationElementContext concatenationElement() throws RecognitionException {
		ConcatenationElementContext _localctx = new ConcatenationElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_concatenationElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NULL - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NUM - 22)) | (1L << (BOOL - 22)) | (1L << (VARIABLE_NAME - 22)) | (1L << (ARR - 22)))) != 0)) ) {
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(KomodoParser.FUNCTION, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FUNCTION);
			setState(128);
			match(VARIABLE_NAME);
			setState(129);
			match(OPENPAREN);
			setState(131);
			_la = _input.LA(1);
			if (_la==VARIABLE_NAME) {
				{
				setState(130);
				parameters();
				}
			}

			setState(133);
			match(CLOSEPAREN);
			setState(135);
			_la = _input.LA(1);
			if (_la==DOUBLEDOT) {
				{
				setState(134);
				returnType();
				}
			}

			setState(137);
			match(OPENBRACE);
			setState(139);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (VAR - 6)) | (1L << (IF - 6)) | (1L << (RETURN - 6)) | (1L << (FUNCTION - 6)) | (1L << (INPUT - 6)) | (1L << (PRINT - 6)) | (1L << (NULL - 6)) | (1L << (TRUE - 6)) | (1L << (FALSE - 6)) | (1L << (OPENPAREN - 6)) | (1L << (NOT - 6)) | (1L << (STRING_LITERAL - 6)) | (1L << (NUM - 6)) | (1L << (BOOL - 6)) | (1L << (VARIABLE_NAME - 6)) | (1L << (ARR - 6)))) != 0)) {
				{
				setState(138);
				functionBody();
				}
			}

			setState(141);
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
		enterRule(_localctx, 24, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			parameter();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				parameter();
				}
				}
				setState(150);
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
		enterRule(_localctx, 26, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(VARIABLE_NAME);
			setState(152);
			match(DOUBLEDOT);
			setState(153);
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
		enterRule(_localctx, 28, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(DOUBLEDOT);
			setState(156);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RETURN);
			setState(159);
			expression();
			setState(160);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 32, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(164);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(162);
					returnStatement();
					}
					break;
				case VAR:
				case IF:
				case FUNCTION:
				case INPUT:
				case PRINT:
				case NULL:
				case TRUE:
				case FALSE:
				case OPENPAREN:
				case NOT:
				case STRING_LITERAL:
				case NUM:
				case BOOL:
				case VARIABLE_NAME:
				case ARR:
					{
					setState(163);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (VAR - 6)) | (1L << (IF - 6)) | (1L << (RETURN - 6)) | (1L << (FUNCTION - 6)) | (1L << (INPUT - 6)) | (1L << (PRINT - 6)) | (1L << (NULL - 6)) | (1L << (TRUE - 6)) | (1L << (FALSE - 6)) | (1L << (OPENPAREN - 6)) | (1L << (NOT - 6)) | (1L << (STRING_LITERAL - 6)) | (1L << (NUM - 6)) | (1L << (BOOL - 6)) | (1L << (VARIABLE_NAME - 6)) | (1L << (ARR - 6)))) != 0) );
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(KomodoParser.PRINT, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PRINT);
			setState(169);
			match(OPENPAREN);
			setState(170);
			expression();
			setState(171);
			match(CLOSEPAREN);
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

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(KomodoParser.INPUT, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(INPUT);
			setState(174);
			match(OPENPAREN);
			setState(175);
			match(VARIABLE_NAME);
			setState(176);
			match(CLOSEPAREN);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KomodoParser.IF, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElifStatementContext> elifStatement() {
			return getRuleContexts(ElifStatementContext.class);
		}
		public ElifStatementContext elifStatement(int i) {
			return getRuleContext(ElifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IF);
			setState(179);
			match(OPENPAREN);
			setState(180);
			logicalExpression();
			setState(181);
			match(CLOSEPAREN);
			setState(182);
			match(OPENBRACE);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (VAR - 6)) | (1L << (IF - 6)) | (1L << (FUNCTION - 6)) | (1L << (INPUT - 6)) | (1L << (PRINT - 6)) | (1L << (NULL - 6)) | (1L << (TRUE - 6)) | (1L << (FALSE - 6)) | (1L << (OPENPAREN - 6)) | (1L << (NOT - 6)) | (1L << (STRING_LITERAL - 6)) | (1L << (NUM - 6)) | (1L << (BOOL - 6)) | (1L << (VARIABLE_NAME - 6)) | (1L << (ARR - 6)))) != 0)) {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(CLOSEBRACE);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(190);
				elifStatement();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(196);
				elseStatement();
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

	public static class ElifStatementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(KomodoParser.ELIF, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterElifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitElifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitElifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStatementContext elifStatement() throws RecognitionException {
		ElifStatementContext _localctx = new ElifStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ELIF);
			setState(200);
			match(OPENPAREN);
			setState(201);
			logicalExpression();
			setState(202);
			match(CLOSEPAREN);
			setState(203);
			match(OPENBRACE);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (VAR - 6)) | (1L << (IF - 6)) | (1L << (FUNCTION - 6)) | (1L << (INPUT - 6)) | (1L << (PRINT - 6)) | (1L << (NULL - 6)) | (1L << (TRUE - 6)) | (1L << (FALSE - 6)) | (1L << (OPENPAREN - 6)) | (1L << (NOT - 6)) | (1L << (STRING_LITERAL - 6)) | (1L << (NUM - 6)) | (1L << (BOOL - 6)) | (1L << (VARIABLE_NAME - 6)) | (1L << (ARR - 6)))) != 0)) {
				{
				{
				setState(204);
				statement();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KomodoParser.ELSE, 0); }
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ELSE);
			setState(213);
			match(OPENBRACE);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (VAR - 6)) | (1L << (IF - 6)) | (1L << (FUNCTION - 6)) | (1L << (INPUT - 6)) | (1L << (PRINT - 6)) | (1L << (NULL - 6)) | (1L << (TRUE - 6)) | (1L << (FALSE - 6)) | (1L << (OPENPAREN - 6)) | (1L << (NOT - 6)) | (1L << (STRING_LITERAL - 6)) | (1L << (NUM - 6)) | (1L << (BOOL - 6)) | (1L << (VARIABLE_NAME - 6)) | (1L << (ARR - 6)))) != 0)) {
				{
				{
				setState(214);
				statement();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\6\3"+
		"\63\n\3\r\3\16\3\64\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\b"+
		"\5\bd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\nv\n\n\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\5\r\u0086\n\r\3\r\3\r\5\r\u008a\n\r\3\r\3\r\5\r\u008e\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\7\16\u0095\n\16\f\16\16\16\u0098\13\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u00a7"+
		"\n\22\r\22\16\22\u00a8\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00bb\n\25\f\25\16\25\u00be\13"+
		"\25\3\25\3\25\7\25\u00c2\n\25\f\25\16\25\u00c5\13\25\3\25\5\25\u00c8\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d0\n\26\f\26\16\26\u00d3\13"+
		"\26\3\26\3\26\3\27\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd\13\27\3"+
		"\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2"+
		"\5\3\2\t\f\3\2).\5\2\30\30@CEE\u00e6\2.\3\2\2\2\4\62\3\2\2\2\6D\3\2\2"+
		"\2\bF\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16c\3\2\2\2\20n\3\2\2\2\22u\3\2\2"+
		"\2\24w\3\2\2\2\26\177\3\2\2\2\30\u0081\3\2\2\2\32\u0091\3\2\2\2\34\u0099"+
		"\3\2\2\2\36\u009d\3\2\2\2 \u00a0\3\2\2\2\"\u00a6\3\2\2\2$\u00aa\3\2\2"+
		"\2&\u00af\3\2\2\2(\u00b4\3\2\2\2*\u00c9\3\2\2\2,\u00d6\3\2\2\2./\5\4\3"+
		"\2/\60\7\2\2\3\60\3\3\2\2\2\61\63\5\6\4\2\62\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\67\5\b\5\2\678\7$\2\28E\3"+
		"\2\2\29E\5\30\r\2:;\5$\23\2;<\7$\2\2<E\3\2\2\2=>\5&\24\2>?\7$\2\2?E\3"+
		"\2\2\2@E\5(\25\2AB\5\f\7\2BC\7$\2\2CE\3\2\2\2D\66\3\2\2\2D9\3\2\2\2D:"+
		"\3\2\2\2D=\3\2\2\2D@\3\2\2\2DA\3\2\2\2E\7\3\2\2\2FG\7\b\2\2GH\7C\2\2H"+
		"I\7&\2\2IL\5\n\6\2JK\7\64\2\2KM\5\f\7\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2"+
		"NO\t\2\2\2O\13\3\2\2\2PQ\5\16\b\2Q\r\3\2\2\2RW\5\20\t\2ST\79\2\2TV\5\20"+
		"\t\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xd\3\2\2\2YW\3\2\2\2Z_\5\20"+
		"\t\2[\\\7:\2\2\\^\5\20\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3"+
		"\2\2\2a_\3\2\2\2bd\5\22\n\2cR\3\2\2\2cZ\3\2\2\2cb\3\2\2\2d\17\3\2\2\2"+
		"eo\5\22\n\2fg\7;\2\2go\5\20\t\2hi\7\"\2\2ij\5\16\b\2jk\7#\2\2ko\3\2\2"+
		"\2lo\7\33\2\2mo\7\34\2\2ne\3\2\2\2nf\3\2\2\2nh\3\2\2\2nl\3\2\2\2nm\3\2"+
		"\2\2o\21\3\2\2\2pq\5\24\13\2qr\t\3\2\2rs\5\24\13\2sv\3\2\2\2tv\5\24\13"+
		"\2up\3\2\2\2ut\3\2\2\2v\23\3\2\2\2w|\5\26\f\2xy\7\35\2\2y{\5\26\f\2zx"+
		"\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\t\4\2\2\u0080\27\3\2\2\2\u0081\u0082\7\24\2\2\u0082\u0083\7C\2\2\u0083"+
		"\u0085\7\"\2\2\u0084\u0086\5\32\16\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7#\2\2\u0088\u008a\5\36\20\2\u0089"+
		"\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7\36"+
		"\2\2\u008c\u008e\5\"\22\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\37\2\2\u0090\31\3\2\2\2\u0091\u0096\5\34"+
		"\17\2\u0092\u0093\7(\2\2\u0093\u0095\5\34\17\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\33\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009a\7C\2\2\u009a\u009b\7&\2\2\u009b\u009c"+
		"\5\n\6\2\u009c\35\3\2\2\2\u009d\u009e\7&\2\2\u009e\u009f\5\n\6\2\u009f"+
		"\37\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7$\2"+
		"\2\u00a3!\3\2\2\2\u00a4\u00a7\5 \21\2\u00a5\u00a7\5\6\4\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\7\"\2\2"+
		"\u00ac\u00ad\5\f\7\2\u00ad\u00ae\7#\2\2\u00ae%\3\2\2\2\u00af\u00b0\7\25"+
		"\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3\7#\2\2\u00b3\'"+
		"\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\5\16\b\2"+
		"\u00b7\u00b8\7#\2\2\u00b8\u00bc\7\36\2\2\u00b9\u00bb\5\6\4\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3\7\37\2\2\u00c0\u00c2\5"+
		"*\26\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\5,"+
		"\27\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00ca"+
		"\7\20\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\5\16\b\2\u00cc\u00cd\7#\2\2"+
		"\u00cd\u00d1\7\36\2\2\u00ce\u00d0\5\6\4\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\7\37\2\2\u00d5+\3\2\2\2\u00d6\u00d7\7\17\2"+
		"\2\u00d7\u00db\7\36\2\2\u00d8\u00da\5\6\4\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\37\2\2\u00df-\3\2\2\2\26\64DLW"+
		"_cnu|\u0085\u0089\u008d\u0096\u00a6\u00a8\u00bc\u00c3\u00c7\u00d1\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}