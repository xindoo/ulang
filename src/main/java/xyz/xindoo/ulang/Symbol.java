package xyz.xindoo.ulang;

import lombok.Data;

@Data
public class Symbol {
    public String name;
    public Type type;
    public Object value;
    public Symbol(Type type, String name, Object value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
