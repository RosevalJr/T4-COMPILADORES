package br.ufscar.dc.compiladores;

import java.util.ArrayList;
import java.util.List;

public class MedSemantico extends GramaticaBaseVisitor<Void> {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    @Override
    public Void visitReceita(GramaticaParser.ReceitaContext ctx) { // (procedimento nao tem retorno? necessario checar função?)
       
        System.out.println("Entrei na arvore !");
        return super.visitReceita(ctx);  // visita os filhos.
    }
 
    
}