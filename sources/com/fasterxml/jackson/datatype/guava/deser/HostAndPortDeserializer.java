package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.net.HostAndPort;

public class HostAndPortDeserializer extends FromStringDeserializer<HostAndPort> {
    private static final long serialVersionUID = 1;
    public static final HostAndPortDeserializer std = new HostAndPortDeserializer();

    public HostAndPortDeserializer() {
        super(HostAndPort.class);
    }

    /* access modifiers changed from: protected */
    public HostAndPort _deserialize(String str, DeserializationContext deserializationContext) {
        return HostAndPort.a(str);
    }

    public HostAndPort deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            return (HostAndPort) super.deserialize(jsonParser, deserializationContext);
        }
        JsonNode jsonNode = (JsonNode) jsonParser.readValueAsTree();
        String asText = jsonNode.path("hostText").asText();
        JsonNode jsonNode2 = jsonNode.get("port");
        return jsonNode2 == null ? HostAndPort.a(asText) : HostAndPort.a(asText, jsonNode2.asInt());
    }
}
