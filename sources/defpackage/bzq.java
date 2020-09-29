package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: bzq reason: default package */
public final class bzq {
    private static String a;
    private static int b;

    public static String a() {
        if (a == null) {
            if (b == 0) {
                b = Process.myPid();
            }
            a = a(b);
        }
        return a;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(int r4) {
        /*
            r0 = 0
            if (r4 > 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r1 = "/proc/"
            r2.append(r1)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            r2.append(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r4 = "/cmdline"
            r2.append(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.io.BufferedReader r4 = a(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0037, all -> 0x002c }
            java.lang.String r0 = r1.trim()     // Catch:{ IOException -> 0x0037, all -> 0x002c }
            defpackage.bzm.a(r4)
            goto L_0x003a
        L_0x002c:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0032
        L_0x0031:
            r4 = move-exception
        L_0x0032:
            defpackage.bzm.a(r0)
            throw r4
        L_0x0036:
            r4 = r0
        L_0x0037:
            defpackage.bzm.a(r4)
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzq.a(int):java.lang.String");
    }

    private static BufferedReader a(String str) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
