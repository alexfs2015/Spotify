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
            r4 = r2
            r5 = r4
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r8 = r7
            r9 = r8
            r9 = r8
        L_0x0014:
            com.fasterxml.jackson.core.JsonToken r0 = r15.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00d0
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r15.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            java.lang.String r0 = r15.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            r10 = 5
            r11 = 4
            r12 = 3
            r13 = 2
            switch(r3) {
                case -1148295641: goto L_0x0079;
                case -450004177: goto L_0x006d;
                case 116076: goto L_0x0061;
                case 116079: goto L_0x0055;
                case 106426308: goto L_0x0049;
                case 272615463: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0085
        L_0x003d:
            java.lang.String r3 = "slsabflapcke_g"
            java.lang.String r3 = "fallback_pages"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0085
            r0 = 4
            goto L_0x0086
        L_0x0049:
            java.lang.String r3 = "sgema"
            java.lang.String r3 = "pages"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0085
            r0 = 3
            goto L_0x0086
        L_0x0055:
            java.lang.String r3 = "rul"
            java.lang.String r3 = "url"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0085
            r0 = 5
            goto L_0x0086
        L_0x0061:
            java.lang.String r3 = "uir"
            java.lang.String r3 = "uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0085
            r0 = 0
            goto L_0x0086
        L_0x006d:
            java.lang.String r3 = "atdaoate"
            java.lang.String r3 = "metadata"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0085
            r0 = 1
            goto L_0x0086
        L_0x0079:
            java.lang.String r3 = "orirnbsstice"
            java.lang.String r3 = "restrictions"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0085
            r0 = 2
            goto L_0x0086
        L_0x0085:
            r0 = -1
        L_0x0086:
            if (r0 == 0) goto L_0x00c7
            if (r0 == r1) goto L_0x00be
            if (r0 == r13) goto L_0x00b5
            if (r0 == r12) goto L_0x00ac
            if (r0 == r11) goto L_0x00a3
            if (r0 == r10) goto L_0x009a
            r15.nextValue()
            r15.skipChildren()
            goto L_0x0014
        L_0x009a:
            r15.nextValue()
            java.lang.String r9 = r14.deserializeString(r15, r16)
            goto L_0x0014
        L_0x00a3:
            r15.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r8 = r14.deserializePlayerContextPageArray(r15, r16)
            goto L_0x0014
        L_0x00ac:
            r15.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage[] r7 = r14.deserializePlayerContextPageArray(r15, r16)
            goto L_0x0014
        L_0x00b5:
            r15.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r6 = r14.deserializePlayerRestrictions(r15, r16)
            goto L_0x0014
        L_0x00be:
            r15.nextValue()
            java.util.Map r5 = r14.deserializeMapStringString(r15, r16)
            goto L_0x0014
        L_0x00c7:
            r15.nextValue()
            java.lang.String r4 = r14.deserializeString(r15, r16)
            goto L_0x0014
        L_0x00d0:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerContext
            r3 = r0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.deserializePlayerContext(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerContext");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage deserializePlayerContextPage(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13) {
        /*
            r11 = this;
            r10 = 0
            com.fasterxml.jackson.core.JsonToken r0 = r12.getCurrentToken()
            r10 = 5
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r10 = 0
            r2 = 0
            r10 = 4
            if (r0 != r1) goto L_0x000f
            r10 = 3
            return r2
        L_0x000f:
            r0 = r2
            r0 = r2
            r1 = r0
            r1 = r0
            r3 = r1
        L_0x0014:
            r10 = 4
            com.fasterxml.jackson.core.JsonToken r4 = r12.nextToken()
            r10 = 7
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r10 = 2
            if (r4 == r5) goto L_0x00be
            int[] r4 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r5 = r12.getCurrentToken()
            r10 = 7
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            r10 = r5
            if (r4 == r5) goto L_0x0031
            goto L_0x0014
        L_0x0031:
            java.lang.String r4 = r12.getCurrentName()
            r6 = -1
            r10 = 1
            int r7 = r4.hashCode()
            r10 = 3
            r8 = 3
            r10 = 0
            r9 = 2
            r10 = 4
            switch(r7) {
                case -865716088: goto L_0x0071;
                case -450004177: goto L_0x0063;
                case 859797439: goto L_0x0054;
                case 981647243: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            r10 = 6
            goto L_0x007f
        L_0x0045:
            java.lang.String r7 = "taregub_x_lpe"
            java.lang.String r7 = "next_page_url"
            boolean r4 = r4.equals(r7)
            r10 = 6
            if (r4 == 0) goto L_0x007f
            r10 = 0
            r4 = 1
            r10 = 5
            goto L_0x0080
        L_0x0054:
            r10 = 4
            java.lang.String r7 = "page_url"
            r10 = 2
            boolean r4 = r4.equals(r7)
            r10 = 3
            if (r4 == 0) goto L_0x007f
            r10 = 1
            r4 = 0
            r10 = 3
            goto L_0x0080
        L_0x0063:
            java.lang.String r7 = "amaaedtt"
            java.lang.String r7 = "metadata"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x007f
            r10 = 1
            r4 = 3
            r10 = 5
            goto L_0x0080
        L_0x0071:
            java.lang.String r7 = "kcptar"
            java.lang.String r7 = "tracks"
            r10 = 1
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x007f
            r10 = 2
            r4 = 2
            goto L_0x0080
        L_0x007f:
            r4 = -1
        L_0x0080:
            r10 = 4
            if (r4 == 0) goto L_0x00b3
            r10 = 4
            if (r4 == r5) goto L_0x00a9
            r10 = 5
            if (r4 == r9) goto L_0x009f
            r10 = 4
            if (r4 == r8) goto L_0x0095
            r12.nextValue()
            r10 = 6
            r12.skipChildren()
            r10 = 0
            goto L_0x0014
        L_0x0095:
            r12.nextValue()
            java.util.Map r3 = r11.deserializeMapStringString(r12, r13)
            r10 = 7
            goto L_0x0014
        L_0x009f:
            r12.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r1 = r11.deserializePlayerTrackArray(r12, r13)
            r10 = 3
            goto L_0x0014
        L_0x00a9:
            r12.nextValue()
            java.lang.String r0 = r11.deserializeString(r12, r13)
            r10 = 6
            goto L_0x0014
        L_0x00b3:
            r12.nextValue()
            r10 = 4
            java.lang.String r2 = r11.deserializeString(r12, r13)
            r10 = 0
            goto L_0x0014
        L_0x00be:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage r12 = new com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage
            r10 = 6
            r12.<init>(r2, r0, r1, r3)
            r10 = 3
            return r12
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
            int i3 = i2;
            i = i2;
        }
        return playerContextPageArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        if (r0.equals("disallow_peeking_next_reasons") != false) goto L_0x0152;
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
            r5 = r4
            r6 = r5
            r6 = r5
            r7 = r6
            r8 = r7
            r8 = r7
            r9 = r8
            r10 = r9
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r13 = r12
            r14 = r13
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r17 = r16
            r18 = r17
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r21 = r20
            r22 = r21
            r22 = r21
            r23 = r22
        L_0x0034:
            com.fasterxml.jackson.core.JsonToken r0 = r25.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x0211
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r25.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x004c
            goto L_0x0034
        L_0x004c:
            java.lang.String r0 = r25.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -2121012819: goto L_0x0145;
                case -1973888603: goto L_0x013b;
                case -1911949152: goto L_0x012e;
                case -1789485441: goto L_0x0123;
                case -1672017761: goto L_0x0118;
                case -1615712193: goto L_0x010d;
                case -1320270643: goto L_0x0102;
                case -1240009448: goto L_0x00f7;
                case -858216162: goto L_0x00ea;
                case -669786401: goto L_0x00de;
                case -192233122: goto L_0x00d1;
                case -155077117: goto L_0x00c3;
                case 545385963: goto L_0x00b5;
                case 665436397: goto L_0x00a8;
                case 826925761: goto L_0x009d;
                case 1031561578: goto L_0x008f;
                case 1145967401: goto L_0x0081;
                case 1170737023: goto L_0x0076;
                case 1197453590: goto L_0x0068;
                case 1847746542: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0151
        L_0x005a:
            java.lang.String r1 = "wc_lisx_etdiceenar___okitrntasesraslrgonroton"
            java.lang.String r1 = "disallow_reordering_in_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 15
            goto L_0x0152
        L_0x0068:
            java.lang.String r1 = "rlswldeaonseesk_iasgsn_i"
            java.lang.String r1 = "disallow_seeking_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 9
            goto L_0x0152
        L_0x0076:
            java.lang.String r1 = "disallow_peeking_prev_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 0
            goto L_0x0152
        L_0x0081:
            java.lang.String r1 = "indmmalkfaolsvierts_gxe_rw_eotrs_osnn_ormc"
            java.lang.String r1 = "disallow_removing_from_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 16
            goto L_0x0152
        L_0x008f:
            java.lang.String r1 = "a_tpoaairnlleonsttgs_odnodxcwius_"
            java.lang.String r1 = "disallow_updating_context_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 18
            goto L_0x0152
        L_0x009d:
            java.lang.String r1 = "disallow_toggling_repeat_track_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 7
            goto L_0x0152
        L_0x00a8:
            java.lang.String r1 = "svriablspreiiae_no_nogsw_spldp"
            java.lang.String r1 = "disallow_skipping_prev_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 2
            goto L_0x0152
        L_0x00b5:
            java.lang.String r1 = "is_ospbas_kyarrtlwricaernoeabadgllfs_n"
            java.lang.String r1 = "disallow_transferring_playback_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 10
            goto L_0x0152
        L_0x00c3:
            java.lang.String r1 = "eflkrldttomxs_vo_aainces_r_nascrwmtis_goeoonr"
            java.lang.String r1 = "disallow_removing_from_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 17
            goto L_0x0152
        L_0x00d1:
            java.lang.String r1 = "suoari__plsnoedglesmsiarw"
            java.lang.String r1 = "disallow_resuming_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 5
            goto L_0x0152
        L_0x00de:
            java.lang.String r1 = "sa_seuasptogislwdolann_r"
            java.lang.String r1 = "disallow_pausing_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 4
            goto L_0x0152
        L_0x00ea:
            java.lang.String r1 = "lisadwgrineearil___ntdno__xrsreoskesrctnoa"
            java.lang.String r1 = "disallow_reordering_in_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 14
            goto L_0x0152
        L_0x00f7:
            java.lang.String r1 = "disallow_remote_control_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 11
            goto L_0x0152
        L_0x0102:
            java.lang.String r1 = "disallow_inserting_into_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 13
            goto L_0x0152
        L_0x010d:
            java.lang.String r3 = "ewlmonsak_ionepdtassrx_eg_iel"
            java.lang.String r3 = "disallow_peeking_next_reasons"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0151
            goto L_0x0152
        L_0x0118:
            java.lang.String r1 = "disallow_inserting_into_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 12
            goto L_0x0152
        L_0x0123:
            java.lang.String r1 = "disallow_toggling_shuffle_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 8
            goto L_0x0152
        L_0x012e:
            java.lang.String r1 = "_sanowe_lsliaoue_rdsutoseq"
            java.lang.String r1 = "disallow_set_queue_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 19
            goto L_0x0152
        L_0x013b:
            java.lang.String r1 = "disallow_toggling_repeat_context_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 6
            goto L_0x0152
        L_0x0145:
            java.lang.String r1 = "ika_dbatnprsnigesoolxlnei__wsp"
            java.lang.String r1 = "disallow_skipping_next_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 3
            goto L_0x0152
        L_0x0151:
            r1 = -1
        L_0x0152:
            switch(r1) {
                case 0: goto L_0x0208;
                case 1: goto L_0x01ff;
                case 2: goto L_0x01f6;
                case 3: goto L_0x01ed;
                case 4: goto L_0x01e4;
                case 5: goto L_0x01db;
                case 6: goto L_0x01d2;
                case 7: goto L_0x01c9;
                case 8: goto L_0x01c0;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ae;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019c;
                case 13: goto L_0x0193;
                case 14: goto L_0x018a;
                case 15: goto L_0x0181;
                case 16: goto L_0x0178;
                case 17: goto L_0x016f;
                case 18: goto L_0x0166;
                case 19: goto L_0x015d;
                default: goto L_0x0155;
            }
        L_0x0155:
            r25.nextValue()
            r25.skipChildren()
            goto L_0x0034
        L_0x015d:
            r25.nextValue()
            java.util.Set r23 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x0166:
            r25.nextValue()
            java.util.Set r22 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x016f:
            r25.nextValue()
            java.util.Set r21 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x0178:
            r25.nextValue()
            java.util.Set r20 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x0181:
            r25.nextValue()
            java.util.Set r19 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x018a:
            r25.nextValue()
            java.util.Set r18 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x0193:
            r25.nextValue()
            java.util.Set r17 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x019c:
            r25.nextValue()
            java.util.Set r16 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01a5:
            r25.nextValue()
            java.util.Set r15 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01ae:
            r25.nextValue()
            java.util.Set r14 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01b7:
            r25.nextValue()
            java.util.Set r13 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01c0:
            r25.nextValue()
            java.util.Set r12 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01c9:
            r25.nextValue()
            java.util.Set r11 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01d2:
            r25.nextValue()
            java.util.Set r10 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01db:
            r25.nextValue()
            java.util.Set r9 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01e4:
            r25.nextValue()
            java.util.Set r8 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01ed:
            r25.nextValue()
            java.util.Set r7 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01f6:
            r25.nextValue()
            java.util.Set r6 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x01ff:
            r25.nextValue()
            java.util.Set r5 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x0208:
            r25.nextValue()
            java.util.Set r4 = r24.deserializeSetString(r25, r26)
            goto L_0x0034
        L_0x0211:
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions
            r3 = r0
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
            r4 = r2
            r5 = r4
            r5 = r4
            r6 = r5
            r7 = r6
            r7 = r6
            r8 = r7
            r8 = r7
            r9 = r8
            r9 = r8
        L_0x0015:
            com.fasterxml.jackson.core.JsonToken r0 = r15.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00cf
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerContext_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r15.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x002d
            goto L_0x0015
        L_0x002d:
            java.lang.String r0 = r15.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            r10 = 5
            r11 = 4
            r12 = 3
            r13 = 2
            switch(r3) {
                case -987494927: goto L_0x007a;
                case -450004177: goto L_0x006e;
                case 115792: goto L_0x0062;
                case 116076: goto L_0x0056;
                case 249799580: goto L_0x004a;
                case 630249588: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0084
        L_0x003e:
            java.lang.String r3 = "uttiisbrr_"
            java.lang.String r3 = "artist_uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0084
            r0 = 3
            goto L_0x0085
        L_0x004a:
            java.lang.String r3 = "rbil_umtu"
            java.lang.String r3 = "album_uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0084
            r0 = 2
            goto L_0x0085
        L_0x0056:
            java.lang.String r3 = "rui"
            java.lang.String r3 = "uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0085
        L_0x0062:
            java.lang.String r3 = "diu"
            java.lang.String r3 = "uid"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0084
            r0 = 1
            goto L_0x0085
        L_0x006e:
            java.lang.String r3 = "patdtema"
            java.lang.String r3 = "metadata"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0084
            r0 = 5
            goto L_0x0085
        L_0x007a:
            java.lang.String r3 = "provider"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0084
            r0 = 4
            goto L_0x0085
        L_0x0084:
            r0 = -1
        L_0x0085:
            if (r0 == 0) goto L_0x00c6
            if (r0 == r1) goto L_0x00bd
            if (r0 == r13) goto L_0x00b4
            if (r0 == r12) goto L_0x00ab
            if (r0 == r11) goto L_0x00a2
            if (r0 == r10) goto L_0x0099
            r15.nextValue()
            r15.skipChildren()
            goto L_0x0015
        L_0x0099:
            r15.nextValue()
            java.util.Map r9 = r14.deserializeMapStringString(r15, r16)
            goto L_0x0015
        L_0x00a2:
            r15.nextValue()
            java.lang.String r8 = r14.deserializeString(r15, r16)
            goto L_0x0015
        L_0x00ab:
            r15.nextValue()
            java.lang.String r7 = r14.deserializeString(r15, r16)
            goto L_0x0015
        L_0x00b4:
            r15.nextValue()
            java.lang.String r6 = r14.deserializeString(r15, r16)
            goto L_0x0015
        L_0x00bd:
            r15.nextValue()
            java.lang.String r5 = r14.deserializeString(r15, r16)
            goto L_0x0015
        L_0x00c6:
            r15.nextValue()
            java.lang.String r4 = r14.deserializeString(r15, r16)
            goto L_0x0015
        L_0x00cf:
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

    public final boolean isCachable() {
        return true;
    }
}
