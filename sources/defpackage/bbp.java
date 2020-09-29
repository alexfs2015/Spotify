package defpackage;

import java.util.List;

/* renamed from: bbp reason: default package */
public final class bbp extends bbq {
    private final bca c;
    private final long d;
    private final long e;
    private final long f;
    private final float g;
    private final float h;
    private final long i;
    private final bdn j;
    private float k = 1.0f;
    private int l = a(Long.MIN_VALUE);
    private int m = 1;
    private long n = -9223372036854775807L;

    /* renamed from: bbp$a */
    public static final class a implements defpackage.bbu.a {
        private final bca a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;
        private final float f;
        private final long g;
        private final bdn h;

        public a() {
            this(10000, 25000, 25000, 0.75f, 0.75f, 2000, bdn.a);
        }

        private a(int i, int i2, int i3, float f2, float f3, long j, bdn bdn) {
            this(null, 10000, 25000, 25000, 0.75f, 0.75f, 2000, bdn);
        }

        @Deprecated
        private a(bca bca, int i, int i2, int i3, float f2, float f3, long j, bdn bdn) {
            this.a = null;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = f2;
            this.f = f3;
            this.g = j;
            this.h = bdn;
        }

        public final /* synthetic */ bbu a(ayn ayn, bca bca, int[] iArr) {
            bca bca2 = this.a;
            bbp bbp = new bbp(ayn, iArr, bca2 != null ? bca2 : bca, (long) this.b, (long) this.c, (long) this.d, this.e, this.f, this.g, this.h);
            return bbp;
        }
    }

    public bbp(ayn ayn, int[] iArr, bca bca, long j2, long j3, long j4, float f2, float f3, long j5, bdn bdn) {
        super(ayn, iArr);
        this.c = bca;
        this.d = j2 * 1000;
        this.e = j3 * 1000;
        this.f = j4 * 1000;
        this.g = f2;
        this.h = f3;
        this.i = j5;
        this.j = bdn;
    }

    private int a(long j2) {
        long a2 = (long) (((float) this.c.a()) * this.g);
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            if (j2 == Long.MIN_VALUE || !b(i3, j2)) {
                if (((long) Math.round(((float) this.b[i3].c) * this.k)) <= a2) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public final int a() {
        return this.l;
    }

    public final int a(long j2, List<? extends azb> list) {
        long a2 = this.j.a();
        long j3 = this.n;
        if (j3 != -9223372036854775807L && a2 - j3 < this.i) {
            return list.size();
        }
        this.n = a2;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (ben.b(((azb) list.get(size - 1)).j - j2, this.k) < this.f) {
            return size;
        }
        aqv aqv = this.b[a(a2)];
        for (int i2 = 0; i2 < size; i2++) {
            azb azb = (azb) list.get(i2);
            aqv aqv2 = azb.g;
            if (ben.b(azb.j - j2, this.k) >= this.f && aqv2.c < aqv.c && aqv2.l != -1 && aqv2.l < 720 && aqv2.k != -1 && aqv2.k < 1280 && aqv2.l < aqv.l) {
                return i2;
            }
        }
        return size;
    }

    public final void a(float f2) {
        this.k = f2;
    }

    public final void a(long j2, long j3, long j4) {
        long a2 = this.j.a();
        int i2 = this.l;
        this.l = a(a2);
        if (this.l != i2) {
            if (!b(i2, a2)) {
                aqv aqv = this.b[i2];
                aqv aqv2 = this.b[this.l];
                if (aqv2.c > aqv.c) {
                    if (j3 < ((j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1)) != 0 && (j4 > this.d ? 1 : (j4 == this.d ? 0 : -1)) <= 0 ? (long) (((float) j4) * this.h) : this.d)) {
                        this.l = i2;
                    }
                }
                if (aqv2.c < aqv.c && j3 >= this.e) {
                    this.l = i2;
                }
            }
            if (this.l != i2) {
                this.m = 3;
            }
        }
    }

    public final int b() {
        return this.m;
    }

    public final Object c() {
        return null;
    }

    public final void d() {
        this.n = -9223372036854775807L;
    }
}
