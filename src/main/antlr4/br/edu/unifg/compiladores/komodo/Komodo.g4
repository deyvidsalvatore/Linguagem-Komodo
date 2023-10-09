grammar Komodo;

// Início da gramática
start: program EOF;

// Definição de um programa, composto por várias declarações
program: statement+;

// Definição das várias formas de declarações possíveis
statement: packageStatement
         | importStatement
		 | varDeclaration SEMICOLON
         | functionDeclaration
         | printStatement SEMICOLON
         | inputStatement SEMICOLON
         | ifStatement
         | whileStatement
         | expression SEMICOLON
         | assignmentStatement SEMICOLON
         | arrayAssignmentStatement SEMICOLON
         | classDeclaration
         | interfaceDeclaration;

// Regra para declarar variáveis
varDeclaration: VAR VARIABLE_NAME (DOUBLEDOT dataType)? (ASSIGN (arithmeticExpression | arrayIndexDeclaration | STRING_LITERAL | NUM | TRUE | FALSE | functionDeclaration | ARR | objectDeclaration | functionCall | methodCall | comparisonExpression | logicalExpression))?;

// Regra para redeclaração de variável
assignmentStatement: VARIABLE_NAME ASSIGN (expression | objectDeclaration | functionCall | methodCall | comparisonExpression | logicalExpression);

// Regra para redeclaração do array
arrayAssignmentStatement: arrayIndexDeclaration ASSIGN (STRING_LITERAL | NUM | functionCall | TRUE | FALSE | methodCall);

functionCall: functionName OPENPAREN arguments? CLOSEPAREN;
functionName: VARIABLE_NAME;

// Regra para declaração de objeto
objectDeclaration: NEW CLASS_NAME OPENPAREN arguments?  CLOSEPAREN;

// Regra para declaração de matriz
arrayIndexDeclaration: VARIABLE_NAME index;

index: OPENBRACE NUM CLOSEBRACE;

// Tipos de dados (Palavras reservadas): string, número, array ou booleano
dataType: STRING
        | NUMBER
        | BOOLEAN
        | arrayType;

arrayType: ARRAY dataType (OPENBRACE NUM CLOSEBRACE (OPENBRACE NUM CLOSEBRACE)?)?;


// Definição de uma expressão, que pode ser uma expressão lógica ou aritmética
expression: logicalExpression | arithmeticExpression | methodCall;

// Expressão lógica pode ser uma combinação de termos lógicos com operadores lógicos
// (x > 2 && x < 4) | (x < 2 ||  
logicalExpression: logicalTerm (AND logicalTerm)* | logicalTerm (OR logicalTerm)* | comparisonExpression;

// Um termo lógico pode ser uma comparação, uma negação ou uma expressão lógica entre parênteses
// (x > 2)
logicalTerm: comparisonExpression | NOT logicalTerm | OPENPAREN logicalExpression CLOSEPAREN | TRUE | FALSE;

// Definição de comparações
comparisonExpression: concatenation (EQUALS | NOTEQUALS | LESSTHAN | GREATERTHAN | LESSTHANEQUALS | GREATERTHANEQUALS) concatenation | concatenation;

// Concatenação de elementos
concatenation: concatenationElement (ADD concatenationElement)*;

// Elementos que podem ser concatenados: strings, números, nulos, arrays, booleanos ou variáveis
concatenationElement: STRING_LITERAL | NUM | NULL | ARR | BOOL | VARIABLE_NAME | methodCall | thisNameUsage;

// Declaração de funções
functionDeclaration: FUNCTION VARIABLE_NAME OPENPAREN parameters? CLOSEPAREN returnType? OPENBRACE functionBody? CLOSEBRACE;

// Parâmetros de função
parameters: parameter (COMMA parameter)*;

// Definição de um parâmetro
parameter: VARIABLE_NAME DOUBLEDOT dataType;

// Tipo de retorno de função
returnType: DOUBLEDOT dataType;

// Retorno de função
returnStatement: RETURN expression SEMICOLON;

// Corpo da função
functionBody: (returnStatement | statement)+;

// Comando para imprimir
printStatement: PRINT OPENPAREN expression CLOSEPAREN;

// Comando de entrada de dados
inputStatement: INPUT OPENPAREN VARIABLE_NAME CLOSEPAREN;

// Comando de decisão "if"
ifStatement: IF OPENPAREN logicalExpression CLOSEPAREN OPENBRACE (statement)* CLOSEBRACE (elifStatement)* (elseStatement)?;

// Ramo "elif" do comando "if"
elifStatement: ELIF OPENPAREN logicalExpression CLOSEPAREN OPENBRACE (statement)* CLOSEBRACE;

// Ramo "else" do comando "if"
elseStatement: ELSE OPENBRACE (statement)* CLOSEBRACE;

// Bloco 'while'
whileStatement: WHILE OPENPAREN logicalExpression CLOSEPAREN OPENBRACE (statement)* CLOSEBRACE;

// Expressões aritméticas com atribuição
// count += variavel;
// count += 2 + 2 count += 2 / 2;
arithmeticAssignmentExpression: VARIABLE_NAME ADD_ASSIGN arithmeticExpression
                           | VARIABLE_NAME SUB_ASSIGN arithmeticExpression
                           | VARIABLE_NAME MUL_ASSIGN arithmeticExpression
                           | VARIABLE_NAME DIV_ASSIGN arithmeticExpression;

// Expressões aritméticas
arithmeticExpression: addSubtractExpression
                  | arithmeticAssignmentExpression
                  | powerExpression;

