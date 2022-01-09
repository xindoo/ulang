package xyz.xindoo.ulang.expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;

/**
 * @author xindoo
 * @date 2021/12/31
 */
public class ExprMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expr = scanner.nextLine();
            ExprLexer lexer = new ExprLexer(CharStreams.fromString(expr));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            ExprParser.ExpressionContext expressionContext = parser.expression();
            MyExprVisitor visitor = new MyExprVisitor();
            Double res = visitor.visitExpression(expressionContext);
            System.out.println("=" + res);
        }
    }
}
