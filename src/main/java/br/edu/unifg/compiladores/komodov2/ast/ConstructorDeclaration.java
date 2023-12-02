package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class ConstructorDeclaration implements ASTNode {
    private List<Parameter> parameters;
    private List<ASTNode> constructorBody;
    private int maxAllowedArguments;

    public ConstructorDeclaration(List<Parameter> parameters, List<ASTNode> constructorBody, int maxAllowedArguments) {
        this.parameters = parameters;
        this.constructorBody = constructorBody;
        this.maxAllowedArguments = maxAllowedArguments;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        // Process parameters
        for (Parameter parameter : parameters) {
            parameter.execute(symbolTable);
        }

        // Execute constructor assignments
        if (constructorBody != null) {
            for (ASTNode assignment : constructorBody) {
                assignment.execute(symbolTable);
            }
        }

        return null;
    }
    
    public List<Parameter> getParameters() {
		return parameters;
	}

	public int getParameterCount() {
        return parameters.size();
    }
    
    public int getMaxAllowedArguments() {
        return maxAllowedArguments;
    }
    
    public void setMaxAllowedArguments(int arguments) {
        this.maxAllowedArguments = arguments;
    }
}
