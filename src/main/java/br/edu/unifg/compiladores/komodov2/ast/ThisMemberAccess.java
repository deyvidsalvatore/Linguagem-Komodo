package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class ThisMemberAccess implements ASTNode {
    private String memberName;

    public ThisMemberAccess(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Verifica se há uma instância atual (this) na tabela de símbolos
        if (symbolTable.containsKey("this")) {
            Object thisInstance = symbolTable.get("this");

            // Verifica se a instância atual é uma instância de ThisReference
            if (thisInstance instanceof ThisReference) {
                ThisReference thisReference = (ThisReference) thisInstance;

                // Obtém o valor do membro usando o nome do membro
                Object memberValue = thisReference.getMember(memberName);

                // Retorna o valor do membro
                return memberValue;
            } else {
                // Trata o caso em que "this" não é uma instância válida de ThisReference
                throw new RuntimeException("Invalid use of 'this'.");
            }
        } else {
            // Trata o caso em que "this" não está presente na tabela de símbolos
            throw new RuntimeException("No instance of 'this' available.");
        }
    }
}
