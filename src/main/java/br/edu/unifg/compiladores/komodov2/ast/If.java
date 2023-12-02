package br.edu.unifg.compiladores.komodov2.ast;

import java.util.Map;
import java.util.List;

public class If implements ASTNode {
    private ASTNode logicalExpression;
    private List<ASTNode> ifBody;
    private List<ElifNode> elifNodes;
    private List<ASTNode> elseBody;

    public If(ASTNode logicalExpression, List<ASTNode> ifBody, List<ElifNode> elifNodes, List<ASTNode> elseBody) {
        this.logicalExpression = logicalExpression;
        this.ifBody = ifBody;
        this.elifNodes = elifNodes;
        this.elseBody = elseBody;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if ((boolean) logicalExpression.execute(symbolTable)) {
            for (ASTNode node : ifBody) {
                node.execute(symbolTable);
            }
        } else {
            boolean elifConditionMet = false;

            for (ElifNode elifNode : elifNodes) {
                if ((boolean) elifNode.getLogicalExpression().execute(symbolTable)) {
                    for (ASTNode node : elifNode.getBody()) {
                        node.execute(symbolTable);
                    }
                    elifConditionMet = true;
                    break;
                }
            }

            if (!elifConditionMet) {
                for (ASTNode node : elseBody) {
                    node.execute(symbolTable);
                }
            }
        }

        return null;
    }
}
