// Generated from br\edu\u005Cunifg\compiladores\komodo\Komodo.g4 by ANTLR 4.5.1
package br.edu.unifg.compiladores.komodo;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KomodoLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "CONSTRUCTOR", "METHOD", "PACKAGE", "INTERFACE", "VAR", "STRING", 
		"NUMBER", "BOOLEAN", "ARRAY", "IF", "IMPORT", "ELSE", "ELIF", "WHILE", 
		"RETURN", "GLOBAL", "FUNCTION", "INPUT", "IMPLEMENTS", "PRINT", "NULL", 
		"NEW", "THIS", "TRUE", "FALSE", "CONCAT", "OPENBRACE", "CLOSEBRACE", "OPENBRACK", 
		"CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", "SEMICOLON", "DOUBLEQUOTE", "DOUBLEDOT", 
		"DOT", "COMMA", "LESSTHAN", "GREATERTHAN", "LESSTHANEQUALS", "GREATERTHANEQUALS", 
		"EQUALS", "NOTEQUALS", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND", "OR", "NOT", "ESC_SEQ", 
		"WS", "BLOCK_COMMENT", "COMMENT_LINE", "STRING_LITERAL", "NUM", "BOOL", 
		"VARIABLE_NAME", "ID", "ARR", "VALUE"
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


	public KomodoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Komodo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2E\u01e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\3;\3<"+
		"\6<\u0184\n<\r<\16<\u0185\3<\3<\3=\3=\5=\u018c\n=\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\7>\u0197\n>\f>\16>\u019a\13>\3>\3>\3?\3?\7?\u01a0\n?\f?\16?\u01a3"+
		"\13?\3?\3?\3@\5@\u01a8\n@\3@\6@\u01ab\n@\r@\16@\u01ac\3@\3@\6@\u01b1\n"+
		"@\r@\16@\u01b2\5@\u01b5\n@\3A\3A\5A\u01b9\nA\3B\3B\7B\u01bd\nB\fB\16B"+
		"\u01c0\13B\3C\3C\7C\u01c4\nC\fC\16C\u01c7\13C\3D\3D\3D\3D\7D\u01cd\nD"+
		"\fD\16D\u01d0\13D\3D\3D\7D\u01d4\nD\fD\16D\u01d7\13D\5D\u01d9\nD\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\5E\u01e3\nE\3\u01d5\2F\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089\2\3\2\t\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\5\2\f\f\17\17$$\3\2\62;\3\2c|\6\2\62;C\\aac|\5\2C\\aac|\u01f3\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\3\u008b\3\2\2\2\5\u0091\3\2\2\2\7\u009d\3\2\2\2"+
		"\t\u00a4\3\2\2\2\13\u00ac\3\2\2\2\r\u00b6\3\2\2\2\17\u00ba\3\2\2\2\21"+
		"\u00c1\3\2\2\2\23\u00c8\3\2\2\2\25\u00d0\3\2\2\2\27\u00d6\3\2\2\2\31\u00d9"+
		"\3\2\2\2\33\u00e0\3\2\2\2\35\u00e5\3\2\2\2\37\u00ea\3\2\2\2!\u00f0\3\2"+
		"\2\2#\u00f7\3\2\2\2%\u00fe\3\2\2\2\'\u0107\3\2\2\2)\u010d\3\2\2\2+\u0118"+
		"\3\2\2\2-\u011e\3\2\2\2/\u0123\3\2\2\2\61\u0127\3\2\2\2\63\u012c\3\2\2"+
		"\2\65\u0131\3\2\2\2\67\u0137\3\2\2\29\u0139\3\2\2\2;\u013b\3\2\2\2=\u013d"+
		"\3\2\2\2?\u013f\3\2\2\2A\u0141\3\2\2\2C\u0143\3\2\2\2E\u0145\3\2\2\2G"+
		"\u0147\3\2\2\2I\u0149\3\2\2\2K\u014b\3\2\2\2M\u014d\3\2\2\2O\u014f\3\2"+
		"\2\2Q\u0151\3\2\2\2S\u0153\3\2\2\2U\u0156\3\2\2\2W\u0159\3\2\2\2Y\u015c"+
		"\3\2\2\2[\u015f\3\2\2\2]\u0161\3\2\2\2_\u0163\3\2\2\2a\u0165\3\2\2\2c"+
		"\u0167\3\2\2\2e\u0169\3\2\2\2g\u016b\3\2\2\2i\u016e\3\2\2\2k\u0171\3\2"+
		"\2\2m\u0174\3\2\2\2o\u0177\3\2\2\2q\u017a\3\2\2\2s\u017d\3\2\2\2u\u017f"+
		"\3\2\2\2w\u0183\3\2\2\2y\u0189\3\2\2\2{\u0192\3\2\2\2}\u019d\3\2\2\2\177"+
		"\u01a7\3\2\2\2\u0081\u01b8\3\2\2\2\u0083\u01ba\3\2\2\2\u0085\u01c1\3\2"+
		"\2\2\u0087\u01c8\3\2\2\2\u0089\u01e2\3\2\2\2\u008b\u008c\7e\2\2\u008c"+
		"\u008d\7n\2\2\u008d\u008e\7c\2\2\u008e\u008f\7u\2\2\u008f\u0090\7u\2\2"+
		"\u0090\4\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p"+
		"\2\2\u0094\u0095\7u\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7w\2\2\u0098\u0099\7e\2\2\u0099\u009a\7v\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7t\2\2\u009c\6\3\2\2\2\u009d\u009e\7o\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7f\2\2"+
		"\u00a3\b\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7e"+
		"\2\2\u00a7\u00a8\7m\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\n\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7h\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7g\2\2\u00b5\f\3\2\2\2\u00b6"+
		"\u00b7\7x\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7t\2\2\u00b9\16\3\2\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2"+
		"\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\7"+
		"p\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7t\2\2\u00c7\22\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7p\2\2\u00cf\24\3\2\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7{\2\2"+
		"\u00d5\26\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8\30\3\2\2"+
		"\2\u00d9\u00da\7k\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd"+
		"\7q\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7v\2\2\u00df\32\3\2\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\34\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7h\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7j\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef \3\2\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7w\2\2"+
		"\u00f4\u00f5\7t\2\2\u00f5\u00f6\7p\2\2\u00f6\"\3\2\2\2\u00f7\u00f8\7i"+
		"\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u00fd\7n\2\2\u00fd$\3\2\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100"+
		"\7w\2\2\u0100\u0101\7p\2\2\u0101\u0102\7e\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7k\2\2\u0104\u0105\7q\2\2\u0105\u0106\7p\2\2\u0106&\3\2\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7r\2\2\u010a\u010b\7w\2\2"+
		"\u010b\u010c\7v\2\2\u010c(\3\2\2\2\u010d\u010e\7k\2\2\u010e\u010f\7o\2"+
		"\2\u010f\u0110\7r\2\2\u0110\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7o\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116"+
		"\u0117\7u\2\2\u0117*\3\2\2\2\u0118\u0119\7r\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c\u011d\7v\2\2\u011d,\3\2\2\2\u011e"+
		"\u011f\7p\2\2\u011f\u0120\7w\2\2\u0120\u0121\7n\2\2\u0121\u0122\7n\2\2"+
		"\u0122.\3\2\2\2\u0123\u0124\7p\2\2\u0124\u0125\7g\2\2\u0125\u0126\7y\2"+
		"\2\u0126\60\3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129\7j\2\2\u0129\u012a"+
		"\7k\2\2\u012a\u012b\7u\2\2\u012b\62\3\2\2\2\u012c\u012d\7v\2\2\u012d\u012e"+
		"\7t\2\2\u012e\u012f\7w\2\2\u012f\u0130\7g\2\2\u0130\64\3\2\2\2\u0131\u0132"+
		"\7h\2\2\u0132\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134\u0135\7u\2\2\u0135"+
		"\u0136\7g\2\2\u0136\66\3\2\2\2\u0137\u0138\7-\2\2\u01388\3\2\2\2\u0139"+
		"\u013a\7}\2\2\u013a:\3\2\2\2\u013b\u013c\7\177\2\2\u013c<\3\2\2\2\u013d"+
		"\u013e\7]\2\2\u013e>\3\2\2\2\u013f\u0140\7_\2\2\u0140@\3\2\2\2\u0141\u0142"+
		"\7*\2\2\u0142B\3\2\2\2\u0143\u0144\7+\2\2\u0144D\3\2\2\2\u0145\u0146\7"+
		"=\2\2\u0146F\3\2\2\2\u0147\u0148\7$\2\2\u0148H\3\2\2\2\u0149\u014a\7<"+
		"\2\2\u014aJ\3\2\2\2\u014b\u014c\7\60\2\2\u014cL\3\2\2\2\u014d\u014e\7"+
		".\2\2\u014eN\3\2\2\2\u014f\u0150\7>\2\2\u0150P\3\2\2\2\u0151\u0152\7@"+
		"\2\2\u0152R\3\2\2\2\u0153\u0154\7>\2\2\u0154\u0155\7?\2\2\u0155T\3\2\2"+
		"\2\u0156\u0157\7@\2\2\u0157\u0158\7?\2\2\u0158V\3\2\2\2\u0159\u015a\7"+
		"?\2\2\u015a\u015b\7?\2\2\u015bX\3\2\2\2\u015c\u015d\7#\2\2\u015d\u015e"+
		"\7?\2\2\u015eZ\3\2\2\2\u015f\u0160\7-\2\2\u0160\\\3\2\2\2\u0161\u0162"+
		"\7/\2\2\u0162^\3\2\2\2\u0163\u0164\7,\2\2\u0164`\3\2\2\2\u0165\u0166\7"+
		"\61\2\2\u0166b\3\2\2\2\u0167\u0168\7\'\2\2\u0168d\3\2\2\2\u0169\u016a"+
		"\7?\2\2\u016af\3\2\2\2\u016b\u016c\7-\2\2\u016c\u016d\7?\2\2\u016dh\3"+
		"\2\2\2\u016e\u016f\7/\2\2\u016f\u0170\7?\2\2\u0170j\3\2\2\2\u0171\u0172"+
		"\7,\2\2\u0172\u0173\7?\2\2\u0173l\3\2\2\2\u0174\u0175\7\61\2\2\u0175\u0176"+
		"\7?\2\2\u0176n\3\2\2\2\u0177\u0178\7(\2\2\u0178\u0179\7(\2\2\u0179p\3"+
		"\2\2\2\u017a\u017b\7~\2\2\u017b\u017c\7~\2\2\u017cr\3\2\2\2\u017d\u017e"+
		"\7#\2\2\u017et\3\2\2\2\u017f\u0180\7^\2\2\u0180\u0181\7)\2\2\u0181v\3"+
		"\2\2\2\u0182\u0184\t\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b<"+
		"\2\2\u0188x\3\2\2\2\u0189\u018b\7\61\2\2\u018a\u018c\13\2\2\2\u018b\u018a"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7,\2\2\u018e"+
		"\u018f\7\61\2\2\u018f\u0190\3\2\2\2\u0190\u0191\b=\2\2\u0191z\3\2\2\2"+
		"\u0192\u0193\7\61\2\2\u0193\u0194\7\61\2\2\u0194\u0198\3\2\2\2\u0195\u0197"+
		"\n\3\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\b>"+
		"\2\2\u019c|\3\2\2\2\u019d\u01a1\7$\2\2\u019e\u01a0\n\4\2\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7$\2\2\u01a5~\3\2\2\2\u01a6"+
		"\u01a8\7/\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2"+
		"\2\2\u01a9\u01ab\t\5\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b4\3\2\2\2\u01ae\u01b0\7\60"+
		"\2\2\u01af\u01b1\t\5\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01ae\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u0080\3\2\2\2\u01b6\u01b9\5\63\32\2\u01b7"+
		"\u01b9\5\65\33\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u0082\3"+
		"\2\2\2\u01ba\u01be\t\6\2\2\u01bb\u01bd\t\7\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u0084\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c5\t\b\2\2\u01c2\u01c4\t\7\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u0086\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01d8\5=\37\2\u01c9"+
		"\u01d5\5\u0089E\2\u01ca\u01ce\5M\'\2\u01cb\u01cd\5w<\2\u01cc\u01cb\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\5\u0089E\2\u01d2\u01d4"+
		"\3\2\2\2\u01d3\u01ca\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01c9\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5? \2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\bD\3\2\u01dd\u0088\3\2\2\2\u01de\u01e3\5\177@\2\u01df"+
		"\u01e3\5\u0081A\2\u01e0\u01e3\5}?\2\u01e1\u01e3\5-\27\2\u01e2\u01de\3"+
		"\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u008a\3\2\2\2\22\2\u0185\u018b\u0198\u01a1\u01a7\u01ac\u01b2\u01b4\u01b8"+
		"\u01be\u01c5\u01ce\u01d5\u01d8\u01e2\4\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}