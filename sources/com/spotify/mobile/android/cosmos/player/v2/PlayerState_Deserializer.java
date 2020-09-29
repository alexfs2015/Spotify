package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class PlayerState_Deserializer extends StdDeserializer<PlayerState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        static {
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    PlayerState_Deserializer() {
        super(PlayerState.class);
    }

    public final boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "lesnboo";
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    public final float _deserializefloat(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "foamt";
        return ((Float) NumberDeserializers.find(Float.TYPE, "float").deserialize(jsonParser, deserializationContext)).floatValue();
    }

    public final int _deserializeint(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "nit";
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    public final long _deserializelong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "nlgo";
        return ((Long) NumberDeserializers.find(Long.TYPE, "long").deserialize(jsonParser, deserializationContext)).longValue();
    }

    public final PlayerState deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return deserializePlayerState(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    public final AudioStream deserializeAudioStreamEnum(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return jsonParser.getCurrentToken() == JsonToken.VALUE_STRING ? AudioStream.fromString(jsonParser.getText()) : (AudioStream) deserializationContext.handleUnexpectedToken(AudioStream.class, jsonParser);
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
    public final com.spotify.mobile.android.cosmos.player.v2.PlayOrigin deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14) {
        /*
            r12 = this;
            r11 = 2
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()
            r11 = 4
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000c
            return r2
        L_0x000c:
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
            r10 = r9
            r10 = r9
        L_0x0018:
            r11 = 1
            com.fasterxml.jackson.core.JsonToken r0 = r13.nextToken()
            r11 = 2
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x010c
            r11 = 3
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            r11 = 3
            com.fasterxml.jackson.core.JsonToken r1 = r13.getCurrentToken()
            r11 = 3
            int r1 = r1.ordinal()
            r11 = 3
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0036
            goto L_0x0018
        L_0x0036:
            java.lang.String r0 = r13.getCurrentName()
            r11 = 7
            r2 = -1
            r11 = 0
            int r3 = r0.hashCode()
            r11 = 3
            switch(r3) {
                case -1358351982: goto L_0x00a0;
                case -1238715854: goto L_0x0091;
                case -1144002417: goto L_0x0083;
                case -641989667: goto L_0x0074;
                case 1006001683: goto L_0x0065;
                case 1163267273: goto L_0x0056;
                case 1196184786: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            r11 = 0
            goto L_0x00ae
        L_0x0047:
            r11 = 6
            java.lang.String r1 = "vreio_wu"
            java.lang.String r1 = "view_uri"
            boolean r0 = r0.equals(r1)
            r11 = 0
            if (r0 == 0) goto L_0x00ae
            r1 = 7
            r1 = 2
            goto L_0x00b0
        L_0x0056:
            r11 = 4
            java.lang.String r1 = "referrer_identifier"
            r11 = 6
            boolean r0 = r0.equals(r1)
            r11 = 2
            if (r0 == 0) goto L_0x00ae
            r11 = 6
            r1 = 4
            r11 = 1
            goto L_0x00b0
        L_0x0065:
            r11 = 0
            java.lang.String r1 = "external_referrer"
            r11 = 2
            boolean r0 = r0.equals(r1)
            r11 = 1
            if (r0 == 0) goto L_0x00ae
            r11 = 3
            r1 = 3
            r11 = 2
            goto L_0x00b0
        L_0x0074:
            r11 = 3
            java.lang.String r1 = "feature_classes"
            r11 = 3
            boolean r0 = r0.equals(r1)
            r11 = 1
            if (r0 == 0) goto L_0x00ae
            r11 = 0
            r1 = 6
            r11 = 7
            goto L_0x00b0
        L_0x0083:
            java.lang.String r3 = "rensrbtivaeufeo"
            java.lang.String r3 = "feature_version"
            r11 = 0
            boolean r0 = r0.equals(r3)
            r11 = 4
            if (r0 == 0) goto L_0x00ae
            r11 = 2
            goto L_0x00b0
        L_0x0091:
            java.lang.String r1 = "_deiifbeetcrinevd"
            java.lang.String r1 = "device_identifier"
            r11 = 6
            boolean r0 = r0.equals(r1)
            r11 = 3
            if (r0 == 0) goto L_0x00ae
            r1 = 5
            int r11 = r11 >> r1
            goto L_0x00b0
        L_0x00a0:
            r11 = 6
            java.lang.String r1 = "feature_identifier"
            r11 = 6
            boolean r0 = r0.equals(r1)
            r11 = 6
            if (r0 == 0) goto L_0x00ae
            r11 = 2
            r1 = 0
            goto L_0x00b0
        L_0x00ae:
            r11 = 2
            r1 = -1
        L_0x00b0:
            r11 = 4
            switch(r1) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00f5;
                case 2: goto L_0x00e9;
                case 3: goto L_0x00df;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00c8;
                case 6: goto L_0x00be;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            r11 = 6
            r13.nextValue()
            r11 = 3
            r13.skipChildren()
            goto L_0x0018
        L_0x00be:
            r13.nextValue()
            java.util.Set r10 = r12.deserializeSetString(r13, r14)
            r11 = 3
            goto L_0x0018
        L_0x00c8:
            r11 = 0
            r13.nextValue()
            r11 = 5
            java.lang.String r9 = r12.deserializeString(r13, r14)
            r11 = 5
            goto L_0x0018
        L_0x00d4:
            r13.nextValue()
            r11 = 5
            java.lang.String r8 = r12.deserializeString(r13, r14)
            r11 = 4
            goto L_0x0018
        L_0x00df:
            r13.nextValue()
            r11 = 2
            java.lang.String r7 = r12.deserializeString(r13, r14)
            goto L_0x0018
        L_0x00e9:
            r11 = 1
            r13.nextValue()
            r11 = 4
            java.lang.String r6 = r12.deserializeString(r13, r14)
            r11 = 7
            goto L_0x0018
        L_0x00f5:
            r11 = 5
            r13.nextValue()
            r11 = 1
            java.lang.String r5 = r12.deserializeString(r13, r14)
            r11 = 6
            goto L_0x0018
        L_0x0101:
            r13.nextValue()
            r11 = 3
            java.lang.String r4 = r12.deserializeString(r13, r14)
            r11 = 1
            goto L_0x0018
        L_0x010c:
            r11 = 1
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r13 = new com.spotify.mobile.android.cosmos.player.v2.PlayOrigin
            r3 = r13
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayOrigin");
    }

    public final PlayerContextIndex deserializePlayerContextIndex(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            boolean z = true;
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode == 3433103) {
                    String str = "page";
                    if (currentName.equals("page")) {
                        c = 0;
                    }
                } else if (hashCode == 110621003) {
                    String str2 = "catrt";
                    if (currentName.equals(TrackData.TYPE_TRACK)) {
                        c = 1;
                        int i3 = 6 >> 1;
                    }
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    i = _deserializeint(jsonParser, deserializationContext);
                } else if (c != 1) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i2 = _deserializeint(jsonParser, deserializationContext);
                }
            }
        }
        return new PlayerContextIndex(i, i2);
    }

    public final PlayerOptions deserializePlayerOptions(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false | false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1459599913) {
                    if (hashCode == -1400336410) {
                        String str = "oltgifnepnhsxtuf_";
                        if (currentName.equals("shuffling_context")) {
                            c = 0;
                        }
                    } else if (hashCode == 45542259) {
                        if (currentName.equals("repeating_track")) {
                            c = 2;
                        }
                    }
                } else if (currentName.equals("repeating_context")) {
                    c = 1;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    z = _deserializeboolean(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    z2 = _deserializeboolean(jsonParser, deserializationContext);
                } else if (c != 2) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    z3 = _deserializeboolean(jsonParser, deserializationContext);
                }
            }
        }
        return PlayerOptions.create(z, z2, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
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
            r7 = r6
            r8 = r7
            r8 = r7
            r9 = r8
            r9 = r8
            r10 = r9
            r10 = r9
            r11 = r10
            r11 = r10
            r12 = r11
            r12 = r11
            r13 = r12
            r13 = r12
            r14 = r13
            r15 = r14
            r15 = r14
            r16 = r15
            r16 = r15
            r17 = r16
            r18 = r17
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r22 = r21
            r23 = r22
            r23 = r22
        L_0x0038:
            com.fasterxml.jackson.core.JsonToken r0 = r25.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x0211
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r25.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0050
            goto L_0x0038
        L_0x0050:
            java.lang.String r0 = r25.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -2121012819: goto L_0x0145;
                case -1973888603: goto L_0x013b;
                case -1911949152: goto L_0x0130;
                case -1789485441: goto L_0x0125;
                case -1672017761: goto L_0x011a;
                case -1615712193: goto L_0x010f;
                case -1320270643: goto L_0x0104;
                case -1240009448: goto L_0x00f9;
                case -858216162: goto L_0x00ec;
                case -669786401: goto L_0x00e0;
                case -192233122: goto L_0x00d3;
                case -155077117: goto L_0x00c5;
                case 545385963: goto L_0x00b9;
                case 665436397: goto L_0x00ac;
                case 826925761: goto L_0x009f;
                case 1031561578: goto L_0x0091;
                case 1145967401: goto L_0x0085;
                case 1170737023: goto L_0x0078;
                case 1197453590: goto L_0x006c;
                case 1847746542: goto L_0x005e;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0151
        L_0x005e:
            java.lang.String r1 = "oeddoeascten_cix__orso_enrtklirsrta_rwnnliast"
            java.lang.String r1 = "disallow_reordering_in_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 15
            goto L_0x0152
        L_0x006c:
            java.lang.String r1 = "disallow_seeking_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 9
            goto L_0x0152
        L_0x0078:
            java.lang.String r1 = "reslok_esrnlsnvgpdwaeiipas__e"
            java.lang.String r1 = "disallow_peeking_prev_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 0
            goto L_0x0152
        L_0x0085:
            java.lang.String r1 = "disallow_removing_from_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 16
            goto L_0x0152
        L_0x0091:
            java.lang.String r1 = "oesmntuaegar_nidptocniow_stslad_x"
            java.lang.String r1 = "disallow_updating_context_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 18
            goto L_0x0152
        L_0x009f:
            java.lang.String r1 = "atenoioernki_d_sl_slalsgeapc_orwtgtarg"
            java.lang.String r1 = "disallow_toggling_repeat_track_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 7
            goto L_0x0152
        L_0x00ac:
            java.lang.String r1 = "gsalebdlnapi_soe_rwspnkirsivp_"
            java.lang.String r1 = "disallow_skipping_prev_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 2
            goto L_0x0152
        L_0x00b9:
            java.lang.String r1 = "disallow_transferring_playback_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 10
            goto L_0x0152
        L_0x00c5:
            java.lang.String r1 = "kl_aonboreotnfrexnctsl_s_t_vrmarmiagesocodis_"
            java.lang.String r1 = "disallow_removing_from_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 17
            goto L_0x0152
        L_0x00d3:
            java.lang.String r1 = "seeroditulaw_osn_inmsslag"
            java.lang.String r1 = "disallow_resuming_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 5
            goto L_0x0152
        L_0x00e0:
            java.lang.String r1 = "sg_nlisapwda_unopesiaslr"
            java.lang.String r1 = "disallow_pausing_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 4
            goto L_0x0152
        L_0x00ec:
            java.lang.String r1 = "e_tilrssetorreriondclasnow_akreixa_s_gdnn_"
            java.lang.String r1 = "disallow_reordering_in_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 14
            goto L_0x0152
        L_0x00f9:
            java.lang.String r1 = "disallow_remote_control_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 11
            goto L_0x0152
        L_0x0104:
            java.lang.String r1 = "disallow_inserting_into_context_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 13
            goto L_0x0152
        L_0x010f:
            java.lang.String r3 = "ips_kgsldwoeatinesoxs_enra_en"
            java.lang.String r3 = "disallow_peeking_next_reasons"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0151
            goto L_0x0152
        L_0x011a:
            java.lang.String r1 = "disallow_inserting_into_next_tracks_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 12
            goto L_0x0152
        L_0x0125:
            java.lang.String r1 = "disallow_toggling_shuffle_reasons"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0151
            r1 = 8
            goto L_0x0152
        L_0x0130:
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
            java.lang.String r1 = "osamerlensitlx_sni_woadpgnps_k"
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
            goto L_0x0038
        L_0x015d:
            r25.nextValue()
            java.util.Set r23 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x0166:
            r25.nextValue()
            java.util.Set r22 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x016f:
            r25.nextValue()
            java.util.Set r21 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x0178:
            r25.nextValue()
            java.util.Set r20 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x0181:
            r25.nextValue()
            java.util.Set r19 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x018a:
            r25.nextValue()
            java.util.Set r18 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x0193:
            r25.nextValue()
            java.util.Set r17 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x019c:
            r25.nextValue()
            java.util.Set r16 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01a5:
            r25.nextValue()
            java.util.Set r15 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01ae:
            r25.nextValue()
            java.util.Set r14 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01b7:
            r25.nextValue()
            java.util.Set r13 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01c0:
            r25.nextValue()
            java.util.Set r12 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01c9:
            r25.nextValue()
            java.util.Set r11 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01d2:
            r25.nextValue()
            java.util.Set r10 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01db:
            r25.nextValue()
            java.util.Set r9 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01e4:
            r25.nextValue()
            java.util.Set r8 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01ed:
            r25.nextValue()
            java.util.Set r7 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01f6:
            r25.nextValue()
            java.util.Set r6 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x01ff:
            r25.nextValue()
            java.util.Set r5 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x0208:
            r25.nextValue()
            java.util.Set r4 = r24.deserializeSetString(r25, r26)
            goto L_0x0038
        L_0x0211:
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions
            r3 = r0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.deserializePlayerRestrictions(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.cosmos.player.v2.PlayerState deserializePlayerState(com.fasterxml.jackson.core.JsonParser r29, com.fasterxml.jackson.databind.DeserializationContext r30) {
        /*
            r28 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r29.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = 0
            r1 = 0
            r3 = 0
            r3 = 0
            r8 = r2
            r9 = r8
            r9 = r8
            r10 = r9
            r10 = r9
            r11 = r10
            r12 = r11
            r12 = r11
            r20 = r12
            r21 = r20
            r21 = r20
            r22 = r21
            r22 = r21
            r23 = r22
            r23 = r22
            r24 = r23
            r24 = r23
            r25 = r24
            r25 = r24
            r26 = r25
            r27 = r26
            r6 = r3
            r14 = r6
            r16 = r14
            r13 = 0
            r18 = 0
            r19 = 0
        L_0x003b:
            com.fasterxml.jackson.core.JsonToken r0 = r29.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r2) goto L_0x01fb
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r2 = r29.getCurrentToken()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L_0x0053
            goto L_0x003b
        L_0x0053:
            java.lang.String r0 = r29.getCurrentName()
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1992012396: goto L_0x0139;
                case -1434528759: goto L_0x012c;
                case -1263170109: goto L_0x0121;
                case -1249474914: goto L_0x0116;
                case -1148295641: goto L_0x0109;
                case -1034196033: goto L_0x00fe;
                case -541598063: goto L_0x00f4;
                case -531282461: goto L_0x00e7;
                case -102516004: goto L_0x00dd;
                case 55126294: goto L_0x00d2;
                case 100346066: goto L_0x00c7;
                case 110621003: goto L_0x00bc;
                case 725855648: goto L_0x00ae;
                case 1006746137: goto L_0x00a0;
                case 1099846370: goto L_0x0094;
                case 1202375813: goto L_0x0087;
                case 1572272419: goto L_0x007c;
                case 1706303935: goto L_0x006f;
                case 1999813343: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0144
        L_0x0061:
            java.lang.String r2 = "gpamote_adtea"
            java.lang.String r2 = "page_metadata"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 17
            goto L_0x0145
        L_0x006f:
            java.lang.String r2 = "yaildbk_pcb"
            java.lang.String r2 = "playback_id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 4
            goto L_0x0145
        L_0x007c:
            java.lang.String r2 = "playback_speed"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 6
            goto L_0x0145
        L_0x0087:
            java.lang.String r2 = "itsoipbi_tafmomp__ntasse"
            java.lang.String r2 = "position_as_of_timestamp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 7
            goto L_0x0145
        L_0x0094:
            java.lang.String r2 = "reverse"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 15
            goto L_0x0145
        L_0x00a0:
            java.lang.String r2 = "ansiilyt_p"
            java.lang.String r2 = "is_playing"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 9
            goto L_0x0145
        L_0x00ae:
            java.lang.String r2 = "eispopssprsu"
            java.lang.String r2 = "suppressions"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 13
            goto L_0x0145
        L_0x00bc:
            java.lang.String r2 = "track"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 3
            goto L_0x0145
        L_0x00c7:
            java.lang.String r2 = "index"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 5
            goto L_0x0145
        L_0x00d2:
            java.lang.String r2 = "timestamp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 0
            goto L_0x0145
        L_0x00dd:
            java.lang.String r4 = "context_uri"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0144
            r0 = 1
            goto L_0x0145
        L_0x00e7:
            java.lang.String r2 = "tsdiau_es"
            java.lang.String r2 = "is_paused"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 10
            goto L_0x0145
        L_0x00f4:
            java.lang.String r2 = "play_origin"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 2
            goto L_0x0145
        L_0x00fe:
            java.lang.String r2 = "context_metadata"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 16
            goto L_0x0145
        L_0x0109:
            java.lang.String r2 = "rssiictrnote"
            java.lang.String r2 = "restrictions"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 12
            goto L_0x0145
        L_0x0116:
            java.lang.String r2 = "options"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 11
            goto L_0x0145
        L_0x0121:
            java.lang.String r2 = "future"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 14
            goto L_0x0145
        L_0x012c:
            java.lang.String r2 = "_srmiadteaum"
            java.lang.String r2 = "audio_stream"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 18
            goto L_0x0145
        L_0x0139:
            java.lang.String r2 = "duration"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0144
            r0 = 8
            goto L_0x0145
        L_0x0144:
            r0 = -1
        L_0x0145:
            switch(r0) {
                case 0: goto L_0x01f2;
                case 1: goto L_0x01e9;
                case 2: goto L_0x01e0;
                case 3: goto L_0x01d7;
                case 4: goto L_0x01ce;
                case 5: goto L_0x01c5;
                case 6: goto L_0x01bc;
                case 7: goto L_0x01b3;
                case 8: goto L_0x01aa;
                case 9: goto L_0x01a1;
                case 10: goto L_0x0198;
                case 11: goto L_0x018f;
                case 12: goto L_0x0186;
                case 13: goto L_0x017d;
                case 14: goto L_0x0174;
                case 15: goto L_0x016b;
                case 16: goto L_0x0162;
                case 17: goto L_0x0159;
                case 18: goto L_0x0150;
                default: goto L_0x0148;
            }
        L_0x0148:
            r29.nextValue()
            r29.skipChildren()
            goto L_0x003b
        L_0x0150:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r27 = r28.deserializeAudioStreamEnum(r29, r30)
            goto L_0x003b
        L_0x0159:
            r29.nextValue()
            java.util.Map r26 = r28.deserializeMapStringString(r29, r30)
            goto L_0x003b
        L_0x0162:
            r29.nextValue()
            java.util.Map r25 = r28.deserializeMapStringString(r29, r30)
            goto L_0x003b
        L_0x016b:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r24 = r28.deserializePlayerTrackArray(r29, r30)
            goto L_0x003b
        L_0x0174:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r23 = r28.deserializePlayerTrackArray(r29, r30)
            goto L_0x003b
        L_0x017d:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r22 = r28.deserializePlayerSuppressions(r29, r30)
            goto L_0x003b
        L_0x0186:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r21 = r28.deserializePlayerRestrictions(r29, r30)
            goto L_0x003b
        L_0x018f:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptions r20 = r28.deserializePlayerOptions(r29, r30)
            goto L_0x003b
        L_0x0198:
            r29.nextValue()
            boolean r19 = r28._deserializeboolean(r29, r30)
            goto L_0x003b
        L_0x01a1:
            r29.nextValue()
            boolean r18 = r28._deserializeboolean(r29, r30)
            goto L_0x003b
        L_0x01aa:
            r29.nextValue()
            long r16 = r28._deserializelong(r29, r30)
            goto L_0x003b
        L_0x01b3:
            r29.nextValue()
            long r14 = r28._deserializelong(r29, r30)
            goto L_0x003b
        L_0x01bc:
            r29.nextValue()
            float r13 = r28._deserializefloat(r29, r30)
            goto L_0x003b
        L_0x01c5:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex r12 = r28.deserializePlayerContextIndex(r29, r30)
            goto L_0x003b
        L_0x01ce:
            r29.nextValue()
            java.lang.String r11 = r28.deserializeString(r29, r30)
            goto L_0x003b
        L_0x01d7:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r10 = r28.deserializePlayerTrack(r29, r30)
            goto L_0x003b
        L_0x01e0:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r9 = r28.deserializePlayOrigin(r29, r30)
            goto L_0x003b
        L_0x01e9:
            r29.nextValue()
            java.lang.String r8 = r28.deserializeString(r29, r30)
            goto L_0x003b
        L_0x01f2:
            r29.nextValue()
            long r6 = r28._deserializelong(r29, r30)
            goto L_0x003b
        L_0x01fb:
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerState
            r5 = r0
            r5 = r0
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.deserializePlayerState(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerState");
    }

    public final PlayerSuppressions deserializePlayerSuppressions(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Set set = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                if (currentName.hashCode() == -547571550 && currentName.equals("providers")) {
                    c = 0;
                }
                if (c != 0) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    set = deserializeSetString(jsonParser, deserializationContext);
                }
            }
        }
        return new PlayerSuppressions(set);
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
            r6 = r5
            r6 = r5
            r7 = r6
            r7 = r6
            r8 = r7
            r8 = r7
            r9 = r8
        L_0x0014:
            com.fasterxml.jackson.core.JsonToken r0 = r15.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00cb
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
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
                case -987494927: goto L_0x0075;
                case -450004177: goto L_0x0069;
                case 115792: goto L_0x005f;
                case 116076: goto L_0x0053;
                case 249799580: goto L_0x0047;
                case 630249588: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0081
        L_0x003d:
            java.lang.String r3 = "artist_uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0081
            r0 = 3
            goto L_0x0082
        L_0x0047:
            java.lang.String r3 = "lmuuoa_bi"
            java.lang.String r3 = "album_uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0081
            r0 = 2
            goto L_0x0082
        L_0x0053:
            java.lang.String r3 = "uri"
            java.lang.String r3 = "uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0081
            r0 = 0
            goto L_0x0082
        L_0x005f:
            java.lang.String r3 = "uid"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0081
            r0 = 1
            goto L_0x0082
        L_0x0069:
            java.lang.String r3 = "dtaetbma"
            java.lang.String r3 = "metadata"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0081
            r0 = 5
            goto L_0x0082
        L_0x0075:
            java.lang.String r3 = "rvpoerbd"
            java.lang.String r3 = "provider"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0081
            r0 = 4
            goto L_0x0082
        L_0x0081:
            r0 = -1
        L_0x0082:
            if (r0 == 0) goto L_0x00c2
            if (r0 == r1) goto L_0x00b9
            if (r0 == r13) goto L_0x00b0
            if (r0 == r12) goto L_0x00a7
            if (r0 == r11) goto L_0x009e
            if (r0 == r10) goto L_0x0095
            r15.nextValue()
            r15.skipChildren()
            goto L_0x0014
        L_0x0095:
            r15.nextValue()
            java.util.Map r9 = r14.deserializeMapStringString(r15, r16)
            goto L_0x0014
        L_0x009e:
            r15.nextValue()
            java.lang.String r8 = r14.deserializeString(r15, r16)
            goto L_0x0014
        L_0x00a7:
            r15.nextValue()
            java.lang.String r7 = r14.deserializeString(r15, r16)
            goto L_0x0014
        L_0x00b0:
            r15.nextValue()
            java.lang.String r6 = r14.deserializeString(r15, r16)
            goto L_0x0014
        L_0x00b9:
            r15.nextValue()
            java.lang.String r5 = r14.deserializeString(r15, r16)
            goto L_0x0014
        L_0x00c2:
            r15.nextValue()
            java.lang.String r4 = r14.deserializeString(r15, r16)
            goto L_0x0014
        L_0x00cb:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.deserializePlayerTrack(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
    }

    public final PlayerTrack[] deserializePlayerTrackArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            boolean z = true;
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
