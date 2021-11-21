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
	 * Visit a parse tree produced by {@link GramaticaParser#medico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedico(GramaticaParser.MedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#paciente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaciente(GramaticaParser.PacienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#remedios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemedios(GramaticaParser.RemediosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#remedio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemedio(GramaticaParser.RemedioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#recomendacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecomendacoes(GramaticaParser.RecomendacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#nomeMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeMedico(GramaticaParser.NomeMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ruaMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuaMedico(GramaticaParser.RuaMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#numeroMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroMedico(GramaticaParser.NumeroMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bairroMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBairroMedico(GramaticaParser.BairroMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cidadeMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCidadeMedico(GramaticaParser.CidadeMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estadoMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstadoMedico(GramaticaParser.EstadoMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#telefoneMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTelefoneMedico(GramaticaParser.TelefoneMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#crmMedico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrmMedico(GramaticaParser.CrmMedicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#nomePaciente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomePaciente(GramaticaParser.NomePacienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ruaPaciente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuaPaciente(GramaticaParser.RuaPacienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#numeroPaciente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroPaciente(GramaticaParser.NumeroPacienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cidadePaciente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCidadePaciente(GramaticaParser.CidadePacienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#estadoPaciente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstadoPaciente(GramaticaParser.EstadoPacienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#nomeRemedio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeRemedio(GramaticaParser.NomeRemedioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dosagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDosagem(GramaticaParser.DosagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#numeroComprimidos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroComprimidos(GramaticaParser.NumeroComprimidosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#numeroCaixas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroCaixas(GramaticaParser.NumeroCaixasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prescricaoQtde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrescricaoQtde(GramaticaParser.PrescricaoQtdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prescricaoHoras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrescricaoHoras(GramaticaParser.PrescricaoHorasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prescricaoDias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrescricaoDias(GramaticaParser.PrescricaoDiasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#recomendacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecomendacao(GramaticaParser.RecomendacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#assinatura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssinatura(GramaticaParser.AssinaturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(GramaticaParser.DataContext ctx);
}