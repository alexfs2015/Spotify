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

    SessionState_Deserializer() {
        super(SessionState.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.service.session.SessionState deserialize(com.fasterxml.jackson.core.JsonParser r19, com.fasterxml.jackson.databind.DeserializationContext r20) {
        /*
            r18 = this;
            r1 = r20
            com.fasterxml.jackson.core.JsonToken r0 = r19.getCurrentToken()     // Catch:{ RuntimeException -> 0x017a }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x017a }
            r3 = 0
            if (r0 != r2) goto L_0x000c
            return r3
        L_0x000c:
            r4 = r3
            r4 = r3
            r5 = r4
            r5 = r4
            r10 = r5
            r10 = r5
            r14 = r10
            r15 = r14
            r15 = r14
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x001c:
            com.fasterxml.jackson.core.JsonToken r2 = r19.nextToken()     // Catch:{ RuntimeException -> 0x017a }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x017a }
            if (r2 == r3) goto L_0x0175
            int[] r2 = com.spotify.mobile.android.service.session.SessionState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x017a }
            com.fasterxml.jackson.core.JsonToken r3 = r19.getCurrentToken()     // Catch:{ RuntimeException -> 0x017a }
            int r3 = r3.ordinal()     // Catch:{ RuntimeException -> 0x017a }
            r2 = r2[r3]     // Catch:{ RuntimeException -> 0x017a }
            r3 = 1
            if (r2 == r3) goto L_0x0038
            r2 = r19
            r2 = r19
            goto L_0x001c
        L_0x0038:
            java.lang.String r2 = r19.getCurrentName()     // Catch:{ RuntimeException -> 0x017a }
            r16 = -1
            int r17 = r2.hashCode()     // Catch:{ RuntimeException -> 0x017a }
            switch(r17) {
                case -1784384254: goto L_0x00cb;
                case -1628385413: goto L_0x00be;
                case -1552883090: goto L_0x00b4;
                case -1252302129: goto L_0x00a7;
                case -1106171118: goto L_0x009d;
                case -579210487: goto L_0x0091;
                case 642643461: goto L_0x0085;
                case 1014577290: goto L_0x007a;
                case 1468951249: goto L_0x006e;
                case 1481071862: goto L_0x0062;
                case 1773878552: goto L_0x0054;
                case 2096554809: goto L_0x0047;
                default: goto L_0x0045;
            }     // Catch:{ RuntimeException -> 0x017a }
        L_0x0045:
            goto L_0x00d7
        L_0x0047:
            java.lang.String r0 = "tnsmeu_es_rercnar"
            java.lang.String r0 = "current_user_name"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 1
            goto L_0x00d8
        L_0x0054:
            java.lang.String r0 = "matmneta_step"
            java.lang.String r0 = "payment_state"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 10
            goto L_0x00d8
        L_0x0062:
            java.lang.String r0 = "oc_uorcyotdn"
            java.lang.String r0 = "country_code"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 6
            goto L_0x00d8
        L_0x006e:
            java.lang.String r0 = "sn_rubtrcuer"
            java.lang.String r0 = "current_user"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 0
            goto L_0x00d8
        L_0x007a:
            java.lang.String r0 = "product_type"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 11
            goto L_0x00d8
        L_0x0085:
            java.lang.String r0 = "gonigib_ln"
            java.lang.String r0 = "logging_in"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 3
            goto L_0x00d8
        L_0x0091:
            java.lang.String r0 = "encnodctt"
            java.lang.String r0 = "connected"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 7
            goto L_0x00d8
        L_0x009d:
            java.lang.String r0 = "current_account_type"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 5
            goto L_0x00d8
        L_0x00a7:
            java.lang.String r0 = "er_nacstpa"
            java.lang.String r0 = "can_stream"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 9
            goto L_0x00d8
        L_0x00b4:
            java.lang.String r0 = "logging_out"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 4
            goto L_0x00d8
        L_0x00be:
            java.lang.String r0 = "tnecnnacot_"
            java.lang.String r0 = "can_connect"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 8
            goto L_0x00d8
        L_0x00cb:
            java.lang.String r0 = "d_snlgigo"
            java.lang.String r0 = "logged_in"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x017a }
            if (r0 == 0) goto L_0x00d7
            r0 = 2
            goto L_0x00d8
        L_0x00d7:
            r0 = -1
        L_0x00d8:
            switch(r0) {
                case 0: goto L_0x0165;
                case 1: goto L_0x0158;
                case 2: goto L_0x014d;
                case 3: goto L_0x0142;
                case 4: goto L_0x0137;
                case 5: goto L_0x011a;
                case 6: goto L_0x0111;
                case 7: goto L_0x0108;
                case 8: goto L_0x00ff;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00ed;
                case 11: goto L_0x00e4;
                default: goto L_0x00db;
            }     // Catch:{ RuntimeException -> 0x017a }
        L_0x00db:
            r2 = r19
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x0170
        L_0x00e4:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            java.lang.String r15 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x00ed:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            java.lang.String r14 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x00f6:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            boolean r13 = a(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x00ff:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            boolean r12 = a(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0108:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            boolean r11 = a(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0111:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            java.lang.String r10 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x011a:
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ RuntimeException -> 0x017a }
            java.lang.String r2 = "nti"
            java.lang.String r2 = "int"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r2)     // Catch:{ RuntimeException -> 0x017a }
            r2 = r19
            r2 = r19
            java.lang.Object r0 = r0.deserialize(r2, r1)     // Catch:{ RuntimeException -> 0x017a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ RuntimeException -> 0x017a }
            int r9 = r0.intValue()     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0137:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            boolean r8 = a(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0142:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            boolean r7 = a(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x014d:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            boolean r6 = a(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0158:
            r2 = r19
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            java.lang.String r5 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0165:
            r2 = r19
            r19.nextValue()     // Catch:{ RuntimeException -> 0x017a }
            java.lang.String r4 = r18.c(r19, r20)     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0170:
            r19.skipChildren()     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x001c
        L_0x0175:
            com.spotify.mobile.android.service.session.SessionState r0 = com.spotify.mobile.android.service.session.SessionState.create(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ RuntimeException -> 0x017a }
            return r0
        L_0x017a:
            r0 = move-exception
        L_0x017b:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x0186
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x017b
        L_0x0186:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x0190
        L_0x018f:
            throw r0
        L_0x0190:
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.session.SessionState_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.service.session.SessionState");
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
