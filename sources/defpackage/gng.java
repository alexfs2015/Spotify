package defpackage;

import android.os.Build.VERSION;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;

/* renamed from: gng reason: default package */
public final class gng implements gnh {
    public final int a() {
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a = gnf.a().a(22);
        if (VERSION.SDK_INT >= 21) {
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            j = sysconf > 0 ? 1000 / sysconf : 0;
        } else {
            j = gni.a();
        }
        if (a <= 0 || j <= 0) {
            return 0;
        }
        return Math.max(0, (int) (elapsedRealtime - (a * j)));
    }
}
