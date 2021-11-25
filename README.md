# Linguagem para geração de receitas médicas

## Descrição
Esta linguagem foi criada com o intuito de facilitar a geração de um receituário médico que contém informações do médico,
informações do paciente e uma lista de remédios com os detalhes de sua prescrição.
Este compilador efetua a análise léxica e sintática de acordo com a gramática especificada, juntamente com a análise semântica
que efetua as 3 checagens seguintes:

* Um mesmo remédio não pode ser repetido
* A data é uma informação não-obrigatória
* Existem valores que necessitam de uma formatação (máscara) específica

O compilador foi implementado utilizando a linguagem Java através da biblioteca ANTLR4, com base nos conhecimentos adiquiridos na disciplina.

## Como compilar

Para efetuar a compilação de um arquivo nessa linguagem é necessário executar o comando build and clean presente na IDE Netbeans.
Após isso, deverão ser executados os seguintes comandos na raiz do projeto

```
$ cd T4-Compiladores/target/
$ java -jar T4-Compiladores-1.0-SNAPSHOT-jar-with-dependencies.jar [arquivo-de-entrada] [arquivo-de-saida]

```
