package com.spotify.mobile.android.hubframework.model.serializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class HubsModelFailingSerializer extends JsonSerializer<Object> {
    public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = "tpsuc osolcataa eOsi tyoS ed rNdoeotinun suernosl sHzJrltrmb isl ";
        throw new JsonGenerationException("Hubs model classes do not currently support serialization to JSON", jsonGenerator);
    }
}
