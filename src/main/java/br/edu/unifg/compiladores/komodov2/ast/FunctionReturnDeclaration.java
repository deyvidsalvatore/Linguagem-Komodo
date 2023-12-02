package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class FunctionReturnDeclaration implements ASTNode {

    private String functionName;
    private List<ASTNode> body;
    private Map<String, Object> localSymbolTable;
    private List<Parameter> parameterList;
    private String returnType;
    private ASTNode returnStatement;

    public FunctionReturnDeclaration(String functionName, List<ASTNode> body, Map<String, Object> localSymbolTable,
            List<Parameter> parameterList, String returnType, ASTNode returnStatement) {
        this.functionName = functionName;
        this.body = body;
        this.localSymbolTable = localSymbolTable;
        this.parameterList = parameterList;
        this.returnType = returnType;
        this.returnStatement = returnStatement;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
    	if (symbolTable.containsKey(functionName)) {
			throw new RuntimeException("Function " + functionName + " already cleared!");
		}
    	
        if (parameterList != null) {
            for (Parameter parameter : parameterList) {
                localSymbolTable.put(parameter.getName(), parameter.getType());
            }
        }
        symbolTable.put(functionName, this);
        
        // Execute the return statement if present
        if (returnStatement != null) {
            Object returnValue = returnStatement.execute(localSymbolTable);

            return returnValue;
        } else {
        	throw new RuntimeException("Expected a Return Statement of " + returnType);
        }

    }

    public String getReturnType() {
        return returnType;
    }

	public String getFunctionName() {
		return functionName;
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

	public ASTNode getReturnStatement() {
		return returnStatement;
	}
    
}
