package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class VarAssignDirectly extends VarDeclaration {
	
	private ASTNode value;

    public VarAssignDirectly(String name, String type, ASTNode value) {
        super(name, type);
        this.value = value;
    }
    
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se a variável já está na tabela de símbolos
        if (symbolTable.containsKey(getName())) {
            throw new RuntimeException("Variable '" + getName() + "' already declared.");
        }

        // Avalia o valor da expressão à direita e atribui à variável
        Object result = value.execute(symbolTable);

        // Verifica a compatibilidade de tipos
        if (!isTypeCompatible(getType(), result)) {
            throw new RuntimeException("Incompatible types in variable assignment for '" + getName() + "'.");
        }

        symbolTable.put(getName(), result);

        return result;
    }

    private boolean isTypeCompatible(String declaredType, Object assignedValue) {
        if ("number".equals(declaredType) && (assignedValue instanceof Integer || assignedValue instanceof Float)) {
            return true;
        } else if ("boolean".equals(declaredType) && assignedValue instanceof Boolean) {
            return true;
        } else if ("string".equals(declaredType) && assignedValue instanceof String) {
            return true;
        } else if ("object".equals(declaredType)) {
        	return true;
        }
        return false;
    }

    public ASTNode getValue() {
        return value;
    }

}
