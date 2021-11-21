// Generated from br/ufscar/dc/compiladores/Gramatica.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, DELIM_RECEITA=23, CAMPO_MEDICO=24, 
		CAMPO_PACIENTE=25, CAMPO_REMEDIO=26, CAMPO_RECOMENDACAO=27, CAMPO_ASSINATURA=28, 
		CAMPO_DATA=29, CADEIA=30, COMENTARIO=31, WS=32, DELIM=33, SEPARADOR=34;
	public static final int
		RULE_receita = 0, RULE_medico = 1, RULE_paciente = 2, RULE_remedios = 3, 
		RULE_remedio = 4, RULE_recomendacoes = 5, RULE_nomeMedico = 6, RULE_ruaMedico = 7, 
		RULE_numeroMedico = 8, RULE_bairroMedico = 9, RULE_cidadeMedico = 10, 
		RULE_estadoMedico = 11, RULE_telefoneMedico = 12, RULE_crmMedico = 13, 
		RULE_nomePaciente = 14, RULE_ruaPaciente = 15, RULE_numeroPaciente = 16, 
		RULE_cidadePaciente = 17, RULE_estadoPaciente = 18, RULE_nomeRemedio = 19, 
		RULE_dosagem = 20, RULE_numeroComprimidos = 21, RULE_numeroCaixas = 22, 
		RULE_prescricaoQtde = 23, RULE_prescricaoHoras = 24, RULE_prescricaoDias = 25, 
		RULE_recomendacao = 26, RULE_assinatura = 27, RULE_data = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"receita", "medico", "paciente", "remedios", "remedio", "recomendacoes", 
			"nomeMedico", "ruaMedico", "numeroMedico", "bairroMedico", "cidadeMedico", 
			"estadoMedico", "telefoneMedico", "crmMedico", "nomePaciente", "ruaPaciente", 
			"numeroPaciente", "cidadePaciente", "estadoPaciente", "nomeRemedio", 
			"dosagem", "numeroComprimidos", "numeroCaixas", "prescricaoQtde", "prescricaoHoras", 
			"prescricaoDias", "recomendacao", "assinatura", "data"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio_receita'", "'fim_receita'", "'nome_medico'", "'rua_medico'", 
			"'numero_medico'", "'bairro_medico'", "'cidade_medico'", "'estado_medico'", 
			"'telefone_medico'", "'crm_medico'", "'nome_paciente'", "'rua_paciente'", 
			"'numero_paciente'", "'cidade_paciente'", "'estado_paciente'", "'nome_remedio'", 
			"'dosagem'", "'numero_comprimidos'", "'numero_caixas'", "'prescricao_qtde'", 
			"'prescricao_horas'", "'prescricao_dias'", null, null, null, null, "'recomendacao'", 
			"'assinatura'", "'data'", null, null, null, "':'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "DELIM_RECEITA", 
			"CAMPO_MEDICO", "CAMPO_PACIENTE", "CAMPO_REMEDIO", "CAMPO_RECOMENDACAO", 
			"CAMPO_ASSINATURA", "CAMPO_DATA", "CADEIA", "COMENTARIO", "WS", "DELIM", 
			"SEPARADOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReceitaContext extends ParserRuleContext {
		public MedicoContext medico() {
			return getRuleContext(MedicoContext.class,0);
		}
		public PacienteContext paciente() {
			return getRuleContext(PacienteContext.class,0);
		}
		public RemediosContext remedios() {
			return getRuleContext(RemediosContext.class,0);
		}
		public RecomendacoesContext recomendacoes() {
			return getRuleContext(RecomendacoesContext.class,0);
		}
		public AssinaturaContext assinatura() {
			return getRuleContext(AssinaturaContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ReceitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterReceita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitReceita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitReceita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceitaContext receita() throws RecognitionException {
		ReceitaContext _localctx = new ReceitaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			medico();
			setState(60);
			paciente();
			setState(61);
			remedios();
			setState(62);
			recomendacoes();
			setState(63);
			assinatura();
			setState(64);
			data();
			setState(65);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MedicoContext extends ParserRuleContext {
		public NomeMedicoContext nomeMedico() {
			return getRuleContext(NomeMedicoContext.class,0);
		}
		public RuaMedicoContext ruaMedico() {
			return getRuleContext(RuaMedicoContext.class,0);
		}
		public NumeroMedicoContext numeroMedico() {
			return getRuleContext(NumeroMedicoContext.class,0);
		}
		public BairroMedicoContext bairroMedico() {
			return getRuleContext(BairroMedicoContext.class,0);
		}
		public CidadeMedicoContext cidadeMedico() {
			return getRuleContext(CidadeMedicoContext.class,0);
		}
		public EstadoMedicoContext estadoMedico() {
			return getRuleContext(EstadoMedicoContext.class,0);
		}
		public TelefoneMedicoContext telefoneMedico() {
			return getRuleContext(TelefoneMedicoContext.class,0);
		}
		public CrmMedicoContext crmMedico() {
			return getRuleContext(CrmMedicoContext.class,0);
		}
		public MedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MedicoContext medico() throws RecognitionException {
		MedicoContext _localctx = new MedicoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_medico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			nomeMedico();
			setState(68);
			ruaMedico();
			setState(69);
			numeroMedico();
			setState(70);
			bairroMedico();
			setState(71);
			cidadeMedico();
			setState(72);
			estadoMedico();
			setState(73);
			telefoneMedico();
			setState(74);
			crmMedico();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PacienteContext extends ParserRuleContext {
		public NomePacienteContext nomePaciente() {
			return getRuleContext(NomePacienteContext.class,0);
		}
		public RuaPacienteContext ruaPaciente() {
			return getRuleContext(RuaPacienteContext.class,0);
		}
		public NumeroPacienteContext numeroPaciente() {
			return getRuleContext(NumeroPacienteContext.class,0);
		}
		public CidadePacienteContext cidadePaciente() {
			return getRuleContext(CidadePacienteContext.class,0);
		}
		public EstadoPacienteContext estadoPaciente() {
			return getRuleContext(EstadoPacienteContext.class,0);
		}
		public PacienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paciente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPaciente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPaciente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPaciente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacienteContext paciente() throws RecognitionException {
		PacienteContext _localctx = new PacienteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paciente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			nomePaciente();
			setState(77);
			ruaPaciente();
			setState(78);
			numeroPaciente();
			setState(79);
			cidadePaciente();
			setState(80);
			estadoPaciente();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemediosContext extends ParserRuleContext {
		public List<RemedioContext> remedio() {
			return getRuleContexts(RemedioContext.class);
		}
		public RemedioContext remedio(int i) {
			return getRuleContext(RemedioContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(GramaticaParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(GramaticaParser.SEPARADOR, i);
		}
		public RemediosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remedios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRemedios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRemedios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRemedios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemediosContext remedios() throws RecognitionException {
		RemediosContext _localctx = new RemediosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_remedios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			remedio();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(83);
				match(SEPARADOR);
				setState(84);
				remedio();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemedioContext extends ParserRuleContext {
		public NomeRemedioContext nomeRemedio() {
			return getRuleContext(NomeRemedioContext.class,0);
		}
		public DosagemContext dosagem() {
			return getRuleContext(DosagemContext.class,0);
		}
		public NumeroComprimidosContext numeroComprimidos() {
			return getRuleContext(NumeroComprimidosContext.class,0);
		}
		public NumeroCaixasContext numeroCaixas() {
			return getRuleContext(NumeroCaixasContext.class,0);
		}
		public PrescricaoQtdeContext prescricaoQtde() {
			return getRuleContext(PrescricaoQtdeContext.class,0);
		}
		public PrescricaoHorasContext prescricaoHoras() {
			return getRuleContext(PrescricaoHorasContext.class,0);
		}
		public PrescricaoDiasContext prescricaoDias() {
			return getRuleContext(PrescricaoDiasContext.class,0);
		}
		public RemedioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remedio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRemedio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRemedio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRemedio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemedioContext remedio() throws RecognitionException {
		RemedioContext _localctx = new RemedioContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_remedio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			nomeRemedio();
			setState(91);
			dosagem();
			setState(92);
			numeroComprimidos();
			setState(93);
			numeroCaixas();
			setState(94);
			prescricaoQtde();
			setState(95);
			prescricaoHoras();
			setState(96);
			prescricaoDias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecomendacoesContext extends ParserRuleContext {
		public List<RecomendacaoContext> recomendacao() {
			return getRuleContexts(RecomendacaoContext.class);
		}
		public RecomendacaoContext recomendacao(int i) {
			return getRuleContext(RecomendacaoContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(GramaticaParser.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(GramaticaParser.SEPARADOR, i);
		}
		public RecomendacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recomendacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRecomendacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRecomendacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRecomendacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecomendacoesContext recomendacoes() throws RecognitionException {
		RecomendacoesContext _localctx = new RecomendacoesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recomendacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			recomendacao();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(99);
				match(SEPARADOR);
				setState(100);
				recomendacao();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public NomeMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNomeMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNomeMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNomeMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeMedicoContext nomeMedico() throws RecognitionException {
		NomeMedicoContext _localctx = new NomeMedicoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nomeMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__2);
			setState(107);
			match(DELIM);
			setState(108);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuaMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public RuaMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruaMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRuaMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRuaMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRuaMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuaMedicoContext ruaMedico() throws RecognitionException {
		RuaMedicoContext _localctx = new RuaMedicoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruaMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__3);
			setState(111);
			match(DELIM);
			setState(112);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public NumeroMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumeroMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumeroMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroMedicoContext numeroMedico() throws RecognitionException {
		NumeroMedicoContext _localctx = new NumeroMedicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numeroMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__4);
			setState(115);
			match(DELIM);
			setState(116);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BairroMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public BairroMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bairroMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBairroMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBairroMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBairroMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BairroMedicoContext bairroMedico() throws RecognitionException {
		BairroMedicoContext _localctx = new BairroMedicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bairroMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__5);
			setState(119);
			match(DELIM);
			setState(120);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CidadeMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public CidadeMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidadeMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCidadeMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCidadeMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCidadeMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CidadeMedicoContext cidadeMedico() throws RecognitionException {
		CidadeMedicoContext _localctx = new CidadeMedicoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cidadeMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__6);
			setState(123);
			match(DELIM);
			setState(124);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadoMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public EstadoMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estadoMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstadoMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstadoMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEstadoMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadoMedicoContext estadoMedico() throws RecognitionException {
		EstadoMedicoContext _localctx = new EstadoMedicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_estadoMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(DELIM);
			setState(128);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TelefoneMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public TelefoneMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telefoneMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTelefoneMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTelefoneMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTelefoneMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TelefoneMedicoContext telefoneMedico() throws RecognitionException {
		TelefoneMedicoContext _localctx = new TelefoneMedicoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_telefoneMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__8);
			setState(131);
			match(DELIM);
			setState(132);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrmMedicoContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public CrmMedicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crmMedico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCrmMedico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCrmMedico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCrmMedico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrmMedicoContext crmMedico() throws RecognitionException {
		CrmMedicoContext _localctx = new CrmMedicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_crmMedico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__9);
			setState(135);
			match(DELIM);
			setState(136);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomePacienteContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public NomePacienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomePaciente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNomePaciente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNomePaciente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNomePaciente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomePacienteContext nomePaciente() throws RecognitionException {
		NomePacienteContext _localctx = new NomePacienteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nomePaciente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__10);
			setState(139);
			match(DELIM);
			setState(140);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuaPacienteContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public RuaPacienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruaPaciente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRuaPaciente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRuaPaciente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRuaPaciente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuaPacienteContext ruaPaciente() throws RecognitionException {
		RuaPacienteContext _localctx = new RuaPacienteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ruaPaciente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__11);
			setState(143);
			match(DELIM);
			setState(144);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroPacienteContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public NumeroPacienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroPaciente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumeroPaciente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumeroPaciente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroPaciente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroPacienteContext numeroPaciente() throws RecognitionException {
		NumeroPacienteContext _localctx = new NumeroPacienteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numeroPaciente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__12);
			setState(147);
			match(DELIM);
			setState(148);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CidadePacienteContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public CidadePacienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidadePaciente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCidadePaciente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCidadePaciente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCidadePaciente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CidadePacienteContext cidadePaciente() throws RecognitionException {
		CidadePacienteContext _localctx = new CidadePacienteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cidadePaciente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__13);
			setState(151);
			match(DELIM);
			setState(152);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadoPacienteContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public EstadoPacienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estadoPaciente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEstadoPaciente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEstadoPaciente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEstadoPaciente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadoPacienteContext estadoPaciente() throws RecognitionException {
		EstadoPacienteContext _localctx = new EstadoPacienteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_estadoPaciente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__14);
			setState(155);
			match(DELIM);
			setState(156);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeRemedioContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public NomeRemedioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeRemedio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNomeRemedio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNomeRemedio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNomeRemedio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeRemedioContext nomeRemedio() throws RecognitionException {
		NomeRemedioContext _localctx = new NomeRemedioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nomeRemedio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__15);
			setState(159);
			match(DELIM);
			setState(160);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DosagemContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public DosagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dosagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDosagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDosagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDosagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DosagemContext dosagem() throws RecognitionException {
		DosagemContext _localctx = new DosagemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dosagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__16);
			setState(163);
			match(DELIM);
			setState(164);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroComprimidosContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public NumeroComprimidosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroComprimidos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumeroComprimidos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumeroComprimidos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroComprimidos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroComprimidosContext numeroComprimidos() throws RecognitionException {
		NumeroComprimidosContext _localctx = new NumeroComprimidosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numeroComprimidos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__17);
			setState(167);
			match(DELIM);
			setState(168);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroCaixasContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public NumeroCaixasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroCaixas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumeroCaixas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumeroCaixas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroCaixas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroCaixasContext numeroCaixas() throws RecognitionException {
		NumeroCaixasContext _localctx = new NumeroCaixasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_numeroCaixas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__18);
			setState(171);
			match(DELIM);
			setState(172);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrescricaoQtdeContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public PrescricaoQtdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prescricaoQtde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrescricaoQtde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrescricaoQtde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrescricaoQtde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrescricaoQtdeContext prescricaoQtde() throws RecognitionException {
		PrescricaoQtdeContext _localctx = new PrescricaoQtdeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prescricaoQtde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__19);
			setState(175);
			match(DELIM);
			setState(176);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrescricaoHorasContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public PrescricaoHorasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prescricaoHoras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrescricaoHoras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrescricaoHoras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrescricaoHoras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrescricaoHorasContext prescricaoHoras() throws RecognitionException {
		PrescricaoHorasContext _localctx = new PrescricaoHorasContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_prescricaoHoras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__20);
			setState(179);
			match(DELIM);
			setState(180);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrescricaoDiasContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public PrescricaoDiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prescricaoDias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrescricaoDias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrescricaoDias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrescricaoDias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrescricaoDiasContext prescricaoDias() throws RecognitionException {
		PrescricaoDiasContext _localctx = new PrescricaoDiasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_prescricaoDias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__21);
			setState(183);
			match(DELIM);
			setState(184);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecomendacaoContext extends ParserRuleContext {
		public TerminalNode CAMPO_RECOMENDACAO() { return getToken(GramaticaParser.CAMPO_RECOMENDACAO, 0); }
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public RecomendacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recomendacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRecomendacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRecomendacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRecomendacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecomendacaoContext recomendacao() throws RecognitionException {
		RecomendacaoContext _localctx = new RecomendacaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_recomendacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CAMPO_RECOMENDACAO);
			setState(187);
			match(DELIM);
			setState(188);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssinaturaContext extends ParserRuleContext {
		public TerminalNode CAMPO_ASSINATURA() { return getToken(GramaticaParser.CAMPO_ASSINATURA, 0); }
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public AssinaturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assinatura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssinatura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssinatura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAssinatura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssinaturaContext assinatura() throws RecognitionException {
		AssinaturaContext _localctx = new AssinaturaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assinatura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CAMPO_ASSINATURA);
			setState(191);
			match(DELIM);
			setState(192);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode CAMPO_DATA() { return getToken(GramaticaParser.CAMPO_DATA, 0); }
		public TerminalNode DELIM() { return getToken(GramaticaParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(GramaticaParser.CADEIA, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CAMPO_DATA);
			setState(195);
			match(DELIM);
			setState(196);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\2\2"+
		"\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\2"+
		"\2\u00ad\2<\3\2\2\2\4E\3\2\2\2\6N\3\2\2\2\bT\3\2\2\2\n\\\3\2\2\2\fd\3"+
		"\2\2\2\16l\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24x\3\2\2\2\26|\3\2\2\2\30"+
		"\u0080\3\2\2\2\32\u0084\3\2\2\2\34\u0088\3\2\2\2\36\u008c\3\2\2\2 \u0090"+
		"\3\2\2\2\"\u0094\3\2\2\2$\u0098\3\2\2\2&\u009c\3\2\2\2(\u00a0\3\2\2\2"+
		"*\u00a4\3\2\2\2,\u00a8\3\2\2\2.\u00ac\3\2\2\2\60\u00b0\3\2\2\2\62\u00b4"+
		"\3\2\2\2\64\u00b8\3\2\2\2\66\u00bc\3\2\2\28\u00c0\3\2\2\2:\u00c4\3\2\2"+
		"\2<=\7\3\2\2=>\5\4\3\2>?\5\6\4\2?@\5\b\5\2@A\5\f\7\2AB\58\35\2BC\5:\36"+
		"\2CD\7\4\2\2D\3\3\2\2\2EF\5\16\b\2FG\5\20\t\2GH\5\22\n\2HI\5\24\13\2I"+
		"J\5\26\f\2JK\5\30\r\2KL\5\32\16\2LM\5\34\17\2M\5\3\2\2\2NO\5\36\20\2O"+
		"P\5 \21\2PQ\5\"\22\2QR\5$\23\2RS\5&\24\2S\7\3\2\2\2TY\5\n\6\2UV\7$\2\2"+
		"VX\5\n\6\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2"+
		"\2\\]\5(\25\2]^\5*\26\2^_\5,\27\2_`\5.\30\2`a\5\60\31\2ab\5\62\32\2bc"+
		"\5\64\33\2c\13\3\2\2\2di\5\66\34\2ef\7$\2\2fh\5\66\34\2ge\3\2\2\2hk\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2lm\7\5\2\2mn\7#\2\2no\7"+
		" \2\2o\17\3\2\2\2pq\7\6\2\2qr\7#\2\2rs\7 \2\2s\21\3\2\2\2tu\7\7\2\2uv"+
		"\7#\2\2vw\7 \2\2w\23\3\2\2\2xy\7\b\2\2yz\7#\2\2z{\7 \2\2{\25\3\2\2\2|"+
		"}\7\t\2\2}~\7#\2\2~\177\7 \2\2\177\27\3\2\2\2\u0080\u0081\7\n\2\2\u0081"+
		"\u0082\7#\2\2\u0082\u0083\7 \2\2\u0083\31\3\2\2\2\u0084\u0085\7\13\2\2"+
		"\u0085\u0086\7#\2\2\u0086\u0087\7 \2\2\u0087\33\3\2\2\2\u0088\u0089\7"+
		"\f\2\2\u0089\u008a\7#\2\2\u008a\u008b\7 \2\2\u008b\35\3\2\2\2\u008c\u008d"+
		"\7\r\2\2\u008d\u008e\7#\2\2\u008e\u008f\7 \2\2\u008f\37\3\2\2\2\u0090"+
		"\u0091\7\16\2\2\u0091\u0092\7#\2\2\u0092\u0093\7 \2\2\u0093!\3\2\2\2\u0094"+
		"\u0095\7\17\2\2\u0095\u0096\7#\2\2\u0096\u0097\7 \2\2\u0097#\3\2\2\2\u0098"+
		"\u0099\7\20\2\2\u0099\u009a\7#\2\2\u009a\u009b\7 \2\2\u009b%\3\2\2\2\u009c"+
		"\u009d\7\21\2\2\u009d\u009e\7#\2\2\u009e\u009f\7 \2\2\u009f\'\3\2\2\2"+
		"\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\7 \2\2\u00a3)\3\2"+
		"\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7 \2\2\u00a7"+
		"+\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7 \2\2\u00ab"+
		"-\3\2\2\2\u00ac\u00ad\7\25\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7 \2\2\u00af"+
		"/\3\2\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3\7 \2\2\u00b3"+
		"\61\3\2\2\2\u00b4\u00b5\7\27\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7 \2\2"+
		"\u00b7\63\3\2\2\2\u00b8\u00b9\7\30\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bb"+
		"\7 \2\2\u00bb\65\3\2\2\2\u00bc\u00bd\7\35\2\2\u00bd\u00be\7#\2\2\u00be"+
		"\u00bf\7 \2\2\u00bf\67\3\2\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\7#\2\2"+
		"\u00c2\u00c3\7 \2\2\u00c39\3\2\2\2\u00c4\u00c5\7\37\2\2\u00c5\u00c6\7"+
		"#\2\2\u00c6\u00c7\7 \2\2\u00c7;\3\2\2\2\4Yi";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}