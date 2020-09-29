package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public final class MissingNode extends ValueNode {
    private static final MissingNode instance = new MissingNode();

    public final String asText() {
        return "";
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final String toString() {
        return "";
    }

    protected MissingNode() {
    }

    public static MissingNode getInstance() {
        return instance;
    }

    public final JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    public final JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNull();
    }

    public final void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.writeNull();
    }

    public final int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }
}
