package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FloatNode extends NumericNode {
    protected final float _value;

    public FloatNode(float f) {
        this._value = f;
    }

    public static FloatNode valueOf(float f) {
        return new FloatNode(f);
    }

    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((double) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof FloatNode)) {
            if (Float.compare(this._value, ((FloatNode) obj)._value) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    public int intValue() {
        return (int) this._value;
    }

    public boolean isNaN() {
        return Float.isNaN(this._value) || Float.isInfinite(this._value);
    }

    public long longValue() {
        return (long) this._value;
    }

    public NumberType numberType() {
        return NumberType.FLOAT;
    }

    public Number numberValue() {
        return Float.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }
}
