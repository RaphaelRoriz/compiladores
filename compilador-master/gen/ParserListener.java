// Generated from /home/raphael/Área de Trabalho/compilador-master/Scanner/src/main/java/Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(Parser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(Parser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(Parser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(Parser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#qualifiedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifierList(Parser.QualifiedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#qualifiedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifierList(Parser.QualifiedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(Parser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(Parser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(Parser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(Parser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(Parser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(Parser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(Parser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(Parser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(Parser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(Parser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(Parser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUnaryExpression(Parser.SimpleUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUnaryExpression(Parser.SimpleUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(Parser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(Parser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(Parser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(Parser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(Parser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(Parser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayCreator}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreator(Parser.ArrayCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayCreator}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreator(Parser.ArrayCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Parser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Parser.DimsContext ctx);
}