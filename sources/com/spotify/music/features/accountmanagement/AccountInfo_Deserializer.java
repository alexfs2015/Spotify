package com.spotify.music.features.accountmanagement;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class AccountInfo_Deserializer extends StdDeserializer<AccountInfo> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.features.accountmanagement.AccountInfo_Deserializer$1 reason: invalid class name */
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

    AccountInfo_Deserializer() {
        super(AccountInfo.class);
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    private Product c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str2 = null;
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != 106934601) {
                    if (hashCode != 957831062) {
                        if (hashCode == 1392294689 && currentName.equals("country_has_additional_tax")) {
                            c = 1;
                        }
                    } else if (currentName.equals("country")) {
                        c = 0;
                    }
                } else if (currentName.equals("price")) {
                    c = 2;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = d(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    z = a(jsonParser, deserializationContext);
                } else if (c != 2) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    str2 = d(jsonParser, deserializationContext);
                }
            }
        }
        return new Product(str, z, str2);
    }

    private String d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [com.spotify.music.features.accountmanagement.AccountInfo$PaymentProvider] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.spotify.music.features.accountmanagement.AccountInfo$PaymentProvider] */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r11v20 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r11v21 */
    /* JADX WARNING: type inference failed for: r11v22 */
    /* JADX WARNING: type inference failed for: r11v23 */
    /* JADX WARNING: type inference failed for: r11v24 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r11v25 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r11v26 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v2
      assigns: []
      uses: []
      mth insns count: 195
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
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f3 A[Catch:{ RuntimeException -> 0x0163 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010f A[Catch:{ RuntimeException -> 0x0163 }] */
    /* JADX WARNING: Unknown variable types count: 17 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.features.accountmanagement.AccountInfo deserialize(com.fasterxml.jackson.core.JsonParser r17, com.fasterxml.jackson.databind.DeserializationContext r18) {
        /*
            r16 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r17.getCurrentToken()     // Catch:{ RuntimeException -> 0x0163 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0163 }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r7 = r2
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0012:
            com.fasterxml.jackson.core.JsonToken r1 = r17.nextToken()     // Catch:{ RuntimeException -> 0x0163 }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == r3) goto L_0x015c
            int[] r1 = com.spotify.music.features.accountmanagement.AccountInfo_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0163 }
            com.fasterxml.jackson.core.JsonToken r3 = r17.getCurrentToken()     // Catch:{ RuntimeException -> 0x0163 }
            int r3 = r3.ordinal()     // Catch:{ RuntimeException -> 0x0163 }
            r1 = r1[r3]     // Catch:{ RuntimeException -> 0x0163 }
            r3 = 1
            if (r1 == r3) goto L_0x002b
            goto L_0x0159
        L_0x002b:
            java.lang.String r1 = r17.getCurrentName()     // Catch:{ RuntimeException -> 0x0163 }
            int r12 = r1.hashCode()     // Catch:{ RuntimeException -> 0x0163 }
            r13 = -1
            r14 = 2
            switch(r12) {
                case -1362750424: goto L_0x007f;
                case -1124287838: goto L_0x0075;
                case -57366487: goto L_0x006b;
                case 475919162: goto L_0x0061;
                case 573201120: goto L_0x0057;
                case 719802496: goto L_0x004d;
                case 941382563: goto L_0x0043;
                case 1285643454: goto L_0x0039;
                default: goto L_0x0038;
            }     // Catch:{ RuntimeException -> 0x0163 }
        L_0x0038:
            goto L_0x0089
        L_0x0039:
            java.lang.String r12 = "next_billing_date"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 5
            goto L_0x008a
        L_0x0043:
            java.lang.String r12 = "next_product"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 4
            goto L_0x008a
        L_0x004d:
            java.lang.String r12 = "will_recur"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 1
            goto L_0x008a
        L_0x0057:
            java.lang.String r12 = "recurring_details"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 7
            goto L_0x008a
        L_0x0061:
            java.lang.String r12 = "expiry_date"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 6
            goto L_0x008a
        L_0x006b:
            java.lang.String r12 = "current_product"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 3
            goto L_0x008a
        L_0x0075:
            java.lang.String r12 = "has_subscription"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 0
            goto L_0x008a
        L_0x007f:
            java.lang.String r12 = "grace_period"
            boolean r1 = r1.equals(r12)     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 == 0) goto L_0x0089
            r1 = 2
            goto L_0x008a
        L_0x0089:
            r1 = -1
        L_0x008a:
            switch(r1) {
                case 0: goto L_0x014e;
                case 1: goto L_0x0146;
                case 2: goto L_0x013e;
                case 3: goto L_0x0136;
                case 4: goto L_0x012e;
                case 5: goto L_0x0126;
                case 6: goto L_0x011e;
                case 7: goto L_0x0092;
                default: goto L_0x008d;
            }     // Catch:{ RuntimeException -> 0x0163 }
        L_0x008d:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0156
        L_0x0092:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            com.fasterxml.jackson.core.JsonToken r1 = r17.getCurrentToken()     // Catch:{ RuntimeException -> 0x0163 }
            com.fasterxml.jackson.core.JsonToken r11 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x0163 }
            if (r1 != r11) goto L_0x00a0
            r11 = r2
            goto L_0x0159
        L_0x00a0:
            r1 = r2
            r11 = r1
            r12 = r11
        L_0x00a3:
            com.fasterxml.jackson.core.JsonToken r15 = r17.nextToken()     // Catch:{ RuntimeException -> 0x0163 }
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x0163 }
            if (r15 == r0) goto L_0x0117
            int[] r0 = com.spotify.music.features.accountmanagement.AccountInfo_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x0163 }
            com.fasterxml.jackson.core.JsonToken r15 = r17.getCurrentToken()     // Catch:{ RuntimeException -> 0x0163 }
            int r15 = r15.ordinal()     // Catch:{ RuntimeException -> 0x0163 }
            r0 = r0[r15]     // Catch:{ RuntimeException -> 0x0163 }
            if (r0 == r3) goto L_0x00ba
            goto L_0x00fd
        L_0x00ba:
            java.lang.String r0 = r17.getCurrentName()     // Catch:{ RuntimeException -> 0x0163 }
            int r15 = r0.hashCode()     // Catch:{ RuntimeException -> 0x0163 }
            r2 = -1724546052(0xffffffff993583fc, float:-9.384135E-24)
            if (r15 == r2) goto L_0x00e6
            r2 = -987494927(0xffffffffc52405f1, float:-2624.3713)
            if (r15 == r2) goto L_0x00dc
            r2 = 957831062(0x39175796, float:1.443311E-4)
            if (r15 == r2) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            java.lang.String r2 = "country"
            boolean r0 = r0.equals(r2)     // Catch:{ RuntimeException -> 0x0163 }
            if (r0 == 0) goto L_0x00f0
            r0 = 2
            goto L_0x00f1
        L_0x00dc:
            java.lang.String r2 = "provider"
            boolean r0 = r0.equals(r2)     // Catch:{ RuntimeException -> 0x0163 }
            if (r0 == 0) goto L_0x00f0
            r0 = 0
            goto L_0x00f1
        L_0x00e6:
            java.lang.String r2 = "description"
            boolean r0 = r0.equals(r2)     // Catch:{ RuntimeException -> 0x0163 }
            if (r0 == 0) goto L_0x00f0
            r0 = 1
            goto L_0x00f1
        L_0x00f0:
            r0 = -1
        L_0x00f1:
            if (r0 == 0) goto L_0x010f
            if (r0 == r3) goto L_0x0107
            if (r0 == r14) goto L_0x00ff
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            r17.skipChildren()     // Catch:{ RuntimeException -> 0x0163 }
        L_0x00fd:
            r2 = 0
            goto L_0x00a3
        L_0x00ff:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            java.lang.String r12 = r16.d(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x00fd
        L_0x0107:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            java.lang.String r11 = r16.d(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x00fd
        L_0x010f:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            java.lang.String r1 = r16.d(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x00fd
        L_0x0117:
            com.spotify.music.features.accountmanagement.AccountInfo$PaymentProvider r0 = new com.spotify.music.features.accountmanagement.AccountInfo$PaymentProvider     // Catch:{ RuntimeException -> 0x0163 }
            r0.<init>(r1, r11, r12)     // Catch:{ RuntimeException -> 0x0163 }
            r11 = r0
            goto L_0x0159
        L_0x011e:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            java.lang.String r10 = r16.d(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0159
        L_0x0126:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            java.lang.String r9 = r16.d(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0159
        L_0x012e:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            com.spotify.music.features.accountmanagement.AccountInfo$Product r8 = r16.c(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0159
        L_0x0136:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            com.spotify.music.features.accountmanagement.AccountInfo$Product r7 = r16.c(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0159
        L_0x013e:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            boolean r6 = a(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0159
        L_0x0146:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            boolean r5 = a(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0159
        L_0x014e:
            r17.nextValue()     // Catch:{ RuntimeException -> 0x0163 }
            boolean r4 = a(r17, r18)     // Catch:{ RuntimeException -> 0x0163 }
            goto L_0x0159
        L_0x0156:
            r17.skipChildren()     // Catch:{ RuntimeException -> 0x0163 }
        L_0x0159:
            r2 = 0
            goto L_0x0012
        L_0x015c:
            com.spotify.music.features.accountmanagement.AccountInfo r0 = new com.spotify.music.features.accountmanagement.AccountInfo     // Catch:{ RuntimeException -> 0x0163 }
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x0163 }
            return r0
        L_0x0163:
            r0 = move-exception
        L_0x0164:
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x016f
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0164
        L_0x016f:
            java.lang.String r1 = r0.getMessage()
            r2 = r18
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r2, r1, r0)
            goto L_0x017b
        L_0x017a:
            throw r0
        L_0x017b:
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.accountmanagement.AccountInfo_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.features.accountmanagement.AccountInfo");
    }
}
