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

    public final boolean isCachable() {
        return true;
    }

    PlayerState_Deserializer() {
        super(PlayerState.class);
    }

    public final boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    public final float _deserializefloat(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Float) NumberDeserializers.find(Float.TYPE, "float").deserialize(jsonParser, deserializationContext)).floatValue();
    }

    public final int _deserializeint(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    public final long _deserializelong(JsonParser jsonParser, DeserializationContext deserializationContext) {
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
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            return AudioStream.fromString(jsonParser.getText());
        }
        return (AudioStream) deserializationContext.handleUnexpectedToken(AudioStream.class, jsonParser);
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r0.equals("feature_version") != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.cosmos.player.v2.PlayOrigin deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r12.getCurrentToken()
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
        L_0x0011:
            com.fasterxml.jackson.core.JsonToken r0 = r12.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00c4
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r1 = r12.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0029
            goto L_0x0011
        L_0x0029:
            java.lang.String r0 = r12.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -1358351982: goto L_0x0071;
                case -1238715854: goto L_0x0067;
                case -1144002417: goto L_0x005e;
                case -641989667: goto L_0x0054;
                case 1006001683: goto L_0x004a;
                case 1163267273: goto L_0x0040;
                case 1196184786: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x007b
        L_0x0036:
            java.lang.String r1 = "view_uri"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 2
            goto L_0x007c
        L_0x0040:
            java.lang.String r1 = "referrer_identifier"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 4
            goto L_0x007c
        L_0x004a:
            java.lang.String r1 = "external_referrer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 3
            goto L_0x007c
        L_0x0054:
            java.lang.String r1 = "feature_classes"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 6
            goto L_0x007c
        L_0x005e:
            java.lang.String r3 = "feature_version"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007b
            goto L_0x007c
        L_0x0067:
            java.lang.String r1 = "device_identifier"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 5
            goto L_0x007c
        L_0x0071:
            java.lang.String r1 = "feature_identifier"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 0
            goto L_0x007c
        L_0x007b:
            r1 = -1
        L_0x007c:
            switch(r1) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a0;
                case 4: goto L_0x0097;
                case 5: goto L_0x008e;
                case 6: goto L_0x0086;
                default: goto L_0x007f;
            }
        L_0x007f:
            r12.nextValue()
            r12.skipChildren()
            goto L_0x0011
        L_0x0086:
            r12.nextValue()
            java.util.Set r10 = r11.deserializeSetString(r12, r13)
            goto L_0x0011
        L_0x008e:
            r12.nextValue()
            java.lang.String r9 = r11.deserializeString(r12, r13)
            goto L_0x0011
        L_0x0097:
            r12.nextValue()
            java.lang.String r8 = r11.deserializeString(r12, r13)
            goto L_0x0011
        L_0x00a0:
            r12.nextValue()
            java.lang.String r7 = r11.deserializeString(r12, r13)
            goto L_0x0011
        L_0x00a9:
            r12.nextValue()
            java.lang.String r6 = r11.deserializeString(r12, r13)
            goto L_0x0011
        L_0x00b2:
            r12.nextValue()
            java.lang.String r5 = r11.deserializeString(r12, r13)
            goto L_0x0011
        L_0x00bb:
            r12.nextValue()
            java.lang.String r4 = r11.deserializeString(r12, r13)
            goto L_0x0011
        L_0x00c4:
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r12 = new com.spotify.mobile.android.cosmos.player.v2.PlayOrigin
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayOrigin");
    }

    public final PlayerContextIndex deserializePlayerContextIndex(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != 3433103) {
                    if (hashCode == 110621003 && currentName.equals(TrackData.TYPE_TRACK)) {
                        c = 1;
                    }
                } else if (currentName.equals("page")) {
                    c = 0;
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
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1459599913) {
                    if (hashCode != -1400336410) {
                        if (hashCode == 45542259 && currentName.equals("repeating_track")) {
                            c = 2;
                        }
                    } else if (currentName.equals("shuffling_context")) {
                        c = 0;
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
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
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
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r20 = r12
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r6 = r3
            r14 = r6
            r16 = r14
            r13 = 0
            r18 = 0
            r19 = 0
        L_0x002c:
            com.fasterxml.jackson.core.JsonToken r0 = r29.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r2) goto L_0x01dc
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r2 = r29.getCurrentToken()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L_0x0044
            goto L_0x002c
        L_0x0044:
            java.lang.String r0 = r29.getCurrentName()
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1992012396: goto L_0x011a;
                case -1434528759: goto L_0x010f;
                case -1263170109: goto L_0x0104;
                case -1249474914: goto L_0x00f9;
                case -1148295641: goto L_0x00ee;
                case -1034196033: goto L_0x00e3;
                case -541598063: goto L_0x00d9;
                case -531282461: goto L_0x00ce;
                case -102516004: goto L_0x00c4;
                case 55126294: goto L_0x00b9;
                case 100346066: goto L_0x00ae;
                case 110621003: goto L_0x00a3;
                case 725855648: goto L_0x0097;
                case 1006746137: goto L_0x008b;
                case 1099846370: goto L_0x007f;
                case 1202375813: goto L_0x0074;
                case 1572272419: goto L_0x0069;
                case 1706303935: goto L_0x005e;
                case 1999813343: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0125
        L_0x0052:
            java.lang.String r2 = "page_metadata"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 17
            goto L_0x0126
        L_0x005e:
            java.lang.String r2 = "playback_id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 4
            goto L_0x0126
        L_0x0069:
            java.lang.String r2 = "playback_speed"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 6
            goto L_0x0126
        L_0x0074:
            java.lang.String r2 = "position_as_of_timestamp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 7
            goto L_0x0126
        L_0x007f:
            java.lang.String r2 = "reverse"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 15
            goto L_0x0126
        L_0x008b:
            java.lang.String r2 = "is_playing"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 9
            goto L_0x0126
        L_0x0097:
            java.lang.String r2 = "suppressions"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 13
            goto L_0x0126
        L_0x00a3:
            java.lang.String r2 = "track"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 3
            goto L_0x0126
        L_0x00ae:
            java.lang.String r2 = "index"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 5
            goto L_0x0126
        L_0x00b9:
            java.lang.String r2 = "timestamp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 0
            goto L_0x0126
        L_0x00c4:
            java.lang.String r4 = "context_uri"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0125
            r0 = 1
            goto L_0x0126
        L_0x00ce:
            java.lang.String r2 = "is_paused"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 10
            goto L_0x0126
        L_0x00d9:
            java.lang.String r2 = "play_origin"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 2
            goto L_0x0126
        L_0x00e3:
            java.lang.String r2 = "context_metadata"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 16
            goto L_0x0126
        L_0x00ee:
            java.lang.String r2 = "restrictions"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 12
            goto L_0x0126
        L_0x00f9:
            java.lang.String r2 = "options"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 11
            goto L_0x0126
        L_0x0104:
            java.lang.String r2 = "future"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 14
            goto L_0x0126
        L_0x010f:
            java.lang.String r2 = "audio_stream"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 18
            goto L_0x0126
        L_0x011a:
            java.lang.String r2 = "duration"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0125
            r0 = 8
            goto L_0x0126
        L_0x0125:
            r0 = -1
        L_0x0126:
            switch(r0) {
                case 0: goto L_0x01d3;
                case 1: goto L_0x01ca;
                case 2: goto L_0x01c1;
                case 3: goto L_0x01b8;
                case 4: goto L_0x01af;
                case 5: goto L_0x01a6;
                case 6: goto L_0x019d;
                case 7: goto L_0x0194;
                case 8: goto L_0x018b;
                case 9: goto L_0x0182;
                case 10: goto L_0x0179;
                case 11: goto L_0x0170;
                case 12: goto L_0x0167;
                case 13: goto L_0x015e;
                case 14: goto L_0x0155;
                case 15: goto L_0x014c;
                case 16: goto L_0x0143;
                case 17: goto L_0x013a;
                case 18: goto L_0x0131;
                default: goto L_0x0129;
            }
        L_0x0129:
            r29.nextValue()
            r29.skipChildren()
            goto L_0x002c
        L_0x0131:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r27 = r28.deserializeAudioStreamEnum(r29, r30)
            goto L_0x002c
        L_0x013a:
            r29.nextValue()
            java.util.Map r26 = r28.deserializeMapStringString(r29, r30)
            goto L_0x002c
        L_0x0143:
            r29.nextValue()
            java.util.Map r25 = r28.deserializeMapStringString(r29, r30)
            goto L_0x002c
        L_0x014c:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r24 = r28.deserializePlayerTrackArray(r29, r30)
            goto L_0x002c
        L_0x0155:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r23 = r28.deserializePlayerTrackArray(r29, r30)
            goto L_0x002c
        L_0x015e:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r22 = r28.deserializePlayerSuppressions(r29, r30)
            goto L_0x002c
        L_0x0167:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r21 = r28.deserializePlayerRestrictions(r29, r30)
            goto L_0x002c
        L_0x0170:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptions r20 = r28.deserializePlayerOptions(r29, r30)
            goto L_0x002c
        L_0x0179:
            r29.nextValue()
            boolean r19 = r28._deserializeboolean(r29, r30)
            goto L_0x002c
        L_0x0182:
            r29.nextValue()
            boolean r18 = r28._deserializeboolean(r29, r30)
            goto L_0x002c
        L_0x018b:
            r29.nextValue()
            long r16 = r28._deserializelong(r29, r30)
            goto L_0x002c
        L_0x0194:
            r29.nextValue()
            long r14 = r28._deserializelong(r29, r30)
            goto L_0x002c
        L_0x019d:
            r29.nextValue()
            float r13 = r28._deserializefloat(r29, r30)
            goto L_0x002c
        L_0x01a6:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex r12 = r28.deserializePlayerContextIndex(r29, r30)
            goto L_0x002c
        L_0x01af:
            r29.nextValue()
            java.lang.String r11 = r28.deserializeString(r29, r30)
            goto L_0x002c
        L_0x01b8:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r10 = r28.deserializePlayerTrack(r29, r30)
            goto L_0x002c
        L_0x01c1:
            r29.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r9 = r28.deserializePlayOrigin(r29, r30)
            goto L_0x002c
        L_0x01ca:
            r29.nextValue()
            java.lang.String r8 = r28.deserializeString(r29, r30)
            goto L_0x002c
        L_0x01d3:
            r29.nextValue()
            long r6 = r28._deserializelong(r29, r30)
            goto L_0x002c
        L_0x01dc:
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerState
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
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0010:
            com.fasterxml.jackson.core.JsonToken r0 = r15.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00bf
            int[] r0 = com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
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
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerState_Deserializer.deserializePlayerTrack(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
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
