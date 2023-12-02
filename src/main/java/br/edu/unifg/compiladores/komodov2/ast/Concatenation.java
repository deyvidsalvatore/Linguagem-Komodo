package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class Concatenation implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public Concatenation(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        // Verifica se ambos os valores são strings
        if (leftValue instanceof String && rightValue instanceof String) {
            return (String) leftValue + (String) rightValue;
        } else {
            System.out.println("Error: Concatenation only supported for strings.");
            return null;
        }
    }
}