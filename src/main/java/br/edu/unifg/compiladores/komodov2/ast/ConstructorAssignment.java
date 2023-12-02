package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class ConstructorAssignment implements ASTNode {
    private String thisName;
    private String variableName;

    public ConstructorAssignment(String thisName, String variableName) {
        this.thisName = thisName;
        this.variableName = variableName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object value = symbolTable.get(thisName);
        symbolTable.put(variableName, value);
        return null;
    }
}
