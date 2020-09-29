package com.fasterxml.jackson.databind.node;

public abstract class NumericNode extends ValueNode {
    public abstract int intValue();

    public boolean isNaN() {
        return false;
    }

    protected NumericNode() {
    }

    public final JsonNodeType getNodeType() {
        return JsonNodeType.NUMBER;
    }

    public final int asInt() {
        return intValue();
    }

    public final int asInt(int i) {
        return intValue();
    }
}
