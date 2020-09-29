package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.util.concurrent.Callable;

/* renamed from: caf reason: default package */
final class caf {
    private static volatile byu a;
    private static final Object b = new Object();
    private static Context c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<caf> r0 = defpackage.caf.class
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caf.a(android.content.Context):void");
    }

    static cap a(String str, cah cah, boolean z) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, cah, z);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static cap b(String str, cah cah, boolean z) {
        try {
            if (a == null) {
                bwx.a(c);
                synchronized (b) {
                    if (a == null) {
                        a = byv.a(DynamiteModule.a(c, DynamiteModule.b, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            bwx.a(c);
            try {
                if (a.a(new can(str, cah, z), cas.a(c.getPackageManager()))) {
                    return cap.a();
                }
                return cap.a((Callable<String>) new cag<String>(z, str, cah));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return cap.a("module call", e);
            }
        } catch (LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return cap.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }

    static final /* synthetic */ String a(boolean z, String str, cah cah) {
        boolean z2 = true;
        if (z || !b(str, cah, true).a) {
            z2 = false;
        }
        return cap.a(str, cah, z, z2);
    }
}
