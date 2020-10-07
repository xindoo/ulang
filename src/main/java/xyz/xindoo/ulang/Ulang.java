package xyz.xindoo.ulang;

import org.antlr.v4.runtime.ParserRuleContext;

public class Ulang {
    private static String str = "var d = 1; func add(var a, var b) {d = 3; return a+b;} var c = add(1, 2);";
    public static void main(String[] args) {
        UlangCompiler compiler = new UlangCompiler();
        ParserRuleContext ctx = compiler.compile(str);
        compiler.execute(ctx);
        System.out.println("finished");
    }
}
