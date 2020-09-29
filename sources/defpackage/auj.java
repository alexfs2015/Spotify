package defpackage;

/* renamed from: auj reason: default package */
final class auj implements a {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long[] e;

    auj(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    auj(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    private long a(int i) {
        return (this.c * ((long) i)) / 100;
    }

    public final a a(long j) {
        if (!l_()) {
            return new a(new att(0, this.a + ((long) this.b)));
        }
        long a2 = ben.a(j, 0, this.c);
        double d2 = (double) a2;
        Double.isNaN(d2);
        double d3 = d2 * 100.0d;
        double d4 = (double) this.c;
        Double.isNaN(d4);
        double d5 = d3 / d4;
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d6 = 256.0d;
            } else {
                int i = (int) d5;
                long[] jArr = (long[]) bdl.a(this.e);
                double d7 = (double) jArr[i];
                double d8 = i == 99 ? 256.0d : (double) jArr[i + 1];
                double d9 = (double) i;
                Double.isNaN(d9);
                double d10 = d5 - d9;
                Double.isNaN(d7);
                double d11 = d10 * (d8 - d7);
                Double.isNaN(d7);
                d6 = d7 + d11;
            }
        }
        double d12 = d6 / 256.0d;
        double d13 = (double) this.d;
        Double.isNaN(d13);
        return new a(new att(a2, this.a + ben.a(Math.round(d12 * d13), (long) this.b, this.d - 1)));
    }

    public final long b() {
        return this.c;
    }

    public final long c(long j) {
        double d2;
        long j2 = j - this.a;
        if (!l_() || j2 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = (long[]) bdl.a(this.e);
        double d3 = (double) j2;
        Double.isNaN(d3);
        double d4 = d3 * 256.0d;
        double d5 = (double) this.d;
        Double.isNaN(d5);
        double d6 = d4 / d5;
        int a2 = ben.a(jArr, (long) d6, true, true);
        long a3 = a(a2);
        long j3 = jArr[a2];
        int i = a2 + 1;
        long a4 = a(i);
        long j4 = a2 == 99 ? 256 : jArr[i];
        if (j3 == j4) {
            d2 = 0.0d;
        } else {
            double d7 = (double) j3;
            Double.isNaN(d7);
            double d8 = d6 - d7;
            double d9 = (double) (j4 - j3);
            Double.isNaN(d9);
            d2 = d8 / d9;
        }
        double d10 = (double) (a4 - a3);
        Double.isNaN(d10);
        return a3 + Math.round(d2 * d10);
    }

    public final boolean l_() {
        return this.e != null;
    }
}
