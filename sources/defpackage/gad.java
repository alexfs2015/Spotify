package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.Context;
import android.os.Process;

/* renamed from: gad reason: default package */
public final class gad {
    private final Context a;
    private final a b;

    /* renamed from: gad$a */
    public static class a {
    }

    public gad(Context context) {
        this(context, new a());
    }

    private gad(Context context, a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    public final String a(String str) {
        try {
            return a();
        } catch (Exception unused) {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            for (RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(10000)) {
                if (runningServiceInfo.pid == myPid) {
                    return runningServiceInfo.process;
                }
            }
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a() {
        /*
            r7 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0048 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0048 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0048 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0048 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0048 }
            int r5 = android.os.Process.myPid()     // Catch:{ IOException -> 0x0048 }
            r4.append(r5)     // Catch:{ IOException -> 0x0048 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ IOException -> 0x0048 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0048 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0048 }
            java.nio.charset.Charset r4 = defpackage.far.b     // Catch:{ IOException -> 0x0048 }
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0048 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0048 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r2 = 64
            r0.<init>(r2)     // Catch:{ IOException -> 0x0043 }
        L_0x0030:
            int r2 = r1.read()     // Catch:{ IOException -> 0x0043 }
            if (r2 <= 0) goto L_0x003b
            char r2 = (char) r2     // Catch:{ IOException -> 0x0043 }
            r0.append(r2)     // Catch:{ IOException -> 0x0043 }
            goto L_0x0030
        L_0x003b:
            r1.close()     // Catch:{ IOException -> 0x0043 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0043 }
            return r0
        L_0x0043:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0049
        L_0x0048:
            r1 = move-exception
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            goto L_0x0050
        L_0x004f:
            throw r1
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gad.a():java.lang.String");
    }
}
