import java.util.ArrayList;
import java.util.List;

public class UpperCaseMethodListener extends ParserBaseListener {

    private List<String> errors = new ArrayList<>();
    private Parser.MethodDeclaratorContext ctx;

    // ... getter for errors


    @Override
    public void enterMethodDeclarator(Parser.MethodDeclaratorContext ctx) {
        this.ctx = ctx;
        TerminalNode node = ctx.Identifier();
        String methodName = node.getText();

        if (Character.isUpperCase(methodName.charAt(0))) {
            String error = String.format("Method %s is uppercased!", methodName);
            errors.add(error);
        }
    }

}
