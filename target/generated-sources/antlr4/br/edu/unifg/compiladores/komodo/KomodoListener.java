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
	 * Enter a parse tree produced by {@link KomodoParser#concatValue}.
	 * @param ctx the parse tree
	 */
	void enterConcatValue(KomodoParser.ConcatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KomodoParser#concatValue}.
	 * @param ctx the parse tree
	 */
	void exitConcatValue(KomodoParser.ConcatValueContext ctx);
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
}