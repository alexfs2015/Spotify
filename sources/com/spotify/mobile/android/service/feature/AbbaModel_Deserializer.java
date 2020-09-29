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

    AbbaModel_Deserializer() {
        super(AbbaModel.class);
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
                                    int i3 = i2;
                                    i = i2;
                                }
                                AbbaFlagModel[] abbaFlagModelArr3 = abbaFlagModelArr2;
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

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.mobile.android.service.feature.AbbaFlagModel b(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10) {
        /*
            r8 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r9.getCurrentToken()
            r7 = 0
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r7 = 1
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r7 = 1
            return r2
        L_0x000d:
            r0 = r2
            r0 = r2
        L_0x000f:
            r7 = 3
            com.fasterxml.jackson.core.JsonToken r1 = r9.nextToken()
            r7 = 5
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r3) goto L_0x0082
            int[] r1 = com.spotify.mobile.android.service.feature.AbbaModel_Deserializer.AnonymousClass1.a
            r7 = 7
            com.fasterxml.jackson.core.JsonToken r3 = r9.getCurrentToken()
            r7 = 0
            int r3 = r3.ordinal()
            r7 = 6
            r1 = r1[r3]
            r3 = 1
            r7 = r3
            if (r1 == r3) goto L_0x002e
            r7 = 5
            goto L_0x000f
        L_0x002e:
            r7 = 2
            java.lang.String r1 = r9.getCurrentName()
            r7 = 1
            r4 = -1
            r7 = 7
            int r5 = r1.hashCode()
            r7 = 6
            r6 = -377160031(0xffffffffe984fea1, float:-2.0097582E25)
            r7 = 3
            if (r5 == r6) goto L_0x0054
            r7 = 3
            r6 = 3049826(0x2e8962, float:4.273716E-39)
            if (r5 == r6) goto L_0x0048
            goto L_0x0061
        L_0x0048:
            java.lang.String r5 = "cell"
            boolean r1 = r1.equals(r5)
            r7 = 5
            if (r1 == 0) goto L_0x0061
            r1 = 1
            r7 = 1
            goto L_0x0062
        L_0x0054:
            java.lang.String r5 = "featureName"
            r7 = 6
            boolean r1 = r1.equals(r5)
            r7 = 4
            if (r1 == 0) goto L_0x0061
            r1 = 0
            r7 = 1
            goto L_0x0062
        L_0x0061:
            r1 = -1
        L_0x0062:
            if (r1 == 0) goto L_0x0079
            r7 = 5
            if (r1 == r3) goto L_0x006f
            r7 = 5
            r9.nextValue()
            r9.skipChildren()
            goto L_0x000f
        L_0x006f:
            r9.nextValue()
            r7 = 2
            java.lang.String r0 = r8.c(r9, r10)
            r7 = 3
            goto L_0x000f
        L_0x0079:
            r9.nextValue()
            r7 = 5
            java.lang.String r2 = r8.c(r9, r10)
            goto L_0x000f
        L_0x0082:
            com.spotify.mobile.android.service.feature.AbbaFlagModel r9 = new com.spotify.mobile.android.service.feature.AbbaFlagModel
            r7 = 0
            r9.<init>(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.feature.AbbaModel_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.service.feature.AbbaFlagModel");
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
