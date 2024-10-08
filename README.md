
# Projeto: Controle de Fluxo com Exceções Personalizadas em Java

## Descrição
Este projeto foi desenvolvido para exercitar conceitos de controle de fluxo em Java, juntamente com a criação e tratamento de exceções personalizadas. O sistema recebe dois números inteiros como parâmetros via terminal, realiza uma contagem incremental e valida se os parâmetros estão corretos. Caso o primeiro parâmetro seja maior que o segundo, o sistema lança uma exceção customizada chamada `ParametrosInvalidosException`.

## Funcionalidades
- **Contagem Incremental**: Com base nos dois números inseridos, o sistema realiza um loop para imprimir os números sequencialmente.
- **Validação de Parâmetros**: O sistema valida se o primeiro número é maior que o segundo e, se for, lança uma exceção personalizada.
- **Exceções Customizadas**: Uso da classe `ParametrosInvalidosException` para lidar com erros de negócio no sistema.

## O que eu aprendi
- **Controle de fluxo**: Utilização de loops e condicionais para implementar a lógica de contagem.
- **Exceções personalizadas**: Criação de exceções customizadas para tratar casos específicos de erro.
- **Uso de Scanner**: Prática na captura de dados do usuário e na interação com esses dados no código.
- **Boas práticas**: Aplicação de boas práticas ao encapsular erros e lançar exceções em cenários apropriados.

## Desafios
- **Lançamento de exceção**: Ajustei o código para que a exceção fosse corretamente lançada dentro do bloco condicional.
- **Estruturação do código**: Encontrei problemas de visibilidade ao definir a exceção dentro da classe principal e resolvi movendo a exceção para fora.
- **Logística de contagem**: Garantir que o loop funcionasse corretamente para diferentes entradas foi um desafio superado com lógica de incremento adequada.

## Como executar o projeto
1. Compile e execute o projeto em sua IDE de preferência.
2. Insira dois números inteiros como parâmetros.
3. O sistema realizará a contagem ou lançará a exceção personalizada, dependendo dos valores inseridos.

## Tecnologias Utilizadas
- **Java**
- **Visual Studio Code**

## Bootcamp Claro - Java com Spring Boot da DIO
Este projeto foi desenvolvido como parte do Bootcamp **Claro - Java com Spring Boot** oferecido pela DIO.

