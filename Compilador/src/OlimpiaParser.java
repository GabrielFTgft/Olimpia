// Generated from Olimpia.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OlimpiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PEGASO=1, HEC=2, ATE=3, JA=4, NUS=5, CAO=6, ECO=7, PROF=8, SIS=9, ERI=10, 
		HAR=11, LOG=12, HEFESTO=13, TEMIS=14, AFRODITE=15, ELY=16, DIO=17, HERMES=18, 
		APORIA=19, ErrorChar=20;
	public static final int
		RULE_inicio = 0, RULE_algoritmo = 1, RULE_instrucao = 2, RULE_declaracao = 3, 
		RULE_atribuicao = 4, RULE_acao = 5, RULE_operacao = 6, RULE_operando = 7, 
		RULE_operacao_calda = 8, RULE_controle = 9, RULE_senao = 10, RULE_cond = 11, 
		RULE_booleano = 12, RULE_repeticao = 13, RULE_funcao = 14, RULE_limbo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "algoritmo", "instrucao", "declaracao", "atribuicao", "acao", 
			"operacao", "operando", "operacao_calda", "controle", "senao", "cond", 
			"booleano", "repeticao", "funcao", "limbo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "'caos'", "'eco'", "'profecia'", 
			"'sisifo'", "'eris'", "'harmonia'", "'logos'", null, null, null, "'elysium'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PEGASO", "HEC", "ATE", "JA", "NUS", "CAO", "ECO", "PROF", "SIS", 
			"ERI", "HAR", "LOG", "HEFESTO", "TEMIS", "AFRODITE", "ELY", "DIO", "HERMES", 
			"APORIA", "ErrorChar"
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
	public String getGrammarFileName() { return "Olimpia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OlimpiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OlimpiaParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			algoritmo();
			setState(33);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgoritmoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(35);
				instrucao();
				}
				}
				setState(40);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public LimboContext limbo() {
			return getRuleContext(LimboContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucao);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				atribuicao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				acao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				controle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				repeticao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				funcao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				limbo();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode PEGASO() { return getToken(OlimpiaParser.PEGASO, 0); }
		public List<TerminalNode> DIO() { return getTokens(OlimpiaParser.DIO); }
		public TerminalNode DIO(int i) {
			return getToken(OlimpiaParser.DIO, i);
		}
		public TerminalNode LOG() { return getToken(OlimpiaParser.LOG, 0); }
		public TerminalNode HERMES() { return getToken(OlimpiaParser.HERMES, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(PEGASO);
				setState(51);
				match(DIO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(PEGASO);
				setState(53);
				match(DIO);
				setState(54);
				match(LOG);
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(55);
					match(DIO);
					}
					break;
				case 2:
					{
					setState(56);
					match(HERMES);
					}
					break;
				case 3:
					{
					setState(57);
					operacao();
					}
					break;
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> DIO() { return getTokens(OlimpiaParser.DIO); }
		public TerminalNode DIO(int i) {
			return getToken(OlimpiaParser.DIO, i);
		}
		public TerminalNode LOG() { return getToken(OlimpiaParser.LOG, 0); }
		public TerminalNode HERMES() { return getToken(OlimpiaParser.HERMES, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DIO);
			setState(63);
			match(LOG);
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(64);
				match(DIO);
				}
				break;
			case 2:
				{
				setState(65);
				match(HERMES);
				}
				break;
			case 3:
				{
				setState(66);
				operacao();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AcaoContext extends ParserRuleContext {
		public TerminalNode ECO() { return getToken(OlimpiaParser.ECO, 0); }
		public TerminalNode DIO() { return getToken(OlimpiaParser.DIO, 0); }
		public TerminalNode HERMES() { return getToken(OlimpiaParser.HERMES, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode PROF() { return getToken(OlimpiaParser.PROF, 0); }
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitAcao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_acao);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ECO:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ECO);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(70);
					match(DIO);
					}
					break;
				case 2:
					{
					setState(71);
					match(HERMES);
					}
					break;
				case 3:
					{
					setState(72);
					operacao();
					}
					break;
				}
				}
				break;
			case PROF:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(PROF);
				setState(76);
				match(DIO);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operacao_caldaContext operacao_calda() {
			return getRuleContext(Operacao_caldaContext.class,0);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			operando();
			setState(80);
			operacao_calda();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode DIO() { return getToken(OlimpiaParser.DIO, 0); }
		public TerminalNode HERMES() { return getToken(OlimpiaParser.HERMES, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==DIO || _la==HERMES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operacao_caldaContext extends ParserRuleContext {
		public TerminalNode HEFESTO() { return getToken(OlimpiaParser.HEFESTO, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public List<Operacao_caldaContext> operacao_calda() {
			return getRuleContexts(Operacao_caldaContext.class);
		}
		public Operacao_caldaContext operacao_calda(int i) {
			return getRuleContext(Operacao_caldaContext.class,i);
		}
		public Operacao_caldaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_calda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOperacao_calda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOperacao_calda(this);
		}
	}

	public final Operacao_caldaContext operacao_calda() throws RecognitionException {
		Operacao_caldaContext _localctx = new Operacao_caldaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacao_calda);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(HEFESTO);
			setState(85);
			operando();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					operacao_calda();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControleContext extends ParserRuleContext {
		public TerminalNode ERI() { return getToken(OlimpiaParser.ERI, 0); }
		public TerminalNode HEC() { return getToken(OlimpiaParser.HEC, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode ATE() { return getToken(OlimpiaParser.ATE, 0); }
		public TerminalNode JA() { return getToken(OlimpiaParser.JA, 0); }
		public TerminalNode NUS() { return getToken(OlimpiaParser.NUS, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitControle(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ERI);
			setState(93);
			match(HEC);
			setState(94);
			cond();
			setState(95);
			match(ATE);
			setState(96);
			match(JA);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(97);
				instrucao();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(NUS);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAR) {
				{
				setState(104);
				senao();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode HAR() { return getToken(OlimpiaParser.HAR, 0); }
		public TerminalNode JA() { return getToken(OlimpiaParser.JA, 0); }
		public TerminalNode NUS() { return getToken(OlimpiaParser.NUS, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_senao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(HAR);
			setState(108);
			match(JA);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(109);
				instrucao();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(NUS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public TerminalNode AFRODITE() { return getToken(OlimpiaParser.AFRODITE, 0); }
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			operando();
			setState(118);
			match(AFRODITE);
			setState(119);
			operando();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMIS) {
				{
				{
				setState(120);
				booleano();
				}
				}
				setState(125);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode TEMIS() { return getToken(OlimpiaParser.TEMIS, 0); }
		public TerminalNode HEC() { return getToken(OlimpiaParser.HEC, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode ATE() { return getToken(OlimpiaParser.ATE, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitBooleano(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(TEMIS);
			setState(127);
			match(HEC);
			setState(128);
			cond();
			setState(129);
			match(ATE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode SIS() { return getToken(OlimpiaParser.SIS, 0); }
		public TerminalNode HEC() { return getToken(OlimpiaParser.HEC, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode ATE() { return getToken(OlimpiaParser.ATE, 0); }
		public TerminalNode JA() { return getToken(OlimpiaParser.JA, 0); }
		public TerminalNode NUS() { return getToken(OlimpiaParser.NUS, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SIS);
			setState(132);
			match(HEC);
			setState(133);
			cond();
			setState(134);
			match(ATE);
			setState(135);
			match(JA);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(136);
				instrucao();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(NUS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode PEGASO() { return getToken(OlimpiaParser.PEGASO, 0); }
		public List<TerminalNode> DIO() { return getTokens(OlimpiaParser.DIO); }
		public TerminalNode DIO(int i) {
			return getToken(OlimpiaParser.DIO, i);
		}
		public TerminalNode HEC() { return getToken(OlimpiaParser.HEC, 0); }
		public TerminalNode ATE() { return getToken(OlimpiaParser.ATE, 0); }
		public TerminalNode JA() { return getToken(OlimpiaParser.JA, 0); }
		public TerminalNode ELY() { return getToken(OlimpiaParser.ELY, 0); }
		public TerminalNode NUS() { return getToken(OlimpiaParser.NUS, 0); }
		public TerminalNode HERMES() { return getToken(OlimpiaParser.HERMES, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(PEGASO);
			setState(145);
			match(DIO);
			setState(146);
			match(HEC);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PEGASO) {
				{
				{
				setState(147);
				declaracao();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(ATE);
			setState(154);
			match(JA);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(155);
				instrucao();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(ELY);
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==DIO || _la==HERMES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(NUS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimboContext extends ParserRuleContext {
		public TerminalNode CAO() { return getToken(OlimpiaParser.CAO, 0); }
		public TerminalNode DIO() { return getToken(OlimpiaParser.DIO, 0); }
		public TerminalNode HEC() { return getToken(OlimpiaParser.HEC, 0); }
		public TerminalNode ATE() { return getToken(OlimpiaParser.ATE, 0); }
		public TerminalNode JA() { return getToken(OlimpiaParser.JA, 0); }
		public TerminalNode NUS() { return getToken(OlimpiaParser.NUS, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public LimboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterLimbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitLimbo(this);
		}
	}

	public final LimboContext limbo() throws RecognitionException {
		LimboContext _localctx = new LimboContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limbo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(CAO);
			setState(166);
			match(DIO);
			setState(167);
			match(HEC);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PEGASO) {
				{
				{
				setState(168);
				declaracao();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(ATE);
			setState(175);
			match(JA);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(176);
				instrucao();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(NUS);
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
		"\u0004\u0001\u0014\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001%\b"+
		"\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0003\u0003=\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005J\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bX"+
		"\b\b\n\b\f\b[\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tc\b\t\n\t\f\tf\t\t\u0001\t\u0001\t\u0003\tj\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\no\b\n\n\n\f\nr\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bz\b\u000b\n\u000b\f\u000b}\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u008a\b\r\n\r\f\r\u008d\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0095\b\u000e\n\u000e"+
		"\f\u000e\u0098\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u009d\b\u000e\n\u000e\f\u000e\u00a0\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00aa\b\u000f\n\u000f\f\u000f\u00ad\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00b2\b\u000f\n\u000f\f\u000f\u00b5\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001"+
		"\u0001\u0000\u0011\u0012\u00c1\u0000 \u0001\u0000\u0000\u0000\u0002&\u0001"+
		"\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000"+
		"\u0000\b>\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fO\u0001"+
		"\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000"+
		"\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014k\u0001\u0000\u0000\u0000"+
		"\u0016u\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u0083"+
		"\u0001\u0000\u0000\u0000\u001c\u0090\u0001\u0000\u0000\u0000\u001e\u00a5"+
		"\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0000\u0000"+
		"\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0003\u0004\u0002\u0000$#\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)1\u0003\u0006\u0003\u0000*1\u0003\b\u0004\u0000+1\u0003\n"+
		"\u0005\u0000,1\u0003\u0012\t\u0000-1\u0003\u001a\r\u0000.1\u0003\u001c"+
		"\u000e\u0000/1\u0003\u001e\u000f\u00000)\u0001\u0000\u0000\u00000*\u0001"+
		"\u0000\u0000\u00000+\u0001\u0000\u0000\u00000,\u0001\u0000\u0000\u0000"+
		"0-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000"+
		"\u00001\u0005\u0001\u0000\u0000\u000023\u0005\u0001\u0000\u00003=\u0005"+
		"\u0011\u0000\u000045\u0005\u0001\u0000\u000056\u0005\u0011\u0000\u0000"+
		"6:\u0005\f\u0000\u00007;\u0005\u0011\u0000\u00008;\u0005\u0012\u0000\u0000"+
		"9;\u0003\f\u0006\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<2\u0001\u0000\u0000"+
		"\u0000<4\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0011\u0000\u0000?C\u0005\f\u0000\u0000@D\u0005\u0011\u0000\u0000AD\u0005"+
		"\u0012\u0000\u0000BD\u0003\f\u0006\u0000C@\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000"+
		"EI\u0005\u0007\u0000\u0000FJ\u0005\u0011\u0000\u0000GJ\u0005\u0012\u0000"+
		"\u0000HJ\u0003\f\u0006\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JN\u0001\u0000\u0000\u0000KL\u0005\b\u0000"+
		"\u0000LN\u0005\u0011\u0000\u0000ME\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0003\u000e\u0007\u0000"+
		"PQ\u0003\u0010\b\u0000Q\r\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000"+
		"\u0000S\u000f\u0001\u0000\u0000\u0000TU\u0005\r\u0000\u0000UY\u0003\u000e"+
		"\u0007\u0000VX\u0003\u0010\b\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0011"+
		"\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\n\u0000\u0000"+
		"]^\u0005\u0002\u0000\u0000^_\u0003\u0016\u000b\u0000_`\u0005\u0003\u0000"+
		"\u0000`d\u0005\u0004\u0000\u0000ac\u0003\u0004\u0002\u0000ba\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gi\u0005\u0005\u0000\u0000hj\u0003\u0014\n\u0000ih\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\u0013\u0001\u0000\u0000\u0000kl\u0005\u000b"+
		"\u0000\u0000lp\u0005\u0004\u0000\u0000mo\u0003\u0004\u0002\u0000nm\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000st\u0005\u0005\u0000\u0000t\u0015\u0001\u0000\u0000\u0000uv\u0003"+
		"\u000e\u0007\u0000vw\u0005\u000f\u0000\u0000w{\u0003\u000e\u0007\u0000"+
		"xz\u0003\u0018\f\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0017\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u000e\u0000\u0000"+
		"\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0081\u0003\u0016\u000b\u0000"+
		"\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u0019\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\t\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085"+
		"\u0086\u0003\u0016\u000b\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087"+
		"\u008b\u0005\u0004\u0000\u0000\u0088\u008a\u0003\u0004\u0002\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\u0005\u0000\u0000\u008f\u001b\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\u0001\u0000\u0000\u0091\u0092\u0005\u0011\u0000\u0000\u0092"+
		"\u0096\u0005\u0002\u0000\u0000\u0093\u0095\u0003\u0006\u0003\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u0003\u0000\u0000\u009a\u009e\u0005\u0004\u0000\u0000\u009b"+
		"\u009d\u0003\u0004\u0002\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2"+
		"\u00a3\u0007\u0000\u0000\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4"+
		"\u001d\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0006\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0011\u0000\u0000\u00a7\u00ab\u0005\u0002\u0000\u0000\u00a8"+
		"\u00aa\u0003\u0006\u0003\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af"+
		"\u00b3\u0005\u0004\u0000\u0000\u00b0\u00b2\u0003\u0004\u0002\u0000\u00b1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005\u0005\u0000\u0000\u00b7\u001f\u0001\u0000\u0000\u0000\u0011"+
		"&0:<CIMYdip{\u008b\u0096\u009e\u00ab\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}