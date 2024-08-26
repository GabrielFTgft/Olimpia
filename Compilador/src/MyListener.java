import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends OlimpiaBaseListener {
    private Deque<Map<String, String>> pilhaEscopos = new ArrayDeque<>();

    @Override public void enterOAlgoritmo(OlimpiaParser.OAlgoritmoContext ctx) {
        pilhaEscopos.push(new HashMap<>());
    }

    @Override public void exitOAlgoritmo(OlimpiaParser.OAlgoritmoContext ctx) {
        pilhaEscopos.pop();
    }

    @Override
    public void exitODeclaracao(OlimpiaParser.ODeclaracaoContext ctx) {
        String nomeClasse = ctx.PEGASO().getText();
        String nomeVariavel = ctx.DIO().getText();

        try{
            if(verificarEscoposAnteriores(nomeVariavel)){
                throw new Exceptions.DeclaracaoDuplicadaException("Declaracao duplicada! Variavel " + nomeVariavel + " na linha " + ctx.getStart().getLine() + " ja foi declarada");
            }
            else{
                if(pilhaEscopos.peek() != null){
                    pilhaEscopos.peek().put(nomeVariavel, nomeClasse);
                }else{
                    throw new Exceptions.NuloException("Erro inesperado, topo da pilha de escopos está nulo");
                }
            }
        }catch (Exceptions.DeclaracaoDuplicadaException | Exceptions.NuloException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void exitOAtribuicao(OlimpiaParser.OAtribuicaoContext ctx) {
        String nomeVariavel;
        if (ctx.declaracao() != null) {
            OlimpiaParser.DeclaracaoContext dctx = ctx.declaracao();
            nomeVariavel = dctx.children.getLast().getText();
        } else {
            nomeVariavel = ctx.DIO().getFirst().getText();
        }
        try{
            if(!verificarEscoposAnteriores(nomeVariavel)){
                throw new Exceptions.VariavelNaoDeclaradaException("Variavel "+ nomeVariavel +" na linha "+ ctx.getStart().getLine() + " nao foi declarada");
            }else {
                String tipoVariavel = getTipoVariavel(nomeVariavel);
                if ((ctx.HERMES() == null & tipoVariavel.equals("medusa")) || (ctx.HELIOS() == null & tipoVariavel.equals("poseidon")) || (ctx.HESTIA() == null & tipoVariavel.equals("atena"))) {
                    if (ctx.operacao() != null) {
                        String Operando1 = obterTipoOperacao(ctx.operacao());
                        if (verificarEscoposAnteriores(Operando1) && !(tipoVariavel.equals(getTipoVariavel(Operando1)))) {
                            throw new Exceptions.TipoIncompativelException(Operando1 + " na linha " + ctx.getStart().getLine() + " nao e compativel com " + tipoVariavel);
                        }
                    } else {
                        if (!tipoVariavel.equals(getTipoVariavel(ctx.getChild(2).getText()))) {
                            throw new Exceptions.TipoIncompativelException(ctx.getChild(2).getText() + " na linha " + ctx.getStart().getLine() + " nao e compativel com " + tipoVariavel);
                        }
                    }
                }
            }
        }catch (Exceptions.VariavelNaoDeclaradaException | Exceptions.TipoIncompativelException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void exitOOperacao(OlimpiaParser.OOperacaoContext ctx) {
        String operando1 = getTipoOperando(ctx.operando());
        try{
            if(ctx.operacao_calda() != null && operando1 != null){
                OlimpiaParser.Operacao_caldaContext calda = ctx.operacao_calda();
                while(calda != null) {
                    String operando2 = getTipoOperando((OlimpiaParser.OperandoContext) calda.children.get(1));
                    if(!operando1.equals(operando2) && operando2!=null){
                        throw new Exceptions.TipoIncompativelException(operando1 + " na linha " + calda.getStart().getLine() +" nao e compativel com " + operando2);
                    }
                    if (calda.children.size() > 2) {
                        calda = (OlimpiaParser.Operacao_caldaContext) calda.children.get(2);
                    } else {
                        calda = null;
                    }
                }
            }else{
                throw new Exceptions.NuloException("Erro inesperado! Operando1 ou operacao_calda = null");
            }
        }catch (Exceptions.TipoIncompativelException | Exceptions.NuloException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void exitOCond(OlimpiaParser.OCondContext ctx){
        OlimpiaParser.OperandoContext operandoCtx1 = ctx.operando(0);
        OlimpiaParser.OperandoContext operandoCtx2 = ctx.operando(1);
        try{
            if(operandoCtx2.DIO()!= null && operandoCtx1.DIO() !=null && getTipoVariavel(operandoCtx2.DIO().getText())!=null && getTipoVariavel(operandoCtx1.DIO().getText())!=null){
                if(!getTipoVariavel(operandoCtx2.DIO().getText()).equals(getTipoVariavel(operandoCtx1.DIO().getText()))){
                    throw new Exceptions.TipoIncompativelException("Erro na condicao na linha " + ctx.getStart().getLine() + ", os tipos nao sao iguais");
                }
            }else if(operandoCtx2.DIO() == null && operandoCtx1.DIO() == null){
                throw new Exceptions.TipoIncompativelException("Essa condicao na linha " + ctx.getStart().getLine() + " nao faz sentido");
            }else if(operandoCtx1.DIO() == null && operandoCtx2.DIO() != null && getTipoVariavel(operandoCtx2.DIO().getText())!=null) {
                verificaCond(operandoCtx1, operandoCtx2);
            }else if(operandoCtx1.DIO() != null && operandoCtx2.DIO() == null && getTipoVariavel(operandoCtx1.DIO().getText())!=null) {
                verificaCond(operandoCtx2, operandoCtx1);
            }
        }catch (Exceptions.TipoIncompativelException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void exitOperando(OlimpiaParser.OperandoContext ctx){
        try {
            if (ctx.DIO() != null) {
                String nomeVariavel = ctx.DIO().getText();
                if (!verificarEscoposAnteriores(nomeVariavel)) {
                    throw new Exceptions.VariavelNaoDeclaradaException("Operando " + nomeVariavel + " na linha " + ctx.getStart().getLine() + " não foi declarado");
                }
            }
        }catch (Exceptions.VariavelNaoDeclaradaException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override public void enterOSe(OlimpiaParser.OSeContext ctx) {
        pilhaEscopos.push(new HashMap<>());
    }
    @Override public void exitOSe(OlimpiaParser.OSeContext ctx) {
        pilhaEscopos.pop();
    }

    @Override public void enterOSenao(OlimpiaParser.OSenaoContext ctx) {
        pilhaEscopos.push(new HashMap<>());
    }

    @Override public void exitOSenao(OlimpiaParser.OSenaoContext ctx) {
        pilhaEscopos.pop();
    }

    @Override public void enterORepeticao(OlimpiaParser.ORepeticaoContext ctx) {
        pilhaEscopos.push(new HashMap<>());
    }

    @Override public void exitORepeticao(OlimpiaParser.ORepeticaoContext ctx) {
        pilhaEscopos.pop();
    }

    @Override public void enterOFuncao(OlimpiaParser.OFuncaoContext ctx) {
        pilhaEscopos.push(new HashMap<>());
    }

    @Override
    public void exitOFuncao(OlimpiaParser.OFuncaoContext ctx) {
        String tipoFUncao = ctx.PEGASO().getText();
        try{
            if(ctx.HERMES() != null & !tipoFUncao.equals("medusa")||(ctx.HELIOS() != null & !tipoFUncao.equals("poseidon"))||(ctx.HESTIA() != null & !tipoFUncao.equals("atena"))||(ctx.DIO(1) != null & !tipoFUncao.equals(getTipoVariavel(ctx.DIO().getLast().getText())))){
                throw new Exceptions.TipoIncompativelException("Tipo do retorno nao e compativel com o tipo da funcao: " + tipoFUncao);
            }
        }catch (Exceptions.TipoIncompativelException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
        pilhaEscopos.pop();
    }

    @Override public void enterOLimbo(OlimpiaParser.OLimboContext ctx) {
        pilhaEscopos.push(new HashMap<>());
    }

    @Override public void exitOLimbo(OlimpiaParser.OLimboContext ctx) {
        pilhaEscopos.pop();
    }

    public boolean verificarEscoposAnteriores(String nomeVariavel) {
        for (Map<String,String> escopo : pilhaEscopos) {
            if (escopo.containsKey(nomeVariavel)) {
                return true;
            }
        }
        return false;
    }

    private String getTipoOperando(OlimpiaParser.OperandoContext ctx){
        if(ctx.DIO() != null){
            return getTipoVariavel(ctx.DIO().getText());
        } else if (ctx.HESTIA() != null) {
            return "atena";

        }else if(ctx.HERMES() != null) {
            return "medusa";
        }
        else if(ctx.HELIOS() != null){
            return "poseidon";
        }
        return null;
    }

    public String getTipoVariavel(String nomeVariavel) {
        for (Map<String,String> escopo : pilhaEscopos) {
            if (escopo.containsKey(nomeVariavel)) {
                return escopo.get(nomeVariavel);
            }
        }
        return null;
    }

    private String obterTipoOperacao(OlimpiaParser.OperacaoContext ctx) {
        if (ctx.getChild(0) != null) {
            return ctx.getChild(0).getText();
        } else {
            return null;
        }
    }

    private void verificaCond(OlimpiaParser.OperandoContext operandoCtx1, OlimpiaParser.OperandoContext operandoCtx2) throws Exceptions.TipoIncompativelException {
        if ((operandoCtx1.HERMES() != null && !getTipoVariavel(operandoCtx2.DIO().getText()).equals("medusa")) || (operandoCtx1.HELIOS() != null && !getTipoVariavel(operandoCtx2.DIO().getText()).equals("poseidon")) || (operandoCtx1.HESTIA() != null && !getTipoVariavel(operandoCtx2.DIO().getText()).equals("atena"))) {
            throw new Exceptions.TipoIncompativelException("Erro na condicao na linha "+ operandoCtx1.getStart().getLine() +" os tipos nao sao iguais");
        }
    }
}
