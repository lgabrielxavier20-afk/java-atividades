# 41 - Conta Bancária Encapsulada

## Categoria
Encapsulamento

## Nível
Intermediário

## Contexto
Treino com atributos privados, getters, setters, validações e regras de negócio.

## Enunciado
Torne os atributos privados e permita depósitos e saques com taxa fixa, validando saldo suficiente.

## Regras
- Mantenha os atributos privados quando o exercício pedir encapsulamento.
- Crie getters e setters apenas para o que fizer sentido.
- Valide valores inválidos dentro dos métodos da classe.

## Entrada
Número, titular, saldo inicial, depósito e saque.

## Saída
Mostre o estado da conta antes e depois das operações.

## Exemplo
### Entrada
```text
123
Ana
1000
200
150
```
### Saída
```text
Account 123, holder: Ana, balance: $ 1000.00
Account 123, holder: Ana, balance: $ 1200.00
Account 123, holder: Ana, balance: $ 1045.00
```
