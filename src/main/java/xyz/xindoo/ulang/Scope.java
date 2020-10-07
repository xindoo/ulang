package xyz.xindoo.ulang;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Map<String, Symbol> symbolTable;

    public Scope() {
        this.symbolTable = new HashMap<>();
    }

    public Symbol getSymbol(String name) {
        return symbolTable.get(name);
    }

    public void putSymbol(Symbol symbol) {
        symbolTable.put(symbol.getName(), symbol);
    }
}
