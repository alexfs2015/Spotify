package defpackage;

/* renamed from: ked reason: default package */
final class ked extends kef {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final int m;
    private final int n;
    private final int o;
    private final long p;
    private final long q;
    private final int r;
    private final long s;
    private final float t;
    private final int u;

    /* renamed from: ked$a */
    static final class a extends a {
        private Long a;
        private Long b;
        private Long c;
        private Long d;
        private Long e;
        private Long f;
        private Long g;
        private Long h;
        private Long i;
        private Long j;
        private Long k;
        private Long l;
        private Integer m;
        private Integer n;
        private Integer o;
        private Long p;
        private Long q;
        private Integer r;
        private Long s;
        private Float t;
        private Integer u;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final a a(float f2) {
            this.t = Float.valueOf(f2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a a(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a a(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final kef a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" msPlayed");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" msNominalPlayed");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" msPlayedBackground");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" msPlayedFullscreen");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" msPlayedSubtitles");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" msUnionPlayed");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" msMaxContinuousPlayed");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" msInitialBuffering");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" msBufferingSeek");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" msBufferingSeekLongest");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" msBufferingStall");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" msBufferingStallLongest");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" nStalls");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" nSeekForward");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" nSeekBackward");
                str = sb15.toString();
            }
            if (this.p == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" msSeekForward");
                str = sb16.toString();
            }
            if (this.q == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" msSeekBackward");
                str = sb17.toString();
            }
            if (this.r == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" startBitrate");
                str = sb18.toString();
            }
            if (this.s == null) {
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append(" bytesTransferred");
                str = sb19.toString();
            }
            if (this.t == null) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append(" averageScreenRotation");
                str = sb20.toString();
            }
            if (this.u == null) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append(" nViewTransitions");
                str = sb21.toString();
            }
            if (str.isEmpty()) {
                ked ked = new ked(this.a.longValue(), this.b.longValue(), this.c.longValue(), this.d.longValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h.longValue(), this.i.longValue(), this.j.longValue(), this.k.longValue(), this.l.longValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.longValue(), this.q.longValue(), this.r.intValue(), this.s.longValue(), this.t.floatValue(), this.u.intValue(), 0);
                return ked;
            }
            StringBuilder sb22 = new StringBuilder("Missing required properties:");
            sb22.append(str);
            throw new IllegalStateException(sb22.toString());
        }

        /* access modifiers changed from: 0000 */
        public final a b(int i2) {
            this.n = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a b(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a c(int i2) {
            this.o = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a c(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a d(int i2) {
            this.r = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a d(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a e(int i2) {
            this.u = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a e(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a f(long j2) {
            this.f = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a g(long j2) {
            this.g = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a h(long j2) {
            this.h = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a i(long j2) {
            this.i = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a j(long j2) {
            this.j = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a k(long j2) {
            this.k = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a l(long j2) {
            this.l = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a m(long j2) {
            this.p = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a n(long j2) {
            this.q = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final a o(long j2) {
            this.s = Long.valueOf(j2);
            return this;
        }
    }

    private ked(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, int i3, int i4, long j14, long j15, int i5, long j16, float f2, int i6) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = j8;
        this.h = j9;
        this.i = j10;
        this.j = j11;
        this.k = j12;
        this.l = j13;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = j14;
        this.q = j15;
        this.r = i5;
        this.s = j16;
        this.t = f2;
        this.u = i6;
    }

    /* synthetic */ ked(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, int i3, int i4, long j14, long j15, int i5, long j16, float f2, int i6, byte b2) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, i2, i3, i4, j14, j15, i5, j16, f2, i6);
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kef) {
            kef kef = (kef) obj;
            return this.a == kef.a() && this.b == kef.b() && this.c == kef.c() && this.d == kef.d() && this.e == kef.e() && this.f == kef.f() && this.g == kef.g() && this.h == kef.h() && this.i == kef.i() && this.j == kef.j() && this.k == kef.k() && this.l == kef.l() && this.m == kef.m() && this.n == kef.n() && this.o == kef.o() && this.p == kef.p() && this.q == kef.q() && this.r == kef.r() && this.s == kef.s() && Float.floatToIntBits(this.t) == Float.floatToIntBits(kef.t()) && this.u == kef.u();
        }
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public final int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.b;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.c;
        int i4 = (i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.d;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.e;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f;
        int i7 = (i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.h;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.i;
        int i10 = (i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.j;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.k;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.l;
        int i13 = (((((((i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003;
        long j14 = this.p;
        int i14 = (i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        long j15 = this.q;
        int i15 = (((i14 ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003) ^ this.r) * 1000003;
        long j16 = this.s;
        return this.u ^ ((((i15 ^ ((int) (j16 ^ (j16 >>> 32)))) * 1000003) ^ Float.floatToIntBits(this.t)) * 1000003);
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.j;
    }

    public final long k() {
        return this.k;
    }

    public final long l() {
        return this.l;
    }

    public final int m() {
        return this.m;
    }

    public final int n() {
        return this.n;
    }

    public final int o() {
        return this.o;
    }

    public final long p() {
        return this.p;
    }

    public final long q() {
        return this.q;
    }

    public final int r() {
        return this.r;
    }

    public final long s() {
        return this.s;
    }

    public final float t() {
        return this.t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasicPlaybackStatistics{msPlayed=");
        sb.append(this.a);
        sb.append(", msNominalPlayed=");
        sb.append(this.b);
        sb.append(", msPlayedBackground=");
        sb.append(this.c);
        sb.append(", msPlayedFullscreen=");
        sb.append(this.d);
        sb.append(", msPlayedSubtitles=");
        sb.append(this.e);
        sb.append(", msUnionPlayed=");
        sb.append(this.f);
        sb.append(", msMaxContinuousPlayed=");
        sb.append(this.g);
        sb.append(", msInitialBuffering=");
        sb.append(this.h);
        sb.append(", msBufferingSeek=");
        sb.append(this.i);
        sb.append(", msBufferingSeekLongest=");
        sb.append(this.j);
        sb.append(", msBufferingStall=");
        sb.append(this.k);
        sb.append(", msBufferingStallLongest=");
        sb.append(this.l);
        sb.append(", nStalls=");
        sb.append(this.m);
        sb.append(", nSeekForward=");
        sb.append(this.n);
        sb.append(", nSeekBackward=");
        sb.append(this.o);
        sb.append(", msSeekForward=");
        sb.append(this.p);
        sb.append(", msSeekBackward=");
        sb.append(this.q);
        sb.append(", startBitrate=");
        sb.append(this.r);
        sb.append(", bytesTransferred=");
        sb.append(this.s);
        sb.append(", averageScreenRotation=");
        sb.append(this.t);
        sb.append(", nViewTransitions=");
        sb.append(this.u);
        sb.append("}");
        return sb.toString();
    }

    public final int u() {
        return this.u;
    }
}
