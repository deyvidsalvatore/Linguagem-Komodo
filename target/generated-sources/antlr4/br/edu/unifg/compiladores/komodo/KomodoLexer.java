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
		NULL=22, NEW=23, THIS=24, TRUE=25, FALSE=26, CONCAT=27, VAR_DECLARATION=28, 
		GLOBAL_VAR_DECLARATION=29, OPENBRACE=30, CLOSEBRACE=31, OPENBRACK=32, 
		CLOSEBRACK=33, OPENPAREN=34, CLOSEPAREN=35, SEMICOLON=36, DOUBLEQUOTE=37, 
		DOUBLEDOT=38, DOT=39, COMMA=40, LESSTHAN=41, GREATERTHAN=42, LESSTHANEQUALS=43, 
		GREATERTHANEQUALS=44, EQUALS=45, NOTEQUALS=46, ADD=47, SUB=48, MUL=49, 
		DIV=50, MOD=51, ASSIGN=52, ADD_ASSIGN=53, SUB_ASSIGN=54, MUL_ASSIGN=55, 
		DIV_ASSIGN=56, AND=57, OR=58, NOT=59, ESC_SEQ=60, WS=61, BLOCK_COMMENT=62, 
		COMMENT_LINE=63, STRING_LITERAL=64, NUM=65, BOOL=66, VARIABLE_NAME=67, 
		ID=68, ARR=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "CONSTRUCTOR", "METHOD", "PACKAGE", "INTERFACE", "VAR", "STRING", 
		"NUMBER", "BOOLEAN", "ARRAY", "IF", "IMPORT", "ELSE", "ELIF", "WHILE", 
		"RETURN", "GLOBAL", "FUNCTION", "INPUT", "IMPLEMENTS", "PRINT", "NULL", 
		"NEW", "THIS", "TRUE", "FALSE", "CONCAT", "VAR_DECLARATION", "GLOBAL_VAR_DECLARATION", 
		"OPENBRACE", "CLOSEBRACE", "OPENBRACK", "CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", 
		"SEMICOLON", "DOUBLEQUOTE", "DOUBLEDOT", "DOT", "COMMA", "LESSTHAN", "GREATERTHAN", 
		"LESSTHANEQUALS", "GREATERTHANEQUALS", "EQUALS", "NOTEQUALS", "ADD", "SUB", 
		"MUL", "DIV", "MOD", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND", "OR", "NOT", "ESC_SEQ", "WS", "BLOCK_COMMENT", "COMMENT_LINE", 
		"STRING_LITERAL", "NUM", "BOOL", "VARIABLE_NAME", "ID", "ARR", "VALUE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u0203\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0145\n\35\3\35\3\35"+
		"\7\35\u0149\n\35\f\35\16\35\u014c\13\35\5\35\u014e\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0157\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3"+
		";\3;\3;\3<\3<\3=\3=\3=\3>\6>\u01a3\n>\r>\16>\u01a4\3>\3>\3?\3?\5?\u01ab"+
		"\n?\3?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u01b6\n@\f@\16@\u01b9\13@\3@\3@\3A\3"+
		"A\7A\u01bf\nA\fA\16A\u01c2\13A\3A\3A\3B\5B\u01c7\nB\3B\6B\u01ca\nB\rB"+
		"\16B\u01cb\3B\3B\6B\u01d0\nB\rB\16B\u01d1\5B\u01d4\nB\3C\3C\5C\u01d8\n"+
		"C\3D\3D\7D\u01dc\nD\fD\16D\u01df\13D\3E\3E\7E\u01e3\nE\fE\16E\u01e6\13"+
		"E\3F\3F\3F\3F\7F\u01ec\nF\fF\16F\u01ef\13F\3F\3F\7F\u01f3\nF\fF\16F\u01f6"+
		"\13F\5F\u01f8\nF\3F\3F\3F\3F\3G\3G\3G\3G\5G\u0202\nG\3\u01f4\2H\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d\2\3\2"+
		"\t\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2\f\f\17\17$$\3\2\62;\3\2c|\6\2"+
		"\62;C\\aac|\5\2C\\aac|\u021a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\3\u008f\3\2\2\2\5\u0095\3\2\2\2\7\u00a1\3\2\2\2\t\u00a8"+
		"\3\2\2\2\13\u00b0\3\2\2\2\r\u00ba\3\2\2\2\17\u00be\3\2\2\2\21\u00c5\3"+
		"\2\2\2\23\u00cc\3\2\2\2\25\u00d4\3\2\2\2\27\u00da\3\2\2\2\31\u00dd\3\2"+
		"\2\2\33\u00e4\3\2\2\2\35\u00e9\3\2\2\2\37\u00ee\3\2\2\2!\u00f4\3\2\2\2"+
		"#\u00fb\3\2\2\2%\u0102\3\2\2\2\'\u010b\3\2\2\2)\u0111\3\2\2\2+\u011c\3"+
		"\2\2\2-\u0122\3\2\2\2/\u0127\3\2\2\2\61\u012b\3\2\2\2\63\u0130\3\2\2\2"+
		"\65\u0135\3\2\2\2\67\u013b\3\2\2\29\u013d\3\2\2\2;\u014f\3\2\2\2=\u0158"+
		"\3\2\2\2?\u015a\3\2\2\2A\u015c\3\2\2\2C\u015e\3\2\2\2E\u0160\3\2\2\2G"+
		"\u0162\3\2\2\2I\u0164\3\2\2\2K\u0166\3\2\2\2M\u0168\3\2\2\2O\u016a\3\2"+
		"\2\2Q\u016c\3\2\2\2S\u016e\3\2\2\2U\u0170\3\2\2\2W\u0172\3\2\2\2Y\u0175"+
		"\3\2\2\2[\u0178\3\2\2\2]\u017b\3\2\2\2_\u017e\3\2\2\2a\u0180\3\2\2\2c"+
		"\u0182\3\2\2\2e\u0184\3\2\2\2g\u0186\3\2\2\2i\u0188\3\2\2\2k\u018a\3\2"+
		"\2\2m\u018d\3\2\2\2o\u0190\3\2\2\2q\u0193\3\2\2\2s\u0196\3\2\2\2u\u0199"+
		"\3\2\2\2w\u019c\3\2\2\2y\u019e\3\2\2\2{\u01a2\3\2\2\2}\u01a8\3\2\2\2\177"+
		"\u01b1\3\2\2\2\u0081\u01bc\3\2\2\2\u0083\u01c6\3\2\2\2\u0085\u01d7\3\2"+
		"\2\2\u0087\u01d9\3\2\2\2\u0089\u01e0\3\2\2\2\u008b\u01e7\3\2\2\2\u008d"+
		"\u0201\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2"+
		"\2\u0092\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094\4\3\2\2\2\u0095\u0096\7"+
		"e\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098\u0099\7u\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c\7w\2\2\u009c\u009d\7e\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0\6\3\2\2\2\u00a1"+
		"\u00a2\7o\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7j\2\2"+
		"\u00a5\u00a6\7q\2\2\u00a6\u00a7\7f\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\7r"+
		"\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7m\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\u00ae\7i\2\2\u00ae\u00af\7g\2\2\u00af\n\3\2\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\f\3\2\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc\7c"+
		"\2\2\u00bc\u00bd\7t\2\2\u00bd\16\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7i\2\2\u00c4\20\3\2\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7o\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\22\3\2\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7"+
		"q\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7p\2\2\u00d3\24\3\2\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7"+
		"\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7{\2\2\u00d9\26\3\2\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7h\2\2\u00dc\30\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7o\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\32\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6"+
		"\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8\34\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7h\2\2\u00ed\36\3\2\2\2\u00ee"+
		"\u00ef\7y\2\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7n\2\2"+
		"\u00f2\u00f3\7g\2\2\u00f3 \3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2"+
		"\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\"\3\2\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe"+
		"\7q\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101"+
		"$\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7w\2\2\u0104\u0105\7p\2\2\u0105"+
		"\u0106\7e\2\2\u0106\u0107\7v\2\2\u0107\u0108\7k\2\2\u0108\u0109\7q\2\2"+
		"\u0109\u010a\7p\2\2\u010a&\3\2\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2"+
		"\2\u010d\u010e\7r\2\2\u010e\u010f\7w\2\2\u010f\u0110\7v\2\2\u0110(\3\2"+
		"\2\2\u0111\u0112\7k\2\2\u0112\u0113\7o\2\2\u0113\u0114\7r\2\2\u0114\u0115"+
		"\7n\2\2\u0115\u0116\7g\2\2\u0116\u0117\7o\2\2\u0117\u0118\7g\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7v\2\2\u011a\u011b\7u\2\2\u011b*\3\2\2\2\u011c"+
		"\u011d\7r\2\2\u011d\u011e\7t\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2"+
		"\u0120\u0121\7v\2\2\u0121,\3\2\2\2\u0122\u0123\7p\2\2\u0123\u0124\7w\2"+
		"\2\u0124\u0125\7n\2\2\u0125\u0126\7n\2\2\u0126.\3\2\2\2\u0127\u0128\7"+
		"p\2\2\u0128\u0129\7g\2\2\u0129\u012a\7y\2\2\u012a\60\3\2\2\2\u012b\u012c"+
		"\7v\2\2\u012c\u012d\7j\2\2\u012d\u012e\7k\2\2\u012e\u012f\7u\2\2\u012f"+
		"\62\3\2\2\2\u0130\u0131\7v\2\2\u0131\u0132\7t\2\2\u0132\u0133\7w\2\2\u0133"+
		"\u0134\7g\2\2\u0134\64\3\2\2\2\u0135\u0136\7h\2\2\u0136\u0137\7c\2\2\u0137"+
		"\u0138\7n\2\2\u0138\u0139\7u\2\2\u0139\u013a\7g\2\2\u013a\66\3\2\2\2\u013b"+
		"\u013c\7-\2\2\u013c8\3\2\2\2\u013d\u013e\5\r\7\2\u013e\u013f\5\u0087D"+
		"\2\u013f\u0144\5M\'\2\u0140\u0145\5\17\b\2\u0141\u0145\5\21\t\2\u0142"+
		"\u0145\5\23\n\2\u0143\u0145\5\25\13\2\u0144\u0140\3\2\2\2\u0144\u0141"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u014d\3\2\2\2\u0146"+
		"\u014a\5i\65\2\u0147\u0149\13\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3"+
		"\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0146\3\2\2\2\u014d\u014e\3\2\2\2\u014e:\3\2\2\2"+
		"\u014f\u0150\5#\22\2\u0150\u0151\5\u0087D\2\u0151\u0156\5M\'\2\u0152\u0157"+
		"\5\17\b\2\u0153\u0157\5\21\t\2\u0154\u0157\5\23\n\2\u0155\u0157\5\25\13"+
		"\2\u0156\u0152\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155"+
		"\3\2\2\2\u0157<\3\2\2\2\u0158\u0159\7}\2\2\u0159>\3\2\2\2\u015a\u015b"+
		"\7\177\2\2\u015b@\3\2\2\2\u015c\u015d\7]\2\2\u015dB\3\2\2\2\u015e\u015f"+
		"\7_\2\2\u015fD\3\2\2\2\u0160\u0161\7*\2\2\u0161F\3\2\2\2\u0162\u0163\7"+
		"+\2\2\u0163H\3\2\2\2\u0164\u0165\7=\2\2\u0165J\3\2\2\2\u0166\u0167\7$"+
		"\2\2\u0167L\3\2\2\2\u0168\u0169\7<\2\2\u0169N\3\2\2\2\u016a\u016b\7\60"+
		"\2\2\u016bP\3\2\2\2\u016c\u016d\7.\2\2\u016dR\3\2\2\2\u016e\u016f\7>\2"+
		"\2\u016fT\3\2\2\2\u0170\u0171\7@\2\2\u0171V\3\2\2\2\u0172\u0173\7>\2\2"+
		"\u0173\u0174\7?\2\2\u0174X\3\2\2\2\u0175\u0176\7@\2\2\u0176\u0177\7?\2"+
		"\2\u0177Z\3\2\2\2\u0178\u0179\7?\2\2\u0179\u017a\7?\2\2\u017a\\\3\2\2"+
		"\2\u017b\u017c\7#\2\2\u017c\u017d\7?\2\2\u017d^\3\2\2\2\u017e\u017f\7"+
		"-\2\2\u017f`\3\2\2\2\u0180\u0181\7/\2\2\u0181b\3\2\2\2\u0182\u0183\7,"+
		"\2\2\u0183d\3\2\2\2\u0184\u0185\7\61\2\2\u0185f\3\2\2\2\u0186\u0187\7"+
		"\'\2\2\u0187h\3\2\2\2\u0188\u0189\7?\2\2\u0189j\3\2\2\2\u018a\u018b\7"+
		"-\2\2\u018b\u018c\7?\2\2\u018cl\3\2\2\2\u018d\u018e\7/\2\2\u018e\u018f"+
		"\7?\2\2\u018fn\3\2\2\2\u0190\u0191\7,\2\2\u0191\u0192\7?\2\2\u0192p\3"+
		"\2\2\2\u0193\u0194\7\61\2\2\u0194\u0195\7?\2\2\u0195r\3\2\2\2\u0196\u0197"+
		"\7(\2\2\u0197\u0198\7(\2\2\u0198t\3\2\2\2\u0199\u019a\7~\2\2\u019a\u019b"+
		"\7~\2\2\u019bv\3\2\2\2\u019c\u019d\7#\2\2\u019dx\3\2\2\2\u019e\u019f\7"+
		"^\2\2\u019f\u01a0\7)\2\2\u01a0z\3\2\2\2\u01a1\u01a3\t\2\2\2\u01a2\u01a1"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\b>\2\2\u01a7|\3\2\2\2\u01a8\u01aa\7\61\2\2"+
		"\u01a9\u01ab\13\2\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\b?\2\2\u01b0~\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2\u01b3\7\61\2\2"+
		"\u01b3\u01b7\3\2\2\2\u01b4\u01b6\n\3\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bb\b@\2\2\u01bb\u0080\3\2\2\2\u01bc\u01c0\7$\2"+
		"\2\u01bd\u01bf\n\4\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c4\7$\2\2\u01c4\u0082\3\2\2\2\u01c5\u01c7\7/\2\2\u01c6\u01c5\3\2\2"+
		"\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\t\5\2\2\u01c9\u01c8"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01d3\3\2\2\2\u01cd\u01cf\7\60\2\2\u01ce\u01d0\t\5\2\2\u01cf\u01ce\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u0084\3\2"+
		"\2\2\u01d5\u01d8\5\63\32\2\u01d6\u01d8\5\65\33\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8\u0086\3\2\2\2\u01d9\u01dd\t\6\2\2\u01da\u01dc\t\7"+
		"\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u0088\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e4\t\b"+
		"\2\2\u01e1\u01e3\t\7\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u008a\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01f7\5A!\2\u01e8\u01f4\5\u008dG\2\u01e9\u01ed\5Q)\2\u01ea"+
		"\u01ec\5{>\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2"+
		"\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1"+
		"\5\u008dG\2\u01f1\u01f3\3\2\2\2\u01f2\u01e9\3\2\2\2\u01f3\u01f6\3\2\2"+
		"\2\u01f4\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f7\u01e8\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\5C\"\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\bF\3\2\u01fc\u008c\3\2\2"+
		"\2\u01fd\u0202\5\u0083B\2\u01fe\u0202\5\u0085C\2\u01ff\u0202\5\u0081A"+
		"\2\u0200\u0202\5-\27\2\u0201\u01fd\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u008e\3\2\2\2\26\2\u0144\u014a\u014d"+
		"\u0156\u01a4\u01aa\u01b7\u01c0\u01c6\u01cb\u01d1\u01d3\u01d7\u01dd\u01e4"+
		"\u01ed\u01f4\u01f7\u0201\4\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}