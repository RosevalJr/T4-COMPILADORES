// Por decisao de projeto decidimos deixar as checagem de tipagem no semantico.
// Entao aqui e tudo CADEI, entretanto teremos o tipo de CADEIA, INTEIRO, CAMINHO
// e BOOLEANO.

// FORMATACAO, TIPAGEM, RESTRICAO DE CARACTERES.

grammar Gramatica;

DELIM_RECEITA: 'inicio_receita' | 'fim_receita';

CAMPO_MEDICO: 'nome_medico' | 'rua_medico' | 'numero_medico' | 'bairro_medico' |
'cidade_medico' | 'estado_medico' | 'telefone_medico'  | 'crm_medico';

CAMPO_PACIENTE: 'nome_paciente' | 'rua_paciente' | 'numero_paciente' | 
'cidade_paciente' | 'estado_paciente';

CAMPO_REMEDIO: 'nome_remedio' | 'dosagem' | 'numero_comprimidos' | 'numero_caixas' | 
'prescricao_qtde' | 'prescricao_horas' | 'prescricao_dias';

CAMPO_RECOMENDACAO: 'recomendacao';

// Caminho ou (true | false)
CAMPO_ASSINATURA: 'assinatura';

// Apenas um true ou false
CAMPO_DATA: 'data';

/* Cadeia de caracteres, eh tudo aquilo entre dentre aspas, exceto por quebra 
de linha, \r e a própria aspas */
CADEIA: '"' (~('\n' | '\r' | '"'))* '"';


// Comentario eh tudo aquilo dentre chaves, com exceçoes analogas as da CADEIA.
// Todo COMENTARIO sera ignorado (função do -> skip)
COMENTARIO: '{' (~('}' | '\n' | '\r'))* '}' -> skip;

// Ignorando whitespaces (espaco, quebra de linha, tab, \r)
WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

DELIM: ':';

SEPARADOR: '||';

// Maneira geral é checar o numero dos campos corretamente e a posicao deles.
// OBS: Necessario geral verso e anverso.

// Define a estrutura da receita
receita: 'inicio_receita' medico paciente remedios recomendacoes
assinatura data 'fim_receita';

// Informacoes do medico
medico: nomeMedico ruaMedico numeroMedico bairroMedico cidadeMedico estadoMedico
telefoneMedico crmMedico;

// Informacoes do paciente
paciente: nomePaciente ruaPaciente numeroPaciente cidadePaciente 
estadoPaciente;

// Pode 1 ou mais remedios.
remedios: remedio  (SEPARADOR remedio)*;

// Informacoes do remedio.
remedio: nomeRemedio dosagem numeroComprimidos numeroCaixas prescricaoQtde 
prescricaoHoras prescricaoDias;

// Pode 1 ou mais recomendacoes.
recomendacoes: recomendacao (SEPARADOR recomendacao)*;

// Definindo campos do medico... (Semanticamente havera tipagem e formatacao)
nomeMedico: 'nome_medico' DELIM CADEIA;
ruaMedico: 'rua_medico' DELIM CADEIA;
numeroMedico: 'numero_medico' DELIM CADEIA;
bairroMedico: 'bairro_medico' DELIM CADEIA;
cidadeMedico: 'cidade_medico' DELIM CADEIA;
estadoMedico: 'estado_medico' DELIM CADEIA;
telefoneMedico: 'telefone_medico' DELIM CADEIA;
crmMedico: 'crm_medico' DELIM CADEIA;

// Definindo campos do paciente... (Semanticamente havera tipagem e formatacao
// (mascara) e restricoes de tamanho)
nomePaciente: 'nome_paciente' DELIM CADEIA;
ruaPaciente: 'rua_paciente' DELIM CADEIA;
numeroPaciente: 'numero_paciente' DELIM CADEIA;
cidadePaciente: 'cidade_paciente' DELIM CADEIA; 
estadoPaciente: 'estado_paciente' DELIM CADEIA;

// Definindo campos do remedio... (Semanticamente havera tipagem e formatacao
// (mascara) e restricoes de tamanho)
nomeRemedio: 'nome_remedio' DELIM CADEIA;
dosagem: 'dosagem' DELIM CADEIA;
numeroComprimidos: 'numero_comprimidos' DELIM CADEIA;
numeroCaixas: 'numero_caixas' DELIM CADEIA;  
prescricaoQtde: 'prescricao_qtde' DELIM CADEIA;
prescricaoHoras: 'prescricao_horas' DELIM CADEIA;
prescricaoDias: 'prescricao_dias' DELIM CADEIA;

// Definindo campos da recomendacao... (Semanticamente é qualquer coisa, havendo
// apenas uma restrição de numero de caracteres).
recomendacao: 'recomendacao' DELIM CADEIA;

// Definindo campos da assinatura... (Inserido imagem de assinatura do medico,
// entao CADEIA é um caminho).
assinatura: 'assinatura' DELIM CADEIA;

// Definindo campos da data... (GERADA AUTOMATICAMENTE, entao semanticamente 
// CADEIA é booleano).
data: 'data' ':' CADEIA;
