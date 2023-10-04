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
}