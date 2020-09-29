package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class PlayerContext_Deserializer extends StdDeserializer<PlayerContext> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        static {
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final boolean isCachable() {
        return true;
    }

    PlayerContext_Deserializer() {
        super(PlayerContext.class);
    }

    public final PlayerContext deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return deserializePlayerContext(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    public final Map<String, String> deserializeMapStringString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String deserializeString = deserializeString(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(deserializeString, deserializeString(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.cosmos.player.v2.PlayerContext deserializePlayerContext(com.fasterxml.jackson.core.JsonParser r15, com.fasterxml.jackson.databind.DeserializationContext r16) {
        /*
            r14 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r15.getCurrentToken()
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
            com.fasterxml.jackson.core.JsonToken r0 = r15.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00bf
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r15.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0028
            goto L_0x0010
        L_0x0028:
            java.lang.String r0 = r15.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            r10 = 5
            r11 = 4
            r12 = 3
            r13 = 2
            switch(r3) {
                case -1148295641: goto L_0x006b;
                case -450004177: goto L_0x0061;
                case 116076: goto L_0x0057;
                case 116079: goto L_0x004d;
                case 106426308: goto L_0x0043;
                case 272615463: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0075
        L_0x0039:
            java.lang.String r3 = "fallback_pages"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 4
            goto L_0x0076
        L_0x0043:
            java.lang.String r3 = "pages"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 3
            goto L_0x0076
        L_0x004d:
            java.lang.String r3 = "url"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 5
            goto L_0x0076
        L_0x0057:
            java.lang.String r3 = "uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 0
            goto L_0x0076
        L_0x0061:
            java.lang.String r3 = "metadata"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x006b:
            java.lang.String r3 = "restrictions"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 2
            goto L_0x0076
        L_0x0075:
            r0 = -1
        L_0x0076:
            if (r0 == 0) goto L_0x00b6
            if (r0 == r1) goto L_0x00ad
            if (r0 == r13) goto L_0x00a4
            if (r0 == r12) goto L_0x009b
            if (r0 == r11) goto L_0x0092
            if (r0 == r10) goto L_0x0089
            r15.nextValue()
            r15.skipChildren()
            goto L_0x0010
        L_0x0089:
            r15.nextValue()
            java.lang.String r9 = r14.deserializeString(r15, r16)
            goto L_0x0010
        L_0x0092:
            r15.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r8 = r14.deserializePlayerContextPageArray(r15, r16)
            goto L_0x0010
        L_0x009b:
            r15.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r7 = r14.deserializePlayerContextPageArray(r15, r16)
            goto L_0x0010
        L_0x00a4:
            r15.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r6 = r14.deserializePlayerRestrictions(r15, r16)
            goto L_0x0010
        L_0x00ad:
            r15.nextValue()
            java.util.Map r5 = r14.deserializeMapStringString(r15, r16)
            goto L_0x0010
        L_0x00b6:
            r15.nextValue()
            java.lang.String r4 = r14.deserializeString(r15, r16)
            goto L_0x0010
        L_0x00bf:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerContext
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.deserializePlayerContext(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerContext");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage deserializePlayerContextPage(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r11.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
            r1 = r0
            r3 = r1
        L_0x000d:
            com.fasterxml.jackson.core.JsonToken r4 = r11.nextToken()
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r4 == r5) goto L_0x008c
            int[] r4 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r5 = r11.getCurrentToken()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x0025
            goto L_0x000d
        L_0x0025:
            java.lang.String r4 = r11.getCurrentName()
            r6 = -1
            int r7 = r4.hashCode()
            r8 = 3
            r9 = 2
            switch(r7) {
                case -865716088: goto L_0x0052;
                case -450004177: goto L_0x0048;
                case 859797439: goto L_0x003e;
                case 981647243: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x005c
        L_0x0034:
            java.lang.String r7 = "next_page_url"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 1
            goto L_0x005d
        L_0x003e:
            java.lang.String r7 = "page_url"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 0
            goto L_0x005d
        L_0x0048:
            java.lang.String r7 = "metadata"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 3
            goto L_0x005d
        L_0x0052:
            java.lang.String r7 = "tracks"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 2
            goto L_0x005d
        L_0x005c:
            r4 = -1
        L_0x005d:
            if (r4 == 0) goto L_0x0084
            if (r4 == r5) goto L_0x007c
            if (r4 == r9) goto L_0x0074
            if (r4 == r8) goto L_0x006c
            r11.nextValue()
            r11.skipChildren()
            goto L_0x000d
        L_0x006c:
            r11.nextValue()
            java.util.Map r3 = r10.deserializeMapStringString(r11, r12)
            goto L_0x000d
        L_0x0074:
            r11.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r1 = r10.deserializePlayerTrackArray(r11, r12)
            goto L_0x000d
        L_0x007c:
            r11.nextValue()
            java.lang.String r0 = r10.deserializeString(r11, r12)
            goto L_0x000d
        L_0x0084:
            r11.nextValue()
            java.lang.String r2 = r10.deserializeString(r11, r12)
            goto L_0x000d
        L_0x008c:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage r11 = new com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage
            r11.<init>(r2, r0, r1, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.deserializePlayerContextPage(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage");
    }

    public final PlayerContextPage[] deserializePlayerContextPageArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<PlayerContextPage> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(deserializePlayerContextPage(jsonParser, deserializationContext));
        }
        int i = 0;
        PlayerContextPage[] playerContextPageArr = new PlayerContextPage[linkedList.size()];
        for (PlayerContextPage playerContextPage : linkedList) {
            int i2 = i + 1;
            playerContextPageArr[i] = playerContextPage;
            i = i2;
        }
        return playerContextPageArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        if (r0.equals("disallow_peeking_next_reasons") != false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions deserializePlayerRestrictions(com.fasterxml.jackson.core.JsonParser r25, com.fasterxml.jackson.databind.DeserializationContext r26) {
        /*
            r24 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r25.getCurrentToken()
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
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
        L_0x0026:
            com.fasterxml.jackson.core.JsonToken r0 = r25.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x01e9
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r25.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x003e
            goto L_0x0026
        L_0x003e:
            java.lang.String r0 = r25.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -2121012819: goto L_0x011f;
                case -1973888603: goto L_0x0115;
                case -1911949152: goto L_0x010a;
                case -1789485441: goto L_0x00ff;
                case -1672017761: goto L_0x00f4;
                case -1615712193: goto L_0x00eb;
                case -1320270643: goto L_0x00e0;
                case -1240009448: goto L_0x00d5;
                case -858216162: goto L_0x00ca;
                case -669786401: goto L_0x00c0;
                case -192233122: goto L_0x00b5;
                case -155077117: goto L_0x00a9;
                case 545385963: goto L_0x009d;
                case 665436397: goto L_0x0092;
                case 826925761: goto L_0x0087;
                case 1031561578: goto L_0x007b;
                case 1145967401: goto L_0x006f;
                case 1170737023: goto L_0x0064;
                case 1197453590: goto L_0x0058;
                case 1847746542: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0129
        L_0x004c:
            java.lang.String r1 = "disallow_reordering_in_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 15
            goto L_0x012a
        L_0x0058:
            java.lang.String r1 = "disallow_seeking_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 9
            goto L_0x012a
        L_0x0064:
            java.lang.String r1 = "disallow_peeking_prev_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 0
            goto L_0x012a
        L_0x006f:
            java.lang.String r1 = "disallow_removing_from_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 16
            goto L_0x012a
        L_0x007b:
            java.lang.String r1 = "disallow_updating_context_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 18
            goto L_0x012a
        L_0x0087:
            java.lang.String r1 = "disallow_toggling_repeat_track_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 7
            goto L_0x012a
        L_0x0092:
            java.lang.String r1 = "disallow_skipping_prev_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 2
            goto L_0x012a
        L_0x009d:
            java.lang.String r1 = "disallow_transferring_playback_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 10
            goto L_0x012a
        L_0x00a9:
            java.lang.String r1 = "disallow_removing_from_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 17
            goto L_0x012a
        L_0x00b5:
            java.lang.String r1 = "disallow_resuming_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 5
            goto L_0x012a
        L_0x00c0:
            java.lang.String r1 = "disallow_pausing_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 4
            goto L_0x012a
        L_0x00ca:
            java.lang.String r1 = "disallow_reordering_in_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 14
            goto L_0x012a
        L_0x00d5:
            java.lang.String r1 = "disallow_remote_control_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 11
            goto L_0x012a
        L_0x00e0:
            java.lang.String r1 = "disallow_inserting_into_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 13
            goto L_0x012a
        L_0x00eb:
            java.lang.String r3 = "disallow_peeking_next_reasons"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0129
            goto L_0x012a
        L_0x00f4:
            java.lang.String r1 = "disallow_inserting_into_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 12
            goto L_0x012a
        L_0x00ff:
            java.lang.String r1 = "disallow_toggling_shuffle_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 8
            goto L_0x012a
        L_0x010a:
            java.lang.String r1 = "disallow_set_queue_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 19
            goto L_0x012a
        L_0x0115:
            java.lang.String r1 = "disallow_toggling_repeat_context_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 6
            goto L_0x012a
        L_0x011f:
            java.lang.String r1 = "disallow_skipping_next_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0129
            r1 = 3
            goto L_0x012a
        L_0x0129:
            r1 = -1
        L_0x012a:
            switch(r1) {
                case 0: goto L_0x01e0;
                case 1: goto L_0x01d7;
                case 2: goto L_0x01ce;
                case 3: goto L_0x01c5;
                case 4: goto L_0x01bc;
                case 5: goto L_0x01b3;
                case 6: goto L_0x01aa;
                case 7: goto L_0x01a1;
                case 8: goto L_0x0198;
                case 9: goto L_0x018f;
                case 10: goto L_0x0186;
                case 11: goto L_0x017d;
                case 12: goto L_0x0174;
                case 13: goto L_0x016b;
                case 14: goto L_0x0162;
                case 15: goto L_0x0159;
                case 16: goto L_0x0150;
                case 17: goto L_0x0147;
                case 18: goto L_0x013e;
                case 19: goto L_0x0135;
                default: goto L_0x012d;
            }
        L_0x012d:
            r25.nextValue()
            r25.skipChildren()
            goto L_0x0026
        L_0x0135:
            r25.nextValue()
            java.util.Set r23 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x013e:
            r25.nextValue()
            java.util.Set r22 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x0147:
            r25.nextValue()
            java.util.Set r21 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x0150:
            r25.nextValue()
            java.util.Set r20 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x0159:
            r25.nextValue()
            java.util.Set r19 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x0162:
            r25.nextValue()
            java.util.Set r18 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x016b:
            r25.nextValue()
            java.util.Set r17 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x0174:
            r25.nextValue()
            java.util.Set r16 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x017d:
            r25.nextValue()
            java.util.Set r15 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x0186:
            r25.nextValue()
            java.util.Set r14 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x018f:
            r25.nextValue()
            java.util.Set r13 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x0198:
            r25.nextValue()
            java.util.Set r12 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01a1:
            r25.nextValue()
            java.util.Set r11 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01aa:
            r25.nextValue()
            java.util.Set r10 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01b3:
            r25.nextValue()
            java.util.Set r9 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01bc:
            r25.nextValue()
            java.util.Set r8 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01c5:
            r25.nextValue()
            java.util.Set r7 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01ce:
            r25.nextValue()
            java.util.Set r6 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01d7:
            r25.nextValue()
            java.util.Set r5 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01e0:
            r25.nextValue()
            java.util.Set r4 = r24.deserializeSetString(r25, r26)
            goto L_0x0026
        L_0x01e9:
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.deserializePlayerRestrictions(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.cosmos.player.v2.PlayerTrack deserializePlayerTrack(com.fasterxml.jackson.core.JsonParser r15, com.fasterxml.jackson.databind.DeserializationContext r16) {
        /*
            r14 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r15.getCurrentToken()
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
            com.fasterxml.jackson.core.JsonToken r0 = r15.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00bf
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r15.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0028
            goto L_0x0010
        L_0x0028:
            java.lang.String r0 = r15.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            r10 = 5
            r11 = 4
            r12 = 3
            r13 = 2
            switch(r3) {
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
            java.lang.String r3 = "artist_uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 3
            goto L_0x0076
        L_0x0043:
            java.lang.String r3 = "album_uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 2
            goto L_0x0076
        L_0x004d:
            java.lang.String r3 = "uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 0
            goto L_0x0076
        L_0x0057:
            java.lang.String r3 = "uid"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0061:
            java.lang.String r3 = "metadata"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 5
            goto L_0x0076
        L_0x006b:
            java.lang.String r3 = "provider"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0075
            r0 = 4
            goto L_0x0076
        L_0x0075:
            r0 = -1
        L_0x0076:
            if (r0 == 0) goto L_0x00b6
            if (r0 == r1) goto L_0x00ad
            if (r0 == r13) goto L_0x00a4
            if (r0 == r12) goto L_0x009b
            if (r0 == r11) goto L_0x0092
            if (r0 == r10) goto L_0x0089
            r15.nextValue()
            r15.skipChildren()
            goto L_0x0010
        L_0x0089:
            r15.nextValue()
            java.util.Map r9 = r14.deserializeMapStringString(r15, r16)
            goto L_0x0010
        L_0x0092:
            r15.nextValue()
            java.lang.String r8 = r14.deserializeString(r15, r16)
            goto L_0x0010
        L_0x009b:
            r15.nextValue()
            java.lang.String r7 = r14.deserializeString(r15, r16)
            goto L_0x0010
        L_0x00a4:
            r15.nextValue()
            java.lang.String r6 = r14.deserializeString(r15, r16)
            goto L_0x0010
        L_0x00ad:
            r15.nextValue()
            java.lang.String r5 = r14.deserializeString(r15, r16)
            goto L_0x0010
        L_0x00b6:
            r15.nextValue()
            java.lang.String r4 = r14.deserializeString(r15, r16)
            goto L_0x0010
        L_0x00bf:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.deserializePlayerTrack(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
    }

    public final PlayerTrack[] deserializePlayerTrackArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<PlayerTrack> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(deserializePlayerTrack(jsonParser, deserializationContext));
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

    public final Set<String> deserializeSetString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashSet hashSet = new HashSet();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            hashSet.add(deserializeString(jsonParser, deserializationContext));
        }
        return hashSet;
    }

    public final String deserializeString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }
}
