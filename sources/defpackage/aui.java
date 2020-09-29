package defpackage;

/* renamed from: aui reason: default package */
final class aui implements a {
    private final long[] a;
    private final long[] b;
    private final long c;

    private aui(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    public static aui a(long j, long j2, atq atq, bea bea) {
        int i;
        long j3 = j;
        atq atq2 = atq;
        bea bea2 = bea;
        bea2.d(10);
        int i2 = bea.i();
        if (i2 <= 0) {
            return null;
        }
        int i3 = atq2.d;
        long b2 = ben.b((long) i2, 1000000 * ((long) (i3 >= 32000 ? 1152 : 576)), (long) i3);
        int d = bea.d();
        int d2 = bea.d();
        int d3 = bea.d();
        bea2.d(2);
        long[] jArr = new long[d];
        long[] jArr2 = new long[d];
        int i4 = 0;
        long j4 = j2 + ((long) atq2.c);
        long j5 = j2;
        while (i4 < d) {
            long j6 = b2;
            jArr[i4] = (((long) i4) * b2) / ((long) d);
            long j7 = j4;
            jArr2[i4] = Math.max(j5, j7);
            if (d3 == 1) {
                i = bea.c();
            } else if (d3 == 2) {
                i = bea.d();
            } else if (d3 == 3) {
                i = bea.f();
            } else if (d3 != 4) {
                return null;
            } else {
                i = bea.n();
            }
            j5 += (long) (i * d2);
            i4++;
            j4 = j7;
            b2 = j6;
            long j8 = j;
        }
        long j9 = b2;
        long j10 = j;
        if (!(j10 == -1 || j10 == j5)) {
            StringBuilder sb = new StringBuilder("VBRI data size mismatch: ");
            sb.append(j10);
            sb.append(", ");
            sb.append(j5);
            bdu.c("VbriSeeker", sb.toString());
        }
        return new aui(jArr, jArr2, j9);
    }

    public final a a(long j) {
        int a2 = ben.a(this.a, j, true, true);
        att att = new att(this.a[a2], this.b[a2]);
        if (att.b < j) {
            long[] jArr = this.a;
            if (a2 != jArr.length - 1) {
                int i = a2 + 1;
                return new a(att, new att(jArr[i], this.b[i]));
            }
        }
        return new a(att);
    }

    public final long b() {
        return this.c;
    }

    public final long c(long j) {
        return this.a[ben.a(this.b, j, true, true)];
    }

    public final boolean l_() {
        return true;
    }
}
