package xyz.xindoo.ulang;

import java.util.Stack;

public class StackFrame {
    private Stack<Scope> scopes;
    public StackFrame() {
        this(new Scope());
    }
    public StackFrame(Scope scope) {
        this.scopes = new Stack<>();
        scopes.push(scope);
    }

    public Scope peekScope() {
        return scopes.peek();
    }

    public void pushScope(Scope scope) {
        scopes.push(scope);
    }

    public Scope popScope() {
        return scopes.pop();
    }

    public Symbol getVariable(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Scope scope = scopes.get(i);
            if (scope.getSymbol(name) != null) {
                return scope.getSymbol(name);
            }
        }

        return null;
    }
}
