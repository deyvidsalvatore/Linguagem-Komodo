package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class ClassVarDeclaration implements ASTNode {
    private String variableName;
    private String dataType;

    public ClassVarDeclaration(String variableName, String dataType) {
        this.variableName = variableName;
        this.dataType = dataType;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        symbolTable.put(variableName, dataType);
        return null;
    }

    public Parameter getParameter() {
        return new Parameter(dataType, variableName);
    }
    
    // Getters for variableName and dataType
    public String getVariableName() {
        return variableName;
    }

    public String getDataType() {
        return dataType;
    }
}
