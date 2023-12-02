grammar Komodo;

@parser::header {
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Collections;
	import br.edu.unifg.compiladores.komodov2.ast.*;
}

@parser::members {
	    Map<String, Object> symbolTable = new HashMap<String, Object>();
    	List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String, Object> varSymbolTable = new HashMap<String, Object>();
		Map<String, Object> functionSymbolTable = new HashMap<String, Object>();
		
		private List<Parameter> getClassParameters(String className) {
		    Object classDeclaration = symbolTable.get(className);
		    if (classDeclaration instanceof ClassDeclaration) {
		        return ((ClassDeclaration) classDeclaration).getParameters();
		    }
		    return new ArrayList<>();
		}
}

start:
    (statement {body.add($statement.node);})*
    {
        for(ASTNode n : body) {
            n.execute(symbolTable);
        }
    };

statement returns [ASTNode node]:
		   printStatement {$node = $printStatement.node;}
		   | inputStatement {$node = $inputStatement.node;}
		   | whileStatement {$node = $whileStatement.node;}
		   | varDeclarationStatement {$node = $varDeclarationStatement.node;}
		   | varAssignStatement {$node = $varAssignStatement.node;}
		   | functionDeclaration {$node = $functionDeclaration.node;}
		   | functionCallStatement {$node = $functionCallStatement.node;}
		   | functionWithReturnDeclaration {$node = $functionWithReturnDeclaration.node;}
		   | conditional {$node = $conditional.node;}
		   | classDeclaration {$node = $classDeclaration.node;}
		   | objectDeclaration {$node = $objectDeclaration.node;}
		   | methodCall {$node = $methodCall.node;}
		   | commentStatement;

printStatement returns [ASTNode node]:
    PRINT OPENPAREN expr=logicalExpression CLOSEPAREN SEMICOLON
    {
        $node = new PrintStatement($expr.node);
    }
    |
    PRINT OPENPAREN { System.out.println(); } CLOSEPAREN SEMICOLON
    ;

conditional returns [ASTNode node]:
    IF OPENPAREN ifLogicalExpression=logicalExpression CLOSEPAREN
    {
        List<ASTNode> ifBody = new ArrayList<ASTNode>();
        List<ASTNode> elseBody = new ArrayList<ASTNode>();
        List<ElifNode> elifNodes = new ArrayList<ElifNode>();
    }
    OPENBRACE
        (s1 = statement {ifBody.add($s1.node);})*
    CLOSEBRACE
(
        (ELIF OPENPAREN elifLogicalExpression=logicalExpression CLOSEPAREN
            { List<ASTNode> elifBody = new ArrayList<ASTNode>(); }
            OPENBRACE
                (s2 = statement {elifBody.add($s2.node);})*
            CLOSEBRACE
            { ElifNode elifNode = new ElifNode($elifLogicalExpression.node, elifBody); elifNodes.add(elifNode); }
        )+
    )?
    (
        ELSE OPENBRACE 
            (s3 = statement {elseBody.add($s3.node);})* 
        CLOSEBRACE
    )?
    {
        $node = new If($ifLogicalExpression.node, ifBody, elifNodes, elseBody);
    };

    
varDeclarationStatement returns [ASTNode node]
    : VAR ID DOUBLEDOT dt=dataType SEMICOLON
    {
        varSymbolTable.put($ID.text, $dt.type);
        $node = new VarDeclaration($ID.text, $dt.type);
    }
    | VAR ID DOUBLEDOT dt=dataType ASSIGN logicalExpression SEMICOLON
    {
        varSymbolTable.put($ID.text, $dt.type);
        $node = new VarAssignDirectly($ID.text, $dt.type, $logicalExpression.node);
    }
    ;

dataType returns [String type]: 
    STRING {$type = "string";}
    | NUMBER {$type = "number";} 
    | BOOLEAN {$type = "boolean";}
    ;

varAssignStatement returns [ASTNode node]:
    ID ASSIGN logicalExpression SEMICOLON
    {
        String declaredType = (String) varSymbolTable.get($ID.text);
        $node = new VarAssignment($ID.text, $logicalExpression.node, declaredType);
    }
    ;
 
