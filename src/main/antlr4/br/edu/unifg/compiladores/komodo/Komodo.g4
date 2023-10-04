grammar Komodo;

// Início da gramática
start: program EOF;

// Definição de um programa, composto por várias declarações
program: statement+;

// Definição das várias formas de declarações possíveis
statement: varDeclaration SEMICOLON
         | functionDeclaration
         | printStatement SEMICOLON
         | inputStatement SEMICOLON
         | ifStatement
         | expression SEMICOLON;

// Regra para declarar variáveis
varDeclaration: VAR VARIABLE_NAME DOUBLEDOT dataType (ASSIGN expression)?;

// Tipos de dados possíveis: string, número, array ou booleano
dataType: STRING | NUMBER | ARRAY | BOOLEAN;

// Definição de uma expressão, que pode ser uma expressão lógica
expression: logicalExpression;

// Expressão lógica pode ser uma combinação de termos lógicos com operadores lógicos
logicalExpression: logicalTerm (AND logicalTerm)* | logicalTerm (OR logicalTerm)* | comparisonExpression;

// Um termo lógico pode ser uma comparação, uma negação ou uma expressão lógica entre parênteses
logicalTerm: comparisonExpression | NOT logicalTerm | OPENPAREN logicalExpression CLOSEPAREN | TRUE | FALSE;

// Definição de comparações
comparisonExpression: concatenation (EQUALS | NOTEQUALS | LESSTHAN | GREATERTHAN | LESSTHANEQUALS | GREATERTHANEQUALS) concatenation | concatenation;

// Concatenação de elementos
concatenation: concatenationElement (CONCAT concatenationElement)*;

// Elementos que podem ser concatenados: strings, números, nulos, arrays, booleanos ou variáveis
concatenationElement: STRING_LITERAL | NUM | NULL | ARR | BOOL | VARIABLE_NAME;

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
CONCAT: '+';

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
VARIABLE_NAME: [a-z][a-zA-Z0-9_]*;
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Regra para arrays
ARR: OPENBRACK (VALUE (COMMA WS* VALUE)*? )? CLOSEBRACK -> mode(DEFAULT_MODE);
fragment VALUE: NUM | BOOL | STRING_LITERAL | NULL;
