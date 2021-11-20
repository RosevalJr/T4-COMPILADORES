package br.ufscar.dc.compiladores;

public class MedSemantico extends GramaticaBaseVisitor<Void> {
    
    @Override
    public Void visitReceita(GramaticaParser.ReceitaContext ctx) { // (procedimento nao tem retorno? necessario checar função?)
       
        System.out.println("Entrei na arvore !");
        return super.visitReceita(ctx);  // visita os filhos.
    }
 
    
}