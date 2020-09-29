package defpackage;

import java.util.Arrays;

/* renamed from: fbj reason: default package */
public final class fbj {
    private final long a = 0;
    private final long b = 0;
    private final long c = 0;
    private final long d = 0;
    private final long e = 0;
    private final long f = 0;

    public fbj(long j, long j2, long j3, long j4, long j5, long j6) {
        fay.a(true);
        fay.a(true);
        fay.a(true);
        fay.a(true);
        fay.a(true);
        fay.a(true);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fbj) {
            fbj fbj = (fbj) obj;
            if (this.a == fbj.a && this.b == fbj.b && this.c == fbj.c && this.d == fbj.d && this.e == fbj.e && this.f == fbj.f) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return fav.a(this).a("hitCount", this.a).a("missCount", this.b).a("loadSuccessCount", this.c).a("loadExceptionCount", this.d).a("totalLoadTime", this.e).a("evictionCount", this.f).toString();
    }
}
