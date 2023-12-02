package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;

public class MemberAccess implements ASTNode {
    private String instance;
    private String member;

    public MemberAccess(String instance, String member) {
        this.instance = instance;
        this.member = member;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        System.out.println("Executing MemberAccess for instance: " + instance + ", member: " + member);

        // Verifica se a instância existe na tabela de símbolos
        if (symbolTable.containsKey(instance)) {
            // Obtém o objeto associado à instância
            Object instanceObject = symbolTable.get(instance);

            // Verifica se o objeto é uma instância de ObjectInstance
            if (instanceObject instanceof ObjectInstance) {
                // Obtém o valor do membro da instância
                Object memberValue = ((ObjectInstance) instanceObject).getMember(member);

                System.out.println("Member value: " + memberValue);

                return memberValue;
            } else {
                // Se o objeto não for uma instância de ObjectInstance, você pode lançar uma exceção ou lidar de outra maneira.
                throw new RuntimeException("A instância não é um objeto válido. Tipo: " + instanceObject.getClass());
            }
        } else {
            // Se a instância não existe na tabela de símbolos, você pode lançar uma exceção ou lidar de outra maneira.
            throw new RuntimeException("A instância não foi encontrada na tabela de símbolos.");
        }
    }


}

