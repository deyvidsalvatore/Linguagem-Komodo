package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class AdditiveExpression implements ASTNode {
    private ASTNode left;
    private ASTNode right;
    private String operator;

    public AdditiveExpression(ASTNode left, ASTNode right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        // Verifique se a operação é uma concatenação de string
        if (operator.equals("+") && (leftValue instanceof String || rightValue instanceof String)) {
            String leftString = leftValue.toString();
            String rightString = rightValue.toString();

            // Substitua "\\n" por quebra de linha real
            leftString = leftString.replace("\\n", "\n");
            rightString = rightString.replace("\\n", "\n");

            // Substitua "\\t" por tabulação
            leftString = leftString.replace("\\t", "\t");
            rightString = rightString.replace("\\t", "\t");

            // Substitua "\\r" por recursivo
            leftString = leftString.replace("\\r", "\r");
            rightString = rightString.replace("\\r", "\r");

            // Substitua "\\\\" por uma barra invertida
            leftString = leftString.replace("\\\\", "\\");
            rightString = rightString.replace("\\\\", "\\");

            return leftString + rightString;
        }

        if (leftValue instanceof Integer && rightValue instanceof Integer) {
            int leftInt = (int) leftValue;
            int rightInt = (int) rightValue;
            //System.out.println("#:" + operator);
            switch (operator) {
                case "+":
                    return leftInt + rightInt;
                case "-":
                    return leftInt - rightInt;
                default:
                    throw new RuntimeException("Operador inválido: " + operator);
            }
        } else if (leftValue instanceof Float || rightValue instanceof Float) {
            float leftFloat = (leftValue instanceof Float) ? (float) leftValue : (float) (int) leftValue;
            float rightFloat = (rightValue instanceof Float) ? (float) rightValue : (float) (int) rightValue;

            switch (operator) {
                case "+":
                    return leftFloat + rightFloat;
                case "-":
                    return leftFloat - rightFloat;
                default:
                    throw new RuntimeException("Operador inválido: " + operator);
            }
        } else {
            throw new RuntimeException("Tipos inválidos para operação aritmética: " + leftValue.getClass() + ", " + rightValue.getClass());
        }
    }
}
