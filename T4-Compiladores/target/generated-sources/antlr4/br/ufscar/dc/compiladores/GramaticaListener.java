// Generated from br/ufscar/dc/compiladores/Gramatica.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#receita}.
	 * @param ctx the parse tree
	 */
	void enterReceita(GramaticaParser.ReceitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#receita}.
	 * @param ctx the parse tree
	 */
	void exitReceita(GramaticaParser.ReceitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(GramaticaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(GramaticaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#especificacao}.
	 * @param ctx the parse tree
	 */
	void enterEspecificacao(GramaticaParser.EspecificacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#especificacao}.
	 * @param ctx the parse tree
	 */
	void exitEspecificacao(GramaticaParser.EspecificacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(GramaticaParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(GramaticaParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(GramaticaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(GramaticaParser.ValorContext ctx);
}