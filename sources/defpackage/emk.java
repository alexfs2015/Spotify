package defpackage;

/* renamed from: emk reason: default package */
final class emk {
    private static final Class<?> a = c();

    private static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static eml a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return eml.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.eml b() {
        /*
            java.lang.Class<?> r0 = a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            eml r0 = a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            eml r0 = defpackage.eml.c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            eml r0 = a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emk.b():eml");
    }

    private static final eml a(String str) {
        return (eml) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
