package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import java.util.LinkedList;

public final class VideoPlayerCommand_Deserializer extends StdDeserializer<VideoPlayerCommand> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer$1 reason: invalid class name */
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

    VideoPlayerCommand_Deserializer() {
        super(VideoPlayerCommand.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    private static long b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Long) NumberDeserializers.find(Long.TYPE, "long").deserialize(jsonParser, deserializationContext)).longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.video.model.ContextPlayerConfiguration d(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
        /*
            r9 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r10.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
            r1 = r0
        L_0x000c:
            com.fasterxml.jackson.core.JsonToken r3 = r10.nextToken()
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r3 == r4) goto L_0x0098
            int[] r3 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r4 = r10.getCurrentToken()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x0024
            goto L_0x000c
        L_0x0024:
            java.lang.String r3 = r10.getCurrentName()
            r5 = -1
            int r6 = r3.hashCode()
            r7 = -1839419817(0xffffffff925cae57, float:-6.963465E-28)
            r8 = 2
            if (r6 == r7) goto L_0x0052
            r7 = -1357157764(0xffffffffaf1b6a7c, float:-1.4134999E-10)
            if (r6 == r7) goto L_0x0048
            r7 = -663387736(0xffffffffd87581a8, float:-1.07974887E15)
            if (r6 == r7) goto L_0x003e
            goto L_0x005c
        L_0x003e:
            java.lang.String r6 = "video.subtitles"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 0
            goto L_0x005d
        L_0x0048:
            java.lang.String r6 = "audio.episode.speed"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 2
            goto L_0x005d
        L_0x0052:
            java.lang.String r6 = "video.subtitles_cc"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x005c:
            r3 = -1
        L_0x005d:
            if (r3 == 0) goto L_0x008f
            if (r3 == r4) goto L_0x007c
            if (r3 == r8) goto L_0x006a
            r10.nextValue()
            r10.skipChildren()
            goto L_0x000c
        L_0x006a:
            r10.nextValue()
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r3 = "java.lang.Float"
            com.fasterxml.jackson.databind.JsonDeserializer r1 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r1, r3)
            java.lang.Object r1 = r1.deserialize(r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
            goto L_0x000c
        L_0x007c:
            r10.nextValue()
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.String r3 = "java.lang.Boolean"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r3)
            java.lang.Object r0 = r0.deserialize(r10, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x000c
        L_0x008f:
            r10.nextValue()
            java.lang.String r2 = r9.i(r10, r11)
            goto L_0x000c
        L_0x0098:
            com.spotify.mobile.android.video.model.ContextPlayerConfiguration r10 = new com.spotify.mobile.android.video.model.ContextPlayerConfiguration
            r10.<init>(r2, r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.model.ContextPlayerConfiguration");
    }

    private LoggingParameters e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        long j = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                if (currentName.hashCode() == 132896021 && currentName.equals("command_initiated_time")) {
                    c = 0;
                }
                if (c != 0) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    j = b(jsonParser, deserializationContext);
                }
            }
        }
        return LoggingParameters.createWithCustomTimestamp(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r0.equals("feature_version") != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.cosmos.player.v2.PlayOrigin f(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14) {
        /*
            r12 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()
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
            com.fasterxml.jackson.core.JsonToken r0 = r13.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00e2
            int[] r0 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r13.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0029
            goto L_0x0011
        L_0x0029:
            java.lang.String r0 = r13.getCurrentName()
            r3 = -1
            int r11 = r0.hashCode()
            switch(r11) {
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
            java.lang.String r11 = "feature_version"
            boolean r0 = r0.equals(r11)
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
                case 0: goto L_0x00d9;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00be;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0086;
                default: goto L_0x007f;
            }
        L_0x007f:
            r13.nextValue()
            r13.skipChildren()
            goto L_0x0011
        L_0x0086:
            r13.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x0094
            r10 = r2
            goto L_0x0011
        L_0x0094:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L_0x0099:
            com.fasterxml.jackson.core.JsonToken r1 = r13.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r1 == r3) goto L_0x00a9
            java.lang.String r1 = r12.i(r13, r14)
            r0.add(r1)
            goto L_0x0099
        L_0x00a9:
            r10 = r0
            goto L_0x0011
        L_0x00ac:
            r13.nextValue()
            java.lang.String r9 = r12.i(r13, r14)
            goto L_0x0011
        L_0x00b5:
            r13.nextValue()
            java.lang.String r8 = r12.i(r13, r14)
            goto L_0x0011
        L_0x00be:
            r13.nextValue()
            java.lang.String r7 = r12.i(r13, r14)
            goto L_0x0011
        L_0x00c7:
            r13.nextValue()
            java.lang.String r6 = r12.i(r13, r14)
            goto L_0x0011
        L_0x00d0:
            r13.nextValue()
            java.lang.String r5 = r12.i(r13, r14)
            goto L_0x0011
        L_0x00d9:
            r13.nextValue()
            java.lang.String r4 = r12.i(r13, r14)
            goto L_0x0011
        L_0x00e2:
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r13 = new com.spotify.mobile.android.cosmos.player.v2.PlayOrigin
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayOrigin");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.cosmos.player.v2.PlayerTrack g(com.fasterxml.jackson.core.JsonParser r16, com.fasterxml.jackson.databind.DeserializationContext r17) {
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
            int[] r0 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
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
            java.lang.String r1 = r15.i(r16, r17)
            r16.nextValue()
            java.lang.String r3 = r15.i(r16, r17)
            r0.put(r1, r3)
            goto L_0x009c
        L_0x00b3:
            r9 = r0
            goto L_0x0010
        L_0x00b6:
            r16.nextValue()
            java.lang.String r8 = r15.i(r16, r17)
            goto L_0x0010
        L_0x00bf:
            r16.nextValue()
            java.lang.String r7 = r15.i(r16, r17)
            goto L_0x0010
        L_0x00c8:
            r16.nextValue()
            java.lang.String r6 = r15.i(r16, r17)
            goto L_0x0010
        L_0x00d1:
            r16.nextValue()
            java.lang.String r5 = r15.i(r16, r17)
            goto L_0x0010
        L_0x00da:
            r16.nextValue()
            java.lang.String r4 = r15.i(r16, r17)
            goto L_0x0010
        L_0x00e3:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.g(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
    }

    private PlayerTrack[] h(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<PlayerTrack> linkedList = new LinkedList<>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(g(jsonParser, deserializationContext));
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

    private String i(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.video.model.TrackWithPlayOrigin j(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12) {
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
            int[] r4 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
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
                case -541598063: goto L_0x0052;
                case -102516004: goto L_0x0048;
                case 110621003: goto L_0x003e;
                case 1706303935: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x005c
        L_0x0034:
            java.lang.String r7 = "playback_id"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 2
            goto L_0x005d
        L_0x003e:
            java.lang.String r7 = "track"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 0
            goto L_0x005d
        L_0x0048:
            java.lang.String r7 = "context_uri"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 3
            goto L_0x005d
        L_0x0052:
            java.lang.String r7 = "play_origin"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 1
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
            java.lang.String r3 = r10.i(r11, r12)
            goto L_0x000d
        L_0x0074:
            r11.nextValue()
            java.lang.String r1 = r10.i(r11, r12)
            goto L_0x000d
        L_0x007c:
            r11.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r0 = r10.f(r11, r12)
            goto L_0x000d
        L_0x0084:
            r11.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = r10.g(r11, r12)
            goto L_0x000d
        L_0x008c:
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r11 = new com.spotify.mobile.android.video.model.TrackWithPlayOrigin
            r11.<init>(r2, r0, r1, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.j(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.model.TrackWithPlayOrigin");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.video.model.VideoPlayerCommand deserialize(com.fasterxml.jackson.core.JsonParser r21, com.fasterxml.jackson.databind.DeserializationContext r22) {
        /*
            r20 = this;
            r1 = r22
            com.fasterxml.jackson.core.JsonToken r0 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x018c }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x018c }
            r3 = 0
            if (r0 != r2) goto L_0x000c
            return r3
        L_0x000c:
            r4 = 0
            r0 = 0
            r7 = r3
            r10 = r7
            r11 = r10
            r14 = r11
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r8 = r4
            r12 = 0
            r13 = 0
        L_0x001d:
            com.fasterxml.jackson.core.JsonToken r2 = r21.nextToken()     // Catch:{ RuntimeException -> 0x018c }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == r4) goto L_0x0185
            int[] r2 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x018c }
            com.fasterxml.jackson.core.JsonToken r4 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x018c }
            int r4 = r4.ordinal()     // Catch:{ RuntimeException -> 0x018c }
            r2 = r2[r4]     // Catch:{ RuntimeException -> 0x018c }
            r4 = 1
            if (r2 == r4) goto L_0x0037
            r4 = r21
            goto L_0x001d
        L_0x0037:
            java.lang.String r2 = r21.getCurrentName()     // Catch:{ RuntimeException -> 0x018c }
            r5 = -1
            int r6 = r2.hashCode()     // Catch:{ RuntimeException -> 0x018c }
            switch(r6) {
                case -2040777380: goto L_0x00ad;
                case -1354792126: goto L_0x00a2;
                case -1263170109: goto L_0x0098;
                case -865716088: goto L_0x008d;
                case -837193114: goto L_0x0083;
                case -25593663: goto L_0x0079;
                case 3575610: goto L_0x006f;
                case 110621003: goto L_0x0065;
                case 747804969: goto L_0x005a;
                case 1578925787: goto L_0x0050;
                case 1971810722: goto L_0x0045;
                default: goto L_0x0043;
            }     // Catch:{ RuntimeException -> 0x018c }
        L_0x0043:
            goto L_0x00b7
        L_0x0045:
            java.lang.String r6 = "seek_to"
            boolean r2 = r2.equals(r6)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x0050:
            java.lang.String r4 = "system_initiated"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 5
            goto L_0x00b8
        L_0x005a:
            java.lang.String r4 = "position"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 9
            goto L_0x00b8
        L_0x0065:
            java.lang.String r4 = "track"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 2
            goto L_0x00b8
        L_0x006f:
            java.lang.String r4 = "type"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 0
            goto L_0x00b8
        L_0x0079:
            java.lang.String r4 = "start_reason"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 6
            goto L_0x00b8
        L_0x0083:
            java.lang.String r4 = "logging_params"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 7
            goto L_0x00b8
        L_0x008d:
            java.lang.String r4 = "tracks"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 8
            goto L_0x00b8
        L_0x0098:
            java.lang.String r4 = "future"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 3
            goto L_0x00b8
        L_0x00a2:
            java.lang.String r4 = "config"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 10
            goto L_0x00b8
        L_0x00ad:
            java.lang.String r4 = "initially_paused"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x018c }
            if (r2 == 0) goto L_0x00b7
            r2 = 4
            goto L_0x00b8
        L_0x00b7:
            r2 = -1
        L_0x00b8:
            switch(r2) {
                case 0: goto L_0x0175;
                case 1: goto L_0x016a;
                case 2: goto L_0x015f;
                case 3: goto L_0x0119;
                case 4: goto L_0x010e;
                case 5: goto L_0x0103;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00ed;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00c2;
                default: goto L_0x00bb;
            }     // Catch:{ RuntimeException -> 0x018c }
        L_0x00bb:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x0180
        L_0x00c2:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            com.spotify.mobile.android.video.model.ContextPlayerConfiguration r18 = r20.d(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x00cb:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r4 = "java.lang.Long"
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r2, r4)     // Catch:{ RuntimeException -> 0x018c }
            r4 = r21
            java.lang.Object r2 = r2.deserialize(r4, r1)     // Catch:{ RuntimeException -> 0x018c }
            r17 = r2
            java.lang.Long r17 = (java.lang.Long) r17     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x00e2:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r16 = r20.h(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x00ed:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters r15 = r20.e(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x00f8:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            java.lang.String r14 = r20.i(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x0103:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            boolean r13 = a(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x010e:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            boolean r12 = a(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x0119:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            com.fasterxml.jackson.core.JsonToken r2 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x018c }
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x018c }
            if (r2 != r5) goto L_0x0129
            r11 = r3
            goto L_0x001d
        L_0x0129:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x018c }
            r2.<init>()     // Catch:{ RuntimeException -> 0x018c }
        L_0x012e:
            com.fasterxml.jackson.core.JsonToken r5 = r21.nextToken()     // Catch:{ RuntimeException -> 0x018c }
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x018c }
            if (r5 == r6) goto L_0x013e
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r5 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            r2.add(r5)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x012e
        L_0x013e:
            int r5 = r2.size()     // Catch:{ RuntimeException -> 0x018c }
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin[] r5 = new com.spotify.mobile.android.video.model.TrackWithPlayOrigin[r5]     // Catch:{ RuntimeException -> 0x018c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ RuntimeException -> 0x018c }
            r6 = 0
        L_0x0149:
            boolean r11 = r2.hasNext()     // Catch:{ RuntimeException -> 0x018c }
            if (r11 == 0) goto L_0x015c
            java.lang.Object r11 = r2.next()     // Catch:{ RuntimeException -> 0x018c }
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r11 = (com.spotify.mobile.android.video.model.TrackWithPlayOrigin) r11     // Catch:{ RuntimeException -> 0x018c }
            int r19 = r6 + 1
            r5[r6] = r11     // Catch:{ RuntimeException -> 0x018c }
            r6 = r19
            goto L_0x0149
        L_0x015c:
            r11 = r5
            goto L_0x001d
        L_0x015f:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r10 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x016a:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            long r8 = b(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x0175:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x018c }
            java.lang.String r7 = r20.i(r21, r22)     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x0180:
            r21.skipChildren()     // Catch:{ RuntimeException -> 0x018c }
            goto L_0x001d
        L_0x0185:
            com.spotify.mobile.android.video.model.VideoPlayerCommand r0 = new com.spotify.mobile.android.video.model.VideoPlayerCommand     // Catch:{ RuntimeException -> 0x018c }
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ RuntimeException -> 0x018c }
            return r0
        L_0x018c:
            r0 = move-exception
        L_0x018d:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x0198
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x018d
        L_0x0198:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x01a2
        L_0x01a1:
            throw r0
        L_0x01a2:
            goto L_0x01a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.model.VideoPlayerCommand");
    }
}
