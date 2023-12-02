package br.edu.unifg.compiladores.komodov2.ast;


import java.util.Map;

public class RelationalExpression implements ASTNode {

    private ASTNode leftOperand;
    private ASTNode rightOperand;
    private String operator;

    public RelationalExpression(ASTNode leftOperand, ASTNode rightOperand, String operator) {
        super();
    	this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Executa os operandos
        Object leftResult = leftOperand.execute(symbolTable);
        Object rightResult = rightOperand.execute(symbolTable);

        // Realiza a operação relacional
        switch (operator) {
            case ">":
                return isGreaterThan(leftResult, rightResult);
            case "<":
                return isLessThan(leftResult, rightResult);
            case ">=":
                return isGreaterOrEqual(leftResult, rightResult);
            case "<=":
                return isLessOrEqual(leftResult, rightResult);
            default:
                throw new RuntimeException("Operador inválido: " + operator);
        }
    }

    private boolean isGreaterThan(Object leftResult, Object rightResult) {
        return compare(leftResult, rightResult) > 0;
    }

    private boolean isLessThan(Object leftResult, Object rightResult) {
        return compare(leftResult, rightResult) < 0;
    }

    private boolean isGreaterOrEqual(Object leftResult, Object right) {
        return compare(leftResult, right) >= 0;
    }

    private boolean isLessOrEqual(Object leftResult, Object rightResult) {
        return compare(leftResult, rightResult) <= 0;
    }

    @SuppressWarnings("unchecked")
	private int compare(Object leftResult, Object rightResult) {
        if (leftResult instanceof Number && rightResult instanceof Number) {
            // Se ambos os valores são números, faça a comparação numérica
            double leftValue = ((Number) leftResult).doubleValue();
            double rightValue = ((Number) rightResult).doubleValue();
            return Double.compare(leftValue, rightValue);
        } else if (leftResult instanceof Comparable<?> && rightResult instanceof Comparable<?>) {
            // Se ambos os valores são comparáveis, use compareTo
            return ((Comparable<Object>) leftResult).compareTo(rightResult);
        } else {
            // Se os valores não são comparáveis, considere a comparação de strings
            return String.valueOf(leftResult).compareTo(String.valueOf(rightResult));
        }
    }

}