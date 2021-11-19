package br.ufscar.dc.compiladores;

import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class Principal {
    public static void main(String args[]) throws IOException, ParseCancellationException {
        // Definindo o CharStream para ler do arquivo de entrada e tambem
        // o LaLexer criado para fazer a analise lexica desse arquivo
        CharStream cs = CharStreams.fromFileName(args[0]);
        GramaticaLexer gram = new GramaticaLexer(cs);
        
        // FileWriter para criar o arquivo de saida (conjunto de tokens) do  
        // codigo de entrada
        FileWriter myWriter = new FileWriter(args[1]);
        try{
            // Definindo o ErrorListenerLA criado como o ErrorListener do 
            // analisador lexico
            gram.removeErrorListeners();
            gram.addErrorListener(ErrorListenerLexer.INSTANCE);
            
            CommonTokenStream tokens = new CommonTokenStream(lex);
            GramaticaParser parser = new GramaticaParser(tokens);
            
            ErrorListenerSintatico mcel = new ErrorListenerSintatico();
            parser.addErrorListener(mcel);
            
            Token t = null;
            // Um loop ate o fim do arquivo (EOF)
            while(Token.EOF != (t = gram.nextToken()).getType()){
                // Se o tipo do Token for PALAVRA_CHAVE, OP_*, ATRIB, VIRGU ou
                // (ABRE/FECHA)PAR, então a token é do tipo <'texto', 'texto'>
                if(t.getType() == 1 | (t.getType() >= 8 && t.getType() <= 15))
                    myWriter.write("<'"+t.getText()+"','"+t.getText()+"'>\n");
                // Para os outros tipos, a token tem a forma <'texto', 'tipo'>
                else
                    myWriter.write("<'"+t.getText()+"',"+GramaticaLexer.VOCABULARY.getDisplayName(t.getType())+">\n");
            }
        } catch(ParseCancellationException e){
            myWriter.write(e.getMessage());
        }
        myWriter.close();
    }
    
}

