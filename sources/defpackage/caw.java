package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.util.concurrent.Callable;

/* renamed from: caw reason: default package */
final class caw {
    private static volatile bzl a;
    private static final Object b = new Object();
    private static Context c;

    static cbg a(String str, cay cay, boolean z) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, cay, z);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static final /* synthetic */ String a(boolean z, String str, cay cay) {
        boolean z2 = true;
        if (z || !b(str, cay, true).a) {
            z2 = false;
        }
        return cbg.a(str, cay, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<caw> r0 = defpackage.caw.class
            monitor-enter(r0)
            android.content.Context r1 = c     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            c = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caw.a(android.content.Context):void");
    }

    private static cbg b(String str, cay cay, boolean z) {
        try {
            if (a == null) {
                bxo.a(c);
                synchronized (b) {
                    if (a == null) {
                        a = bzm.a(DynamiteModule.a(c, DynamiteModule.b, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            bxo.a(c);
            try {
                return a.a(new cbe(str, cay, z), cbj.a(c.getPackageManager())) ? cbg.a() : cbg.a((Callable<String>) new cax<String>(z, str, cay));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return cbg.a("module call", e);
            }
        } catch (LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return cbg.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }
}
