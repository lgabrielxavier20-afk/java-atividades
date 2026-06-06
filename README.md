# Java Atividades

Repositório com exercícios e mini projetos feitos durante meus estudos de Java.

## Mini Projeto 1 - Sistema de Notas

Este programa lê as notas de 5 alunos e mostra no final:

- média da turma
- maior nota
- menor nota
- quantidade de aprovados
- quantidade de reprovados

## Métodos usados

### aprovado(double nota)

Verifica se uma nota é maior ou igual a 7.

Se a nota for maior ou igual a 7, retorna `true`.
Se for menor que 7, retorna `false`.

### media(double soma, int quantidade)

Recebe a soma das notas e a quantidade de alunos.

Depois divide a soma pela quantidade para calcular a média da turma.

### maior(double a, double b)

Recebe duas notas e retorna a maior entre elas.

### menor(double a, double b)

Recebe duas notas e retorna a menor entre elas.

## Explicação do main

No `main`, o programa usa o `Scanner` para ler as notas digitadas pelo usuário.

Também são criadas variáveis para guardar:

- a soma das notas
- a maior nota
- a menor nota
- a quantidade de aprovados
- a quantidade de reprovados

O `for` é usado para repetir a leitura das 5 notas.

A cada nota digitada:

- a nota é somada na variável `soma`
- o programa verifica se ela é a maior nota
- o programa verifica se ela é a menor nota
- o programa verifica se o aluno foi aprovado ou reprovado

No final, o programa calcula a média e mostra todos os resultados no console.