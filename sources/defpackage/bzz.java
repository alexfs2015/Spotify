package defpackage;

import android.content.Context;

/* renamed from: bzz reason: default package */
public final class bzz {
    private static Context a;
    private static Boolean b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r3) {
        /*
            java.lang.Class<bzz> r0 = defpackage.bzz.class
            monitor-enter(r0)
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x004f }
            android.content.Context r2 = a     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r2 = b     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x001b
            android.content.Context r2 = a     // Catch:{ all -> 0x004f }
            if (r2 != r1) goto L_0x001b
            java.lang.Boolean r3 = b     // Catch:{ all -> 0x004f }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004f }
            monitor-exit(r0)
            return r3
        L_0x001b:
            r2 = 0
            b = r2     // Catch:{ all -> 0x004f }
            boolean r2 = defpackage.bzo.i()     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0033
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch:{ all -> 0x004f }
            boolean r3 = r3.isInstantApp()     // Catch:{ all -> 0x004f }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x004f }
            b = r3     // Catch:{ all -> 0x004f }
            goto L_0x0045
        L_0x0033:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r3.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0041 }
            b = r3     // Catch:{ ClassNotFoundException -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004f }
            b = r3     // Catch:{ all -> 0x004f }
        L_0x0045:
            a = r1     // Catch:{ all -> 0x004f }
            java.lang.Boolean r3 = b     // Catch:{ all -> 0x004f }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x004f }
            monitor-exit(r0)
            return r3
        L_0x004f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzz.a(android.content.Context):boolean");
    }
}
