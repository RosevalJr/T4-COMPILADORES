grammar Gramatica;

PALAVRA_CHAVE: 'inicio_receita:' | 'fim_receita';

CAMPO: 'nome_medico:' | 'rua_medico:' | 'numero_meico:' | 'bairro_medico:' |
'cidade_medico:' | 'estado_medico:' | 'telefone_medico:' | 'nome_paciente:' |
'rua_paciente:' | 'numero_paciente:' | 'cidade_paciente:' | 'estado_paciente:' |
'nome_remedio:' | 'dosagem:' | 'numero_comprimidos:' | 'numero_caixas:' | 
'prescricao_qtde:' | 'prescricao_horas:' | 'prescricao_dias:' | 'data:'| 
'assinatura:';

CADEIA: '"' (~('\n' | '\r' | '"'))* '"';

COMENTARIO: '{' (~('}' | '\n' | '\r'))* '}' -> skip;

WS: (' ' | '\t' | '\r' | '\n' ) -> skip;

receita: 'inicio_receita' corpo 'fim_receita';

corpo: especificacao (especificacao)*;

especificacao: campo valor;

campo: CAMPO;

valor: CADEIA;
