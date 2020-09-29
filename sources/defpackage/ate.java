package defpackage;

/* renamed from: ate reason: default package */
public abstract class ate {
    private a a;
    private g b;
    private d c;
    private final int d;

    /* renamed from: ate$a */
    public static class a implements ats {
        final e a;
        final long b;
        final long c;
        final long d;
        final long e;
        final long f;
        private final long g;

        public a(e eVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = eVar;
            this.g = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = j5;
            this.f = j6;
        }

        public final defpackage.ats.a a(long j) {
            return new defpackage.ats.a(new att(j, d.a(this.a.a(j), this.b, this.c, this.d, this.e, this.f)));
        }

        public final long b() {
            return this.g;
        }

        public final boolean l_() {
            return true;
        }
    }

    /* renamed from: ate$b */
    public static final class b implements e {
        public final long a(long j) {
            return j;
        }
    }

    /* renamed from: ate$c */
    public static final class c {
    }

    /* renamed from: ate$d */
    public static class d {
        final long a;
        final long b;
        long c;
        long d;
        long e;
        long f;
        long g;
        private final long h;

        protected d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = j5;
            this.f = j6;
            this.h = j7;
            this.g = a(j2, j3, j4, j5, j6, j7);
        }

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return ben.a(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.g = a(this.b, this.c, this.d, this.e, this.f, this.h);
        }
    }

    /* renamed from: ate$e */
    public interface e {
        long a(long j);
    }

    /* renamed from: ate$f */
    public static final class f {
        public static final f a;
        /* access modifiers changed from: private */
        public final int b;
        /* access modifiers changed from: private */
        public final long c;
        /* access modifiers changed from: private */
        public final long d;

        static {
            f fVar = new f(-3, -9223372036854775807L, -1);
            a = fVar;
        }

        private f(int i, long j, long j2) {
            this.b = i;
            this.c = j;
            this.d = j2;
        }

        public static f a(long j) {
            f fVar = new f(0, -9223372036854775807L, j);
            return fVar;
        }

        public static f a(long j, long j2) {
            f fVar = new f(-1, j, j2);
            return fVar;
        }

        public static f b(long j, long j2) {
            f fVar = new f(-2, j, j2);
            return fVar;
        }
    }

    /* renamed from: ate$g */
    public interface g {
        f a(atl atl, long j);
    }

    protected ate(e eVar, g gVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = gVar;
        this.d = i;
        a aVar = new a(eVar, j, 0, j3, 0, j5, 188);
        this.a = aVar;
    }

    private static int a(atl atl, long j, atr atr) {
        if (j == atl.c()) {
            return 0;
        }
        atr.a = j;
        return 1;
    }

    private static boolean a(atl atl, long j) {
        long c2 = j - atl.c();
        if (c2 < 0 || c2 > 262144) {
            return false;
        }
        atl.b((int) c2);
        return true;
    }

    public final int a(atl atl, atr atr, c cVar) {
        g gVar = (g) bdl.a(this.b);
        while (true) {
            d dVar = (d) bdl.a(this.c);
            long j = dVar.e;
            long j2 = dVar.f;
            long j3 = dVar.g;
            if (j2 - j <= ((long) this.d)) {
                this.c = null;
                return a(atl, j, atr);
            } else if (!a(atl, j3)) {
                return a(atl, j3, atr);
            } else {
                atl.a();
                f a2 = gVar.a(atl, dVar.b);
                int a3 = a2.b;
                if (a3 == -3) {
                    this.c = null;
                    return a(atl, j3, atr);
                } else if (a3 == -2) {
                    long b2 = a2.c;
                    long c2 = a2.d;
                    dVar.c = b2;
                    dVar.e = c2;
                    dVar.a();
                } else if (a3 == -1) {
                    long b3 = a2.c;
                    long c3 = a2.d;
                    dVar.d = b3;
                    dVar.f = c3;
                    dVar.a();
                } else if (a3 == 0) {
                    a2.d;
                    this.c = null;
                    a(atl, a2.d);
                    return a(atl, a2.d, atr);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final ats a() {
        return this.a;
    }

    public final void a(long j) {
        long j2 = j;
        d dVar = this.c;
        if (dVar == null || dVar.a != j2) {
            long a2 = this.a.a.a(j2);
            long j3 = this.a.b;
            long j4 = this.a.c;
            long j5 = this.a.d;
            long j6 = this.a.e;
            long j7 = this.a.f;
            d dVar2 = r1;
            d dVar3 = new d(j, a2, j3, j4, j5, j6, j7);
            this.c = dVar2;
        }
    }

    public final boolean b() {
        return this.c != null;
    }
}
