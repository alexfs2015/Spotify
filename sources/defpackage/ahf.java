package defpackage;

import java.util.Random;

/* renamed from: ahf reason: default package */
final class ahf implements vwl {
    private vwl a;
    private Random b;
    private double c;

    public ahf(vwl vwl, double d) {
        this(vwl, 0.1d, new Random());
    }

    private ahf(vwl vwl, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (vwl != null) {
            this.a = vwl;
            this.c = d;
            this.b = random;
        } else {
            throw new NullPointerException("backoff must not be null");
        }
    }

    public final long a(int i) {
        double d = this.c;
        double d2 = 1.0d - d;
        double nextDouble = d2 + (((d + 1.0d) - d2) * this.b.nextDouble());
        double a2 = (double) this.a.a(i);
        Double.isNaN(a2);
        return (long) (nextDouble * a2);
    }
}
