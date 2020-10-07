package xyz.xindoo.ulang;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import xyz.xindoo.ulang.g4.UlangLexer;
import xyz.xindoo.ulang.g4.UlangParser;

public class UlangCompiler {
    private UlangLexer lexer;
    private UlangParser parser;
    private UlangVisitor visitor = new UlangVisitor();

    public ParserRuleContext compile(String codes) {
        this.lexer = new UlangLexer(CharStreams.fromString(codes));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        this.parser = new UlangParser(tokens);
        return parser.prog();
    }

    public void execute(ParserRuleContext ctx) {
        visitor.visit(ctx);
    }
}
