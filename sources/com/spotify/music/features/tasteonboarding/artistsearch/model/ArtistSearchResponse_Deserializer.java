package com.spotify.music.features.tasteonboarding.artistsearch.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingImage;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.LinkedList;
import java.util.List;

public final class ArtistSearchResponse_Deserializer extends StdDeserializer<ArtistSearchResponse> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer$1 reason: invalid class name */
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

    ArtistSearchResponse_Deserializer() {
        super(ArtistSearchResponse.class);
    }

    private static int a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    private List<TasteOnboardingItem> c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(g(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.qmj d(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
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
            int[] r1 = com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer.AnonymousClass1.a
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
            r6 = 502589089(0x1df4e6a1, float:6.4824727E-21)
            if (r5 == r6) goto L_0x0041
            r6 = 1970241253(0x756f7ee5, float:3.0359684E32)
            if (r5 == r6) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.String r5 = "section"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "content_source"
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
            java.lang.String r0 = r7.e(r8, r9)
            goto L_0x000b
        L_0x005f:
            r8.nextValue()
            java.lang.String r2 = r7.e(r8, r9)
            goto L_0x000b
        L_0x0067:
            qmj r8 = defpackage.qmj.create(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):qmj");
    }

    private String e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    private TasteOnboardingImage f(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 116076) {
                        if (hashCode == 113126854 && currentName.equals("width")) {
                            c = 2;
                        }
                    } else if (currentName.equals("uri")) {
                        c = 0;
                    }
                } else if (currentName.equals("height")) {
                    c = 1;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = e(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    i = a(jsonParser, deserializationContext);
                } else if (c != 2) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i2 = a(jsonParser, deserializationContext);
                }
            }
        }
        return TasteOnboardingImage.create(str, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r0.equals("name") != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem g(com.fasterxml.jackson.core.JsonParser r14, com.fasterxml.jackson.databind.DeserializationContext r15) {
        /*
            r13 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0012:
            com.fasterxml.jackson.core.JsonToken r0 = r14.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00f6
            int[] r0 = com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r14.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x002a
            goto L_0x0012
        L_0x002a:
            java.lang.String r0 = r14.getCurrentName()
            r11 = -1
            int r12 = r0.hashCode()
            switch(r12) {
                case -358818247: goto L_0x007c;
                case -218595966: goto L_0x0072;
                case 3355: goto L_0x0068;
                case 3373707: goto L_0x005f;
                case 94842723: goto L_0x0055;
                case 100313435: goto L_0x004b;
                case 342281055: goto L_0x0041;
                case 477838035: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0086
        L_0x0037:
            java.lang.String r1 = "images_with_size"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            r1 = 4
            goto L_0x0087
        L_0x0041:
            java.lang.String r1 = "logging"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            r1 = 5
            goto L_0x0087
        L_0x004b:
            java.lang.String r1 = "image"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            r1 = 2
            goto L_0x0087
        L_0x0055:
            java.lang.String r1 = "color"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            r1 = 7
            goto L_0x0087
        L_0x005f:
            java.lang.String r12 = "name"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0068:
            java.lang.String r1 = "id"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            r1 = 0
            goto L_0x0087
        L_0x0072:
            java.lang.String r1 = "more_uri"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            r1 = 6
            goto L_0x0087
        L_0x007c:
            java.lang.String r1 = "related_questions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            r1 = 3
            goto L_0x0087
        L_0x0086:
            r1 = -1
        L_0x0087:
            switch(r1) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00db;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00a3;
                case 6: goto L_0x009a;
                case 7: goto L_0x0091;
                default: goto L_0x008a;
            }
        L_0x008a:
            r14.nextValue()
            r14.skipChildren()
            goto L_0x0012
        L_0x0091:
            r14.nextValue()
            java.lang.String r10 = r13.e(r14, r15)
            goto L_0x0012
        L_0x009a:
            r14.nextValue()
            java.lang.String r9 = r13.e(r14, r15)
            goto L_0x0012
        L_0x00a3:
            r14.nextValue()
            qmj r8 = r13.d(r14, r15)
            goto L_0x0012
        L_0x00ac:
            r14.nextValue()
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x00ba
            r7 = r2
            goto L_0x0012
        L_0x00ba:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x00bf:
            com.fasterxml.jackson.core.JsonToken r1 = r14.nextToken()
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r1 == r7) goto L_0x00cf
            com.spotify.music.features.tasteonboarding.model.TasteOnboardingImage r1 = r13.f(r14, r15)
            r0.add(r1)
            goto L_0x00bf
        L_0x00cf:
            r7 = r0
            goto L_0x0012
        L_0x00d2:
            r14.nextValue()
            java.util.List r6 = r13.c(r14, r15)
            goto L_0x0012
        L_0x00db:
            r14.nextValue()
            java.lang.String r5 = r13.e(r14, r15)
            goto L_0x0012
        L_0x00e4:
            r14.nextValue()
            java.lang.String r4 = r13.e(r14, r15)
            goto L_0x0012
        L_0x00ed:
            r14.nextValue()
            java.lang.String r3 = r13.e(r14, r15)
            goto L_0x0012
        L_0x00f6:
            com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem r14 = com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem.create(r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer.g(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[Catch:{ RuntimeException -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f A[Catch:{ RuntimeException -> 0x006c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse deserialize(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r8.getCurrentToken()     // Catch:{ RuntimeException -> 0x006c }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x006c }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
        L_0x000b:
            com.fasterxml.jackson.core.JsonToken r1 = r8.nextToken()     // Catch:{ RuntimeException -> 0x006c }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x006c }
            if (r1 == r3) goto L_0x0067
            int[] r1 = com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x006c }
            com.fasterxml.jackson.core.JsonToken r3 = r8.getCurrentToken()     // Catch:{ RuntimeException -> 0x006c }
            int r3 = r3.ordinal()     // Catch:{ RuntimeException -> 0x006c }
            r1 = r1[r3]     // Catch:{ RuntimeException -> 0x006c }
            r3 = 1
            if (r1 == r3) goto L_0x0023
            goto L_0x000b
        L_0x0023:
            java.lang.String r1 = r8.getCurrentName()     // Catch:{ RuntimeException -> 0x006c }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ RuntimeException -> 0x006c }
            r6 = 1097546742(0x416b3bf6, float:14.702139)
            if (r5 == r6) goto L_0x0041
            r6 = 1217097819(0x488b705b, float:285570.84)
            if (r5 == r6) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.String r5 = "next_page"
            boolean r1 = r1.equals(r5)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "results"
            boolean r1 = r1.equals(r5)     // Catch:{ RuntimeException -> 0x006c }
            if (r1 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004c
        L_0x004b:
            r1 = -1
        L_0x004c:
            if (r1 == 0) goto L_0x005f
            if (r1 == r3) goto L_0x0057
            r8.nextValue()     // Catch:{ RuntimeException -> 0x006c }
            r8.skipChildren()     // Catch:{ RuntimeException -> 0x006c }
            goto L_0x000b
        L_0x0057:
            r8.nextValue()     // Catch:{ RuntimeException -> 0x006c }
            java.lang.String r0 = r7.e(r8, r9)     // Catch:{ RuntimeException -> 0x006c }
            goto L_0x000b
        L_0x005f:
            r8.nextValue()     // Catch:{ RuntimeException -> 0x006c }
            java.util.List r2 = r7.c(r8, r9)     // Catch:{ RuntimeException -> 0x006c }
            goto L_0x000b
        L_0x0067:
            com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse r8 = com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse.create(r2, r0)     // Catch:{ RuntimeException -> 0x006c }
            return r8
        L_0x006c:
            r8 = move-exception
        L_0x006d:
            java.lang.Throwable r0 = r8.getCause()
            if (r0 == 0) goto L_0x0078
            java.lang.Throwable r8 = r8.getCause()
            goto L_0x006d
        L_0x0078:
            java.lang.String r0 = r8.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r8 = com.fasterxml.jackson.databind.JsonMappingException.from(r9, r0, r8)
            goto L_0x0082
        L_0x0081:
            throw r8
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse");
    }
}
