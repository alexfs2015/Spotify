package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.LinkedList;

public final class RadioStationModel_Deserializer extends StdDeserializer<RadioStationModel> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.spotlets.radio.model.RadioStationModel_Deserializer$1 reason: invalid class name */
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

    RadioStationModel_Deserializer() {
        super(RadioStationModel.class);
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
            int[] r0 = com.spotify.music.spotlets.radio.model.RadioStationModel_Deserializer.AnonymousClass1.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationModel_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
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
            int[] r1 = com.spotify.music.spotlets.radio.model.RadioStationModel_Deserializer.AnonymousClass1.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationModel_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.RelatedArtistModel");
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
    public com.spotify.music.spotlets.radio.model.RadioStationModel deserialize(com.fasterxml.jackson.core.JsonParser r21, com.fasterxml.jackson.databind.DeserializationContext r22) {
        /*
            r20 = this;
            r1 = r22
            com.fasterxml.jackson.core.JsonToken r0 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x01a8 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01a8 }
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
            r16 = 0
        L_0x0019:
            com.fasterxml.jackson.core.JsonToken r2 = r21.nextToken()     // Catch:{ RuntimeException -> 0x01a8 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x01a8 }
            if (r2 == r4) goto L_0x01a1
            int[] r2 = com.spotify.music.spotlets.radio.model.RadioStationModel_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x01a8 }
            com.fasterxml.jackson.core.JsonToken r4 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x01a8 }
            int r4 = r4.ordinal()     // Catch:{ RuntimeException -> 0x01a8 }
            r2 = r2[r4]     // Catch:{ RuntimeException -> 0x01a8 }
            r4 = 1
            if (r2 == r4) goto L_0x0033
            r2 = r21
            goto L_0x0019
        L_0x0033:
            java.lang.String r2 = r21.getCurrentName()     // Catch:{ RuntimeException -> 0x01a8 }
            r17 = -1
            int r18 = r2.hashCode()     // Catch:{ RuntimeException -> 0x01a8 }
            switch(r18) {
                case -2060497896: goto L_0x00ba;
                case -2059492806: goto L_0x00b0;
                case -1870009356: goto L_0x00a6;
                case -865716088: goto L_0x009b;
                case -859610607: goto L_0x0091;
                case -838143496: goto L_0x0086;
                case -620139980: goto L_0x007c;
                case 116076: goto L_0x0072;
                case 109314082: goto L_0x0068;
                case 110371416: goto L_0x005e;
                case 191193553: goto L_0x0050;
                case 981647243: goto L_0x0042;
                default: goto L_0x0040;
            }     // Catch:{ RuntimeException -> 0x01a8 }
        L_0x0040:
            goto L_0x00c4
        L_0x0042:
            java.lang.String r4 = "next_page_url"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r2 == 0) goto L_0x00c4
            r2 = 10
            r0 = 10
            goto L_0x00c5
        L_0x0050:
            java.lang.String r4 = "explicitSave"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r2 == 0) goto L_0x00c4
            r2 = 11
            r0 = 11
            goto L_0x00c5
        L_0x005e:
            java.lang.String r0 = "title"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 1
            goto L_0x00c5
        L_0x0068:
            java.lang.String r0 = "seeds"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 7
            goto L_0x00c5
        L_0x0072:
            java.lang.String r0 = "uri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 0
            goto L_0x00c5
        L_0x007c:
            java.lang.String r0 = "subtitleUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 6
            goto L_0x00c5
        L_0x0086:
            java.lang.String r0 = "related_artists"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 8
            goto L_0x00c5
        L_0x0091:
            java.lang.String r0 = "imageUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 3
            goto L_0x00c5
        L_0x009b:
            java.lang.String r0 = "tracks"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 9
            goto L_0x00c5
        L_0x00a6:
            java.lang.String r0 = "titleUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 2
            goto L_0x00c5
        L_0x00b0:
            java.lang.String r0 = "playlistUri"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 4
            goto L_0x00c5
        L_0x00ba:
            java.lang.String r0 = "subtitle"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 == 0) goto L_0x00c4
            r0 = 5
            goto L_0x00c5
        L_0x00c4:
            r0 = -1
        L_0x00c5:
            switch(r0) {
                case 0: goto L_0x0191;
                case 1: goto L_0x0186;
                case 2: goto L_0x017b;
                case 3: goto L_0x0170;
                case 4: goto L_0x0165;
                case 5: goto L_0x015a;
                case 6: goto L_0x014f;
                case 7: goto L_0x0109;
                case 8: goto L_0x00fe;
                case 9: goto L_0x00f3;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00cf;
                default: goto L_0x00c8;
            }     // Catch:{ RuntimeException -> 0x01a8 }
        L_0x00c8:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x019c
        L_0x00cf:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r2 = "boolean"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r2)     // Catch:{ RuntimeException -> 0x01a8 }
            r2 = r21
            java.lang.Object r0 = r0.deserialize(r2, r1)     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ RuntimeException -> 0x01a8 }
            boolean r16 = r0.booleanValue()     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x00e8:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r15 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x00f3:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r14 = r20.c(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x00fe:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            com.spotify.music.spotlets.radio.model.RelatedArtistModel[] r13 = r20.e(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x0109:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            com.fasterxml.jackson.core.JsonToken r0 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x01a8 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01a8 }
            if (r0 != r4) goto L_0x0119
            r12 = r3
            goto L_0x0019
        L_0x0119:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x01a8 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x01a8 }
        L_0x011e:
            com.fasterxml.jackson.core.JsonToken r4 = r21.nextToken()     // Catch:{ RuntimeException -> 0x01a8 }
            com.fasterxml.jackson.core.JsonToken r12 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x01a8 }
            if (r4 == r12) goto L_0x012e
            java.lang.String r4 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            r0.add(r4)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x011e
        L_0x012e:
            int r4 = r0.size()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x01a8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x01a8 }
            r12 = 0
        L_0x0139:
            boolean r17 = r0.hasNext()     // Catch:{ RuntimeException -> 0x01a8 }
            if (r17 == 0) goto L_0x014c
            java.lang.Object r17 = r0.next()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r17 = (java.lang.String) r17     // Catch:{ RuntimeException -> 0x01a8 }
            int r19 = r12 + 1
            r4[r12] = r17     // Catch:{ RuntimeException -> 0x01a8 }
            r12 = r19
            goto L_0x0139
        L_0x014c:
            r12 = r4
            goto L_0x0019
        L_0x014f:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r11 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x015a:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r10 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x0165:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r9 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x0170:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r8 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x017b:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r7 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x0186:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r6 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x0191:
            r2 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01a8 }
            java.lang.String r5 = r20.f(r21, r22)     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x019c:
            r21.skipChildren()     // Catch:{ RuntimeException -> 0x01a8 }
            goto L_0x0019
        L_0x01a1:
            com.spotify.music.spotlets.radio.model.RadioStationModel r0 = new com.spotify.music.spotlets.radio.model.RadioStationModel     // Catch:{ RuntimeException -> 0x01a8 }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ RuntimeException -> 0x01a8 }
            return r0
        L_0x01a8:
            r0 = move-exception
        L_0x01a9:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x01b4
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x01a9
        L_0x01b4:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x01be
        L_0x01bd:
            throw r0
        L_0x01be:
            goto L_0x01bd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationModel_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.RadioStationModel");
    }
}
