package xyz.xindoo.ulang;

import org.antlr.v4.runtime.ParserRuleContext;

public class CommonUtils {
    public static void error(String msg, ParserRuleContext ctx) {
        System.out.printf("第%d行 %s \n", ctx.getStart().getLine(), msg);
    }
}
