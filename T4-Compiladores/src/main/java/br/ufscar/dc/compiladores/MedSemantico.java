package br.ufscar.dc.compiladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class MedSemantico extends GramaticaBaseVisitor<Void> {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    @Override
    public Void visitReceita(GramaticaParser.ReceitaContext ctx) { // (procedimento nao tem retorno? necessario checar função?)
       
        return visitRemedios(ctx.remedios());
    }
    
    @Override
    public Void visitRemedios(GramaticaParser.RemediosContext ctx){
        Set<String> set = new HashSet<String>();
        for(var r : ctx.remedio())
            if(set.add(r.nomeRemedio().CADEIA().toString()) == false)
                errosSemanticos.add(String.format("Linha %d: %s" ,r.getStart().getLine(), "Remédio já adicionado anteriormente\n"));
            
        return super.visitRemedios(ctx);
    }
 
    
}