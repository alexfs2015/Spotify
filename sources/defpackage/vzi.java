package defpackage;

/* renamed from: vzi reason: default package */
public final class vzi<T> {
    static final /* synthetic */ boolean j = (!vzi.class.desiredAssertionStatus());
    public final vzf<T> a;
    final long[] b;
    public vzi<T> c;
    public vzi<T> d;
    public boolean e;
    public int f;
    int g;
    int h;
    int i;
    private final int k;
    private final int l;
    private final int m;
    private int n;

    public vzi(int i2) {
        this.a = null;
        this.k = -1;
        this.l = -1;
        this.f = -1;
        this.m = i2;
        this.b = null;
    }

    vzi(vzi<T> vzi, vzf<T> vzf, int i2, int i3, int i4, int i5) {
        this.a = vzf;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.b = new long[(i4 >>> 10)];
        a(vzi, i5);
    }

    /* access modifiers changed from: 0000 */
    public final void a(vzi<T> vzi, int i2) {
        this.e = true;
        this.f = i2;
        if (i2 != 0) {
            int i3 = this.m / i2;
            this.i = i3;
            this.g = i3;
            this.h = 0;
            int i4 = this.g;
            this.n = i4 >>> 6;
            if ((i4 & 63) != 0) {
                this.n++;
            }
            for (int i5 = 0; i5 < this.n; i5++) {
                this.b[i5] = 0;
            }
        }
        a(vzi);
    }

    public final long a() {
        if (this.f == 0) {
            return a(0);
        }
        if (this.i == 0 || !this.e) {
            return -1;
        }
        int d2 = d();
        int i2 = d2 >>> 6;
        int i3 = d2 & 63;
        if (j || ((this.b[i2] >>> i3) & 1) == 0) {
            long[] jArr = this.b;
            jArr[i2] = (1 << i3) | jArr[i2];
            int i4 = this.i - 1;
            this.i = i4;
            if (i4 == 0) {
                b();
            }
            return a(d2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public void a(vzi<T> vzi) {
        if (j || (this.c == null && this.d == null)) {
            this.c = vzi;
            this.d = vzi.d;
            this.d.c = this;
            vzi.d = this;
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (j || !(this.c == null || this.d == null)) {
            vzi<T> vzi = this.c;
            vzi.d = this.d;
            this.d.c = vzi;
            this.d = null;
            this.c = null;
            return;
        }
        throw new AssertionError();
    }

    private int d() {
        int i2 = this.h;
        if (i2 < 0) {
            return e();
        }
        this.h = -1;
        return i2;
    }

    private int e() {
        long[] jArr = this.b;
        int i2 = this.n;
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = jArr[i3];
            if ((-1 ^ j2) != 0) {
                return a(i3, j2);
            }
        }
        return -1;
    }

    private int a(int i2, long j2) {
        int i3 = this.g;
        int i4 = i2 << 6;
        int i5 = 0;
        while (true) {
            if (i5 >= 64) {
                break;
            } else if ((1 & j2) == 0) {
                int i6 = i4 | i5;
                if (i6 < i3) {
                    return i6;
                }
            } else {
                j2 >>>= 1;
                i5++;
            }
        }
        return -1;
    }

    private long a(int i2) {
        return (((long) i2) << 32) | 4611686018427387904L | ((long) this.k);
    }

    public final String toString() {
        String str = "(";
        if (!this.e) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(this.k);
            sb.append(": not in use)");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.k);
        sb2.append(": ");
        sb2.append(this.g - this.i);
        sb2.append('/');
        sb2.append(this.g);
        sb2.append(", offset: ");
        sb2.append(this.l);
        sb2.append(", length: ");
        sb2.append(this.m);
        sb2.append(", elemSize: ");
        sb2.append(this.f);
        sb2.append(')');
        return sb2.toString();
    }

    public final void c() {
        vzf<T> vzf = this.a;
        if (vzf != null) {
            vzf.b();
        }
    }
}
