package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;

public interface JsonMapFormatVisitor extends JsonFormatVisitorWithSerializerProvider {
    void keyFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);

    void valueFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
