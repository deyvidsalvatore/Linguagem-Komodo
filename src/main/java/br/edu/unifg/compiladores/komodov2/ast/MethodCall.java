package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class MethodCall implements ASTNode {
	private String objectName;
	private String methodName;
	private List<ASTNode> argumentList;
	private String className;

	public MethodCall(String objectName, String methodName, List<ASTNode> argumentList, String className) {
		this.objectName = objectName;
		this.methodName = methodName;
		this.argumentList = argumentList;
		this.className = className;
	}

	@SuppressWarnings("unused")
	@Override
	public Object execute(Map<String, Object> symbolTable) {
	    MethodDeclaration procedureDeclaration = (MethodDeclaration) symbolTable.get(methodName);

	    if (procedureDeclaration == null) {
	        throw new RuntimeException("Method '" + methodName + "' not declared.");
	    }

	    List<Parameter> parameterList = procedureDeclaration.getParameterList();

	    if (argumentList != null && argumentList.size() != parameterList.size()) {
	        throw new RuntimeException("Invalid number of parameters passed to method call '" + methodName + "'.");
	    }

	    // Check if the argument list is empty
	    if (argumentList == null || argumentList.isEmpty()) {
	        for (ASTNode node : procedureDeclaration.getBody()) {
	            node.execute(procedureDeclaration.getLocalSymbolTable());
	        }
	        return null;
	    }

	    // Execute the method with the provided arguments
	    return executeWithArguments(symbolTable, procedureDeclaration, procedureDeclaration.getLocalSymbolTable());
	}

	private Object executeWithArguments(Map<String, Object> symbolTable, MethodDeclaration procedureDeclaration,
	        Map<String, Object> localSymbolTable) {

	    List<Parameter> parameterList = procedureDeclaration.getParameterList();

	    for (int i = 0; i < parameterList.size(); i++) {
	        Parameter parameter = parameterList.get(i);
	        Object argumentValue = argumentList.get(i).execute(localSymbolTable);

	        if (argumentValue == null) {
	            throw new RuntimeException("A null argument was passed to method '" + methodName + "'.");
	        }

	        if (!isTypeCompatible(parameter.getType(), argumentValue)) {
	            throw new RuntimeException("The data types passed as parameters are incompatible for method '" + methodName + "'.");
	        }

	        localSymbolTable.put(parameter.getName(), argumentValue);
	    }

	    // Execute the body of the procedure
	    for (ASTNode node : procedureDeclaration.getBody()) {
	        node.execute(localSymbolTable);
	    }

	    // Return null, since the procedure does not return a value
	    return null;
	}

	private boolean isTypeCompatible(String declaredType, Object assignedValue) {
	    if ("number".equals(declaredType) && (assignedValue instanceof Integer || assignedValue instanceof Float)) {
	        return true;
	    } else if ("boolean".equals(declaredType) && assignedValue instanceof Boolean) {
	        return true;
	    } else if ("string".equals(declaredType) && assignedValue instanceof String) {
	        return true;
	    }
	    return false;
	}


	public String getObjectName() {
		return objectName;
	}

	public String getMethodName() {
		return methodName;
	}

	public List<ASTNode> getArgumentList() {
		return argumentList;
	}

	public String getClassName() {
		return className;
	}
}
