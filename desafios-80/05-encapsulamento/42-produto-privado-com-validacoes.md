# 42 - Produto Privado com Validações

## Categoria
Encapsulamento

## Nível
Intermediário

## Contexto
Treino com atributos privados, getters, setters, validações e regras de negócio.

## Enunciado
Mantenha nome, preço e quantidade privados e impeça preço negativo ou quantidade abaixo de zero.

## Regras
- Mantenha os atributos privados quando o exercício pedir encapsulamento.
- Crie getters e setters apenas para o que fizer sentido.
- Valide valores inválidos dentro dos métodos da classe.

## Entrada
Nome, preço, acréscimo e remoção de estoque.

## Saída
Mostre o produto após cada alteração válida.

## Exemplo
### Entrada
```text
Teclado
250
2
1
```
### Saída
```text
Teclado, $ 250.00, 0 units, Total: $ 0.00
Teclado, $ 250.00, 2 units, Total: $ 500.00
Teclado, $ 250.00, 1 units, Total: $ 250.00
```
