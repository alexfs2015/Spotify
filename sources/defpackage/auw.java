package defpackage;

/* renamed from: auw reason: default package */
final class auw {
    public final aut a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public auw(aut aut, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = true;
        bdl.a(iArr.length == jArr2.length);
        bdl.a(jArr.length == jArr2.length);
        if (iArr2.length != jArr2.length) {
            z = false;
        }
        bdl.a(z);
        this.a = aut;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
    }

    public final int a(long j) {
        for (int a2 = ben.a(this.f, j, true, false); a2 >= 0; a2--) {
            if ((this.g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int b2 = ben.b(this.f, j, true, false); b2 < this.f.length; b2++) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
