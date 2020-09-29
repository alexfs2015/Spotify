package defpackage;

/* renamed from: atr reason: default package */
final class atr implements a {
    private final long[] a;
    private final long[] b;
    private final long c;

    public final boolean l_() {
        return true;
    }

    public static atr a(long j, long j2, asz asz, bdj bdj) {
        int i;
        long j3 = j;
        asz asz2 = asz;
        bdj bdj2 = bdj;
        bdj2.d(10);
        int i2 = bdj.i();
        if (i2 <= 0) {
            return null;
        }
        int i3 = asz2.d;
        long b2 = bdw.b((long) i2, 1000000 * ((long) (i3 >= 32000 ? 1152 : 576)), (long) i3);
        int d = bdj.d();
        int d2 = bdj.d();
        int d3 = bdj.d();
        bdj2.d(2);
        long[] jArr = new long[d];
        long[] jArr2 = new long[d];
        int i4 = 0;
        long j4 = j2 + ((long) asz2.c);
        long j5 = j2;
        while (i4 < d) {
            long j6 = b2;
            jArr[i4] = (((long) i4) * b2) / ((long) d);
            long j7 = j4;
            jArr2[i4] = Math.max(j5, j7);
            if (d3 == 1) {
                i = bdj.c();
            } else if (d3 == 2) {
                i = bdj.d();
            } else if (d3 == 3) {
                i = bdj.f();
            } else if (d3 != 4) {
                return null;
            } else {
                i = bdj.n();
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
            bdd.c("VbriSeeker", sb.toString());
        }
        return new atr(jArr, jArr2, j9);
    }

    private atr(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    public final a a(long j) {
        int a2 = bdw.a(this.a, j, true, true);
        atc atc = new atc(this.a[a2], this.b[a2]);
        if (atc.b < j) {
            long[] jArr = this.a;
            if (a2 != jArr.length - 1) {
                int i = a2 + 1;
                return new a(atc, new atc(jArr[i], this.b[i]));
            }
        }
        return new a(atc);
    }

    public final long c(long j) {
        return this.a[bdw.a(this.b, j, true, true)];
    }

    public final long b() {
        return this.c;
    }
}
