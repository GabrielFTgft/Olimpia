import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Bruno\\IdeaProjects\\Compilador\\src\\fatorial.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            OlimpiaLexer lexer = new OlimpiaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OlimpiaParser parser = new OlimpiaParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
