parser grammar Parser;

options {
    tokenVocab=MeuScanner;
}

compilationUnit
    :   packageDeclaration?
        (importDeclaration
        )*
        (typeDeclaration
        )*
    ;


packageDeclaration
    :   PACKAGE qualifiedIdentifier
        SEMI
    ;

//import + qualifiedIdentifierStar
importDeclaration
    :   IMPORT
        (STATIC
        )?
        Identifier DOT STAR
        SEMI
    |   IMPORT
        (STATIC
        )?
        Identifier
        (DOT Identifier
        )+
        (DOT STAR
        )?
        SEMI
    ;


typeDeclaration
    :   modifiers classDeclaration
    |   SEMI
    ;



modifiers
    :    modifier*
    ;

modifier
    :    PUBLIC
    |    PROTECTED
    |    PRIVATE
    |    STATIC
    |    ABSTRACT
    ;



classDeclaration
    :   CLASS Identifier
            (EXTENDS qualifiedIdentifier
            )?
            classBody
        ;



typeList
    :   type
        (COMMA type
        )*
    ;

classBody
    :   LBRACE
        (classBodyDeclaration
        )*
        RBRACE
    ;



classBodyDeclaration
    :   SEMI
    |   (STATIC
        )?
        block
//    |   memberDecl
    ;


variableDeclarator
    :   Identifier
//        (LBRACKET RBRACKET
//        )*
        (EQ variableInitializer
        )?
    ;


type
    :   referenceType
    |   primitiveType

    ;


primitiveType
    :   BOOLEAN
    |   CHAR

    |   INT

    ;


qualifiedIdentifierList
    :   qualifiedIdentifier
        (COMMA qualifiedIdentifier
        )*
    ;

formalParameters
    :   LPAREN
        ((formalParameter
        ) (COMMA formalParameter)*)?
        RPAREN
    ;



formalParameter
    :   type Identifier
    ;



qualifiedIdentifier
    :   Identifier
        (DOT Identifier
        )*
    ;



block
    :   LBRACE
        (blockStatement
        )*
        RBRACE
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;


localVariableDeclarationStatement
    :   localVariableDeclaration
        SEMI
    ;

localVariableDeclaration
    :   type
        variableDeclarator
        (COMMA variableDeclarator
        )*
    ;

statement
    :   block
    |   Identifier COLON statement
    |   IF parExpression statement (ELSE statement)?
    |   WHILE parExpression statement
    |   RETURN (expression )? SEMI
    |   expression  SEMI
    |   emptyStatement
    ;

emptyStatement
    :    SEMI
    ;



parExpression
    :   LPAREN expression RPAREN
    ;

expressionList
    :   expression
        (COMMA expression
        )*
    ;



expression
    :   conditionalAndExpression
        (assignmentOperator expression)?
    ;


assignmentOperator
locals [int assignmentType]
    :   EQ          {$assignmentType = 1;}
    |   PLUSEQ      {$assignmentType = 2;}
    ;



conditionalAndExpression
    :   equalityExpression
        (AMPAMP equalityExpression
        )*
    ;


equalityExpression
    :   relationalExpression (EQEQ relationalExpression)*
    ;



relationalExpression
    :   additiveExpression (relationalOp additiveExpression)*
    |   instanceOfExpression
    ;

instanceOfExpression
    :   (INSTANCEOF type)?
    ;

relationalOp
    locals [int operatorType]
    :   LT EQ {$operatorType = 1;}
    |   GT    {$operatorType = 4;}
    ;



additiveExpression
    :   multiplicativeExpression (additiveOp multiplicativeExpression)*
    ;

additiveOp
    locals [int operatorType]
    :    PLUS    {$operatorType = 1;}
    |    SUB     {$operatorType = 2;}
    ;

multiplicativeExpression
    :
        unaryExpression (multiplicativeOp unaryExpression)*
    ;

multiplicativeOp
    locals [int operatorType]
    :    STAR    {$operatorType = 1;}
    ;


unaryExpression
    :   SUB unaryExpression
    |   PLUSPLUS unaryExpression
    |   simpleUnaryExpression
    ;

postfixExpression
    :   primary (selector)* (SUBSUB)?
    ;

simpleUnaryExpression
    :   LPAREN primitiveType RPAREN unaryExpression
    |   LPAREN referenceType  RPAREN simpleUnaryExpression
    |   BANG unaryExpression
    |   postfixExpression
    ;


primary
locals [int operationType]
    :    parExpression                                      {$operationType = 1;}
    |    THIS (arguments)?               {$operationType = 2;}
    |    SUPER superSuffix                                  {$operationType = 4;}
    |    literal                                            {$operationType = 5;}
    |    creator                                            {$operationType = 6;}
    |    qualifiedIdentifier (arguments)?
    ;

superSuffix
    :   DOT Identifier (arguments)?
    | arguments
    ;

//this

selector
locals [int operationType]
    :   DOT Identifier (arguments)?     {$operationType = 1;}
    |   LBRACKET expression RBRACKET    {$operationType = 5;}
    ;

creator
    :   NEW (primitiveType | qualifiedIdentifier)
       (
        arguments
        |   LBRACKET RBRACKET (LBRACKET RBRACKET)* arrayInitializer
        |   arrayCreator
       )
    ;

arrayCreator
    : LBRACKET expression RBRACKET (LBRACKET expression RBRACKET)* (LBRACKET RBRACKET)*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   LBRACE
            (variableInitializer
                (COMMA variableInitializer
                )*
            )?
            (COMMA)?
        RBRACE
    ;



arguments
    :   LPAREN (expressionList
        )? RPAREN
    ;

literal
    :   IntegerLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   TRUE
    |   FALSE
    |   NULL
    ;


referenceType
    :   qualifiedIdentifier ( LBRACKET RBRACKET)*
    |   arrayType
    ;


typeName
    :   Identifier (DOT Identifier)*
    ;

arrayType
    :   primitiveType dims
    ;

dims
    :   LBRACKET RBRACKET ( LBRACKET RBRACKET)*
    ;