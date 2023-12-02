package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class VarReference implements ASTNode {
	
	private String varName;

	public VarReference(String varName) {
		this.varName = varName;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		if (symbolTable.containsKey(varName)) {
			return symbolTable.get(varName);
		} else {
			throw new RuntimeException("Variable not found: " + varName);
		}
	}
	
}
