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

    SettingsState_Deserializer() {
        super(SettingsState.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    private static int b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.util.loader.SettingsState deserialize(com.fasterxml.jackson.core.JsonParser r24, com.fasterxml.jackson.databind.DeserializationContext r25) {
        /*
            r23 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r24.getCurrentToken()     // Catch:{ RuntimeException -> 0x01de }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01de }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r9 = r2
            r9 = r2
            r20 = r9
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
        L_0x0024:
            com.fasterxml.jackson.core.JsonToken r1 = r24.nextToken()     // Catch:{ RuntimeException -> 0x01de }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x01de }
            if (r1 == r2) goto L_0x01d9
            int[] r1 = com.spotify.mobile.android.util.loader.SettingsState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x01de }
            com.fasterxml.jackson.core.JsonToken r2 = r24.getCurrentToken()     // Catch:{ RuntimeException -> 0x01de }
            int r2 = r2.ordinal()     // Catch:{ RuntimeException -> 0x01de }
            r1 = r1[r2]     // Catch:{ RuntimeException -> 0x01de }
            r2 = 1
            if (r1 == r2) goto L_0x003c
            goto L_0x0024
        L_0x003c:
            java.lang.String r1 = r24.getCurrentName()     // Catch:{ RuntimeException -> 0x01de }
            r21 = -1
            int r22 = r1.hashCode()     // Catch:{ RuntimeException -> 0x01de }
            switch(r22) {
                case -1987688240: goto L_0x011d;
                case -1987172280: goto L_0x0111;
                case -1822942593: goto L_0x0107;
                case -766147693: goto L_0x00fa;
                case -646302131: goto L_0x00ed;
                case -500098086: goto L_0x00e1;
                case -192621201: goto L_0x00d4;
                case -116400606: goto L_0x00c9;
                case -67167409: goto L_0x00bc;
                case 3119: goto L_0x00b2;
                case 236609293: goto L_0x00a6;
                case 263664509: goto L_0x0098;
                case 430847808: goto L_0x008b;
                case 565277992: goto L_0x007e;
                case 694817712: goto L_0x0070;
                case 1397903036: goto L_0x0064;
                case 1602120665: goto L_0x0056;
                case 1898574617: goto L_0x004b;
                default: goto L_0x0049;
            }     // Catch:{ RuntimeException -> 0x01de }
        L_0x0049:
            goto L_0x0129
        L_0x004b:
            java.lang.String r0 = "play_explicit_content"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 1
            goto L_0x012a
        L_0x0056:
            java.lang.String r0 = "las_n_rihutksabaleaoscv"
            java.lang.String r0 = "show_unavailable_tracks"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 15
            goto L_0x012a
        L_0x0064:
            java.lang.String r0 = "crossfade"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 13
            goto L_0x012a
        L_0x0070:
            java.lang.String r0 = "_fsm_ssdrcdetomenescoi"
            java.lang.String r0 = "crossfade_time_seconds"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 14
            goto L_0x012a
        L_0x007e:
            java.lang.String r0 = "edwgoanoor_3_olv"
            java.lang.String r0 = "download_over_3g"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 3
            goto L_0x012a
        L_0x008b:
            java.lang.String r0 = "taiarblq_uytme"
            java.lang.String r0 = "stream_quality"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 5
            goto L_0x012a
        L_0x0098:
            java.lang.String r0 = "snlidobnntmsvenoeu_r"
            java.lang.String r0 = "loudness_environment"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 12
            goto L_0x012a
        L_0x00a6:
            java.lang.String r0 = "normalize"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 11
            goto L_0x012a
        L_0x00b2:
            java.lang.String r0 = "ap"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 6
            goto L_0x012a
        L_0x00bc:
            java.lang.String r0 = "relabewttu_"
            java.lang.String r0 = "webgate_url"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 17
            goto L_0x012a
        L_0x00c9:
            java.lang.String r0 = "local_devices_only"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 16
            goto L_0x012a
        L_0x00d4:
            java.lang.String r0 = "lpspesg"
            java.lang.String r0 = "gapless"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 9
            goto L_0x012a
        L_0x00e1:
            java.lang.String r0 = "eitnesosvts_rai"
            java.lang.String r0 = "private_session"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 2
            goto L_0x012a
        L_0x00ed:
            java.lang.String r0 = "iostmax"
            java.lang.String r0 = "automix"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 10
            goto L_0x012a
        L_0x00fa:
            java.lang.String r0 = "nsompf_eexiyodeno_tsi_crf"
            java.lang.String r0 = "seconds_to_offline_expiry"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 8
            goto L_0x012a
        L_0x0107:
            java.lang.String r0 = "offline_mode"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 0
            goto L_0x012a
        L_0x0111:
            java.lang.String r0 = "qiytoaoaonlwud_l"
            java.lang.String r0 = "download_quality"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 4
            goto L_0x012a
        L_0x011d:
            java.lang.String r0 = "tdeoobc_oncbnekefc"
            java.lang.String r0 = "facebook_connected"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x01de }
            if (r0 == 0) goto L_0x0129
            r0 = 7
            goto L_0x012a
        L_0x0129:
            r0 = -1
        L_0x012a:
            switch(r0) {
                case 0: goto L_0x01cb;
                case 1: goto L_0x01c2;
                case 2: goto L_0x01b9;
                case 3: goto L_0x01b0;
                case 4: goto L_0x01a7;
                case 5: goto L_0x019e;
                case 6: goto L_0x0195;
                case 7: goto L_0x018c;
                case 8: goto L_0x0183;
                case 9: goto L_0x017a;
                case 10: goto L_0x0171;
                case 11: goto L_0x0168;
                case 12: goto L_0x015f;
                case 13: goto L_0x0156;
                case 14: goto L_0x014d;
                case 15: goto L_0x0144;
                case 16: goto L_0x013b;
                case 17: goto L_0x0132;
                default: goto L_0x012d;
            }     // Catch:{ RuntimeException -> 0x01de }
        L_0x012d:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x01d4
        L_0x0132:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r20 = r23.d(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x013b:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r19 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x0144:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r18 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x014d:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            int r17 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x0156:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r16 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x015f:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            int r15 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x0168:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r14 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x0171:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r13 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x017a:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r12 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x0183:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            int r11 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x018c:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r10 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x0195:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            java.lang.String r9 = r23.d(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x019e:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            int r8 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x01a7:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            int r7 = b(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x01b0:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r6 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x01b9:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r5 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x01c2:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r4 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x01cb:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01de }
            boolean r3 = a(r24, r25)     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x01d4:
            r24.skipChildren()     // Catch:{ RuntimeException -> 0x01de }
            goto L_0x0024
        L_0x01d9:
            com.spotify.mobile.android.util.loader.SettingsState r0 = com.spotify.mobile.android.util.loader.SettingsState.create(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ RuntimeException -> 0x01de }
            return r0
        L_0x01de:
            r0 = move-exception
        L_0x01df:
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01ea
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x01df
        L_0x01ea:
            java.lang.String r1 = r0.getMessage()
            r2 = r25
            r2 = r25
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r2, r1, r0)
            goto L_0x01f8
        L_0x01f7:
            throw r0
        L_0x01f8:
            goto L_0x01f7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.util.loader.SettingsState_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.util.loader.SettingsState");
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
