// Generated from br/ufscar/dc/compiladores/Gramatica.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceita(GramaticaParser.ReceitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(GramaticaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#especificacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecificacao(GramaticaParser.EspecificacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(GramaticaParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(GramaticaParser.ValorContext ctx);
}