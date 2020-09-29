package org.msgpack.value;

public enum ValueType {
    NIL(false, false),
    BOOLEAN(false, false),
    INTEGER(true, false),
    FLOAT(true, false),
    STRING(false, true),
    BINARY(false, true),
    ARRAY(false, false),
    MAP(false, false),
    EXTENSION(false, true);
    
    final boolean numberType;
    public final boolean rawType;

    private ValueType(boolean z, boolean z2) {
        this.numberType = z;
        this.rawType = z2;
    }

    public final boolean a() {
        return this == NIL;
    }

    public final boolean b() {
        return this == BOOLEAN;
    }

    public final boolean c() {
        return this == INTEGER;
    }

    public final boolean d() {
        return this == FLOAT;
    }

    public final boolean e() {
        return this == STRING;
    }

    public final boolean f() {
        return this == BINARY;
    }

    public final boolean g() {
        return this == ARRAY;
    }

    public final boolean h() {
        return this == MAP;
    }

    public final boolean i() {
        return this == EXTENSION;
    }
}
