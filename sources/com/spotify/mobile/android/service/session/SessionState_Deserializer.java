package com.spotify.mobile.android.service.session;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class SessionState_Deserializer extends StdDeserializer<SessionState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.service.session.SessionState_Deserializer$1 reason: invalid class name */
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

    SessionState_Deserializer() {
        super(SessionState.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    private String c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.service.session.SessionState deserialize(com.fasterxml.jackson.core.JsonParser r19, com.fasterxml.jackson.databind.DeserializationContext r20) {
        /*
            r18 = this;
            r1 = r20
            com.fasterxml.jackson.core.JsonToken r0 = r19.getCurrentToken()     // Catch:{ RuntimeException -> 0x015a }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x015a }
            r3 = 0
            if (r0 != r2) goto L_0x000c
            return r3
        L_0x000c:
            r4 = r3
            r5 = r4
            r10 = r5
            r14 = r10
            r15 = r14
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0018:
            com.fasterxml.jackson.core.JsonToken r2 = r19.nextToken()     // Catch:{ RuntimeException -> 0x015a }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x015a }
            if (r2 == r3) goto L_0x0155
            int[] r2 = com.spotify.mobile.android.service.session.SessionState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x015a }
            com.fasterxml.jackson.core.JsonToken r3 = r19.getCurrentToken()     // Catch:{ RuntimeException -> 0x015a }
            int r3 = r3.ordinal()     // Catch:{ RuntimeException -> 0x015a }
            r2 = r2[r3]     // Catch:{ RuntimeException -> 0x015a }
            r3 = 1
            if (r2 == r3) goto L_0x0032
            r2 = r19
            goto L_0x0018
        L_0x0032:
            java.lang.String r2 = r19.getCurrentName()     // Catch:{ RuntimeException -> 0x015a }
            r16 = -1
            int r17 = r2.hashCode()     // Catch:{ RuntimeException -> 0x015a }
            switch(r17) {
                case -1784384254: goto L_0x00b5;
                case -1628385413: goto L_0x00aa;
                case -1552883090: goto L_0x00a0;
                case -1252302129: goto L_0x0095;
                case -1106171118: goto L_0x008b;
                case -579210487: goto L_0x0081;
                case 642643461: goto L_0x0077;
                case 1014577290: goto L_0x006c;
                case 1468951249: goto L_0x0062;
                case 1481071862: goto L_0x0058;
                case 1773878552: goto L_0x004c;
                case 2096554809: goto L_0x0041;
                default: goto L_0x003f;
            }     // Catch:{ RuntimeException -> 0x015a }
        L_0x003f:
            goto L_0x00bf
        L_0x0041:
            java.lang.String r0 = "current_user_name"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 1
            goto L_0x00c0
        L_0x004c:
            java.lang.String r0 = "payment_state"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 10
            goto L_0x00c0
        L_0x0058:
            java.lang.String r0 = "country_code"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 6
            goto L_0x00c0
        L_0x0062:
            java.lang.String r0 = "current_user"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            goto L_0x00c0
        L_0x006c:
            java.lang.String r0 = "product_type"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 11
            goto L_0x00c0
        L_0x0077:
            java.lang.String r0 = "logging_in"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 3
            goto L_0x00c0
        L_0x0081:
            java.lang.String r0 = "connected"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 7
            goto L_0x00c0
        L_0x008b:
            java.lang.String r0 = "current_account_type"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 5
            goto L_0x00c0
        L_0x0095:
            java.lang.String r0 = "can_stream"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 9
            goto L_0x00c0
        L_0x00a0:
            java.lang.String r0 = "logging_out"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 4
            goto L_0x00c0
        L_0x00aa:
            java.lang.String r0 = "can_connect"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 8
            goto L_0x00c0
        L_0x00b5:
            java.lang.String r0 = "logged_in"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x015a }
            if (r0 == 0) goto L_0x00bf
            r0 = 2
            goto L_0x00c0
        L_0x00bf:
            r0 = -1
        L_0x00c0:
            switch(r0) {
                case 0: goto L_0x0145;
                case 1: goto L_0x013a;
                case 2: goto L_0x012f;
                case 3: goto L_0x0124;
                case 4: goto L_0x0119;
                case 5: goto L_0x0100;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d3;
                case 11: goto L_0x00ca;
                default: goto L_0x00c3;
            }     // Catch:{ RuntimeException -> 0x015a }
        L_0x00c3:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0150
        L_0x00ca:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            java.lang.String r15 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x00d3:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            java.lang.String r14 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x00dc:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            boolean r13 = a(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x00e5:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            boolean r12 = a(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x00ee:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            boolean r11 = a(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x00f7:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            java.lang.String r10 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x0100:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ RuntimeException -> 0x015a }
            java.lang.String r2 = "int"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r2)     // Catch:{ RuntimeException -> 0x015a }
            r2 = r19
            java.lang.Object r0 = r0.deserialize(r2, r1)     // Catch:{ RuntimeException -> 0x015a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ RuntimeException -> 0x015a }
            int r9 = r0.intValue()     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x0119:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            boolean r8 = a(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x0124:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            boolean r7 = a(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x012f:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            boolean r6 = a(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x013a:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            java.lang.String r5 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x0145:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x015a }
            java.lang.String r4 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x0150:
            r19.skipChildren()     // Catch:{ RuntimeException -> 0x015a }
            goto L_0x0018
        L_0x0155:
            com.spotify.mobile.android.service.session.SessionState r0 = com.spotify.mobile.android.service.session.SessionState.create(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ RuntimeException -> 0x015a }
            return r0
        L_0x015a:
            r0 = move-exception
        L_0x015b:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x0166
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x015b
        L_0x0166:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x0170
        L_0x016f:
            throw r0
        L_0x0170:
            goto L_0x016f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.session.SessionState_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.service.session.SessionState");
    }
}
