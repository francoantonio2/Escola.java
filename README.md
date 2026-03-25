Sistema de Cadastro de Alunos (Java)

 Descrição

Este projeto é um sistema simples em Java para cadastro de alunos, com validação de notas.

O sistema permite criar um aluno com nome, matrícula e nota, garantindo que a nota esteja entre **0 e 10**.



 Funcionalidades

 Criar aluno com nome e matrícula
 Definir nota do aluno
 Validação de nota (não permite valores fora de 0 a 10)
 Exibição das informações do aluno



Tecnologias utilizadas

Java

Estrutura do projeto
Aluno.java → Classe com atributos e validações 
Escola.java → Classe principal para execução

---

Como executar

1. Compile os arquivos:
javac Aluno.java Escola.java
2. Execute o programa:
java Escola

Exemplo de uso

java
Aluno aluno1 = new Aluno("João", 12345, 8);
aluno1.setNota(12); // inválido
aluno1.setNota(7);  // válido
aluno1.exibirInformacoes();




Regras de validação

 A nota deve estar entre **0 e 10**
 Caso contrário, o sistema exibe uma mensagem de erro



 Conceitos aplicados

 Programação Orientada a Objetos (POO)
 Encapsulamento
 Métodos getters e setters
 Validação de dados






