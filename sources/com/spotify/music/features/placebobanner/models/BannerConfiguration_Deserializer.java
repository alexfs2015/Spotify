package com.spotify.music.features.placebobanner.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;
import java.util.List;

public final class BannerConfiguration_Deserializer extends StdDeserializer<BannerConfiguration> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.features.placebobanner.models.BannerConfiguration_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    BannerConfiguration_Deserializer() {
        super(BannerConfiguration.class);
    }

    private static Integer a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return (Integer) NumberDeserializers.find(Integer.class, "java.lang.Integer").deserialize(jsonParser, deserializationContext);
    }

    private static Long b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return (Long) NumberDeserializers.find(Long.class, "java.lang.Long").deserialize(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.features.placebobanner.models.BannerConfiguration deserialize(com.fasterxml.jackson.core.JsonParser r14, com.fasterxml.jackson.databind.DeserializationContext r15) {
        /*
            r13 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x00fd }
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
            com.fasterxml.jackson.core.JsonToken r0 = r14.nextToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == r1) goto L_0x00f8
            int[] r0 = com.spotify.music.features.placebobanner.models.BannerConfiguration_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r1 = r14.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            int r1 = r1.ordinal()     // Catch:{ RuntimeException -> 0x00fd }
            r0 = r0[r1]     // Catch:{ RuntimeException -> 0x00fd }
            r1 = 1
            if (r0 == r1) goto L_0x002a
            goto L_0x0012
        L_0x002a:
            java.lang.String r0 = r14.getCurrentName()     // Catch:{ RuntimeException -> 0x00fd }
            r11 = -1
            int r12 = r0.hashCode()     // Catch:{ RuntimeException -> 0x00fd }
            switch(r12) {
                case -1675322599: goto L_0x007c;
                case 112204398: goto L_0x0072;
                case 209256352: goto L_0x0068;
                case 486645176: goto L_0x005e;
                case 1287124693: goto L_0x0055;
                case 1575270441: goto L_0x004b;
                case 1948915889: goto L_0x0041;
                case 2047888034: goto L_0x0037;
                default: goto L_0x0036;
            }     // Catch:{ RuntimeException -> 0x00fd }
        L_0x0036:
            goto L_0x0086
        L_0x0037:
            java.lang.String r1 = "timeWindowSeconds"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            r1 = 7
            goto L_0x0087
        L_0x0041:
            java.lang.String r1 = "configurationId"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            r1 = 0
            goto L_0x0087
        L_0x004b:
            java.lang.String r1 = "expiresAfterSec"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            r1 = 3
            goto L_0x0087
        L_0x0055:
            java.lang.String r12 = "backgroundColor"
            boolean r0 = r0.equals(r12)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            goto L_0x0087
        L_0x005e:
            java.lang.String r1 = "targetUris"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            r1 = 6
            goto L_0x0087
        L_0x0068:
            java.lang.String r1 = "receivedOn"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            r1 = 2
            goto L_0x0087
        L_0x0072:
            java.lang.String r1 = "views"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            r1 = 4
            goto L_0x0087
        L_0x007c:
            java.lang.String r1 = "showDelaySeconds"
            boolean r0 = r0.equals(r1)     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 == 0) goto L_0x0086
            r1 = 5
            goto L_0x0087
        L_0x0086:
            r1 = -1
        L_0x0087:
            switch(r1) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00a9;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0097;
                case 7: goto L_0x008e;
                default: goto L_0x008a;
            }     // Catch:{ RuntimeException -> 0x00fd }
        L_0x008a:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x00f3
        L_0x008e:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.Long r10 = b(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x0097:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.util.List r9 = r13.d(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x00a0:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.Integer r8 = a(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x00a9:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r0 = r14.getCurrentToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x00fd }
            if (r0 != r1) goto L_0x00b7
            r7 = r2
            goto L_0x0012
        L_0x00b7:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x00fd }
            r0.<init>()     // Catch:{ RuntimeException -> 0x00fd }
        L_0x00bc:
            com.fasterxml.jackson.core.JsonToken r1 = r14.nextToken()     // Catch:{ RuntimeException -> 0x00fd }
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ RuntimeException -> 0x00fd }
            if (r1 == r7) goto L_0x00cc
            com.spotify.music.features.placebobanner.models.PlaceboBannerView r1 = r13.f(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            r0.add(r1)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x00bc
        L_0x00cc:
            r7 = r0
            goto L_0x0012
        L_0x00cf:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.Long r6 = b(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x00d8:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.Long r5 = b(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x00e1:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.Integer r4 = a(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x00ea:
            r14.nextValue()     // Catch:{ RuntimeException -> 0x00fd }
            java.lang.String r3 = r13.g(r14, r15)     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x00f3:
            r14.skipChildren()     // Catch:{ RuntimeException -> 0x00fd }
            goto L_0x0012
        L_0x00f8:
            com.spotify.music.features.placebobanner.models.BannerConfiguration r14 = com.spotify.music.features.placebobanner.models.BannerConfiguration.create(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ RuntimeException -> 0x00fd }
            return r14
        L_0x00fd:
            r14 = move-exception
        L_0x00fe:
            java.lang.Throwable r0 = r14.getCause()
            if (r0 == 0) goto L_0x0109
            java.lang.Throwable r14 = r14.getCause()
            goto L_0x00fe
        L_0x0109:
            java.lang.String r0 = r14.getMessage()
            com.fasterxml.jackson.databind.JsonMappingException r14 = com.fasterxml.jackson.databind.JsonMappingException.from(r15, r0, r14)
            goto L_0x0113
        L_0x0112:
            throw r14
        L_0x0113:
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.placebobanner.models.BannerConfiguration_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.features.placebobanner.models.BannerConfiguration");
    }

    private List<String> d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(g(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.features.placebobanner.models.PlaceboBannerControl e(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
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
            int[] r3 = com.spotify.music.features.placebobanner.models.BannerConfiguration_Deserializer.AnonymousClass1.a
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
            r7 = 116079(0x1c56f, float:1.62661E-40)
            r8 = 2
            if (r6 == r7) goto L_0x0052
            r7 = 3556653(0x36452d, float:4.983932E-39)
            if (r6 == r7) goto L_0x0048
            r7 = 3575610(0x368f3a, float:5.010497E-39)
            if (r6 == r7) goto L_0x003e
            goto L_0x005c
        L_0x003e:
            java.lang.String r6 = "type"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 0
            goto L_0x005d
        L_0x0048:
            java.lang.String r6 = "text"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r6 = "url"
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
            java.lang.String r1 = r9.g(r10, r11)
            goto L_0x000c
        L_0x0072:
            r10.nextValue()
            java.lang.String r0 = r9.g(r10, r11)
            goto L_0x000c
        L_0x007a:
            r10.nextValue()
            java.lang.String r2 = r9.g(r10, r11)
            goto L_0x000c
        L_0x0082:
            com.spotify.music.features.placebobanner.models.PlaceboBannerControl r10 = com.spotify.music.features.placebobanner.models.PlaceboBannerControl.create(r2, r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.placebobanner.models.BannerConfiguration_Deserializer.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.features.placebobanner.models.PlaceboBannerControl");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.features.placebobanner.models.PlaceboBannerView f(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13) {
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
            if (r5 == r6) goto L_0x00aa
            int[] r5 = com.spotify.music.features.placebobanner.models.BannerConfiguration_Deserializer.AnonymousClass1.a
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
                case -1724546052: goto L_0x0053;
                case -566933834: goto L_0x0049;
                case 3575610: goto L_0x003f;
                case 110371416: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x005d
        L_0x0035:
            java.lang.String r8 = "title"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 1
            goto L_0x005e
        L_0x003f:
            java.lang.String r8 = "type"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 0
            goto L_0x005e
        L_0x0049:
            java.lang.String r8 = "controls"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 3
            goto L_0x005e
        L_0x0053:
            java.lang.String r8 = "description"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005d
            r5 = 2
            goto L_0x005e
        L_0x005d:
            r5 = -1
        L_0x005e:
            if (r5 == 0) goto L_0x00a1
            if (r5 == r6) goto L_0x0098
            if (r5 == r10) goto L_0x008f
            if (r5 == r9) goto L_0x006d
            r12.nextValue()
            r12.skipChildren()
            goto L_0x000e
        L_0x006d:
            r12.nextValue()
            com.fasterxml.jackson.core.JsonToken r4 = r12.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r4 != r5) goto L_0x007a
            r4 = r2
            goto L_0x000e
        L_0x007a:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
        L_0x007f:
            com.fasterxml.jackson.core.JsonToken r5 = r12.nextToken()
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r5 == r6) goto L_0x000e
            com.spotify.music.features.placebobanner.models.PlaceboBannerControl r5 = r11.e(r12, r13)
            r4.add(r5)
            goto L_0x007f
        L_0x008f:
            r12.nextValue()
            java.lang.String r3 = r11.g(r12, r13)
            goto L_0x000e
        L_0x0098:
            r12.nextValue()
            java.lang.String r1 = r11.g(r12, r13)
            goto L_0x000e
        L_0x00a1:
            r12.nextValue()
            java.lang.String r0 = r11.g(r12, r13)
            goto L_0x000e
        L_0x00aa:
            com.spotify.music.features.placebobanner.models.PlaceboBannerView r12 = com.spotify.music.features.placebobanner.models.PlaceboBannerView.create(r0, r1, r3, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.placebobanner.models.BannerConfiguration_Deserializer.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.features.placebobanner.models.PlaceboBannerView");
    }

    private String g(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    public final boolean isCachable() {
        return true;
    }
}
