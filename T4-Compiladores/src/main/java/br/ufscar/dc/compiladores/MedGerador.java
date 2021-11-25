package br.ufscar.dc.compiladores;

public class MedGerador extends GramaticaBaseVisitor<Void> {
    public StringBuilder saida = new StringBuilder();;
    
    @Override
    public Void visitReceita(GramaticaParser.ReceitaContext ctx) { // (procedimento nao tem retorno? necessario checar função?)
       
        System.out.println("Entrei na arvore - Gerador !");
        return super.visitReceita(ctx);  // visita os filhos.
    }
 
    
}