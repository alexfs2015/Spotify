package com.spotify.music.follow.resolver;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.music.follow.resolver.RxFollowersCountResolver.Count;
import com.spotify.music.follow.resolver.RxFollowersCountResolver.Counts;
import java.util.LinkedList;

public final class RxFollowersCountResolver_Counts_Deserializer extends StdDeserializer<Counts> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.follow.resolver.RxFollowersCountResolver_Counts_Deserializer$1 reason: invalid class name */
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

    RxFollowersCountResolver_Counts_Deserializer() {
        super(Counts.class);
    }

    private static int a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    private Count c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -460163995) {
                    if (hashCode == 458536417 && currentName.equals("following_count")) {
                        c = 1;
                    }
                } else if (currentName.equals("followers_count")) {
                    c = 0;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    i = a(jsonParser, deserializationContext);
                } else if (c != 1) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i2 = a(jsonParser, deserializationContext);
                }
            }
        }
        return new Count(i, i2);
    }

    private Count[] d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<Count> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(c(jsonParser, deserializationContext));
        }
        int i = 0;
        Count[] countArr = new Count[linkedList.size()];
        for (Count count : linkedList) {
            int i2 = i + 1;
            countArr[i] = count;
            i = i2;
        }
        return countArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Counts deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            return new Counts(d(jsonParser, deserializationContext));
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }
}
