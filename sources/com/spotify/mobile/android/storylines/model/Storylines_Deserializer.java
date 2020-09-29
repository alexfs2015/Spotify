package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class Storylines_Deserializer extends StdDeserializer<Storylines> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.storylines.model.Storylines_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    Storylines_Deserializer() {
        super(Storylines.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Storylines deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
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
                        if (currentName.hashCode() == -1482975478) {
                            String str = "risiUnystt";
                            if (currentName.equals("entityUris")) {
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
                                for (String str2 : linkedList) {
                                    int i2 = i + 1;
                                    strArr2[i] = str2;
                                    int i3 = i2;
                                    i = i2;
                                }
                                strArr = strArr2;
                            }
                        }
                    }
                }
                return new Storylines(strArr);
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
