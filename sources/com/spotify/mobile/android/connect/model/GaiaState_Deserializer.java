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

    public final boolean isCachable() {
        return true;
    }

    GaiaState_Deserializer() {
        super(GaiaState.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.connect.model.GaiaDevice c(com.fasterxml.jackson.core.JsonParser r36, com.fasterxml.jackson.databind.DeserializationContext r37) {
        /*
            r35 = this;
            r0 = r36
            r1 = r37
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r4 = 0
            if (r2 != r3) goto L_0x000e
            return r4
        L_0x000e:
            r2 = 0
            r5 = 0
            r19 = r2
            r21 = r4
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
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
        L_0x003c:
            com.fasterxml.jackson.core.JsonToken r2 = r36.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r2 == r3) goto L_0x02f1
            int[] r2 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r3 = r36.getCurrentToken()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L_0x0054
            goto L_0x003c
        L_0x0054:
            java.lang.String r2 = r36.getCurrentName()
            r6 = -1
            int r34 = r2.hashCode()
            switch(r34) {
                case -1853382195: goto L_0x017d;
                case -1843305771: goto L_0x0173;
                case -1729006321: goto L_0x0168;
                case -1618432855: goto L_0x015d;
                case -1487597642: goto L_0x0152;
                case -958911557: goto L_0x0148;
                case -810883302: goto L_0x013d;
                case -783584964: goto L_0x0133;
                case -536314971: goto L_0x0128;
                case -478994091: goto L_0x011d;
                case -464089615: goto L_0x0111;
                case -373580455: goto L_0x0105;
                case -327767294: goto L_0x00fa;
                case -249869003: goto L_0x00ee;
                case -196292327: goto L_0x00e3;
                case -47682239: goto L_0x00d8;
                case -43973359: goto L_0x00cc;
                case 3373707: goto L_0x00c0;
                case 3575610: goto L_0x00b4;
                case 109757585: goto L_0x00a8;
                case 113598250: goto L_0x009d;
                case 688838392: goto L_0x0091;
                case 1569756576: goto L_0x0085;
                case 1757732158: goto L_0x0079;
                case 1908672157: goto L_0x006d;
                case 2082219329: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0188
        L_0x0062:
            java.lang.String r3 = "is_self"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 0
            goto L_0x0189
        L_0x006d:
            java.lang.String r3 = "incarnations"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 20
            goto L_0x0189
        L_0x0079:
            java.lang.String r3 = "model_display_name"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 14
            goto L_0x0189
        L_0x0085:
            java.lang.String r3 = "brand_display_name"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 13
            goto L_0x0189
        L_0x0091:
            java.lang.String r3 = "creation_time_ms"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 12
            goto L_0x0189
        L_0x009d:
            java.lang.String r3 = "is_group"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 7
            goto L_0x0189
        L_0x00a8:
            java.lang.String r3 = "state"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 18
            goto L_0x0189
        L_0x00b4:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 19
            goto L_0x0189
        L_0x00c0:
            java.lang.String r3 = "name"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 17
            goto L_0x0189
        L_0x00cc:
            java.lang.String r3 = "physical_identifier"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 16
            goto L_0x0189
        L_0x00d8:
            java.lang.String r3 = "is_zeroconf"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 6
            goto L_0x0189
        L_0x00e3:
            java.lang.String r3 = "is_attached"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 3
            goto L_0x0189
        L_0x00ee:
            java.lang.String r3 = "supports_volume"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 10
            goto L_0x0189
        L_0x00fa:
            java.lang.String r3 = "is_webapp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 5
            goto L_0x0189
        L_0x0105:
            java.lang.String r3 = "supports_rename"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 11
            goto L_0x0189
        L_0x0111:
            java.lang.String r3 = "is_disabled"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 24
            goto L_0x0189
        L_0x011d:
            java.lang.String r3 = "attach_id"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 22
            goto L_0x0189
        L_0x0128:
            java.lang.String r3 = "supports_logout"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 9
            goto L_0x0189
        L_0x0133:
            java.lang.String r3 = "is_being_activated"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 2
            goto L_0x0189
        L_0x013d:
            java.lang.String r3 = "volume"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 21
            goto L_0x0189
        L_0x0148:
            java.lang.String r3 = "is_active"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 1
            goto L_0x0189
        L_0x0152:
            java.lang.String r3 = "capabilities"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 25
            goto L_0x0189
        L_0x015d:
            java.lang.String r3 = "identifier"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 15
            goto L_0x0189
        L_0x0168:
            java.lang.String r3 = "is_newly_discovered"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 23
            goto L_0x0189
        L_0x0173:
            java.lang.String r3 = "is_connect"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 4
            goto L_0x0189
        L_0x017d:
            java.lang.String r3 = "is_social_connect"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0188
            r2 = 8
            goto L_0x0189
        L_0x0188:
            r2 = -1
        L_0x0189:
            switch(r2) {
                case 0: goto L_0x02e8;
                case 1: goto L_0x02df;
                case 2: goto L_0x02d6;
                case 3: goto L_0x02cd;
                case 4: goto L_0x02c4;
                case 5: goto L_0x02bb;
                case 6: goto L_0x02b2;
                case 7: goto L_0x02a9;
                case 8: goto L_0x02a0;
                case 9: goto L_0x0297;
                case 10: goto L_0x028e;
                case 11: goto L_0x0285;
                case 12: goto L_0x026e;
                case 13: goto L_0x0265;
                case 14: goto L_0x025c;
                case 15: goto L_0x0253;
                case 16: goto L_0x024a;
                case 17: goto L_0x0241;
                case 18: goto L_0x0215;
                case 19: goto L_0x01e9;
                case 20: goto L_0x01c1;
                case 21: goto L_0x01b8;
                case 22: goto L_0x01af;
                case 23: goto L_0x01a6;
                case 24: goto L_0x019d;
                case 25: goto L_0x0194;
                default: goto L_0x018c;
            }
        L_0x018c:
            r36.nextValue()
            r36.skipChildren()
            goto L_0x003c
        L_0x0194:
            r36.nextValue()
            java.util.List r33 = r35.f(r36, r37)
            goto L_0x003c
        L_0x019d:
            r36.nextValue()
            boolean r32 = a(r36, r37)
            goto L_0x003c
        L_0x01a6:
            r36.nextValue()
            boolean r31 = a(r36, r37)
            goto L_0x003c
        L_0x01af:
            r36.nextValue()
            java.lang.String r30 = r35.g(r36, r37)
            goto L_0x003c
        L_0x01b8:
            r36.nextValue()
            java.lang.String r29 = r35.g(r36, r37)
            goto L_0x003c
        L_0x01c1:
            r36.nextValue()
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r2 != r3) goto L_0x01d0
            r28 = r4
            goto L_0x003c
        L_0x01d0:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x01d5:
            com.fasterxml.jackson.core.JsonToken r3 = r36.nextToken()
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r3 == r6) goto L_0x01e5
            com.spotify.mobile.android.connect.model.GaiaDeviceIncarnation r3 = r35.e(r36, r37)
            r2.add(r3)
            goto L_0x01d5
        L_0x01e5:
            r28 = r2
            goto L_0x003c
        L_0x01e9:
            r36.nextValue()
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r2 != r3) goto L_0x01f8
            r27 = r4
            goto L_0x003c
        L_0x01f8:
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r2 != r3) goto L_0x0209
            java.lang.String r2 = r36.getText()
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r2 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.fromValue(r2)
            goto L_0x0211
        L_0x0209:
            java.lang.Class<com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes> r2 = com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes.class
            java.lang.Object r2 = r1.handleUnexpectedToken(r2, r0)
            com.spotify.mobile.android.connect.model.DeviceType$GaiaTypes r2 = (com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes) r2
        L_0x0211:
            r27 = r2
            goto L_0x003c
        L_0x0215:
            r36.nextValue()
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r2 != r3) goto L_0x0224
            r26 = r4
            goto L_0x003c
        L_0x0224:
            com.fasterxml.jackson.core.JsonToken r2 = r36.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r2 != r3) goto L_0x0235
            java.lang.String r2 = r36.getText()
            com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState r2 = com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState.fromValue(r2)
            goto L_0x023d
        L_0x0235:
            java.lang.Class<com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState> r2 = com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState.class
            java.lang.Object r2 = r1.handleUnexpectedToken(r2, r0)
            com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState r2 = (com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState) r2
        L_0x023d:
            r26 = r2
            goto L_0x003c
        L_0x0241:
            r36.nextValue()
            java.lang.String r25 = r35.g(r36, r37)
            goto L_0x003c
        L_0x024a:
            r36.nextValue()
            java.lang.String r24 = r35.g(r36, r37)
            goto L_0x003c
        L_0x0253:
            r36.nextValue()
            java.lang.String r23 = r35.g(r36, r37)
            goto L_0x003c
        L_0x025c:
            r36.nextValue()
            java.lang.String r22 = r35.g(r36, r37)
            goto L_0x003c
        L_0x0265:
            r36.nextValue()
            java.lang.String r21 = r35.g(r36, r37)
            goto L_0x003c
        L_0x026e:
            r36.nextValue()
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.String r3 = "long"
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r2, r3)
            java.lang.Object r2 = r2.deserialize(r0, r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r19 = r2.longValue()
            goto L_0x003c
        L_0x0285:
            r36.nextValue()
            boolean r18 = a(r36, r37)
            goto L_0x003c
        L_0x028e:
            r36.nextValue()
            boolean r17 = a(r36, r37)
            goto L_0x003c
        L_0x0297:
            r36.nextValue()
            boolean r16 = a(r36, r37)
            goto L_0x003c
        L_0x02a0:
            r36.nextValue()
            boolean r15 = a(r36, r37)
            goto L_0x003c
        L_0x02a9:
            r36.nextValue()
            boolean r14 = a(r36, r37)
            goto L_0x003c
        L_0x02b2:
            r36.nextValue()
            boolean r13 = a(r36, r37)
            goto L_0x003c
        L_0x02bb:
            r36.nextValue()
            boolean r12 = a(r36, r37)
            goto L_0x003c
        L_0x02c4:
            r36.nextValue()
            boolean r11 = a(r36, r37)
            goto L_0x003c
        L_0x02cd:
            r36.nextValue()
            boolean r10 = a(r36, r37)
            goto L_0x003c
        L_0x02d6:
            r36.nextValue()
            boolean r9 = a(r36, r37)
            goto L_0x003c
        L_0x02df:
            r36.nextValue()
            boolean r8 = a(r36, r37)
            goto L_0x003c
        L_0x02e8:
            r36.nextValue()
            boolean r7 = a(r36, r37)
            goto L_0x003c
        L_0x02f1:
            com.spotify.mobile.android.connect.model.GaiaDevice r0 = new com.spotify.mobile.android.connect.model.GaiaDevice
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.GaiaState_Deserializer.c(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.connect.model.GaiaDevice");
    }

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
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x000f:
            com.fasterxml.jackson.core.JsonToken r0 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x01a6
            int[] r0 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r17.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0027
            goto L_0x000f
        L_0x0027:
            java.lang.String r0 = r17.getCurrentName()
            int r3 = r0.hashCode()
            r9 = 4
            r10 = 0
            r11 = -1
            r12 = 3
            r13 = 2
            switch(r3) {
                case -660726633: goto L_0x0060;
                case 3355: goto L_0x0056;
                case 123954077: goto L_0x004c;
                case 950929027: goto L_0x0042;
                case 1638765110: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x006a
        L_0x0038:
            java.lang.String r3 = "iconUrl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006a
            r0 = 2
            goto L_0x006b
        L_0x0042:
            java.lang.String r3 = "redirectUris"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006a
            r0 = 3
            goto L_0x006b
        L_0x004c:
            java.lang.String r3 = "localizedTitle"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006a
            r0 = 4
            goto L_0x006b
        L_0x0056:
            java.lang.String r3 = "id"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006a
            r0 = 0
            goto L_0x006b
        L_0x0060:
            java.lang.String r3 = "defaultTitle"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006a
            r0 = 1
            goto L_0x006b
        L_0x006a:
            r0 = -1
        L_0x006b:
            if (r0 == 0) goto L_0x019d
            if (r0 == r1) goto L_0x0194
            if (r0 == r13) goto L_0x018b
            if (r0 == r12) goto L_0x00a8
            if (r0 == r9) goto L_0x007c
            r17.nextValue()
            r17.skipChildren()
            goto L_0x000f
        L_0x007c:
            r17.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x0089
            r8 = r2
            goto L_0x000f
        L_0x0089:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x008e:
            com.fasterxml.jackson.core.JsonToken r1 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r3) goto L_0x00a5
            java.lang.String r1 = r16.g(r17, r18)
            r17.nextValue()
            java.lang.String r3 = r16.g(r17, r18)
            r0.put(r1, r3)
            goto L_0x008e
        L_0x00a5:
            r8 = r0
            goto L_0x000f
        L_0x00a8:
            r17.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r3) goto L_0x00b6
            r7 = r2
            goto L_0x000f
        L_0x00b6:
            r0 = r2
        L_0x00b7:
            com.fasterxml.jackson.core.JsonToken r3 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r3 == r7) goto L_0x0183
            int[] r3 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r7 = r17.getCurrentToken()
            int r7 = r7.ordinal()
            r3 = r3[r7]
            if (r3 == r1) goto L_0x00ce
            goto L_0x00b7
        L_0x00ce:
            java.lang.String r3 = r17.getCurrentName()
            int r7 = r3.hashCode()
            r9 = -861391249(0xffffffffcca8366f, float:-8.8191864E7)
            if (r7 == r9) goto L_0x00dc
            goto L_0x00e6
        L_0x00dc:
            java.lang.String r7 = "android"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x00e6
            r3 = 0
            goto L_0x00e7
        L_0x00e6:
            r3 = -1
        L_0x00e7:
            if (r3 == 0) goto L_0x00f0
            r17.nextValue()
            r17.skipChildren()
            goto L_0x00b7
        L_0x00f0:
            r17.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r3) goto L_0x00fc
            goto L_0x00b6
        L_0x00fc:
            r0 = r2
            r3 = r0
            r7 = r3
            r9 = r7
        L_0x0100:
            com.fasterxml.jackson.core.JsonToken r14 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r15 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r14 == r15) goto L_0x017b
            int[] r14 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r15 = r17.getCurrentToken()
            int r15 = r15.ordinal()
            r14 = r14[r15]
            if (r14 == r1) goto L_0x0117
            goto L_0x0100
        L_0x0117:
            java.lang.String r14 = r17.getCurrentName()
            int r15 = r14.hashCode()
            switch(r15) {
                case -1683239185: goto L_0x0141;
                case 116076: goto L_0x0137;
                case 67391244: goto L_0x012d;
                case 773759789: goto L_0x0123;
                default: goto L_0x0122;
            }
        L_0x0122:
            goto L_0x014b
        L_0x0123:
            java.lang.String r15 = "fallbackUrl"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014b
            r14 = 3
            goto L_0x014c
        L_0x012d:
            java.lang.String r15 = "deviceNameParam"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014b
            r14 = 2
            goto L_0x014c
        L_0x0137:
            java.lang.String r15 = "uri"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014b
            r14 = 0
            goto L_0x014c
        L_0x0141:
            java.lang.String r15 = "redirectBackAppParam"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014b
            r14 = 1
            goto L_0x014c
        L_0x014b:
            r14 = -1
        L_0x014c:
            if (r14 == 0) goto L_0x0173
            if (r14 == r1) goto L_0x016b
            if (r14 == r13) goto L_0x0163
            if (r14 == r12) goto L_0x015b
            r17.nextValue()
            r17.skipChildren()
            goto L_0x0100
        L_0x015b:
            r17.nextValue()
            java.lang.String r9 = r16.g(r17, r18)
            goto L_0x0100
        L_0x0163:
            r17.nextValue()
            java.lang.String r7 = r16.g(r17, r18)
            goto L_0x0100
        L_0x016b:
            r17.nextValue()
            java.lang.String r3 = r16.g(r17, r18)
            goto L_0x0100
        L_0x0173:
            r17.nextValue()
            java.lang.String r0 = r16.g(r17, r18)
            goto L_0x0100
        L_0x017b:
            com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUrisAndroid r14 = new com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUrisAndroid
            r14.<init>(r0, r3, r7, r9)
            r0 = r14
            goto L_0x00b7
        L_0x0183:
            com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUris r1 = new com.spotify.mobile.android.connect.model.GaiaDeviceRedirectUris
            r1.<init>(r0)
            r7 = r1
            goto L_0x000f
        L_0x018b:
            r17.nextValue()
            java.lang.String r6 = r16.g(r17, r18)
            goto L_0x000f
        L_0x0194:
            r17.nextValue()
            java.lang.String r5 = r16.g(r17, r18)
            goto L_0x000f
        L_0x019d:
            r17.nextValue()
            java.lang.String r4 = r16.g(r17, r18)
            goto L_0x000f
        L_0x01a6:
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
                    if (hashCode != -1294005119) {
                        if (hashCode == 94742904 && currentName.equals("class")) {
                            c = 0;
                        }
                    } else if (currentName.equals("preferred")) {
                        c = 2;
                    }
                } else if (currentName.equals("identifier")) {
                    c = 1;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        tech = null;
                    } else if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
                        tech = Tech.valueOfSafe(jsonParser.getText());
                    } else {
                        tech = (Tech) deserializationContext.handleUnexpectedToken(Tech.class, jsonParser);
                    }
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

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f6 A[Catch:{ RuntimeException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0107 A[Catch:{ RuntimeException -> 0x0151 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.connect.model.GaiaState deserialize(com.fasterxml.jackson.core.JsonParser r16, com.fasterxml.jackson.databind.DeserializationContext r17) {
        /*
            r15 = this;
            r1 = r17
            com.fasterxml.jackson.core.JsonToken r0 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0151 }
            r3 = 0
            if (r0 != r2) goto L_0x000c
            return r3
        L_0x000c:
            r0 = 0
            r6 = r3
            r8 = r6
            r9 = r8
            r5 = 0
            r7 = 0
        L_0x0012:
            com.fasterxml.jackson.core.JsonToken r2 = r16.nextToken()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 == r4) goto L_0x014a
            int[] r2 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r4 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x0151 }
            int r4 = r4.ordinal()     // Catch:{ RuntimeException -> 0x0151 }
            r2 = r2[r4]     // Catch:{ RuntimeException -> 0x0151 }
            r4 = 1
            if (r2 == r4) goto L_0x002a
            goto L_0x0012
        L_0x002a:
            java.lang.String r2 = r16.getCurrentName()     // Catch:{ RuntimeException -> 0x0151 }
            int r10 = r2.hashCode()     // Catch:{ RuntimeException -> 0x0151 }
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = -1
            switch(r10) {
                case -1912582093: goto L_0x0062;
                case -958911557: goto L_0x0058;
                case 915398906: goto L_0x004e;
                case 1559801053: goto L_0x0044;
                case 1978470580: goto L_0x003a;
                default: goto L_0x0039;
            }     // Catch:{ RuntimeException -> 0x0151 }
        L_0x0039:
            goto L_0x006c
        L_0x003a:
            java.lang.String r10 = "transfer_error"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 == 0) goto L_0x006c
            r2 = 3
            goto L_0x006d
        L_0x0044:
            java.lang.String r10 = "devices"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 == 0) goto L_0x006c
            r2 = 4
            goto L_0x006d
        L_0x004e:
            java.lang.String r10 = "onboarding_device"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 == 0) goto L_0x006c
            r2 = 1
            goto L_0x006d
        L_0x0058:
            java.lang.String r10 = "is_active"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 == 0) goto L_0x006c
            r2 = 0
            goto L_0x006d
        L_0x0062:
            java.lang.String r10 = "should_use_local_playback"
            boolean r2 = r2.equals(r10)     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 == 0) goto L_0x006c
            r2 = 2
            goto L_0x006d
        L_0x006c:
            r2 = -1
        L_0x006d:
            if (r2 == 0) goto L_0x013f
            if (r2 == r4) goto L_0x0134
            if (r2 == r13) goto L_0x0129
            if (r2 == r12) goto L_0x00a3
            if (r2 == r11) goto L_0x007e
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            r16.skipChildren()     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0012
        L_0x007e:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r2 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 != r4) goto L_0x008b
            r9 = r3
            goto L_0x0012
        L_0x008b:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x0151 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0151 }
        L_0x0090:
            com.fasterxml.jackson.core.JsonToken r4 = r16.nextToken()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x0151 }
            if (r4 == r9) goto L_0x00a0
            com.spotify.mobile.android.connect.model.GaiaDevice r4 = r15.c(r16, r17)     // Catch:{ RuntimeException -> 0x0151 }
            r2.add(r4)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0090
        L_0x00a0:
            r9 = r2
            goto L_0x0012
        L_0x00a3:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r2 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0151 }
            if (r2 != r8) goto L_0x00b3
            r10 = r16
            r8 = r3
            goto L_0x0012
        L_0x00b3:
            r8 = r3
            r2 = 0
        L_0x00b5:
            com.fasterxml.jackson.core.JsonToken r10 = r16.nextToken()     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r11 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0151 }
            if (r10 == r11) goto L_0x011f
            int[] r10 = com.spotify.mobile.android.connect.model.GaiaState_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0151 }
            com.fasterxml.jackson.core.JsonToken r11 = r16.getCurrentToken()     // Catch:{ RuntimeException -> 0x0151 }
            int r11 = r11.ordinal()     // Catch:{ RuntimeException -> 0x0151 }
            r10 = r10[r11]     // Catch:{ RuntimeException -> 0x0151 }
            if (r10 == r4) goto L_0x00cc
            goto L_0x00b5
        L_0x00cc:
            java.lang.String r10 = r16.getCurrentName()     // Catch:{ RuntimeException -> 0x0151 }
            int r11 = r10.hashCode()     // Catch:{ RuntimeException -> 0x0151 }
            r12 = -1335157162(0xffffffffb06b1e56, float:-8.553561E-10)
            if (r11 == r12) goto L_0x00e9
            r12 = 3059181(0x2eaded, float:4.286826E-39)
            if (r11 == r12) goto L_0x00df
            goto L_0x00f3
        L_0x00df:
            java.lang.String r11 = "code"
            boolean r10 = r10.equals(r11)     // Catch:{ RuntimeException -> 0x0151 }
            if (r10 == 0) goto L_0x00f3
            r10 = 0
            goto L_0x00f4
        L_0x00e9:
            java.lang.String r11 = "device"
            boolean r10 = r10.equals(r11)     // Catch:{ RuntimeException -> 0x0151 }
            if (r10 == 0) goto L_0x00f3
            r10 = 1
            goto L_0x00f4
        L_0x00f3:
            r10 = -1
        L_0x00f4:
            if (r10 == 0) goto L_0x0107
            if (r10 == r4) goto L_0x00ff
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            r16.skipChildren()     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x00b5
        L_0x00ff:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r8 = r15.g(r16, r17)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x00b5
        L_0x0107:
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r10 = "int"
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r2, r10)     // Catch:{ RuntimeException -> 0x0151 }
            r10 = r16
            java.lang.Object r2 = r2.deserialize(r10, r1)     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ RuntimeException -> 0x0151 }
            int r2 = r2.intValue()     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x00b5
        L_0x011f:
            r10 = r16
            com.spotify.mobile.android.connect.model.GaiaTransferError r4 = new com.spotify.mobile.android.connect.model.GaiaTransferError     // Catch:{ RuntimeException -> 0x0151 }
            r4.<init>(r2, r8)     // Catch:{ RuntimeException -> 0x0151 }
            r8 = r4
            goto L_0x0012
        L_0x0129:
            r10 = r16
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            boolean r7 = a(r16, r17)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0012
        L_0x0134:
            r10 = r16
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r6 = r15.g(r16, r17)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0012
        L_0x013f:
            r10 = r16
            r16.nextValue()     // Catch:{ RuntimeException -> 0x0151 }
            boolean r5 = a(r16, r17)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0012
        L_0x014a:
            com.spotify.mobile.android.connect.model.GaiaState r0 = new com.spotify.mobile.android.connect.model.GaiaState     // Catch:{ RuntimeException -> 0x0151 }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0151 }
            return r0
        L_0x0151:
            r0 = move-exception
        L_0x0152:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x015d
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0152
        L_0x015d:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x0167
        L_0x0166:
            throw r0
        L_0x0167:
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.connect.model.GaiaState_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.connect.model.GaiaState");
    }
}
