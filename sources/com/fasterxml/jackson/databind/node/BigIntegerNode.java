package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerNode extends NumericNode {
    private static final BigInteger MAX_INTEGER = BigInteger.valueOf(2147483647L);
    private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
    private static final BigInteger MIN_INTEGER = BigInteger.valueOf(-2147483648L);
    private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
    protected final BigInteger _value;

    public BigIntegerNode(BigInteger bigInteger) {
        this._value = bigInteger;
    }

    public static BigIntegerNode valueOf(BigInteger bigInteger) {
        return new BigIntegerNode(bigInteger);
    }

    public String asText() {
        return this._value.toString();
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return this._value;
    }

    public BigDecimal decimalValue() {
        return new BigDecimal(this._value);
    }

    public double doubleValue() {
        return this._value.doubleValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public int intValue() {
        return this._value.intValue();
    }

    public long longValue() {
        return this._value.longValue();
    }

    public NumberType numberType() {
        return NumberType.BIG_INTEGER;
    }

    public Number numberValue() {
        return this._value;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }
}