// Expressões Aritméticas (/ *) - +;
// Define como a adição (+) e a subtração (-) em expressões aritméticas
// (1 / 2) * 2 + 2
// 3^6 = (3*3*3*3*3*3)
addSubtractExpression: multiplyDivideExpression ((ADD | SUB) multiplyDivideExpression)*;

// Define como a multiplicação (*) e a divisão (/) são tratadas em expressões aritméticas
multiplyDivideExpression: unaryExpression ((MUL | DIV | MOD) unaryExpression)*;

unaryExpression: ADD? primaryExpression | SUB primaryExpression;

// var x: number = (2  2); 2 + 2 
primaryExpression:  thisNameUsage| NUM | VARIABLE_NAME | OPENPAREN arithmeticExpression CLOSEPAREN;

powerExpression: (NUM | VARIABLE_NAME | thisNameUsage) POW (NUM | VARIABLE_NAME | thisNameUsage);

packageStatement: PACKAGE packagePath SEMICOLON;

packagePath: (ID | VARIABLE_NAME) (DOT (ID | VARIABLE_NAME))*;

importStatement: IMPORT importPath SEMICOLON;

importPath: ((ID | VARIABLE_NAME) (DOT (ID | VARIABLE_NAME))*) (DOT CLASS_NAME);

classMemberDeclaration: classVarDeclaration
                    | constructorDeclaration
                    | methodDeclaration;

// Regra para declarar uma classe
classDeclaration: CLASS CLASS_NAME (IMPLEMENTS CLASS_NAME)? OPENBRACE classMemberDeclaration* CLOSEBRACE;

// Regra para declarar uma interface
interfaceDeclaration: INTERFACE CLASS_NAME OPENBRACE (interfaceMethodDeclaration)*? CLOSEBRACE;

// Membro de interface pode ser um método
interfaceMethodDeclaration: METHOD methodName OPENPAREN parameters? CLOSEPAREN returnType? SEMICOLON;

// Regra para declarar variáveis de classe
classVarDeclaration: VAR VARIABLE_NAME DOUBLEDOT dataType SEMICOLON;

// Regra para declarar um construtor
constructorDeclaration: CONSTRUCTOR OPENPAREN parameterConstructor CLOSEPAREN OPENBRACE constructorBody CLOSEBRACE;

// Regra para os parâmetros do construtor
parameterConstructor: VARIABLE_NAME DOUBLEDOT dataType (COMMA VARIABLE_NAME DOUBLEDOT dataType)*;

// Corpo do construtor
constructorBody: constructorAssignment*;

// Regra para atribuições dentro do construtor
constructorAssignment: THIS DOT VARIABLE_NAME ASSIGN VARIABLE_NAME SEMICOLON;

// Regra para declarar um método
methodDeclaration: METHOD methodName OPENPAREN parameters? CLOSEPAREN returnType? OPENBRACE methodBody? CLOSEBRACE;

// Corpo do método (pode conter returnStatement e statement)
methodBody: (methodReturnStatement | statement)*;

// Regra para chamar um método
methodCall: VARIABLE_NAME DOT methodName OPENPAREN arguments? CLOSEPAREN;

methodName: VARIABLE_NAME;

// Regra para validar o uso de "this.name" dentro do corpo do método
thisNameUsage: THIS DOT VARIABLE_NAME;

// Regra para retornos de método
methodReturnStatement: RETURN expression SEMICOLON;

// Argumentos para chamadas de método
arguments: expression (COMMA expression)*;


// Regra de Arrays
// var s: array string = ["Abacaxi", "Banana", "Uva"];
// var s: string = frutas[0];
// frutas[0] = "Maçã";
// var 
// Palavras-chave da linguagem
CLASS: 'class';
CONSTRUCTOR: 'constructor';
METHOD: 'method';
PACKAGE: 'package';
INTERFACE: 'interface';
VAR: 'var';
STRING: 'string';
NUMBER: 'number';
BOOLEAN: 'boolean';
ARRAY: 'array';
IF: 'if';
IMPORT: 'import';
ELSE: 'else';
ELIF: 'elif';
WHILE: 'while';
RETURN: 'return';
GLOBAL: 'global';
FUNCTION: 'function';
INPUT: 'input';
IMPLEMENTS: 'implements';
PRINT: 'print';
NULL: 'null';
NEW: 'new';
THIS: 'this';
TRUE: 'true';
FALSE: 'false';
POW: '^';

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
MOD: '%';

// Operadores de Atribuição
ASSIGN: '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';

// Operadores Lógicos
AND: '&&';
OR: '||';
NOT: '!';

// Espaços em branco e comentários
ESC_SEQ: '\\\'';
WS: [ \t\r\n]+ -> skip;

BLOCK_COMMENT: '/' .? '*/' -> skip;
COMMENT_LINE: '//' ~[\r\n]* -> skip;

// Identificadores
STRING_LITERAL: '"' ~["\r\n]* '"';
NUM: '-'? [0-9]+ ('.' [0-9]+)?;
BOOL: TRUE | FALSE;
CLASS_NAME: [A-Z][a-zA-Z0-9]*;
VARIABLE_NAME: [a-z][a-zA-Z0-9]*;
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Regra para arrays
ARR: OPENBRACK (VALUE (COMMA WS* VALUE)*? )? CLOSEBRACK -> mode(DEFAULT_MODE);
fragment VALUE: NUM | BOOL | STRING_LITERAL | NULL | ARR;

