package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.LinkedList;

public final class ClusterRadioStationModel_Deserializer extends StdDeserializer<ClusterRadioStationModel> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.spotlets.radio.model.ClusterRadioStationModel_Deserializer$1 reason: invalid class name */
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

    ClusterRadioStationModel_Deserializer() {
        super(ClusterRadioStationModel.class);
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
            int[] r0 = com.spotify.music.spotlets.radio.model.ClusterRadioStationModel_Deserializer.AnonymousClass1.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.ClusterRadioStationModel_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
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
            int[] r1 = com.spotify.music.spotlets.radio.model.ClusterRadioStationModel_Deserializer.AnonymousClass1.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.ClusterRadioStationModel_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.RelatedArtistModel");
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.spotlets.radio.model.ClusterRadioStationModel deserialize(com.fasterxml.jackson.core.JsonParser r24, com.fasterxml.jackson.databind.DeserializationContext r25) {
        /*
            r23 = this;
            r1 = r25
            com.fasterxml.jackson.core.JsonToken r0 = r24.getCurrentToken()     // Catch:{ RuntimeException -> 0x01ed }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01ed }
            r3 = 0
            if (r0 != r2) goto L_0x000c
            return r3
        L_0x000c:
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r17 = r15
            r18 = r17
            r19 = r18
            r16 = 0
        L_0x001f:
            com.fasterxml.jackson.core.JsonToken r2 = r24.nextToken()     // Catch:{ RuntimeException -> 0x01ed }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x01ed }
            if (r2 == r4) goto L_0x01e6
            int[] r2 = com.spotify.music.spotlets.radio.model.ClusterRadioStationModel_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x01ed }
            com.fasterxml.jackson.core.JsonToken r4 = r24.getCurrentToken()     // Catch:{ RuntimeException -> 0x01ed }
            int r4 = r4.ordinal()     // Catch:{ RuntimeException -> 0x01ed }
            r2 = r2[r4]     // Catch:{ RuntimeException -> 0x01ed }
            r4 = 1
            if (r2 == r4) goto L_0x0039
            r2 = r24
            goto L_0x001f
        L_0x0039:
            java.lang.String r2 = r24.getCurrentName()     // Catch:{ RuntimeException -> 0x01ed }
            r20 = -1
            int r21 = r2.hashCode()     // Catch:{ RuntimeException -> 0x01ed }
            switch(r21) {
                case -2060497896: goto L_0x00e4;
                case -2059492806: goto L_0x00da;
                case -1870009356: goto L_0x00d0;
                case -1724546052: goto L_0x00c5;
                case -1141536684: goto L_0x00ba;
                case -865716088: goto L_0x00af;
                case -859610607: goto L_0x00a5;
                case -838143496: goto L_0x009a;
                case -620139980: goto L_0x0090;
                case -265713450: goto L_0x0085;
                case 116076: goto L_0x007a;
                case 109314082: goto L_0x006f;
                case 110371416: goto L_0x0064;
                case 191193553: goto L_0x0056;
                case 981647243: goto L_0x0048;
                default: goto L_0x0046;
            }     // Catch:{ RuntimeException -> 0x01ed }
        L_0x0046:
            goto L_0x00ee
        L_0x0048:
            java.lang.String r4 = "next_page_url"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01ed }
            if (r2 == 0) goto L_0x00ee
            r2 = 10
            r0 = 10
            goto L_0x00ef
        L_0x0056:
            java.lang.String r4 = "explicitSave"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01ed }
            if (r2 == 0) goto L_0x00ee
            r2 = 11
            r0 = 11
            goto L_0x00ef
        L_0x0064:
            java.lang.String r0 = "title"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 1
            goto L_0x00ef
        L_0x006f:
            java.lang.String r0 = "seeds"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 7
            goto L_0x00ef
        L_0x007a:
            java.lang.String r0 = "uri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 0
            goto L_0x00ef
        L_0x0085:
            java.lang.String r0 = "username"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 12
            goto L_0x00ef
        L_0x0090:
            java.lang.String r0 = "subtitleUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 6
            goto L_0x00ef
        L_0x009a:
            java.lang.String r0 = "related_artists"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 8
            goto L_0x00ef
        L_0x00a5:
            java.lang.String r0 = "imageUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 3
            goto L_0x00ef
        L_0x00af:
            java.lang.String r0 = "tracks"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 9
            goto L_0x00ef
        L_0x00ba:
            java.lang.String r0 = "clusterType"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 13
            goto L_0x00ef
        L_0x00c5:
            java.lang.String r0 = "description"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 14
            goto L_0x00ef
        L_0x00d0:
            java.lang.String r0 = "titleUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 2
            goto L_0x00ef
        L_0x00da:
            java.lang.String r0 = "playlistUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 4
            goto L_0x00ef
        L_0x00e4:
            java.lang.String r0 = "subtitle"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 == 0) goto L_0x00ee
            r0 = 5
            goto L_0x00ef
        L_0x00ee:
            r0 = -1
        L_0x00ef:
            switch(r0) {
                case 0: goto L_0x01d6;
                case 1: goto L_0x01cb;
                case 2: goto L_0x01c0;
                case 3: goto L_0x01b5;
                case 4: goto L_0x01aa;
                case 5: goto L_0x019f;
                case 6: goto L_0x0194;
                case 7: goto L_0x014e;
                case 8: goto L_0x0143;
                case 9: goto L_0x0138;
                case 10: goto L_0x012d;
                case 11: goto L_0x0114;
                case 12: goto L_0x010b;
                case 13: goto L_0x0102;
                case 14: goto L_0x00f9;
                default: goto L_0x00f2;
            }     // Catch:{ RuntimeException -> 0x01ed }
        L_0x00f2:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x01e1
        L_0x00f9:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r19 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x0102:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r18 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x010b:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r17 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x0114:
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r2 = "boolean"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r2)     // Catch:{ RuntimeException -> 0x01ed }
            r2 = r24
            java.lang.Object r0 = r0.deserialize(r2, r1)     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ RuntimeException -> 0x01ed }
            boolean r16 = r0.booleanValue()     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x012d:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r15 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x0138:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r14 = r23.c(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x0143:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            com.spotify.music.spotlets.radio.model.RelatedArtistModel[] r13 = r23.e(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x014e:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            com.fasterxml.jackson.core.JsonToken r0 = r24.getCurrentToken()     // Catch:{ RuntimeException -> 0x01ed }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01ed }
            if (r0 != r4) goto L_0x015e
            r12 = r3
            goto L_0x001f
        L_0x015e:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x01ed }
            r0.<init>()     // Catch:{ RuntimeException -> 0x01ed }
        L_0x0163:
            com.fasterxml.jackson.core.JsonToken r4 = r24.nextToken()     // Catch:{ RuntimeException -> 0x01ed }
            com.fasterxml.jackson.core.JsonToken r12 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x01ed }
            if (r4 == r12) goto L_0x0173
            java.lang.String r4 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            r0.add(r4)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x0163
        L_0x0173:
            int r4 = r0.size()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x01ed }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x01ed }
            r12 = 0
        L_0x017e:
            boolean r20 = r0.hasNext()     // Catch:{ RuntimeException -> 0x01ed }
            if (r20 == 0) goto L_0x0191
            java.lang.Object r20 = r0.next()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ RuntimeException -> 0x01ed }
            int r22 = r12 + 1
            r4[r12] = r20     // Catch:{ RuntimeException -> 0x01ed }
            r12 = r22
            goto L_0x017e
        L_0x0191:
            r12 = r4
            goto L_0x001f
        L_0x0194:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r11 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x019f:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r10 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x01aa:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r9 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x01b5:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r8 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x01c0:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r7 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x01cb:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r6 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x01d6:
            r2 = r24
            r24.nextValue()     // Catch:{ RuntimeException -> 0x01ed }
            java.lang.String r5 = r23.f(r24, r25)     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x01e1:
            r24.skipChildren()     // Catch:{ RuntimeException -> 0x01ed }
            goto L_0x001f
        L_0x01e6:
            com.spotify.music.spotlets.radio.model.ClusterRadioStationModel r0 = new com.spotify.music.spotlets.radio.model.ClusterRadioStationModel     // Catch:{ RuntimeException -> 0x01ed }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x01ed }
            return r0
        L_0x01ed:
            r0 = move-exception
        L_0x01ee:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x01f9
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x01ee
        L_0x01f9:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x0203
        L_0x0202:
            throw r0
        L_0x0203:
            goto L_0x0202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.ClusterRadioStationModel_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.ClusterRadioStationModel");
    }
}
