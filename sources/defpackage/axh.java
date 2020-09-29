package defpackage;

/* renamed from: axh reason: default package */
public final class axh implements axu {
    private axu[] a;

    public axh(axu[] axuArr) {
        this.a = axuArr;
    }

    public final long d() {
        long j = Long.MAX_VALUE;
        for (axu d : this.a) {
            long d2 = d.d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long e() {
        long j = Long.MAX_VALUE;
        for (axu e : this.a) {
            long e2 = e.e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void a(long j) {
        for (axu a2 : this.a) {
            a2.a(j);
        }
    }

    public final boolean c(long j) {
        axu[] axuArr;
        long j2 = j;
        boolean z = false;
        while (true) {
            long e = e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            boolean z2 = false;
            for (axu axu : this.a) {
                long e2 = axu.e();
                boolean z3 = e2 != Long.MIN_VALUE && e2 <= j2;
                if (e2 == e || z3) {
                    z2 |= axu.c(j2);
                }
            }
            z |= z2;
            if (!z2) {
                break;
            }
        }
        return z;
    }
}
