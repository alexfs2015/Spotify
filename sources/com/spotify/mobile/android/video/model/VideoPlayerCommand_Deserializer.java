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

    VideoPlayerCommand_Deserializer() {
        super(VideoPlayerCommand.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = "oeslaob";
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    private static long b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Long) NumberDeserializers.find(Long.TYPE, "long").deserialize(jsonParser, deserializationContext)).longValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.video.model.VideoPlayerCommand deserialize(com.fasterxml.jackson.core.JsonParser r21, com.fasterxml.jackson.databind.DeserializationContext r22) {
        /*
            r20 = this;
            r1 = r22
            com.fasterxml.jackson.core.JsonToken r0 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x01b7 }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01b7 }
            r3 = 0
            if (r0 != r2) goto L_0x000c
            return r3
        L_0x000c:
            r4 = 0
            r0 = 0
            r7 = r3
            r7 = r3
            r10 = r7
            r11 = r10
            r11 = r10
            r14 = r11
            r14 = r11
            r15 = r14
            r15 = r14
            r16 = r15
            r16 = r15
            r17 = r16
            r17 = r16
            r18 = r17
            r18 = r17
            r8 = r4
            r12 = 0
            r13 = 0
        L_0x0027:
            com.fasterxml.jackson.core.JsonToken r2 = r21.nextToken()     // Catch:{ RuntimeException -> 0x01b7 }
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == r4) goto L_0x01af
            int[] r2 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x01b7 }
            com.fasterxml.jackson.core.JsonToken r4 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x01b7 }
            int r4 = r4.ordinal()     // Catch:{ RuntimeException -> 0x01b7 }
            r2 = r2[r4]     // Catch:{ RuntimeException -> 0x01b7 }
            r4 = 1
            if (r2 == r4) goto L_0x0043
            r4 = r21
            r4 = r21
            goto L_0x0027
        L_0x0043:
            java.lang.String r2 = r21.getCurrentName()     // Catch:{ RuntimeException -> 0x01b7 }
            r5 = -1
            int r6 = r2.hashCode()     // Catch:{ RuntimeException -> 0x01b7 }
            switch(r6) {
                case -2040777380: goto L_0x00bf;
                case -1354792126: goto L_0x00b4;
                case -1263170109: goto L_0x00aa;
                case -865716088: goto L_0x009f;
                case -837193114: goto L_0x0093;
                case -25593663: goto L_0x0087;
                case 3575610: goto L_0x007b;
                case 110621003: goto L_0x0071;
                case 747804969: goto L_0x0066;
                case 1578925787: goto L_0x005c;
                case 1971810722: goto L_0x0051;
                default: goto L_0x004f;
            }     // Catch:{ RuntimeException -> 0x01b7 }
        L_0x004f:
            goto L_0x00cb
        L_0x0051:
            java.lang.String r6 = "seek_to"
            boolean r2 = r2.equals(r6)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 1
            goto L_0x00cc
        L_0x005c:
            java.lang.String r4 = "system_initiated"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 5
            goto L_0x00cc
        L_0x0066:
            java.lang.String r4 = "position"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 9
            goto L_0x00cc
        L_0x0071:
            java.lang.String r4 = "track"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 2
            goto L_0x00cc
        L_0x007b:
            java.lang.String r4 = "ptye"
            java.lang.String r4 = "type"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 0
            goto L_0x00cc
        L_0x0087:
            java.lang.String r4 = "tsrmaerton_s"
            java.lang.String r4 = "start_reason"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 6
            goto L_0x00cc
        L_0x0093:
            java.lang.String r4 = "lrmgooign_asag"
            java.lang.String r4 = "logging_params"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 7
            goto L_0x00cc
        L_0x009f:
            java.lang.String r4 = "tracks"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 8
            goto L_0x00cc
        L_0x00aa:
            java.lang.String r4 = "future"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 3
            goto L_0x00cc
        L_0x00b4:
            java.lang.String r4 = "config"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 10
            goto L_0x00cc
        L_0x00bf:
            java.lang.String r4 = "pnteybialsadliui"
            java.lang.String r4 = "initially_paused"
            boolean r2 = r2.equals(r4)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x00cb
            r2 = 4
            goto L_0x00cc
        L_0x00cb:
            r2 = -1
        L_0x00cc:
            switch(r2) {
                case 0: goto L_0x019d;
                case 1: goto L_0x0190;
                case 2: goto L_0x0185;
                case 3: goto L_0x013b;
                case 4: goto L_0x012e;
                case 5: goto L_0x0123;
                case 6: goto L_0x0116;
                case 7: goto L_0x0109;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00df;
                case 10: goto L_0x00d6;
                default: goto L_0x00cf;
            }     // Catch:{ RuntimeException -> 0x01b7 }
        L_0x00cf:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x01aa
        L_0x00d6:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            com.spotify.mobile.android.video.model.ContextPlayerConfiguration r18 = r20.d(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x00df:
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r4 = "naanvgb.aLjo.l"
            java.lang.String r4 = "java.lang.Long"
            com.fasterxml.jackson.databind.JsonDeserializer r2 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r2, r4)     // Catch:{ RuntimeException -> 0x01b7 }
            r4 = r21
            r4 = r21
            java.lang.Object r2 = r2.deserialize(r4, r1)     // Catch:{ RuntimeException -> 0x01b7 }
            r17 = r2
            r17 = r2
            java.lang.Long r17 = (java.lang.Long) r17     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x00fc:
            r4 = r21
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r16 = r20.h(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x0109:
            r4 = r21
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters r15 = r20.e(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x0116:
            r4 = r21
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r14 = r20.i(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x0123:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            boolean r13 = a(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x012e:
            r4 = r21
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            boolean r12 = a(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x013b:
            r4 = r21
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            com.fasterxml.jackson.core.JsonToken r2 = r21.getCurrentToken()     // Catch:{ RuntimeException -> 0x01b7 }
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 != r5) goto L_0x014e
            r11 = r3
            r11 = r3
            goto L_0x0027
        L_0x014e:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x01b7 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x01b7 }
        L_0x0153:
            com.fasterxml.jackson.core.JsonToken r5 = r21.nextToken()     // Catch:{ RuntimeException -> 0x01b7 }
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x01b7 }
            if (r5 == r6) goto L_0x0163
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r5 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            r2.add(r5)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0153
        L_0x0163:
            int r5 = r2.size()     // Catch:{ RuntimeException -> 0x01b7 }
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin[] r5 = new com.spotify.mobile.android.video.model.TrackWithPlayOrigin[r5]     // Catch:{ RuntimeException -> 0x01b7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ RuntimeException -> 0x01b7 }
            r6 = 0
        L_0x016e:
            boolean r11 = r2.hasNext()     // Catch:{ RuntimeException -> 0x01b7 }
            if (r11 == 0) goto L_0x0181
            java.lang.Object r11 = r2.next()     // Catch:{ RuntimeException -> 0x01b7 }
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r11 = (com.spotify.mobile.android.video.model.TrackWithPlayOrigin) r11     // Catch:{ RuntimeException -> 0x01b7 }
            int r19 = r6 + 1
            r5[r6] = r11     // Catch:{ RuntimeException -> 0x01b7 }
            r6 = r19
            goto L_0x016e
        L_0x0181:
            r11 = r5
            r11 = r5
            goto L_0x0027
        L_0x0185:
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r10 = r20.j(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x0190:
            r4 = r21
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            long r8 = b(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x019d:
            r4 = r21
            r4 = r21
            r21.nextValue()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r7 = r20.i(r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x01aa:
            r21.skipChildren()     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x0027
        L_0x01af:
            com.spotify.mobile.android.video.model.VideoPlayerCommand r0 = new com.spotify.mobile.android.video.model.VideoPlayerCommand     // Catch:{ RuntimeException -> 0x01b7 }
            r6 = r0
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ RuntimeException -> 0x01b7 }
            return r0
        L_0x01b7:
            r0 = move-exception
        L_0x01b8:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x01c3
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x01b8
        L_0x01c3:
            java.lang.String r2 = r0.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r1, r2, r0)
            goto L_0x01cd
        L_0x01cc:
            throw r0
        L_0x01cd:
            goto L_0x01cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.model.VideoPlayerCommand");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.video.model.ContextPlayerConfiguration d(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r11.getCurrentToken()
            r9 = 3
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r9 = 6
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r9 = 6
            return r2
        L_0x000d:
            r0 = r2
            r0 = r2
            r1 = r0
        L_0x0010:
            r9 = 6
            com.fasterxml.jackson.core.JsonToken r3 = r11.nextToken()
            r9 = 1
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r9 = 7
            if (r3 == r4) goto L_0x00cf
            int[] r3 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r4 = r11.getCurrentToken()
            r9 = 7
            int r4 = r4.ordinal()
            r9 = 7
            r3 = r3[r4]
            r9 = 4
            r4 = 1
            if (r3 == r4) goto L_0x002e
            goto L_0x0010
        L_0x002e:
            r9 = 3
            java.lang.String r3 = r11.getCurrentName()
            r9 = 1
            r5 = -1
            r9 = 5
            int r6 = r3.hashCode()
            r9 = 1
            r7 = -1839419817(0xffffffff925cae57, float:-6.963465E-28)
            r8 = 0
            r8 = 2
            if (r6 == r7) goto L_0x006f
            r9 = 1
            r7 = -1357157764(0xffffffffaf1b6a7c, float:-1.4134999E-10)
            if (r6 == r7) goto L_0x0060
            r7 = -663387736(0xffffffffd87581a8, float:-1.07974887E15)
            r9 = 1
            if (r6 == r7) goto L_0x0050
            r9 = 2
            goto L_0x007d
        L_0x0050:
            java.lang.String r6 = "sbvi.letdsuetoi"
            java.lang.String r6 = "video.subtitles"
            r9 = 0
            boolean r3 = r3.equals(r6)
            r9 = 7
            if (r3 == 0) goto L_0x007d
            r9 = 3
            r3 = 0
            r9 = 4
            goto L_0x007f
        L_0x0060:
            r9 = 6
            java.lang.String r6 = "audio.episode.speed"
            r9 = 5
            boolean r3 = r3.equals(r6)
            r9 = 1
            if (r3 == 0) goto L_0x007d
            r9 = 1
            r3 = 2
            r9 = 5
            goto L_0x007f
        L_0x006f:
            java.lang.String r6 = "video.subtitles_cc"
            r9 = 1
            boolean r3 = r3.equals(r6)
            r9 = 4
            if (r3 == 0) goto L_0x007d
            r9 = 6
            r3 = 1
            r9 = 6
            goto L_0x007f
        L_0x007d:
            r9 = 2
            r3 = -1
        L_0x007f:
            r9 = 2
            if (r3 == 0) goto L_0x00c3
            r9 = 3
            if (r3 == r4) goto L_0x00ab
            r9 = 4
            if (r3 == r8) goto L_0x0091
            r9 = 6
            r11.nextValue()
            r9 = 2
            r11.skipChildren()
            goto L_0x0010
        L_0x0091:
            r11.nextValue()
            r9 = 1
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r3 = "ojFaaagap.llvnt"
            java.lang.String r3 = "java.lang.Float"
            com.fasterxml.jackson.databind.JsonDeserializer r1 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r1, r3)
            r9 = 4
            java.lang.Object r1 = r1.deserialize(r11, r12)
            r9 = 6
            java.lang.Float r1 = (java.lang.Float) r1
            goto L_0x0010
        L_0x00ab:
            r11.nextValue()
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.String r3 = ".Bjovganot.aaeanl"
            java.lang.String r3 = "java.lang.Boolean"
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r0, r3)
            r9 = 4
            java.lang.Object r0 = r0.deserialize(r11, r12)
            r9 = 4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r9 = 0
            goto L_0x0010
        L_0x00c3:
            r9 = 7
            r11.nextValue()
            r9 = 0
            java.lang.String r2 = r10.i(r11, r12)
            r9 = 3
            goto L_0x0010
        L_0x00cf:
            r9 = 2
            com.spotify.mobile.android.video.model.ContextPlayerConfiguration r11 = new com.spotify.mobile.android.video.model.ContextPlayerConfiguration
            r9 = 4
            r11.<init>(r2, r0, r1)
            r9 = 6
            return r11
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

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.cosmos.player.v2.PlayOrigin f(com.fasterxml.jackson.core.JsonParser r14, com.fasterxml.jackson.databind.DeserializationContext r15) {
        /*
            r13 = this;
            r12 = 5
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()
            r12 = 0
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r12 = 0
            r2 = 0
            r12 = 4
            if (r0 != r1) goto L_0x000f
            r12 = 0
            return r2
        L_0x000f:
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
        L_0x0019:
            r12 = 3
            com.fasterxml.jackson.core.JsonToken r0 = r14.nextToken()
            r12 = 4
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r12 = 1
            if (r0 == r1) goto L_0x0134
            int[] r0 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
            r12 = 5
            com.fasterxml.jackson.core.JsonToken r1 = r14.getCurrentToken()
            r12 = 4
            int r1 = r1.ordinal()
            r12 = 4
            r0 = r0[r1]
            r12 = 0
            r1 = 1
            if (r0 == r1) goto L_0x0038
            goto L_0x0019
        L_0x0038:
            r12 = 3
            java.lang.String r0 = r14.getCurrentName()
            r12 = 2
            r3 = -1
            r12 = 7
            int r11 = r0.hashCode()
            r12 = 1
            switch(r11) {
                case -1358351982: goto L_0x00a1;
                case -1238715854: goto L_0x0091;
                case -1144002417: goto L_0x0082;
                case -641989667: goto L_0x0073;
                case 1006001683: goto L_0x0066;
                case 1163267273: goto L_0x0059;
                case 1196184786: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            r12 = 5
            goto L_0x00af
        L_0x004a:
            r12 = 3
            java.lang.String r1 = "view_uri"
            r12 = 2
            boolean r0 = r0.equals(r1)
            r12 = 0
            if (r0 == 0) goto L_0x00af
            r12 = 6
            r1 = 2
            r12 = 3
            goto L_0x00b0
        L_0x0059:
            java.lang.String r1 = "referrer_identifier"
            r12 = 0
            boolean r0 = r0.equals(r1)
            r12 = 7
            if (r0 == 0) goto L_0x00af
            r1 = 4
            r12 = r12 ^ r1
            goto L_0x00b0
        L_0x0066:
            r12 = 6
            java.lang.String r1 = "external_referrer"
            r12 = 0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r12 = 5
            r1 = 3
            goto L_0x00b0
        L_0x0073:
            r12 = 6
            java.lang.String r1 = "tas_rlssefcaues"
            java.lang.String r1 = "feature_classes"
            boolean r0 = r0.equals(r1)
            r12 = 5
            if (r0 == 0) goto L_0x00af
            r1 = 6
            r12 = 1
            goto L_0x00b0
        L_0x0082:
            r12 = 7
            java.lang.String r11 = "eenmv_oriraueft"
            java.lang.String r11 = "feature_version"
            r12 = 0
            boolean r0 = r0.equals(r11)
            r12 = 4
            if (r0 == 0) goto L_0x00af
            r12 = 7
            goto L_0x00b0
        L_0x0091:
            r12 = 2
            java.lang.String r1 = "e_icotfdiiveinedr"
            java.lang.String r1 = "device_identifier"
            r12 = 3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00af
            r12 = 4
            r1 = 5
            r12 = 3
            goto L_0x00b0
        L_0x00a1:
            r12 = 3
            java.lang.String r1 = "feature_identifier"
            boolean r0 = r0.equals(r1)
            r12 = 5
            if (r0 == 0) goto L_0x00af
            r12 = 0
            r1 = 0
            r12 = 1
            goto L_0x00b0
        L_0x00af:
            r1 = -1
        L_0x00b0:
            r12 = 7
            switch(r1) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0120;
                case 2: goto L_0x0115;
                case 3: goto L_0x010a;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00bf;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            r12 = 2
            r14.nextValue()
            r12 = 6
            r14.skipChildren()
            r12 = 3
            goto L_0x0019
        L_0x00bf:
            r12 = 0
            r14.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()
            r12 = 7
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r12 = 6
            if (r0 != r1) goto L_0x00d2
            r10 = r2
            r10 = r2
            r12 = 0
            goto L_0x0019
        L_0x00d2:
            r12 = 3
            java.util.HashSet r0 = new java.util.HashSet
            r12 = 3
            r0.<init>()
        L_0x00d9:
            r12 = 4
            com.fasterxml.jackson.core.JsonToken r1 = r14.nextToken()
            r12 = 5
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            r12 = 6
            if (r1 == r3) goto L_0x00ee
            java.lang.String r1 = r13.i(r14, r15)
            r12 = 3
            r0.add(r1)
            r12 = 4
            goto L_0x00d9
        L_0x00ee:
            r10 = r0
            r10 = r0
            r12 = 3
            goto L_0x0019
        L_0x00f3:
            r12 = 2
            r14.nextValue()
            r12 = 4
            java.lang.String r9 = r13.i(r14, r15)
            r12 = 0
            goto L_0x0019
        L_0x00ff:
            r12 = 6
            r14.nextValue()
            java.lang.String r8 = r13.i(r14, r15)
            r12 = 6
            goto L_0x0019
        L_0x010a:
            r12 = 7
            r14.nextValue()
            java.lang.String r7 = r13.i(r14, r15)
            r12 = 7
            goto L_0x0019
        L_0x0115:
            r14.nextValue()
            r12 = 4
            java.lang.String r6 = r13.i(r14, r15)
            r12 = 6
            goto L_0x0019
        L_0x0120:
            r14.nextValue()
            java.lang.String r5 = r13.i(r14, r15)
            goto L_0x0019
        L_0x0129:
            r12 = 3
            r14.nextValue()
            r12 = 3
            java.lang.String r4 = r13.i(r14, r15)
            goto L_0x0019
        L_0x0134:
            r12 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r14 = new com.spotify.mobile.android.cosmos.player.v2.PlayOrigin
            r3 = r14
            r12 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r14
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
            r4 = r2
            r5 = r4
            r6 = r5
            r6 = r5
            r7 = r6
            r7 = r6
            r8 = r7
            r9 = r8
            r9 = r8
        L_0x0014:
            com.fasterxml.jackson.core.JsonToken r0 = r16.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00eb
            int[] r0 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r16.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            java.lang.String r0 = r16.getCurrentName()
            r3 = -1
            int r10 = r0.hashCode()
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            switch(r10) {
                case -987494927: goto L_0x0071;
                case -450004177: goto L_0x0067;
                case 115792: goto L_0x005d;
                case 116076: goto L_0x0053;
                case 249799580: goto L_0x0049;
                case 630249588: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x007b
        L_0x003d:
            java.lang.String r10 = "taisubit_r"
            java.lang.String r10 = "artist_uri"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x007b
            r0 = 3
            goto L_0x007c
        L_0x0049:
            java.lang.String r10 = "album_uri"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x007b
            r0 = 2
            goto L_0x007c
        L_0x0053:
            java.lang.String r10 = "uri"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x005d:
            java.lang.String r10 = "uid"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x007b
            r0 = 1
            goto L_0x007c
        L_0x0067:
            java.lang.String r10 = "metadata"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x007b
            r0 = 5
            goto L_0x007c
        L_0x0071:
            java.lang.String r10 = "provider"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x007b
            r0 = 4
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            if (r0 == 0) goto L_0x00e2
            if (r0 == r1) goto L_0x00d9
            if (r0 == r14) goto L_0x00d0
            if (r0 == r13) goto L_0x00c7
            if (r0 == r12) goto L_0x00be
            if (r0 == r11) goto L_0x008f
            r16.nextValue()
            r16.skipChildren()
            goto L_0x0014
        L_0x008f:
            r16.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r16.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x009e
            r9 = r2
            r9 = r2
            goto L_0x0014
        L_0x009e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x00a3:
            com.fasterxml.jackson.core.JsonToken r1 = r16.nextToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r3) goto L_0x00ba
            java.lang.String r1 = r15.i(r16, r17)
            r16.nextValue()
            java.lang.String r3 = r15.i(r16, r17)
            r0.put(r1, r3)
            goto L_0x00a3
        L_0x00ba:
            r9 = r0
            r9 = r0
            goto L_0x0014
        L_0x00be:
            r16.nextValue()
            java.lang.String r8 = r15.i(r16, r17)
            goto L_0x0014
        L_0x00c7:
            r16.nextValue()
            java.lang.String r7 = r15.i(r16, r17)
            goto L_0x0014
        L_0x00d0:
            r16.nextValue()
            java.lang.String r6 = r15.i(r16, r17)
            goto L_0x0014
        L_0x00d9:
            r16.nextValue()
            java.lang.String r5 = r15.i(r16, r17)
            goto L_0x0014
        L_0x00e2:
            r16.nextValue()
            java.lang.String r4 = r15.i(r16, r17)
            goto L_0x0014
        L_0x00eb:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r0
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
            int i3 = i2;
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
    private com.spotify.mobile.android.video.model.TrackWithPlayOrigin j(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r12.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r10 = 3
            r2 = 0
            if (r0 != r1) goto L_0x000c
            r10 = 1
            return r2
        L_0x000c:
            r0 = r2
            r0 = r2
            r1 = r0
            r1 = r0
            r3 = r1
            r3 = r1
        L_0x0012:
            r10 = 3
            com.fasterxml.jackson.core.JsonToken r4 = r12.nextToken()
            r10 = 3
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r4 == r5) goto L_0x00c0
            int[] r4 = com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.AnonymousClass1.a
            r10 = 1
            com.fasterxml.jackson.core.JsonToken r5 = r12.getCurrentToken()
            r10 = 1
            int r5 = r5.ordinal()
            r10 = 0
            r4 = r4[r5]
            r10 = 6
            r5 = 1
            r10 = 7
            if (r4 == r5) goto L_0x0032
            r10 = 0
            goto L_0x0012
        L_0x0032:
            r10 = 2
            java.lang.String r4 = r12.getCurrentName()
            r10 = 3
            r6 = -1
            r10 = 2
            int r7 = r4.hashCode()
            r8 = 3
            r10 = 6
            r9 = 2
            r10 = 6
            switch(r7) {
                case -541598063: goto L_0x006f;
                case -102516004: goto L_0x0062;
                case 110621003: goto L_0x0055;
                case 1706303935: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x007e
        L_0x0046:
            java.lang.String r7 = "_aadcybilkb"
            java.lang.String r7 = "playback_id"
            boolean r4 = r4.equals(r7)
            r10 = 0
            if (r4 == 0) goto L_0x007e
            r10 = 3
            r4 = 2
            r10 = 4
            goto L_0x0080
        L_0x0055:
            java.lang.String r7 = "ratct"
            java.lang.String r7 = "track"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x007e
            r10 = 7
            r4 = 0
            goto L_0x0080
        L_0x0062:
            r10 = 5
            java.lang.String r7 = "context_uri"
            boolean r4 = r4.equals(r7)
            r10 = 4
            if (r4 == 0) goto L_0x007e
            r10 = 7
            r4 = 3
            goto L_0x0080
        L_0x006f:
            r10 = 1
            java.lang.String r7 = "play_origin"
            r10 = 4
            boolean r4 = r4.equals(r7)
            r10 = 4
            if (r4 == 0) goto L_0x007e
            r10 = 6
            r4 = 1
            r10 = 1
            goto L_0x0080
        L_0x007e:
            r10 = 0
            r4 = -1
        L_0x0080:
            if (r4 == 0) goto L_0x00b6
            if (r4 == r5) goto L_0x00ab
            r10 = 5
            if (r4 == r9) goto L_0x00a1
            r10 = 5
            if (r4 == r8) goto L_0x0095
            r10 = 5
            r12.nextValue()
            r10 = 1
            r12.skipChildren()
            r10 = 7
            goto L_0x0012
        L_0x0095:
            r10 = 2
            r12.nextValue()
            r10 = 4
            java.lang.String r3 = r11.i(r12, r13)
            r10 = 6
            goto L_0x0012
        L_0x00a1:
            r12.nextValue()
            r10 = 6
            java.lang.String r1 = r11.i(r12, r13)
            goto L_0x0012
        L_0x00ab:
            r12.nextValue()
            r10 = 1
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r0 = r11.f(r12, r13)
            r10 = 7
            goto L_0x0012
        L_0x00b6:
            r10 = 7
            r12.nextValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2 = r11.g(r12, r13)
            goto L_0x0012
        L_0x00c0:
            r10 = 7
            com.spotify.mobile.android.video.model.TrackWithPlayOrigin r12 = new com.spotify.mobile.android.video.model.TrackWithPlayOrigin
            r10 = 1
            r12.<init>(r2, r0, r1, r3)
            r10 = 3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.j(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.model.TrackWithPlayOrigin");
    }

    public final boolean isCachable() {
        return true;
    }
}
