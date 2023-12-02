package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class FunctionCall implements ASTNode {
	private String functionName;
	private List<ASTNode> argumentList;
	private boolean hasReturnValue;

	public FunctionCall(String functionName, List<ASTNode> argumentList, boolean hasReturnValue) {
		this.functionName = functionName;
		this.argumentList = argumentList;
		this.hasReturnValue = hasReturnValue;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Object declaration = symbolTable.get(functionName);
		if (declaration instanceof FunctionDeclaration) {
			// Recupera a declaração da função da tabela de símbolos
			FunctionDeclaration functionDeclaration = (FunctionDeclaration) symbolTable.get(functionName);

			// Verifica se a função está declarada
			if (functionDeclaration == null) {
				throw new RuntimeException("Função '" + functionName + "' não declarada.");
			}

			// Cria um novo escopo local para a execução da função
			Map<String, Object> localSymbolTable = functionDeclaration.getLocalSymbolTable();

			// Verifica se o número de argumentos coincide com o número de parâmetros
			if (argumentList != null && functionDeclaration.getParameterList().size() != argumentList.size()) {
				throw new RuntimeException(
						"Número inválido de argumentos na chamada da função '" + functionName + "'.");
			}

			// Atribui os argumentos aos parâmetros
			if (argumentList != null) {
				for (int i = 0; i < functionDeclaration.getParameterList().size(); i++) {
					Parameter parameter = functionDeclaration.getParameterList().get(i);
					ASTNode argument = argumentList.get(i);

					if (!isTypeCompatible(parameter.getType(), argument.execute(symbolTable))) {
						throw new RuntimeException(
								"Tipos de dados incompatíveis passados como argumentos para a função '" + functionName
										+ "'.");
					}

					localSymbolTable.put(parameter.getName(), argument.execute(symbolTable));
				}
			}

			// Executa o corpo da função
			for (ASTNode node : functionDeclaration.getBody()) {
				node.execute(localSymbolTable);
			}

		} else if (declaration instanceof FunctionReturnDeclaration) {
			// Recupera a declaração da função da tabela de símbolos
			FunctionReturnDeclaration functionDeclaration = (FunctionReturnDeclaration) symbolTable.get(functionName);

			// Verifica se a função está declarada
			if (functionDeclaration == null) {
				throw new RuntimeException("Função '" + functionName + "' não declarada.");
			}

			// Cria um novo escopo local para a execução da função
			Map<String, Object> localSymbolTable = functionDeclaration.getLocalSymbolTable();

			// Verifica se o número de argumentos coincide com o número de parâmetros
			if (argumentList != null && functionDeclaration.getParameterList().size() != argumentList.size()) {
				throw new RuntimeException(
						"Número inválido de argumentos na chamada da função '" + functionName + "'.");
			}

			// Atribui os argumentos aos parâmetros
			if (argumentList != null) {
				for (int i = 0; i < functionDeclaration.getParameterList().size(); i++) {
					Parameter parameter = functionDeclaration.getParameterList().get(i);
					ASTNode argument = argumentList.get(i);

					if (!isTypeCompatible(parameter.getType(), argument.execute(symbolTable))) {
						throw new RuntimeException(
								"Tipos de dados incompatíveis passados como argumentos para a função '" + functionName
										+ "'.");
					}

					localSymbolTable.put(parameter.getName(), argument.execute(symbolTable));
			}
			}

			// Executa o corpo da função
			for (ASTNode node : functionDeclaration.getBody()) {
				node.execute(localSymbolTable);
			}

			// Retorna o valor de retorno da função
			Object returnValue = functionDeclaration.getReturnStatement().execute(localSymbolTable);
			
			if (!isTypeCompatible(functionDeclaration.getReturnType(), returnValue)) {
	            throw new RuntimeException("Tipo de retorno incompatível para a função '" + functionName + "'.");
	        }

	        return returnValue;
		}

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

	public String getFunctionName() {
		return functionName;
	}

	public List<ASTNode> getArgumentList() {
		return argumentList;
	}

	public boolean isHasReturnValue() {
		return hasReturnValue;
	}

}
