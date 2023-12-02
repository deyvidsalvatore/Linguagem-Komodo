package br.edu.unifg.compiladores.komodov2.ast;

import java.util.HashMap;
import java.util.Map;

public class ThisReference implements ASTNode {
    private Map<String, Object> members;

    public ThisReference() {
        this.members = new HashMap<>();
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return null;
    }

    public Object getMember(String memberName) {
        return members.get(memberName);
    }

    public void addMember(String memberName, Object value) {
        members.put(memberName, value);
    }
}

