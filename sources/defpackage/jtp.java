package defpackage;

import android.os.SystemClock;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: jtp reason: default package */
public final class jtp implements jtz {
    @Deprecated
    public static final jtz a = new jtp();

    public final long a() {
        return System.currentTimeMillis();
    }

    public final void a(long j) {
        SystemClock.sleep(100);
    }

    public final long b() {
        return (System.nanoTime() / 1000) / 1000;
    }

    public final long c() {
        return SystemClock.elapsedRealtime();
    }

    public final long d() {
        return SystemClock.uptimeMillis();
    }

    public final TimeZone e() {
        return TimeZone.getDefault();
    }

    public final Calendar f() {
        return Calendar.getInstance();
    }
}