inputStatement returns [ASTNode node]:
    INPUT OPENPAREN variableName=ID CLOSEPAREN SEMICOLON
    {
        String declaredType = (String) varSymbolTable.get($variableName.text);
        $node = new InputStatement($variableName.text, declaredType);
    }
    ;


/*================= Funções ======================*/
functionDeclaration returns [ASTNode node]:
	// Função com parâmetros porém sem retorno
    FUNCTION ID OPENPAREN parameterList CLOSEPAREN
    OPENBRACE 
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
        List<Parameter> parameterList = $parameterList.list;
    }
    	(s = statement {body.add($s.node);})*
    	{$node = new FunctionDeclaration($ID.text, body, localSymbolTable, parameterList);}
    CLOSEBRACE
    {
            functionSymbolTable.put($ID.text, new FunctionDeclaration($ID.text, body, localSymbolTable, null));
    }
    |
    // Função sem parâmetros e sem retorno
    FUNCTION ID OPENPAREN CLOSEPAREN
    OPENBRACE 
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
    }
    	(s = statement {body.add($s.node);})*
    	{$node = new FunctionDeclaration($ID.text, body, localSymbolTable, null);}
    CLOSEBRACE
    {
            functionSymbolTable.put($ID.text, new FunctionDeclaration($ID.text, body, localSymbolTable, null));
    }
;

functionWithReturnDeclaration returns [ASTNode node]:
    FUNCTION ID OPENPAREN parameterList CLOSEPAREN returnType
    OPENBRACE
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
        List<Parameter> parameterList = $parameterList.list;
        ASTNode returnStatement = null;
    }
    (s = statement {body.add($s.node);})*
    (r = returnStatement {returnStatement = $r.node;} )
    {$node = new FunctionReturnDeclaration($ID.text, body, localSymbolTable, parameterList, $returnType.type, returnStatement);}
    CLOSEBRACE
    {
        functionSymbolTable.put($ID.text, new FunctionReturnDeclaration($ID.text, body, localSymbolTable, parameterList, $returnType.type, returnStatement));
    }
    |
    FUNCTION ID OPENPAREN CLOSEPAREN returnType
    OPENBRACE
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
        Map<String, Object> localSymbolTable = new HashMap<String, Object>();
        ASTNode returnStatement = null;
    }
    (s = statement {body.add($s.node);})*
    (r = returnStatement {returnStatement = $r.node;} )
    {$node = new FunctionReturnDeclaration($ID.text, body, localSymbolTable, null, $returnType.type, returnStatement);}
    CLOSEBRACE
    {
    	functionSymbolTable.put($ID.text, new FunctionReturnDeclaration($ID.text, body, localSymbolTable, null, $returnType.type, returnStatement));
    }
    ;
    
parameterList returns [List<Parameter> list]:
    {List<Parameter> params = new ArrayList<Parameter>();}
    (p = parameter {params.add($p.param);} (COMMA p = parameter {params.add($p.param);})*)
    {$list = params;}
;

parameter returns [Parameter param]: 
    ID DOUBLEDOT dt=dataType 
    {$param = new Parameter($dt.type, $ID.text);}
;

returnType returns [String type]:
    DOUBLEDOT dt=dataType
    {
        $type = $dt.type;
    };


returnStatement returns [ASTNode node]:
    ret = RETURN expr=logicalExpression SEMICOLON
    {
        $node = new ReturnStatement($expr.node);
    }
    ;
    

functionCallStatement returns [ASTNode node]
    :
    ID OPENPAREN CLOSEPAREN SEMICOLON
        {
            // Verifica se há uma declaração de função com retorno associada à função na tabela de símbolos
            Object declaration = functionSymbolTable.get($ID.text);

            if (declaration instanceof FunctionReturnDeclaration) {
                // Se houver um retorno, cria uma instância de FunctionReturnCall
                $node = new FunctionCall($ID.text, null, true);
            } else if (declaration instanceof FunctionDeclaration) {
                // Se não houver um retorno, cria uma instância de FunctionCall
                $node = new FunctionCall($ID.text, null, false);
            }
        }
    |
    ID OPENPAREN argumentList CLOSEPAREN SEMICOLON
        {
           	Object declaration = functionSymbolTable.get($ID.text);

            if (declaration instanceof FunctionReturnDeclaration) {
                // Se houver um retorno, cria uma instância de FunctionReturnCall
                $node = new FunctionCall($ID.text, $argumentList.list, true);
            } else if (declaration instanceof FunctionDeclaration) {
                // Se não houver um retorno, cria uma instância de FunctionCall
                $node = new FunctionCall($ID.text, $argumentList.list, false);
            }
        }
    ;

