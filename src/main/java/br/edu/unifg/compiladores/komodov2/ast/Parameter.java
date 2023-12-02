package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class Parameter implements ASTNode {

    private String type;
    private String name;

    public Parameter(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        symbolTable.put(name, null);
        return null;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
