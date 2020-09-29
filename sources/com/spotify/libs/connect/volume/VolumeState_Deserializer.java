package com.spotify.libs.connect.volume;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class VolumeState_Deserializer extends StdDeserializer<VolumeState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.libs.connect.volume.VolumeState_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final boolean isCachable() {
        return true;
    }

    VolumeState_Deserializer() {
        super(VolumeState.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VolumeState deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            Float f = null;
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            boolean z = false;
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                    String currentName = jsonParser.getCurrentName();
                    char c = 65535;
                    int hashCode = currentName.hashCode();
                    if (hashCode != -810883302) {
                        if (hashCode == 1578925787) {
                            if (currentName.equals("system_initiated")) {
                                c = 0;
                            }
                        }
                    } else if (currentName.equals("volume")) {
                        c = 1;
                    }
                    if (c == 0) {
                        jsonParser.nextValue();
                        z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                    } else if (c != 1) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        f = (Float) NumberDeserializers.find(Float.class, "java.lang.Float").deserialize(jsonParser, deserializationContext);
                    }
                }
            }
            return new VolumeState(z, f);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }
}
