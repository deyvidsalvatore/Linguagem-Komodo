package br.edu.unifg.compiladores.komodov2.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectInstance implements ASTNode {
    private String className;
    private Map<String, Object> members;

    public ObjectInstance(String className, Map<String, Object> members) {
        this.className = className;
        this.members = members;
    }

    public String getClassName() {
        return className;
    }

    public Object getMember(String memberName) {
        if (members.containsKey(memberName)) {
            return members.get(memberName);
        } else {
            throw new RuntimeException("Member '" + memberName + "' not found in object of class '" + className + "'.");
        }
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Retrieve the class declaration from the symbol table
        ClassDeclaration classDeclaration = (ClassDeclaration) symbolTable.get(className);

        // Check if the class is defined in the symbol table
        if (classDeclaration == null) {
            throw new RuntimeException("Error: Class " + className + " not found in symbol table.");
        }

        // Use the new method to get the class members list
        List<ASTNode> classMembers = classDeclaration.getClassMembers();

        // Initialize the members map
        members = new HashMap<>();

        // Iterate through the class members and add them to the members map
        for (ASTNode member : classMembers) {
            if (member instanceof ClassVarDeclaration) {
                ClassVarDeclaration classVarDeclaration = (ClassVarDeclaration) member;
                String varName = classVarDeclaration.getVariableName();

                // Retrieve the value of the class variable from the symbol table
                Object varValue = symbolTable.get(varName);

                // Add the class variable and its value to the members map
                members.put(varName, varValue);
            }
        }

        return null;
    }
}
