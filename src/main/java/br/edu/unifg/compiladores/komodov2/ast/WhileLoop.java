package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class WhileLoop implements ASTNode {
	private List<ASTNode> whileBody;
	private ASTNode logicalExpression;
	
	public WhileLoop(ASTNode logicalExpression, List<ASTNode> whileBody) {
		this.logicalExpression = logicalExpression;
		this.whileBody = whileBody;
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		while((boolean)logicalExpression.execute(symbolTable)) {
			for(ASTNode node : whileBody) {
				node.execute(symbolTable);
			}
		}
		return null;
	}

}
