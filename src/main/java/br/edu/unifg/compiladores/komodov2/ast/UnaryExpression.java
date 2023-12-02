package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class UnaryExpression implements ASTNode {

	private String operator;
    private ASTNode operand;

    public UnaryExpression(String operator, ASTNode operand) {
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object operandValue = operand.execute(symbolTable);

        if (operandValue instanceof Integer) {
            int operandInt = (int) operandValue;

            switch (operator) {
                case "+":
                    return operandInt;
                case "-":
                    return -operandInt;
                default:
                    throw new RuntimeException("Operador unário inválido: " + operator);
            }
        } else if (operandValue instanceof Float) {
            float operandFloat = (float) operandValue;

            switch (operator) {
                case "+":
                    return operandFloat;
                case "-":
                    return -operandFloat;
                default:
                    throw new RuntimeException("Operador unário inválido: " + operator);
            }
        } else {
            throw new RuntimeException("Tipo inválido para operação unária: " + operandValue.getClass());
        }
    }

}

