package com.spotify.mobile.android.service.feature;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class AbbaModel_Deserializer extends StdDeserializer<AbbaModel> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.service.feature.AbbaModel_Deserializer$1 reason: invalid class name */
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

    AbbaModel_Deserializer() {
        super(AbbaModel.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.service.feature.AbbaFlagModel b(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
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
            int[] r1 = com.spotify.mobile.android.service.feature.AbbaModel_Deserializer.AnonymousClass1.a
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
            r6 = -377160031(0xffffffffe984fea1, float:-2.0097582E25)
            if (r5 == r6) goto L_0x0041
            r6 = 3049826(0x2e8962, float:4.273716E-39)
            if (r5 == r6) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.String r5 = "cell"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "featureName"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            r1 = 0
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
            java.lang.String r0 = r7.c(r8, r9)
            goto L_0x000b
        L_0x005f:
            r8.nextValue()
            java.lang.String r2 = r7.c(r8, r9)
            goto L_0x000b
        L_0x0067:
            com.spotify.mobile.android.service.feature.AbbaFlagModel r8 = new com.spotify.mobile.android.service.feature.AbbaFlagModel
            r8.<init>(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.feature.AbbaModel_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.service.feature.AbbaFlagModel");
    }

    private String c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbbaModel deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            while (true) {
                AbbaFlagModel[] abbaFlagModelArr = null;
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                        String currentName = jsonParser.getCurrentName();
                        char c = 65535;
                        int i = 0;
                        if (currentName.hashCode() == 97513095) {
                            if (currentName.equals("flags")) {
                                c = 0;
                            }
                        }
                        if (c != 0) {
                            jsonParser.nextValue();
                            jsonParser.skipChildren();
                        } else {
                            jsonParser.nextValue();
                            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                                LinkedList<AbbaFlagModel> linkedList = new LinkedList<>();
                                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                    linkedList.add(b(jsonParser, deserializationContext));
                                }
                                AbbaFlagModel[] abbaFlagModelArr2 = new AbbaFlagModel[linkedList.size()];
                                for (AbbaFlagModel abbaFlagModel : linkedList) {
                                    int i2 = i + 1;
                                    abbaFlagModelArr2[i] = abbaFlagModel;
                                    i = i2;
                                }
                                abbaFlagModelArr = abbaFlagModelArr2;
                            }
                        }
                    }
                }
                return new AbbaModel(abbaFlagModelArr);
            }
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }
}
