package com.spotify.music.libs.search.online.autocomplete;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class QueryAutocompleteResult_Deserializer extends StdDeserializer<QueryAutocompleteResult> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    QueryAutocompleteResult_Deserializer() {
        super(QueryAutocompleteResult.class);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ RuntimeException -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[Catch:{ RuntimeException -> 0x0088 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult deserialize(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10) {
        /*
            r8 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r9.getCurrentToken()     // Catch:{ RuntimeException -> 0x0088 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0088 }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
            r1 = r0
        L_0x000c:
            com.fasterxml.jackson.core.JsonToken r3 = r9.nextToken()     // Catch:{ RuntimeException -> 0x0088 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0088 }
            if (r3 == r4) goto L_0x0082
            int[] r3 = com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0088 }
            com.fasterxml.jackson.core.JsonToken r4 = r9.getCurrentToken()     // Catch:{ RuntimeException -> 0x0088 }
            int r4 = r4.ordinal()     // Catch:{ RuntimeException -> 0x0088 }
            r3 = r3[r4]     // Catch:{ RuntimeException -> 0x0088 }
            r4 = 1
            if (r3 == r4) goto L_0x0024
            goto L_0x000c
        L_0x0024:
            java.lang.String r3 = r9.getCurrentName()     // Catch:{ RuntimeException -> 0x0088 }
            r5 = -1
            int r6 = r3.hashCode()     // Catch:{ RuntimeException -> 0x0088 }
            r7 = -1249474914(0xffffffffb586869e, float:-1.0022957E-6)
            if (r6 == r7) goto L_0x0042
            r7 = 693934058(0x295c97ea, float:4.8981578E-14)
            if (r6 == r7) goto L_0x0038
            goto L_0x004c
        L_0x0038:
            java.lang.String r6 = "requestid"
            boolean r3 = r3.equals(r6)     // Catch:{ RuntimeException -> 0x0088 }
            if (r3 == 0) goto L_0x004c
            r3 = 0
            goto L_0x004d
        L_0x0042:
            java.lang.String r6 = "options"
            boolean r3 = r3.equals(r6)     // Catch:{ RuntimeException -> 0x0088 }
            if (r3 == 0) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x004c:
            r3 = -1
        L_0x004d:
            if (r3 == 0) goto L_0x007a
            if (r3 == r4) goto L_0x0058
            r9.nextValue()     // Catch:{ RuntimeException -> 0x0088 }
            r9.skipChildren()     // Catch:{ RuntimeException -> 0x0088 }
            goto L_0x000c
        L_0x0058:
            r9.nextValue()     // Catch:{ RuntimeException -> 0x0088 }
            com.fasterxml.jackson.core.JsonToken r1 = r9.getCurrentToken()     // Catch:{ RuntimeException -> 0x0088 }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0088 }
            if (r1 != r3) goto L_0x0065
            r1 = r2
            goto L_0x000c
        L_0x0065:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x0088 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0088 }
        L_0x006a:
            com.fasterxml.jackson.core.JsonToken r3 = r9.nextToken()     // Catch:{ RuntimeException -> 0x0088 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x0088 }
            if (r3 == r4) goto L_0x000c
            java.lang.String r3 = r8.b(r9, r10)     // Catch:{ RuntimeException -> 0x0088 }
            r1.add(r3)     // Catch:{ RuntimeException -> 0x0088 }
            goto L_0x006a
        L_0x007a:
            r9.nextValue()     // Catch:{ RuntimeException -> 0x0088 }
            java.lang.String r0 = r8.b(r9, r10)     // Catch:{ RuntimeException -> 0x0088 }
            goto L_0x000c
        L_0x0082:
            com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult r9 = new com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult     // Catch:{ RuntimeException -> 0x0088 }
            r9.<init>(r0, r1)     // Catch:{ RuntimeException -> 0x0088 }
            return r9
        L_0x0088:
            r9 = move-exception
        L_0x0089:
            java.lang.Throwable r0 = r9.getCause()
            if (r0 == 0) goto L_0x0094
            java.lang.Throwable r9 = r9.getCause()
            goto L_0x0089
        L_0x0094:
            java.lang.String r0 = r9.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r9 = com.fasterxml.jackson.databind.JsonMappingException.from(r10, r0, r9)
            goto L_0x009e
        L_0x009d:
            throw r9
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult");
    }

    private String b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    public final boolean isCachable() {
        return true;
    }
}
