package gen;// Generated from C:/Users/pedro/IdeaProjects/Scanner/src/main/java\MeuScanner.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeuScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, EXTENDS=2, INT=3, PROTECTED=4, THIS=5, BOOLEAN=6, FALSE=7, 
		NEW=8, PUBLIC=9, TRUE=10, CHAR=11, IMPORT=12, NULL=13, RETURN=14, VOID=15, 
		CLASS=16, IF=17, PACKAGE=18, STATIC=19, WHILE=20, ELSE=21, INSTANCEOF=22, 
		PRIVATE=23, SUPER=24, INT_LITERAL=25, CHAR_LITERAL=26, STRING_LITERAL=27, 
		LPAREN=28, RPAREN=29, LBRACE=30, RBRACE=31, LBRACK=32, RBRACK=33, SEMI=34, 
		COMMA=35, DOT=36, ASSIGN=37, GT=38, LT=39, ADD_ASSIGN=40, EQUAL=41, LE=42, 
		GE=43, NOTEQUAL=44, AND=45, OR=46, INC=47, DEC=48, ADD=49, SUB=50, MUL=51, 
		WS=52, LINE_COMMENT=53, ID=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABSTRACT", "EXTENDS", "INT", "PROTECTED", "THIS", "BOOLEAN", "FALSE", 
			"NEW", "PUBLIC", "TRUE", "CHAR", "IMPORT", "NULL", "RETURN", "VOID", 
			"CLASS", "IF", "PACKAGE", "STATIC", "WHILE", "ELSE", "INSTANCEOF", "PRIVATE", 
			"SUPER", "INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "ADD_ASSIGN", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
			"INC", "DEC", "ADD", "SUB", "MUL", "WS", "LINE_COMMENT", "ID", "EscapeSequence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'extends'", "'int'", "'protected'", "'this'", "'boolean'", 
			"'false'", "'new'", "'public'", "'true'", "'char'", "'import'", "'null'", 
			"'return'", "'void'", "'class'", "'if'", "'package'", "'static'", "'while'", 
			"'else'", "'instanceof'", "'private'", "'super'", null, null, null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'+='", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "EXTENDS", "INT", "PROTECTED", "THIS", "BOOLEAN", "FALSE", 
			"NEW", "PUBLIC", "TRUE", "CHAR", "IMPORT", "NULL", "RETURN", "VOID", 
			"CLASS", "IF", "PACKAGE", "STATIC", "WHILE", "ELSE", "INSTANCEOF", "PRIVATE", 
			"SUPER", "INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "ADD_ASSIGN", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
			"INC", "DEC", "ADD", "SUB", "MUL", "WS", "LINE_COMMENT", "ID"
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


	public MeuScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MeuScanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0110"+
		"\n\32\f\32\16\32\u0113\13\32\5\32\u0115\n\32\3\33\3\33\3\33\5\33\u011a"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u0121\n\34\f\34\16\34\u0124\13\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\6\65\u0162\n\65\r\65\16\65\u0163\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\7\66\u016c\n\66\f\66\16\66\u016f\13\66\3\66\3\66\3\67\3\67"+
		"\7\67\u0175\n\67\f\67\16\67\u0178\13\67\38\38\38\2\29\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2\3\2\n\3\2\63;"+
		"\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\6\2&&C\\aac|\7\2&&\62;C\\aac|\n\2$$))^^ddhhppttvv\2\u0182\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3q\3\2\2\2"+
		"\5z\3\2\2\2\7\u0082\3\2\2\2\t\u0086\3\2\2\2\13\u0090\3\2\2\2\r\u0095\3"+
		"\2\2\2\17\u009d\3\2\2\2\21\u00a3\3\2\2\2\23\u00a7\3\2\2\2\25\u00ae\3\2"+
		"\2\2\27\u00b3\3\2\2\2\31\u00b8\3\2\2\2\33\u00bf\3\2\2\2\35\u00c4\3\2\2"+
		"\2\37\u00cb\3\2\2\2!\u00d0\3\2\2\2#\u00d6\3\2\2\2%\u00d9\3\2\2\2\'\u00e1"+
		"\3\2\2\2)\u00e8\3\2\2\2+\u00ee\3\2\2\2-\u00f3\3\2\2\2/\u00fe\3\2\2\2\61"+
		"\u0106\3\2\2\2\63\u0114\3\2\2\2\65\u0116\3\2\2\2\67\u011d\3\2\2\29\u0127"+
		"\3\2\2\2;\u0129\3\2\2\2=\u012b\3\2\2\2?\u012d\3\2\2\2A\u012f\3\2\2\2C"+
		"\u0131\3\2\2\2E\u0133\3\2\2\2G\u0135\3\2\2\2I\u0137\3\2\2\2K\u0139\3\2"+
		"\2\2M\u013b\3\2\2\2O\u013d\3\2\2\2Q\u013f\3\2\2\2S\u0142\3\2\2\2U\u0145"+
		"\3\2\2\2W\u0148\3\2\2\2Y\u014b\3\2\2\2[\u014e\3\2\2\2]\u0151\3\2\2\2_"+
		"\u0154\3\2\2\2a\u0157\3\2\2\2c\u015a\3\2\2\2e\u015c\3\2\2\2g\u015e\3\2"+
		"\2\2i\u0161\3\2\2\2k\u0167\3\2\2\2m\u0172\3\2\2\2o\u0179\3\2\2\2qr\7c"+
		"\2\2rs\7d\2\2st\7u\2\2tu\7v\2\2uv\7t\2\2vw\7c\2\2wx\7e\2\2xy\7v\2\2y\4"+
		"\3\2\2\2z{\7g\2\2{|\7z\2\2|}\7v\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7f"+
		"\2\2\u0080\u0081\7u\2\2\u0081\6\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7v\2\2\u0085\b\3\2\2\2\u0086\u0087\7r\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7q\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7e\2\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e\u008f\7f\2\2"+
		"\u008f\n\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092\u0093\7k"+
		"\2\2\u0093\u0094\7u\2\2\u0094\f\3\2\2\2\u0095\u0096\7d\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7q\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7p\2\2\u009c\16\3\2\2\2\u009d\u009e\7h\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\20\3\2\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7"+
		"y\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa"+
		"\7d\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7e\2\2\u00ad"+
		"\24\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7j\2\2\u00b5"+
		"\u00b6\7c\2\2\u00b6\u00b7\7t\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7o\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2"+
		"\u00bd\u00be\7v\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7"+
		"w\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7n\2\2\u00c3\34\3\2\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u00ca\7p\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7x\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7f\2\2\u00cf \3\2\2\2\u00d0"+
		"\u00d1\7e\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\u00d5\7u\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h"+
		"\2\2\u00d8$\3\2\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7e\2\2\u00dc\u00dd\7m\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7i\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0&\3\2\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7e\2\2"+
		"\u00e7(\3\2\2\2\u00e8\u00e9\7y\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7k\2"+
		"\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7"+
		"g\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2\u00f2,"+
		"\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7u\2\2\u00f6"+
		"\u00f7\7v\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7e\2\2"+
		"\u00fa\u00fb\7g\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7h\2\2\u00fd.\3\2\2"+
		"\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2\u0101\u0102"+
		"\7x\2\2\u0102\u0103\7c\2\2\u0103\u0104\7v\2\2\u0104\u0105\7g\2\2\u0105"+
		"\60\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7w\2\2\u0108\u0109\7r\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u010b\7t\2\2\u010b\62\3\2\2\2\u010c\u0115\7\62\2\2"+
		"\u010d\u0111\t\2\2\2\u010e\u0110\t\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u010d\3\2\2\2\u0115\64\3\2\2"+
		"\2\u0116\u0119\7)\2\2\u0117\u011a\n\3\2\2\u0118\u011a\5o8\2\u0119\u0117"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7)\2\2\u011c"+
		"\66\3\2\2\2\u011d\u0122\7$\2\2\u011e\u0121\n\4\2\2\u011f\u0121\5o8\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0126\7$\2\2\u01268\3\2\2\2\u0127\u0128\7*\2\2\u0128:\3\2\2\2\u0129\u012a"+
		"\7+\2\2\u012a<\3\2\2\2\u012b\u012c\7}\2\2\u012c>\3\2\2\2\u012d\u012e\7"+
		"\177\2\2\u012e@\3\2\2\2\u012f\u0130\7]\2\2\u0130B\3\2\2\2\u0131\u0132"+
		"\7_\2\2\u0132D\3\2\2\2\u0133\u0134\7=\2\2\u0134F\3\2\2\2\u0135\u0136\7"+
		".\2\2\u0136H\3\2\2\2\u0137\u0138\7\60\2\2\u0138J\3\2\2\2\u0139\u013a\7"+
		"?\2\2\u013aL\3\2\2\2\u013b\u013c\7@\2\2\u013cN\3\2\2\2\u013d\u013e\7>"+
		"\2\2\u013eP\3\2\2\2\u013f\u0140\7-\2\2\u0140\u0141\7?\2\2\u0141R\3\2\2"+
		"\2\u0142\u0143\7?\2\2\u0143\u0144\7?\2\2\u0144T\3\2\2\2\u0145\u0146\7"+
		">\2\2\u0146\u0147\7?\2\2\u0147V\3\2\2\2\u0148\u0149\7@\2\2\u0149\u014a"+
		"\7?\2\2\u014aX\3\2\2\2\u014b\u014c\7#\2\2\u014c\u014d\7?\2\2\u014dZ\3"+
		"\2\2\2\u014e\u014f\7(\2\2\u014f\u0150\7(\2\2\u0150\\\3\2\2\2\u0151\u0152"+
		"\7~\2\2\u0152\u0153\7~\2\2\u0153^\3\2\2\2\u0154\u0155\7-\2\2\u0155\u0156"+
		"\7-\2\2\u0156`\3\2\2\2\u0157\u0158\7/\2\2\u0158\u0159\7/\2\2\u0159b\3"+
		"\2\2\2\u015a\u015b\7-\2\2\u015bd\3\2\2\2\u015c\u015d\7/\2\2\u015df\3\2"+
		"\2\2\u015e\u015f\7,\2\2\u015fh\3\2\2\2\u0160\u0162\t\5\2\2\u0161\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\b\65\2\2\u0166j\3\2\2\2\u0167\u0168\7\61\2"+
		"\2\u0168\u0169\7\61\2\2\u0169\u016d\3\2\2\2\u016a\u016c\n\6\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\b\66\2\2\u0171"+
		"l\3\2\2\2\u0172\u0176\t\7\2\2\u0173\u0175\t\b\2\2\u0174\u0173\3\2\2\2"+
		"\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177n\3"+
		"\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7^\2\2\u017a\u017b\t\t\2\2\u017b"+
		"p\3\2\2\2\13\2\u0111\u0114\u0119\u0120\u0122\u0163\u016d\u0176\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}