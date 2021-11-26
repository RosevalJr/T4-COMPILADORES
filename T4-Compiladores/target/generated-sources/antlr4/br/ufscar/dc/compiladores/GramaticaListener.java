// Generated from br\u005Cufscar\dc\compiladores\Gramatica.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link GramaticaParser#medico}.
	 * @param ctx the parse tree
	 */
	void enterMedico(GramaticaParser.MedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#medico}.
	 * @param ctx the parse tree
	 */
	void exitMedico(GramaticaParser.MedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#paciente}.
	 * @param ctx the parse tree
	 */
	void enterPaciente(GramaticaParser.PacienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#paciente}.
	 * @param ctx the parse tree
	 */
	void exitPaciente(GramaticaParser.PacienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#remedios}.
	 * @param ctx the parse tree
	 */
	void enterRemedios(GramaticaParser.RemediosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#remedios}.
	 * @param ctx the parse tree
	 */
	void exitRemedios(GramaticaParser.RemediosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#remedio}.
	 * @param ctx the parse tree
	 */
	void enterRemedio(GramaticaParser.RemedioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#remedio}.
	 * @param ctx the parse tree
	 */
	void exitRemedio(GramaticaParser.RemedioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#recomendacoes}.
	 * @param ctx the parse tree
	 */
	void enterRecomendacoes(GramaticaParser.RecomendacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#recomendacoes}.
	 * @param ctx the parse tree
	 */
	void exitRecomendacoes(GramaticaParser.RecomendacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nomeMedico}.
	 * @param ctx the parse tree
	 */
	void enterNomeMedico(GramaticaParser.NomeMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nomeMedico}.
	 * @param ctx the parse tree
	 */
	void exitNomeMedico(GramaticaParser.NomeMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ruaMedico}.
	 * @param ctx the parse tree
	 */
	void enterRuaMedico(GramaticaParser.RuaMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ruaMedico}.
	 * @param ctx the parse tree
	 */
	void exitRuaMedico(GramaticaParser.RuaMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#numeroMedico}.
	 * @param ctx the parse tree
	 */
	void enterNumeroMedico(GramaticaParser.NumeroMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#numeroMedico}.
	 * @param ctx the parse tree
	 */
	void exitNumeroMedico(GramaticaParser.NumeroMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bairroMedico}.
	 * @param ctx the parse tree
	 */
	void enterBairroMedico(GramaticaParser.BairroMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bairroMedico}.
	 * @param ctx the parse tree
	 */
	void exitBairroMedico(GramaticaParser.BairroMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cidadeMedico}.
	 * @param ctx the parse tree
	 */
	void enterCidadeMedico(GramaticaParser.CidadeMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cidadeMedico}.
	 * @param ctx the parse tree
	 */
	void exitCidadeMedico(GramaticaParser.CidadeMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estadoMedico}.
	 * @param ctx the parse tree
	 */
	void enterEstadoMedico(GramaticaParser.EstadoMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estadoMedico}.
	 * @param ctx the parse tree
	 */
	void exitEstadoMedico(GramaticaParser.EstadoMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#telefoneMedico}.
	 * @param ctx the parse tree
	 */
	void enterTelefoneMedico(GramaticaParser.TelefoneMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#telefoneMedico}.
	 * @param ctx the parse tree
	 */
	void exitTelefoneMedico(GramaticaParser.TelefoneMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#crmMedico}.
	 * @param ctx the parse tree
	 */
	void enterCrmMedico(GramaticaParser.CrmMedicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#crmMedico}.
	 * @param ctx the parse tree
	 */
	void exitCrmMedico(GramaticaParser.CrmMedicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nomePaciente}.
	 * @param ctx the parse tree
	 */
	void enterNomePaciente(GramaticaParser.NomePacienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nomePaciente}.
	 * @param ctx the parse tree
	 */
	void exitNomePaciente(GramaticaParser.NomePacienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ruaPaciente}.
	 * @param ctx the parse tree
	 */
	void enterRuaPaciente(GramaticaParser.RuaPacienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ruaPaciente}.
	 * @param ctx the parse tree
	 */
	void exitRuaPaciente(GramaticaParser.RuaPacienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#numeroPaciente}.
	 * @param ctx the parse tree
	 */
	void enterNumeroPaciente(GramaticaParser.NumeroPacienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#numeroPaciente}.
	 * @param ctx the parse tree
	 */
	void exitNumeroPaciente(GramaticaParser.NumeroPacienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cidadePaciente}.
	 * @param ctx the parse tree
	 */
	void enterCidadePaciente(GramaticaParser.CidadePacienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cidadePaciente}.
	 * @param ctx the parse tree
	 */
	void exitCidadePaciente(GramaticaParser.CidadePacienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estadoPaciente}.
	 * @param ctx the parse tree
	 */
	void enterEstadoPaciente(GramaticaParser.EstadoPacienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estadoPaciente}.
	 * @param ctx the parse tree
	 */
	void exitEstadoPaciente(GramaticaParser.EstadoPacienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nomeRemedio}.
	 * @param ctx the parse tree
	 */
	void enterNomeRemedio(GramaticaParser.NomeRemedioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nomeRemedio}.
	 * @param ctx the parse tree
	 */
	void exitNomeRemedio(GramaticaParser.NomeRemedioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dosagem}.
	 * @param ctx the parse tree
	 */
	void enterDosagem(GramaticaParser.DosagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dosagem}.
	 * @param ctx the parse tree
	 */
	void exitDosagem(GramaticaParser.DosagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#numeroComprimidos}.
	 * @param ctx the parse tree
	 */
	void enterNumeroComprimidos(GramaticaParser.NumeroComprimidosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#numeroComprimidos}.
	 * @param ctx the parse tree
	 */
	void exitNumeroComprimidos(GramaticaParser.NumeroComprimidosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#numeroCaixas}.
	 * @param ctx the parse tree
	 */
	void enterNumeroCaixas(GramaticaParser.NumeroCaixasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#numeroCaixas}.
	 * @param ctx the parse tree
	 */
	void exitNumeroCaixas(GramaticaParser.NumeroCaixasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prescricaoQtde}.
	 * @param ctx the parse tree
	 */
	void enterPrescricaoQtde(GramaticaParser.PrescricaoQtdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prescricaoQtde}.
	 * @param ctx the parse tree
	 */
	void exitPrescricaoQtde(GramaticaParser.PrescricaoQtdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prescricaoHoras}.
	 * @param ctx the parse tree
	 */
	void enterPrescricaoHoras(GramaticaParser.PrescricaoHorasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prescricaoHoras}.
	 * @param ctx the parse tree
	 */
	void exitPrescricaoHoras(GramaticaParser.PrescricaoHorasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prescricaoDias}.
	 * @param ctx the parse tree
	 */
	void enterPrescricaoDias(GramaticaParser.PrescricaoDiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prescricaoDias}.
	 * @param ctx the parse tree
	 */
	void exitPrescricaoDias(GramaticaParser.PrescricaoDiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#recomendacao}.
	 * @param ctx the parse tree
	 */
	void enterRecomendacao(GramaticaParser.RecomendacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#recomendacao}.
	 * @param ctx the parse tree
	 */
	void exitRecomendacao(GramaticaParser.RecomendacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#assinatura}.
	 * @param ctx the parse tree
	 */
	void enterAssinatura(GramaticaParser.AssinaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#assinatura}.
	 * @param ctx the parse tree
	 */
	void exitAssinatura(GramaticaParser.AssinaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(GramaticaParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(GramaticaParser.DataContext ctx);
}