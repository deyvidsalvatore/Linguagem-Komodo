package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class LogicalNot implements ASTNode {
	
	private ASTNode operand;

	public LogicalNot(ASTNode operand) {
		this.operand = operand;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Object result = operand.execute(symbolTable);
		
		// Variável deve ser um Booleano e fazer uma negação lógica
		if (result instanceof Boolean) {
			return !(Boolean) result;
		} else {
			throw new RuntimeException("LogicalNot operation can only be applied to boolean values.");
		}
	}
	
	
}