/*================= Fim Funções ======================*/

commentStatement: BLOCK_COMMENT | COMMENT_LINE;

whileStatement returns [ASTNode node]: WHILE OPENPAREN logicalExpression CLOSEPAREN
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	OPENBRACE (s1 = statement {body.add($s1.node);})* CLOSEBRACE
	{
		$node = new WhileLoop($logicalExpression.node, body);
	}
;

logicalExpression returns [ASTNode node]:
	logicalOrExpression {$node = $logicalOrExpression.node;}
	| logicalAndExpression {$node = $logicalAndExpression.node;}
	| NOT logicalExpression {$node = new LogicalNot($logicalExpression.node);}
	| memberAccess {$node = $memberAccess.node;}
	;
	
logicalOrExpression returns [ASTNode node]: 
    logicalAndExpression {$node = $logicalAndExpression.node;}
    (OR right=logicalAndExpression {$node = new LogicalOr($node, $right.node);})*
    ;

logicalAndExpression returns [ASTNode node]: 
    equalityExpression {$node = $equalityExpression.node;}
    (AND right=equalityExpression {$node = new LogicalAnd($node, $right.node);})*
    ;

equalityExpression returns [ASTNode node]: 
    relationalExpression {$node = $relationalExpression.node;}
    (equalityOperators right=relationalExpression {$node = new EqualityExpression($node, $right.node, $equalityOperators.text);})*
    ;

relationalExpression returns [ASTNode node]: 
    additiveExpression {$node = $additiveExpression.node;}
    (relationalOperators right=additiveExpression {$node = new RelationalExpression($node, $right.node, $relationalOperators.text);})*
    ;

additiveExpression returns [ASTNode node]: 
    multiplicativeExpression {$node = $multiplicativeExpression.node;}
    (additiveOperators right=multiplicativeExpression {$node = new AdditiveExpression($node, $right.node, $additiveOperators.text);})*
    ;

multiplicativeExpression returns [ASTNode node]: 
    unaryExpression {$node = $unaryExpression.node;}
    (multiplicativeOperators right=unaryExpression {$node = new MultiplicativeExpression($node, $right.node, $multiplicativeOperators.text);})*
    ;
  
unaryExpression returns [ASTNode node]: 
    additiveOperators operand=unaryExpression {$node = new UnaryExpression($additiveOperators.text, $operand.node);}
    | primaryExpression {$node = $primaryExpression.node;}
    ;
        
primaryExpression returns [ASTNode node]:
    logicalNotExpression {$node = $logicalNotExpression.node;} 
    | INTEGER_LITERAL {$node = new Constant(Integer.parseInt($INTEGER_LITERAL.text));}
    | BOOL {$node = new Constant(Boolean.parseBoolean($BOOL.text));}
    | STRING_LITERAL {$node = new Constant($STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));}
    | FLOAT_LITERAL {$node = new Constant(Float.parseFloat($FLOAT_LITERAL.text));}
    | ID {$node = new VarReference($ID.text);}
    | ADD primaryExpression
        {
            $node = new Concatenation(null, $primaryExpression.node);
        }
    | OPENPAREN expr=logicalExpression CLOSEPAREN {$node = $expr.node;}
    | (ID OPENPAREN argumentList CLOSEPAREN {
    	 boolean hasReturnValue = false;
            // Verifica se há uma declaração de função com retorno associada à função na tabela de símbolos
            FunctionReturnDeclaration returnDeclaration = (FunctionReturnDeclaration) symbolTable.get($ID.text);

            if (returnDeclaration != null) {
                // Se houver um retorno, cria uma instância de FunctionReturnCall
                $node = new FunctionCall($ID.text, $argumentList.list, true);
            } else {
                // Se não houver um retorno, cria uma instância de FunctionCall
                $node = new FunctionCall($ID.text, $argumentList.list, false);
            }
    }
    |
    (
    	ID OPENPAREN CLOSEPAREN {
    		boolean hasReturnValue = false;
            // Verifica se há uma declaração de função com retorno associada à função na tabela de símbolos
            FunctionReturnDeclaration returnDeclaration = (FunctionReturnDeclaration) symbolTable.get($ID.text);

            if (returnDeclaration != null) {
                // Se houver um retorno, cria uma instância de FunctionReturnCall
                $node = new FunctionCall($ID.text, null, true);
            } else {
                // Se não houver um retorno, cria uma instância de FunctionCall
                $node = new FunctionCall($ID.text, null, false);
            }
    	}
    )
   )
   ;
