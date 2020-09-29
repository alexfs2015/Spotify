package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DoubleNode extends NumericNode {
    protected final double _value;

    public DoubleNode(double d) {
        this._value = d;
    }

    public static DoubleNode valueOf(double d) {
        return new DoubleNode(d);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public NumberType numberType() {
        return NumberType.DOUBLE;
    }

    public Number numberValue() {
        return Double.valueOf(this._value);
    }

    public int intValue() {
        return (int) this._value;
    }

    public long longValue() {
        return (long) this._value;
    }

    public double doubleValue() {
        return this._value;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public boolean isNaN() {
        return Double.isNaN(this._value) || Double.isInfinite(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof DoubleNode)) {
            if (Double.compare(this._value, ((DoubleNode) obj)._value) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }
}
