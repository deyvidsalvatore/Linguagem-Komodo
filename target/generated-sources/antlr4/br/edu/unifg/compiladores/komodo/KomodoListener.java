// Generated from br\edu\u005Cunifg\compiladores\komodo\Komodo.g4 by ANTLR 4.5.1
package br.edu.unifg.compiladores.komodo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KomodoParser}.
 */
public interface KomodoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KomodoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(KomodoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(KomodoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KomodoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KomodoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KomodoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KomodoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(KomodoParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(KomodoParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(KomodoParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(KomodoParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentStatement(KomodoParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#arrayAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentStatement(KomodoParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(KomodoParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(KomodoParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(KomodoParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(KomodoParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(KomodoParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(KomodoParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#arrayIndexDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexDeclaration(KomodoParser.ArrayIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#arrayIndexDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexDeclaration(KomodoParser.ArrayIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(KomodoParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(KomodoParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(KomodoParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(KomodoParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(KomodoParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(KomodoParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KomodoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KomodoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(KomodoParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(KomodoParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTerm(KomodoParser.LogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTerm(KomodoParser.LogicalTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(KomodoParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(KomodoParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(KomodoParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(KomodoParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#concatenationElement}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationElement(KomodoParser.ConcatenationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#concatenationElement}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationElement(KomodoParser.ConcatenationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(KomodoParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(KomodoParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(KomodoParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(KomodoParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(KomodoParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(KomodoParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(KomodoParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(KomodoParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(KomodoParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(KomodoParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(KomodoParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(KomodoParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(KomodoParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(KomodoParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(KomodoParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(KomodoParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(KomodoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(KomodoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#elifStatement}.
	 * @param ctx the parse tree
	 */
	void enterElifStatement(KomodoParser.ElifStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#elifStatement}.
	 * @param ctx the parse tree
	 */
	void exitElifStatement(KomodoParser.ElifStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(KomodoParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(KomodoParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(KomodoParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(KomodoParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#arithmeticAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAssignmentExpression(KomodoParser.ArithmeticAssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#arithmeticAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAssignmentExpression(KomodoParser.ArithmeticAssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(KomodoParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(KomodoParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#addSubtractExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubtractExpression(KomodoParser.AddSubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#addSubtractExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubtractExpression(KomodoParser.AddSubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyDivideExpression(KomodoParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyDivideExpression(KomodoParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(KomodoParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(KomodoParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(KomodoParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(KomodoParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(KomodoParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(KomodoParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackageStatement(KomodoParser.PackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#packageStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackageStatement(KomodoParser.PackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void enterPackagePath(KomodoParser.PackagePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void exitPackagePath(KomodoParser.PackagePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(KomodoParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(KomodoParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(KomodoParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(KomodoParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(KomodoParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(KomodoParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(KomodoParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(KomodoParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(KomodoParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(KomodoParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(KomodoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(KomodoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#classVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassVarDeclaration(KomodoParser.ClassVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#classVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassVarDeclaration(KomodoParser.ClassVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(KomodoParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(KomodoParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#parameterConstructor}.
	 * @param ctx the parse tree
	 */
	void enterParameterConstructor(KomodoParser.ParameterConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#parameterConstructor}.
	 * @param ctx the parse tree
	 */
	void exitParameterConstructor(KomodoParser.ParameterConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(KomodoParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(KomodoParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#constructorAssignment}.
	 * @param ctx the parse tree
	 */
	void enterConstructorAssignment(KomodoParser.ConstructorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#constructorAssignment}.
	 * @param ctx the parse tree
	 */
	void exitConstructorAssignment(KomodoParser.ConstructorAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(KomodoParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(KomodoParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(KomodoParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(KomodoParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(KomodoParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(KomodoParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(KomodoParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(KomodoParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#thisNameUsage}.
	 * @param ctx the parse tree
	 */
	void enterThisNameUsage(KomodoParser.ThisNameUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#thisNameUsage}.
	 * @param ctx the parse tree
	 */
	void exitThisNameUsage(KomodoParser.ThisNameUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#methodReturnStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodReturnStatement(KomodoParser.MethodReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#methodReturnStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodReturnStatement(KomodoParser.MethodReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KomodoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(KomodoParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(KomodoParser.ArgumentsContext ctx);
}