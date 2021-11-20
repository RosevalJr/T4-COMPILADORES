package br.ufscar.dc.compiladores;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorListenerLexer extends BaseErrorListener {
    
    public static final ErrorListenerLexer INSTANCE = new ErrorListenerLexer();
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionLine, String msg, RecognitionException e)
            throws ParseCancellationException{
        
        System.out.println("Uga");
        String[] tokens = msg.split("\'"); // tokens[1] contem o simbolo que causou o erro
        
        // 3 erros sao detectados, token invalido, comentario nao fechado e cadeia nao fechada.
        if(tokens[1].charAt(0) == '{' && tokens[1].charAt(tokens[1].length()-1) != '}'){
            throw new ParseCancellationException("Linha " + line + ":" + " comentario nao fechado" + "\n");
        }
        if(tokens[1].charAt(0) == '"' && tokens[1].charAt(tokens[1].length()-1) != '"'){
            throw new ParseCancellationException("Linha " + line + ":" + " cadeia literal nao fechada" + "\n");
        }
        throw new ParseCancellationException("Linha " + line + ":" + " " + tokens[1] + " - simbolo nao identificado" + "\n");
    }
}