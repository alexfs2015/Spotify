package defpackage;

/* renamed from: ats reason: default package */
final class ats implements a {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long[] e;

    ats(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    ats(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final boolean l_() {
        return this.e != null;
    }

    public final a a(long j) {
        double d2;
        if (!l_()) {
            return new a(new atc(0, this.a + ((long) this.b)));
        }
        long a2 = bdw.a(j, 0, this.c);
        double d3 = (double) a2;
        Double.isNaN(d3);
        double d4 = d3 * 100.0d;
        double d5 = (double) this.c;
        Double.isNaN(d5);
        double d6 = d4 / d5;
        double d7 = 0.0d;
        if (d6 > 0.0d) {
            if (d6 >= 100.0d) {
                d7 = 256.0d;
            } else {
                int i = (int) d6;
                long[] jArr = (long[]) bcu.a(this.e);
                double d8 = (double) jArr[i];
                if (i == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = (double) jArr[i + 1];
                }
                double d9 = (double) i;
                Double.isNaN(d9);
                double d10 = d6 - d9;
                Double.isNaN(d8);
                double d11 = d10 * (d2 - d8);
                Double.isNaN(d8);
                d7 = d8 + d11;
            }
        }
        double d12 = d7 / 256.0d;
        double d13 = (double) this.d;
        Double.isNaN(d13);
        return new a(new atc(a2, this.a + bdw.a(Math.round(d12 * d13), (long) this.b, this.d - 1)));
    }

    public final long c(long j) {
        long j2;
        double d2;
        long j3 = j - this.a;
        if (!l_() || j3 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = (long[]) bcu.a(this.e);
        double d3 = (double) j3;
        Double.isNaN(d3);
        double d4 = d3 * 256.0d;
        double d5 = (double) this.d;
        Double.isNaN(d5);
        double d6 = d4 / d5;
        int a2 = bdw.a(jArr, (long) d6, true, true);
        long a3 = a(a2);
        long j4 = jArr[a2];
        int i = a2 + 1;
        long a4 = a(i);
        if (a2 == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j4 == j2) {
            d2 = 0.0d;
        } else {
            double d7 = (double) j4;
            Double.isNaN(d7);
            double d8 = d6 - d7;
            double d9 = (double) (j2 - j4);
            Double.isNaN(d9);
            d2 = d8 / d9;
        }
        double d10 = (double) (a4 - a3);
        Double.isNaN(d10);
        return a3 + Math.round(d2 * d10);
    }

    public final long b() {
        return this.c;
    }

    private long a(int i) {
        return (this.c * ((long) i)) / 100;
    }
}
