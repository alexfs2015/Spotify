package com.spotify.mobile.android.util.loader;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class SettingsState_Deserializer extends StdDeserializer<SettingsState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.util.loader.SettingsState_Deserializer$1 reason: invalid class name */
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

    SettingsState_Deserializer() {
        super(SettingsState.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    private static int b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    private String d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.util.loader.SettingsState deserialize(com.fasterxml.jackson.core.JsonParser r24, com.fasterxml.jackson.databind.DeserializationContext r25) {
        /*
            r23 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r24.getCurrentToken()     // Catch:{ RuntimeException -> 0x01c3 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01c3 }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r9 = r2
            r20 = r9
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0021:
            com.fasterxml.jackson.core.JsonToken r1 = r24.nextToken()     // Catch:{ RuntimeException -> 0x01c3 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x01c3 }
            if (r1 == r2) goto L_0x01be
            int[] r1 = com.spotify.mobile.android.util.loader.SettingsState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x01c3 }
            com.fasterxml.jackson.core.JsonToken r2 = r24.getCurrentToken()     // Catch:{ RuntimeException -> 0x01c3 }
            int r2 = r2.ordinal()     // Catch:{ RuntimeException -> 0x01c3 }
            r1 = r1[r2]     // Catch:{ RuntimeException -> 0x01c3 }
            r2 = 1
            if (r1 == r2) goto L_0x0039
            goto L_0x0021
        L_0x0039:
            java.lang.String r1 = r24.getCurrentName()     // Catch:{ RuntimeException -> 0x01c3 }
            r21 = -1
            int r22 = r1.hashCode()     // Catch:{ RuntimeException -> 0x01c3 }
            switch(r22) {
                case -1987688240: goto L_0x0104;
                case -1987172280: goto L_0x00fa;
                case -1822942593: goto L_0x00f0;
                case -766147693: goto L_0x00e5;
                case -646302131: goto L_0x00da;
                case -500098086: goto L_0x00d0;
                case -192621201: goto L_0x00c5;
                case -116400606: goto L_0x00ba;
                case -67167409: goto L_0x00af;
                case 3119: goto L_0x00a5;
                case 236609293: goto L_0x0099;
                case 263664509: goto L_0x008d;
                case 430847808: goto L_0x0082;
                case 565277992: goto L_0x0077;
                case 694817712: goto L_0x006b;
                case 1397903036: goto L_0x005f;
                case 1602120665: goto L_0x0053;
                case 1898574617: goto L_0x0048;
                default: goto L_0x0046;
            }     // Catch:{ RuntimeException -> 0x01c3 }
        L_0x0046:
            goto L_0x010e
        L_0x0048:
            java.lang.String r0 = "play_explicit_content"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 1
            goto L_0x010f
        L_0x0053:
            java.lang.String r0 = "show_unavailable_tracks"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 15
            goto L_0x010f
        L_0x005f:
            java.lang.String r0 = "crossfade"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 13
            goto L_0x010f
        L_0x006b:
            java.lang.String r0 = "crossfade_time_seconds"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 14
            goto L_0x010f
        L_0x0077:
            java.lang.String r0 = "download_over_3g"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 3
            goto L_0x010f
        L_0x0082:
            java.lang.String r0 = "stream_quality"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 5
            goto L_0x010f
        L_0x008d:
            java.lang.String r0 = "loudness_environment"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 12
            goto L_0x010f
        L_0x0099:
            java.lang.String r0 = "normalize"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 11
            goto L_0x010f
        L_0x00a5:
            java.lang.String r0 = "ap"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 6
            goto L_0x010f
        L_0x00af:
            java.lang.String r0 = "webgate_url"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 17
            goto L_0x010f
        L_0x00ba:
            java.lang.String r0 = "local_devices_only"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 16
            goto L_0x010f
        L_0x00c5:
            java.lang.String r0 = "gapless"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 9
            goto L_0x010f
        L_0x00d0:
            java.lang.String r0 = "private_session"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 2
            goto L_0x010f
        L_0x00da:
            java.lang.String r0 = "automix"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 10
            goto L_0x010f
        L_0x00e5:
            java.lang.String r0 = "seconds_to_offline_expiry"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 8
            goto L_0x010f
        L_0x00f0:
            java.lang.String r0 = "offline_mode"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 0
            goto L_0x010f
        L_0x00fa:
            java.lang.String r0 = "download_quality"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 4
            goto L_0x010f
        L_0x0104:
            java.lang.String r0 = "facebook_connected"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01c3 }
            if (r0 == 0) goto L_0x010e
            r0 = 7
            goto L_0x010f
        L_0x010e:
            r0 = -1
        L_0x010f:
            switch(r0) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x01a7;
                case 2: goto L_0x019e;
                case 3: goto L_0x0195;
                case 4: goto L_0x018c;
                case 5: goto L_0x0183;
                case 6: goto L_0x017a;
                case 7: goto L_0x0171;
                case 8: goto L_0x0168;
                case 9: goto L_0x015f;
                case 10: goto L_0x0156;
                case 11: goto L_0x014d;
                case 12: goto L_0x0144;
                case 13: goto L_0x013b;
                case 14: goto L_0x0132;
                case 15: goto L_0x0129;
                case 16: goto L_0x0120;
                case 17: goto L_0x0117;
                default: goto L_0x0112;
            }     // Catch:{ RuntimeException -> 0x01c3 }
        L_0x0112:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x01b9
        L_0x0117:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            java.lang.String r20 = r23.d(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0120:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r19 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0129:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r18 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0132:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            int r17 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x013b:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r16 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0144:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            int r15 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x014d:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r14 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0156:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r13 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x015f:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r12 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0168:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            int r11 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0171:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r10 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x017a:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            java.lang.String r9 = r23.d(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0183:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            int r8 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x018c:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            int r7 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x0195:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r6 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x019e:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r5 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x01a7:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r4 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x01b0:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01c3 }
            boolean r3 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x01b9:
            r24.skipChildren()     // Catch:{ RuntimeException -> 0x01c3 }
            goto L_0x0021
        L_0x01be:
            com.spotify.mobile.android.util.loader.SettingsState r0 = com.spotify.mobile.android.util.loader.SettingsState.create(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ RuntimeException -> 0x01c3 }
            return r0
        L_0x01c3:
            r0 = move-exception
        L_0x01c4:
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01cf
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x01c4
        L_0x01cf:
            java.lang.String r1 = r0.getMessage()
            r2 = r25
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r2, r1, r0)
            goto L_0x01db
        L_0x01da:
            throw r0
        L_0x01db:
            goto L_0x01da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.util.loader.SettingsState_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.util.loader.SettingsState");
    }
}
