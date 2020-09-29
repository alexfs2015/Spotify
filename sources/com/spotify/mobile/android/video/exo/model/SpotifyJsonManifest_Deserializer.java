package com.spotify.mobile.android.video.exo.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class SpotifyJsonManifest_Deserializer extends StdDeserializer<SpotifyJsonManifest> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest_Deserializer$1 reason: invalid class name */
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

    SpotifyJsonManifest_Deserializer() {
        super(SpotifyJsonManifest.class);
    }

    private static int a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    private static long b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Long) NumberDeserializers.find(Long.TYPE, "long").deserialize(jsonParser, deserializationContext)).longValue();
    }

    private Content d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Profile[] profileArr = null;
        EncryptionInfo[] encryptionInfoArr = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int i = 0;
                switch (currentName.hashCode()) {
                    case -1777030798:
                        if (currentName.equals("segment_length")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1357026668:
                        if (currentName.equals("end_time_millis")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1002263574:
                        if (currentName.equals("profiles")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -537414199:
                        if (currentName.equals("encryption_infos")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 700355483:
                        if (currentName.equals("start_time_millis")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    j = b(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    j2 = b(jsonParser, deserializationContext);
                } else if (c == 2) {
                    jsonParser.nextValue();
                    j3 = b(jsonParser, deserializationContext);
                } else if (c == 3) {
                    jsonParser.nextValue();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        profileArr = null;
                    } else {
                        LinkedList<Profile> linkedList = new LinkedList<>();
                        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                            linkedList.add(g(jsonParser, deserializationContext));
                        }
                        Profile[] profileArr2 = new Profile[linkedList.size()];
                        for (Profile profile : linkedList) {
                            int i2 = i + 1;
                            profileArr2[i] = profile;
                            i = i2;
                        }
                        profileArr = profileArr2;
                    }
                } else if (c != 4) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    encryptionInfoArr = f(jsonParser, deserializationContext);
                }
            }
        }
        Content content = new Content(j, j2, j3, profileArr, encryptionInfoArr);
        return content;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.video.exo.model.EncryptionInfo e(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
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
            int[] r1 = com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest_Deserializer.AnonymousClass1.a
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
            r6 = -433138970(0xffffffffe62ed2e6, float:-2.0639554E23)
            if (r5 == r6) goto L_0x0041
            r6 = 531413007(0x1facb80f, float:7.314933E-20)
            if (r5 == r6) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.String r5 = "key_system"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "encryption_data"
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
            com.spotify.mobile.android.video.exo.model.EncryptionInfo r8 = new com.spotify.mobile.android.video.exo.model.EncryptionInfo
            r8.<init>(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest_Deserializer.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.exo.model.EncryptionInfo");
    }

    private EncryptionInfo[] f(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<EncryptionInfo> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(e(jsonParser, deserializationContext));
        }
        int i = 0;
        EncryptionInfo[] encryptionInfoArr = new EncryptionInfo[linkedList.size()];
        for (EncryptionInfo encryptionInfo : linkedList) {
            int i2 = i + 1;
            encryptionInfoArr[i] = encryptionInfo;
            i = i2;
        }
        return encryptionInfoArr;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.video.exo.model.Profile g(com.fasterxml.jackson.core.JsonParser r19, com.fasterxml.jackson.databind.DeserializationContext r20) {
        /*
            r18 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r19.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = 0
            r3 = 0
            r5 = r0
            r8 = r2
            r13 = r8
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x001b:
            com.fasterxml.jackson.core.JsonToken r0 = r19.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x017b
            int[] r0 = com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r19.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0037
            r1 = r19
            r2 = r20
            goto L_0x001b
        L_0x0037:
            java.lang.String r0 = r19.getCurrentName()
            r2 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1316265955: goto L_0x00b8;
                case -537416426: goto L_0x00ad;
                case -324368021: goto L_0x00a3;
                case -196041627: goto L_0x0098;
                case -71359598: goto L_0x008d;
                case 3355: goto L_0x0083;
                case 258902020: goto L_0x0079;
                case 770070125: goto L_0x006f;
                case 1370685266: goto L_0x0065;
                case 1388977410: goto L_0x005b;
                case 1612033776: goto L_0x0050;
                case 1924434857: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x00c3
        L_0x0045:
            java.lang.String r4 = "video_bitrate"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00c3
            r0 = 1
            goto L_0x00c4
        L_0x0050:
            java.lang.String r1 = "video_resolution"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 3
            goto L_0x00c4
        L_0x005b:
            java.lang.String r1 = "video_width"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 4
            goto L_0x00c4
        L_0x0065:
            java.lang.String r1 = "video_codec"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 2
            goto L_0x00c4
        L_0x006f:
            java.lang.String r1 = "audio_codec"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 7
            goto L_0x00c4
        L_0x0079:
            java.lang.String r1 = "audio_bitrate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 6
            goto L_0x00c4
        L_0x0083:
            java.lang.String r1 = "id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 0
            goto L_0x00c4
        L_0x008d:
            java.lang.String r1 = "max_bitrate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 10
            goto L_0x00c4
        L_0x0098:
            java.lang.String r1 = "mime_type"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 8
            goto L_0x00c4
        L_0x00a3:
            java.lang.String r1 = "video_height"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 5
            goto L_0x00c4
        L_0x00ad:
            java.lang.String r1 = "encryption_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 11
            goto L_0x00c4
        L_0x00b8:
            java.lang.String r1 = "file_type"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = 9
            goto L_0x00c4
        L_0x00c3:
            r0 = -1
        L_0x00c4:
            switch(r0) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0161;
                case 2: goto L_0x0154;
                case 3: goto L_0x0147;
                case 4: goto L_0x013a;
                case 5: goto L_0x012d;
                case 6: goto L_0x0120;
                case 7: goto L_0x0113;
                case 8: goto L_0x0106;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00ec;
                case 11: goto L_0x00d3;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            r1 = r19
            r2 = r20
            r19.nextValue()
            r19.skipChildren()
            goto L_0x001b
        L_0x00d3:
            r19.nextValue()
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.String r1 = "java.lang.Integer"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r1)
            r1 = r19
            r2 = r20
            java.lang.Object r0 = r0.deserialize(r1, r2)
            r17 = r0
            java.lang.Integer r17 = (java.lang.Integer) r17
            goto L_0x001b
        L_0x00ec:
            r1 = r19
            r2 = r20
            r19.nextValue()
            java.lang.String r16 = r18.j(r19, r20)
            goto L_0x001b
        L_0x00f9:
            r1 = r19
            r2 = r20
            r19.nextValue()
            java.lang.String r15 = r18.j(r19, r20)
            goto L_0x001b
        L_0x0106:
            r1 = r19
            r2 = r20
            r19.nextValue()
            java.lang.String r14 = r18.j(r19, r20)
            goto L_0x001b
        L_0x0113:
            r1 = r19
            r2 = r20
            r19.nextValue()
            java.lang.String r13 = r18.j(r19, r20)
            goto L_0x001b
        L_0x0120:
            r1 = r19
            r2 = r20
            r19.nextValue()
            int r12 = a(r19, r20)
            goto L_0x001b
        L_0x012d:
            r1 = r19
            r2 = r20
            r19.nextValue()
            int r11 = a(r19, r20)
            goto L_0x001b
        L_0x013a:
            r1 = r19
            r2 = r20
            r19.nextValue()
            int r10 = a(r19, r20)
            goto L_0x001b
        L_0x0147:
            r1 = r19
            r2 = r20
            r19.nextValue()
            int r9 = a(r19, r20)
            goto L_0x001b
        L_0x0154:
            r1 = r19
            r2 = r20
            r19.nextValue()
            java.lang.String r8 = r18.j(r19, r20)
            goto L_0x001b
        L_0x0161:
            r1 = r19
            r2 = r20
            r19.nextValue()
            int r7 = a(r19, r20)
            goto L_0x001b
        L_0x016e:
            r1 = r19
            r2 = r20
            r19.nextValue()
            long r5 = b(r19, r20)
            goto L_0x001b
        L_0x017b:
            com.spotify.mobile.android.video.exo.model.Profile r0 = new com.spotify.mobile.android.video.exo.model.Profile
            r4 = r0
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest_Deserializer.g(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.exo.model.Profile");
    }

    private SpriteMap h(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 3355) {
                        if (hashCode == 113126854 && currentName.equals("width")) {
                            c = 2;
                        }
                    } else if (currentName.equals("id")) {
                        c = 0;
                    }
                } else if (currentName.equals("height")) {
                    c = 1;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    i = a(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    i2 = a(jsonParser, deserializationContext);
                } else if (c != 2) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i3 = a(jsonParser, deserializationContext);
                }
            }
        }
        return new SpriteMap(i, i2, i3);
    }

    private SpriteMap[] i(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<SpriteMap> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(h(jsonParser, deserializationContext));
        }
        int i = 0;
        SpriteMap[] spriteMapArr = new SpriteMap[linkedList.size()];
        for (SpriteMap spriteMap : linkedList) {
            int i2 = i + 1;
            spriteMapArr[i] = spriteMap;
            i = i2;
        }
        return spriteMapArr;
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
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest deserialize(com.fasterxml.jackson.core.JsonParser r21, com.fasterxml.jackson.databind.DeserializationContext r22) {
        /*
            r20 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x017b }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x017b }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = 0
            r5 = r0
            r7 = r5
            r4 = r2
            r9 = r4
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x001a:
            com.fasterxml.jackson.core.JsonToken r0 = r21.nextToken()     // Catch:{ RuntimeException -> 0x017b }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == r1) goto L_0x0174
            int[] r0 = com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x017b }
            com.fasterxml.jackson.core.JsonToken r1 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x017b }
            int r1 = r1.ordinal()     // Catch:{ RuntimeException -> 0x017b }
            r0 = r0[r1]     // Catch:{ RuntimeException -> 0x017b }
            r1 = 1
            if (r0 == r1) goto L_0x0032
            goto L_0x001a
        L_0x0032:
            java.lang.String r0 = r21.getCurrentName()     // Catch:{ RuntimeException -> 0x017b }
            r3 = -1
            int r18 = r0.hashCode()     // Catch:{ RuntimeException -> 0x017b }
            r19 = 0
            switch(r18) {
                case -1816382062: goto L_0x00b6;
                case -1632356039: goto L_0x00ac;
                case -1609915582: goto L_0x00a2;
                case -1587558394: goto L_0x0098;
                case -1357026668: goto L_0x008e;
                case -567321830: goto L_0x0084;
                case 700355483: goto L_0x007a;
                case 737033771: goto L_0x006f;
                case 1254673601: goto L_0x0064;
                case 1532436188: goto L_0x0059;
                case 1747489670: goto L_0x004d;
                case 2129082314: goto L_0x0042;
                default: goto L_0x0040;
            }     // Catch:{ RuntimeException -> 0x017b }
        L_0x0040:
            goto L_0x00c0
        L_0x0042:
            java.lang.String r1 = "spritemap_base_urls"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 7
            goto L_0x00c1
        L_0x004d:
            java.lang.String r1 = "subtitle_language_codes"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 10
            goto L_0x00c1
        L_0x0059:
            java.lang.String r1 = "spritemaps"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 9
            goto L_0x00c1
        L_0x0064:
            java.lang.String r1 = "subtitle_template"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 11
            goto L_0x00c1
        L_0x006f:
            java.lang.String r1 = "subtitle_base_urls"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 8
            goto L_0x00c1
        L_0x007a:
            java.lang.String r1 = "start_time_millis"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 1
            goto L_0x00c1
        L_0x0084:
            java.lang.String r1 = "contents"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 0
            goto L_0x00c1
        L_0x008e:
            java.lang.String r1 = "end_time_millis"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 2
            goto L_0x00c1
        L_0x0098:
            java.lang.String r1 = "segment_template"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 4
            goto L_0x00c1
        L_0x00a2:
            java.lang.String r1 = "spritemap_template"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 5
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r1 = "initialization_template"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 3
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r1 = "base_urls"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x00c0
            r1 = 6
            goto L_0x00c1
        L_0x00c0:
            r1 = -1
        L_0x00c1:
            switch(r1) {
                case 0: goto L_0x012c;
                case 1: goto L_0x0123;
                case 2: goto L_0x011a;
                case 3: goto L_0x0111;
                case 4: goto L_0x0108;
                case 5: goto L_0x00ff;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00ed;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00db;
                case 10: goto L_0x00d2;
                case 11: goto L_0x00c9;
                default: goto L_0x00c4;
            }     // Catch:{ RuntimeException -> 0x017b }
        L_0x00c4:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x016f
        L_0x00c9:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r17 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x00d2:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String[] r16 = r20.k(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x00db:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            com.spotify.mobile.android.video.exo.model.SpriteMap[] r15 = r20.i(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x00e4:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String[] r14 = r20.k(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x00ed:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String[] r13 = r20.k(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x00f6:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String[] r12 = r20.k(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x00ff:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r11 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x0108:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r10 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x0111:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r9 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x011a:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            long r7 = b(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x0123:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            long r5 = b(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x012c:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x017b }
            com.fasterxml.jackson.core.JsonToken r0 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x017b }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x017b }
            if (r0 != r1) goto L_0x013a
            r4 = r2
            goto L_0x001a
        L_0x013a:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x017b }
            r0.<init>()     // Catch:{ RuntimeException -> 0x017b }
        L_0x013f:
            com.fasterxml.jackson.core.JsonToken r1 = r21.nextToken()     // Catch:{ RuntimeException -> 0x017b }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x017b }
            if (r1 == r3) goto L_0x014f
            com.spotify.mobile.android.video.exo.model.Content r1 = r20.d(r21, r22)     // Catch:{ RuntimeException -> 0x017b }
            r0.add(r1)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x013f
        L_0x014f:
            int r1 = r0.size()     // Catch:{ RuntimeException -> 0x017b }
            com.spotify.mobile.android.video.exo.model.Content[] r1 = new com.spotify.mobile.android.video.exo.model.Content[r1]     // Catch:{ RuntimeException -> 0x017b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x017b }
        L_0x0159:
            boolean r3 = r0.hasNext()     // Catch:{ RuntimeException -> 0x017b }
            if (r3 == 0) goto L_0x016c
            java.lang.Object r3 = r0.next()     // Catch:{ RuntimeException -> 0x017b }
            com.spotify.mobile.android.video.exo.model.Content r3 = (com.spotify.mobile.android.video.exo.model.Content) r3     // Catch:{ RuntimeException -> 0x017b }
            int r4 = r19 + 1
            r1[r19] = r3     // Catch:{ RuntimeException -> 0x017b }
            r19 = r4
            goto L_0x0159
        L_0x016c:
            r4 = r1
            goto L_0x001a
        L_0x016f:
            r21.skipChildren()     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x001a
        L_0x0174:
            com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest r0 = new com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest     // Catch:{ RuntimeException -> 0x017b }
            r3 = r0
            r3.<init>(r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ RuntimeException -> 0x017b }
            return r0
        L_0x017b:
            r0 = move-exception
        L_0x017c:
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0187
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x017c
        L_0x0187:
            java.lang.String r1 = r0.getMessage()
            r2 = r22
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r2, r1, r0)
            goto L_0x0193
        L_0x0192:
            throw r0
        L_0x0193:
            goto L_0x0192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest");
    }
}
