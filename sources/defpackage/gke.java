package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: gke reason: default package */
public final class gke {
    final long a;
    public final long b;
    public final long c;

    private gke(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public static gke a(long j) {
        return b(j * 1000);
    }

    static gke b(long j) {
        long j2 = j + 29000;
        long days = TimeUnit.MILLISECONDS.toDays(j2);
        long hours = TimeUnit.MILLISECONDS.toHours(j2) - TimeUnit.DAYS.toHours(days);
        gke gke = new gke(days, hours, (TimeUnit.MILLISECONDS.toMinutes(j2) - TimeUnit.DAYS.toMinutes(days)) - TimeUnit.HOURS.toMinutes(hours));
        return gke;
    }
}
