import gen.MeuScanner;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class MainScanner {


    public static void main(String[] args) {

        String test = "public class SampleClass { void DoSomething(){} }";
        MeuScanner newLexer = new MeuScanner(CharStreams.fromString(javaClassContent));

        TokenStream tokens = new TokenStream(lexer);
        Parser parser = new Parser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker wlaker = new ParseTree();
        UppercaseMethodListener listener= new UppercaseMethodListener();






    }


}
