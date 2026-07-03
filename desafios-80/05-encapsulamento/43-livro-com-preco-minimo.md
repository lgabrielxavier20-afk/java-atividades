# 43 - Livro com Preço Mínimo

## Categoria
Encapsulamento

## Nível
Intermediário

## Contexto
Treino com atributos privados, getters, setters, validações e regras de negócio.

## Enunciado
O preço de um livro nunca pode ficar abaixo de 0.90; valide o setter.

## Regras
- Mantenha os atributos privados quando o exercício pedir encapsulamento.
- Crie getters e setters apenas para o que fizer sentido.
- Valide valores inválidos dentro dos métodos da classe.

## Entrada
Título, autor, preço inicial e novo preço.

## Saída
Mostre o livro antes e depois da tentativa de alteração.

## Exemplo
### Entrada
```text
Clean Code
Robert
20
0.5
```
### Saída
```text
Clean Code, Robert, $ 20.00
Clean Code, Robert, $ 0.90
```
