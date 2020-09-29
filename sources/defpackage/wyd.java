package defpackage;

import io.netty.util.internal.ThreadLocalRandom;

/* renamed from: wyd reason: default package */
public abstract class wyd {
    private static volatile wyd a;

    static {
        Class<wyd> cls = wyd.class;
        a = c(cls.getName());
        try {
            Class.forName(ThreadLocalRandom.class.getName(), true, cls.getClassLoader());
        } catch (Exception unused) {
        }
    }

    public static wyc a(Class<?> cls) {
        return a.b(cls.getName());
    }

    public static wyc a(String str) {
        return a.b(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.wyd c(java.lang.String r3) {
        /*
            wyh r0 = new wyh     // Catch:{ all -> 0x0010 }
            r1 = 1
            r0.<init>(r1)     // Catch:{ all -> 0x0010 }
            wyc r1 = r0.b(r3)     // Catch:{ all -> 0x0010 }
            java.lang.String r2 = "Using SLF4J as the default logging framework"
            r1.b(r2)     // Catch:{ all -> 0x0010 }
            goto L_0x0027
        L_0x0010:
            wyd r0 = defpackage.wyf.a     // Catch:{ all -> 0x001c }
            wyc r1 = r0.b(r3)     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "Using Log4J as the default logging framework"
            r1.b(r2)     // Catch:{ all -> 0x001c }
            goto L_0x0027
        L_0x001c:
            wyd r0 = defpackage.wye.a
            wyc r3 = r0.b(r3)
            java.lang.String r1 = "Using java.util.logging as the default logging framework"
            r3.b(r1)
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyd.c(java.lang.String):wyd");
    }

    /* access modifiers changed from: protected */
    public abstract wyc b(String str);
}
