package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.LinkedList;

public final class RadioStationsModel_Deserializer extends StdDeserializer<RadioStationsModel> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer$1 reason: invalid class name */
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

    RadioStationsModel_Deserializer() {
        super(RadioStationsModel.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.spotlets.radio.model.ClusterRadioStationModel c(com.fasterxml.jackson.core.JsonParser r21, com.fasterxml.jackson.databind.DeserializationContext r22) {
        /*
            r20 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r21.getCurrentToken()
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
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r16 = r14
            r17 = r16
            r18 = r17
            r15 = 0
        L_0x001c:
            com.fasterxml.jackson.core.JsonToken r1 = r21.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x017b
            int[] r1 = com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r2 = r21.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0034
            goto L_0x001c
        L_0x0034:
            java.lang.String r1 = r21.getCurrentName()
            r3 = -1
            int r19 = r1.hashCode()
            switch(r19) {
                case -2060497896: goto L_0x00de;
                case -2059492806: goto L_0x00d4;
                case -1870009356: goto L_0x00ca;
                case -1724546052: goto L_0x00bf;
                case -1141536684: goto L_0x00b4;
                case -865716088: goto L_0x00a9;
                case -859610607: goto L_0x009f;
                case -838143496: goto L_0x0094;
                case -620139980: goto L_0x008a;
                case -265713450: goto L_0x007f;
                case 116076: goto L_0x0074;
                case 109314082: goto L_0x0069;
                case 110371416: goto L_0x005e;
                case 191193553: goto L_0x0050;
                case 981647243: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x00e8
        L_0x0042:
            java.lang.String r2 = "next_page_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e8
            r1 = 10
            r0 = 10
            goto L_0x00e9
        L_0x0050:
            java.lang.String r2 = "explicitSave"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e8
            r1 = 11
            r0 = 11
            goto L_0x00e9
        L_0x005e:
            java.lang.String r0 = "title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 1
            goto L_0x00e9
        L_0x0069:
            java.lang.String r0 = "seeds"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 7
            goto L_0x00e9
        L_0x0074:
            java.lang.String r0 = "uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 0
            goto L_0x00e9
        L_0x007f:
            java.lang.String r0 = "username"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 12
            goto L_0x00e9
        L_0x008a:
            java.lang.String r0 = "subtitleUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 6
            goto L_0x00e9
        L_0x0094:
            java.lang.String r0 = "related_artists"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 8
            goto L_0x00e9
        L_0x009f:
            java.lang.String r0 = "imageUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 3
            goto L_0x00e9
        L_0x00a9:
            java.lang.String r0 = "tracks"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 9
            goto L_0x00e9
        L_0x00b4:
            java.lang.String r0 = "clusterType"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 13
            goto L_0x00e9
        L_0x00bf:
            java.lang.String r0 = "description"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 14
            goto L_0x00e9
        L_0x00ca:
            java.lang.String r0 = "titleUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 2
            goto L_0x00e9
        L_0x00d4:
            java.lang.String r0 = "playlistUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 4
            goto L_0x00e9
        L_0x00de:
            java.lang.String r0 = "subtitle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 5
            goto L_0x00e9
        L_0x00e8:
            r0 = -1
        L_0x00e9:
            switch(r0) {
                case 0: goto L_0x0172;
                case 1: goto L_0x0169;
                case 2: goto L_0x0160;
                case 3: goto L_0x0157;
                case 4: goto L_0x014e;
                case 5: goto L_0x0145;
                case 6: goto L_0x013c;
                case 7: goto L_0x0133;
                case 8: goto L_0x012a;
                case 9: goto L_0x0121;
                case 10: goto L_0x0118;
                case 11: goto L_0x010f;
                case 12: goto L_0x0106;
                case 13: goto L_0x00fd;
                case 14: goto L_0x00f4;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            r21.nextValue()
            r21.skipChildren()
            goto L_0x001c
        L_0x00f4:
            r21.nextValue()
            java.lang.String r18 = r20.j(r21, r22)
            goto L_0x001c
        L_0x00fd:
            r21.nextValue()
            java.lang.String r17 = r20.j(r21, r22)
            goto L_0x001c
        L_0x0106:
            r21.nextValue()
            java.lang.String r16 = r20.j(r21, r22)
            goto L_0x001c
        L_0x010f:
            r21.nextValue()
            boolean r15 = a(r21, r22)
            goto L_0x001c
        L_0x0118:
            r21.nextValue()
            java.lang.String r14 = r20.j(r21, r22)
            goto L_0x001c
        L_0x0121:
            r21.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r13 = r20.e(r21, r22)
            goto L_0x001c
        L_0x012a:
            r21.nextValue()
            com.spotify.music.spotlets.radio.model.RelatedArtistModel[] r12 = r20.i(r21, r22)
            goto L_0x001c
        L_0x0133:
            r21.nextValue()
            java.lang.String[] r11 = r20.k(r21, r22)
            goto L_0x001c
        L_0x013c:
            r21.nextValue()
            java.lang.String r10 = r20.j(r21, r22)
            goto L_0x001c
        L_0x0145:
            r21.nextValue()
            java.lang.String r9 = r20.j(r21, r22)
            goto L_0x001c
        L_0x014e:
            r21.nextValue()
            java.lang.String r8 = r20.j(r21, r22)
            goto L_0x001c
        L_0x0157:
            r21.nextValue()
            java.lang.String r7 = r20.j(r21, r22)
            goto L_0x001c
        L_0x0160:
            r21.nextValue()
            java.lang.String r6 = r20.j(r21, r22)
            goto L_0x001c
        L_0x0169:
            r21.nextValue()
            java.lang.String r5 = r20.j(r21, r22)
            goto L_0x001c
        L_0x0172:
            r21.nextValue()
            java.lang.String r4 = r20.j(r21, r22)
            goto L_0x001c
        L_0x017b:
            com.spotify.music.spotlets.radio.model.ClusterRadioStationModel r0 = new com.spotify.music.spotlets.radio.model.ClusterRadioStationModel
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.c(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.ClusterRadioStationModel");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.cosmos.player.v2.PlayerTrack d(com.fasterxml.jackson.core.JsonParser r16, com.fasterxml.jackson.databind.DeserializationContext r17) {
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
            int[] r0 = com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.AnonymousClass1.a
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
            java.lang.String r1 = r15.j(r16, r17)
            r16.nextValue()
            java.lang.String r3 = r15.j(r16, r17)
            r0.put(r1, r3)
            goto L_0x009c
        L_0x00b3:
            r9 = r0
            goto L_0x0010
        L_0x00b6:
            r16.nextValue()
            java.lang.String r8 = r15.j(r16, r17)
            goto L_0x0010
        L_0x00bf:
            r16.nextValue()
            java.lang.String r7 = r15.j(r16, r17)
            goto L_0x0010
        L_0x00c8:
            r16.nextValue()
            java.lang.String r6 = r15.j(r16, r17)
            goto L_0x0010
        L_0x00d1:
            r16.nextValue()
            java.lang.String r5 = r15.j(r16, r17)
            goto L_0x0010
        L_0x00da:
            r16.nextValue()
            java.lang.String r4 = r15.j(r16, r17)
            goto L_0x0010
        L_0x00e3:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
    }

    private PlayerTrack[] e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<PlayerTrack> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(d(jsonParser, deserializationContext));
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

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.spotlets.radio.model.RadioStationModel f(com.fasterxml.jackson.core.JsonParser r18, com.fasterxml.jackson.databind.DeserializationContext r19) {
        /*
            r17 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r18.getCurrentToken()
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
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = 0
        L_0x0016:
            com.fasterxml.jackson.core.JsonToken r1 = r18.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x0136
            int[] r1 = com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r2 = r18.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x002e
            goto L_0x0016
        L_0x002e:
            java.lang.String r1 = r18.getCurrentName()
            r3 = -1
            int r16 = r1.hashCode()
            switch(r16) {
                case -2060497896: goto L_0x00b4;
                case -2059492806: goto L_0x00aa;
                case -1870009356: goto L_0x00a0;
                case -865716088: goto L_0x0095;
                case -859610607: goto L_0x008b;
                case -838143496: goto L_0x0080;
                case -620139980: goto L_0x0076;
                case 116076: goto L_0x006c;
                case 109314082: goto L_0x0062;
                case 110371416: goto L_0x0058;
                case 191193553: goto L_0x004a;
                case 981647243: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x00be
        L_0x003c:
            java.lang.String r2 = "next_page_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00be
            r1 = 10
            r0 = 10
            goto L_0x00bf
        L_0x004a:
            java.lang.String r2 = "explicitSave"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00be
            r1 = 11
            r0 = 11
            goto L_0x00bf
        L_0x0058:
            java.lang.String r0 = "title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 1
            goto L_0x00bf
        L_0x0062:
            java.lang.String r0 = "seeds"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 7
            goto L_0x00bf
        L_0x006c:
            java.lang.String r0 = "uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 0
            goto L_0x00bf
        L_0x0076:
            java.lang.String r0 = "subtitleUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 6
            goto L_0x00bf
        L_0x0080:
            java.lang.String r0 = "related_artists"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 8
            goto L_0x00bf
        L_0x008b:
            java.lang.String r0 = "imageUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 3
            goto L_0x00bf
        L_0x0095:
            java.lang.String r0 = "tracks"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 9
            goto L_0x00bf
        L_0x00a0:
            java.lang.String r0 = "titleUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 2
            goto L_0x00bf
        L_0x00aa:
            java.lang.String r0 = "playlistUri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 4
            goto L_0x00bf
        L_0x00b4:
            java.lang.String r0 = "subtitle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00be
            r0 = 5
            goto L_0x00bf
        L_0x00be:
            r0 = -1
        L_0x00bf:
            switch(r0) {
                case 0: goto L_0x012d;
                case 1: goto L_0x0124;
                case 2: goto L_0x011b;
                case 3: goto L_0x0112;
                case 4: goto L_0x0109;
                case 5: goto L_0x0100;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d3;
                case 11: goto L_0x00ca;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            r18.nextValue()
            r18.skipChildren()
            goto L_0x0016
        L_0x00ca:
            r18.nextValue()
            boolean r15 = a(r18, r19)
            goto L_0x0016
        L_0x00d3:
            r18.nextValue()
            java.lang.String r14 = r17.j(r18, r19)
            goto L_0x0016
        L_0x00dc:
            r18.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r13 = r17.e(r18, r19)
            goto L_0x0016
        L_0x00e5:
            r18.nextValue()
            com.spotify.music.spotlets.radio.model.RelatedArtistModel[] r12 = r17.i(r18, r19)
            goto L_0x0016
        L_0x00ee:
            r18.nextValue()
            java.lang.String[] r11 = r17.k(r18, r19)
            goto L_0x0016
        L_0x00f7:
            r18.nextValue()
            java.lang.String r10 = r17.j(r18, r19)
            goto L_0x0016
        L_0x0100:
            r18.nextValue()
            java.lang.String r9 = r17.j(r18, r19)
            goto L_0x0016
        L_0x0109:
            r18.nextValue()
            java.lang.String r8 = r17.j(r18, r19)
            goto L_0x0016
        L_0x0112:
            r18.nextValue()
            java.lang.String r7 = r17.j(r18, r19)
            goto L_0x0016
        L_0x011b:
            r18.nextValue()
            java.lang.String r6 = r17.j(r18, r19)
            goto L_0x0016
        L_0x0124:
            r18.nextValue()
            java.lang.String r5 = r17.j(r18, r19)
            goto L_0x0016
        L_0x012d:
            r18.nextValue()
            java.lang.String r4 = r17.j(r18, r19)
            goto L_0x0016
        L_0x0136:
            com.spotify.music.spotlets.radio.model.RadioStationModel r0 = new com.spotify.music.spotlets.radio.model.RadioStationModel
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.RadioStationModel");
    }

    private RadioStationModel[] g(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<RadioStationModel> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(f(jsonParser, deserializationContext));
        }
        int i = 0;
        RadioStationModel[] radioStationModelArr = new RadioStationModel[linkedList.size()];
        for (RadioStationModel radioStationModel : linkedList) {
            int i2 = i + 1;
            radioStationModelArr[i] = radioStationModel;
            i = i2;
        }
        return radioStationModelArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.spotlets.radio.model.RelatedArtistModel h(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
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
            int[] r1 = com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.AnonymousClass1.a
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
            java.lang.String r0 = r7.j(r8, r9)
            goto L_0x000b
        L_0x005f:
            r8.nextValue()
            java.lang.String r2 = r7.j(r8, r9)
            goto L_0x000b
        L_0x0067:
            com.spotify.music.spotlets.radio.model.RelatedArtistModel r8 = com.spotify.music.spotlets.radio.model.RelatedArtistModel.create(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationsModel_Deserializer.h(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.RelatedArtistModel");
    }

    private RelatedArtistModel[] i(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<RelatedArtistModel> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(h(jsonParser, deserializationContext));
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

    private String j(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    private String[] k(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(j(jsonParser, deserializationContext));
        }
        int i = 0;
        String[] strArr = new String[linkedList.size()];
        for (String str : linkedList) {
            int i2 = i + 1;
            strArr[i] = str;
            i = i2;
        }
        return strArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RadioStationsModel deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            RadioStationModel[] radioStationModelArr = null;
            RadioStationModel[] radioStationModelArr2 = null;
            RadioStationModel[] radioStationModelArr3 = null;
            RadioStationModel[] radioStationModelArr4 = null;
            ClusterRadioStationModel[] clusterRadioStationModelArr = null;
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                    String currentName = jsonParser.getCurrentName();
                    char c = 65535;
                    int i = 0;
                    switch (currentName.hashCode()) {
                        case -1359384797:
                            if (currentName.equals("recommended_stations")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -627450268:
                            if (currentName.equals("cluster_stations")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -519221129:
                            if (currentName.equals("saved_stations")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1259163899:
                            if (currentName.equals("genre_stations")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1368883123:
                            if (currentName.equals("user_stations")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        jsonParser.nextValue();
                        radioStationModelArr = g(jsonParser, deserializationContext);
                    } else if (c == 1) {
                        jsonParser.nextValue();
                        radioStationModelArr2 = g(jsonParser, deserializationContext);
                    } else if (c == 2) {
                        jsonParser.nextValue();
                        radioStationModelArr3 = g(jsonParser, deserializationContext);
                    } else if (c == 3) {
                        jsonParser.nextValue();
                        radioStationModelArr4 = g(jsonParser, deserializationContext);
                    } else if (c != 4) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            clusterRadioStationModelArr = null;
                        } else {
                            LinkedList<ClusterRadioStationModel> linkedList = new LinkedList<>();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                linkedList.add(c(jsonParser, deserializationContext));
                            }
                            ClusterRadioStationModel[] clusterRadioStationModelArr2 = new ClusterRadioStationModel[linkedList.size()];
                            for (ClusterRadioStationModel clusterRadioStationModel : linkedList) {
                                int i2 = i + 1;
                                clusterRadioStationModelArr2[i] = clusterRadioStationModel;
                                i = i2;
                            }
                            clusterRadioStationModelArr = clusterRadioStationModelArr2;
                        }
                    }
                }
            }
            return RadioStationsModel.create(radioStationModelArr, radioStationModelArr2, radioStationModelArr3, radioStationModelArr4, clusterRadioStationModelArr);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }
}