logicalNotExpression returns [ASTNode node]:
	NOT operand=primaryExpression {$node = new LogicalNot($operand.node);}
	;

/* Operadores das Expressões */
additiveOperators: (ADD | SUB);
multiplicativeOperators: (MUL | DIV);
relationalOperators: (GREATERTHAN | LESSTHAN | GREATERTHANEQUALS | LESSTHANEQUALS);
equalityOperators: (EQUALS | NOTEQUALS);

concatenationExpression: logicalExpression (ADD logicalExpression)*;

/* Classes e Objetos */
// TODO: Configure aqui
classMemberDeclaration returns [ASTNode node]: 
    classVarDeclaration {$node = $classVarDeclaration.node;}
    | constructorDeclaration {$node = $constructorDeclaration.node;}
    | methodDeclaration {$node = $methodDeclaration.node;}
    ;

classDeclaration returns [ASTNode node]:
    CLASS className=CLASS_NAME OPENBRACE
        (classMemberDeclaration {body.add($classMemberDeclaration.node);})*
    CLOSEBRACE
    {
        // Extract parameters from classVarDeclarations, constructorDeclarations, and methodDeclarations
        List<Parameter> parameters = new ArrayList<>();
        List<ASTNode> body = new ArrayList<>();

        for (ASTNode member : body) {
            if (member instanceof ClassVarDeclaration) {
                parameters.add(((ClassVarDeclaration) member).getParameter());
            } else if (member instanceof ConstructorDeclaration) {
                parameters.addAll(((ConstructorDeclaration) member).getParameters());
            } else if (member instanceof MethodDeclaration) {
                body.add(member);
            }
        }

        // Create a new ClassDeclaration instance
        ClassDeclaration classDeclaration = new ClassDeclaration($className.text, body, parameters);

        // Add members to the class
        for (ASTNode member : body) {
            if (member instanceof ClassVarDeclaration) {
                classDeclaration.addMember(((ClassVarDeclaration) member).getVariableName(), member);
            }
        }

        $node = classDeclaration;

        // Put the class declaration in the symbolTable
        symbolTable.put($className.text, $node);
    }
    ;

classVarDeclaration returns [ASTNode node]
    : VAR variableName=ID DOUBLEDOT dt=dataType SEMICOLON
    {
        $node = new ClassVarDeclaration($variableName.text, $dt.type);
    };

constructorDeclaration returns [ASTNode node]
    : CONSTRUCTOR OPENPAREN parameterList? CLOSEPAREN constructorBody
    {
        int parameterCount = $parameterList.list.size();
        $node = new ConstructorDeclaration($parameterList.list, $constructorBody.node, parameterCount);
    }
    ;

constructorBody returns [List<ASTNode> node]
    : OPENBRACE 
        (constructorAssignment {body.add($constructorAssignment.node);})* 
      CLOSEBRACE
    | /* empty body */
    {
        $node = null; // Return null for an empty body
    }
    ;

constructorAssignment returns [ASTNode node]
    : thisNameUsage ASSIGN variableName=ID SEMICOLON
    {
        $node = new ConstructorAssignment($thisNameUsage.text, $variableName.text);
    }
    ;

