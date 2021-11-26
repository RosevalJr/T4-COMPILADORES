# Linguagem para geração de receitas médicas

## Autores
Roseval Donisete Malaquias Junior - 758597 </br>
Nathan Celestino de Oliveira - 758601 </br>
Yuri Gabriel Aragão da Silva - 758608

---
## Descrição
Essa linguagem foi criada com o intuito de facilitar a geração de um receituário médico que contém informações do médico,
informações do paciente e uma lista de remédios com os detalhes de sua prescrição.
Este compilador efetua a análise léxica e sintática de acordo com a gramática especificada, juntamente com a análise semântica
que efetua as seguintes checagens:

* Um mesmo remédio não pode ser repetido
* A data é uma informação não-obrigatória. Caso não for providenciada, a receita ficará com a data do dia em que for gerada
* Existem valores que necessitam de uma formatação (máscara) específica, como o telefone

O compilador foi implementado utilizando a linguagem Java através da biblioteca ANTLR4, com base nos conhecimentos adquiridos na disciplina.

---
## Como compilar

Para efetuar a compilação de um arquivo nessa linguagem é necessário executar o comando Build and Clean presente na IDE Netbeans.
Após isso, deverão ser executados os seguintes comandos na raiz do projeto:
```
$ cd T4-Compiladores/target/
$ java -jar T4-Compiladores-1.0-SNAPSHOT-jar-with-dependencies.jar [arquivo-de-entrada] [arquivo-de-saida]
```
