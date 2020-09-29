package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.LinkedList;

public final class RadioStationTracksModel_Deserializer extends StdDeserializer<RadioStationTracksModel> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.spotlets.radio.model.RadioStationTracksModel_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    RadioStationTracksModel_Deserializer() {
        super(RadioStationTracksModel.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public RadioStationTracksModel deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            PlayerTrack[] playerTrackArr = null;
            String str = null;
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                    String currentName = jsonParser.getCurrentName();
                    char c = 65535;
                    int hashCode = currentName.hashCode();
                    int i = 0;
                    if (hashCode != -865716088) {
                        if (hashCode == 981647243) {
                            if (currentName.equals("next_page_url")) {
                                c = 1;
                            }
                        }
                    } else if (currentName.equals("tracks")) {
                        c = 0;
                    }
                    if (c == 0) {
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            playerTrackArr = null;
                        } else {
                            LinkedList<PlayerTrack> linkedList = new LinkedList<>();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                linkedList.add(b(jsonParser, deserializationContext));
                            }
                            PlayerTrack[] playerTrackArr2 = new PlayerTrack[linkedList.size()];
                            for (PlayerTrack playerTrack : linkedList) {
                                int i2 = i + 1;
                                playerTrackArr2[i] = playerTrack;
                                i = i2;
                            }
                            playerTrackArr = playerTrackArr2;
                        }
                    } else if (c != 1) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        str = c(jsonParser, deserializationContext);
                    }
                }
            }
            return new RadioStationTracksModel(playerTrackArr, str);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
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
            int[] r0 = com.spotify.music.spotlets.radio.model.RadioStationTracksModel_Deserializer.AnonymousClass1.a
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
            java.lang.String r1 = r15.c(r16, r17)
            r16.nextValue()
            java.lang.String r3 = r15.c(r16, r17)
            r0.put(r1, r3)
            goto L_0x009c
        L_0x00b3:
            r9 = r0
            goto L_0x0010
        L_0x00b6:
            r16.nextValue()
            java.lang.String r8 = r15.c(r16, r17)
            goto L_0x0010
        L_0x00bf:
            r16.nextValue()
            java.lang.String r7 = r15.c(r16, r17)
            goto L_0x0010
        L_0x00c8:
            r16.nextValue()
            java.lang.String r6 = r15.c(r16, r17)
            goto L_0x0010
        L_0x00d1:
            r16.nextValue()
            java.lang.String r5 = r15.c(r16, r17)
            goto L_0x0010
        L_0x00da:
            r16.nextValue()
            java.lang.String r4 = r15.c(r16, r17)
            goto L_0x0010
        L_0x00e3:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.RadioStationTracksModel_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
    }

    private String c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    public final boolean isCachable() {
        return true;
    }
}
