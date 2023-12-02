package br.edu.unifg.compiladores.komodov2.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassDeclaration implements ASTNode {
	private String className;
	private List<ASTNode> classMembers;
	private List<Parameter> parameters;

	private Map<String, Object> localSymbolTable = new HashMap<>();

	public ClassDeclaration(String className, List<ASTNode> classMembers, List<Parameter> parameters) {
		this.className = className;
		this.classMembers = new ArrayList<>(classMembers); // Inicialize a lista com os membros passados como parâmetro
		this.parameters = parameters;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		// Check if the execute method has already been called for this instance
		if (symbolTable.containsKey(className)) {
			// Skip execution to prevent an infinite loop
			return null;
		}

		localSymbolTable.clear();

		// Add the ClassDeclaration object to the local symbol table
		localSymbolTable.put(className, this);

		// Execute class members
		for (ASTNode member : classMembers) {
			member.execute(localSymbolTable);

			// If the member is a variable declaration, add it to the class
			if (member instanceof ClassVarDeclaration) {
				ClassVarDeclaration classVarDeclaration = (ClassVarDeclaration) member;
				addMember(classVarDeclaration.getVariableName(), member);
			}
		}

		return null;
	}

	public String getClassName() {
		return className;
	}

	public List<ASTNode> getClassMembers() {
		return classMembers;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void addMember(String memberName, ASTNode member) {
		// Add a member to the class
		classMembers.add(member);
		localSymbolTable.put(className + "." + memberName, member);
	}

	public int getVarIndex(String varName) {
		for (int i = 0; i < classMembers.size(); i++) {
			ASTNode member = classMembers.get(i);
			if (member instanceof ClassVarDeclaration) {
				ClassVarDeclaration classVarDeclaration = (ClassVarDeclaration) member;
				if (classVarDeclaration.getVariableName().equals(varName)) {
					return i;
				}
			}
		}
		return -1;
	}
}
