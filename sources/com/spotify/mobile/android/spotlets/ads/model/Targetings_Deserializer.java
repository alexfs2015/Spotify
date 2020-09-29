package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.HashMap;
import java.util.Map;

public final class Targetings_Deserializer extends StdDeserializer<Targetings> {
    private static final long serialVersionUID = 1;

    Targetings_Deserializer() {
        super(Targetings.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Targetings deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            return new Targetings(b(jsonParser, deserializationContext));
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    private Map<String, String> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String c = c(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(c, c(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    private String c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    public final boolean isCachable() {
        return true;
    }
}
