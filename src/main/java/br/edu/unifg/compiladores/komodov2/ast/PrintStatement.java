package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class PrintStatement implements ASTNode {
    private ASTNode logicalExpression;

    public PrintStatement(ASTNode logicalExpression) {
        this.logicalExpression = logicalExpression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
    	System.out.println(logicalExpression.execute(symbolTable));
    	return null;
    }
}
