package br.edu.unifg.compiladores.komodov2.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObjectDeclaration implements ASTNode {
    private String className;
    private List<ASTNode> arguments;
    private Map<String, Object> objectMembers;

    public ObjectDeclaration(String className, List<ASTNode> arguments, Map<String, Object> objectMembers) {
        this.className = className;
        this.arguments = arguments;
        this.objectMembers = objectMembers;
    }

    public Map<String, Object> getObjectMembers() {
        return objectMembers;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        // Verifica se a classe está definida no símbolo
        if (!symbolTable.containsKey(className)) {
            throw new RuntimeException("Error: Class " + className + " not defined.");
        }

        // Recupera a classe da tabela de símbolos
        ClassDeclaration classDeclaration = (ClassDeclaration) symbolTable.get(className);

        // Obtém os valores dos argumentos
        List<Object> argumentValues = new ArrayList<>();
        for (ASTNode argument : arguments) {
            Object argumentValue = argument.execute(symbolTable);
            argumentValues.add(argumentValue);
        }

        ObjectInstance objectInstance = new ObjectInstance(className, objectMembers);

        // Adiciona o novo objeto à tabela de símbolos antes de executar os membros
        symbolTable.put(objectInstance.getClassName(), objectInstance);

        // Executa membros da classe no novo objeto
        for (ASTNode member : classDeclaration.getClassMembers()) {
            if (member instanceof ClassVarDeclaration) {
                ClassVarDeclaration classVarDeclaration = (ClassVarDeclaration) member;
                String varName = classVarDeclaration.getVariableName();
                // Atribui o valor do argumento correspondente ao membro da instância
                objectMembers.put(varName, argumentValues.get(classDeclaration.getVarIndex(varName)));
            }
        }

        return null;
    }
}
