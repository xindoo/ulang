package xyz.xindoo.ulang.expr;

/**
 * @author xindoo
 * @date 2021/12/31
 */
public class MyExprVisitor extends ExprBaseVisitor<Double> {
    @Override
    public Double visitExpression(ExprParser.ExpressionContext ctx) {
        if (null == ctx.bop) {
            return visitChildren(ctx);
        }
        switch (ctx.bop.getText()) {
            case "+": return visit(ctx.children.get(0)) + visit(ctx.children.get(2));
            case "-": return visit(ctx.children.get(0)) - visit(ctx.children.get(2));
            case "*": return visit(ctx.children.get(0)) * visit(ctx.children.get(2));
            case "/": return visit(ctx.children.get(0)) / visit(ctx.children.get(2));
        }
        return 0.0;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Double visitPrimary(ExprParser.PrimaryContext ctx) {
        if (ctx.children.size() == 3) {
            return visit(ctx.children.get(1));
        }
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Double visitNumber(ExprParser.NumberContext ctx) {
        return Double.parseDouble(ctx.Digits().get(0).getText());
    }
}
