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
* Existem campos que possuem um limite máximo e mínimo de caracteres;
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

Inicialmente o usuário deve iniciar o arquivo com os identificadores ``inicio_receita`` e ``fim_receita``. Todas as informações da receita serão adicionadas entre estes dois identificadores. Depois, para cada um dos campos será necessário inserir ``"nome do campo" : "valor"``, seguindo a ordem especificada pela gramática. Também foram especificados o que devem ser inserido em cada campo, seguindo algumas regras definida pelos autores da linguagem:

### Informações Médico
- nome_medico : Qualquer cadeia de caracteres
- rua_medico : Qualquer cadeia de caracteres
- numero_medico : Qualquer número inteiro
- bairro_medico : Qualquer cadeia de caracteres
- cidade_medico : Qualquer cadeia de caracteres
- estado_medico : Qualquer cadeia de caracteres
- telefone_medico : **Seguir a máscara (00 0000-0000)**
- crm_medico: : **No máximo 10 dígitos numéricos**

### Informações Paciente
- nome_paciente : Qualquer cadeia de caracteres
- rua_paciente : Qualquer cadeia de caracteres
- numero_paciente : Qualquer número inteiro
- cidade_paciente : Qualquer cadeia de caracteres
- estado_paciente : Qualquer cadeia de caracteres

### Informações Remédio
No caso do remedio, a linguagem permite a inserção de 1 ou mais remédios. Caso seja desejado inserir mais de 1 remédio, o usuário da linguagem deve inserir outro bloco de informações de remedio por completo, separando cada um dos blocos pelo separador ``||``.

- nome_remedio : Qualquer cadeia de caracteres **(nome de remédio não pode repetir)**
- dosagem : Qualquer cadeia de caracteres
- numero_comprimidos : Qualquer número inteiro
- numero_caixas : Qualquer número inteiro
- prescricao_qtde : Qualquer número inteiro
- prescricao_horas : Qualquer número inteiro
- prescricao_dias : Qualquer número inteiro

### Informações de Recomendação
Neste caso é possível especificar mais de um campo de recomendação. Para indicar mais de uma recomendação na receita, o usuário da linguagem deve inserir outro campo de recomendação, separando cada um dos campos pelo separador ``||``.

- recomendacao: **Qualquer cadeia de caracteres com até 200 caracteres**

### Informações Adicionais
- assinatura: **Qualquer cadeia de caracteres com até 90 caracteres**

- data: Qualquer cadeia de caracteres **(esse campo é opcional, caso não seja especificado o compilador gera a receita com a data atual)**

Diante disso, aplicando as regras especificadas neste documento para a utilização da linguagem, é possível produzir uma receita online em forma de HTML a partir de um arquivo TXT. Um exemplo de um código funcional desta linguagem, que gera uma receita válida é o seguinte:

```
inicio_receita

nome_medico : "Pedro da silva"
rua_medico : "Avenida Afonso Pena"
numero_medico : 600
bairro_medico : "Boa Viagem"
cidade_medico : "Belo Horizonte"
estado_medico : "Minas Gerais"
telefone_medico : "31 9999-9999"
crm_medico: 3000

nome_paciente : "Raquel Queiroz"
rua_paciente : "Rua Rio Grande do Norte"
numero_paciente : 1430
cidade_paciente : "Belo Horizonte"
estado_paciente : "Minas Gerais"


nome_remedio : "Amoxilina"
dosagem : "500 mg"
numero_comprimidos : 10
numero_caixas : 200
prescricao_qtde : 1
prescricao_horas : 24
prescricao_dias : 10

||

nome_remedio : "Paracetamol"
dosagem : "500 mg"
numero_comprimidos : 20
numero_caixas : 2
prescricao_qtde : 1
prescricao_horas : 24
prescricao_dias : 20

recomendacao: "Ficar de repouso."

||

recomendacao: "Indicado que o paciente beba muita água."

assinatura: "/home/pedro/assinatura.png"

data: "25 de novembro de 2019"

fim_receita
```
---
## Como Compilar

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
