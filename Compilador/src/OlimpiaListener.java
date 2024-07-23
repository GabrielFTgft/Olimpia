// Generated from Olimpia.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OlimpiaParser}.
 */
public interface OlimpiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(OlimpiaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(OlimpiaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(OlimpiaParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(OlimpiaParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(OlimpiaParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(OlimpiaParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(OlimpiaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(OlimpiaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(OlimpiaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(OlimpiaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(OlimpiaParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(OlimpiaParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(OlimpiaParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(OlimpiaParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(OlimpiaParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(OlimpiaParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#operacao_calda}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_calda(OlimpiaParser.Operacao_caldaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#operacao_calda}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_calda(OlimpiaParser.Operacao_caldaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControle(OlimpiaParser.ControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControle(OlimpiaParser.ControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(OlimpiaParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(OlimpiaParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(OlimpiaParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(OlimpiaParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(OlimpiaParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(OlimpiaParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(OlimpiaParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(OlimpiaParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(OlimpiaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(OlimpiaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OlimpiaParser#limbo}.
	 * @param ctx the parse tree
	 */
	void enterLimbo(OlimpiaParser.LimboContext ctx);
	/**
	 * Exit a parse tree produced by {@link OlimpiaParser#limbo}.
	 * @param ctx the parse tree
	 */
	void exitLimbo(OlimpiaParser.LimboContext ctx);
}