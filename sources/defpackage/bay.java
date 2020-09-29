package defpackage;

import java.util.List;

/* renamed from: bay reason: default package */
public final class bay extends baz {
    private final bbj c;
    private final long d;
    private final long e;
    private final long f;
    private final float g;
    private final float h;
    private final long i;
    private final bcw j;
    private float k = 1.0f;
    private int l = a(Long.MIN_VALUE);
    private int m = 1;
    private long n = -9223372036854775807L;

    /* renamed from: bay$a */
    public static final class a implements defpackage.bbd.a {
        private final bbj a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;
        private final float f;
        private final long g;
        private final bcw h;

        public a() {
            this(10000, 25000, 25000, 0.75f, 0.75f, 2000, bcw.a);
        }

        private a(int i, int i2, int i3, float f2, float f3, long j, bcw bcw) {
            this(null, 10000, 25000, 25000, 0.75f, 0.75f, 2000, bcw);
        }

        @Deprecated
        private a(bbj bbj, int i, int i2, int i3, float f2, float f3, long j, bcw bcw) {
            this.a = null;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = f2;
            this.f = f3;
            this.g = j;
            this.h = bcw;
        }

        public final /* synthetic */ bbd a(axw axw, bbj bbj, int[] iArr) {
            bbj bbj2 = this.a;
            bay bay = new bay(axw, iArr, bbj2 != null ? bbj2 : bbj, (long) this.b, (long) this.c, (long) this.d, this.e, this.f, this.g, this.h);
            return bay;
        }
    }

    public final Object c() {
        return null;
    }

    public bay(axw axw, int[] iArr, bbj bbj, long j2, long j3, long j4, float f2, float f3, long j5, bcw bcw) {
        super(axw, iArr);
        this.c = bbj;
        this.d = j2 * 1000;
        this.e = j3 * 1000;
        this.f = j4 * 1000;
        this.g = f2;
        this.h = f3;
        this.i = j5;
        this.j = bcw;
    }

    public final void d() {
        this.n = -9223372036854775807L;
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
                aqe aqe = this.b[i2];
                aqe aqe2 = this.b[this.l];
                if (aqe2.c > aqe.c) {
                    if (j3 < ((j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1)) != 0 && (j4 > this.d ? 1 : (j4 == this.d ? 0 : -1)) <= 0 ? (long) (((float) j4) * this.h) : this.d)) {
                        this.l = i2;
                    }
                }
                if (aqe2.c < aqe.c && j3 >= this.e) {
                    this.l = i2;
                }
            }
            if (this.l != i2) {
                this.m = 3;
            }
        }
    }

    public final int a() {
        return this.l;
    }

    public final int b() {
        return this.m;
    }

    public final int a(long j2, List<? extends ayk> list) {
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
        if (bdw.b(((ayk) list.get(size - 1)).j - j2, this.k) < this.f) {
            return size;
        }
        aqe aqe = this.b[a(a2)];
        for (int i2 = 0; i2 < size; i2++) {
            ayk ayk = (ayk) list.get(i2);
            aqe aqe2 = ayk.g;
            if (bdw.b(ayk.j - j2, this.k) >= this.f && aqe2.c < aqe.c && aqe2.l != -1 && aqe2.l < 720 && aqe2.k != -1 && aqe2.k < 1280 && aqe2.l < aqe.l) {
                return i2;
            }
        }
        return size;
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
}
