lexer grammar MeuScanner;



@lexer::members {
public static final int WHITESPACE = 1;
public static final int COMMENTS = 2;
}

SEMI         : ';';
PACKAGE      : 'package';
IMPORT       : 'import';
DOT          : '.';
STAR         : '*';
CLASS        : 'class';
IMPLEMENTS   : 'implements';
PUBLIC       : 'public';
PROTECTED    : 'protected';
PRIVATE      : 'private';
ABSTRACT     : 'abstract';
STATIC       : 'static';
FINAL        : 'final';
STRICTFP     : 'strictfp';
COLON        : ':';
COMMA        : ',';
LBRACE       : '{';
RBRACE       : '}';
LBRACKET     : '[';
RBRACKET     : ']';
LPAREN       : '(';
RPAREN       : ')';
VOID         : 'void';
EQ           : '=';
BOOLEAN      : 'boolean';
CHAR         : 'char';
INT          : 'int';

EXTENDS      : 'extends';
THIS         : 'this';
SUPER        : 'super';
NULL         : 'null';
TRUE         : 'true';
FALSE        : 'false';
IF           : 'if';
ELSE         : 'else';
WHILE        : 'while';
RETURN       : 'return';
PLUSPLUS     : '++';
SUBSUB       : '--';
BANG         : '!';
NEW          : 'new';
PLUS         : '+';
SUB          : '-';
EQEQ         : '==';
AMPAMP       : '&&';
PLUSEQ       : '+=';
GT           : '>';
LT           : '<';
INSTANCEOF   : 'instanceof';
CONST        : 'const';
//GOTO         : 'goto';



fragment
JavaLetterOrDigit
    :    JavaLetter
    |    JavaDigit
    ;


fragment
SingleCharacter
    :    ~['\\]
    ;

fragment
IdentifierChars
    :    JavaLetter JavaLetterOrDigit*                                                                                                   // JavaLetter
    ;
fragment
JavaLetter
    :    '\u0024'           // $
    |    '\u0041'..'\u005a' // A-Z
    |    '\u005f'           // _
    |    '\u0061'..'\u007a' // a-z

    ;
fragment
JavaDigit
    :    '\u0030'..'\u0039'   // 0-9
    ;
fragment
EscapeSequence
    :    '\\b' /* \u0008: backspace BS */
    |    '\\t' /* \u0009: horizontal tab HT */
    |    '\\n' /* \u000a: linefeed LF */
    |    '\\f' /* \u000c: form feed FF */
    |    '\\r' /* \u000d: carriage return CR */
    |    '\\"' /* \u0022: double quote " */
    |    '\\\'' /* \u0027: single quote ' */
    |    '\\\\' /* \u005c: backslash \ */
    ;

fragment
StringCharacters
    :    StringCharacter+                                                                                               // StringCharacter
    ;

fragment
StringCharacter
    :    EscapeSequence
    |    ~('"'|'\\')
    ;

/////// NON-FRAGMENTS //////////

IntegerLiteral
    :    '0'
    | '1'..'9' ('0'..'9')*
    ;


CharacterLiteral
    :    '\'' SingleCharacter '\''                                                                                           // ' SingleCharacter '
    |    '\'' EscapeSequence '\''                                                                                            // ' EscapeSequence '
    ;

StringLiteral
    :    '"' StringCharacter*? '"'
    ;

Identifier
    :    IdentifierChars
    ;

WhiteSpace
    :    (' '
    |    '\u0009'                                        // the ASCII HT character, also known as "horizontal tab"
    |    '\u000C'                                        // the ASCII FF character, also known as "form feed"
    |    LineTerminator)  -> skip                               // LineTerminator
    ;

LineTerminator
    :    ('\r\n'
    |    '\n'
    |    '\r')          -> skip
    ;

SlashComment
    :    '/*' .*? '*/' LineTerminator* -> skip // match anything between /* and */
    ;

EndOfLineComment
    :    '//' .*? LineTerminator+ -> skip
    ;

