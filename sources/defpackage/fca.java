package defpackage;

import java.util.Arrays;

/* renamed from: fca reason: default package */
public final class fca {
    private final long a = 0;
    private final long b = 0;
    private final long c = 0;
    private final long d = 0;
    private final long e = 0;
    private final long f = 0;

    public fca(long j, long j2, long j3, long j4, long j5, long j6) {
        fbp.a(true);
        fbp.a(true);
        fbp.a(true);
        fbp.a(true);
        fbp.a(true);
        fbp.a(true);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fca) {
            fca fca = (fca) obj;
            if (this.a == fca.a && this.b == fca.b && this.c == fca.c && this.d == fca.d && this.e == fca.e && this.f == fca.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public final String toString() {
        return fbm.a(this).a("hitCount", this.a).a("missCount", this.b).a("loadSuccessCount", this.c).a("loadExceptionCount", this.d).a("totalLoadTime", this.e).a("evictionCount", this.f).toString();
    }
}
