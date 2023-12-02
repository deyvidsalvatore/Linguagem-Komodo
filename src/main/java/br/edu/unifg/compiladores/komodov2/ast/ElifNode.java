package br.edu.unifg.compiladores.komodov2.ast;

import java.util.List;
import java.util.Map;

public class ElifNode implements ASTNode {
    private ASTNode logicalExpression;
    private List<ASTNode> body;

    public ElifNode(ASTNode logicalExpression, List<ASTNode> body) {
        this.logicalExpression = logicalExpression;
        this.body = body;
    }

    public ASTNode getLogicalExpression() {
        return logicalExpression;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Implemente a lógica de execução conforme necessário
        return null;
    }
}

