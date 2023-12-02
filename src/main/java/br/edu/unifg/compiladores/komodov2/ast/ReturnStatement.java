package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class ReturnStatement implements ASTNode {
    private ASTNode expression;

    public ReturnStatement(ASTNode expression) {
        this.expression = expression;
    }

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return expression.execute(symbolTable);
	}
}