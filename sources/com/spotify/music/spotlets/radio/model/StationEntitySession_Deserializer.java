package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.LinkedList;

public final class StationEntitySession_Deserializer extends StdDeserializer<StationEntitySession> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer$1 reason: invalid class name */
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

    StationEntitySession_Deserializer() {
        super(StationEntitySession.class);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.cosmos.player.v2.PlayerTrack b(com.fasterxml.jackson.core.JsonParser r16, com.fasterxml.jackson.databind.DeserializationContext r17) {
        /*
            r15 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r16.getCurrentToken()
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
            r9 = r8
        L_0x0010:
            com.fasterxml.jackson.core.JsonToken r0 = r16.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00e3
            int[] r0 = com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r16.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0028
            goto L_0x0010
        L_0x0028:
            java.lang.String r0 = r16.getCurrentName()
            r3 = -1
            int r10 = r0.hashCode()
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            switch(r10) {
                case -987494927: goto L_0x006b;
                case -450004177: goto L_0x0061;
                case 115792: goto L_0x0057;
                case 116076: goto L_0x004d;
                case 249799580: goto L_0x0043;
                case 630249588: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0075
        L_0x0039:
            java.lang.String r10 = "artist_uri"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0075
            r0 = 3
            goto L_0x0076
        L_0x0043:
            java.lang.String r10 = "album_uri"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0075
            r0 = 2
            goto L_0x0076
        L_0x004d:
            java.lang.String r10 = "uri"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0075
            r0 = 0
            goto L_0x0076
        L_0x0057:
            java.lang.String r10 = "uid"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0061:
            java.lang.String r10 = "metadata"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0075
            r0 = 5
            goto L_0x0076
        L_0x006b:
            java.lang.String r10 = "provider"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0075
            r0 = 4
            goto L_0x0076
        L_0x0075:
            r0 = -1
        L_0x0076:
            if (r0 == 0) goto L_0x00da
            if (r0 == r1) goto L_0x00d1
            if (r0 == r14) goto L_0x00c8
            if (r0 == r13) goto L_0x00bf
            if (r0 == r12) goto L_0x00b6
            if (r0 == r11) goto L_0x0089
            r16.nextValue()
            r16.skipChildren()
            goto L_0x0010
        L_0x0089:
            r16.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r16.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x0097
            r9 = r2
            goto L_0x0010
        L_0x0097:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x009c:
            com.fasterxml.jackson.core.JsonToken r1 = r16.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r3) goto L_0x00b3
            java.lang.String r1 = r15.f(r16, r17)
            r16.nextValue()
            java.lang.String r3 = r15.f(r16, r17)
            r0.put(r1, r3)
            goto L_0x009c
        L_0x00b3:
            r9 = r0
            goto L_0x0010
        L_0x00b6:
            r16.nextValue()
            java.lang.String r8 = r15.f(r16, r17)
            goto L_0x0010
        L_0x00bf:
            r16.nextValue()
            java.lang.String r7 = r15.f(r16, r17)
            goto L_0x0010
        L_0x00c8:
            r16.nextValue()
            java.lang.String r6 = r15.f(r16, r17)
            goto L_0x0010
        L_0x00d1:
            r16.nextValue()
            java.lang.String r5 = r15.f(r16, r17)
            goto L_0x0010
        L_0x00da:
            r16.nextValue()
            java.lang.String r4 = r15.f(r16, r17)
            goto L_0x0010
        L_0x00e3:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
    }

    private PlayerTrack[] c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<PlayerTrack> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(b(jsonParser, deserializationContext));
        }
        int i = 0;
        PlayerTrack[] playerTrackArr = new PlayerTrack[linkedList.size()];
        for (PlayerTrack playerTrack : linkedList) {
            int i2 = i + 1;
            playerTrackArr[i] = playerTrack;
            i = i2;
        }
        return playerTrackArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.spotlets.radio.model.RelatedArtistModel d(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r8.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
        L_0x000b:
            com.fasterxml.jackson.core.JsonToken r1 = r8.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r3) goto L_0x0067
            int[] r1 = com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r3 = r8.getCurrentToken()
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 1
            if (r1 == r3) goto L_0x0023
            goto L_0x000b
        L_0x0023:
            java.lang.String r1 = r8.getCurrentName()
            r4 = -1
            int r5 = r1.hashCode()
            r6 = 574510245(0x223e54a5, float:2.5794612E-18)
            if (r5 == r6) goto L_0x0041
            r6 = 629723762(0x2588d272, float:2.3734843E-16)
            if (r5 == r6) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.String r5 = "artistName"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "artistUri"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = -1
        L_0x004c:
            if (r1 == 0) goto L_0x005f
            if (r1 == r3) goto L_0x0057
            r8.nextValue()
            r8.skipChildren()
            goto L_0x000b
        L_0x0057:
            r8.nextValue()
            java.lang.String r0 = r7.f(r8, r9)
            goto L_0x000b
        L_0x005f:
            r8.nextValue()
            java.lang.String r2 = r7.f(r8, r9)
            goto L_0x000b
        L_0x0067:
            com.spotify.music.spotlets.radio.model.RelatedArtistModel r8 = com.spotify.music.spotlets.radio.model.RelatedArtistModel.create(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.RelatedArtistModel");
    }

    private RelatedArtistModel[] e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<RelatedArtistModel> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(d(jsonParser, deserializationContext));
        }
        int i = 0;
        RelatedArtistModel[] relatedArtistModelArr = new RelatedArtistModel[linkedList.size()];
        for (RelatedArtistModel relatedArtistModel : linkedList) {
            int i2 = i + 1;
            relatedArtistModelArr[i] = relatedArtistModel;
            i = i2;
        }
        return relatedArtistModelArr;
    }

    private String f(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e2, code lost:
        r22 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e6, code lost:
        r28.nextValue();
        r21 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ef, code lost:
        r28.nextValue();
        r20 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f8, code lost:
        r28.nextValue();
        r19 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0201, code lost:
        r28.nextValue();
        r18 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020a, code lost:
        r28.nextValue();
        r17 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0213, code lost:
        r28.nextValue();
        r16 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021c, code lost:
        r28.nextValue();
        r15 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0225, code lost:
        r28.skipChildren();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0166, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0167, code lost:
        switch(r2) {
            case 0: goto L_0x021c;
            case 1: goto L_0x0213;
            case 2: goto L_0x020a;
            case 3: goto L_0x0201;
            case 4: goto L_0x01f8;
            case 5: goto L_0x01ef;
            case 6: goto L_0x01e6;
            case 7: goto L_0x01a1;
            case 8: goto L_0x0198;
            case 9: goto L_0x018f;
            case 10: goto L_0x0186;
            case 11: goto L_0x016f;
            default: goto L_0x016a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016a, code lost:
        r28.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016f, code lost:
        r28.nextValue();
        r26 = ((java.lang.Boolean) com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(java.lang.Boolean.TYPE, "boolean").deserialize(r0, r1)).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0186, code lost:
        r28.nextValue();
        r25 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018f, code lost:
        r28.nextValue();
        r24 = c(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0198, code lost:
        r28.nextValue();
        r23 = e(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a1, code lost:
        r28.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01aa, code lost:
        if (r28.getCurrentToken() != com.fasterxml.jackson.core.JsonToken.VALUE_NULL) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ac, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b0, code lost:
        r2 = new java.util.LinkedList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bb, code lost:
        if (r28.nextToken() == com.fasterxml.jackson.core.JsonToken.END_ARRAY) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01bd, code lost:
        r2.add(f(r28, r29));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c5, code lost:
        r8 = new java.lang.String[r2.size()];
        r2 = r2.iterator();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d4, code lost:
        if (r2.hasNext() == false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d6, code lost:
        r14 = r10 + 1;
        r8[r10] = (java.lang.String) r2.next();
        r10 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[Catch:{ RuntimeException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[Catch:{ RuntimeException -> 0x0238 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.spotlets.radio.model.StationEntitySession deserialize(com.fasterxml.jackson.core.JsonParser r28, com.fasterxml.jackson.databind.DeserializationContext r29) {
        /*
            r27 = this;
            r0 = r28
            r1 = r29
            com.fasterxml.jackson.core.JsonToken r2 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0238 }
            r4 = 0
            if (r2 != r3) goto L_0x000e
            return r4
        L_0x000e:
            r2 = 0
            r5 = 0
            r6 = r2
            r2 = r4
            r3 = 0
        L_0x0014:
            com.fasterxml.jackson.core.JsonToken r8 = r28.nextToken()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0238 }
            if (r8 == r9) goto L_0x0232
            int[] r8 = com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r9 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0238 }
            int r9 = r9.ordinal()     // Catch:{ RuntimeException -> 0x0238 }
            r8 = r8[r9]     // Catch:{ RuntimeException -> 0x0238 }
            r9 = 1
            if (r8 == r9) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            java.lang.String r8 = r28.getCurrentName()     // Catch:{ RuntimeException -> 0x0238 }
            int r10 = r8.hashCode()     // Catch:{ RuntimeException -> 0x0238 }
            r11 = -1932791312(0xffffffff8ccbf1f0, float:-3.1422713E-31)
            r12 = -1
            r13 = 2
            if (r10 == r11) goto L_0x005a
            r11 = -86827412(0xfffffffffad31e6c, float:-5.4809583E35)
            if (r10 == r11) goto L_0x0050
            r11 = 100346066(0x5fb28d2, float:2.3618922E-35)
            if (r10 == r11) goto L_0x0046
            goto L_0x0064
        L_0x0046:
            java.lang.String r10 = "index"
            boolean r8 = r8.equals(r10)     // Catch:{ RuntimeException -> 0x0238 }
            if (r8 == 0) goto L_0x0064
            r8 = 1
            goto L_0x0065
        L_0x0050:
            java.lang.String r10 = "lastUpdateTime"
            boolean r8 = r8.equals(r10)     // Catch:{ RuntimeException -> 0x0238 }
            if (r8 == 0) goto L_0x0064
            r8 = 2
            goto L_0x0065
        L_0x005a:
            java.lang.String r10 = "radioStationModel"
            boolean r8 = r8.equals(r10)     // Catch:{ RuntimeException -> 0x0238 }
            if (r8 == 0) goto L_0x0064
            r8 = 0
            goto L_0x0065
        L_0x0064:
            r8 = -1
        L_0x0065:
            if (r8 == 0) goto L_0x009f
            if (r8 == r9) goto L_0x0088
            if (r8 == r13) goto L_0x0072
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            r28.skipChildren()     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x0014
        L_0x0072:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r7 = "long"
            com.fasterxml.jackson.databind.JsonDeserializer r6 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r6, r7)     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Object r6 = r6.deserialize(r0, r1)     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ RuntimeException -> 0x0238 }
            long r6 = r6.longValue()     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x0014
        L_0x0088:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r8 = "int"
            com.fasterxml.jackson.databind.JsonDeserializer r3 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r3, r8)     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Object r3 = r3.deserialize(r0, r1)     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ RuntimeException -> 0x0238 }
            int r3 = r3.intValue()     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x0014
        L_0x009f:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r2 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 != r8) goto L_0x00ad
            r2 = r4
            goto L_0x0014
        L_0x00ad:
            r15 = r4
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = 0
        L_0x00c4:
            com.fasterxml.jackson.core.JsonToken r2 = r28.nextToken()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == r8) goto L_0x022a
            int[] r2 = com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r8 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0238 }
            int r8 = r8.ordinal()     // Catch:{ RuntimeException -> 0x0238 }
            r2 = r2[r8]     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == r9) goto L_0x00db
            goto L_0x00c4
        L_0x00db:
            java.lang.String r2 = r28.getCurrentName()     // Catch:{ RuntimeException -> 0x0238 }
            int r8 = r2.hashCode()     // Catch:{ RuntimeException -> 0x0238 }
            switch(r8) {
                case -2060497896: goto L_0x015c;
                case -2059492806: goto L_0x0152;
                case -1870009356: goto L_0x0148;
                case -865716088: goto L_0x013d;
                case -859610607: goto L_0x0133;
                case -838143496: goto L_0x0128;
                case -620139980: goto L_0x011e;
                case 116076: goto L_0x0114;
                case 109314082: goto L_0x010a;
                case 110371416: goto L_0x0100;
                case 191193553: goto L_0x00f4;
                case 981647243: goto L_0x00e8;
                default: goto L_0x00e6;
            }     // Catch:{ RuntimeException -> 0x0238 }
        L_0x00e6:
            goto L_0x0166
        L_0x00e8:
            java.lang.String r8 = "next_page_url"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 10
            goto L_0x0167
        L_0x00f4:
            java.lang.String r8 = "explicitSave"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 11
            goto L_0x0167
        L_0x0100:
            java.lang.String r8 = "title"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 1
            goto L_0x0167
        L_0x010a:
            java.lang.String r8 = "seeds"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 7
            goto L_0x0167
        L_0x0114:
            java.lang.String r8 = "uri"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 0
            goto L_0x0167
        L_0x011e:
            java.lang.String r8 = "subtitleUri"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 6
            goto L_0x0167
        L_0x0128:
            java.lang.String r8 = "related_artists"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 8
            goto L_0x0167
        L_0x0133:
            java.lang.String r8 = "imageUri"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 3
            goto L_0x0167
        L_0x013d:
            java.lang.String r8 = "tracks"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 9
            goto L_0x0167
        L_0x0148:
            java.lang.String r8 = "titleUri"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 2
            goto L_0x0167
        L_0x0152:
            java.lang.String r8 = "playlistUri"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 4
            goto L_0x0167
        L_0x015c:
            java.lang.String r8 = "subtitle"
            boolean r2 = r2.equals(r8)     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 == 0) goto L_0x0166
            r2 = 5
            goto L_0x0167
        L_0x0166:
            r2 = -1
        L_0x0167:
            switch(r2) {
                case 0: goto L_0x021c;
                case 1: goto L_0x0213;
                case 2: goto L_0x020a;
                case 3: goto L_0x0201;
                case 4: goto L_0x01f8;
                case 5: goto L_0x01ef;
                case 6: goto L_0x01e6;
                case 7: goto L_0x01a1;
                case 8: goto L_0x0198;
                case 9: goto L_0x018f;
                case 10: goto L_0x0186;
                case 11: goto L_0x016f;
                default: goto L_0x016a;
            }     // Catch:{ RuntimeException -> 0x0238 }
        L_0x016a:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x0225
        L_0x016f:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r8 = "boolean"
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r2, r8)     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Object r2 = r2.deserialize(r0, r1)     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ RuntimeException -> 0x0238 }
            boolean r26 = r2.booleanValue()     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x0186:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r25 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x018f:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r24 = r27.c(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x0198:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            com.spotify.music.spotlets.radio.model.RelatedArtistModel[] r23 = r27.e(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x01a1:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r2 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0238 }
            if (r2 != r8) goto L_0x01b0
            r22 = r4
            goto L_0x00c4
        L_0x01b0:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x0238 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0238 }
        L_0x01b5:
            com.fasterxml.jackson.core.JsonToken r8 = r28.nextToken()     // Catch:{ RuntimeException -> 0x0238 }
            com.fasterxml.jackson.core.JsonToken r10 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x0238 }
            if (r8 == r10) goto L_0x01c5
            java.lang.String r8 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            r2.add(r8)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x01b5
        L_0x01c5:
            int r8 = r2.size()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ RuntimeException -> 0x0238 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ RuntimeException -> 0x0238 }
            r10 = 0
        L_0x01d0:
            boolean r11 = r2.hasNext()     // Catch:{ RuntimeException -> 0x0238 }
            if (r11 == 0) goto L_0x01e2
            java.lang.Object r11 = r2.next()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ RuntimeException -> 0x0238 }
            int r14 = r10 + 1
            r8[r10] = r11     // Catch:{ RuntimeException -> 0x0238 }
            r10 = r14
            goto L_0x01d0
        L_0x01e2:
            r22 = r8
            goto L_0x00c4
        L_0x01e6:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r21 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x01ef:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r20 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x01f8:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r19 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x0201:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r18 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x020a:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r17 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x0213:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r16 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x021c:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0238 }
            java.lang.String r15 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x0225:
            r28.skipChildren()     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x00c4
        L_0x022a:
            com.spotify.music.spotlets.radio.model.RadioStationModel r2 = new com.spotify.music.spotlets.radio.model.RadioStationModel     // Catch:{ RuntimeException -> 0x0238 }
            r14 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ RuntimeException -> 0x0238 }
            goto L_0x0014
        L_0x0232:
            com.spotify.music.spotlets.radio.model.StationEntitySession r0 = new com.spotify.music.spotlets.radio.model.StationEntitySession     // Catch:{ RuntimeException -> 0x0238 }
            r0.<init>(r2, r3, r6)     // Catch:{ RuntimeException -> 0x0238 }
            return r0
        L_0x0238:
            r0 = move-exception
        L_0x0239:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x0244
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0239
        L_0x0244:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x024e
        L_0x024d:
            throw r0
        L_0x024e:
            goto L_0x024d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.StationEntitySession_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.StationEntitySession");
    }
}
