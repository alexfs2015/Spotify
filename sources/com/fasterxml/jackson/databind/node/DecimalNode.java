package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DecimalNode extends NumericNode {
    private static final BigDecimal MAX_INTEGER = BigDecimal.valueOf(2147483647L);
    private static final BigDecimal MAX_LONG = BigDecimal.valueOf(Long.MAX_VALUE);
    private static final BigDecimal MIN_INTEGER = BigDecimal.valueOf(-2147483648L);
    private static final BigDecimal MIN_LONG = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final DecimalNode ZERO = new DecimalNode(BigDecimal.ZERO);
    protected final BigDecimal _value;

    public DecimalNode(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }

    public static DecimalNode valueOf(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }

    public String asText() {
        return this._value.toString();
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return this._value.toBigInteger();
    }

    public BigDecimal decimalValue() {
        return this._value;
    }

    public double doubleValue() {
        return this._value.doubleValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof DecimalNode) && ((DecimalNode) obj)._value.compareTo(this._value) == 0;
    }

    public int hashCode() {
        return Double.valueOf(doubleValue()).hashCode();
    }

    public int intValue() {
        return this._value.intValue();
    }

    public long longValue() {
        return this._value.longValue();
    }

    public NumberType numberType() {
        return NumberType.BIG_DECIMAL;
    }

    public Number numberValue() {
        return this._value;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }
}
