public class Exceptions {
    // Exceção para erros de arquivo
    public static class ArquivoVazioException extends RuntimeException {
        public ArquivoVazioException(String fileName) {
            super("O arquivo '" + fileName + "' está vazio!!");
        }
    }
    // Exceção para nulls
    public static class NuloException extends RuntimeException {
        public NuloException(String mensagem) {
            super(mensagem);
        }
    }
    // Exceção para erros léxicos
    public static class ErroLexicoException extends RuntimeException {
        public ErroLexicoException(String mensagem) {
            super(mensagem);
        }
    }
    // Exceção para erros sintáticos
    public static class ErroSintaticoException extends RuntimeException {
        public ErroSintaticoException(String mensagem) {
            super(mensagem);
        }
    }
    // Exceção para declaracao duplicada
     public static class DeclaracaoDuplicadaException extends RuntimeException {
        public DeclaracaoDuplicadaException(String mensagem) {
            super(mensagem);
        }
     }
     // Exceção para quando a variável não foi declarada
     public static class VariavelNaoDeclaradaException extends RuntimeException {
         public VariavelNaoDeclaradaException(String mensagem) {
             super(mensagem);
         }
     }
    // Exceção para quando os tipos não são compatíveis
    public static class TipoIncompativelException extends RuntimeException {
        public TipoIncompativelException(String mensagem) {
            super(mensagem);
        }
    }
}
