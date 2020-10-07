package xyz.xindoo.ulang;

public enum Type {
    FUNC("func"), VAR("var"),
    UNKOWN("");
    String name;
    Type(String name) {
        this.name = name;
    }

    public static Type of(String name) {
        switch (name) {
            case "var": return VAR;
            case "func" : return FUNC;
            default: return UNKOWN;
        }
    }
}
