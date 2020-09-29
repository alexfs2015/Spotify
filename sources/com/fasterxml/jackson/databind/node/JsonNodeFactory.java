package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonNodeFactory implements Serializable {
    private static final JsonNodeFactory decimalsAsIs = new JsonNodeFactory(true);
    private static final JsonNodeFactory decimalsNormalized = new JsonNodeFactory(false);
    public static final JsonNodeFactory instance = decimalsNormalized;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    protected JsonNodeFactory() {
        this(false);
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    public BooleanNode booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public NumericNode numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    public NumericNode numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    public NumericNode numberNode(int i) {
        return IntNode.valueOf(i);
    }

    public NumericNode numberNode(long j) {
        return LongNode.valueOf(j);
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        return bigDecimal == null ? nullNode() : this._cfgBigDecimalExact ? DecimalNode.valueOf(bigDecimal) : bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? DecimalNode.ZERO : DecimalNode.valueOf(bigDecimal.stripTrailingZeros());
    }

    public ValueNode numberNode(BigInteger bigInteger) {
        return bigInteger == null ? nullNode() : BigIntegerNode.valueOf(bigInteger);
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(RawValue rawValue) {
        return new POJONode(rawValue);
    }

    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }
}
