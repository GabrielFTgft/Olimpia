import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AnalisadorSemantico {

    public static void main(String[] args) {

        String filename = "C:\\Users\\Bruno\\IdeaProjects\\Compilador\\src\\fatorial.txt";
        try {
            if (Files.size(Paths.get(filename)) == 0) {
                throw new Exceptions.ArquivoVazioException(filename);
            }
            OlimpiaParser parser = getParser(filename);
            if (parser != null) {
                ParseTree ast = parser.inicio();
                if(parser.getNumberOfSyntaxErrors() == 0){
                    System.out.println(ast.toStringTree());
                    MyListener listener = new MyListener();
                    ParseTreeWalker walker = new ParseTreeWalker();
                    walker.walk(listener,ast);
                } else {
                    throw new Exceptions.ErroSintaticoException("Erros sintáticos foram encontrados. A análise semântica não será realizada.");
                }

            } else {
                throw new Exceptions.NuloException("Erro inesperado! Parser = null");
            }
        } catch (Exceptions.ArquivoVazioException | Exceptions.NuloException | Exceptions.ErroSintaticoException e ) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static OlimpiaParser getParser(String filename) {
        OlimpiaParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            OlimpiaLexer lexer = new OlimpiaLexer(input);

            Token token;
            while (!lexer._hitEOF) {
                token = lexer.nextToken();
                if (lexer.getVocabulary().getDisplayName(token.getType()).equals("ErrorChar")) {
                    throw new Exceptions.ErroLexicoException(
                            "Erro léxico: Caractere inválido '" + token.getText() + " na linha " + token.getLine());
                }
            }
            lexer.reset();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new OlimpiaParser(tokens);

        } catch (Exceptions.ErroLexicoException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser;
    }
}