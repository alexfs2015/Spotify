package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class ValueNode extends BaseJsonNode {
    protected ValueNode() {
    }

    public abstract JsonToken asToken();

    public final JsonNode findValue(String str) {
        return null;
    }

    public final JsonNode get(int i) {
        return null;
    }

    public final JsonNode get(String str) {
        return null;
    }

    public final boolean has(String str) {
        return false;
    }

    public final JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, asToken()));
        serialize(jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public String toString() {
        return asText();
    }
}
