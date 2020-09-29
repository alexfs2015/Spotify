package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

public interface JsonFormatVisitorWrapper extends JsonFormatVisitorWithSerializerProvider {

    public static class Base implements JsonFormatVisitorWrapper {
        protected SerializerProvider _provider;

        public JsonAnyFormatVisitor expectAnyFormat(JavaType javaType) {
            return null;
        }

        public JsonArrayFormatVisitor expectArrayFormat(JavaType javaType) {
            return null;
        }

        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType javaType) {
            return null;
        }

        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType javaType) {
            return null;
        }

        public JsonMapFormatVisitor expectMapFormat(JavaType javaType) {
            return null;
        }

        public JsonNullFormatVisitor expectNullFormat(JavaType javaType) {
            return null;
        }

        public JsonNumberFormatVisitor expectNumberFormat(JavaType javaType) {
            return null;
        }

        public JsonObjectFormatVisitor expectObjectFormat(JavaType javaType) {
            return null;
        }

        public JsonStringFormatVisitor expectStringFormat(JavaType javaType) {
            return null;
        }

        public Base(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public SerializerProvider getProvider() {
            return this._provider;
        }
    }

    JsonAnyFormatVisitor expectAnyFormat(JavaType javaType);

    JsonArrayFormatVisitor expectArrayFormat(JavaType javaType);

    JsonBooleanFormatVisitor expectBooleanFormat(JavaType javaType);

    JsonIntegerFormatVisitor expectIntegerFormat(JavaType javaType);

    JsonMapFormatVisitor expectMapFormat(JavaType javaType);

    JsonNullFormatVisitor expectNullFormat(JavaType javaType);

    JsonNumberFormatVisitor expectNumberFormat(JavaType javaType);

    JsonObjectFormatVisitor expectObjectFormat(JavaType javaType);

    JsonStringFormatVisitor expectStringFormat(JavaType javaType);
}
