package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@JsonDeserialize(using = Targetings_Deserializer.class)
@JsonSerialize(using = Serializer.class)
public class Targetings implements JacksonModel {
    public static final String AD_USER_ID = "aduserid";
    public Map<String, String> mCustomTargetings;

    public static class Serializer extends JsonSerializer<Targetings> {
        public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            Targetings targetings = (Targetings) obj;
            jsonGenerator.writeStartObject();
            for (Entry entry : targetings.mCustomTargetings.entrySet()) {
                jsonGenerator.writeStringField((String) entry.getKey(), (String) entry.getValue());
            }
            jsonGenerator.writeEndObject();
        }
    }

    public Targetings() {
        this(Collections.emptyMap());
    }

    @JsonCreator
    public Targetings(Map<String, String> map) {
        this.mCustomTargetings = new HashMap(map);
    }

    public Map<String, String> getCustomTargetings() {
        return this.mCustomTargetings;
    }
}
