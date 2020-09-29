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

    StorylinesCardContent_Deserializer() {
        super(StorylinesCardContent.class);
    }

    private static int a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "nit";
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.storylines.model.StorylinesCardContent deserialize(com.fasterxml.jackson.core.JsonParser r14, com.fasterxml.jackson.databind.DeserializationContext r15) {
        /*
            r13 = this;
            r12 = 5
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 0
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x013e }
            r12 = 2
            r2 = 0
            r12 = 4
            if (r0 != r1) goto L_0x000e
            return r2
        L_0x000e:
            r3 = r2
            r3 = r2
            r4 = r3
            r4 = r3
            r5 = r4
            r5 = r4
            r6 = r5
            r7 = r6
            r7 = r6
            r8 = r7
            r9 = r8
            r9 = r8
        L_0x001a:
            r12 = 7
            com.fasterxml.jackson.core.JsonToken r0 = r14.nextToken()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 4
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x013e }
            r12 = 7
            if (r0 == r1) goto L_0x0137
            int[] r0 = com.spotify.mobile.android.storylines.model.StorylinesCardContent_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x013e }
            com.fasterxml.jackson.core.JsonToken r1 = r14.getCurrentToken()     // Catch:{ RuntimeException -> 0x013e }
            int r1 = r1.ordinal()     // Catch:{ RuntimeException -> 0x013e }
            r0 = r0[r1]     // Catch:{ RuntimeException -> 0x013e }
            r12 = 1
            r1 = 1
            r12 = 5
            if (r0 == r1) goto L_0x0037
            goto L_0x001a
        L_0x0037:
            r12 = 0
            java.lang.String r0 = r14.getCurrentName()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 7
            r10 = -1
            r12 = 0
            int r11 = r0.hashCode()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 3
            switch(r11) {
                case -1185250696: goto L_0x00a7;
                case -815585765: goto L_0x0096;
                case -740574583: goto L_0x0086;
                case -428646061: goto L_0x0076;
                case 45673625: goto L_0x0067;
                case 574510245: goto L_0x0059;
                case 629723762: goto L_0x0049;
                default: goto L_0x0047;
            }     // Catch:{ RuntimeException -> 0x013e }
        L_0x0047:
            r12 = 3
            goto L_0x00b6
        L_0x0049:
            r12 = 3
            java.lang.String r1 = "etsarmiaNs"
            java.lang.String r1 = "artistName"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 4
            if (r0 == 0) goto L_0x00b6
            r1 = 5
            r1 = 2
            r12 = 7
            goto L_0x00b8
        L_0x0059:
            java.lang.String r11 = "itrmsiUar"
            java.lang.String r11 = "artistUri"
            r12 = 2
            boolean r0 = r0.equals(r11)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 2
            if (r0 == 0) goto L_0x00b6
            r12 = 5
            goto L_0x00b8
        L_0x0067:
            r12 = 7
            java.lang.String r1 = "lyrnoGeotsid"
            java.lang.String r1 = "storylineGid"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x013e }
            if (r0 == 0) goto L_0x00b6
            r12 = 3
            r1 = 0
            r12 = 2
            goto L_0x00b8
        L_0x0076:
            r12 = 5
            java.lang.String r1 = "ravaabtiU"
            java.lang.String r1 = "avatarUri"
            r12 = 6
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 3
            if (r0 == 0) goto L_0x00b6
            r1 = 0
            r1 = 3
            goto L_0x00b8
        L_0x0086:
            r12 = 1
            java.lang.String r1 = "teiUnibyr"
            java.lang.String r1 = "entityUri"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 6
            if (r0 == 0) goto L_0x00b6
            r1 = 5
            r1 = 4
            r12 = 4
            goto L_0x00b8
        L_0x0096:
            r12 = 4
            java.lang.String r1 = "Uaeritgtt"
            java.lang.String r1 = "targetUri"
            r12 = 4
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 5
            if (r0 == 0) goto L_0x00b6
            r12 = 6
            r1 = 5
            r12 = 1
            goto L_0x00b8
        L_0x00a7:
            r12 = 0
            java.lang.String r1 = "images"
            r12 = 3
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 0
            if (r0 == 0) goto L_0x00b6
            r12 = 3
            r1 = 6
            r12 = 0
            goto L_0x00b8
        L_0x00b6:
            r1 = -1
            r12 = r1
        L_0x00b8:
            switch(r1) {
                case 0: goto L_0x0125;
                case 1: goto L_0x011b;
                case 2: goto L_0x0111;
                case 3: goto L_0x0106;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00c0;
                default: goto L_0x00bb;
            }     // Catch:{ RuntimeException -> 0x013e }
        L_0x00bb:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 6
            goto L_0x0130
        L_0x00c0:
            r12 = 3
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x013e }
            r12 = 4
            if (r0 != r1) goto L_0x00d2
            r9 = r2
            r12 = 7
            goto L_0x001a
        L_0x00d2:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x013e }
            r12 = 2
            r0.<init>()     // Catch:{ RuntimeException -> 0x013e }
        L_0x00d8:
            r12 = 2
            com.fasterxml.jackson.core.JsonToken r1 = r14.nextToken()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 4
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x013e }
            r12 = 6
            if (r1 == r9) goto L_0x00ed
            r12 = 3
            com.spotify.mobile.android.storylines.model.StorylinesCardImageModel r1 = r13.c(r14, r15)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 7
            r0.add(r1)     // Catch:{ RuntimeException -> 0x013e }
            goto L_0x00d8
        L_0x00ed:
            r9 = r0
            r12 = 0
            goto L_0x001a
        L_0x00f1:
            r12 = 2
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            java.lang.String r8 = r13.d(r14, r15)     // Catch:{ RuntimeException -> 0x013e }
            goto L_0x001a
        L_0x00fb:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 2
            java.lang.String r7 = r13.d(r14, r15)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 6
            goto L_0x001a
        L_0x0106:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 5
            java.lang.String r6 = r13.d(r14, r15)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 1
            goto L_0x001a
        L_0x0111:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            java.lang.String r5 = r13.d(r14, r15)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 2
            goto L_0x001a
        L_0x011b:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            java.lang.String r4 = r13.d(r14, r15)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 4
            goto L_0x001a
        L_0x0125:
            r12 = 3
            r14.nextValue()     // Catch:{ RuntimeException -> 0x013e }
            java.lang.String r3 = r13.d(r14, r15)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 1
            goto L_0x001a
        L_0x0130:
            r12 = 6
            r14.skipChildren()     // Catch:{ RuntimeException -> 0x013e }
            r12 = 6
            goto L_0x001a
        L_0x0137:
            r12 = 0
            com.spotify.mobile.android.storylines.model.StorylinesCardContent r14 = com.spotify.mobile.android.storylines.model.StorylinesCardContent.create(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x013e }
            r12 = 3
            return r14
        L_0x013e:
            r14 = move-exception
        L_0x013f:
            r12 = 2
            java.lang.Throwable r0 = r14.getCause()
            r12 = 7
            if (r0 == 0) goto L_0x014d
            java.lang.Throwable r14 = r14.getCause()
            r12 = 2
            goto L_0x013f
        L_0x014d:
            java.lang.String r0 = r14.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r14 = com.fasterxml.jackson.databind.JsonMappingException.from(r15, r0, r14)
            r12 = 5
            goto L_0x0159
        L_0x0157:
            r12 = 6
            throw r14
        L_0x0159:
            goto L_0x0157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.storylines.model.StorylinesCardContent_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.storylines.model.StorylinesCardContent");
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
                        String str4 = "tisheh";
                        if (currentName.equals("height")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 116076:
                        String str5 = "uri";
                        if (currentName.equals("uri")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3575610:
                        String str6 = "yept";
                        if (currentName.equals(MoatAdEvent.EVENT_TYPE)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 113126854:
                        String str7 = "dhtit";
                        if (currentName.equals("width")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1911932886:
                        String str8 = "apIgdei";
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

    public final boolean isCachable() {
        return true;
    }
}
