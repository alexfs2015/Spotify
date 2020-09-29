package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;
import java.util.List;

public final class OfflineResults_Deserializer extends StdDeserializer<OfflineResults> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    OfflineResults_Deserializer() {
        super(OfflineResults.class);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00be A[Catch:{ RuntimeException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c5 A[Catch:{ RuntimeException -> 0x00fd }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.libs.search.offline.model.OfflineResults deserialize(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14) {
        /*
            r12 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x00fd }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
            r1 = r0
            r3 = r1
            r4 = r3
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r5 = r13.nextToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == r6) goto L_0x00f7
            int[] r5 = com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r6 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            int r6 = r6.ordinal()     // Catch:{ RuntimeException -> 0x00fd }
            r5 = r5[r6]     // Catch:{ RuntimeException -> 0x00fd }
            r6 = 1
            if (r5 == r6) goto L_0x0026
            goto L_0x000e
        L_0x0026:
            java.lang.String r5 = r13.getCurrentName()     // Catch:{ RuntimeException -> 0x00fd }
            int r7 = r5.hashCode()     // Catch:{ RuntimeException -> 0x00fd }
            r8 = 0
            r9 = 3
            r10 = 2
            r11 = -1
            switch(r7) {
                case -1865828127: goto L_0x0054;
                case -865716088: goto L_0x004a;
                case -710473164: goto L_0x0040;
                case -632946216: goto L_0x0036;
                default: goto L_0x0035;
            }     // Catch:{ RuntimeException -> 0x00fd }
        L_0x0035:
            goto L_0x005e
        L_0x0036:
            java.lang.String r7 = "episodes"
            boolean r5 = r5.equals(r7)     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == 0) goto L_0x005e
            r5 = 1
            goto L_0x005f
        L_0x0040:
            java.lang.String r7 = "searchTerm"
            boolean r5 = r5.equals(r7)     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == 0) goto L_0x005e
            r5 = 0
            goto L_0x005f
        L_0x004a:
            java.lang.String r7 = "tracks"
            boolean r5 = r5.equals(r7)     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == 0) goto L_0x005e
            r5 = 2
            goto L_0x005f
        L_0x0054:
            java.lang.String r7 = "playlists"
            boolean r5 = r5.equals(r7)     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == 0) goto L_0x005e
            r5 = 3
            goto L_0x005f
        L_0x005e:
            r5 = -1
        L_0x005f:
            if (r5 == 0) goto L_0x00ee
            if (r5 == r6) goto L_0x007e
            if (r5 == r10) goto L_0x0076
            if (r5 == r9) goto L_0x006e
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            r13.skipChildren()     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x000e
        L_0x006e:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            com.spotify.music.libs.search.offline.model.OfflinePlaylistList r4 = r12.e(r13, r14)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x000e
        L_0x0076:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            com.spotify.music.libs.search.offline.model.OfflineTrackList r3 = r12.i(r13, r14)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x000e
        L_0x007e:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r1 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x00fd }
            if (r1 != r5) goto L_0x008b
            r1 = r2
            goto L_0x000e
        L_0x008b:
            r1 = r2
        L_0x008c:
            com.fasterxml.jackson.core.JsonToken r5 = r13.nextToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == r7) goto L_0x00e6
            int[] r5 = com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r7 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            int r7 = r7.ordinal()     // Catch:{ RuntimeException -> 0x00fd }
            r5 = r5[r7]     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == r6) goto L_0x00a3
            goto L_0x008c
        L_0x00a3:
            java.lang.String r5 = r13.getCurrentName()     // Catch:{ RuntimeException -> 0x00fd }
            int r7 = r5.hashCode()     // Catch:{ RuntimeException -> 0x00fd }
            r9 = 3202880(0x30df40, float:4.488191E-39)
            if (r7 == r9) goto L_0x00b1
            goto L_0x00bb
        L_0x00b1:
            java.lang.String r7 = "hits"
            boolean r5 = r5.equals(r7)     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == 0) goto L_0x00bb
            r5 = 0
            goto L_0x00bc
        L_0x00bb:
            r5 = -1
        L_0x00bc:
            if (r5 == 0) goto L_0x00c5
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            r13.skipChildren()     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x008c
        L_0x00c5:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r1 = r13.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x00fd }
            if (r1 != r5) goto L_0x00d1
            goto L_0x008b
        L_0x00d1:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x00fd }
            r1.<init>()     // Catch:{ RuntimeException -> 0x00fd }
        L_0x00d6:
            com.fasterxml.jackson.core.JsonToken r5 = r13.nextToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x00fd }
            if (r5 == r7) goto L_0x008c
            com.spotify.music.libs.search.offline.model.OfflineEpisode r5 = r12.c(r13, r14)     // Catch:{ RuntimeException -> 0x00fd }
            r1.add(r5)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x00d6
        L_0x00e6:
            com.spotify.music.libs.search.offline.model.OfflineEpisodeList r5 = new com.spotify.music.libs.search.offline.model.OfflineEpisodeList     // Catch:{ RuntimeException -> 0x00fd }
            r5.<init>(r1)     // Catch:{ RuntimeException -> 0x00fd }
            r1 = r5
            goto L_0x000e
        L_0x00ee:
            r13.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.String r0 = r12.j(r13, r14)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x000e
        L_0x00f7:
            com.spotify.music.libs.search.offline.model.OfflineResults r13 = new com.spotify.music.libs.search.offline.model.OfflineResults     // Catch:{ RuntimeException -> 0x00fd }
            r13.<init>(r0, r1, r3, r4)     // Catch:{ RuntimeException -> 0x00fd }
            return r13
        L_0x00fd:
            r13 = move-exception
        L_0x00fe:
            java.lang.Throwable r0 = r13.getCause()
            if (r0 == 0) goto L_0x0109
            java.lang.Throwable r13 = r13.getCause()
            goto L_0x00fe
        L_0x0109:
            java.lang.String r0 = r13.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r13 = com.fasterxml.jackson.databind.JsonMappingException.from(r14, r0, r13)
            goto L_0x0113
        L_0x0112:
            throw r13
        L_0x0113:
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.libs.search.offline.model.OfflineResults");
    }

    private List<OfflineTrack> b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(f(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.libs.search.offline.model.OfflineEpisode c(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
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
            if (r3 == r4) goto L_0x0082
            int[] r3 = com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.AnonymousClass1.a
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
            r7 = 116076(0x1c56c, float:1.62657E-40)
            r8 = 2
            if (r6 == r7) goto L_0x0052
            r7 = 3373707(0x337a8b, float:4.72757E-39)
            if (r6 == r7) goto L_0x0048
            r7 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r6 == r7) goto L_0x003e
            goto L_0x005c
        L_0x003e:
            java.lang.String r6 = "image"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x0048:
            java.lang.String r6 = "name"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 0
            goto L_0x005d
        L_0x0052:
            java.lang.String r6 = "uri"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 2
            goto L_0x005d
        L_0x005c:
            r3 = -1
        L_0x005d:
            if (r3 == 0) goto L_0x007a
            if (r3 == r4) goto L_0x0072
            if (r3 == r8) goto L_0x006a
            r10.nextValue()
            r10.skipChildren()
            goto L_0x000c
        L_0x006a:
            r10.nextValue()
            java.lang.String r1 = r9.j(r10, r11)
            goto L_0x000c
        L_0x0072:
            r10.nextValue()
            java.lang.String r0 = r9.j(r10, r11)
            goto L_0x000c
        L_0x007a:
            r10.nextValue()
            java.lang.String r2 = r9.j(r10, r11)
            goto L_0x000c
        L_0x0082:
            com.spotify.music.libs.search.offline.model.OfflineEpisode r10 = new com.spotify.music.libs.search.offline.model.OfflineEpisode
            r10.<init>(r2, r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.c(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.libs.search.offline.model.OfflineEpisode");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.libs.search.offline.model.OfflinePlaylist d(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
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
            int[] r1 = com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.AnonymousClass1.a
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
            r6 = 116076(0x1c56c, float:1.62657E-40)
            if (r5 == r6) goto L_0x0041
            r6 = 3373707(0x337a8b, float:4.72757E-39)
            if (r5 == r6) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.String r5 = "name"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "uri"
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
            com.spotify.music.libs.search.offline.model.OfflinePlaylist r8 = new com.spotify.music.libs.search.offline.model.OfflinePlaylist
            r8.<init>(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.libs.search.offline.model.OfflinePlaylist");
    }

    private OfflinePlaylistList e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (true) {
            List list = null;
            while (true) {
                if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                    return new OfflinePlaylistList(list);
                }
                if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                    String currentName = jsonParser.getCurrentName();
                    char c = 65535;
                    if (currentName.hashCode() == 3202880 && currentName.equals("hits")) {
                        c = 0;
                    }
                    if (c != 0) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            list = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                list.add(d(jsonParser, deserializationContext));
                            }
                        }
                    }
                }
            }
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.libs.search.offline.model.OfflineTrack f(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r12.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
            r1 = r0
            r3 = r1
            r4 = r3
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r5 = r12.nextToken()
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r5 == r6) goto L_0x00a8
            int[] r5 = com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r6 = r12.getCurrentToken()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 1
            if (r5 == r6) goto L_0x0026
            goto L_0x000e
        L_0x0026:
            java.lang.String r5 = r12.getCurrentName()
            r7 = -1
            int r8 = r5.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -732362228: goto L_0x0053;
                case 116076: goto L_0x0049;
                case 3373707: goto L_0x003f;
                case 92896879: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x005d
        L_0x0035:
            java.lang.String r8 = "album"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 1
            goto L_0x005e
        L_0x003f:
            java.lang.String r8 = "name"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 2
            goto L_0x005e
        L_0x0049:
            java.lang.String r8 = "uri"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 3
            goto L_0x005e
        L_0x0053:
            java.lang.String r8 = "artists"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 0
            goto L_0x005e
        L_0x005d:
            r5 = -1
        L_0x005e:
            if (r5 == 0) goto L_0x0085
            if (r5 == r6) goto L_0x007d
            if (r5 == r10) goto L_0x0075
            if (r5 == r9) goto L_0x006d
            r12.nextValue()
            r12.skipChildren()
            goto L_0x000e
        L_0x006d:
            r12.nextValue()
            java.lang.String r4 = r11.j(r12, r13)
            goto L_0x000e
        L_0x0075:
            r12.nextValue()
            java.lang.String r3 = r11.j(r12, r13)
            goto L_0x000e
        L_0x007d:
            r12.nextValue()
            com.spotify.music.libs.search.offline.model.OfflineTrackAlbum r1 = r11.g(r12, r13)
            goto L_0x000e
        L_0x0085:
            r12.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r12.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r5) goto L_0x0093
            r0 = r2
            goto L_0x000e
        L_0x0093:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x0098:
            com.fasterxml.jackson.core.JsonToken r5 = r12.nextToken()
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r5 == r6) goto L_0x000e
            com.spotify.music.libs.search.offline.model.OfflineTrackArtist r5 = r11.h(r12, r13)
            r0.add(r5)
            goto L_0x0098
        L_0x00a8:
            com.spotify.music.libs.search.offline.model.OfflineTrack r12 = new com.spotify.music.libs.search.offline.model.OfflineTrack
            r12.<init>(r0, r1, r3, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.libs.search.offline.model.OfflineTrack");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.libs.search.offline.model.OfflineTrackAlbum g(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
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
            if (r3 == r4) goto L_0x0082
            int[] r3 = com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.AnonymousClass1.a
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
            r7 = 116076(0x1c56c, float:1.62657E-40)
            r8 = 2
            if (r6 == r7) goto L_0x0052
            r7 = 3373707(0x337a8b, float:4.72757E-39)
            if (r6 == r7) goto L_0x0048
            r7 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r6 == r7) goto L_0x003e
            goto L_0x005c
        L_0x003e:
            java.lang.String r6 = "image"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 0
            goto L_0x005d
        L_0x0048:
            java.lang.String r6 = "name"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r6 = "uri"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 2
            goto L_0x005d
        L_0x005c:
            r3 = -1
        L_0x005d:
            if (r3 == 0) goto L_0x007a
            if (r3 == r4) goto L_0x0072
            if (r3 == r8) goto L_0x006a
            r10.nextValue()
            r10.skipChildren()
            goto L_0x000c
        L_0x006a:
            r10.nextValue()
            java.lang.String r1 = r9.j(r10, r11)
            goto L_0x000c
        L_0x0072:
            r10.nextValue()
            java.lang.String r0 = r9.j(r10, r11)
            goto L_0x000c
        L_0x007a:
            r10.nextValue()
            java.lang.String r2 = r9.j(r10, r11)
            goto L_0x000c
        L_0x0082:
            com.spotify.music.libs.search.offline.model.OfflineTrackAlbum r10 = new com.spotify.music.libs.search.offline.model.OfflineTrackAlbum
            r10.<init>(r2, r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.g(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.libs.search.offline.model.OfflineTrackAlbum");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.libs.search.offline.model.OfflineTrackArtist h(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
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
            if (r3 == r4) goto L_0x0082
            int[] r3 = com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.AnonymousClass1.a
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
            r7 = 116076(0x1c56c, float:1.62657E-40)
            r8 = 2
            if (r6 == r7) goto L_0x0052
            r7 = 3373707(0x337a8b, float:4.72757E-39)
            if (r6 == r7) goto L_0x0048
            r7 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r6 == r7) goto L_0x003e
            goto L_0x005c
        L_0x003e:
            java.lang.String r6 = "image"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x0048:
            java.lang.String r6 = "name"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 2
            goto L_0x005d
        L_0x0052:
            java.lang.String r6 = "uri"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 0
            goto L_0x005d
        L_0x005c:
            r3 = -1
        L_0x005d:
            if (r3 == 0) goto L_0x007a
            if (r3 == r4) goto L_0x0072
            if (r3 == r8) goto L_0x006a
            r10.nextValue()
            r10.skipChildren()
            goto L_0x000c
        L_0x006a:
            r10.nextValue()
            java.lang.String r1 = r9.j(r10, r11)
            goto L_0x000c
        L_0x0072:
            r10.nextValue()
            java.lang.String r0 = r9.j(r10, r11)
            goto L_0x000c
        L_0x007a:
            r10.nextValue()
            java.lang.String r2 = r9.j(r10, r11)
            goto L_0x000c
        L_0x0082:
            com.spotify.music.libs.search.offline.model.OfflineTrackArtist r10 = new com.spotify.music.libs.search.offline.model.OfflineTrackArtist
            r10.<init>(r2, r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.offline.model.OfflineResults_Deserializer.h(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.libs.search.offline.model.OfflineTrackArtist");
    }

    private OfflineTrackList i(JsonParser jsonParser, DeserializationContext deserializationContext) {
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                if (currentName.hashCode() == 3202880 && currentName.equals("hits")) {
                    c = 0;
                }
                if (c != 0) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    list = b(jsonParser, deserializationContext);
                }
            }
        }
        return new OfflineTrackList(list);
    }

    private String j(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    public final boolean isCachable() {
        return true;
    }
}
