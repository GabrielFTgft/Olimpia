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
		HELIOS=19, HESTIA=20, APORIA=21, ErrorChar=22;
	public static final int
		RULE_inicio = 0, RULE_algoritmo = 1, RULE_instrucao = 2, RULE_declaracao = 3, 
		RULE_atribuicao = 4, RULE_acao = 5, RULE_operacao = 6, RULE_operando = 7, 
		RULE_operacao_calda = 8, RULE_controle = 9, RULE_se = 10, RULE_senao = 11, 
		RULE_cond = 12, RULE_booleano = 13, RULE_repeticao = 14, RULE_funcao = 15, 
		RULE_limbo = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "algoritmo", "instrucao", "declaracao", "atribuicao", "acao", 
			"operacao", "operando", "operacao_calda", "controle", "se", "senao", 
			"cond", "booleano", "repeticao", "funcao", "limbo"
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
			"HELIOS", "HESTIA", "APORIA", "ErrorChar"
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
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OInicioContext extends InicioContext {
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OlimpiaParser.EOF, 0); }
		public OInicioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			_localctx = new OInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			algoritmo();
			setState(35);
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
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
	 
		public AlgoritmoContext() { }
		public void copyFrom(AlgoritmoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OAlgoritmoContext extends AlgoritmoContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public OAlgoritmoContext(AlgoritmoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_algoritmo);
		int _la;
		try {
			_localctx = new OAlgoritmoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				instrucao();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0) );
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
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
	 
		public InstrucaoContext() { }
		public void copyFrom(InstrucaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OInstrucaoContext extends InstrucaoContext {
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
		public OInstrucaoContext(InstrucaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucao);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new OInstrucaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				declaracao();
				}
				break;
			case 2:
				_localctx = new OInstrucaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				atribuicao();
				}
				break;
			case 3:
				_localctx = new OInstrucaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				acao();
				}
				break;
			case 4:
				_localctx = new OInstrucaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				controle();
				}
				break;
			case 5:
				_localctx = new OInstrucaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				repeticao();
				}
				break;
			case 6:
				_localctx = new OInstrucaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				funcao();
				}
				break;
			case 7:
				_localctx = new OInstrucaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
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
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ODeclaracaoContext extends DeclaracaoContext {
		public TerminalNode PEGASO() { return getToken(OlimpiaParser.PEGASO, 0); }
		public TerminalNode DIO() { return getToken(OlimpiaParser.DIO, 0); }
		public ODeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterODeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitODeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			_localctx = new ODeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PEGASO);
			setState(52);
			match(DIO);
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
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OAtribuicaoContext extends AtribuicaoContext {
		public TerminalNode LOG() { return getToken(OlimpiaParser.LOG, 0); }
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public List<TerminalNode> DIO() { return getTokens(OlimpiaParser.DIO); }
		public TerminalNode DIO(int i) {
			return getToken(OlimpiaParser.DIO, i);
		}
		public TerminalNode HERMES() { return getToken(OlimpiaParser.HERMES, 0); }
		public TerminalNode HELIOS() { return getToken(OlimpiaParser.HELIOS, 0); }
		public TerminalNode HESTIA() { return getToken(OlimpiaParser.HESTIA, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public OAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			_localctx = new OAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PEGASO:
				{
				setState(54);
				declaracao();
				}
				break;
			case DIO:
				{
				setState(55);
				match(DIO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			match(LOG);
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(59);
				match(DIO);
				}
				break;
			case 2:
				{
				setState(60);
				match(HERMES);
				}
				break;
			case 3:
				{
				setState(61);
				match(HELIOS);
				}
				break;
			case 4:
				{
				setState(62);
				match(HESTIA);
				}
				break;
			case 5:
				{
				setState(63);
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
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
	 
		public AcaoContext() { }
		public void copyFrom(AcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OAcaoContext extends AcaoContext {
		public TerminalNode ECO() { return getToken(OlimpiaParser.ECO, 0); }
		public TerminalNode DIO() { return getToken(OlimpiaParser.DIO, 0); }
		public TerminalNode HERMES() { return getToken(OlimpiaParser.HERMES, 0); }
		public TerminalNode HELIOS() { return getToken(OlimpiaParser.HELIOS, 0); }
		public TerminalNode HESTIA() { return getToken(OlimpiaParser.HESTIA, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode PROF() { return getToken(OlimpiaParser.PROF, 0); }
		public OAcaoContext(AcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOAcao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_acao);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ECO:
				_localctx = new OAcaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(ECO);
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(67);
					match(DIO);
					}
					break;
				case 2:
					{
					setState(68);
					match(HERMES);
					}
					break;
				case 3:
					{
					setState(69);
					match(HELIOS);
					}
					break;
				case 4:
					{
					setState(70);
					match(HESTIA);
					}
					break;
				case 5:
					{
					setState(71);
					operacao();
					}
					break;
				}
				}
				break;
			case PROF:
				_localctx = new OAcaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(PROF);
				setState(75);
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
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	 
		public OperacaoContext() { }
		public void copyFrom(OperacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OOperacaoContext extends OperacaoContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operacao_caldaContext operacao_calda() {
			return getRuleContext(Operacao_caldaContext.class,0);
		}
		public OOperacaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operacao);
		try {
			_localctx = new OOperacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			operando();
			setState(79);
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
		public TerminalNode HELIOS() { return getToken(OlimpiaParser.HELIOS, 0); }
		public TerminalNode HESTIA() { return getToken(OlimpiaParser.HESTIA, 0); }
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
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
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
		public Operacao_caldaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_calda; }
	 
		public Operacao_caldaContext() { }
		public void copyFrom(Operacao_caldaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OOperacao_caldaContext extends Operacao_caldaContext {
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
		public OOperacao_caldaContext(Operacao_caldaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOOperacao_calda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOOperacao_calda(this);
		}
	}

	public final Operacao_caldaContext operacao_calda() throws RecognitionException {
		Operacao_caldaContext _localctx = new Operacao_caldaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacao_calda);
		try {
			int _alt;
			_localctx = new OOperacao_caldaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(HEFESTO);
			setState(84);
			operando();
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					operacao_calda();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
	 
		public ControleContext() { }
		public void copyFrom(ControleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OControleContext extends ControleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public OControleContext(ControleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOControle(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controle);
		int _la;
		try {
			_localctx = new OControleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			se();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAR) {
				{
				setState(92);
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
	public static class SeContext extends ParserRuleContext {
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	 
		public SeContext() { }
		public void copyFrom(SeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OSeContext extends SeContext {
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
		public OSeContext(SeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_se);
		int _la;
		try {
			_localctx = new OSeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ERI);
			setState(96);
			match(HEC);
			setState(97);
			cond();
			setState(98);
			match(ATE);
			setState(99);
			match(JA);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(100);
				instrucao();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
	public static class SenaoContext extends ParserRuleContext {
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
	 
		public SenaoContext() { }
		public void copyFrom(SenaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OSenaoContext extends SenaoContext {
		public TerminalNode HAR() { return getToken(OlimpiaParser.HAR, 0); }
		public TerminalNode JA() { return getToken(OlimpiaParser.JA, 0); }
		public TerminalNode NUS() { return getToken(OlimpiaParser.NUS, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public OSenaoContext(SenaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_senao);
		int _la;
		try {
			_localctx = new OSenaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(HAR);
			setState(109);
			match(JA);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(110);
				instrucao();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OCondContext extends CondContext {
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
		public OCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cond);
		int _la;
		try {
			_localctx = new OCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			operando();
			setState(119);
			match(AFRODITE);
			setState(120);
			operando();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMIS) {
				{
				{
				setState(121);
				booleano();
				}
				}
				setState(126);
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
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	 
		public BooleanoContext() { }
		public void copyFrom(BooleanoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OBooleanoContext extends BooleanoContext {
		public TerminalNode TEMIS() { return getToken(OlimpiaParser.TEMIS, 0); }
		public TerminalNode HEC() { return getToken(OlimpiaParser.HEC, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode ATE() { return getToken(OlimpiaParser.ATE, 0); }
		public OBooleanoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOBooleano(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleano);
		try {
			_localctx = new OBooleanoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(TEMIS);
			setState(128);
			match(HEC);
			setState(129);
			cond();
			setState(130);
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
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	 
		public RepeticaoContext() { }
		public void copyFrom(RepeticaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORepeticaoContext extends RepeticaoContext {
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
		public ORepeticaoContext(RepeticaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterORepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitORepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repeticao);
		int _la;
		try {
			_localctx = new ORepeticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(SIS);
			setState(133);
			match(HEC);
			setState(134);
			cond();
			setState(135);
			match(ATE);
			setState(136);
			match(JA);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(137);
				instrucao();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OFuncaoContext extends FuncaoContext {
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
		public TerminalNode HELIOS() { return getToken(OlimpiaParser.HELIOS, 0); }
		public TerminalNode HESTIA() { return getToken(OlimpiaParser.HESTIA, 0); }
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
		public OFuncaoContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcao);
		int _la;
		try {
			_localctx = new OFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PEGASO);
			setState(146);
			match(DIO);
			setState(147);
			match(HEC);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PEGASO) {
				{
				{
				setState(148);
				declaracao();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(ATE);
			setState(155);
			match(JA);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(156);
				instrucao();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(ELY);
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
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
		public LimboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limbo; }
	 
		public LimboContext() { }
		public void copyFrom(LimboContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OLimboContext extends LimboContext {
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
		public OLimboContext(LimboContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).enterOLimbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OlimpiaListener ) ((OlimpiaListener)listener).exitOLimbo(this);
		}
	}

	public final LimboContext limbo() throws RecognitionException {
		LimboContext _localctx = new LimboContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limbo);
		int _la;
		try {
			_localctx = new OLimboContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(CAO);
			setState(167);
			match(DIO);
			setState(168);
			match(HEC);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PEGASO) {
				{
				{
				setState(169);
				declaracao();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(ATE);
			setState(176);
			match(JA);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133058L) != 0)) {
				{
				{
				setState(177);
				instrucao();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
		"\u0004\u0001\u0016\u00ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0004\u0001\'\b\u0001\u000b\u0001\f\u0001(\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"2\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u00049\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004A\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bW"+
		"\b\b\n\b\f\bZ\t\b\u0001\t\u0001\t\u0003\t^\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0005\nf\b\n\n\n\f\ni\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"{\b\f\n\f\f\f~\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u008b\b\u000e\n\u000e\f\u000e\u008e\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0096\b\u000f\n"+
		"\u000f\f\u000f\u0099\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u009e\b\u000f\n\u000f\f\u000f\u00a1\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00ab\b\u0010\n\u0010\f\u0010\u00ae\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00b3\b\u0010\n\u0010\f\u0010\u00b6\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0001\u0001\u0000\u0011\u0014\u00c3\u0000\"\u0001\u0000\u0000\u0000\u0002"+
		"&\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00063\u0001"+
		"\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000"+
		"\fN\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010S\u0001"+
		"\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014_\u0001\u0000\u0000"+
		"\u0000\u0016l\u0001\u0000\u0000\u0000\u0018v\u0001\u0000\u0000\u0000\u001a"+
		"\u007f\u0001\u0000\u0000\u0000\u001c\u0084\u0001\u0000\u0000\u0000\u001e"+
		"\u0091\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000\u0000\"#\u0003"+
		"\u0002\u0001\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000"+
		"\u0000%\'\u0003\u0004\u0002\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0003"+
		"\u0001\u0000\u0000\u0000*2\u0003\u0006\u0003\u0000+2\u0003\b\u0004\u0000"+
		",2\u0003\n\u0005\u0000-2\u0003\u0012\t\u0000.2\u0003\u001c\u000e\u0000"+
		"/2\u0003\u001e\u000f\u000002\u0003 \u0010\u00001*\u0001\u0000\u0000\u0000"+
		"1+\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000"+
		"\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000"+
		"\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u0000"+
		"45\u0005\u0011\u0000\u00005\u0007\u0001\u0000\u0000\u000069\u0003\u0006"+
		"\u0003\u000079\u0005\u0011\u0000\u000086\u0001\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:@\u0005\f\u0000\u0000;A\u0005"+
		"\u0011\u0000\u0000<A\u0005\u0012\u0000\u0000=A\u0005\u0013\u0000\u0000"+
		">A\u0005\u0014\u0000\u0000?A\u0003\f\u0006\u0000@;\u0001\u0000\u0000\u0000"+
		"@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000\u0000BH\u0005\u0007"+
		"\u0000\u0000CI\u0005\u0011\u0000\u0000DI\u0005\u0012\u0000\u0000EI\u0005"+
		"\u0013\u0000\u0000FI\u0005\u0014\u0000\u0000GI\u0003\f\u0006\u0000HC\u0001"+
		"\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IM\u0001\u0000\u0000"+
		"\u0000JK\u0005\b\u0000\u0000KM\u0005\u0011\u0000\u0000LB\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NO\u0003"+
		"\u000e\u0007\u0000OP\u0003\u0010\b\u0000P\r\u0001\u0000\u0000\u0000QR"+
		"\u0007\u0000\u0000\u0000R\u000f\u0001\u0000\u0000\u0000ST\u0005\r\u0000"+
		"\u0000TX\u0003\u000e\u0007\u0000UW\u0003\u0010\b\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y\u0011\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[]\u0003\u0014\n\u0000\\^\u0003\u0016\u000b\u0000]\\\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\u0013\u0001\u0000\u0000\u0000_`\u0005"+
		"\n\u0000\u0000`a\u0005\u0002\u0000\u0000ab\u0003\u0018\f\u0000bc\u0005"+
		"\u0003\u0000\u0000cg\u0005\u0004\u0000\u0000df\u0003\u0004\u0002\u0000"+
		"ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0005\u0000\u0000k\u0015\u0001\u0000\u0000\u0000"+
		"lm\u0005\u000b\u0000\u0000mq\u0005\u0004\u0000\u0000np\u0003\u0004\u0002"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0005\u0005\u0000\u0000u\u0017\u0001\u0000\u0000"+
		"\u0000vw\u0003\u000e\u0007\u0000wx\u0005\u000f\u0000\u0000x|\u0003\u000e"+
		"\u0007\u0000y{\u0003\u001a\r\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0019"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u000e"+
		"\u0000\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0082\u0003\u0018"+
		"\f\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u001b\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085\u0086\u0005\u0002\u0000\u0000"+
		"\u0086\u0087\u0003\u0018\f\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088"+
		"\u008c\u0005\u0004\u0000\u0000\u0089\u008b\u0003\u0004\u0002\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0005\u0000\u0000\u0090\u001d\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\u0001\u0000\u0000\u0092\u0093\u0005\u0011\u0000\u0000\u0093"+
		"\u0097\u0005\u0002\u0000\u0000\u0094\u0096\u0003\u0006\u0003\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0003\u0000\u0000\u009b\u009f\u0005\u0004\u0000\u0000\u009c"+
		"\u009e\u0003\u0004\u0002\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0010\u0000\u0000\u00a3"+
		"\u00a4\u0007\u0000\u0000\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5"+
		"\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0011\u0000\u0000\u00a8\u00ac\u0005\u0002\u0000\u0000\u00a9"+
		"\u00ab\u0003\u0006\u0003\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0"+
		"\u00b4\u0005\u0004\u0000\u0000\u00b1\u00b3\u0003\u0004\u0002\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0005\u0000\u0000\u00b8!\u0001\u0000\u0000\u0000\u0010(1"+
		"8@HLX]gq|\u008c\u0097\u009f\u00ac\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}