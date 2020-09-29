package com.spotify.mobile.android.connect.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;
import java.util.List;

public final class GaiaState_Deserializer extends StdDeserializer<GaiaState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.connect.model.GaiaState_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    GaiaState_Deserializer() {
        super(GaiaState.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "lbsneoa";
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0109 A[Catch:{ RuntimeException -> 0x016d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011a A[Catch:{ RuntimeException -> 0x016d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.connect.model.GaiaState deserialize(com.fasterxml.jackson.core.JsonParser r16, com.fasterxml.jackson.databind.DeserializationContext r17) {
        /*
            r15 = this;
            r1 = r17
            r1 = r17
            com.fasterxml.jackson.core.JsonToken r0 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x016d }
            r3 = 0
            if (r0 != r2) goto L_0x000e
            return r3
        L_0x000e:
            r0 = 0
            r6 = r3
            r8 = r6
            r8 = r6
            r9 = r8
            r9 = r8
            r5 = 0
            r7 = 0
        L_0x0016:
            com.fasterxml.jackson.core.JsonToken r2 = r16.nextToken()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x016d }
            if (r2 == r4) goto L_0x0166
            int[] r2 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r4 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x016d }
            int r4 = r4.ordinal()     // Catch:{ RuntimeException -> 0x016d }
            r2 = r2[r4]     // Catch:{ RuntimeException -> 0x016d }
            r4 = 1
            if (r2 == r4) goto L_0x002e
            goto L_0x0016
        L_0x002e:
            java.lang.String r2 = r16.getCurrentName()     // Catch:{ RuntimeException -> 0x016d }
            int r10 = r2.hashCode()     // Catch:{ RuntimeException -> 0x016d }
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = -1
            switch(r10) {
                case -1912582093: goto L_0x006c;
                case -958911557: goto L_0x0062;
                case 915398906: goto L_0x0056;
                case 1559801053: goto L_0x004a;
                case 1978470580: goto L_0x003e;
                default: goto L_0x003d;
            }     // Catch:{ RuntimeException -> 0x016d }
        L_0x003d:
            goto L_0x0078
        L_0x003e:
            java.lang.String r10 = "raemr_srofernr"
            java.lang.String r10 = "transfer_error"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x016d }
            if (r2 == 0) goto L_0x0078
            r2 = 3
            goto L_0x0079
        L_0x004a:
            java.lang.String r10 = "edvioce"
            java.lang.String r10 = "devices"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x016d }
            if (r2 == 0) goto L_0x0078
            r2 = 4
            goto L_0x0079
        L_0x0056:
            java.lang.String r10 = "eordebvg_iabndcio"
            java.lang.String r10 = "onboarding_device"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x016d }
            if (r2 == 0) goto L_0x0078
            r2 = 1
            goto L_0x0079
        L_0x0062:
            java.lang.String r10 = "is_active"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x016d }
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x0079
        L_0x006c:
            java.lang.String r10 = "ahe_osbc_ka_ullalodlsbcyp"
            java.lang.String r10 = "should_use_local_playback"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x016d }
            if (r2 == 0) goto L_0x0078
            r2 = 2
            goto L_0x0079
        L_0x0078:
            r2 = -1
        L_0x0079:
            if (r2 == 0) goto L_0x0159
            if (r2 == r4) goto L_0x014e
            if (r2 == r13) goto L_0x0141
            if (r2 == r12) goto L_0x00b1
            if (r2 == r11) goto L_0x008a
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            r16.skipChildren()     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x0016
        L_0x008a:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r2 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x016d }
            if (r2 != r4) goto L_0x0099
            r9 = r3
            r9 = r3
            goto L_0x0016
        L_0x0099:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x016d }
            r2.<init>()     // Catch:{ RuntimeException -> 0x016d }
        L_0x009e:
            com.fasterxml.jackson.core.JsonToken r4 = r16.nextToken()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x016d }
            if (r4 == r9) goto L_0x00ae
            com.spotify.mobile.android.connect.model.GaiaDevice r4 = r15.c(r16, r17)     // Catch:{ RuntimeException -> 0x016d }
            r2.add(r4)     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x009e
        L_0x00ae:
            r9 = r2
            goto L_0x0016
        L_0x00b1:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r2 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x016d }
            if (r2 != r8) goto L_0x00c2
            r10 = r16
            r8 = r3
            r8 = r3
            goto L_0x0016
        L_0x00c2:
            r8 = r3
            r2 = 0
        L_0x00c4:
            com.fasterxml.jackson.core.JsonToken r10 = r16.nextToken()     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r11 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x016d }
            if (r10 == r11) goto L_0x0134
            int[] r10 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x016d }
            com.fasterxml.jackson.core.JsonToken r11 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x016d }
            int r11 = r11.ordinal()     // Catch:{ RuntimeException -> 0x016d }
            r10 = r10[r11]     // Catch:{ RuntimeException -> 0x016d }
            if (r10 == r4) goto L_0x00db
            goto L_0x00c4
        L_0x00db:
            java.lang.String r10 = r16.getCurrentName()     // Catch:{ RuntimeException -> 0x016d }
            int r11 = r10.hashCode()     // Catch:{ RuntimeException -> 0x016d }
            r12 = -1335157162(0xffffffffb06b1e56, float:-8.553561E-10)
            if (r11 == r12) goto L_0x00fa
            r12 = 3059181(0x2eaded, float:4.286826E-39)
            if (r11 == r12) goto L_0x00ee
            goto L_0x0106
        L_0x00ee:
            java.lang.String r11 = "ecod"
            java.lang.String r11 = "code"
            boolean r10 = r10.equals(r11)     // Catch:{ RuntimeException -> 0x016d }
            if (r10 == 0) goto L_0x0106
            r10 = 0
            goto L_0x0107
        L_0x00fa:
            java.lang.String r11 = "dticve"
            java.lang.String r11 = "device"
            boolean r10 = r10.equals(r11)     // Catch:{ RuntimeException -> 0x016d }
            if (r10 == 0) goto L_0x0106
            r10 = 1
            goto L_0x0107
        L_0x0106:
            r10 = -1
        L_0x0107:
            if (r10 == 0) goto L_0x011a
            if (r10 == r4) goto L_0x0112
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            r16.skipChildren()     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x00c4
        L_0x0112:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            java.lang.String r8 = r15.g(r16, r17)     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x00c4
        L_0x011a:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ RuntimeException -> 0x016d }
            java.lang.String r10 = "int"
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r2, r10)     // Catch:{ RuntimeException -> 0x016d }
            r10 = r16
            r10 = r16
            java.lang.Object r2 = r2.deserialize(r10, r1)     // Catch:{ RuntimeException -> 0x016d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ RuntimeException -> 0x016d }
            int r2 = r2.intValue()     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x00c4
        L_0x0134:
            r10 = r16
            r10 = r16
            com.spotify.mobile.android.connect.model.GaiaTransferError r4 = new com.spotify.mobile.android.connect.model.GaiaTransferError     // Catch:{ RuntimeException -> 0x016d }
            r4.<init>(r2, r8)     // Catch:{ RuntimeException -> 0x016d }
            r8 = r4
            r8 = r4
            goto L_0x0016
        L_0x0141:
            r10 = r16
            r10 = r16
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            boolean r7 = a(r16, r17)     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x0016
        L_0x014e:
            r10 = r16
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            java.lang.String r6 = r15.g(r16, r17)     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x0016
        L_0x0159:
            r10 = r16
            r10 = r16
            r16.nextValue()     // Catch:{ RuntimeException -> 0x016d }
            boolean r5 = a(r16, r17)     // Catch:{ RuntimeException -> 0x016d }
            goto L_0x0016
        L_0x0166:
            com.spotify.mobile.android.connect.model.GaiaState r0 = new com.spotify.mobile.android.connect.model.GaiaState     // Catch:{ RuntimeException -> 0x016d }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x016d }
            return r0
        L_0x016d:
            r0 = move-exception
        L_0x016e:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x0179
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x016e
        L_0x0179:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x0183
        L_0x0182:
            throw r0
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.GaiaState_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.connect.model.GaiaState");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.connect.model.GaiaDevice c(com.fasterxml.jackson.core.JsonParser r36, com.fasterxml.jackson.databind.DeserializationContext r37) {
        /*
            r35 = this;
            r0 = r36
            r1 = r37
            r1 = r37
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r4 = 0
            if (r2 != r3) goto L_0x0010
            return r4
        L_0x0010:
            r2 = 0
            r2 = 0
            r5 = 0
            r19 = r2
            r21 = r4
            r22 = r21
            r23 = r22
            r23 = r22
            r24 = r23
            r24 = r23
            r25 = r24
            r25 = r24
            r26 = r25
            r27 = r26
            r27 = r26
            r28 = r27
            r28 = r27
            r29 = r28
            r30 = r29
            r30 = r29
            r33 = r30
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r31 = 0
            r32 = 0
        L_0x004c:
            com.fasterxml.jackson.core.JsonToken r2 = r36.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r2 == r3) goto L_0x032b
            int[] r2 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r3 = r36.getCurrentToken()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L_0x0064
            goto L_0x004c
        L_0x0064:
            java.lang.String r2 = r36.getCurrentName()
            r6 = -1
            int r34 = r2.hashCode()
            switch(r34) {
                case -1853382195: goto L_0x01ad;
                case -1843305771: goto L_0x01a1;
                case -1729006321: goto L_0x0194;
                case -1618432855: goto L_0x0187;
                case -1487597642: goto L_0x017c;
                case -958911557: goto L_0x0172;
                case -810883302: goto L_0x0165;
                case -783584964: goto L_0x015b;
                case -536314971: goto L_0x0150;
                case -478994091: goto L_0x0143;
                case -464089615: goto L_0x0137;
                case -373580455: goto L_0x0129;
                case -327767294: goto L_0x011e;
                case -249869003: goto L_0x0110;
                case -196292327: goto L_0x0103;
                case -47682239: goto L_0x00f8;
                case -43973359: goto L_0x00ea;
                case 3373707: goto L_0x00dc;
                case 3575610: goto L_0x00ce;
                case 109757585: goto L_0x00c0;
                case 113598250: goto L_0x00b5;
                case 688838392: goto L_0x00a7;
                case 1569756576: goto L_0x009b;
                case 1757732158: goto L_0x008d;
                case 1908672157: goto L_0x007f;
                case 2082219329: goto L_0x0072;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x01ba
        L_0x0072:
            java.lang.String r3 = "sps_lfi"
            java.lang.String r3 = "is_self"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 0
            goto L_0x01bb
        L_0x007f:
            java.lang.String r3 = "sainratontic"
            java.lang.String r3 = "incarnations"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 20
            goto L_0x01bb
        L_0x008d:
            java.lang.String r3 = "ias_mpdealodelmn_s"
            java.lang.String r3 = "model_display_name"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 14
            goto L_0x01bb
        L_0x009b:
            java.lang.String r3 = "brand_display_name"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 13
            goto L_0x01bb
        L_0x00a7:
            java.lang.String r3 = "taemmnocrsmeit_i"
            java.lang.String r3 = "creation_time_ms"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 12
            goto L_0x01bb
        L_0x00b5:
            java.lang.String r3 = "is_group"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 7
            goto L_0x01bb
        L_0x00c0:
            java.lang.String r3 = "aseto"
            java.lang.String r3 = "state"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 18
            goto L_0x01bb
        L_0x00ce:
            java.lang.String r3 = "etpy"
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 19
            goto L_0x01bb
        L_0x00dc:
            java.lang.String r3 = "amne"
            java.lang.String r3 = "name"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 17
            goto L_0x01bb
        L_0x00ea:
            java.lang.String r3 = "ciayrblitifednsp_ei"
            java.lang.String r3 = "physical_identifier"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 16
            goto L_0x01bb
        L_0x00f8:
            java.lang.String r3 = "is_zeroconf"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 6
            goto L_0x01bb
        L_0x0103:
            java.lang.String r3 = "caadehbs_ti"
            java.lang.String r3 = "is_attached"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 3
            goto L_0x01bb
        L_0x0110:
            java.lang.String r3 = "oerlsoutpuvms_p"
            java.lang.String r3 = "supports_volume"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 10
            goto L_0x01bb
        L_0x011e:
            java.lang.String r3 = "is_webapp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 5
            goto L_0x01bb
        L_0x0129:
            java.lang.String r3 = "mu_tpsprpnoesra"
            java.lang.String r3 = "supports_rename"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 11
            goto L_0x01bb
        L_0x0137:
            java.lang.String r3 = "is_disabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 24
            goto L_0x01bb
        L_0x0143:
            java.lang.String r3 = "td_ichatt"
            java.lang.String r3 = "attach_id"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 22
            goto L_0x01bb
        L_0x0150:
            java.lang.String r3 = "supports_logout"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 9
            goto L_0x01bb
        L_0x015b:
            java.lang.String r3 = "is_being_activated"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 2
            goto L_0x01bb
        L_0x0165:
            java.lang.String r3 = "uoselm"
            java.lang.String r3 = "volume"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 21
            goto L_0x01bb
        L_0x0172:
            java.lang.String r3 = "is_active"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 1
            goto L_0x01bb
        L_0x017c:
            java.lang.String r3 = "capabilities"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 25
            goto L_0x01bb
        L_0x0187:
            java.lang.String r3 = "eremfnitid"
            java.lang.String r3 = "identifier"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 15
            goto L_0x01bb
        L_0x0194:
            java.lang.String r3 = "csenodlvei_ydo_eirw"
            java.lang.String r3 = "is_newly_discovered"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 23
            goto L_0x01bb
        L_0x01a1:
            java.lang.String r3 = "nnocibce_t"
            java.lang.String r3 = "is_connect"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 4
            goto L_0x01bb
        L_0x01ad:
            java.lang.String r3 = "cnnotcbs_acliieo_"
            java.lang.String r3 = "is_social_connect"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ba
            r2 = 8
            goto L_0x01bb
        L_0x01ba:
            r2 = -1
        L_0x01bb:
            switch(r2) {
                case 0: goto L_0x0322;
                case 1: goto L_0x0319;
                case 2: goto L_0x0310;
                case 3: goto L_0x0307;
                case 4: goto L_0x02fe;
                case 5: goto L_0x02f5;
                case 6: goto L_0x02ec;
                case 7: goto L_0x02e3;
                case 8: goto L_0x02da;
                case 9: goto L_0x02d1;
                case 10: goto L_0x02c8;
                case 11: goto L_0x02bf;
                case 12: goto L_0x02a6;
                case 13: goto L_0x029d;
                case 14: goto L_0x0294;
                case 15: goto L_0x028b;
                case 16: goto L_0x0282;
                case 17: goto L_0x0279;
                case 18: goto L_0x024b;
                case 19: goto L_0x021d;
                case 20: goto L_0x01f3;
                case 21: goto L_0x01ea;
                case 22: goto L_0x01e1;
                case 23: goto L_0x01d8;
                case 24: goto L_0x01cf;
                case 25: goto L_0x01c6;
                default: goto L_0x01be;
            }
        L_0x01be:
            r36.nextValue()
            r36.skipChildren()
            goto L_0x004c
        L_0x01c6:
            r36.nextValue()
            java.util.List r33 = r35.f(r36, r37)
            goto L_0x004c
        L_0x01cf:
            r36.nextValue()
            boolean r32 = a(r36, r37)
            goto L_0x004c
        L_0x01d8:
            r36.nextValue()
            boolean r31 = a(r36, r37)
            goto L_0x004c
        L_0x01e1:
            r36.nextValue()
            java.lang.String r30 = r35.g(r36, r37)
            goto L_0x004c
        L_0x01ea:
            r36.nextValue()
            java.lang.String r29 = r35.g(r36, r37)
            goto L_0x004c
        L_0x01f3:
            r36.nextValue()
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r2 != r3) goto L_0x0204
            r28 = r4
            r28 = r4
            goto L_0x004c
        L_0x0204:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x0209:
            com.fasterxml.jackson.core.JsonToken r3 = r36.nextToken()
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r3 == r6) goto L_0x0219
            com.spotify.mobile.android.connect.model.GaiaDeviceIncarnation r3 = r35.e(r36, r37)
            r2.add(r3)
            goto L_0x0209
        L_0x0219:
            r28 = r2
            goto L_0x004c
        L_0x021d:
            r36.nextValue()
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r2 != r3) goto L_0x022c
            r27 = r4
            goto L_0x004c
        L_0x022c:
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r2 != r3) goto L_0x023d
            java.lang.String r2 = r36.getText()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r2 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.fromValue(r2)
            goto L_0x0247
        L_0x023d:
            java.lang.Class<com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes> r2 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.class
            java.lang.Class<com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes> r2 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.class
            java.lang.Object r2 = r1.handleUnexpectedToken(r2, r0)
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r2 = (com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes) r2
        L_0x0247:
            r27 = r2
            goto L_0x004c
        L_0x024b:
            r36.nextValue()
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r2 != r3) goto L_0x025a
            r26 = r4
            goto L_0x004c
        L_0x025a:
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r2 != r3) goto L_0x026b
            java.lang.String r2 = r36.getText()
            com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState r2 = com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState.fromValue(r2)
            goto L_0x0275
        L_0x026b:
            java.lang.Class<com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState> r2 = com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState.class
            java.lang.Class<com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState> r2 = com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState.class
            java.lang.Object r2 = r1.handleUnexpectedToken(r2, r0)
            com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState r2 = (com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState) r2
        L_0x0275:
            r26 = r2
            goto L_0x004c
        L_0x0279:
            r36.nextValue()
            java.lang.String r25 = r35.g(r36, r37)
            goto L_0x004c
        L_0x0282:
            r36.nextValue()
            java.lang.String r24 = r35.g(r36, r37)
            goto L_0x004c
        L_0x028b:
            r36.nextValue()
            java.lang.String r23 = r35.g(r36, r37)
            goto L_0x004c
        L_0x0294:
            r36.nextValue()
            java.lang.String r22 = r35.g(r36, r37)
            goto L_0x004c
        L_0x029d:
            r36.nextValue()
            java.lang.String r21 = r35.g(r36, r37)
            goto L_0x004c
        L_0x02a6:
            r36.nextValue()
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.String r3 = "olgn"
            java.lang.String r3 = "long"
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r2, r3)
            java.lang.Object r2 = r2.deserialize(r0, r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r19 = r2.longValue()
            goto L_0x004c
        L_0x02bf:
            r36.nextValue()
            boolean r18 = a(r36, r37)
            goto L_0x004c
        L_0x02c8:
            r36.nextValue()
            boolean r17 = a(r36, r37)
            goto L_0x004c
        L_0x02d1:
            r36.nextValue()
            boolean r16 = a(r36, r37)
            goto L_0x004c
        L_0x02da:
            r36.nextValue()
            boolean r15 = a(r36, r37)
            goto L_0x004c
        L_0x02e3:
            r36.nextValue()
            boolean r14 = a(r36, r37)
            goto L_0x004c
        L_0x02ec:
            r36.nextValue()
            boolean r13 = a(r36, r37)
            goto L_0x004c
        L_0x02f5:
            r36.nextValue()
            boolean r12 = a(r36, r37)
            goto L_0x004c
        L_0x02fe:
            r36.nextValue()
            boolean r11 = a(r36, r37)
            goto L_0x004c
        L_0x0307:
            r36.nextValue()
            boolean r10 = a(r36, r37)
            goto L_0x004c
        L_0x0310:
            r36.nextValue()
            boolean r9 = a(r36, r37)
            goto L_0x004c
        L_0x0319:
            r36.nextValue()
            boolean r8 = a(r36, r37)
            goto L_0x004c
        L_0x0322:
            r36.nextValue()
            boolean r7 = a(r36, r37)
            goto L_0x004c
        L_0x032b:
            com.spotify.mobile.android.connect.model.GaiaDevice r0 = new com.spotify.mobile.android.connect.model.GaiaDevice
            r6 = r0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.GaiaState_Deserializer.c(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.connect.model.GaiaDevice");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.connect.model.GaiaDeviceCapability d(com.fasterxml.jackson.core.JsonParser r17, com.fasterxml.jackson.databind.DeserializationContext r18) {
        /*
            r16 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r4 = r2
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r7 = r6
            r8 = r7
            r8 = r7
        L_0x0012:
            com.fasterxml.jackson.core.JsonToken r0 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x01c0
            int[] r0 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r17.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x002a
            goto L_0x0012
        L_0x002a:
            java.lang.String r0 = r17.getCurrentName()
            int r3 = r0.hashCode()
            r9 = 4
            r10 = 0
            r11 = -1
            r12 = 3
            r13 = 2
            switch(r3) {
                case -660726633: goto L_0x0069;
                case 3355: goto L_0x005d;
                case 123954077: goto L_0x0051;
                case 950929027: goto L_0x0045;
                case 1638765110: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0075
        L_0x003b:
            java.lang.String r3 = "iconUrl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 2
            goto L_0x0076
        L_0x0045:
            java.lang.String r3 = "rescdtUteiri"
            java.lang.String r3 = "redirectUris"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 3
            goto L_0x0076
        L_0x0051:
            java.lang.String r3 = "oliTelazpidlet"
            java.lang.String r3 = "localizedTitle"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 4
            goto L_0x0076
        L_0x005d:
            java.lang.String r3 = "di"
            java.lang.String r3 = "id"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 0
            goto L_0x0076
        L_0x0069:
            java.lang.String r3 = "efatlTdlttiu"
            java.lang.String r3 = "defaultTitle"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = -1
        L_0x0076:
            if (r0 == 0) goto L_0x01b7
            if (r0 == r1) goto L_0x01ae
            if (r0 == r13) goto L_0x01a5
            if (r0 == r12) goto L_0x00b5
            if (r0 == r9) goto L_0x0087
            r17.nextValue()
            r17.skipChildren()
            goto L_0x0012
        L_0x0087:
            r17.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x0095
            r8 = r2
            goto L_0x0012
        L_0x0095:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x009a:
            com.fasterxml.jackson.core.JsonToken r1 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r3) goto L_0x00b1
            java.lang.String r1 = r16.g(r17, r18)
            r17.nextValue()
            java.lang.String r3 = r16.g(r17, r18)
            r0.put(r1, r3)
            goto L_0x009a
        L_0x00b1:
            r8 = r0
            r8 = r0
            goto L_0x0012
        L_0x00b5:
            r17.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r3) goto L_0x00c4
            r7 = r2
            r7 = r2
            goto L_0x0012
        L_0x00c4:
            r0 = r2
            r0 = r2
        L_0x00c6:
            com.fasterxml.jackson.core.JsonToken r3 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r3 == r7) goto L_0x019d
            int[] r3 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r7 = r17.getCurrentToken()
            int r7 = r7.ordinal()
            r3 = r3[r7]
            if (r3 == r1) goto L_0x00dd
            goto L_0x00c6
        L_0x00dd:
            java.lang.String r3 = r17.getCurrentName()
            int r7 = r3.hashCode()
            r9 = -861391249(0xffffffffcca8366f, float:-8.8191864E7)
            if (r7 == r9) goto L_0x00eb
            goto L_0x00f7
        L_0x00eb:
            java.lang.String r7 = "iasnddr"
            java.lang.String r7 = "android"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00f7
            r3 = 0
            goto L_0x00f8
        L_0x00f7:
            r3 = -1
        L_0x00f8:
            if (r3 == 0) goto L_0x0101
            r17.nextValue()
            r17.skipChildren()
            goto L_0x00c6
        L_0x0101:
            r17.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r3) goto L_0x010d
            goto L_0x00c4
        L_0x010d:
            r0 = r2
            r0 = r2
            r3 = r0
            r7 = r3
            r9 = r7
            r9 = r7
        L_0x0113:
            com.fasterxml.jackson.core.JsonToken r14 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r15 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r14 == r15) goto L_0x0194
            int[] r14 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r15 = r17.getCurrentToken()
            int r15 = r15.ordinal()
            r14 = r14[r15]
            if (r14 == r1) goto L_0x012a
            goto L_0x0113
        L_0x012a:
            java.lang.String r14 = r17.getCurrentName()
            int r15 = r14.hashCode()
            switch(r15) {
                case -1683239185: goto L_0x0158;
                case 116076: goto L_0x014c;
                case 67391244: goto L_0x0142;
                case 773759789: goto L_0x0136;
                default: goto L_0x0135;
            }
        L_0x0135:
            goto L_0x0164
        L_0x0136:
            java.lang.String r15 = "arUmllflkcb"
            java.lang.String r15 = "fallbackUrl"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0164
            r14 = 3
            goto L_0x0165
        L_0x0142:
            java.lang.String r15 = "deviceNameParam"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0164
            r14 = 2
            goto L_0x0165
        L_0x014c:
            java.lang.String r15 = "iru"
            java.lang.String r15 = "uri"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0164
            r14 = 0
            goto L_0x0165
        L_0x0158:
            java.lang.String r15 = "mdAkoercPacpeaarrtiB"
            java.lang.String r15 = "redirectBackAppParam"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0164
            r14 = 1
            goto L_0x0165
        L_0x0164:
            r14 = -1
        L_0x0165:
            if (r14 == 0) goto L_0x018c
            if (r14 == r1) goto L_0x0184
            if (r14 == r13) goto L_0x017c
            if (r14 == r12) goto L_0x0174
            r17.nextValue()
            r17.skipChildren()
            goto L_0x0113
        L_0x0174:
            r17.nextValue()
            java.lang.String r9 = r16.g(r17, r18)
            goto L_0x0113
        L_0x017c:
            r17.nextValue()
            java.lang.String r7 = r16.g(r17, r18)
            goto L_0x0113
        L_0x0184:
            r17.nextValue()
            java.lang.String r3 = r16.g(r17, r18)
            goto L_0x0113
        L_0x018c:
            r17.nextValue()
            java.lang.String r0 = r16.g(r17, r18)
            goto L_0x0113
        L_0x0194:
            com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUrisAndroid r14 = new com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUrisAndroid
            r14.<init>(r0, r3, r7, r9)
            r0 = r14
            r0 = r14
            goto L_0x00c6
        L_0x019d:
            com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUris r1 = new com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUris
            r1.<init>(r0)
            r7 = r1
            goto L_0x0012
        L_0x01a5:
            r17.nextValue()
            java.lang.String r6 = r16.g(r17, r18)
            goto L_0x0012
        L_0x01ae:
            r17.nextValue()
            java.lang.String r5 = r16.g(r17, r18)
            goto L_0x0012
        L_0x01b7:
            r17.nextValue()
            java.lang.String r4 = r16.g(r17, r18)
            goto L_0x0012
        L_0x01c0:
            com.spotify.mobile.android.connect.model.GaiaDeviceCapability r0 = new com.spotify.mobile.android.connect.model.GaiaDeviceCapability
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.GaiaState_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.connect.model.GaiaDeviceCapability");
    }

    private GaiaDeviceIncarnation e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        Tech tech = null;
        String str = null;
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1618432855) {
                    if (hashCode == -1294005119) {
                        String str2 = "pferebdre";
                        if (currentName.equals("preferred")) {
                            c = 2;
                        }
                    } else if (hashCode == 94742904) {
                        if (currentName.equals("class")) {
                            c = 0;
                        }
                    }
                } else if (currentName.equals("identifier")) {
                    c = 1;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    tech = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getCurrentToken() == JsonToken.VALUE_STRING ? Tech.valueOfSafe(jsonParser.getText()) : (Tech) deserializationContext.handleUnexpectedToken(Tech.class, jsonParser);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    str = g(jsonParser, deserializationContext);
                } else if (c != 2) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    z = a(jsonParser, deserializationContext);
                }
            }
        }
        return new GaiaDeviceIncarnation(tech, str, z);
    }

    private List<GaiaDeviceCapability> f(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(d(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private String g(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    public final boolean isCachable() {
        return true;
    }
}
