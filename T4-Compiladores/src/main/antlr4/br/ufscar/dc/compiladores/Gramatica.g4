grammar Gramatica;

PALAVRA_CHAVE: 'inicio_receita:' | 'fim_receita';

CAMPO: 'nome_medico:' | 'rua_medico:' | 'numero_medico:' | 'bairro_medico:' |
'cidade_medico:' | 'estado_medico:' | 'telefone_medico:' | 'nome_paciente:' |
'rua_paciente:' | 'numero_paciente:' | 'cidade_paciente:' | 'estado_paciente:' |
'nome_remedio:' | 'dosagem:' | 'numero_comprimidos:' | 'numero_caixas:' | 
'prescricao_qtde:' | 'prescricao_horas:' | 'prescricao_dias:' | 'data:'| 
'assinatura:';

/* Cadeia de caracteres, eh tudo aquilo entre dentre aspas, exceto por quebra 
de linha, \r e a própria aspas */
CADEIA: '"' (~('\n' | '\r' | '"'))* '"';


// Comentario eh tudo aquilo dentre chaves, com exceçoes analogas as da CADEIA.
// Todo COMENTARIO sera ignorado (função do -> skip)
COMENTARIO: '{' (~('}' | '\n' | '\r'))* '}' -> skip;

// Ignorando whitespaces (espaco, quebra de linha, tab, \r)
WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

receita: 'inicio_receita' corpo 'fim_receita';

corpo: especificacao (especificacao)*;

especificacao: campo valor;

campo: CAMPO;

valor: CADEIA;
