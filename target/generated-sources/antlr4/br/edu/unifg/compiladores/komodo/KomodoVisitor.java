// Generated from br\edu\u005Cunifg\compiladores\komodo\Komodo.g4 by ANTLR 4.5.1
package br.edu.unifg.compiladores.komodo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KomodoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KomodoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KomodoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(KomodoParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KomodoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KomodoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(KomodoParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(KomodoParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#arrayElementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAssign(KomodoParser.ArrayElementAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(KomodoParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KomodoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(KomodoParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#logicalTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalTerm(KomodoParser.LogicalTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(KomodoParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(KomodoParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#concatenationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenationElement(KomodoParser.ConcatenationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(KomodoParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(KomodoParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(KomodoParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(KomodoParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(KomodoParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(KomodoParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(KomodoParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(KomodoParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(KomodoParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#elifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStatement(KomodoParser.ElifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(KomodoParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(KomodoParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#arithmeticAssignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAssignmentExpression(KomodoParser.ArithmeticAssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(KomodoParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#addSubtractExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubtractExpression(KomodoParser.AddSubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExpression(KomodoParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(KomodoParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(KomodoParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#powerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(KomodoParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#packageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageStatement(KomodoParser.PackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#packagePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagePath(KomodoParser.PackagePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(KomodoParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#importPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPath(KomodoParser.ImportPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(KomodoParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(KomodoParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(KomodoParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(KomodoParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#classVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDeclaration(KomodoParser.ClassVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(KomodoParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#parameterConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterConstructor(KomodoParser.ParameterConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(KomodoParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#constructorAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorAssignment(KomodoParser.ConstructorAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(KomodoParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(KomodoParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(KomodoParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(KomodoParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#thisNameUsage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisNameUsage(KomodoParser.ThisNameUsageContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#methodReturnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReturnStatement(KomodoParser.MethodReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(KomodoParser.ArgumentsContext ctx);
}