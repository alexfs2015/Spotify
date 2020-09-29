package com.spotify.music.internal.crashes.report;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

class StringWrapperSerializer extends JsonSerializer<String> {
    StringWrapperSerializer() {
    }

    public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = (String) obj;
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("string", str);
        jsonGenerator.writeEndObject();
    }
}