methodDeclaration returns [ASTNode node]: METHOD ID OPENPAREN parameterList CLOSEPAREN OPENBRACE
				{
					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> localSymbolTable = new HashMap<String, Object>();
					List<Parameter> parameterList = $parameterList.list;
				}
					(s = statement {body.add($s.node);})* CLOSEBRACE
					{$node = new MethodDeclaration($ID.text, body, localSymbolTable, parameterList, null);}
				|
				METHOD ID OPENPAREN CLOSEPAREN OPENBRACE
				{
					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> localSymbolTable = new HashMap<String, Object>();
				}
					(s = statement {body.add($s.node);})* CLOSEBRACE
					{$node = new MethodDeclaration($ID.text, body, localSymbolTable, null, null);}
				;

methodCall returns [ASTNode node]:
    ID DOT methodName=ID OPENPAREN argumentList CLOSEPAREN SEMICOLON
    {
        $node = new MethodCall($ID.text, $methodName.text, $argumentList.list, $ID.text);
    }
    | ID DOT methodName=ID OPENPAREN CLOSEPAREN SEMICOLON
    {
        $node = new MethodCall($ID.text, $methodName.text, null, $ID.text);
    }
    ;

thisNameUsage: THIS DOT ID;

objectDeclaration returns [ASTNode node]
    : VAR instanceName=ID ASSIGN NEW className=CLASS_NAME OPENPAREN arguments=argumentList CLOSEPAREN SEMICOLON
    {
        $node = new ObjectDeclaration($className.text, $arguments.list, new HashMap<>());
        symbolTable.put($instanceName.text, $node);
    }
    ;

memberAccess returns [ASTNode node]
    : ID DOT memberName=ID SEMICOLON
      {
          $node = new MemberAccess($ID.text, $memberName.text);
      }
      | instanceMemberAccess
    ;

instanceMemberAccess returns [ASTNode node]
    : ID DOT memberName=ID SEMICOLON
      {
          $node = new InstanceMemberAccess($ID.text, $memberName.text);
      }
    ;


/* Fim Classe */

argumentList returns [List<ASTNode> list]
    : (e = logicalExpression { $list = new ArrayList<>(); $list.add($e.node); } (COMMA e = logicalExpression { $list.add($e.node); })* )?
    ;
    
// Palavras-Chaves
CLASS: 'class';
CONSTRUCTOR: 'constructor';
METHOD: 'method';
VAR: 'var';
STRING: 'string';
NUMBER: 'number';
BOOLEAN: 'boolean';
IF: 'if';
IMPORT: 'import';
ELSE: 'else';
ELIF: 'elif';
WHILE: 'while';
RETURN: 'return';
FUNCTION: 'function';
INPUT: 'input';
PRINT: 'print';
NULL: 'null';
NEW: 'new';
THIS: 'this';

// Delimitadores
OPENBRACE: '{';
CLOSEBRACE: '}';
OPENBRACK: '[';
CLOSEBRACK: ']';
OPENPAREN: '(';
CLOSEPAREN: ')';
SEMICOLON: ';';
DOUBLEQUOTE: '"';
DOUBLEDOT: ':';
DOT: '.';
COMMA: ',';

// Operadores Comparativos
LESSTHAN: '<';
GREATERTHAN: '>';
LESSTHANEQUALS: '<=';
GREATERTHANEQUALS: '>=';
EQUALS: '==';
NOTEQUALS: '!=';

// Operações Aritméticas
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

// Operadores de Atribuição
ASSIGN: '=';

// Operadores Lógicos
AND: '&&';
OR: '||';
NOT: '!';

// Identificadores
BOOL: 'true' | 'false';
INTEGER_LITERAL: '-'? [0-9]+;
FLOAT_LITERAL: '-'? [0-9]+ '.' [0-9]+;
STRING_LITERAL: '"' ~["\r\n"]* '"';
CLASS_NAME: [A-Z][a-zA-Z0-9]*;
ID: [a-zA-Z_][a-zA-Z0-9_]*;


// Espaços em branco e comentários
ESC_SEQ: '\\\'';
WS: [ \t\r\n]+ -> skip;

BLOCK_COMMENT: '/*' .*? '*/' -> skip;
COMMENT_LINE: '//' ~[\r\n]* -> skip;
