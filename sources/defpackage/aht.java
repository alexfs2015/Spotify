package defpackage;

import java.util.Random;

/* renamed from: aht reason: default package */
final class aht implements wkr {
    private wkr a;
    private Random b;
    private double c;

    public aht(wkr wkr, double d) {
        this(wkr, 0.1d, new Random());
    }

    private aht(wkr wkr, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (wkr != null) {
            this.a = wkr;
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
