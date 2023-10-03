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
	 * Visit a parse tree produced by {@link KomodoParser#stringLL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLL(KomodoParser.StringLLContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KomodoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KomodoParser#functionDeclaresao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaresao(KomodoParser.FunctionDeclaresaoContext ctx);
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
}