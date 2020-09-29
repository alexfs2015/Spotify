package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonNodeDeserializer extends BaseNodeDeserializer<JsonNode> {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        protected static final ArrayDeserializer _instance = new ArrayDeserializer();
        private static final long serialVersionUID = 1;

        protected ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        public static ArrayDeserializer getInstance() {
            return _instance;
        }

        public final ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.isExpectedStartArrayToken() ? deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }

        public final ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) {
            return jsonParser.isExpectedStartArrayToken() ? (ArrayNode) updateArray(jsonParser, deserializationContext, arrayNode) : (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }
    }

    static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        protected static final ObjectDeserializer _instance = new ObjectDeserializer();
        private static final long serialVersionUID = 1;

        protected ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        public static ObjectDeserializer getInstance() {
            return _instance;
        }

        public final ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return jsonParser.isExpectedStartObjectToken() ? deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : jsonParser.hasToken(JsonToken.FIELD_NAME) ? deserializeObjectAtName(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : jsonParser.hasToken(JsonToken.END_OBJECT) ? deserializationContext.getNodeFactory().objectNode() : (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }

        public final ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) {
            return (jsonParser.isExpectedStartObjectToken() || jsonParser.hasToken(JsonToken.FIELD_NAME)) ? (ObjectNode) updateObject(jsonParser, deserializationContext, objectNode) : (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }
    }

    protected JsonNodeDeserializer() {
        super(JsonNode.class, null);
    }

    public static JsonDeserializer<? extends JsonNode> getDeserializer(Class<?> cls) {
        return cls == ObjectNode.class ? ObjectDeserializer.getInstance() : cls == ArrayNode.class ? ArrayDeserializer.getInstance() : instance;
    }

    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int currentTokenId = jsonParser.getCurrentTokenId();
        return currentTokenId != 1 ? currentTokenId != 3 ? deserializeAny(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
    }

    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public JsonNode getNullValue(DeserializationContext deserializationContext) {
        return NullNode.getInstance();
    }

    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    public /* bridge */ /* synthetic */ Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return super.supportsUpdate(deserializationConfig);
    }
}
