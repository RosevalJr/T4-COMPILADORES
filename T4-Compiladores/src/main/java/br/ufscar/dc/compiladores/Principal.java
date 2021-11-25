package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.GramaticaParser.ReceitaContext;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Principal {

    public static void main(String args[]) throws IOException, ParseCancellationException {
        // Definindo o CharStream para ler do arquivo de entrada e tambem
        // o LaSintaticoLexer criado para fazer a analise lexica e sintática desse arquivo
        CharStream cs = CharStreams.fromFileName(args[0]);
        GramaticaLexer lex = new GramaticaLexer(cs);

        // FileWriter para criar o arquivo de saida (conjunto de tokens) do  
        // codigo de entrada
        FileWriter myWriter = new FileWriter(args[1]);
        try {
            lex.removeErrorListeners();
            lex.addErrorListener(ErrorListenerLexer.INSTANCE);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            
            GramaticaParser parser = new GramaticaParser(tokens);
            
            ErrorListenerSintatico mcel = new ErrorListenerSintatico();
            parser.addErrorListener(mcel);
            
            
            // Para erros semanticos...
            ReceitaContext arvore = parser.receita(); // Gera a arvore sintatica.
            MedSemantico sem = new MedSemantico();
            sem.visitReceita(arvore); // Comeca visitando pelo no mais acima
            
            // Printa todos os erros semanticos encontrados.
            if(!MedSemantico.errosSemanticos.isEmpty()){ // Caso ocorra erro semantico.
                for(var s: MedSemantico.errosSemanticos){
                    myWriter.write(s);
                }
                myWriter.write("Fim da compilacao\n");
            }
            else{ // Caso nenhum erro ocorra, gerar codigo intermediario em C.
                MedGerador gerador = new MedGerador();
                gerador.visitReceita(arvore);
                myWriter.write(gerador.saida.toString());
            }
            

        } catch (ParseCancellationException e) {
            myWriter.write(e.getMessage());
            myWriter.write("Fim da compilacao\n");
        }
        
        myWriter.close();
    }

}

