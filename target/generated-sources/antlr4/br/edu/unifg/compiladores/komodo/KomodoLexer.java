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
		NULL=22, NEW=23, THIS=24, TRUE=25, FALSE=26, POW=27, OPENBRACE=28, CLOSEBRACE=29, 
		OPENBRACK=30, CLOSEBRACK=31, OPENPAREN=32, CLOSEPAREN=33, SEMICOLON=34, 
		DOUBLEQUOTE=35, DOUBLEDOT=36, DOT=37, COMMA=38, LESSTHAN=39, GREATERTHAN=40, 
		LESSTHANEQUALS=41, GREATERTHANEQUALS=42, EQUALS=43, NOTEQUALS=44, ADD=45, 
		SUB=46, MUL=47, DIV=48, MOD=49, ASSIGN=50, ADD_ASSIGN=51, SUB_ASSIGN=52, 
		MUL_ASSIGN=53, DIV_ASSIGN=54, AND=55, OR=56, NOT=57, ESC_SEQ=58, WS=59, 
		BLOCK_COMMENT=60, COMMENT_LINE=61, STRING_LITERAL=62, NUM=63, BOOL=64, 
		CLASS_NAME=65, VARIABLE_NAME=66, ID=67, ARR=68;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "CONSTRUCTOR", "METHOD", "PACKAGE", "INTERFACE", "VAR", "STRING", 
		"NUMBER", "BOOLEAN", "ARRAY", "IF", "IMPORT", "ELSE", "ELIF", "WHILE", 
		"RETURN", "GLOBAL", "FUNCTION", "INPUT", "IMPLEMENTS", "PRINT", "NULL", 
		"NEW", "THIS", "TRUE", "FALSE", "POW", "OPENBRACE", "CLOSEBRACE", "OPENBRACK", 
		"CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", "SEMICOLON", "DOUBLEQUOTE", "DOUBLEDOT", 
		"DOT", "COMMA", "LESSTHAN", "GREATERTHAN", "LESSTHANEQUALS", "GREATERTHANEQUALS", 
		"EQUALS", "NOTEQUALS", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND", "OR", "NOT", "ESC_SEQ", 
		"WS", "BLOCK_COMMENT", "COMMENT_LINE", "STRING_LITERAL", "NUM", "BOOL", 
		"CLASS_NAME", "VARIABLE_NAME", "ID", "ARR", "VALUE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2F\u01ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3"+
		";\3;\3<\6<\u0186\n<\r<\16<\u0187\3<\3<\3=\3=\5=\u018e\n=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\7>\u0199\n>\f>\16>\u019c\13>\3>\3>\3?\3?\7?\u01a2\n?\f?"+
		"\16?\u01a5\13?\3?\3?\3@\5@\u01aa\n@\3@\6@\u01ad\n@\r@\16@\u01ae\3@\3@"+
		"\6@\u01b3\n@\r@\16@\u01b4\5@\u01b7\n@\3A\3A\5A\u01bb\nA\3B\3B\7B\u01bf"+
		"\nB\fB\16B\u01c2\13B\3C\3C\7C\u01c6\nC\fC\16C\u01c9\13C\3D\3D\7D\u01cd"+
		"\nD\fD\16D\u01d0\13D\3E\3E\3E\3E\7E\u01d6\nE\fE\16E\u01d9\13E\3E\3E\7"+
		"E\u01dd\nE\fE\16E\u01e0\13E\5E\u01e2\nE\3E\3E\3E\3E\3F\3F\3F\3F\3F\5F"+
		"\u01ed\nF\3\u01de\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008b\2\3\2\13\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2\f\f\17\17$$\3\2"+
		"\62;\3\2C\\\5\2\62;C\\c|\3\2c|\5\2C\\aac|\6\2\62;C\\aac|\u01ff\2\3\3\2"+
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
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008d\3\2\2\2\5\u0093\3\2\2\2"+
		"\7\u009f\3\2\2\2\t\u00a6\3\2\2\2\13\u00ae\3\2\2\2\r\u00b8\3\2\2\2\17\u00bc"+
		"\3\2\2\2\21\u00c3\3\2\2\2\23\u00ca\3\2\2\2\25\u00d2\3\2\2\2\27\u00d8\3"+
		"\2\2\2\31\u00db\3\2\2\2\33\u00e2\3\2\2\2\35\u00e7\3\2\2\2\37\u00ec\3\2"+
		"\2\2!\u00f2\3\2\2\2#\u00f9\3\2\2\2%\u0100\3\2\2\2\'\u0109\3\2\2\2)\u010f"+
		"\3\2\2\2+\u011a\3\2\2\2-\u0120\3\2\2\2/\u0125\3\2\2\2\61\u0129\3\2\2\2"+
		"\63\u012e\3\2\2\2\65\u0133\3\2\2\2\67\u0139\3\2\2\29\u013b\3\2\2\2;\u013d"+
		"\3\2\2\2=\u013f\3\2\2\2?\u0141\3\2\2\2A\u0143\3\2\2\2C\u0145\3\2\2\2E"+
		"\u0147\3\2\2\2G\u0149\3\2\2\2I\u014b\3\2\2\2K\u014d\3\2\2\2M\u014f\3\2"+
		"\2\2O\u0151\3\2\2\2Q\u0153\3\2\2\2S\u0155\3\2\2\2U\u0158\3\2\2\2W\u015b"+
		"\3\2\2\2Y\u015e\3\2\2\2[\u0161\3\2\2\2]\u0163\3\2\2\2_\u0165\3\2\2\2a"+
		"\u0167\3\2\2\2c\u0169\3\2\2\2e\u016b\3\2\2\2g\u016d\3\2\2\2i\u0170\3\2"+
		"\2\2k\u0173\3\2\2\2m\u0176\3\2\2\2o\u0179\3\2\2\2q\u017c\3\2\2\2s\u017f"+
		"\3\2\2\2u\u0181\3\2\2\2w\u0185\3\2\2\2y\u018b\3\2\2\2{\u0194\3\2\2\2}"+
		"\u019f\3\2\2\2\177\u01a9\3\2\2\2\u0081\u01ba\3\2\2\2\u0083\u01bc\3\2\2"+
		"\2\u0085\u01c3\3\2\2\2\u0087\u01ca\3\2\2\2\u0089\u01d1\3\2\2\2\u008b\u01ec"+
		"\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7n\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0092\7u\2\2\u0092\4\3\2\2\2\u0093\u0094\7e\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\u0097\7u\2\2\u0097\u0098\7v\2\2"+
		"\u0098\u0099\7t\2\2\u0099\u009a\7w\2\2\u009a\u009b\7e\2\2\u009b\u009c"+
		"\7v\2\2\u009c\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e\6\3\2\2\2\u009f\u00a0"+
		"\7o\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7f\2\2\u00a5\b\3\2\2\2\u00a6\u00a7\7r\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7m\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7i\2\2\u00ac\u00ad\7g\2\2\u00ad\n\3\2\2\2\u00ae\u00af\7k"+
		"\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7e\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\f\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb\16\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7i\2\2"+
		"\u00c2\20\3\2\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7"+
		"o\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7t\2\2\u00c9\22"+
		"\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2"+
		"\u00d1\24\3\2\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7"+
		"t\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7{\2\2\u00d7\26\3\2\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7h\2\2\u00da\30\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7o\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\32\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6\34\3\2\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7h\2\2\u00eb\36\3\2\2\2\u00ec"+
		"\u00ed\7y\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7n\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7g\2"+
		"\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\"\3\2\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff"+
		"$\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7w\2\2\u0102\u0103\7p\2\2\u0103"+
		"\u0104\7e\2\2\u0104\u0105\7v\2\2\u0105\u0106\7k\2\2\u0106\u0107\7q\2\2"+
		"\u0107\u0108\7p\2\2\u0108&\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2"+
		"\2\u010b\u010c\7r\2\2\u010c\u010d\7w\2\2\u010d\u010e\7v\2\2\u010e(\3\2"+
		"\2\2\u010f\u0110\7k\2\2\u0110\u0111\7o\2\2\u0111\u0112\7r\2\2\u0112\u0113"+
		"\7n\2\2\u0113\u0114\7g\2\2\u0114\u0115\7o\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118\u0119\7u\2\2\u0119*\3\2\2\2\u011a"+
		"\u011b\7r\2\2\u011b\u011c\7t\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2"+
		"\u011e\u011f\7v\2\2\u011f,\3\2\2\2\u0120\u0121\7p\2\2\u0121\u0122\7w\2"+
		"\2\u0122\u0123\7n\2\2\u0123\u0124\7n\2\2\u0124.\3\2\2\2\u0125\u0126\7"+
		"p\2\2\u0126\u0127\7g\2\2\u0127\u0128\7y\2\2\u0128\60\3\2\2\2\u0129\u012a"+
		"\7v\2\2\u012a\u012b\7j\2\2\u012b\u012c\7k\2\2\u012c\u012d\7u\2\2\u012d"+
		"\62\3\2\2\2\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2\u0130\u0131\7w\2\2\u0131"+
		"\u0132\7g\2\2\u0132\64\3\2\2\2\u0133\u0134\7h\2\2\u0134\u0135\7c\2\2\u0135"+
		"\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137\u0138\7g\2\2\u0138\66\3\2\2\2\u0139"+
		"\u013a\7`\2\2\u013a8\3\2\2\2\u013b\u013c\7}\2\2\u013c:\3\2\2\2\u013d\u013e"+
		"\7\177\2\2\u013e<\3\2\2\2\u013f\u0140\7]\2\2\u0140>\3\2\2\2\u0141\u0142"+
		"\7_\2\2\u0142@\3\2\2\2\u0143\u0144\7*\2\2\u0144B\3\2\2\2\u0145\u0146\7"+
		"+\2\2\u0146D\3\2\2\2\u0147\u0148\7=\2\2\u0148F\3\2\2\2\u0149\u014a\7$"+
		"\2\2\u014aH\3\2\2\2\u014b\u014c\7<\2\2\u014cJ\3\2\2\2\u014d\u014e\7\60"+
		"\2\2\u014eL\3\2\2\2\u014f\u0150\7.\2\2\u0150N\3\2\2\2\u0151\u0152\7>\2"+
		"\2\u0152P\3\2\2\2\u0153\u0154\7@\2\2\u0154R\3\2\2\2\u0155\u0156\7>\2\2"+
		"\u0156\u0157\7?\2\2\u0157T\3\2\2\2\u0158\u0159\7@\2\2\u0159\u015a\7?\2"+
		"\2\u015aV\3\2\2\2\u015b\u015c\7?\2\2\u015c\u015d\7?\2\2\u015dX\3\2\2\2"+
		"\u015e\u015f\7#\2\2\u015f\u0160\7?\2\2\u0160Z\3\2\2\2\u0161\u0162\7-\2"+
		"\2\u0162\\\3\2\2\2\u0163\u0164\7/\2\2\u0164^\3\2\2\2\u0165\u0166\7,\2"+
		"\2\u0166`\3\2\2\2\u0167\u0168\7\61\2\2\u0168b\3\2\2\2\u0169\u016a\7\'"+
		"\2\2\u016ad\3\2\2\2\u016b\u016c\7?\2\2\u016cf\3\2\2\2\u016d\u016e\7-\2"+
		"\2\u016e\u016f\7?\2\2\u016fh\3\2\2\2\u0170\u0171\7/\2\2\u0171\u0172\7"+
		"?\2\2\u0172j\3\2\2\2\u0173\u0174\7,\2\2\u0174\u0175\7?\2\2\u0175l\3\2"+
		"\2\2\u0176\u0177\7\61\2\2\u0177\u0178\7?\2\2\u0178n\3\2\2\2\u0179\u017a"+
		"\7(\2\2\u017a\u017b\7(\2\2\u017bp\3\2\2\2\u017c\u017d\7~\2\2\u017d\u017e"+
		"\7~\2\2\u017er\3\2\2\2\u017f\u0180\7#\2\2\u0180t\3\2\2\2\u0181\u0182\7"+
		"^\2\2\u0182\u0183\7)\2\2\u0183v\3\2\2\2\u0184\u0186\t\2\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\b<\2\2\u018ax\3\2\2\2\u018b\u018d\7\61\2\2"+
		"\u018c\u018e\13\2\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0190\7,\2\2\u0190\u0191\7\61\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\b=\2\2\u0193z\3\2\2\2\u0194\u0195\7\61\2\2\u0195\u0196\7\61\2\2"+
		"\u0196\u019a\3\2\2\2\u0197\u0199\n\3\2\2\u0198\u0197\3\2\2\2\u0199\u019c"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\b>\2\2\u019e|\3\2\2\2\u019f\u01a3\7$\2\2\u01a0"+
		"\u01a2\n\4\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a7\7$\2\2\u01a7~\3\2\2\2\u01a8\u01aa\7/\2\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\t\5\2\2\u01ac\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b6\3\2\2\2\u01b0\u01b2\7\60\2\2\u01b1\u01b3\t\5\2\2\u01b2\u01b1\3"+
		"\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u0080\3\2"+
		"\2\2\u01b8\u01bb\5\63\32\2\u01b9\u01bb\5\65\33\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\u0082\3\2\2\2\u01bc\u01c0\t\6\2\2\u01bd\u01bf\t\7"+
		"\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u0084\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c7\t\b"+
		"\2\2\u01c4\u01c6\t\7\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u0086\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01ce\t\t\2\2\u01cb\u01cd\t\n\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u0088\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01e1\5=\37\2\u01d2\u01de\5\u008bF\2\u01d3"+
		"\u01d7\5M\'\2\u01d4\u01d6\5w<\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2"+
		"\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01da\u01db\5\u008bF\2\u01db\u01dd\3\2\2\2\u01dc\u01d3\3\2\2"+
		"\2\u01dd\u01e0\3\2\2\2\u01de\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e2"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01d2\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e4\5? \2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\bE\3"+
		"\2\u01e6\u008a\3\2\2\2\u01e7\u01ed\5\177@\2\u01e8\u01ed\5\u0081A\2\u01e9"+
		"\u01ed\5}?\2\u01ea\u01ed\5-\27\2\u01eb\u01ed\5\u0089E\2\u01ec\u01e7\3"+
		"\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ed\u008c\3\2\2\2\23\2\u0187\u018d\u019a\u01a3\u01a9"+
		"\u01ae\u01b4\u01b6\u01ba\u01c0\u01c7\u01ce\u01d7\u01de\u01e1\u01ec\4\b"+
		"\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}