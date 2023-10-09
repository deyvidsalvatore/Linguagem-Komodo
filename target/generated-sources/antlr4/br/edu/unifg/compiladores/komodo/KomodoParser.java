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
		NULL=22, NEW=23, THIS=24, TRUE=25, FALSE=26, POW=27, OPENBRACE=28, CLOSEBRACE=29, 
		OPENBRACK=30, CLOSEBRACK=31, OPENPAREN=32, CLOSEPAREN=33, SEMICOLON=34, 
		DOUBLEQUOTE=35, DOUBLEDOT=36, DOT=37, COMMA=38, LESSTHAN=39, GREATERTHAN=40, 
		LESSTHANEQUALS=41, GREATERTHANEQUALS=42, EQUALS=43, NOTEQUALS=44, ADD=45, 
		SUB=46, MUL=47, DIV=48, MOD=49, ASSIGN=50, ADD_ASSIGN=51, SUB_ASSIGN=52, 
		MUL_ASSIGN=53, DIV_ASSIGN=54, AND=55, OR=56, NOT=57, ESC_SEQ=58, WS=59, 
		BLOCK_COMMENT=60, COMMENT_LINE=61, STRING_LITERAL=62, NUM=63, BOOL=64, 
		CLASS_NAME=65, VARIABLE_NAME=66, ID=67, ARR=68;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_statement = 2, RULE_varDeclaration = 3, 
		RULE_assignmentStatement = 4, RULE_arrayAssignmentStatement = 5, RULE_functionCall = 6, 
		RULE_functionName = 7, RULE_objectDeclaration = 8, RULE_arrayIndexDeclaration = 9, 
		RULE_index = 10, RULE_dataType = 11, RULE_arrayType = 12, RULE_expression = 13, 
		RULE_logicalExpression = 14, RULE_logicalTerm = 15, RULE_comparisonExpression = 16, 
		RULE_concatenation = 17, RULE_concatenationElement = 18, RULE_functionDeclaration = 19, 
		RULE_parameters = 20, RULE_parameter = 21, RULE_returnType = 22, RULE_returnStatement = 23, 
		RULE_functionBody = 24, RULE_printStatement = 25, RULE_inputStatement = 26, 
		RULE_ifStatement = 27, RULE_elifStatement = 28, RULE_elseStatement = 29, 
		RULE_whileStatement = 30, RULE_arithmeticAssignmentExpression = 31, RULE_arithmeticExpression = 32, 
		RULE_addSubtractExpression = 33, RULE_multiplyDivideExpression = 34, RULE_unaryExpression = 35, 
		RULE_primaryExpression = 36, RULE_powerExpression = 37, RULE_packageStatement = 38, 
		RULE_packagePath = 39, RULE_importStatement = 40, RULE_importPath = 41, 
		RULE_classMemberDeclaration = 42, RULE_classDeclaration = 43, RULE_interfaceDeclaration = 44, 
		RULE_interfaceMethodDeclaration = 45, RULE_classVarDeclaration = 46, RULE_constructorDeclaration = 47, 
		RULE_parameterConstructor = 48, RULE_constructorBody = 49, RULE_constructorAssignment = 50, 
		RULE_methodDeclaration = 51, RULE_methodBody = 52, RULE_methodCall = 53, 
		RULE_methodName = 54, RULE_thisNameUsage = 55, RULE_methodReturnStatement = 56, 
		RULE_arguments = 57;
	public static final String[] ruleNames = {
		"start", "program", "statement", "varDeclaration", "assignmentStatement", 
		"arrayAssignmentStatement", "functionCall", "functionName", "objectDeclaration", 
		"arrayIndexDeclaration", "index", "dataType", "arrayType", "expression", 
		"logicalExpression", "logicalTerm", "comparisonExpression", "concatenation", 
		"concatenationElement", "functionDeclaration", "parameters", "parameter", 
		"returnType", "returnStatement", "functionBody", "printStatement", "inputStatement", 
		"ifStatement", "elifStatement", "elseStatement", "whileStatement", "arithmeticAssignmentExpression", 
		"arithmeticExpression", "addSubtractExpression", "multiplyDivideExpression", 
		"unaryExpression", "primaryExpression", "powerExpression", "packageStatement", 
		"packagePath", "importStatement", "importPath", "classMemberDeclaration", 
		"classDeclaration", "interfaceDeclaration", "interfaceMethodDeclaration", 
		"classVarDeclaration", "constructorDeclaration", "parameterConstructor", 
		"constructorBody", "constructorAssignment", "methodDeclaration", "methodBody", 
		"methodCall", "methodName", "thisNameUsage", "methodReturnStatement", 
		"arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'constructor'", "'method'", "'package'", "'interface'", 
		"'var'", "'string'", "'number'", "'boolean'", "'array'", "'if'", "'import'", 
		"'else'", "'elif'", "'while'", "'return'", "'global'", "'function'", "'input'", 
		"'implements'", "'print'", "'null'", "'new'", "'this'", "'true'", "'false'", 
		"'^'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'\"'", "':'", 
		"'.'", "','", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'&&'", "'||'", 
		"'!'", "'\\''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "CONSTRUCTOR", "METHOD", "PACKAGE", "INTERFACE", "VAR", 
		"STRING", "NUMBER", "BOOLEAN", "ARRAY", "IF", "IMPORT", "ELSE", "ELIF", 
		"WHILE", "RETURN", "GLOBAL", "FUNCTION", "INPUT", "IMPLEMENTS", "PRINT", 
		"NULL", "NEW", "THIS", "TRUE", "FALSE", "POW", "OPENBRACE", "CLOSEBRACE", 
		"OPENBRACK", "CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", "SEMICOLON", "DOUBLEQUOTE", 
		"DOUBLEDOT", "DOT", "COMMA", "LESSTHAN", "GREATERTHAN", "LESSTHANEQUALS", 
		"GREATERTHANEQUALS", "EQUALS", "NOTEQUALS", "ADD", "SUB", "MUL", "DIV", 
		"MOD", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND", "OR", "NOT", "ESC_SEQ", "WS", "BLOCK_COMMENT", "COMMENT_LINE", 
		"STRING_LITERAL", "NUM", "BOOL", "CLASS_NAME", "VARIABLE_NAME", "ID", 
		"ARR"
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
			setState(116);
			program();
			setState(117);
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
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0) );
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
		public PackageStatementContext packageStatement() {
			return getRuleContext(PackageStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
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
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ArrayAssignmentStatementContext arrayAssignmentStatement() {
			return getRuleContext(ArrayAssignmentStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				packageStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				importStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				varDeclaration();
				setState(127);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				printStatement();
				setState(131);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				inputStatement();
				setState(134);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				whileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				expression();
				setState(139);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				assignmentStatement();
				setState(142);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				arrayAssignmentStatement();
				setState(145);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(147);
				classDeclaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(148);
				interfaceDeclaration();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KomodoParser.VAR, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode DOUBLEDOT() { return getToken(KomodoParser.DOUBLEDOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KomodoParser.ASSIGN, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public ArrayIndexDeclarationContext arrayIndexDeclaration() {
			return getRuleContext(ArrayIndexDeclarationContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(KomodoParser.STRING_LITERAL, 0); }
		public TerminalNode NUM() { return getToken(KomodoParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(KomodoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KomodoParser.FALSE, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode ARR() { return getToken(KomodoParser.ARR, 0); }
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
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
			setState(151);
			match(VAR);
			setState(152);
			match(VARIABLE_NAME);
			setState(155);
			_la = _input.LA(1);
			if (_la==DOUBLEDOT) {
				{
				setState(153);
				match(DOUBLEDOT);
				setState(154);
				dataType();
				}
			}

			setState(173);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(157);
				match(ASSIGN);
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(158);
					arithmeticExpression();
					}
					break;
				case 2:
					{
					setState(159);
					arrayIndexDeclaration();
					}
					break;
				case 3:
					{
					setState(160);
					match(STRING_LITERAL);
					}
					break;
				case 4:
					{
					setState(161);
					match(NUM);
					}
					break;
				case 5:
					{
					setState(162);
					match(TRUE);
					}
					break;
				case 6:
					{
					setState(163);
					match(FALSE);
					}
					break;
				case 7:
					{
					setState(164);
					functionDeclaration();
					}
					break;
				case 8:
					{
					setState(165);
					match(ARR);
					}
					break;
				case 9:
					{
					setState(166);
					objectDeclaration();
					}
					break;
				case 10:
					{
					setState(167);
					functionCall();
					}
					break;
				case 11:
					{
					setState(168);
					methodCall();
					}
					break;
				case 12:
					{
					setState(169);
					comparisonExpression();
					}
					break;
				case 13:
					{
					setState(170);
					logicalExpression();
					}
					break;
				}
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(KomodoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(VARIABLE_NAME);
			setState(176);
			match(ASSIGN);
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(177);
				expression();
				}
				break;
			case 2:
				{
				setState(178);
				objectDeclaration();
				}
				break;
			case 3:
				{
				setState(179);
				functionCall();
				}
				break;
			case 4:
				{
				setState(180);
				methodCall();
				}
				break;
			case 5:
				{
				setState(181);
				comparisonExpression();
				}
				break;
			case 6:
				{
				setState(182);
				logicalExpression();
				}
				break;
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

	public static class ArrayAssignmentStatementContext extends ParserRuleContext {
		public ArrayIndexDeclarationContext arrayIndexDeclaration() {
			return getRuleContext(ArrayIndexDeclarationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KomodoParser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(KomodoParser.STRING_LITERAL, 0); }
		public TerminalNode NUM() { return getToken(KomodoParser.NUM, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(KomodoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KomodoParser.FALSE, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ArrayAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterArrayAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitArrayAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitArrayAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentStatementContext arrayAssignmentStatement() throws RecognitionException {
		ArrayAssignmentStatementContext _localctx = new ArrayAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			arrayIndexDeclaration();
			setState(186);
			match(ASSIGN);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(187);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				{
				setState(188);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(189);
				functionCall();
				}
				break;
			case 4:
				{
				setState(190);
				match(TRUE);
				}
				break;
			case 5:
				{
				setState(191);
				match(FALSE);
				}
				break;
			case 6:
				{
				setState(192);
				methodCall();
				}
				break;
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			functionName();
			setState(196);
			match(OPENPAREN);
			setState(198);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NULL - 22)) | (1L << (THIS - 22)) | (1L << (TRUE - 22)) | (1L << (FALSE - 22)) | (1L << (OPENPAREN - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (NOT - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NUM - 22)) | (1L << (BOOL - 22)) | (1L << (VARIABLE_NAME - 22)) | (1L << (ARR - 22)))) != 0)) {
				{
				setState(197);
				arguments();
				}
			}

			setState(200);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(VARIABLE_NAME);
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(KomodoParser.NEW, 0); }
		public TerminalNode CLASS_NAME() { return getToken(KomodoParser.CLASS_NAME, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(NEW);
			setState(205);
			match(CLASS_NAME);
			setState(206);
			match(OPENPAREN);
			setState(208);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NULL - 22)) | (1L << (THIS - 22)) | (1L << (TRUE - 22)) | (1L << (FALSE - 22)) | (1L << (OPENPAREN - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (NOT - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NUM - 22)) | (1L << (BOOL - 22)) | (1L << (VARIABLE_NAME - 22)) | (1L << (ARR - 22)))) != 0)) {
				{
				setState(207);
				arguments();
				}
			}

			setState(210);
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

	public static class ArrayIndexDeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ArrayIndexDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterArrayIndexDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitArrayIndexDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitArrayIndexDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexDeclarationContext arrayIndexDeclaration() throws RecognitionException {
		ArrayIndexDeclarationContext _localctx = new ArrayIndexDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayIndexDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(VARIABLE_NAME);
			setState(213);
			index();
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public TerminalNode NUM() { return getToken(KomodoParser.NUM, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(OPENBRACE);
			setState(216);
			match(NUM);
			setState(217);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KomodoParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(KomodoParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(KomodoParser.BOOLEAN, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_dataType);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(BOOLEAN);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				arrayType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(KomodoParser.ARRAY, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> OPENBRACE() { return getTokens(KomodoParser.OPENBRACE); }
		public TerminalNode OPENBRACE(int i) {
			return getToken(KomodoParser.OPENBRACE, i);
		}
		public List<TerminalNode> NUM() { return getTokens(KomodoParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(KomodoParser.NUM, i);
		}
		public List<TerminalNode> CLOSEBRACE() { return getTokens(KomodoParser.CLOSEBRACE); }
		public TerminalNode CLOSEBRACE(int i) {
			return getToken(KomodoParser.CLOSEBRACE, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ARRAY);
			setState(226);
			dataType();
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(227);
				match(OPENBRACE);
				setState(228);
				match(NUM);
				setState(229);
				match(CLOSEBRACE);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(230);
					match(OPENBRACE);
					setState(231);
					match(NUM);
					setState(232);
					match(CLOSEBRACE);
					}
					break;
				}
				}
				break;
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
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				logicalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				arithmeticExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				methodCall();
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
		enterRule(_localctx, 28, RULE_logicalExpression);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				logicalTerm();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(243);
					match(AND);
					setState(244);
					logicalTerm();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				logicalTerm();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(251);
					match(OR);
					setState(252);
					logicalTerm();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
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
		enterRule(_localctx, 30, RULE_logicalTerm);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case NULL:
			case THIS:
			case STRING_LITERAL:
			case NUM:
			case BOOL:
			case VARIABLE_NAME:
			case ARR:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				comparisonExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(NOT);
				setState(263);
				logicalTerm();
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(OPENPAREN);
				setState(265);
				logicalExpression();
				setState(266);
				match(CLOSEPAREN);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
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
		enterRule(_localctx, 32, RULE_comparisonExpression);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				concatenation();
				setState(273);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANEQUALS) | (1L << GREATERTHANEQUALS) | (1L << EQUALS) | (1L << NOTEQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(274);
				concatenation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
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
		public List<TerminalNode> ADD() { return getTokens(KomodoParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(KomodoParser.ADD, i);
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
		enterRule(_localctx, 34, RULE_concatenation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			concatenationElement();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD) {
				{
				{
				setState(280);
				match(ADD);
				setState(281);
				concatenationElement();
				}
				}
				setState(286);
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
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ThisNameUsageContext thisNameUsage() {
			return getRuleContext(ThisNameUsageContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_concatenationElement);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(ARR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				match(BOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				match(VARIABLE_NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(294);
				thisNameUsage();
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
		enterRule(_localctx, 38, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(FUNCTION);
			setState(298);
			match(VARIABLE_NAME);
			setState(299);
			match(OPENPAREN);
			setState(301);
			_la = _input.LA(1);
			if (_la==VARIABLE_NAME) {
				{
				setState(300);
				parameters();
				}
			}

			setState(303);
			match(CLOSEPAREN);
			setState(305);
			_la = _input.LA(1);
			if (_la==DOUBLEDOT) {
				{
				setState(304);
				returnType();
				}
			}

			setState(307);
			match(OPENBRACE);
			setState(309);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << RETURN) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0)) {
				{
				setState(308);
				functionBody();
				}
			}

			setState(311);
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
		enterRule(_localctx, 40, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			parameter();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(314);
				match(COMMA);
				setState(315);
				parameter();
				}
				}
				setState(320);
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
		enterRule(_localctx, 42, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(VARIABLE_NAME);
			setState(322);
			match(DOUBLEDOT);
			setState(323);
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
		enterRule(_localctx, 44, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(DOUBLEDOT);
			setState(326);
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
		enterRule(_localctx, 46, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(RETURN);
			setState(329);
			expression();
			setState(330);
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
		enterRule(_localctx, 48, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(334);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(332);
					returnStatement();
					}
					break;
				case CLASS:
				case PACKAGE:
				case INTERFACE:
				case VAR:
				case IF:
				case IMPORT:
				case WHILE:
				case FUNCTION:
				case INPUT:
				case PRINT:
				case NULL:
				case THIS:
				case TRUE:
				case FALSE:
				case OPENPAREN:
				case ADD:
				case SUB:
				case NOT:
				case STRING_LITERAL:
				case NUM:
				case BOOL:
				case VARIABLE_NAME:
				case ARR:
					{
					setState(333);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << RETURN) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0) );
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
		enterRule(_localctx, 50, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(PRINT);
			setState(339);
			match(OPENPAREN);
			setState(340);
			expression();
			setState(341);
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
		enterRule(_localctx, 52, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(INPUT);
			setState(344);
			match(OPENPAREN);
			setState(345);
			match(VARIABLE_NAME);
			setState(346);
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
		enterRule(_localctx, 54, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(IF);
			setState(349);
			match(OPENPAREN);
			setState(350);
			logicalExpression();
			setState(351);
			match(CLOSEPAREN);
			setState(352);
			match(OPENBRACE);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0)) {
				{
				{
				setState(353);
				statement();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(CLOSEBRACE);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(360);
				elifStatement();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(366);
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
		enterRule(_localctx, 56, RULE_elifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ELIF);
			setState(370);
			match(OPENPAREN);
			setState(371);
			logicalExpression();
			setState(372);
			match(CLOSEPAREN);
			setState(373);
			match(OPENBRACE);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0)) {
				{
				{
				setState(374);
				statement();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
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
		enterRule(_localctx, 58, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(ELSE);
			setState(383);
			match(OPENBRACE);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0)) {
				{
				{
				setState(384);
				statement();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KomodoParser.WHILE, 0); }
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
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(WHILE);
			setState(393);
			match(OPENPAREN);
			setState(394);
			logicalExpression();
			setState(395);
			match(CLOSEPAREN);
			setState(396);
			match(OPENBRACE);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0)) {
				{
				{
				setState(397);
				statement();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
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

	public static class ArithmeticAssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(KomodoParser.ADD_ASSIGN, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode SUB_ASSIGN() { return getToken(KomodoParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(KomodoParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(KomodoParser.DIV_ASSIGN, 0); }
		public ArithmeticAssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAssignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterArithmeticAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitArithmeticAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitArithmeticAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticAssignmentExpressionContext arithmeticAssignmentExpression() throws RecognitionException {
		ArithmeticAssignmentExpressionContext _localctx = new ArithmeticAssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arithmeticAssignmentExpression);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(VARIABLE_NAME);
				setState(406);
				match(ADD_ASSIGN);
				setState(407);
				arithmeticExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(VARIABLE_NAME);
				setState(409);
				match(SUB_ASSIGN);
				setState(410);
				arithmeticExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(VARIABLE_NAME);
				setState(412);
				match(MUL_ASSIGN);
				setState(413);
				arithmeticExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				match(VARIABLE_NAME);
				setState(415);
				match(DIV_ASSIGN);
				setState(416);
				arithmeticExpression();
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public AddSubtractExpressionContext addSubtractExpression() {
			return getRuleContext(AddSubtractExpressionContext.class,0);
		}
		public ArithmeticAssignmentExpressionContext arithmeticAssignmentExpression() {
			return getRuleContext(ArithmeticAssignmentExpressionContext.class,0);
		}
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arithmeticExpression);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				addSubtractExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				arithmeticAssignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				powerExpression();
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

	public static class AddSubtractExpressionContext extends ParserRuleContext {
		public List<MultiplyDivideExpressionContext> multiplyDivideExpression() {
			return getRuleContexts(MultiplyDivideExpressionContext.class);
		}
		public MultiplyDivideExpressionContext multiplyDivideExpression(int i) {
			return getRuleContext(MultiplyDivideExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(KomodoParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(KomodoParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(KomodoParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(KomodoParser.SUB, i);
		}
		public AddSubtractExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubtractExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterAddSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitAddSubtractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitAddSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubtractExpressionContext addSubtractExpression() throws RecognitionException {
		AddSubtractExpressionContext _localctx = new AddSubtractExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_addSubtractExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			multiplyDivideExpression();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(425);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(426);
				multiplyDivideExpression();
				}
				}
				setState(431);
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

	public static class MultiplyDivideExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(KomodoParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(KomodoParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(KomodoParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(KomodoParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(KomodoParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(KomodoParser.MOD, i);
		}
		public MultiplyDivideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyDivideExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterMultiplyDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitMultiplyDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitMultiplyDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyDivideExpressionContext multiplyDivideExpression() throws RecognitionException {
		MultiplyDivideExpressionContext _localctx = new MultiplyDivideExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiplyDivideExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			unaryExpression();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(433);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(434);
				unaryExpression();
				}
				}
				setState(439);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KomodoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KomodoParser.SUB, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryExpression);
		int _la;
		try {
			setState(446);
			switch (_input.LA(1)) {
			case THIS:
			case OPENPAREN:
			case ADD:
			case NUM:
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				_la = _input.LA(1);
				if (_la==ADD) {
					{
					setState(440);
					match(ADD);
					}
				}

				setState(443);
				primaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(SUB);
				setState(445);
				primaryExpression();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ThisNameUsageContext thisNameUsage() {
			return getRuleContext(ThisNameUsageContext.class,0);
		}
		public TerminalNode NUM() { return getToken(KomodoParser.NUM, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primaryExpression);
		try {
			setState(455);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				thisNameUsage();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(NUM);
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(VARIABLE_NAME);
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(OPENPAREN);
				setState(452);
				arithmeticExpression();
				setState(453);
				match(CLOSEPAREN);
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

	public static class PowerExpressionContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(KomodoParser.POW, 0); }
		public List<TerminalNode> NUM() { return getTokens(KomodoParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(KomodoParser.NUM, i);
		}
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(KomodoParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(KomodoParser.VARIABLE_NAME, i);
		}
		public List<ThisNameUsageContext> thisNameUsage() {
			return getRuleContexts(ThisNameUsageContext.class);
		}
		public ThisNameUsageContext thisNameUsage(int i) {
			return getRuleContext(ThisNameUsageContext.class,i);
		}
		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_powerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(457);
				match(NUM);
				}
				break;
			case VARIABLE_NAME:
				{
				setState(458);
				match(VARIABLE_NAME);
				}
				break;
			case THIS:
				{
				setState(459);
				thisNameUsage();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(462);
			match(POW);
			setState(466);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(463);
				match(NUM);
				}
				break;
			case VARIABLE_NAME:
				{
				setState(464);
				match(VARIABLE_NAME);
				}
				break;
			case THIS:
				{
				setState(465);
				thisNameUsage();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PackageStatementContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KomodoParser.PACKAGE, 0); }
		public PackagePathContext packagePath() {
			return getRuleContext(PackagePathContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterPackageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitPackageStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitPackageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_packageStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(PACKAGE);
			setState(469);
			packagePath();
			setState(470);
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

	public static class PackagePathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KomodoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KomodoParser.ID, i);
		}
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(KomodoParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(KomodoParser.VARIABLE_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(KomodoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KomodoParser.DOT, i);
		}
		public PackagePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterPackagePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitPackagePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitPackagePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackagePathContext packagePath() throws RecognitionException {
		PackagePathContext _localctx = new PackagePathContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_packagePath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE_NAME || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(473);
				match(DOT);
				setState(474);
				_la = _input.LA(1);
				if ( !(_la==VARIABLE_NAME || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(479);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KomodoParser.IMPORT, 0); }
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(IMPORT);
			setState(481);
			importPath();
			setState(482);
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

	public static class ImportPathContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(KomodoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KomodoParser.DOT, i);
		}
		public TerminalNode CLASS_NAME() { return getToken(KomodoParser.CLASS_NAME, 0); }
		public List<TerminalNode> ID() { return getTokens(KomodoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KomodoParser.ID, i);
		}
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(KomodoParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(KomodoParser.VARIABLE_NAME, i);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_importPath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(484);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE_NAME || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					match(DOT);
					setState(486);
					_la = _input.LA(1);
					if ( !(_la==VARIABLE_NAME || _la==ID) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
			{
			setState(492);
			match(DOT);
			setState(493);
			match(CLASS_NAME);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassVarDeclarationContext classVarDeclaration() {
			return getRuleContext(ClassVarDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classMemberDeclaration);
		try {
			setState(498);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				classVarDeclaration();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				constructorDeclaration();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				methodDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(KomodoParser.CLASS, 0); }
		public List<TerminalNode> CLASS_NAME() { return getTokens(KomodoParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(KomodoParser.CLASS_NAME, i);
		}
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(KomodoParser.IMPLEMENTS, 0); }
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(CLASS);
			setState(501);
			match(CLASS_NAME);
			setState(504);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(502);
				match(IMPLEMENTS);
				setState(503);
				match(CLASS_NAME);
				}
			}

			setState(506);
			match(OPENBRACE);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCTOR) | (1L << METHOD) | (1L << VAR))) != 0)) {
				{
				{
				setState(507);
				classMemberDeclaration();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(KomodoParser.INTERFACE, 0); }
		public TerminalNode CLASS_NAME() { return getToken(KomodoParser.CLASS_NAME, 0); }
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public List<InterfaceMethodDeclarationContext> interfaceMethodDeclaration() {
			return getRuleContexts(InterfaceMethodDeclarationContext.class);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration(int i) {
			return getRuleContext(InterfaceMethodDeclarationContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_interfaceDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(INTERFACE);
			setState(516);
			match(CLASS_NAME);
			setState(517);
			match(OPENBRACE);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(518);
					interfaceMethodDeclaration();
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(524);
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(KomodoParser.METHOD, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(METHOD);
			setState(527);
			methodName();
			setState(528);
			match(OPENPAREN);
			setState(530);
			_la = _input.LA(1);
			if (_la==VARIABLE_NAME) {
				{
				setState(529);
				parameters();
				}
			}

			setState(532);
			match(CLOSEPAREN);
			setState(534);
			_la = _input.LA(1);
			if (_la==DOUBLEDOT) {
				{
				setState(533);
				returnType();
				}
			}

			setState(536);
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

	public static class ClassVarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KomodoParser.VAR, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode DOUBLEDOT() { return getToken(KomodoParser.DOUBLEDOT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public ClassVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterClassVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitClassVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitClassVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarDeclarationContext classVarDeclaration() throws RecognitionException {
		ClassVarDeclarationContext _localctx = new ClassVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classVarDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(VAR);
			setState(539);
			match(VARIABLE_NAME);
			setState(540);
			match(DOUBLEDOT);
			setState(541);
			dataType();
			setState(542);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(KomodoParser.CONSTRUCTOR, 0); }
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public ParameterConstructorContext parameterConstructor() {
			return getRuleContext(ParameterConstructorContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public TerminalNode OPENBRACE() { return getToken(KomodoParser.OPENBRACE, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(KomodoParser.CLOSEBRACE, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(CONSTRUCTOR);
			setState(545);
			match(OPENPAREN);
			setState(546);
			parameterConstructor();
			setState(547);
			match(CLOSEPAREN);
			setState(548);
			match(OPENBRACE);
			setState(549);
			constructorBody();
			setState(550);
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

	public static class ParameterConstructorContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(KomodoParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(KomodoParser.VARIABLE_NAME, i);
		}
		public List<TerminalNode> DOUBLEDOT() { return getTokens(KomodoParser.DOUBLEDOT); }
		public TerminalNode DOUBLEDOT(int i) {
			return getToken(KomodoParser.DOUBLEDOT, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KomodoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KomodoParser.COMMA, i);
		}
		public ParameterConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterParameterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitParameterConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitParameterConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterConstructorContext parameterConstructor() throws RecognitionException {
		ParameterConstructorContext _localctx = new ParameterConstructorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameterConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(VARIABLE_NAME);
			setState(553);
			match(DOUBLEDOT);
			setState(554);
			dataType();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(555);
				match(COMMA);
				setState(556);
				match(VARIABLE_NAME);
				setState(557);
				match(DOUBLEDOT);
				setState(558);
				dataType();
				}
				}
				setState(563);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public List<ConstructorAssignmentContext> constructorAssignment() {
			return getRuleContexts(ConstructorAssignmentContext.class);
		}
		public ConstructorAssignmentContext constructorAssignment(int i) {
			return getRuleContext(ConstructorAssignmentContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THIS) {
				{
				{
				setState(564);
				constructorAssignment();
				}
				}
				setState(569);
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

	public static class ConstructorAssignmentContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(KomodoParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(KomodoParser.DOT, 0); }
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(KomodoParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(KomodoParser.VARIABLE_NAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(KomodoParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public ConstructorAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterConstructorAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitConstructorAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitConstructorAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorAssignmentContext constructorAssignment() throws RecognitionException {
		ConstructorAssignmentContext _localctx = new ConstructorAssignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constructorAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(THIS);
			setState(571);
			match(DOT);
			setState(572);
			match(VARIABLE_NAME);
			setState(573);
			match(ASSIGN);
			setState(574);
			match(VARIABLE_NAME);
			setState(575);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(KomodoParser.METHOD, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
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
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(METHOD);
			setState(578);
			methodName();
			setState(579);
			match(OPENPAREN);
			setState(581);
			_la = _input.LA(1);
			if (_la==VARIABLE_NAME) {
				{
				setState(580);
				parameters();
				}
			}

			setState(583);
			match(CLOSEPAREN);
			setState(585);
			_la = _input.LA(1);
			if (_la==DOUBLEDOT) {
				{
				setState(584);
				returnType();
				}
			}

			setState(587);
			match(OPENBRACE);
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(588);
				methodBody();
				}
				break;
			}
			setState(591);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<MethodReturnStatementContext> methodReturnStatement() {
			return getRuleContexts(MethodReturnStatementContext.class);
		}
		public MethodReturnStatementContext methodReturnStatement(int i) {
			return getRuleContext(MethodReturnStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PACKAGE) | (1L << INTERFACE) | (1L << VAR) | (1L << IF) | (1L << IMPORT) | (1L << WHILE) | (1L << RETURN) | (1L << FUNCTION) | (1L << INPUT) | (1L << PRINT) | (1L << NULL) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPENPAREN) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOL - 64)) | (1L << (VARIABLE_NAME - 64)) | (1L << (ARR - 64)))) != 0)) {
				{
				setState(595);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(593);
					methodReturnStatement();
					}
					break;
				case CLASS:
				case PACKAGE:
				case INTERFACE:
				case VAR:
				case IF:
				case IMPORT:
				case WHILE:
				case FUNCTION:
				case INPUT:
				case PRINT:
				case NULL:
				case THIS:
				case TRUE:
				case FALSE:
				case OPENPAREN:
				case ADD:
				case SUB:
				case NOT:
				case STRING_LITERAL:
				case NUM:
				case BOOL:
				case VARIABLE_NAME:
				case ARR:
					{
					setState(594);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(599);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public TerminalNode DOT() { return getToken(KomodoParser.DOT, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(KomodoParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(KomodoParser.CLOSEPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(VARIABLE_NAME);
			setState(601);
			match(DOT);
			setState(602);
			methodName();
			setState(603);
			match(OPENPAREN);
			setState(605);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (NULL - 22)) | (1L << (THIS - 22)) | (1L << (TRUE - 22)) | (1L << (FALSE - 22)) | (1L << (OPENPAREN - 22)) | (1L << (ADD - 22)) | (1L << (SUB - 22)) | (1L << (NOT - 22)) | (1L << (STRING_LITERAL - 22)) | (1L << (NUM - 22)) | (1L << (BOOL - 22)) | (1L << (VARIABLE_NAME - 22)) | (1L << (ARR - 22)))) != 0)) {
				{
				setState(604);
				arguments();
				}
			}

			setState(607);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(VARIABLE_NAME);
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

	public static class ThisNameUsageContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(KomodoParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(KomodoParser.DOT, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(KomodoParser.VARIABLE_NAME, 0); }
		public ThisNameUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisNameUsage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterThisNameUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitThisNameUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitThisNameUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisNameUsageContext thisNameUsage() throws RecognitionException {
		ThisNameUsageContext _localctx = new ThisNameUsageContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_thisNameUsage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(THIS);
			setState(612);
			match(DOT);
			setState(613);
			match(VARIABLE_NAME);
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

	public static class MethodReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KomodoParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KomodoParser.SEMICOLON, 0); }
		public MethodReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterMethodReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitMethodReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitMethodReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReturnStatementContext methodReturnStatement() throws RecognitionException {
		MethodReturnStatementContext _localctx = new MethodReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_methodReturnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(RETURN);
			setState(616);
			expression();
			setState(617);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KomodoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KomodoParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KomodoListener ) ((KomodoListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KomodoVisitor ) return ((KomodoVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			expression();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(620);
				match(COMMA);
				setState(621);
				expression();
				}
				}
				setState(626);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u0276\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\3\6\3{\n\3\r\3\16\3|\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0098\n\4\3"+
		"\5\3\5\3\5\3\5\5\5\u009e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u00ae\n\5\5\5\u00b0\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00ba\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c4\n\7\3\b\3"+
		"\b\3\b\5\b\u00c9\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00d3\n\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00e2\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ec\n\16\5\16\u00ee\n\16\3"+
		"\17\3\17\3\17\5\17\u00f3\n\17\3\20\3\20\3\20\7\20\u00f8\n\20\f\20\16\20"+
		"\u00fb\13\20\3\20\3\20\3\20\7\20\u0100\n\20\f\20\16\20\u0103\13\20\3\20"+
		"\5\20\u0106\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0118\n\22\3\23\3\23\3\23\7\23\u011d"+
		"\n\23\f\23\16\23\u0120\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u012a\n\24\3\25\3\25\3\25\3\25\5\25\u0130\n\25\3\25\3\25\5\25\u0134"+
		"\n\25\3\25\3\25\5\25\u0138\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u013f\n"+
		"\26\f\26\16\26\u0142\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\6\32\u0151\n\32\r\32\16\32\u0152\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0165"+
		"\n\35\f\35\16\35\u0168\13\35\3\35\3\35\7\35\u016c\n\35\f\35\16\35\u016f"+
		"\13\35\3\35\5\35\u0172\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u017a\n"+
		"\36\f\36\16\36\u017d\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u0184\n\37\f"+
		"\37\16\37\u0187\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u0191\n \f \16 \u0194"+
		"\13 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01a4\n!\3\"\3\"\3\""+
		"\5\"\u01a9\n\"\3#\3#\3#\7#\u01ae\n#\f#\16#\u01b1\13#\3$\3$\3$\7$\u01b6"+
		"\n$\f$\16$\u01b9\13$\3%\5%\u01bc\n%\3%\3%\3%\5%\u01c1\n%\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u01ca\n&\3\'\3\'\3\'\5\'\u01cf\n\'\3\'\3\'\3\'\3\'\5\'\u01d5"+
		"\n\'\3(\3(\3(\3(\3)\3)\3)\7)\u01de\n)\f)\16)\u01e1\13)\3*\3*\3*\3*\3+"+
		"\3+\3+\7+\u01ea\n+\f+\16+\u01ed\13+\3+\3+\3+\3,\3,\3,\5,\u01f5\n,\3-\3"+
		"-\3-\3-\5-\u01fb\n-\3-\3-\7-\u01ff\n-\f-\16-\u0202\13-\3-\3-\3.\3.\3."+
		"\3.\7.\u020a\n.\f.\16.\u020d\13.\3.\3.\3/\3/\3/\3/\5/\u0215\n/\3/\3/\5"+
		"/\u0219\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0232\n\62\f\62"+
		"\16\62\u0235\13\62\3\63\7\63\u0238\n\63\f\63\16\63\u023b\13\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0248\n\65\3\65"+
		"\3\65\5\65\u024c\n\65\3\65\3\65\5\65\u0250\n\65\3\65\3\65\3\66\3\66\7"+
		"\66\u0256\n\66\f\66\16\66\u0259\13\66\3\67\3\67\3\67\3\67\3\67\5\67\u0260"+
		"\n\67\3\67\3\67\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\7;\u0271\n;\f;"+
		"\16;\u0274\13;\3;\3\u020b\2<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\6\3\2).\3\2/\60\3"+
		"\2\61\63\3\2DE\u02a8\2v\3\2\2\2\4z\3\2\2\2\6\u0097\3\2\2\2\b\u0099\3\2"+
		"\2\2\n\u00b1\3\2\2\2\f\u00bb\3\2\2\2\16\u00c5\3\2\2\2\20\u00cc\3\2\2\2"+
		"\22\u00ce\3\2\2\2\24\u00d6\3\2\2\2\26\u00d9\3\2\2\2\30\u00e1\3\2\2\2\32"+
		"\u00e3\3\2\2\2\34\u00f2\3\2\2\2\36\u0105\3\2\2\2 \u0110\3\2\2\2\"\u0117"+
		"\3\2\2\2$\u0119\3\2\2\2&\u0129\3\2\2\2(\u012b\3\2\2\2*\u013b\3\2\2\2,"+
		"\u0143\3\2\2\2.\u0147\3\2\2\2\60\u014a\3\2\2\2\62\u0150\3\2\2\2\64\u0154"+
		"\3\2\2\2\66\u0159\3\2\2\28\u015e\3\2\2\2:\u0173\3\2\2\2<\u0180\3\2\2\2"+
		">\u018a\3\2\2\2@\u01a3\3\2\2\2B\u01a8\3\2\2\2D\u01aa\3\2\2\2F\u01b2\3"+
		"\2\2\2H\u01c0\3\2\2\2J\u01c9\3\2\2\2L\u01ce\3\2\2\2N\u01d6\3\2\2\2P\u01da"+
		"\3\2\2\2R\u01e2\3\2\2\2T\u01e6\3\2\2\2V\u01f4\3\2\2\2X\u01f6\3\2\2\2Z"+
		"\u0205\3\2\2\2\\\u0210\3\2\2\2^\u021c\3\2\2\2`\u0222\3\2\2\2b\u022a\3"+
		"\2\2\2d\u0239\3\2\2\2f\u023c\3\2\2\2h\u0243\3\2\2\2j\u0257\3\2\2\2l\u025a"+
		"\3\2\2\2n\u0263\3\2\2\2p\u0265\3\2\2\2r\u0269\3\2\2\2t\u026d\3\2\2\2v"+
		"w\5\4\3\2wx\7\2\2\3x\3\3\2\2\2y{\5\6\4\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\5\3\2\2\2~\u0098\5N(\2\177\u0098\5R*\2\u0080\u0081\5\b\5\2"+
		"\u0081\u0082\7$\2\2\u0082\u0098\3\2\2\2\u0083\u0098\5(\25\2\u0084\u0085"+
		"\5\64\33\2\u0085\u0086\7$\2\2\u0086\u0098\3\2\2\2\u0087\u0088\5\66\34"+
		"\2\u0088\u0089\7$\2\2\u0089\u0098\3\2\2\2\u008a\u0098\58\35\2\u008b\u0098"+
		"\5> \2\u008c\u008d\5\34\17\2\u008d\u008e\7$\2\2\u008e\u0098\3\2\2\2\u008f"+
		"\u0090\5\n\6\2\u0090\u0091\7$\2\2\u0091\u0098\3\2\2\2\u0092\u0093\5\f"+
		"\7\2\u0093\u0094\7$\2\2\u0094\u0098\3\2\2\2\u0095\u0098\5X-\2\u0096\u0098"+
		"\5Z.\2\u0097~\3\2\2\2\u0097\177\3\2\2\2\u0097\u0080\3\2\2\2\u0097\u0083"+
		"\3\2\2\2\u0097\u0084\3\2\2\2\u0097\u0087\3\2\2\2\u0097\u008a\3\2\2\2\u0097"+
		"\u008b\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0092\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\7\3\2\2\2\u0099\u009a"+
		"\7\b\2\2\u009a\u009d\7D\2\2\u009b\u009c\7&\2\2\u009c\u009e\5\30\r\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00af\3\2\2\2\u009f\u00ad\7\64"+
		"\2\2\u00a0\u00ae\5B\"\2\u00a1\u00ae\5\24\13\2\u00a2\u00ae\7@\2\2\u00a3"+
		"\u00ae\7A\2\2\u00a4\u00ae\7\33\2\2\u00a5\u00ae\7\34\2\2\u00a6\u00ae\5"+
		"(\25\2\u00a7\u00ae\7F\2\2\u00a8\u00ae\5\22\n\2\u00a9\u00ae\5\16\b\2\u00aa"+
		"\u00ae\5l\67\2\u00ab\u00ae\5\"\22\2\u00ac\u00ae\5\36\20\2\u00ad\u00a0"+
		"\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad"+
		"\u00a4\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a7\3\2"+
		"\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u009f\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\t\3\2\2\2\u00b1\u00b2\7D\2\2\u00b2\u00b9"+
		"\7\64\2\2\u00b3\u00ba\5\34\17\2\u00b4\u00ba\5\22\n\2\u00b5\u00ba\5\16"+
		"\b\2\u00b6\u00ba\5l\67\2\u00b7\u00ba\5\"\22\2\u00b8\u00ba\5\36\20\2\u00b9"+
		"\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\13\3\2\2\2\u00bb\u00bc"+
		"\5\24\13\2\u00bc\u00c3\7\64\2\2\u00bd\u00c4\7@\2\2\u00be\u00c4\7A\2\2"+
		"\u00bf\u00c4\5\16\b\2\u00c0\u00c4\7\33\2\2\u00c1\u00c4\7\34\2\2\u00c2"+
		"\u00c4\5l\67\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\r\3\2\2\2\u00c5\u00c6\5\20\t\2\u00c6\u00c8\7\"\2\2\u00c7\u00c9\5t;\2"+
		"\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\7#\2\2\u00cb\17\3\2\2\2\u00cc\u00cd\7D\2\2\u00cd\21\3\2\2\2\u00ce\u00cf"+
		"\7\31\2\2\u00cf\u00d0\7C\2\2\u00d0\u00d2\7\"\2\2\u00d1\u00d3\5t;\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7#"+
		"\2\2\u00d5\23\3\2\2\2\u00d6\u00d7\7D\2\2\u00d7\u00d8\5\26\f\2\u00d8\25"+
		"\3\2\2\2\u00d9\u00da\7\36\2\2\u00da\u00db\7A\2\2\u00db\u00dc\7\37\2\2"+
		"\u00dc\27\3\2\2\2\u00dd\u00e2\7\t\2\2\u00de\u00e2\7\n\2\2\u00df\u00e2"+
		"\7\13\2\2\u00e0\u00e2\5\32\16\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\31\3\2\2\2\u00e3\u00e4"+
		"\7\f\2\2\u00e4\u00ed\5\30\r\2\u00e5\u00e6\7\36\2\2\u00e6\u00e7\7A\2\2"+
		"\u00e7\u00eb\7\37\2\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\7A\2\2\u00ea\u00ec"+
		"\7\37\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2"+
		"\u00ed\u00e5\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f3"+
		"\5\36\20\2\u00f0\u00f3\5B\"\2\u00f1\u00f3\5l\67\2\u00f2\u00ef\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\35\3\2\2\2\u00f4\u00f9"+
		"\5 \21\2\u00f5\u00f6\79\2\2\u00f6\u00f8\5 \21\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0106\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0101\5 \21\2\u00fd\u00fe\7:\2\2\u00fe"+
		"\u0100\5 \21\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0106\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0106\5\"\22\2\u0105\u00f4\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0104\3"+
		"\2\2\2\u0106\37\3\2\2\2\u0107\u0111\5\"\22\2\u0108\u0109\7;\2\2\u0109"+
		"\u0111\5 \21\2\u010a\u010b\7\"\2\2\u010b\u010c\5\36\20\2\u010c\u010d\7"+
		"#\2\2\u010d\u0111\3\2\2\2\u010e\u0111\7\33\2\2\u010f\u0111\7\34\2\2\u0110"+
		"\u0107\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u010f\3\2\2\2\u0111!\3\2\2\2\u0112\u0113\5$\23\2\u0113\u0114"+
		"\t\2\2\2\u0114\u0115\5$\23\2\u0115\u0118\3\2\2\2\u0116\u0118\5$\23\2\u0117"+
		"\u0112\3\2\2\2\u0117\u0116\3\2\2\2\u0118#\3\2\2\2\u0119\u011e\5&\24\2"+
		"\u011a\u011b\7/\2\2\u011b\u011d\5&\24\2\u011c\u011a\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f%\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u012a\7@\2\2\u0122\u012a\7A\2\2\u0123\u012a\7\30"+
		"\2\2\u0124\u012a\7F\2\2\u0125\u012a\7B\2\2\u0126\u012a\7D\2\2\u0127\u012a"+
		"\5l\67\2\u0128\u012a\5p9\2\u0129\u0121\3\2\2\2\u0129\u0122\3\2\2\2\u0129"+
		"\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\'\3\2\2\2\u012b\u012c"+
		"\7\24\2\2\u012c\u012d\7D\2\2\u012d\u012f\7\"\2\2\u012e\u0130\5*\26\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\7#"+
		"\2\2\u0132\u0134\5.\30\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\7\36\2\2\u0136\u0138\5\62\32\2\u0137\u0136"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\37\2\2"+
		"\u013a)\3\2\2\2\u013b\u0140\5,\27\2\u013c\u013d\7(\2\2\u013d\u013f\5,"+
		"\27\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141+\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7D\2\2\u0144"+
		"\u0145\7&\2\2\u0145\u0146\5\30\r\2\u0146-\3\2\2\2\u0147\u0148\7&\2\2\u0148"+
		"\u0149\5\30\r\2\u0149/\3\2\2\2\u014a\u014b\7\22\2\2\u014b\u014c\5\34\17"+
		"\2\u014c\u014d\7$\2\2\u014d\61\3\2\2\2\u014e\u0151\5\60\31\2\u014f\u0151"+
		"\5\6\4\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\63\3\2\2\2\u0154\u0155\7\27\2"+
		"\2\u0155\u0156\7\"\2\2\u0156\u0157\5\34\17\2\u0157\u0158\7#\2\2\u0158"+
		"\65\3\2\2\2\u0159\u015a\7\25\2\2\u015a\u015b\7\"\2\2\u015b\u015c\7D\2"+
		"\2\u015c\u015d\7#\2\2\u015d\67\3\2\2\2\u015e\u015f\7\r\2\2\u015f\u0160"+
		"\7\"\2\2\u0160\u0161\5\36\20\2\u0161\u0162\7#\2\2\u0162\u0166\7\36\2\2"+
		"\u0163\u0165\5\6\4\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016d\7\37\2\2\u016a\u016c\5:\36\2\u016b\u016a\3\2\2\2\u016c\u016f\3"+
		"\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0172\5<\37\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u01729\3\2\2\2\u0173\u0174\7\20\2\2\u0174\u0175\7\"\2\2\u0175\u0176"+
		"\5\36\20\2\u0176\u0177\7#\2\2\u0177\u017b\7\36\2\2\u0178\u017a\5\6\4\2"+
		"\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\37\2\2"+
		"\u017f;\3\2\2\2\u0180\u0181\7\17\2\2\u0181\u0185\7\36\2\2\u0182\u0184"+
		"\5\6\4\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\37"+
		"\2\2\u0189=\3\2\2\2\u018a\u018b\7\21\2\2\u018b\u018c\7\"\2\2\u018c\u018d"+
		"\5\36\20\2\u018d\u018e\7#\2\2\u018e\u0192\7\36\2\2\u018f\u0191\5\6\4\2"+
		"\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7\37\2\2"+
		"\u0196?\3\2\2\2\u0197\u0198\7D\2\2\u0198\u0199\7\65\2\2\u0199\u01a4\5"+
		"B\"\2\u019a\u019b\7D\2\2\u019b\u019c\7\66\2\2\u019c\u01a4\5B\"\2\u019d"+
		"\u019e\7D\2\2\u019e\u019f\7\67\2\2\u019f\u01a4\5B\"\2\u01a0\u01a1\7D\2"+
		"\2\u01a1\u01a2\78\2\2\u01a2\u01a4\5B\"\2\u01a3\u0197\3\2\2\2\u01a3\u019a"+
		"\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a4A\3\2\2\2\u01a5"+
		"\u01a9\5D#\2\u01a6\u01a9\5@!\2\u01a7\u01a9\5L\'\2\u01a8\u01a5\3\2\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9C\3\2\2\2\u01aa\u01af\5"+
		"F$\2\u01ab\u01ac\t\3\2\2\u01ac\u01ae\5F$\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0E\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b7\5H%\2\u01b3\u01b4\t\4\2\2\u01b4\u01b6\5H%\2"+
		"\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8G\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\7/\2\2\u01bb\u01ba"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\5J&\2\u01be"+
		"\u01bf\7\60\2\2\u01bf\u01c1\5J&\2\u01c0\u01bb\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c1I\3\2\2\2\u01c2\u01ca\5p9\2\u01c3\u01ca\7A\2\2\u01c4\u01ca\7"+
		"D\2\2\u01c5\u01c6\7\"\2\2\u01c6\u01c7\5B\"\2\u01c7\u01c8\7#\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01c2\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c4\3\2"+
		"\2\2\u01c9\u01c5\3\2\2\2\u01caK\3\2\2\2\u01cb\u01cf\7A\2\2\u01cc\u01cf"+
		"\7D\2\2\u01cd\u01cf\5p9\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d4\7\35\2\2\u01d1\u01d5\7"+
		"A\2\2\u01d2\u01d5\7D\2\2\u01d3\u01d5\5p9\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5M\3\2\2\2\u01d6\u01d7\7\6\2\2\u01d7"+
		"\u01d8\5P)\2\u01d8\u01d9\7$\2\2\u01d9O\3\2\2\2\u01da\u01df\t\5\2\2\u01db"+
		"\u01dc\7\'\2\2\u01dc\u01de\t\5\2\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0Q\3\2\2\2\u01e1\u01df"+
		"\3\2\2\2\u01e2\u01e3\7\16\2\2\u01e3\u01e4\5T+\2\u01e4\u01e5\7$\2\2\u01e5"+
		"S\3\2\2\2\u01e6\u01eb\t\5\2\2\u01e7\u01e8\7\'\2\2\u01e8\u01ea\t\5\2\2"+
		"\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\'\2\2\u01ef"+
		"\u01f0\7C\2\2\u01f0U\3\2\2\2\u01f1\u01f5\5^\60\2\u01f2\u01f5\5`\61\2\u01f3"+
		"\u01f5\5h\65\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2"+
		"\2\2\u01f5W\3\2\2\2\u01f6\u01f7\7\3\2\2\u01f7\u01fa\7C\2\2\u01f8\u01f9"+
		"\7\26\2\2\u01f9\u01fb\7C\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u0200\7\36\2\2\u01fd\u01ff\5V,\2\u01fe\u01fd\3\2"+
		"\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\37\2\2\u0204Y\3\2\2\2"+
		"\u0205\u0206\7\7\2\2\u0206\u0207\7C\2\2\u0207\u020b\7\36\2\2\u0208\u020a"+
		"\5\\/\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u020c\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7\37"+
		"\2\2\u020f[\3\2\2\2\u0210\u0211\7\5\2\2\u0211\u0212\5n8\2\u0212\u0214"+
		"\7\"\2\2\u0213\u0215\5*\26\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0218\7#\2\2\u0217\u0219\5.\30\2\u0218\u0217\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7$\2\2\u021b"+
		"]\3\2\2\2\u021c\u021d\7\b\2\2\u021d\u021e\7D\2\2\u021e\u021f\7&\2\2\u021f"+
		"\u0220\5\30\r\2\u0220\u0221\7$\2\2\u0221_\3\2\2\2\u0222\u0223\7\4\2\2"+
		"\u0223\u0224\7\"\2\2\u0224\u0225\5b\62\2\u0225\u0226\7#\2\2\u0226\u0227"+
		"\7\36\2\2\u0227\u0228\5d\63\2\u0228\u0229\7\37\2\2\u0229a\3\2\2\2\u022a"+
		"\u022b\7D\2\2\u022b\u022c\7&\2\2\u022c\u0233\5\30\r\2\u022d\u022e\7(\2"+
		"\2\u022e\u022f\7D\2\2\u022f\u0230\7&\2\2\u0230\u0232\5\30\r\2\u0231\u022d"+
		"\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"c\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0238\5f\64\2\u0237\u0236\3\2\2\2"+
		"\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023ae\3"+
		"\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\7\32\2\2\u023d\u023e\7\'\2\2\u023e"+
		"\u023f\7D\2\2\u023f\u0240\7\64\2\2\u0240\u0241\7D\2\2\u0241\u0242\7$\2"+
		"\2\u0242g\3\2\2\2\u0243\u0244\7\5\2\2\u0244\u0245\5n8\2\u0245\u0247\7"+
		"\"\2\2\u0246\u0248\5*\26\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024b\7#\2\2\u024a\u024c\5.\30\2\u024b\u024a\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\7\36\2\2\u024e"+
		"\u0250\5j\66\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0252\7\37\2\2\u0252i\3\2\2\2\u0253\u0256\5r:\2\u0254\u0256"+
		"\5\6\4\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258k\3\2\2\2\u0259\u0257\3\2\2\2"+
		"\u025a\u025b\7D\2\2\u025b\u025c\7\'\2\2\u025c\u025d\5n8\2\u025d\u025f"+
		"\7\"\2\2\u025e\u0260\5t;\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0262\7#\2\2\u0262m\3\2\2\2\u0263\u0264\7D\2\2\u0264"+
		"o\3\2\2\2\u0265\u0266\7\32\2\2\u0266\u0267\7\'\2\2\u0267\u0268\7D\2\2"+
		"\u0268q\3\2\2\2\u0269\u026a\7\22\2\2\u026a\u026b\5\34\17\2\u026b\u026c"+
		"\7$\2\2\u026cs\3\2\2\2\u026d\u0272\5\34\17\2\u026e\u026f\7(\2\2\u026f"+
		"\u0271\5\34\17\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3"+
		"\2\2\2\u0272\u0273\3\2\2\2\u0273u\3\2\2\2\u0274\u0272\3\2\2\2<|\u0097"+
		"\u009d\u00ad\u00af\u00b9\u00c3\u00c8\u00d2\u00e1\u00eb\u00ed\u00f2\u00f9"+
		"\u0101\u0105\u0110\u0117\u011e\u0129\u012f\u0133\u0137\u0140\u0150\u0152"+
		"\u0166\u016d\u0171\u017b\u0185\u0192\u01a3\u01a8\u01af\u01b7\u01bb\u01c0"+
		"\u01c9\u01ce\u01d4\u01df\u01eb\u01f4\u01fa\u0200\u020b\u0214\u0218\u0233"+
		"\u0239\u0247\u024b\u024f\u0255\u0257\u025f\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}