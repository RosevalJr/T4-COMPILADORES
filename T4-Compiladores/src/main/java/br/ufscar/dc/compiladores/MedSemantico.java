package br.ufscar.dc.compiladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import org.apache.commons.lang3.StringUtils;

public class MedSemantico extends GramaticaBaseVisitor<Void> {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    @Override
    public Void visitReceita(GramaticaParser.ReceitaContext ctx) {
        return super.visitReceita(ctx);
    }
    
    @Override
    public Void visitRemedios(GramaticaParser.RemediosContext ctx){
        Set<String> set = new HashSet<>();
        // Verfica remedios repetidos
        for(var r : ctx.remedio())
            if(set.add(r.nomeRemedio().CADEIA().toString()) == false)
                errosSemanticos.add(String.format("Linha %d: %s" ,r.getStart().getLine(), "Remedio ja adicionado anteriormente\n"));
            
        return super.visitRemedios(ctx);
    }
    
    @Override
    public Void visitMedico(GramaticaParser.MedicoContext ctx){
        // Verificacao CRM
        if(ctx.crmMedico().NUM_INT().toString().length() > 10 || ctx.crmMedico().NUM_INT().toString().length() < 2){
            errosSemanticos.add(String.format("Linha %d: %s" ,ctx.crmMedico().getStart().getLine(), "CRM invalido - numero de digitos deve ser entre 4 e 10\n"));
        }
        // Verificacao do telefone
        String[] tel = StringUtils.substringBetween(ctx.telefoneMedico().CADEIA().toString(), "\"", "\"").split(" ");
       
        if(tel.length != 2){
            errosSemanticos.add(String.format("Linha %d: %s" ,ctx.telefoneMedico().getStart().getLine(), "Telefone do medico invalido. Formato esperado: XX XXXX-XXXX\n"));
            return super.visitMedico(ctx);
        }
        if(tel[0].length() != 2 || tel[1].length() != 9 || tel[1].charAt(4) != '-'){
            errosSemanticos.add(String.format("Linha %d: %s" ,ctx.telefoneMedico().getStart().getLine(), "Telefone do medico invalido. Formato esperado: XX XXXX-XXXX\n"));
            return super.visitMedico(ctx);
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < tel[i].length(); j++){
                if(!Character.isDigit(tel[i].charAt(j)) && j != 4){
                    errosSemanticos.add(String.format("Linha %d: %s" ,ctx.telefoneMedico().getStart().getLine(), "Telefone do medico invalido. Apenas digitos e separadores sao permitidos\n"));  
                    return super.visitMedico(ctx);
                }
            }
        }
               
        return super.visitMedico(ctx);
    }
    
    @Override
    public Void visitRecomendacao(GramaticaParser.RecomendacaoContext ctx){
        if(ctx.CADEIA().toString().length() > 200)
            errosSemanticos.add(String.format("Linha %d: %s" ,ctx.getStart().getLine(), "O campo recomendacao tem limite de 200 caracteres\n"));    
        
        return super.visitRecomendacao(ctx);
    }
    
    @Override
    public Void visitAssinatura(GramaticaParser.AssinaturaContext ctx){
        if(ctx.CADEIA().toString().length() > 90)
            errosSemanticos.add(String.format("Linha %d: %s" ,ctx.getStart().getLine(), "O campo assinatura tem limite de 90 caracteres\n"));    
     
        return super.visitAssinatura(ctx);
    }    
}