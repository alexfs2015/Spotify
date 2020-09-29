package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.moat.analytics.mobile.MoatAdEvent;

public final class StorylinesCardContent_Deserializer extends StdDeserializer<StorylinesCardContent> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.storylines.model.StorylinesCardContent_Deserializer$1 reason: invalid class name */
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

    StorylinesCardContent_Deserializer() {
        super(StorylinesCardContent.class);
    }

    private static int a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    private StorylinesCardImageModel c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1221029593:
                        if (currentName.equals("height")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3575610:
                        if (currentName.equals(MoatAdEvent.EVENT_TYPE)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 113126854:
                        if (currentName.equals("width")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1911932886:
                        if (currentName.equals("imageId")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = d(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    str2 = d(jsonParser, deserializationContext);
                } else if (c == 2) {
                    jsonParser.nextValue();
                    i = a(jsonParser, deserializationContext);
                } else if (c == 3) {
                    jsonParser.nextValue();
                    i2 = a(jsonParser, deserializationContext);
                } else if (c != 4) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    str3 = d(jsonParser, deserializationContext);
                }
            }
        }
        return StorylinesCardImageModel.create(str, str2, i, i2, str3);
    }

    private String d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.storylines.model.StorylinesCardContent deserialize(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14) {
        /*
            r12 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00e8 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x00e8 }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0011:
            com.fasterxml.jackson.core.JsonToken r0 = r13.nextToken()     // Catch:{ RuntimeException -> 0x00e8 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == r1) goto L_0x00e3
            int[] r0 = com.spotify.mobile.android.storylines.model.StorylinesCardContent_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x00e8 }
            com.fasterxml.jackson.core.JsonToken r1 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00e8 }
            int r1 = r1.ordinal()     // Catch:{ RuntimeException -> 0x00e8 }
            r0 = r0[r1]     // Catch:{ RuntimeException -> 0x00e8 }
            r1 = 1
            if (r0 == r1) goto L_0x0029
            goto L_0x0011
        L_0x0029:
            java.lang.String r0 = r13.getCurrentName()     // Catch:{ RuntimeException -> 0x00e8 }
            r10 = -1
            int r11 = r0.hashCode()     // Catch:{ RuntimeException -> 0x00e8 }
            switch(r11) {
                case -1185250696: goto L_0x0071;
                case -815585765: goto L_0x0067;
                case -740574583: goto L_0x005d;
                case -428646061: goto L_0x0053;
                case 45673625: goto L_0x0049;
                case 574510245: goto L_0x0040;
                case 629723762: goto L_0x0036;
                default: goto L_0x0035;
            }     // Catch:{ RuntimeException -> 0x00e8 }
        L_0x0035:
            goto L_0x007b
        L_0x0036:
            java.lang.String r1 = "artistName"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            r1 = 2
            goto L_0x007c
        L_0x0040:
            java.lang.String r11 = "artistUri"
            boolean r0 = r0.equals(r11)     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            goto L_0x007c
        L_0x0049:
            java.lang.String r1 = "storylineGid"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            r1 = 0
            goto L_0x007c
        L_0x0053:
            java.lang.String r1 = "avatarUri"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            r1 = 3
            goto L_0x007c
        L_0x005d:
            java.lang.String r1 = "entityUri"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            r1 = 4
            goto L_0x007c
        L_0x0067:
            java.lang.String r1 = "targetUri"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            r1 = 5
            goto L_0x007c
        L_0x0071:
            java.lang.String r1 = "images"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            r1 = 6
            goto L_0x007c
        L_0x007b:
            r1 = -1
        L_0x007c:
            switch(r1) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00a8;
                case 6: goto L_0x0083;
                default: goto L_0x007f;
            }     // Catch:{ RuntimeException -> 0x00e8 }
        L_0x007f:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x00de
        L_0x0083:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00e8 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x00e8 }
            if (r0 != r1) goto L_0x0090
            r9 = r2
            goto L_0x0011
        L_0x0090:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x00e8 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x00e8 }
        L_0x0095:
            com.fasterxml.jackson.core.JsonToken r1 = r13.nextToken()     // Catch:{ RuntimeException -> 0x00e8 }
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x00e8 }
            if (r1 == r9) goto L_0x00a5
            com.spotify.mobile.android.storylines.model.StorylinesCardImageModel r1 = r12.c(r13, r14)     // Catch:{ RuntimeException -> 0x00e8 }
            r0.add(r1)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0095
        L_0x00a5:
            r9 = r0
            goto L_0x0011
        L_0x00a8:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.String r8 = r12.d(r13, r14)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0011
        L_0x00b1:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.String r7 = r12.d(r13, r14)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0011
        L_0x00ba:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.String r6 = r12.d(r13, r14)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0011
        L_0x00c3:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.String r5 = r12.d(r13, r14)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0011
        L_0x00cc:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.String r4 = r12.d(r13, r14)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0011
        L_0x00d5:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00e8 }
            java.lang.String r3 = r12.d(r13, r14)     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0011
        L_0x00de:
            r13.skipChildren()     // Catch:{ RuntimeException -> 0x00e8 }
            goto L_0x0011
        L_0x00e3:
            com.spotify.mobile.android.storylines.model.StorylinesCardContent r13 = com.spotify.mobile.android.storylines.model.StorylinesCardContent.create(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x00e8 }
            return r13
        L_0x00e8:
            r13 = move-exception
        L_0x00e9:
            java.lang.Throwable r0 = r13.getCause()
            if (r0 == 0) goto L_0x00f4
            java.lang.Throwable r13 = r13.getCause()
            goto L_0x00e9
        L_0x00f4:
            java.lang.String r0 = r13.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r13 = com.fasterxml.jackson.databind.JsonMappingException.from(r14, r0, r13)
            goto L_0x00fe
        L_0x00fd:
            throw r13
        L_0x00fe:
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.storylines.model.StorylinesCardContent_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.storylines.model.StorylinesCardContent");
    }
}
