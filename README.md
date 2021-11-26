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

* Um mesmo remédio não pode ser repetido;
* Existem campos que possuem um limite maximo e minimo de caracteres;
* Existem campos que necessitam de uma formatação (máscara) específica (telefone_medico).

---
## Dependências

* ANTLR 4.7.2
* Maven 8
* JDK 11.0.12
* Apache Netbeans 12.5

---
## Como Utilizar a Linguagem

Essa linguagem foi produzida com o intuito de facilitar a geração de receitas médicas online. O usuário da linguagem deve produzir um arquivo .txt seguindo as regras especificadas pela gramática produzida, inserindo as informações que irão aparecer na receita. Diante disso, deve então ser seguido um modelo para a produção deste arquivo de entrada.

Inicialmente o usuário deve inciar o arquivo com os identificadores ``inicio_receita`` e ``fim_receita``. Todas as informações da receita serão adicionas entre esstes dois identificados. Depois para cada um dos campos será necessario inserir ``"nome do campo" : "valor"``, seguindo a ordem especificada pela gramática. Dessa forma, também foram especificados o que devem ser inserido em cada campo, seguindo algumas regras definida pelos autores da linguagem:


- nome_medico : Qualquer cadeia de caracteres
- rua_medico : Qualquer cadeia de caracteres
- numero_medico : Qualquer numero inteiro
- bairro_medico : Qualquer cadeia de caracteres
- cidade_medico : Qualquer cadeia de caracteres
- estado_medico : Qualquer cadeia de caracteres
- telefone_medico : **Seguir a máscara (00 0000-0000)**
- crm_medico: : **até 10 digitos numéricos**

- nome_paciente : Qualquer cadeia de caracteres
- rua_paciente : Qualquer cadeia de caracteres
- numero_paciente : Qualquer numero inteiro
- cidade_paciente : Qualquer cadeia de caracteres
- estado_paciente : Qualquer cadeia de caracteres

- nome_remedio : Qualquer cadeia de caracteres **(nome de remédio não pode repetir)**
- dosagem : Qualquer cadeia de caracteres
- numero_comprimidos : Qualquer numero inteiro
- numero_caixas : Qualquer numero inteiro
- prescricao_qtde : Qualquer numero inteiro
- prescricao_horas : Qualquer numero inteiro
- prescricao_dias : Qualquer numero inteiro

- recomendacao: **Qualquer cadeia de caracteres com até 200 caracteres**

- assinatura: **Qualquer cadeia de caracteres com até 90 caracteres**

- data: Qualquer cadeia de caracteres **(esse campo é opcional, caso não seja espcificado o compilador gera a receita com a data atual)**

Diante disso,

---
## Como compilar

Para efetuar a compilação de um arquivo nessa linguagem é necessário executar o comando Build and Clean presente na IDE Netbeans.
Após isso, deverão ser executados os seguintes comandos na raiz do projeto:
```
$ cd T4-Compiladores/target/
$ java -jar T4-Compiladores-1.0-SNAPSHOT-jar-with-dependencies.jar [arquivo-de-entrada] [arquivo-de-saida]
```

Importante destacar que, o ``[arquivo-de-entrada]`` deve ser um arquivo texto e o ``[arquivo-de-saida]`` deve ser especificado com a extensão ``.html`` para que a receita possa ser visualizada dentro do navegador, abrindo o arquivo. Além disso, tanto ``[arquivo-de-entrada]``, quanto ``[arquivo-de-saida]`` devem ser caminhos absolutos. Um exemplo de execução do compilador seria através do comando:

```
$ java -jar T4-Compiladores-1.0-SNAPSHOT-jar-with-dependencies.jar /home/nathan/ufscar/T4-COMPILADORES/casos_teste/lexico-sintatico/caso1.txt /home/nathan/ufscar/T4-COMPILADORES/modelo_receita.html
```
