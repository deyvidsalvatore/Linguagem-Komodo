package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class EqualityExpression implements ASTNode {

	private ASTNode leftOperand;
	private ASTNode rightOperand;
	private String operator;
	
	public EqualityExpression(ASTNode leftOperand, ASTNode rightOperand, String operator) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operator;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		
		Object leftResult = leftOperand.execute(symbolTable);
		Object rightResult = rightOperand.execute(symbolTable);
		
		switch (operator) {
			case "==":
				return isEqual(leftResult, rightResult);
			case "!=":
				return !isEqual(leftResult, rightResult);
			default:
				throw new RuntimeException("Invalid equality operator: " + operator);
		}
	}
	
	private boolean isEqual(Object left, Object right) {
		if (left == null && right == null) {
			return true;
		} else if (left == null || right == null) {
			return false;
		} else {
			return left.equals(right);
		}
	}

}
