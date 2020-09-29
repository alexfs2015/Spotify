package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
public class NumberSerializer extends StdScalarSerializer<Number> implements ContextualSerializer {
    public static final NumberSerializer instance = new NumberSerializer(Number.class);
    protected final boolean _isInt;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[Shape.values().length];

        static {
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public NumberSerializer(Class<? extends Number> cls) {
        boolean z = false;
        super(cls, false);
        if (cls == BigInteger.class) {
            z = true;
        }
        this._isInt = z;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (this._isInt) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, NumberType.BIG_INTEGER);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(jsonFormatVisitorWrapper, javaType, NumberType.BIG_DECIMAL);
        } else {
            jsonFormatVisitorWrapper.expectNumberFormat(javaType);
        }
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        return (findFormatOverrides == null || AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[findFormatOverrides.getShape().ordinal()] != 1) ? this : ToStringSerializer.instance;
    }

    public void serialize(Number number, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (number instanceof BigDecimal) {
            jsonGenerator.writeNumber((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            jsonGenerator.writeNumber((BigInteger) number);
        } else if (number instanceof Long) {
            jsonGenerator.writeNumber(number.longValue());
        } else if (number instanceof Double) {
            jsonGenerator.writeNumber(number.doubleValue());
        } else if (number instanceof Float) {
            jsonGenerator.writeNumber(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.writeNumber(number.intValue());
        } else {
            jsonGenerator.writeNumber(number.toString());
        }
    }
}
