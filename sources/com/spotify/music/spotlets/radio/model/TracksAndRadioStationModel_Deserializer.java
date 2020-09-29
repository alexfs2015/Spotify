package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.LinkedList;

public final class TracksAndRadioStationModel_Deserializer extends StdDeserializer<TracksAndRadioStationModel> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer$1 reason: invalid class name */
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

    TracksAndRadioStationModel_Deserializer() {
        super(TracksAndRadioStationModel.class);
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
            int[] r0 = com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.AnonymousClass1.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
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
            int[] r1 = com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.AnonymousClass1.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.RelatedArtistModel");
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
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c0, code lost:
        r22 = r8 + 1;
        r7[r8] = (java.lang.String) r0.next();
        r8 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cd, code lost:
        r22 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d1, code lost:
        r5 = r28;
        r28.nextValue();
        r21 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01dc, code lost:
        r5 = r28;
        r28.nextValue();
        r20 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e7, code lost:
        r5 = r28;
        r28.nextValue();
        r19 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f2, code lost:
        r5 = r28;
        r28.nextValue();
        r18 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fd, code lost:
        r5 = r28;
        r28.nextValue();
        r17 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0208, code lost:
        r5 = r28;
        r28.nextValue();
        r16 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0213, code lost:
        r5 = r28;
        r28.nextValue();
        r15 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021e, code lost:
        r28.skipChildren();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0144, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0145, code lost:
        switch(r0) {
            case 0: goto L_0x0213;
            case 1: goto L_0x0208;
            case 2: goto L_0x01fd;
            case 3: goto L_0x01f2;
            case 4: goto L_0x01e7;
            case 5: goto L_0x01dc;
            case 6: goto L_0x01d1;
            case 7: goto L_0x0189;
            case 8: goto L_0x017e;
            case 9: goto L_0x0173;
            case 10: goto L_0x0168;
            case 11: goto L_0x014f;
            default: goto L_0x0148;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0148, code lost:
        r5 = r28;
        r28.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014f, code lost:
        r28.nextValue();
        r26 = ((java.lang.Boolean) com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(java.lang.Boolean.TYPE, "boolean").deserialize(r28, r1)).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0168, code lost:
        r5 = r28;
        r28.nextValue();
        r25 = f(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0173, code lost:
        r5 = r28;
        r28.nextValue();
        r24 = c(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017e, code lost:
        r5 = r28;
        r28.nextValue();
        r23 = e(r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0189, code lost:
        r5 = r28;
        r28.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0194, code lost:
        if (r28.getCurrentToken() != com.fasterxml.jackson.core.JsonToken.VALUE_NULL) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0196, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019a, code lost:
        r0 = new java.util.LinkedList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a5, code lost:
        if (r28.nextToken() == com.fasterxml.jackson.core.JsonToken.END_ARRAY) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a7, code lost:
        r0.add(f(r28, r29));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01af, code lost:
        r7 = new java.lang.String[r0.size()];
        r0 = r0.iterator();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01be, code lost:
        if (r0.hasNext() == false) goto L_0x01cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[Catch:{ RuntimeException -> 0x0233 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[Catch:{ RuntimeException -> 0x0233 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel deserialize(com.fasterxml.jackson.core.JsonParser r28, com.fasterxml.jackson.databind.DeserializationContext r29) {
        /*
            r27 = this;
            r1 = r29
            com.fasterxml.jackson.core.JsonToken r0 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0233 }
            r3 = 0
            if (r0 != r2) goto L_0x000c
            return r3
        L_0x000c:
            r0 = r3
            r2 = r0
            r4 = r2
        L_0x000f:
            com.fasterxml.jackson.core.JsonToken r5 = r28.nextToken()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0233 }
            if (r5 == r6) goto L_0x022d
            int[] r5 = com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r6 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0233 }
            int r6 = r6.ordinal()     // Catch:{ RuntimeException -> 0x0233 }
            r5 = r5[r6]     // Catch:{ RuntimeException -> 0x0233 }
            r6 = 1
            if (r5 == r6) goto L_0x0027
            goto L_0x000f
        L_0x0027:
            java.lang.String r5 = r28.getCurrentName()     // Catch:{ RuntimeException -> 0x0233 }
            int r7 = r5.hashCode()     // Catch:{ RuntimeException -> 0x0233 }
            r8 = -1897135820(0xffffffff8eec0134, float:-5.817965E-30)
            java.lang.String r9 = "next_page_url"
            java.lang.String r10 = "tracks"
            r11 = -1
            r12 = 2
            r13 = 0
            if (r7 == r8) goto L_0x0056
            r8 = -865716088(0xffffffffcc663888, float:-6.0351008E7)
            if (r7 == r8) goto L_0x004e
            r8 = 981647243(0x3a82bf8b, float:9.975297E-4)
            if (r7 == r8) goto L_0x0046
            goto L_0x0060
        L_0x0046:
            boolean r5 = r5.equals(r9)     // Catch:{ RuntimeException -> 0x0233 }
            if (r5 == 0) goto L_0x0060
            r5 = 2
            goto L_0x0061
        L_0x004e:
            boolean r5 = r5.equals(r10)     // Catch:{ RuntimeException -> 0x0233 }
            if (r5 == 0) goto L_0x0060
            r5 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r7 = "station"
            boolean r5 = r5.equals(r7)     // Catch:{ RuntimeException -> 0x0233 }
            if (r5 == 0) goto L_0x0060
            r5 = 0
            goto L_0x0061
        L_0x0060:
            r5 = -1
        L_0x0061:
            if (r5 == 0) goto L_0x007e
            if (r5 == r6) goto L_0x0076
            if (r5 == r12) goto L_0x006e
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            r28.skipChildren()     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x000f
        L_0x006e:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r4 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x000f
        L_0x0076:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r2 = r27.c(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x000f
        L_0x007e:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r0 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 != r5) goto L_0x008d
            r5 = r28
            r0 = r3
            goto L_0x000f
        L_0x008d:
            r15 = r3
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
        L_0x00a4:
            com.fasterxml.jackson.core.JsonToken r0 = r28.nextToken()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == r5) goto L_0x0223
            int[] r0 = com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r5 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0233 }
            int r5 = r5.ordinal()     // Catch:{ RuntimeException -> 0x0233 }
            r0 = r0[r5]     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == r6) goto L_0x00bd
            r5 = r28
            goto L_0x00a4
        L_0x00bd:
            java.lang.String r0 = r28.getCurrentName()     // Catch:{ RuntimeException -> 0x0233 }
            int r5 = r0.hashCode()     // Catch:{ RuntimeException -> 0x0233 }
            switch(r5) {
                case -2060497896: goto L_0x013a;
                case -2059492806: goto L_0x0130;
                case -1870009356: goto L_0x0126;
                case -865716088: goto L_0x011d;
                case -859610607: goto L_0x0113;
                case -838143496: goto L_0x0108;
                case -620139980: goto L_0x00fe;
                case 116076: goto L_0x00f4;
                case 109314082: goto L_0x00ea;
                case 110371416: goto L_0x00e0;
                case 191193553: goto L_0x00d4;
                case 981647243: goto L_0x00ca;
                default: goto L_0x00c8;
            }     // Catch:{ RuntimeException -> 0x0233 }
        L_0x00c8:
            goto L_0x0144
        L_0x00ca:
            boolean r0 = r0.equals(r9)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 10
            goto L_0x0145
        L_0x00d4:
            java.lang.String r5 = "explicitSave"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 11
            goto L_0x0145
        L_0x00e0:
            java.lang.String r5 = "title"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 1
            goto L_0x0145
        L_0x00ea:
            java.lang.String r5 = "seeds"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 7
            goto L_0x0145
        L_0x00f4:
            java.lang.String r5 = "uri"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 0
            goto L_0x0145
        L_0x00fe:
            java.lang.String r5 = "subtitleUri"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 6
            goto L_0x0145
        L_0x0108:
            java.lang.String r5 = "related_artists"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 8
            goto L_0x0145
        L_0x0113:
            java.lang.String r5 = "imageUri"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 3
            goto L_0x0145
        L_0x011d:
            boolean r0 = r0.equals(r10)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 9
            goto L_0x0145
        L_0x0126:
            java.lang.String r5 = "titleUri"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 2
            goto L_0x0145
        L_0x0130:
            java.lang.String r5 = "playlistUri"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 4
            goto L_0x0145
        L_0x013a:
            java.lang.String r5 = "subtitle"
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 == 0) goto L_0x0144
            r0 = 5
            goto L_0x0145
        L_0x0144:
            r0 = -1
        L_0x0145:
            switch(r0) {
                case 0: goto L_0x0213;
                case 1: goto L_0x0208;
                case 2: goto L_0x01fd;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01e7;
                case 5: goto L_0x01dc;
                case 6: goto L_0x01d1;
                case 7: goto L_0x0189;
                case 8: goto L_0x017e;
                case 9: goto L_0x0173;
                case 10: goto L_0x0168;
                case 11: goto L_0x014f;
                default: goto L_0x0148;
            }     // Catch:{ RuntimeException -> 0x0233 }
        L_0x0148:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x021e
        L_0x014f:
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r5 = "boolean"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r5)     // Catch:{ RuntimeException -> 0x0233 }
            r5 = r28
            java.lang.Object r0 = r0.deserialize(r5, r1)     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ RuntimeException -> 0x0233 }
            boolean r26 = r0.booleanValue()     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x0168:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r25 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x0173:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r24 = r27.c(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x017e:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            com.spotify.music.spotlets.radio.model.RelatedArtistModel[] r23 = r27.e(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x0189:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r0 = r28.getCurrentToken()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0233 }
            if (r0 != r7) goto L_0x019a
            r22 = r3
            goto L_0x00a4
        L_0x019a:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x0233 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0233 }
        L_0x019f:
            com.fasterxml.jackson.core.JsonToken r7 = r28.nextToken()     // Catch:{ RuntimeException -> 0x0233 }
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x0233 }
            if (r7 == r8) goto L_0x01af
            java.lang.String r7 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            r0.add(r7)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x019f
        L_0x01af:
            int r7 = r0.size()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ RuntimeException -> 0x0233 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x0233 }
            r8 = 0
        L_0x01ba:
            boolean r14 = r0.hasNext()     // Catch:{ RuntimeException -> 0x0233 }
            if (r14 == 0) goto L_0x01cd
            java.lang.Object r14 = r0.next()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ RuntimeException -> 0x0233 }
            int r22 = r8 + 1
            r7[r8] = r14     // Catch:{ RuntimeException -> 0x0233 }
            r8 = r22
            goto L_0x01ba
        L_0x01cd:
            r22 = r7
            goto L_0x00a4
        L_0x01d1:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r21 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x01dc:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r20 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x01e7:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r19 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x01f2:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r18 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x01fd:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r17 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x0208:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r16 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x0213:
            r5 = r28
            r28.nextValue()     // Catch:{ RuntimeException -> 0x0233 }
            java.lang.String r15 = r27.f(r28, r29)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x021e:
            r28.skipChildren()     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x00a4
        L_0x0223:
            r5 = r28
            com.spotify.music.spotlets.radio.model.RadioStationModel r0 = new com.spotify.music.spotlets.radio.model.RadioStationModel     // Catch:{ RuntimeException -> 0x0233 }
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ RuntimeException -> 0x0233 }
            goto L_0x000f
        L_0x022d:
            com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel r3 = new com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel     // Catch:{ RuntimeException -> 0x0233 }
            r3.<init>(r0, r2, r4)     // Catch:{ RuntimeException -> 0x0233 }
            return r3
        L_0x0233:
            r0 = move-exception
        L_0x0234:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x023f
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0234
        L_0x023f:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x0249
        L_0x0248:
            throw r0
        L_0x0249:
            goto L_0x0248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel");
    }
}
