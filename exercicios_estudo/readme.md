# 📚 Estudos de Java (avaliação)

> Data:  
> Tema:  

---

## 🧠 Diferenças entre prints

- Em java, temos diferentes tipos de prints, vamos começar pelo *println*: ele apenas imprime o conteudo e ja pula para a próxima linha..
```java
// exemplo de código aqui
System.out.println("Hello World")
System.out.println("Tudo bem?");
```
Aqui ele vai imprimir assim:
```java
Hello World
Tudo bem?

```
- Temos também o printf, imprimir com formatação de dados..
```java

String nome = "Gabriel";
int idade = 20;

System.out.printf("Nome: %s, Idade: %d", nome, idade);
```

## Entrada e saída de dados
- para saída de dados, a gente tem:
```java
System.out.print("Olá "); System.out.print("Mundo"); //neste caso, print ele NÃO pula para a próxima linha, só lembrar "ln" => linha = pula
```
A saida será literalmente, "Mundo".

- System.out.printf, essa também é importante, mas ela formata dados, lembraa?
```java
String nome = "Gabriel"; int idade = 20; 
System.out.printf("Nome: %s, Idade: %d", nome, idade);
```
Coisa importante também:
%s	String
%d	inteiro
%f	decimal
%.2f	decimal com 2 casas
\n	quebra de linha


## 📌 Definição

- Escreva a definição mais “formal”
- Pode ser algo do professor ou livro

---

## 🔍 Exemplos

```java
// exemplo de código aqui
System.out.println("Hello World");
