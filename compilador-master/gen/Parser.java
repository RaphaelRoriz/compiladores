// Generated from /home/raphael/Área de Trabalho/compilador-master/Scanner/src/main/java/Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifiers = 4, RULE_modifier = 5, RULE_classDeclaration = 6, 
		RULE_typeList = 7, RULE_classBody = 8, RULE_classBodyDeclaration = 9, 
		RULE_variableDeclarator = 10, RULE_type = 11, RULE_primitiveType = 12, 
		RULE_qualifiedIdentifierList = 13, RULE_formalParameters = 14, RULE_formalParameter = 15, 
		RULE_qualifiedIdentifier = 16, RULE_block = 17, RULE_blockStatement = 18, 
		RULE_localVariableDeclarationStatement = 19, RULE_localVariableDeclaration = 20, 
		RULE_statement = 21, RULE_emptyStatement = 22, RULE_parExpression = 23, 
		RULE_expressionList = 24, RULE_expression = 25, RULE_assignmentOperator = 26, 
		RULE_conditionalAndExpression = 27, RULE_equalityExpression = 28, RULE_relationalExpression = 29, 
		RULE_instanceOfExpression = 30, RULE_relationalOp = 31, RULE_additiveExpression = 32, 
		RULE_additiveOp = 33, RULE_multiplicativeExpression = 34, RULE_multiplicativeOp = 35, 
		RULE_unaryExpression = 36, RULE_postfixExpression = 37, RULE_simpleUnaryExpression = 38, 
		RULE_primary = 39, RULE_superSuffix = 40, RULE_selector = 41, RULE_creator = 42, 
		RULE_arrayCreator = 43, RULE_variableInitializer = 44, RULE_arrayInitializer = 45, 
		RULE_arguments = 46, RULE_literal = 47, RULE_referenceType = 48, RULE_typeName = 49, 
		RULE_arrayType = 50, RULE_dims = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifiers", "modifier", "classDeclaration", "typeList", "classBody", 
			"classBodyDeclaration", "variableDeclarator", "type", "primitiveType", 
			"qualifiedIdentifierList", "formalParameters", "formalParameter", "qualifiedIdentifier", 
			"block", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
			"statement", "emptyStatement", "parExpression", "expressionList", "expression", 
			"assignmentOperator", "conditionalAndExpression", "equalityExpression", 
			"relationalExpression", "instanceOfExpression", "relationalOp", "additiveExpression", 
			"additiveOp", "multiplicativeExpression", "multiplicativeOp", "unaryExpression", 
			"postfixExpression", "simpleUnaryExpression", "primary", "superSuffix", 
			"selector", "creator", "arrayCreator", "variableInitializer", "arrayInitializer", 
			"arguments", "literal", "referenceType", "typeName", "arrayType", "dims"
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

	@Override
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(104);
				packageDeclaration();
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(107);
				importDeclaration();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC))) != 0)) {
				{
				{
				setState(113);
				typeDeclaration();
				}
				}
				setState(118);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Parser.PACKAGE, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PACKAGE);
			setState(120);
			qualifiedIdentifier();
			setState(121);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parser.IMPORT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public TerminalNode STAR() { return getToken(Parser.STAR, 0); }
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			int _alt;
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(IMPORT);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(124);
					match(STATIC);
					}
				}

				setState(127);
				match(Identifier);
				setState(128);
				match(DOT);
				setState(129);
				match(STAR);
				setState(130);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(IMPORT);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(132);
					match(STATIC);
					}
				}

				setState(135);
				match(Identifier);
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(136);
						match(DOT);
						setState(137);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(142);
					match(DOT);
					setState(143);
					match(STAR);
					}
				}

				setState(146);
				match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case PUBLIC:
			case PROTECTED:
			case PRIVATE:
			case ABSTRACT:
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				modifiers();
				setState(150);
				classDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC))) != 0)) {
				{
				{
				setState(155);
				modifier();
				}
				}
				setState(160);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Parser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Parser.ABSTRACT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Parser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Parser.EXTENDS, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CLASS);
			setState(164);
			match(Identifier);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(165);
				match(EXTENDS);
				setState(166);
				qualifiedIdentifier();
				}
			}

			setState(169);
			classBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				type();
				}
				}
				setState(178);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LBRACE);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << STATIC) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(180);
				classBodyDeclaration();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(SEMI);
				}
				break;
			case STATIC:
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(189);
					match(STATIC);
					}
				}

				setState(192);
				block();
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(Parser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(Identifier);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(196);
				match(EQ);
				setState(197);
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

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				primitiveType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Parser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(Parser.CHAR, 0); }
		public TerminalNode INT() { return getToken(Parser.INT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class QualifiedIdentifierListContext extends ParserRuleContext {
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public QualifiedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterQualifiedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitQualifiedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitQualifiedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentifierListContext qualifiedIdentifierList() throws RecognitionException {
		QualifiedIdentifierListContext _localctx = new QualifiedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_qualifiedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			qualifiedIdentifier();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(207);
				match(COMMA);
				setState(208);
				qualifiedIdentifier();
				}
				}
				setState(213);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(LPAREN);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << Identifier))) != 0)) {
				{
				{
				setState(215);
				formalParameter();
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(216);
					match(COMMA);
					setState(217);
					formalParameter();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(225);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			type();
			setState(228);
			match(Identifier);
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

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitQualifiedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitQualifiedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(Identifier);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(DOT);
					setState(232);
					match(Identifier);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LBRACE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << LBRACE) | (1L << LPAREN) | (1L << EQ) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PLUSPLUS) | (1L << BANG) | (1L << NEW) | (1L << SUB) | (1L << EQEQ) | (1L << AMPAMP) | (1L << PLUSEQ) | (1L << INSTANCEOF) | (1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				{
				setState(239);
				blockStatement();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockStatement);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			localVariableDeclaration();
			setState(252);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			type();
			setState(255);
			variableDeclarator();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				variableDeclarator();
				}
				}
				setState(262);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(Parser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Parser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(Identifier);
				setState(265);
				match(COLON);
				setState(266);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(IF);
				setState(268);
				parExpression();
				setState(269);
				statement();
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(270);
					match(ELSE);
					setState(271);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(WHILE);
				setState(275);
				parExpression();
				setState(276);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(RETURN);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(279);
					expression();
					}
					break;
				}
				setState(282);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				expression();
				setState(284);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				emptyStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LPAREN);
			setState(292);
			expression();
			setState(293);
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
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			expression();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				expression();
				}
				}
				setState(302);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			conditionalAndExpression();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ || _la==PLUSEQ) {
				{
				setState(304);
				assignmentOperator();
				setState(305);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public int assignmentType;
		public TerminalNode EQ() { return getToken(Parser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(Parser.PLUSEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentOperator);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  1;
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  2;
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AMPAMP() { return getTokens(Parser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(Parser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			equalityExpression();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPAMP) {
				{
				{
				setState(316);
				match(AMPAMP);
				setState(317);
				equalityExpression();
				}
				}
				setState(322);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(Parser.EQEQ); }
		public TerminalNode EQEQ(int i) {
			return getToken(Parser.EQEQ, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			relationalExpression();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQEQ) {
				{
				{
				setState(324);
				match(EQEQ);
				setState(325);
				relationalExpression();
				}
				}
				setState(330);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public InstanceOfExpressionContext instanceOfExpression() {
			return getRuleContext(InstanceOfExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relationalExpression);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case THIS:
			case SUPER:
			case NULL:
			case TRUE:
			case FALSE:
			case PLUSPLUS:
			case BANG:
			case NEW:
			case SUB:
			case IntegerLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				additiveExpression();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==GT || _la==LT) {
					{
					{
					setState(332);
					relationalOp();
					setState(333);
					additiveExpression();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SEMI:
			case COMMA:
			case RBRACE:
			case RBRACKET:
			case RPAREN:
			case EQ:
			case EQEQ:
			case AMPAMP:
			case PLUSEQ:
			case INSTANCEOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				instanceOfExpression();
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

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public TerminalNode INSTANCEOF() { return getToken(Parser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInstanceOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(343);
				match(INSTANCEOF);
				setState(344);
				type();
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

	public static class RelationalOpContext extends ParserRuleContext {
		public int operatorType;
		public TerminalNode LT() { return getToken(Parser.LT, 0); }
		public TerminalNode EQ() { return getToken(Parser.EQ, 0); }
		public TerminalNode GT() { return getToken(Parser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relationalOp);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(LT);
				setState(348);
				match(EQ);
				((RelationalOpContext)_localctx).operatorType =  1;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(GT);
				((RelationalOpContext)_localctx).operatorType =  4;
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOpContext> additiveOp() {
			return getRuleContexts(AdditiveOpContext.class);
		}
		public AdditiveOpContext additiveOp(int i) {
			return getRuleContext(AdditiveOpContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			multiplicativeExpression();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUB) {
				{
				{
				setState(355);
				additiveOp();
				setState(356);
				multiplicativeExpression();
				}
				}
				setState(362);
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

	public static class AdditiveOpContext extends ParserRuleContext {
		public int operatorType;
		public TerminalNode PLUS() { return getToken(Parser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(Parser.SUB, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAdditiveOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAdditiveOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_additiveOp);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(PLUS);
				((AdditiveOpContext)_localctx).operatorType =  1;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(SUB);
				((AdditiveOpContext)_localctx).operatorType =  2;
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<MultiplicativeOpContext> multiplicativeOp() {
			return getRuleContexts(MultiplicativeOpContext.class);
		}
		public MultiplicativeOpContext multiplicativeOp(int i) {
			return getRuleContext(MultiplicativeOpContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			unaryExpression();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR) {
				{
				{
				setState(370);
				multiplicativeOp();
				setState(371);
				unaryExpression();
				}
				}
				setState(377);
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

	public static class MultiplicativeOpContext extends ParserRuleContext {
		public int operatorType;
		public TerminalNode STAR() { return getToken(Parser.STAR, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMultiplicativeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultiplicativeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multiplicativeOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(STAR);
			((MultiplicativeOpContext)_localctx).operatorType =  1;
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
		public TerminalNode SUB() { return getToken(Parser.SUB, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(Parser.PLUSPLUS, 0); }
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unaryExpression);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(SUB);
				setState(382);
				unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(PLUSPLUS);
				setState(384);
				unaryExpression();
				}
				break;
			case LPAREN:
			case THIS:
			case SUPER:
			case NULL:
			case TRUE:
			case FALSE:
			case BANG:
			case NEW:
			case IntegerLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				simpleUnaryExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode SUBSUB() { return getToken(Parser.SUBSUB, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			primary();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==LBRACKET) {
				{
				{
				setState(389);
				selector();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBSUB) {
				{
				setState(395);
				match(SUBSUB);
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

	public static class SimpleUnaryExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public SimpleUnaryExpressionContext simpleUnaryExpression() {
			return getRuleContext(SimpleUnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(Parser.BANG, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public SimpleUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSimpleUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSimpleUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSimpleUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUnaryExpressionContext simpleUnaryExpression() throws RecognitionException {
		SimpleUnaryExpressionContext _localctx = new SimpleUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_simpleUnaryExpression);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(LPAREN);
				setState(399);
				primitiveType();
				setState(400);
				match(RPAREN);
				setState(401);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(LPAREN);
				setState(404);
				referenceType();
				setState(405);
				match(RPAREN);
				setState(406);
				simpleUnaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(BANG);
				setState(409);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				postfixExpression();
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

	public static class PrimaryContext extends ParserRuleContext {
		public int operationType;
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Parser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Parser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primary);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				parExpression();
				((PrimaryContext)_localctx).operationType =  1;
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(THIS);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(417);
					arguments();
					}
				}

				((PrimaryContext)_localctx).operationType =  2;
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(SUPER);
				setState(422);
				superSuffix();
				((PrimaryContext)_localctx).operationType =  4;
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case IntegerLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				literal();
				((PrimaryContext)_localctx).operationType =  5;
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				creator();
				((PrimaryContext)_localctx).operationType =  6;
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				qualifiedIdentifier();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(432);
					arguments();
					}
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_superSuffix);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(DOT);
				setState(438);
				match(Identifier);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(439);
					arguments();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				arguments();
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

	public static class SelectorContext extends ParserRuleContext {
		public int operationType;
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Parser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(Parser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(Parser.RBRACKET, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selector);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(DOT);
				setState(446);
				match(Identifier);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(447);
					arguments();
					}
				}

				((SelectorContext)_localctx).operationType =  1;
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(LBRACKET);
				setState(452);
				expression();
				setState(453);
				match(RBRACKET);
				((SelectorContext)_localctx).operationType =  5;
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

	public static class CreatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Parser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parser.RBRACKET, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorContext arrayCreator() {
			return getRuleContext(ArrayCreatorContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_creator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(NEW);
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
				{
				setState(459);
				primitiveType();
				}
				break;
			case Identifier:
				{
				setState(460);
				qualifiedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(463);
				arguments();
				}
				break;
			case 2:
				{
				setState(464);
				match(LBRACKET);
				setState(465);
				match(RBRACKET);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(466);
					match(LBRACKET);
					setState(467);
					match(RBRACKET);
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
				arrayInitializer();
				}
				break;
			case 3:
				{
				setState(474);
				arrayCreator();
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

	public static class ArrayCreatorContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parser.RBRACKET, i);
		}
		public ArrayCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorContext arrayCreator() throws RecognitionException {
		ArrayCreatorContext _localctx = new ArrayCreatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayCreator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(LBRACKET);
			setState(478);
			expression();
			setState(479);
			match(RBRACKET);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					match(LBRACKET);
					setState(481);
					expression();
					setState(482);
					match(RBRACKET);
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					match(LBRACKET);
					setState(490);
					match(RBRACKET);
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableInitializer);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				arrayInitializer();
				}
				break;
			case SEMI:
			case COMMA:
			case RBRACE:
			case LPAREN:
			case EQ:
			case THIS:
			case SUPER:
			case NULL:
			case TRUE:
			case FALSE:
			case PLUSPLUS:
			case BANG:
			case NEW:
			case SUB:
			case EQEQ:
			case AMPAMP:
			case PLUSEQ:
			case INSTANCEOF:
			case IntegerLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				expression();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(LBRACE);
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(501);
				variableInitializer();
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(502);
						match(COMMA);
						setState(503);
						variableInitializer();
						}
						} 
					}
					setState(508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			}
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(511);
				match(COMMA);
				}
			}

			setState(514);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(LPAREN);
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(517);
				expressionList();
				}
				break;
			}
			setState(520);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Parser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Parser.StringLiteral, 0); }
		public TerminalNode TRUE() { return getToken(Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Parser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(Parser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parser.RBRACKET, i);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_referenceType);
		int _la;
		try {
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				qualifiedIdentifier();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(525);
					match(LBRACKET);
					setState(526);
					match(RBRACKET);
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
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

	public static class TypeNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(Identifier);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(536);
				match(DOT);
				setState(537);
				match(Identifier);
				}
				}
				setState(542);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			primitiveType();
			setState(544);
			dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parser.RBRACKET, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(LBRACKET);
			setState(547);
			match(RBRACKET);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(548);
				match(LBRACKET);
				setState(549);
				match(RBRACKET);
				}
				}
				setState(554);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u022e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\5\2l\n\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\2\7\2u\n\2\f"+
		"\2\16\2x\13\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0080\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u0088\n\4\3\4\3\4\3\4\6\4\u008d\n\4\r\4\16\4\u008e\3\4\3\4"+
		"\5\4\u0093\n\4\3\4\5\4\u0096\n\4\3\5\3\5\3\5\3\5\5\5\u009c\n\5\3\6\7\6"+
		"\u009f\n\6\f\6\16\6\u00a2\13\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3\n\3\n\7\n\u00b8"+
		"\n\n\f\n\16\n\u00bb\13\n\3\n\3\n\3\13\3\13\5\13\u00c1\n\13\3\13\5\13\u00c4"+
		"\n\13\3\f\3\f\3\f\5\f\u00c9\n\f\3\r\3\r\5\r\u00cd\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u00d4\n\17\f\17\16\17\u00d7\13\17\3\20\3\20\3\20\3\20\7"+
		"\20\u00dd\n\20\f\20\16\20\u00e0\13\20\5\20\u00e2\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\7\22\u00ec\n\22\f\22\16\22\u00ef\13\22\3\23\3"+
		"\23\7\23\u00f3\n\23\f\23\16\23\u00f6\13\23\3\23\3\23\3\24\3\24\5\24\u00fc"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0105\n\26\f\26\16\26\u0108"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0113\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u011b\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0122\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u012d"+
		"\n\32\f\32\16\32\u0130\13\32\3\33\3\33\3\33\3\33\5\33\u0136\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u013c\n\34\3\35\3\35\3\35\7\35\u0141\n\35\f\35\16"+
		"\35\u0144\13\35\3\36\3\36\3\36\7\36\u0149\n\36\f\36\16\36\u014c\13\36"+
		"\3\37\3\37\3\37\3\37\7\37\u0152\n\37\f\37\16\37\u0155\13\37\3\37\5\37"+
		"\u0158\n\37\3 \3 \5 \u015c\n \3!\3!\3!\3!\3!\5!\u0163\n!\3\"\3\"\3\"\3"+
		"\"\7\"\u0169\n\"\f\"\16\"\u016c\13\"\3#\3#\3#\3#\5#\u0172\n#\3$\3$\3$"+
		"\3$\7$\u0178\n$\f$\16$\u017b\13$\3%\3%\3%\3&\3&\3&\3&\3&\5&\u0185\n&\3"+
		"\'\3\'\7\'\u0189\n\'\f\'\16\'\u018c\13\'\3\'\5\'\u018f\n\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u019e\n(\3)\3)\3)\3)\3)\5)\u01a5\n)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01b4\n)\5)\u01b6\n)\3*\3*\3"+
		"*\5*\u01bb\n*\3*\5*\u01be\n*\3+\3+\3+\5+\u01c3\n+\3+\3+\3+\3+\3+\3+\5"+
		"+\u01cb\n+\3,\3,\3,\5,\u01d0\n,\3,\3,\3,\3,\3,\7,\u01d7\n,\f,\16,\u01da"+
		"\13,\3,\3,\5,\u01de\n,\3-\3-\3-\3-\3-\3-\3-\7-\u01e7\n-\f-\16-\u01ea\13"+
		"-\3-\3-\7-\u01ee\n-\f-\16-\u01f1\13-\3.\3.\5.\u01f5\n.\3/\3/\3/\3/\7/"+
		"\u01fb\n/\f/\16/\u01fe\13/\5/\u0200\n/\3/\5/\u0203\n/\3/\3/\3\60\3\60"+
		"\5\60\u0209\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\7\62\u0212\n\62\f"+
		"\62\16\62\u0215\13\62\3\62\5\62\u0218\n\62\3\63\3\63\3\63\7\63\u021d\n"+
		"\63\f\63\16\63\u0220\13\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0229"+
		"\n\65\f\65\16\65\u022c\13\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\5\3\2\n\16"+
		"\3\2\33\35\4\2!#\65\67\2\u0246\2k\3\2\2\2\4y\3\2\2\2\6\u0095\3\2\2\2\b"+
		"\u009b\3\2\2\2\n\u00a0\3\2\2\2\f\u00a3\3\2\2\2\16\u00a5\3\2\2\2\20\u00ad"+
		"\3\2\2\2\22\u00b5\3\2\2\2\24\u00c3\3\2\2\2\26\u00c5\3\2\2\2\30\u00cc\3"+
		"\2\2\2\32\u00ce\3\2\2\2\34\u00d0\3\2\2\2\36\u00d8\3\2\2\2 \u00e5\3\2\2"+
		"\2\"\u00e8\3\2\2\2$\u00f0\3\2\2\2&\u00fb\3\2\2\2(\u00fd\3\2\2\2*\u0100"+
		"\3\2\2\2,\u0121\3\2\2\2.\u0123\3\2\2\2\60\u0125\3\2\2\2\62\u0129\3\2\2"+
		"\2\64\u0131\3\2\2\2\66\u013b\3\2\2\28\u013d\3\2\2\2:\u0145\3\2\2\2<\u0157"+
		"\3\2\2\2>\u015b\3\2\2\2@\u0162\3\2\2\2B\u0164\3\2\2\2D\u0171\3\2\2\2F"+
		"\u0173\3\2\2\2H\u017c\3\2\2\2J\u0184\3\2\2\2L\u0186\3\2\2\2N\u019d\3\2"+
		"\2\2P\u01b5\3\2\2\2R\u01bd\3\2\2\2T\u01ca\3\2\2\2V\u01cc\3\2\2\2X\u01df"+
		"\3\2\2\2Z\u01f4\3\2\2\2\\\u01f6\3\2\2\2^\u0206\3\2\2\2`\u020c\3\2\2\2"+
		"b\u0217\3\2\2\2d\u0219\3\2\2\2f\u0221\3\2\2\2h\u0224\3\2\2\2jl\5\4\3\2"+
		"kj\3\2\2\2kl\3\2\2\2lp\3\2\2\2mo\5\6\4\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qv\3\2\2\2rp\3\2\2\2su\5\b\5\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2w\3\3\2\2\2xv\3\2\2\2yz\7\4\2\2z{\5\"\22\2{|\7\3\2\2|\5\3\2"+
		"\2\2}\177\7\5\2\2~\u0080\7\16\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\78\2\2\u0082\u0083\7\6\2\2\u0083\u0084\7\7"+
		"\2\2\u0084\u0096\7\3\2\2\u0085\u0087\7\5\2\2\u0086\u0088\7\16\2\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\78"+
		"\2\2\u008a\u008b\7\6\2\2\u008b\u008d\78\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u0091\7\6\2\2\u0091\u0093\7\7\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\3\2\2\u0095}\3\2\2\2"+
		"\u0095\u0085\3\2\2\2\u0096\7\3\2\2\2\u0097\u0098\5\n\6\2\u0098\u0099\5"+
		"\16\b\2\u0099\u009c\3\2\2\2\u009a\u009c\7\3\2\2\u009b\u0097\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\t\3\2\2\2\u009d\u009f\5\f\7\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\13"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\t\2\2\2\u00a4\r\3\2\2\2\u00a5"+
		"\u00a6\7\b\2\2\u00a6\u00a9\78\2\2\u00a7\u00a8\7\36\2\2\u00a8\u00aa\5\""+
		"\22\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\17\3\2\2\2\u00ad\u00b2\5\30\r\2\u00ae\u00af\7\22"+
		"\2\2\u00af\u00b1\5\30\r\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b5\u00b9\7\23\2\2\u00b6\u00b8\5\24\13\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\24\2\2\u00bd\23\3\2\2\2\u00be\u00c4"+
		"\7\3\2\2\u00bf\u00c1\7\16\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5$\23\2\u00c3\u00be\3\2\2\2\u00c3\u00c0"+
		"\3\2\2\2\u00c4\25\3\2\2\2\u00c5\u00c8\78\2\2\u00c6\u00c7\7\32\2\2\u00c7"+
		"\u00c9\5Z.\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\27\3\2\2\2"+
		"\u00ca\u00cd\5b\62\2\u00cb\u00cd\5\32\16\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\31\3\2\2\2\u00ce\u00cf\t\3\2\2\u00cf\33\3\2\2\2\u00d0\u00d5"+
		"\5\"\22\2\u00d1\u00d2\7\22\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\35"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00e1\7\27\2\2\u00d9\u00de\5 \21\2"+
		"\u00da\u00db\7\22\2\2\u00db\u00dd\5 \21\2\u00dc\u00da\3\2\2\2\u00dd\u00e0"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\7\30\2\2\u00e4\37\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6"+
		"\u00e7\78\2\2\u00e7!\3\2\2\2\u00e8\u00ed\78\2\2\u00e9\u00ea\7\6\2\2\u00ea"+
		"\u00ec\78\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f4"+
		"\7\23\2\2\u00f1\u00f3\5&\24\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00f8\7\24\2\2\u00f8%\3\2\2\2\u00f9\u00fc\5(\25\2\u00fa"+
		"\u00fc\5,\27\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\'\3\2\2\2"+
		"\u00fd\u00fe\5*\26\2\u00fe\u00ff\7\3\2\2\u00ff)\3\2\2\2\u0100\u0101\5"+
		"\30\r\2\u0101\u0106\5\26\f\2\u0102\u0103\7\22\2\2\u0103\u0105\5\26\f\2"+
		"\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107+\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0122\5$\23\2\u010a"+
		"\u010b\78\2\2\u010b\u010c\7\21\2\2\u010c\u0122\5,\27\2\u010d\u010e\7$"+
		"\2\2\u010e\u010f\5\60\31\2\u010f\u0112\5,\27\2\u0110\u0111\7%\2\2\u0111"+
		"\u0113\5,\27\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0122\3\2"+
		"\2\2\u0114\u0115\7&\2\2\u0115\u0116\5\60\31\2\u0116\u0117\5,\27\2\u0117"+
		"\u0122\3\2\2\2\u0118\u011a\7\'\2\2\u0119\u011b\5\64\33\2\u011a\u0119\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0122\7\3\2\2\u011d"+
		"\u011e\5\64\33\2\u011e\u011f\7\3\2\2\u011f\u0122\3\2\2\2\u0120\u0122\5"+
		".\30\2\u0121\u0109\3\2\2\2\u0121\u010a\3\2\2\2\u0121\u010d\3\2\2\2\u0121"+
		"\u0114\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122-\3\2\2\2\u0123\u0124\7\3\2\2\u0124/\3\2\2\2\u0125\u0126\7\27"+
		"\2\2\u0126\u0127\5\64\33\2\u0127\u0128\7\30\2\2\u0128\61\3\2\2\2\u0129"+
		"\u012e\5\64\33\2\u012a\u012b\7\22\2\2\u012b\u012d\5\64\33\2\u012c\u012a"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\63\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\58\35\2\u0132\u0133\5\66\34"+
		"\2\u0133\u0134\5\64\33\2\u0134\u0136\3\2\2\2\u0135\u0132\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\65\3\2\2\2\u0137\u0138\7\32\2\2\u0138\u013c\b\34"+
		"\1\2\u0139\u013a\7\60\2\2\u013a\u013c\b\34\1\2\u013b\u0137\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\67\3\2\2\2\u013d\u0142\5:\36\2\u013e\u013f\7/\2\2"+
		"\u013f\u0141\5:\36\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u014a\5<\37\2\u0146\u0147\7.\2\2\u0147\u0149\5<\37\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		";\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0153\5B\"\2\u014e\u014f\5@!\2\u014f"+
		"\u0150\5B\"\2\u0150\u0152\3\2\2\2\u0151\u014e\3\2\2\2\u0152\u0155\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0158\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0158\5> \2\u0157\u014d\3\2\2\2\u0157\u0156\3\2\2"+
		"\2\u0158=\3\2\2\2\u0159\u015a\7\63\2\2\u015a\u015c\5\30\r\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c?\3\2\2\2\u015d\u015e\7\62\2\2\u015e"+
		"\u015f\7\32\2\2\u015f\u0163\b!\1\2\u0160\u0161\7\61\2\2\u0161\u0163\b"+
		"!\1\2\u0162\u015d\3\2\2\2\u0162\u0160\3\2\2\2\u0163A\3\2\2\2\u0164\u016a"+
		"\5F$\2\u0165\u0166\5D#\2\u0166\u0167\5F$\2\u0167\u0169\3\2\2\2\u0168\u0165"+
		"\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"C\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7,\2\2\u016e\u0172\b#\1\2\u016f"+
		"\u0170\7-\2\2\u0170\u0172\b#\1\2\u0171\u016d\3\2\2\2\u0171\u016f\3\2\2"+
		"\2\u0172E\3\2\2\2\u0173\u0179\5J&\2\u0174\u0175\5H%\2\u0175\u0176\5J&"+
		"\2\u0176\u0178\3\2\2\2\u0177\u0174\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017aG\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017d\7\7\2\2\u017d\u017e\b%\1\2\u017eI\3\2\2\2\u017f\u0180\7-\2\2\u0180"+
		"\u0185\5J&\2\u0181\u0182\7(\2\2\u0182\u0185\5J&\2\u0183\u0185\5N(\2\u0184"+
		"\u017f\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0183\3\2\2\2\u0185K\3\2\2\2"+
		"\u0186\u018a\5P)\2\u0187\u0189\5T+\2\u0188\u0187\3\2\2\2\u0189\u018c\3"+
		"\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018f\7)\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018fM\3\2\2\2\u0190\u0191\7\27\2\2\u0191\u0192\5\32\16\2\u0192\u0193"+
		"\7\30\2\2\u0193\u0194\5J&\2\u0194\u019e\3\2\2\2\u0195\u0196\7\27\2\2\u0196"+
		"\u0197\5b\62\2\u0197\u0198\7\30\2\2\u0198\u0199\5N(\2\u0199\u019e\3\2"+
		"\2\2\u019a\u019b\7*\2\2\u019b\u019e\5J&\2\u019c\u019e\5L\'\2\u019d\u0190"+
		"\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u019a\3\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"O\3\2\2\2\u019f\u01a0\5\60\31\2\u01a0\u01a1\b)\1\2\u01a1\u01b6\3\2\2\2"+
		"\u01a2\u01a4\7\37\2\2\u01a3\u01a5\5^\60\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01b6\b)\1\2\u01a7\u01a8\7 \2\2\u01a8"+
		"\u01a9\5R*\2\u01a9\u01aa\b)\1\2\u01aa\u01b6\3\2\2\2\u01ab\u01ac\5`\61"+
		"\2\u01ac\u01ad\b)\1\2\u01ad\u01b6\3\2\2\2\u01ae\u01af\5V,\2\u01af\u01b0"+
		"\b)\1\2\u01b0\u01b6\3\2\2\2\u01b1\u01b3\5\"\22\2\u01b2\u01b4\5^\60\2\u01b3"+
		"\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u019f\3\2"+
		"\2\2\u01b5\u01a2\3\2\2\2\u01b5\u01a7\3\2\2\2\u01b5\u01ab\3\2\2\2\u01b5"+
		"\u01ae\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6Q\3\2\2\2\u01b7\u01b8\7\6\2\2"+
		"\u01b8\u01ba\78\2\2\u01b9\u01bb\5^\60\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01be\5^\60\2\u01bd\u01b7\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01beS\3\2\2\2\u01bf\u01c0\7\6\2\2\u01c0\u01c2\78\2\2\u01c1"+
		"\u01c3\5^\60\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01cb\b+\1\2\u01c5\u01c6\7\25\2\2\u01c6\u01c7\5\64\33\2\u01c7"+
		"\u01c8\7\26\2\2\u01c8\u01c9\b+\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01bf\3\2"+
		"\2\2\u01ca\u01c5\3\2\2\2\u01cbU\3\2\2\2\u01cc\u01cf\7+\2\2\u01cd\u01d0"+
		"\5\32\16\2\u01ce\u01d0\5\"\22\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2"+
		"\2\u01d0\u01dd\3\2\2\2\u01d1\u01de\5^\60\2\u01d2\u01d3\7\25\2\2\u01d3"+
		"\u01d8\7\26\2\2\u01d4\u01d5\7\25\2\2\u01d5\u01d7\7\26\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01de\5\\/\2\u01dc\u01de\5X-"+
		"\2\u01dd\u01d1\3\2\2\2\u01dd\u01d2\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deW"+
		"\3\2\2\2\u01df\u01e0\7\25\2\2\u01e0\u01e1\5\64\33\2\u01e1\u01e8\7\26\2"+
		"\2\u01e2\u01e3\7\25\2\2\u01e3\u01e4\5\64\33\2\u01e4\u01e5\7\26\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ef\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ec\7\25\2\2\u01ec\u01ee\7\26\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3"+
		"\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0Y\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f2\u01f5\5\\/\2\u01f3\u01f5\5\64\33\2\u01f4\u01f2\3\2\2\2"+
		"\u01f4\u01f3\3\2\2\2\u01f5[\3\2\2\2\u01f6\u01ff\7\23\2\2\u01f7\u01fc\5"+
		"Z.\2\u01f8\u01f9\7\22\2\2\u01f9\u01fb\5Z.\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0202\3\2\2\2\u0201\u0203\7\22\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\7\24\2\2\u0205]\3\2\2\2\u0206\u0208"+
		"\7\27\2\2\u0207\u0209\5\62\32\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020a\u020b\7\30\2\2\u020b_\3\2\2\2\u020c\u020d"+
		"\t\4\2\2\u020da\3\2\2\2\u020e\u0213\5\"\22\2\u020f\u0210\7\25\2\2\u0210"+
		"\u0212\7\26\2\2\u0211\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3"+
		"\2\2\2\u0213\u0214\3\2\2\2\u0214\u0218\3\2\2\2\u0215\u0213\3\2\2\2\u0216"+
		"\u0218\5f\64\2\u0217\u020e\3\2\2\2\u0217\u0216\3\2\2\2\u0218c\3\2\2\2"+
		"\u0219\u021e\78\2\2\u021a\u021b\7\6\2\2\u021b\u021d\78\2\2\u021c\u021a"+
		"\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"e\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\5\32\16\2\u0222\u0223\5h\65"+
		"\2\u0223g\3\2\2\2\u0224\u0225\7\25\2\2\u0225\u022a\7\26\2\2\u0226\u0227"+
		"\7\25\2\2\u0227\u0229\7\26\2\2\u0228\u0226\3\2\2\2\u0229\u022c\3\2\2\2"+
		"\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bi\3\2\2\2\u022c\u022a\3"+
		"\2\2\2Bkpv\177\u0087\u008e\u0092\u0095\u009b\u00a0\u00a9\u00b2\u00b9\u00c0"+
		"\u00c3\u00c8\u00cc\u00d5\u00de\u00e1\u00ed\u00f4\u00fb\u0106\u0112\u011a"+
		"\u0121\u012e\u0135\u013b\u0142\u014a\u0153\u0157\u015b\u0162\u016a\u0171"+
		"\u0179\u0184\u018a\u018e\u019d\u01a4\u01b3\u01b5\u01ba\u01bd\u01c2\u01ca"+
		"\u01cf\u01d8\u01dd\u01e8\u01ef\u01f4\u01fc\u01ff\u0202\u0208\u0213\u0217"+
		"\u021e\u022a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}