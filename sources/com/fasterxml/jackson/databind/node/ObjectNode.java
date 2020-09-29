package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ObjectNode extends ContainerNode<ObjectNode> {
    protected final Map<String, JsonNode> _children = new LinkedHashMap();

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
    }

    /* access modifiers changed from: protected */
    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    public Iterator<JsonNode> elements() {
        return this._children.values().iterator();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    public Iterator<Entry<String, JsonNode>> fields() {
        return this._children.entrySet().iterator();
    }

    public JsonNode findValue(String str) {
        for (Entry entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return (JsonNode) entry.getValue();
            }
            JsonNode findValue = ((JsonNode) entry.getValue()).findValue(str);
            if (findValue != null) {
                return findValue;
            }
        }
        return null;
    }

    public JsonNode get(int i) {
        return null;
    }

    public JsonNode get(String str) {
        return (JsonNode) this._children.get(str);
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public final boolean isObject() {
        return true;
    }

    public JsonNode path(String str) {
        JsonNode jsonNode = (JsonNode) this._children.get(str);
        return jsonNode != null ? jsonNode : MissingNode.getInstance();
    }

    public JsonNode replace(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return (JsonNode) this._children.put(str, jsonNode);
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        boolean z = serializerProvider != null && !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        jsonGenerator.writeStartObject(this);
        for (Entry entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName((String) entry.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        boolean z = serializerProvider != null && !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        for (Entry entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName((String) entry.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public JsonNode set(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        this._children.put(str, jsonNode);
        return this;
    }

    public int size() {
        return this._children.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() << 4) + 32);
        sb.append("{");
        int i = 0;
        for (Entry entry : this._children.entrySet()) {
            if (i > 0) {
                sb.append(",");
            }
            i++;
            TextNode.appendQuoted(sb, (String) entry.getKey());
            sb.append(':');
            sb.append(((JsonNode) entry.getValue()).toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
