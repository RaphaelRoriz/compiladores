// Generated from /home/raphael/Área de Trabalho/compilador-master/Scanner/src/main/java/Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Parser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Parser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(Parser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(Parser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(Parser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Parser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#qualifiedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifierList(Parser.QualifiedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Parser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Parser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdentifier(Parser.QualifiedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(Parser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(Parser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(Parser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOp(Parser.AdditiveOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOp(Parser.MultiplicativeOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUnaryExpression(Parser.SimpleUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(Parser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(Parser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(Parser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreator(Parser.ArrayCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(Parser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Parser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Parser.DimsContext ctx);
}