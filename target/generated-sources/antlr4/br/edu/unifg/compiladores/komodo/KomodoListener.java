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
}