// Generated from Olimpia.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OlimpiaParser}.
 */
public interface OlimpiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code OInicio}
	 * labeled alternative in {@link OlimpiaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterOInicio(OlimpiaParser.OInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OInicio}
	 * labeled alternative in {@link OlimpiaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitOInicio(OlimpiaParser.OInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OAlgoritmo}
	 * labeled alternative in {@link OlimpiaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterOAlgoritmo(OlimpiaParser.OAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OAlgoritmo}
	 * labeled alternative in {@link OlimpiaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitOAlgoritmo(OlimpiaParser.OAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OInstrucao}
	 * labeled alternative in {@link OlimpiaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterOInstrucao(OlimpiaParser.OInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OInstrucao}
	 * labeled alternative in {@link OlimpiaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitOInstrucao(OlimpiaParser.OInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ODeclaracao}
	 * labeled alternative in {@link OlimpiaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterODeclaracao(OlimpiaParser.ODeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ODeclaracao}
	 * labeled alternative in {@link OlimpiaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitODeclaracao(OlimpiaParser.ODeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OAtribuicao}
	 * labeled alternative in {@link OlimpiaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterOAtribuicao(OlimpiaParser.OAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OAtribuicao}
	 * labeled alternative in {@link OlimpiaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitOAtribuicao(OlimpiaParser.OAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OAcao}
	 * labeled alternative in {@link OlimpiaParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterOAcao(OlimpiaParser.OAcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OAcao}
	 * labeled alternative in {@link OlimpiaParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitOAcao(OlimpiaParser.OAcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OOperacao}
	 * labeled alternative in {@link OlimpiaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOOperacao(OlimpiaParser.OOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OOperacao}
	 * labeled alternative in {@link OlimpiaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOOperacao(OlimpiaParser.OOperacaoContext ctx);
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
	 * Enter a parse tree produced by the {@code OOperacao_calda}
	 * labeled alternative in {@link OlimpiaParser#operacao_calda}.
	 * @param ctx the parse tree
	 */
	void enterOOperacao_calda(OlimpiaParser.OOperacao_caldaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OOperacao_calda}
	 * labeled alternative in {@link OlimpiaParser#operacao_calda}.
	 * @param ctx the parse tree
	 */
	void exitOOperacao_calda(OlimpiaParser.OOperacao_caldaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OControle}
	 * labeled alternative in {@link OlimpiaParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterOControle(OlimpiaParser.OControleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OControle}
	 * labeled alternative in {@link OlimpiaParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitOControle(OlimpiaParser.OControleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OSe}
	 * labeled alternative in {@link OlimpiaParser#se}.
	 * @param ctx the parse tree
	 */
	void enterOSe(OlimpiaParser.OSeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OSe}
	 * labeled alternative in {@link OlimpiaParser#se}.
	 * @param ctx the parse tree
	 */
	void exitOSe(OlimpiaParser.OSeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OSenao}
	 * labeled alternative in {@link OlimpiaParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterOSenao(OlimpiaParser.OSenaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OSenao}
	 * labeled alternative in {@link OlimpiaParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitOSenao(OlimpiaParser.OSenaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OCond}
	 * labeled alternative in {@link OlimpiaParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterOCond(OlimpiaParser.OCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OCond}
	 * labeled alternative in {@link OlimpiaParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitOCond(OlimpiaParser.OCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBooleano}
	 * labeled alternative in {@link OlimpiaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterOBooleano(OlimpiaParser.OBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBooleano}
	 * labeled alternative in {@link OlimpiaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitOBooleano(OlimpiaParser.OBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORepeticao}
	 * labeled alternative in {@link OlimpiaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterORepeticao(OlimpiaParser.ORepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORepeticao}
	 * labeled alternative in {@link OlimpiaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitORepeticao(OlimpiaParser.ORepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OFuncao}
	 * labeled alternative in {@link OlimpiaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterOFuncao(OlimpiaParser.OFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OFuncao}
	 * labeled alternative in {@link OlimpiaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitOFuncao(OlimpiaParser.OFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OLimbo}
	 * labeled alternative in {@link OlimpiaParser#limbo}.
	 * @param ctx the parse tree
	 */
	void enterOLimbo(OlimpiaParser.OLimboContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OLimbo}
	 * labeled alternative in {@link OlimpiaParser#limbo}.
	 * @param ctx the parse tree
	 */
	void exitOLimbo(OlimpiaParser.OLimboContext ctx);
}