package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class MethodDeclaration implements ASTNode {

	private String methodName;
    private List<ASTNode> body;
    private Map<String, Object> localSymbolTable;
    private List<Parameter> parameterList;
    private String className;

	public MethodDeclaration(String methodName, List<ASTNode> body, Map<String, Object> localSymbolTable,
			List<Parameter> parameterList, String className) {
		this.methodName = methodName;
		this.body = body;
		this.localSymbolTable = localSymbolTable;
		this.parameterList = parameterList;
		this.className = className;
	}

	@Override
    public Object execute(Map<String, Object> symbolTable) {
    	if (parameterList != null) {
	    	for (Parameter i : parameterList) {
	    		localSymbolTable.put(i.getName(), i.getType());
	    	}
    	}
        symbolTable.put(methodName, this);

        return null;
    }
    
    public List<ASTNode> getBody() {
        return body;
    }

    public Map<String, Object> getLocalSymbolTable() {
        return localSymbolTable;
    }

	public List<Parameter> getParameterList() {
		return parameterList;
	}

	public String getMethodName() {
		return methodName;
	}

	public String getClassName() {
		return className;
	}
	
	
    
}