# Komodo - Linguagem de Programação POO

A linguagem Komodo foi concebida com um enfoque especial na simplicidade, visando eliminar complexidades desnecessárias. Ao adotar os princípios do POO, a linguagem permite a criação de objetos personalizados, promovendo a modularização do código e facilitando o desenvolvimento de sistemas e aplicativos de diferentes naturezas.

## Equipe
1. ALLAN JORGE
2. ARTHUR LUIZ
3. CLÉCIO JOSÉ
4. DEYVID SANTOS
5. GABRIEL HAKKINEN
6. HERIVELTON OLIVEIRA
7. JONATHA ALMEIDA
8. LUANA KASSIA
9. LUCAS MORENO
10. MANOEL MORAES
11. THIAGO FELIX

## Foco principal do Komdo
* Estrutura de Classe Simplificada: A principal característica desta linguagem é a estrutura de classe simplificada. Ela permite a definição de classes com atributos, métodos e um construtor, permitindo aos desenvolvedores criarem objetos personalizados para atender às necessidades de seus projetos.
* Package, Import e Interface: A linguagem de programação Komodo incorpora os conceitos de pacotes (packages), importações (imports) e interfaces (interfaces) para promover a organização e a modularidade do código. Esses elementos desempenham um papel fundamental no desenvolvimento de sistemas complexos e na criação de bibliotecas reutilizáveis.
* Tipos de Dados Básicos: A linguagem suporta tipos de dados básicos, como números, strings, booleanos e arrays, tornando-a flexível o suficiente para uma ampla gama de aplicativos.
* Controle de Fluxo: Comandos de decisão, como "if," "else," e "elif," possibilitam a criação de lógica condicional, enquanto o comando "while" permite a implementação de loops de repetição.
* Operações Aritméticas e Comparativas: Operadores aritméticos e comparativos facilitam o processamento de dados e a tomada de decisões dentro dos programas.
* Funções Personalizadas: Além das classes, a linguagem oferece suporte para a definição e chamada de funções personalizadas, permitindo que os desenvolvedores modulem em seu código e utilize blocos de lógica em várias partes do programa.
* Escopo de Variáveis: A linguagem ver como as variáveis são tratadas em relação ao escopo, como variáveis locais e globais, e como a linguagem gerencia o ciclo de vida das variáveis.
* Manipulação de Arrays Unidimensional e Bidimensional: A linguagem conta com as operações e métodos disponíveis para manipulação de arrays.
* Entrada e Saída de Dados: A linguagem observa como os programas escritos nesta linguagem podem interagir com o ambiente externo, como a entrada de dados pelo usuário e a exibição de resultados.

## Exemplos de Código
### Declaração de Variáveis
```
var a: number = 10;
var b: number = 5;
var isEqual: boolean = a == b;
var isNotEqual: boolean = a != b;
var isGreaterThan: boolean = a > b;
var isLessThan: boolean = a < b;
var flag: boolean = true;
var isGreaterOrEqual: boolean = a >= b;
var isLessOrEqual: boolean = a <= b;
var frase: string = "Hello World";

print(a);
print(b);
print(isEqual);
print(isNotEqual);
print(isGreaterThan);
print(isLessThan);
print(flag);
print(isGreaterOrEqual);
print(isLessOrEqual);
print(frase);

```
### Operações Aritméticas e Booleanas
```
var x: number = 1 + 2;
var y: number = 1 - 2;
var z: number = 1 * 2;
var g: number = 1 / 2;
var h: number = (1 / 2) - 3;
var a: number = x + 1;
var p: boolean = true;
var q: boolean = false;
var andResult: boolean = p || q;
var orResult: boolean = p && q;
var notResult: boolean = !p;

print(x);
print(y);
print(z);
print(g);
print(h);
print(p);
print(q);
print(andResult);
print(orResult);
print(notResult);
```
### Bloco de Repetição While
```
var count: number = 1;
while (count <= 5) {
    print("Contagem: " + count);
    count = count + 1;
```
### Input e Print
```
var name: string;
var age: number;
print("Enter your name: ");
input(name);
print("Enter your age: ");
input(age);
print("Enter your gender: ");
print("Hello, " + name + "!");
print("Your age is, " + age + "!");
```
### Controle de Fluxo
```
var x: number = 10;
var y: number = 5;
if (x > y) {
    print("x é maior que y");
} elif (x < y) {
    print("x é menor que y");
} else {
    print("x é igual a y");
}
```
### Funções
```
var name: string = "Alice";
var age: number = 30;
var isStudent: boolean = true;

function checaFuncao(num1: number, num2: number) {
	var count: number = 0;
	if(num1 > num2) {
		print("Num1 é maior que Num2");
	} elif (num2 > num1) {
		print("Num2 é maior que Num1");
		while (count < 5) {
			print(count);
			count = count + 1;
		}
	} else {
		print("Ambos são iguais");
	}
}

function greet(name: string): string {
    return "Hello, " + name + "!";
}

var message: string = greet("Alice");
print(message);

checaFuncao(1, 2);

```
### Classes e Métodos
```
class Person {
	var nome: string;
	var idade: number;
	
	constructor(nome: string, idade: number) {
		this.nome = nome;
		this.idade = idade;
	}

	method printNome() {
		print("Deyvid");
	}
	
	method rh(registro: number) {
		print(registro);
	}
}

var pessoa1 = new Person("Bob", 20);
pessoa1.printNome();
pessoa1.rh(123456789);
```

## Licença
Está sobre a licença GNU, consulte o [LICENSE](LICENSE.md)
