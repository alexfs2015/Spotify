package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.HashMap;

public class StdArraySerializers {
    protected static final HashMap<String, JsonSerializer<?>> _arraySerializers;

    @JacksonStdImpl
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        protected BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.BOOLEAN);
        }

        public boolean hasSingleElement(boolean[] zArr) {
            return zArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, boolean[] zArr) {
            return zArr.length == 0;
        }

        public final void serialize(boolean[] zArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int length = zArr.length;
            if (length != 1 || !_shouldUnwrapSingle(serializerProvider)) {
                jsonGenerator.writeStartArray(length);
                jsonGenerator.setCurrentValue(zArr);
                serializeContents(zArr, jsonGenerator, serializerProvider);
                jsonGenerator.writeEndArray();
                return;
            }
            serializeContents(zArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (boolean writeBoolean : zArr) {
                jsonGenerator.writeBoolean(writeBoolean);
            }
        }
    }

    @JacksonStdImpl
    public static class CharArraySerializer extends StdSerializer<char[]> {
        public CharArraySerializer() {
            super(char[].class);
        }

        private final void _writeArrayContents(JsonGenerator jsonGenerator, char[] cArr) {
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                jsonGenerator.writeString(cArr, i, 1);
            }
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.STRING);
        }

        public boolean isEmpty(SerializerProvider serializerProvider, char[] cArr) {
            return cArr.length == 0;
        }

        public void serialize(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.writeStartArray(cArr.length);
                jsonGenerator.setCurrentValue(cArr);
                _writeArrayContents(jsonGenerator, cArr);
                jsonGenerator.writeEndArray();
                return;
            }
            jsonGenerator.writeString(cArr, 0, cArr.length);
        }

        public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            WritableTypeId writableTypeId;
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeId = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(cArr, JsonToken.START_ARRAY));
                _writeArrayContents(jsonGenerator, cArr);
            } else {
                writableTypeId = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(cArr, JsonToken.VALUE_STRING));
                jsonGenerator.writeString(cArr, 0, cArr.length);
            }
            typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId);
        }
    }

    @JacksonStdImpl
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);

        public DoubleArraySerializer() {
            super(double[].class);
        }

        protected DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.NUMBER);
        }

        public boolean hasSingleElement(double[] dArr) {
            return dArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, double[] dArr) {
            return dArr.length == 0;
        }

        public final void serialize(double[] dArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (dArr.length != 1 || !_shouldUnwrapSingle(serializerProvider)) {
                jsonGenerator.setCurrentValue(dArr);
                jsonGenerator.writeArray(dArr, 0, dArr.length);
                return;
            }
            serializeContents(dArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(double[] dArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (double writeNumber : dArr) {
                jsonGenerator.writeNumber(writeNumber);
            }
        }
    }

    @JacksonStdImpl
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);

        public FloatArraySerializer() {
            super(float[].class);
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(floatArraySerializer, beanProperty, bool);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.NUMBER);
        }

        public boolean hasSingleElement(float[] fArr) {
            return fArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, float[] fArr) {
            return fArr.length == 0;
        }

        public final void serialize(float[] fArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int length = fArr.length;
            if (length != 1 || !_shouldUnwrapSingle(serializerProvider)) {
                jsonGenerator.writeStartArray(length);
                jsonGenerator.setCurrentValue(fArr);
                serializeContents(fArr, jsonGenerator, serializerProvider);
                jsonGenerator.writeEndArray();
                return;
            }
            serializeContents(fArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(float[] fArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (float writeNumber : fArr) {
                jsonGenerator.writeNumber(writeNumber);
            }
        }
    }

    @JacksonStdImpl
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);

        public IntArraySerializer() {
            super(int[].class);
        }

        protected IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.INTEGER);
        }

        public boolean hasSingleElement(int[] iArr) {
            return iArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, int[] iArr) {
            return iArr.length == 0;
        }

        public final void serialize(int[] iArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (iArr.length != 1 || !_shouldUnwrapSingle(serializerProvider)) {
                jsonGenerator.setCurrentValue(iArr);
                jsonGenerator.writeArray(iArr, 0, iArr.length);
                return;
            }
            serializeContents(iArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(int[] iArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (int writeNumber : iArr) {
                jsonGenerator.writeNumber(writeNumber);
            }
        }
    }

    @JacksonStdImpl
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);

        public LongArraySerializer() {
            super(long[].class);
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(longArraySerializer, beanProperty, bool);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.NUMBER);
        }

        public boolean hasSingleElement(long[] jArr) {
            return jArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, long[] jArr) {
            return jArr.length == 0;
        }

        public final void serialize(long[] jArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (jArr.length != 1 || !_shouldUnwrapSingle(serializerProvider)) {
                jsonGenerator.setCurrentValue(jArr);
                jsonGenerator.writeArray(jArr, 0, jArr.length);
                return;
            }
            serializeContents(jArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(long[] jArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (long writeNumber : jArr) {
                jsonGenerator.writeNumber(writeNumber);
            }
        }
    }

    @JacksonStdImpl
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);

        public ShortArraySerializer() {
            super(short[].class);
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(shortArraySerializer, beanProperty, bool);
        }

        public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitArrayFormat(jsonFormatVisitorWrapper, javaType, JsonFormatTypes.INTEGER);
        }

        public boolean hasSingleElement(short[] sArr) {
            return sArr.length == 1;
        }

        public boolean isEmpty(SerializerProvider serializerProvider, short[] sArr) {
            return sArr.length == 0;
        }

        public final void serialize(short[] sArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            int length = sArr.length;
            if (length != 1 || !_shouldUnwrapSingle(serializerProvider)) {
                jsonGenerator.writeStartArray(length);
                jsonGenerator.setCurrentValue(sArr);
                serializeContents(sArr, jsonGenerator, serializerProvider);
                jsonGenerator.writeEndArray();
                return;
            }
            serializeContents(sArr, jsonGenerator, serializerProvider);
        }

        public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            for (short writeNumber : sArr) {
                jsonGenerator.writeNumber((int) writeNumber);
            }
        }
    }

    public static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        protected TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
        }

        protected TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
        }

        public final ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
            return this;
        }
    }

    static {
        HashMap<String, JsonSerializer<?>> hashMap = new HashMap<>();
        _arraySerializers = hashMap;
        hashMap.put(boolean[].class.getName(), new BooleanArraySerializer());
        _arraySerializers.put(byte[].class.getName(), new ByteArraySerializer());
        _arraySerializers.put(char[].class.getName(), new CharArraySerializer());
        _arraySerializers.put(short[].class.getName(), new ShortArraySerializer());
        _arraySerializers.put(int[].class.getName(), new IntArraySerializer());
        _arraySerializers.put(long[].class.getName(), new LongArraySerializer());
        _arraySerializers.put(float[].class.getName(), new FloatArraySerializer());
        _arraySerializers.put(double[].class.getName(), new DoubleArraySerializer());
    }

    public static JsonSerializer<?> findStandardImpl(Class<?> cls) {
        return (JsonSerializer) _arraySerializers.get(cls.getName());
    }
}
