import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class FatorialLexer {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Bruno\\IdeaProjects\\Compilador\\src\\fatorial.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            OlimpiaLexer lexer = new OlimpiaLexer(input);
            Token token;
            while (!lexer._hitEOF) {
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("    Lexema: " + token.getText());
                System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
