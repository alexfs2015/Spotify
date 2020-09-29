package defpackage;

import android.content.Context;

/* renamed from: byx reason: default package */
public final class byx {
    private static Object a = new Object();
    private static boolean b;
    private static String c;
    private static int d;

    public static String a(Context context) {
        c(context);
        return c;
    }

    public static int b(Context context) {
        c(context);
        return d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(android.content.Context r3) {
        /*
            java.lang.Object r0 = a
            monitor-enter(r0)
            boolean r1 = b     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0009:
            r1 = 1
            b = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r3.getPackageName()     // Catch:{ all -> 0x0032 }
            caa r3 = defpackage.cab.a(r3)     // Catch:{ all -> 0x0032 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.a(r1, r2)     // Catch:{ NameNotFoundException -> 0x0030 }
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0030 }
            if (r3 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0020:
            java.lang.String r1 = "com.google.app.id"
            java.lang.String r1 = r3.getString(r1)     // Catch:{ NameNotFoundException -> 0x0030 }
            c = r1     // Catch:{ NameNotFoundException -> 0x0030 }
            java.lang.String r1 = "com.google.android.gms.version"
            int r3 = r3.getInt(r1)     // Catch:{ NameNotFoundException -> 0x0030 }
            d = r3     // Catch:{ NameNotFoundException -> 0x0030 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byx.c(android.content.Context):void");
    }
}
