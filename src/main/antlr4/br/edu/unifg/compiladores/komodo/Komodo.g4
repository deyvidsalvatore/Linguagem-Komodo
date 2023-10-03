grammar Komodo;

start: program EOF;

program: statement+;

statement: varDeclaration SEMICOLON  | functionDeclaresao SEMICOLON;

varDeclaration: VAR VARIABLE_NAME DOUBLEDOT dataType ASSIGN expression | VAR VARIABLE_NAME DOUBLEDOT dataType;

dataType: STRING | NUMBER;

stringLL: STRING_LITERAL;

expression: STRING_LITERAL | NUM;

functionDeclaresao : FUNCTION VARIABLE_NAME OPENPAREN parameters? CLOSEPAREN returnType? OPENBRACE functionBody CLOSEBRACE;

parameters: parameter (COMMA parameter)*;

parameter: VARIABLE_NAME DOUBLEDOT dataType;

returnType: DOUBLEDOT dataType;

returnStatement: RETURN stringLL CONCAT VARIABLE_NAME CONCAT stringLL SEMICOLON;

functionBody: returnStatement+;


// Palavras-chave
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

// Variável Local
VAR_DECLARATION: VAR VARIABLE_NAME DOUBLEDOT (STRING | NUMBER | BOOLEAN | ARRAY) (ASSIGN .*)?;

// Variável GLOBAL
GLOBAL_VAR_DECLARATION: GLOBAL VARIABLE_NAME DOUBLEDOT (STRING | NUMBER | BOOLEAN | ARRAY);

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

// Booleanos
AND: '&&';
OR: '||';
NOT: '!';

// Espaços em branco e comentários
ESC_SEQ	: '\\\'';
WS: [ \t\r\n]+ -> skip;
        
BLOCK_COMMENT: '/' .? '*/' -> skip;
COMMENT_LINE: '//' ~[\r\n]* -> skip;

// Identificadores
STRING_LITERAL: '"' ~["\r\n]* '"';
// Números (ex: inteiros e decimais)
NUM: '-'? [0-9]+ ('.' [0-9]+)?;
BOOL: TRUE | FALSE;
VARIABLE_NAME: [a-z][a-zA-Z0-9_]*;
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Regra para arrays
ARR: OPENBRACK (VALUE (COMMA WS* VALUE)*? )? CLOSEBRACK -> mode(DEFAULT_MODE);
fragment VALUE: NUM | BOOL | STRING_LITERAL | NULL;