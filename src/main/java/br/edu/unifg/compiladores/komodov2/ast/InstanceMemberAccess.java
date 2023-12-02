package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class InstanceMemberAccess implements ASTNode {
    private String instanceName;
    private String memberName;

    public InstanceMemberAccess(String instanceName, String memberName) {
        this.instanceName = instanceName;
        this.memberName = memberName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Obtenha a instância do objeto usando instanceName
        ObjectInstance objectInstance = (ObjectInstance) symbolTable.get(instanceName);

        // Obtenha o valor do membro usando memberName
        Object memberValue = objectInstance.getMember(memberName);

        // Faça algo com o valor do membro (ou simplesmente retorne)
        System.out.println("InstanceMemberAccess - Instance: " + instanceName + ", Member: " + memberName + ", Value: " + memberValue);

        return memberValue;
    }
}
