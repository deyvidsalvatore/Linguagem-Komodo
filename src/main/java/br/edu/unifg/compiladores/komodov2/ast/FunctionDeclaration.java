package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class FunctionDeclaration implements ASTNode {

	protected String functionName;
    protected List<ASTNode> body;
    protected Map<String, Object> localSymbolTable;
    protected List<Parameter> parameterList;

    public FunctionDeclaration(String functionName, List<ASTNode> body, Map<String, Object> localSymbolTable,
			List<Parameter> parameterList) {
		this.functionName = functionName;
		this.body = body;
		this.localSymbolTable = localSymbolTable;
		this.parameterList = parameterList;
	}

	@Override
    public Object execute(Map<String, Object> symbolTable) {
		if (symbolTable.containsKey(functionName)) {
			throw new RuntimeException("Function " + functionName + " already cleared!");
		}
    	if (parameterList != null) {
	    	for (Parameter i : parameterList) {
	    		localSymbolTable.put(i.getName(), i.getType());
	    	}
    	}
        symbolTable.put(functionName, this);

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
    
}