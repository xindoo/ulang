package xyz.xindoo.ulang;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import xyz.xindoo.ulang.g4.UlangBaseVisitor;
import xyz.xindoo.ulang.g4.UlangParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class UlangVisitor extends UlangBaseVisitor<Object> {
    private Stack<StackFrame> stack;
    private Scope globalScope;
    private Map<ParserRuleContext, Type> typeOfNode; // 保存每个节点的类型
    public UlangVisitor() {
        this.stack = new Stack<>();
        globalScope = new Scope();
        StackFrame stackFrame = new StackFrame(globalScope);
        stack.push(stackFrame); // ulang的入口调用栈帧
        typeOfNode = new HashMap<>();
    }

    @Override
    public Object visitVariableDeclarators(UlangParser.VariableDeclaratorsContext ctx) {
        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof UlangParser.VariableDeclaratorContext) {
                UlangParser.VariableDeclaratorContext childCtx = (UlangParser.VariableDeclaratorContext) child;
                visitVariableDeclarator(childCtx);
            }
        }
        return null;
    }

    @Override
    public Object visitVariableDeclarator(UlangParser.VariableDeclaratorContext ctx) {
        String symbolName = ctx.getChild(0).getText();
        Symbol symbol = new Symbol(Type.VAR, symbolName, Integer.valueOf(0));
        // 初始化变量
        if (ctx.getChildCount() > 2 && ctx.getChild(2) instanceof UlangParser.VariableInitializerContext) {
            symbol.setValue(visitVariableInitializer((UlangParser.VariableInitializerContext) ctx.getChild(2)));
        }
        getCurScope().putSymbol(symbol);
        return null;
    }

    @Override
    public Object visitExpression(UlangParser.ExpressionContext ctx) {
        Object rtn = null;
        if (ctx.bop != null && ctx.expression().size() >= 2) {
            Symbol left = (Symbol) visitExpression(ctx.expression(0));
            Symbol right = (Symbol) visitExpression(ctx.expression(1));
            switch (ctx.bop.getType()) {
                case UlangParser.ADD:
                    rtn = add(left.getValue(), right.getValue());
                    break;
            }
            return rtn;
        }

        return visitChildren(ctx);
    }


    @Override
    public Object visitLiteral(UlangParser.LiteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIntegerLiteral(UlangParser.IntegerLiteralContext ctx) {
        Long val = Long.parseLong(ctx.getText());
        return  val;
    }

    @Override public Object visitFloatLiteral(UlangParser.FloatLiteralContext ctx) {
        Double val = Double.parseDouble(ctx.getText());
        return  val;
    }

    @Override
    public Object visitPrimary(UlangParser.PrimaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            return getVariable(ctx.getText(), ctx);
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionDef(UlangParser.FunctionDefContext ctx) {
        String symbolName = ctx.getChild(1).getText();
        Symbol symbol = new Symbol(Type.FUNC, symbolName, ctx);
        getCurScope().putSymbol(symbol);
        return null;
    }

    @Override
    public Object visitFunctionCall(UlangParser.FunctionCallContext ctx) {
        String funcName = ctx.getChild(0).getText();
        Symbol funcSymble = getCurScope().getSymbol(ctx.getText());
        if (funcSymble == null || funcSymble.getType() != Type.FUNC) {
            funcSymble = globalScope.getSymbol(funcName);
        }
        if (funcSymble == null || funcSymble.getType() != Type.FUNC) {
            CommonUtils.error("找不到函数" + funcName, ctx);
        }

        UlangParser.FunctionDefContext funCtx = (UlangParser.FunctionDefContext) funcSymble.getValue();
        UlangParser.FormalParameterListContext parameterListCtx = (UlangParser.FormalParameterListContext) funCtx.getChild(2).getChild(1);
        UlangParser.ExpressionListContext valuesListCtx = (UlangParser.ExpressionListContext) ctx.getChild(2);
        if (parameterListCtx.getChildCount() != valuesListCtx.getChildCount()) {
            CommonUtils.error("参数数量不同", ctx);
        }
//        List<Symbol> paramsValue = new ArrayList<>();
        // 生成函数调用栈帧
        StackFrame stackFrame = new StackFrame();
        stack.push(stackFrame);
        for (int i = 0; i < valuesListCtx.getChildCount(); i++) {
            ParseTree childCtx = valuesListCtx.getChild(i);
            if (childCtx instanceof UlangParser.ExpressionContext) {
                UlangParser.ExpressionContext expressionContext = (UlangParser.ExpressionContext)childCtx;
                String symbolName = parameterListCtx.getChild(i).getChild(1).getText();
                Symbol symbol = new Symbol(Type.VAR, symbolName, visit(expressionContext));
                getCurScope().putSymbol(symbol);
            }
        }
        // 执行函数体
        Object rtn = visit(funCtx.getChild(3)); // function body
        stack.pop(); //出栈
        return rtn;
    }

    @Override 
    public Object visitBlockStatement(UlangParser.BlockStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment(UlangParser.AssignmentContext ctx) {
        String name = ctx.getChild(0).getText();
        Symbol symbol = (Symbol) getVariable(name, ctx);
        switch (ctx.aop.getType()) {
            case UlangParser.ASSIGN:
                symbol.setValue(visit(ctx.getChild(2)));
                break;
        }
        return visitChildren(ctx);
    }

    @Override public Object visitStatement(UlangParser.StatementContext ctx) {
        if (ctx.RETURN() != null) {
            return visitChildren(ctx.expression());
        }
        return visitChildren(ctx);
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        if (nextResult != null) {
            return nextResult;
        }
        return aggregate;
    }

    private Object add(Object obj1, Object obj2) {
        if (obj1 instanceof String || obj2 instanceof String) {
            return String.valueOf(obj1) + String.valueOf(obj2);
        }
        if (obj1 instanceof Double || obj2 instanceof Double) {
            return (((Number) obj1).doubleValue() + ((Number) obj2).doubleValue());
        }
        return ((Number) obj1).longValue() + ((Number) obj2).longValue();
    }

    private StackFrame getCurStackFrame() {
        return stack.peek();
    }

    private Scope getCurScope() {
        StackFrame frame = stack.peek();
        Scope scope = frame.peekScope();
        return scope;
    }

    private Object getVariable(String name, ParserRuleContext ctx) {
        Object res = getCurStackFrame().getVariable(name);
        if (res == null) {
            res = globalScope.getSymbol(name);
        }
        if (res == null) {
            CommonUtils.error("变量" + name + "未定义", ctx);
        }
        return res;
    }
}
