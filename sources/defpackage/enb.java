package defpackage;

/* renamed from: enb reason: default package */
final class enb {
    private static final Class<?> a = c();

    public static enc a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return enc.a;
    }

    private static final enc a(String str) {
        return (enc) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.enc b() {
        /*
            java.lang.Class<?> r0 = a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            enc r0 = a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            enc r0 = defpackage.enc.c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            enc r0 = a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enb.b():enc");
    }

    private static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
