package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;
import java.util.List;

public final class TrackAnnotationSet_Deserializer extends StdDeserializer<TrackAnnotationSet> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    TrackAnnotationSet_Deserializer() {
        super(TrackAnnotationSet.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TrackAnnotationSet deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        DeserializationContext deserializationContext2 = deserializationContext;
        try {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            int i = 0;
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                    String currentName = jsonParser.getCurrentName();
                    char c = 65535;
                    switch (currentName.hashCode()) {
                        case -1409097913:
                            if (currentName.equals("artist")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1375522883:
                            if (currentName.equals("genius_song_id")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -961709276:
                            if (currentName.equals("annotations")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 110371416:
                            if (currentName.equals("title")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 918088224:
                            if (currentName.equals("spotify_uuid")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        JsonParser jsonParser2 = jsonParser;
                        jsonParser.nextValue();
                        str = b(jsonParser, deserializationContext);
                    } else if (c == 1) {
                        jsonParser.nextValue();
                        i = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext2)).intValue();
                    } else if (c == 2) {
                        jsonParser.nextValue();
                        str2 = b(jsonParser, deserializationContext);
                    } else if (c == 3) {
                        jsonParser.nextValue();
                        str3 = b(jsonParser, deserializationContext);
                    } else if (c != 4) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            list = null;
                        } else {
                            list = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                list.add(c(jsonParser, deserializationContext));
                            }
                        }
                    }
                }
            }
            return TrackAnnotationSet.create(str, i, str2, str3, list);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext2, e.getMessage(), e);
        }
    }

    private String b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor] */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r15v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v2
      assigns: []
      uses: []
      mth insns count: 151
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.behindthelyrics.model.business.TrackAnnotation c(com.fasterxml.jackson.core.JsonParser r17, com.fasterxml.jackson.databind.DeserializationContext r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            com.fasterxml.jackson.core.JsonToken r2 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r4 = 0
            if (r2 != r3) goto L_0x000e
            return r4
        L_0x000e:
            r2 = 0
            r5 = r2
            r2 = r4
            r3 = r2
            r7 = r3
        L_0x0014:
            com.fasterxml.jackson.core.JsonToken r8 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r9 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r8 == r9) goto L_0x013d
            int[] r8 = com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r9 = r17.getCurrentToken()
            int r9 = r9.ordinal()
            r8 = r8[r9]
            r9 = 1
            if (r8 == r9) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            java.lang.String r8 = r17.getCurrentName()
            int r10 = r8.hashCode()
            r12 = 0
            r13 = 3
            r14 = 2
            switch(r10) {
                case -1406328437: goto L_0x0059;
                case -567321830: goto L_0x004f;
                case -389131437: goto L_0x0045;
                case 55126294: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0063
        L_0x003b:
            java.lang.String r10 = "timestamp"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0063
            r8 = 2
            goto L_0x0064
        L_0x0045:
            java.lang.String r10 = "contentType"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0063
            r8 = 1
            goto L_0x0064
        L_0x004f:
            java.lang.String r10 = "contents"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0063
            r8 = 0
            goto L_0x0064
        L_0x0059:
            java.lang.String r10 = "author"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0063
            r8 = 3
            goto L_0x0064
        L_0x0063:
            r8 = -1
        L_0x0064:
            if (r8 == 0) goto L_0x0133
            if (r8 == r9) goto L_0x012b
            if (r8 == r14) goto L_0x0115
            if (r8 == r13) goto L_0x0073
            r17.nextValue()
            r17.skipChildren()
            goto L_0x0014
        L_0x0073:
            r17.nextValue()
            com.fasterxml.jackson.core.JsonToken r7 = r17.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r7 != r8) goto L_0x0081
        L_0x007e:
            r7 = r4
            goto L_0x013a
        L_0x0081:
            r8 = r4
            r10 = r8
            r15 = r10
            r7 = 0
        L_0x0085:
            com.fasterxml.jackson.core.JsonToken r4 = r17.nextToken()
            com.fasterxml.jackson.core.JsonToken r11 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r4 == r11) goto L_0x010f
            int[] r4 = com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r11 = r17.getCurrentToken()
            int r11 = r11.ordinal()
            r4 = r4[r11]
            if (r4 == r9) goto L_0x009c
            goto L_0x0085
        L_0x009c:
            java.lang.String r4 = r17.getCurrentName()
            int r11 = r4.hashCode()
            switch(r11) {
                case -1994383672: goto L_0x00c6;
                case -922801803: goto L_0x00bc;
                case -428647082: goto L_0x00b2;
                case 1714148973: goto L_0x00a8;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x00d0
        L_0x00a8:
            java.lang.String r11 = "displayName"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x00d0
            r4 = 2
            goto L_0x00d1
        L_0x00b2:
            java.lang.String r11 = "avatarURL"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x00d0
            r4 = 3
            goto L_0x00d1
        L_0x00bc:
            java.lang.String r11 = "spotifyId"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x00d0
            r4 = 1
            goto L_0x00d1
        L_0x00c6:
            java.lang.String r11 = "verified"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x00d0
            r4 = 0
            goto L_0x00d1
        L_0x00d0:
            r4 = -1
        L_0x00d1:
            if (r4 == 0) goto L_0x00f8
            if (r4 == r9) goto L_0x00f0
            if (r4 == r14) goto L_0x00e8
            if (r4 == r13) goto L_0x00e0
            r17.nextValue()
            r17.skipChildren()
            goto L_0x0085
        L_0x00e0:
            r17.nextValue()
            java.lang.String r15 = r16.b(r17, r18)
            goto L_0x0085
        L_0x00e8:
            r17.nextValue()
            java.lang.String r10 = r16.b(r17, r18)
            goto L_0x0085
        L_0x00f0:
            r17.nextValue()
            java.lang.String r8 = r16.b(r17, r18)
            goto L_0x0085
        L_0x00f8:
            r17.nextValue()
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.String r7 = "boolean"
            com.fasterxml.jackson.databind.JsonDeserializer r4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r4, r7)
            java.lang.Object r4 = r4.deserialize(r0, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r7 = r4.booleanValue()
            goto L_0x0085
        L_0x010f:
            com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor r4 = com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor.create(r7, r8, r10, r15)
            goto L_0x007e
        L_0x0115:
            r17.nextValue()
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.String r5 = "double"
            com.fasterxml.jackson.databind.JsonDeserializer r4 = com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(r4, r5)
            java.lang.Object r4 = r4.deserialize(r0, r1)
            java.lang.Double r4 = (java.lang.Double) r4
            double r5 = r4.doubleValue()
            goto L_0x013a
        L_0x012b:
            r17.nextValue()
            java.lang.String r3 = r16.b(r17, r18)
            goto L_0x013a
        L_0x0133:
            r17.nextValue()
            java.lang.String r2 = r16.b(r17, r18)
        L_0x013a:
            r4 = 0
            goto L_0x0014
        L_0x013d:
            com.spotify.music.behindthelyrics.model.business.TrackAnnotation r0 = com.spotify.music.behindthelyrics.model.business.TrackAnnotation.create(r2, r3, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet_Deserializer.c(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.behindthelyrics.model.business.TrackAnnotation");
    }

    public final boolean isCachable() {
        return true;
    }
}
