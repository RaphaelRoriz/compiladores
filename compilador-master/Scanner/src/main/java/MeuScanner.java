// Generated from /home/raphael/Área de Trabalho/compilador-master/Scanner/src/main/java/MeuScanner.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeuScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, PACKAGE=2, IMPORT=3, DOT=4, STAR=5, CLASS=6, IMPLEMENTS=7, PUBLIC=8, 
		PROTECTED=9, PRIVATE=10, ABSTRACT=11, STATIC=12, FINAL=13, STRICTFP=14, 
		COLON=15, COMMA=16, LBRACE=17, RBRACE=18, LBRACKET=19, RBRACKET=20, LPAREN=21, 
		RPAREN=22, VOID=23, EQ=24, BOOLEAN=25, CHAR=26, INT=27, EXTENDS=28, THIS=29, 
		SUPER=30, NULL=31, TRUE=32, FALSE=33, IF=34, ELSE=35, WHILE=36, RETURN=37, 
		PLUSPLUS=38, SUBSUB=39, BANG=40, NEW=41, PLUS=42, SUB=43, EQEQ=44, AMPAMP=45, 
		PLUSEQ=46, GT=47, LT=48, INSTANCEOF=49, CONST=50, IntegerLiteral=51, CharacterLiteral=52, 
		StringLiteral=53, Identifier=54, WhiteSpace=55, LineTerminator=56, SlashComment=57, 
		EndOfLineComment=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMI", "PACKAGE", "IMPORT", "DOT", "STAR", "CLASS", "IMPLEMENTS", "PUBLIC", 
			"PROTECTED", "PRIVATE", "ABSTRACT", "STATIC", "FINAL", "STRICTFP", "COLON", 
			"COMMA", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", 
			"VOID", "EQ", "BOOLEAN", "CHAR", "INT", "EXTENDS", "THIS", "SUPER", "NULL", 
			"TRUE", "FALSE", "IF", "ELSE", "WHILE", "RETURN", "PLUSPLUS", "SUBSUB", 
			"BANG", "NEW", "PLUS", "SUB", "EQEQ", "AMPAMP", "PLUSEQ", "GT", "LT", 
			"INSTANCEOF", "CONST", "JavaLetterOrDigit", "SingleCharacter", "IdentifierChars", 
			"JavaLetter", "JavaDigit", "EscapeSequence", "StringCharacters", "StringCharacter", 
			"IntegerLiteral", "CharacterLiteral", "StringLiteral", "Identifier", 
			"WhiteSpace", "LineTerminator", "SlashComment", "EndOfLineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'package'", "'import'", "'.'", "'*'", "'class'", "'implements'", 
			"'public'", "'protected'", "'private'", "'abstract'", "'static'", "'final'", 
			"'strictfp'", "':'", "','", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"'void'", "'='", "'boolean'", "'char'", "'int'", "'extends'", "'this'", 
			"'super'", "'null'", "'true'", "'false'", "'if'", "'else'", "'while'", 
			"'return'", "'++'", "'--'", "'!'", "'new'", "'+'", "'-'", "'=='", "'&&'", 
			"'+='", "'>'", "'<'", "'instanceof'", "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "PACKAGE", "IMPORT", "DOT", "STAR", "CLASS", "IMPLEMENTS", 
			"PUBLIC", "PROTECTED", "PRIVATE", "ABSTRACT", "STATIC", "FINAL", "STRICTFP", 
			"COLON", "COMMA", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "VOID", "EQ", "BOOLEAN", "CHAR", "INT", "EXTENDS", "THIS", 
			"SUPER", "NULL", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "RETURN", "PLUSPLUS", 
			"SUBSUB", "BANG", "NEW", "PLUS", "SUB", "EQEQ", "AMPAMP", "PLUSEQ", "GT", 
			"LT", "INSTANCEOF", "CONST", "IntegerLiteral", "CharacterLiteral", "StringLiteral", 
			"Identifier", "WhiteSpace", "LineTerminator", "SlashComment", "EndOfLineComment"
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


	public static final int WHITESPACE = 1;
	public static final int COMMENTS = 2;


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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01ef\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u0176"+
		"\n\64\3\65\3\65\3\66\3\66\7\66\u017c\n\66\f\66\16\66\u017f\13\66\3\67"+
		"\3\67\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0195\n"+
		"9\3:\6:\u0198\n:\r:\16:\u0199\3;\3;\5;\u019e\n;\3<\3<\3<\7<\u01a3\n<\f"+
		"<\16<\u01a6\13<\5<\u01a8\n<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u01b2\n=\3>\3>"+
		"\7>\u01b6\n>\f>\16>\u01b9\13>\3>\3>\3?\3?\3@\3@\5@\u01c1\n@\3@\3@\3A\3"+
		"A\3A\5A\u01c8\nA\3A\3A\3B\3B\3B\3B\7B\u01d0\nB\fB\16B\u01d3\13B\3B\3B"+
		"\3B\3B\7B\u01d9\nB\fB\16B\u01dc\13B\3B\3B\3C\3C\3C\3C\7C\u01e4\nC\fC\16"+
		"C\u01e7\13C\3C\6C\u01ea\nC\rC\16C\u01eb\3C\3C\5\u01b7\u01d1\u01e5\2D\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2o\2q"+
		"\2s\2u\2w\65y\66{\67}8\1779\u0081:\u0083;\u0085<\3\2\7\4\2))^^\6\2&&C"+
		"\\aac|\4\2$$^^\5\2\13\13\16\16\"\"\4\2\f\f\17\17\2\u01fb\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089"+
		"\3\2\2\2\7\u0091\3\2\2\2\t\u0098\3\2\2\2\13\u009a\3\2\2\2\r\u009c\3\2"+
		"\2\2\17\u00a2\3\2\2\2\21\u00ad\3\2\2\2\23\u00b4\3\2\2\2\25\u00be\3\2\2"+
		"\2\27\u00c6\3\2\2\2\31\u00cf\3\2\2\2\33\u00d6\3\2\2\2\35\u00dc\3\2\2\2"+
		"\37\u00e5\3\2\2\2!\u00e7\3\2\2\2#\u00e9\3\2\2\2%\u00eb\3\2\2\2\'\u00ed"+
		"\3\2\2\2)\u00ef\3\2\2\2+\u00f1\3\2\2\2-\u00f3\3\2\2\2/\u00f5\3\2\2\2\61"+
		"\u00fa\3\2\2\2\63\u00fc\3\2\2\2\65\u0104\3\2\2\2\67\u0109\3\2\2\29\u010d"+
		"\3\2\2\2;\u0115\3\2\2\2=\u011a\3\2\2\2?\u0120\3\2\2\2A\u0125\3\2\2\2C"+
		"\u012a\3\2\2\2E\u0130\3\2\2\2G\u0133\3\2\2\2I\u0138\3\2\2\2K\u013e\3\2"+
		"\2\2M\u0145\3\2\2\2O\u0148\3\2\2\2Q\u014b\3\2\2\2S\u014d\3\2\2\2U\u0151"+
		"\3\2\2\2W\u0153\3\2\2\2Y\u0155\3\2\2\2[\u0158\3\2\2\2]\u015b\3\2\2\2_"+
		"\u015e\3\2\2\2a\u0160\3\2\2\2c\u0162\3\2\2\2e\u016d\3\2\2\2g\u0175\3\2"+
		"\2\2i\u0177\3\2\2\2k\u0179\3\2\2\2m\u0180\3\2\2\2o\u0182\3\2\2\2q\u0194"+
		"\3\2\2\2s\u0197\3\2\2\2u\u019d\3\2\2\2w\u01a7\3\2\2\2y\u01b1\3\2\2\2{"+
		"\u01b3\3\2\2\2}\u01bc\3\2\2\2\177\u01c0\3\2\2\2\u0081\u01c7\3\2\2\2\u0083"+
		"\u01cb\3\2\2\2\u0085\u01df\3\2\2\2\u0087\u0088\7=\2\2\u0088\4\3\2\2\2"+
		"\u0089\u008a\7r\2\2\u008a\u008b\7c\2\2\u008b\u008c\7e\2\2\u008c\u008d"+
		"\7m\2\2\u008d\u008e\7c\2\2\u008e\u008f\7i\2\2\u008f\u0090\7g\2\2\u0090"+
		"\6\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7o\2\2\u0093\u0094\7r\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\u0097\7v\2\2\u0097\b\3\2\2\2\u0098"+
		"\u0099\7\60\2\2\u0099\n\3\2\2\2\u009a\u009b\7,\2\2\u009b\f\3\2\2\2\u009c"+
		"\u009d\7e\2\2\u009d\u009e\7n\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7u\2\2"+
		"\u00a0\u00a1\7u\2\2\u00a1\16\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7"+
		"o\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7o\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7w\2\2\u00af"+
		"\u00b0\7d\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7e\2\2"+
		"\u00b3\22\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7"+
		"q\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7f\2\2\u00bd\24\3\2\2\2\u00be\u00bf"+
		"\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7x\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\26\3\2\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\u00cb\7t\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce"+
		"\7v\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7e\2\2\u00d5"+
		"\32\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db\34\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2"+
		"\u00e1\u00e2\7v\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7r\2\2\u00e4\36\3\2"+
		"\2\2\u00e5\u00e6\7<\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7.\2\2\u00e8\"\3\2"+
		"\2\2\u00e9\u00ea\7}\2\2\u00ea$\3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec&\3"+
		"\2\2\2\u00ed\u00ee\7]\2\2\u00ee(\3\2\2\2\u00ef\u00f0\7_\2\2\u00f0*\3\2"+
		"\2\2\u00f1\u00f2\7*\2\2\u00f2,\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4.\3\2\2"+
		"\2\u00f5\u00f6\7x\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9"+
		"\7f\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb\62\3\2\2\2\u00fc\u00fd"+
		"\7d\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7n\2\2\u0100"+
		"\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102\u0103\7p\2\2\u0103\64\3\2\2\2\u0104"+
		"\u0105\7e\2\2\u0105\u0106\7j\2\2\u0106\u0107\7c\2\2\u0107\u0108\7t\2\2"+
		"\u0108\66\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7"+
		"v\2\2\u010c8\3\2\2\2\u010d\u010e\7g\2\2\u010e\u010f\7z\2\2\u010f\u0110"+
		"\7v\2\2\u0110\u0111\7g\2\2\u0111\u0112\7p\2\2\u0112\u0113\7f\2\2\u0113"+
		"\u0114\7u\2\2\u0114:\3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117\7j\2\2\u0117"+
		"\u0118\7k\2\2\u0118\u0119\7u\2\2\u0119<\3\2\2\2\u011a\u011b\7u\2\2\u011b"+
		"\u011c\7w\2\2\u011c\u011d\7r\2\2\u011d\u011e\7g\2\2\u011e\u011f\7t\2\2"+
		"\u011f>\3\2\2\2\u0120\u0121\7p\2\2\u0121\u0122\7w\2\2\u0122\u0123\7n\2"+
		"\2\u0123\u0124\7n\2\2\u0124@\3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7"+
		"t\2\2\u0127\u0128\7w\2\2\u0128\u0129\7g\2\2\u0129B\3\2\2\2\u012a\u012b"+
		"\7h\2\2\u012b\u012c\7c\2\2\u012c\u012d\7n\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7g\2\2\u012fD\3\2\2\2\u0130\u0131\7k\2\2\u0131\u0132\7h\2\2\u0132"+
		"F\3\2\2\2\u0133\u0134\7g\2\2\u0134\u0135\7n\2\2\u0135\u0136\7u\2\2\u0136"+
		"\u0137\7g\2\2\u0137H\3\2\2\2\u0138\u0139\7y\2\2\u0139\u013a\7j\2\2\u013a"+
		"\u013b\7k\2\2\u013b\u013c\7n\2\2\u013c\u013d\7g\2\2\u013dJ\3\2\2\2\u013e"+
		"\u013f\7t\2\2\u013f\u0140\7g\2\2\u0140\u0141\7v\2\2\u0141\u0142\7w\2\2"+
		"\u0142\u0143\7t\2\2\u0143\u0144\7p\2\2\u0144L\3\2\2\2\u0145\u0146\7-\2"+
		"\2\u0146\u0147\7-\2\2\u0147N\3\2\2\2\u0148\u0149\7/\2\2\u0149\u014a\7"+
		"/\2\2\u014aP\3\2\2\2\u014b\u014c\7#\2\2\u014cR\3\2\2\2\u014d\u014e\7p"+
		"\2\2\u014e\u014f\7g\2\2\u014f\u0150\7y\2\2\u0150T\3\2\2\2\u0151\u0152"+
		"\7-\2\2\u0152V\3\2\2\2\u0153\u0154\7/\2\2\u0154X\3\2\2\2\u0155\u0156\7"+
		"?\2\2\u0156\u0157\7?\2\2\u0157Z\3\2\2\2\u0158\u0159\7(\2\2\u0159\u015a"+
		"\7(\2\2\u015a\\\3\2\2\2\u015b\u015c\7-\2\2\u015c\u015d\7?\2\2\u015d^\3"+
		"\2\2\2\u015e\u015f\7@\2\2\u015f`\3\2\2\2\u0160\u0161\7>\2\2\u0161b\3\2"+
		"\2\2\u0162\u0163\7k\2\2\u0163\u0164\7p\2\2\u0164\u0165\7u\2\2\u0165\u0166"+
		"\7v\2\2\u0166\u0167\7c\2\2\u0167\u0168\7p\2\2\u0168\u0169\7e\2\2\u0169"+
		"\u016a\7g\2\2\u016a\u016b\7q\2\2\u016b\u016c\7h\2\2\u016cd\3\2\2\2\u016d"+
		"\u016e\7e\2\2\u016e\u016f\7q\2\2\u016f\u0170\7p\2\2\u0170\u0171\7u\2\2"+
		"\u0171\u0172\7v\2\2\u0172f\3\2\2\2\u0173\u0176\5m\67\2\u0174\u0176\5o"+
		"8\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176h\3\2\2\2\u0177\u0178"+
		"\n\2\2\2\u0178j\3\2\2\2\u0179\u017d\5m\67\2\u017a\u017c\5g\64\2\u017b"+
		"\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017el\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\t\3\2\2\u0181n\3\2"+
		"\2\2\u0182\u0183\4\62;\2\u0183p\3\2\2\2\u0184\u0185\7^\2\2\u0185\u0195"+
		"\7d\2\2\u0186\u0187\7^\2\2\u0187\u0195\7v\2\2\u0188\u0189\7^\2\2\u0189"+
		"\u0195\7p\2\2\u018a\u018b\7^\2\2\u018b\u0195\7h\2\2\u018c\u018d\7^\2\2"+
		"\u018d\u0195\7t\2\2\u018e\u018f\7^\2\2\u018f\u0195\7$\2\2\u0190\u0191"+
		"\7^\2\2\u0191\u0195\7)\2\2\u0192\u0193\7^\2\2\u0193\u0195\7^\2\2\u0194"+
		"\u0184\3\2\2\2\u0194\u0186\3\2\2\2\u0194\u0188\3\2\2\2\u0194\u018a\3\2"+
		"\2\2\u0194\u018c\3\2\2\2\u0194\u018e\3\2\2\2\u0194\u0190\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195r\3\2\2\2\u0196\u0198\5u;\2\u0197\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019at\3\2\2\2"+
		"\u019b\u019e\5q9\2\u019c\u019e\n\4\2\2\u019d\u019b\3\2\2\2\u019d\u019c"+
		"\3\2\2\2\u019ev\3\2\2\2\u019f\u01a8\7\62\2\2\u01a0\u01a4\4\63;\2\u01a1"+
		"\u01a3\4\62;\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u019f\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a8x\3\2\2\2\u01a9\u01aa\7)\2\2\u01aa"+
		"\u01ab\5i\65\2\u01ab\u01ac\7)\2\2\u01ac\u01b2\3\2\2\2\u01ad\u01ae\7)\2"+
		"\2\u01ae\u01af\5q9\2\u01af\u01b0\7)\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01a9"+
		"\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2z\3\2\2\2\u01b3\u01b7\7$\2\2\u01b4\u01b6"+
		"\5u;\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7$"+
		"\2\2\u01bb|\3\2\2\2\u01bc\u01bd\5k\66\2\u01bd~\3\2\2\2\u01be\u01c1\t\5"+
		"\2\2\u01bf\u01c1\5\u0081A\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\b@\2\2\u01c3\u0080\3\2\2\2\u01c4\u01c5\7\17"+
		"\2\2\u01c5\u01c8\7\f\2\2\u01c6\u01c8\t\6\2\2\u01c7\u01c4\3\2\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\bA\2\2\u01ca\u0082\3\2"+
		"\2\2\u01cb\u01cc\7\61\2\2\u01cc\u01cd\7,\2\2\u01cd\u01d1\3\2\2\2\u01ce"+
		"\u01d0\13\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01d5\7,\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d9\5\u0081"+
		"A\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\bB"+
		"\2\2\u01de\u0084\3\2\2\2\u01df\u01e0\7\61\2\2\u01e0\u01e1\7\61\2\2\u01e1"+
		"\u01e5\3\2\2\2\u01e2\u01e4\13\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3"+
		"\2\2\2\u01e5\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01ea\5\u0081A\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\bC\2\2\u01ee\u0086\3\2\2\2\22\2\u0175\u017d\u0194\u0199\u019d\u01a4"+
		"\u01a7\u01b1\u01b7\u01c0\u01c7\u01d1\u01da\u01e5\u01eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}