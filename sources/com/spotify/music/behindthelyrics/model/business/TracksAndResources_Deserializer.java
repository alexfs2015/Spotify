package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class TracksAndResources_Deserializer extends StdDeserializer<TracksAndResources> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.behindthelyrics.model.business.TracksAndResources_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    TracksAndResources_Deserializer() {
        super(TracksAndResources.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TracksAndResources deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            while (true) {
                String[] strArr = null;
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                        String currentName = jsonParser.getCurrentName();
                        char c = 65535;
                        int i = 0;
                        if (currentName.hashCode() == 729854066) {
                            if (currentName.equals("trackUris")) {
                                c = 0;
                            }
                        }
                        if (c != 0) {
                            jsonParser.nextValue();
                            jsonParser.skipChildren();
                        } else {
                            jsonParser.nextValue();
                            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                                LinkedList<String> linkedList = new LinkedList<>();
                                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                    linkedList.add(jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : _parseString(jsonParser, deserializationContext));
                                }
                                String[] strArr2 = new String[linkedList.size()];
                                for (String str : linkedList) {
                                    int i2 = i + 1;
                                    strArr2[i] = str;
                                    i = i2;
                                }
                                strArr = strArr2;
                            }
                        }
                    }
                }
                return new TracksAndResources(strArr);
            }
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    public final boolean isCachable() {
        return true;
    }
}
