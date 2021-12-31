package xyz.xindoo.ulang.expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import xyz.xindoo.ulang.g4.UlangLexer;
import xyz.xindoo.ulang.g4.UlangParser;

import java.util.Scanner;

/**
 * @author zhangweibin005
 * @date 2021/12/31
 */
public class ExprMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String expr = scanner.nextLine();
            ExprLexer lexer = new ExprLexer(CharStreams.fromString(expr));
            ExprParser parser = new ExprParser(lexer);
            ExprBaseVisitor visitor = new ExprBaseVisitor();
            parser.expression();
        }
    }
}
