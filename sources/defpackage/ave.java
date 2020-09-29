package defpackage;

/* renamed from: ave reason: default package */
abstract class ave {
    private final ava a = new ava();
    long b;
    int c;
    private atu d;
    private atm e;
    private avc f;
    private long g;
    private long h;
    private int i;
    private a j;
    private long k;
    private boolean l;
    private boolean m;

    /* renamed from: ave$a */
    static class a {
        aqv a;
        avc b;

        a() {
        }
    }

    /* renamed from: ave$b */
    static final class b implements avc {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final long a(atl atl) {
            return -1;
        }

        public final ats a() {
            return new defpackage.ats.b(-9223372036854775807L);
        }

        public final long a_(long j) {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(atl atl) {
        boolean z = true;
        while (z) {
            if (!this.a.a(atl)) {
                this.c = 3;
                return -1;
            }
            this.k = atl.c() - this.b;
            z = a(this.a.b, this.b, this.j);
            if (z) {
                this.b = atl.c();
            }
        }
        atl atl2 = atl;
        this.i = this.j.a.r;
        if (!this.m) {
            this.d.a(this.j.a);
            this.m = true;
        }
        if (this.j.b != null) {
            this.f = this.j.b;
        } else if (atl.d() == -1) {
            this.f = new b(0);
        } else {
            avb avb = this.a.a;
            aux aux = new aux(this.b, atl.d(), this, (long) (avb.d + avb.e), avb.b, (avb.a & 4) != 0);
            this.f = aux;
        }
        this.j = null;
        this.c = 2;
        this.a.a();
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int a(atl atl, atr atr) {
        atl atl2 = atl;
        long a2 = this.f.a(atl2);
        if (a2 >= 0) {
            atr.a = a2;
            return 1;
        }
        if (a2 < -1) {
            c(-(a2 + 2));
        }
        if (!this.l) {
            this.e.a(this.f.a());
            this.l = true;
        }
        if (this.k > 0 || this.a.a(atl2)) {
            this.k = 0;
            bea bea = this.a.b;
            long b2 = b(bea);
            if (b2 >= 0) {
                long j2 = this.h;
                if (j2 + b2 >= this.g) {
                    long a3 = a(j2);
                    this.d.a(bea, bea.c);
                    this.d.a(a3, 1, bea.c, 0, null);
                    this.g = -1;
                }
            }
            this.h += b2;
            return 0;
        }
        this.c = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public final long a(long j2) {
        return (j2 * 1000000) / ((long) this.i);
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j2, long j3) {
        ava ava = this.a;
        ava.a.a();
        ava.b.a();
        ava.c = -1;
        ava.d = false;
        if (j2 == 0) {
            a(!this.l);
            return;
        }
        if (this.c != 0) {
            this.g = this.f.a_(j3);
            this.c = 2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(atm atm, atu atu) {
        this.e = atm;
        this.d = atu;
        a(true);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        if (z) {
            this.j = new a();
            this.b = 0;
            this.c = 0;
        } else {
            this.c = 1;
        }
        this.g = -1;
        this.h = 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(bea bea, long j2, a aVar);

    /* access modifiers changed from: protected */
    public final long b(long j2) {
        return (((long) this.i) * j2) / 1000000;
    }

    /* access modifiers changed from: protected */
    public abstract long b(bea bea);

    /* access modifiers changed from: protected */
    public void c(long j2) {
        this.h = j2;
    }
}
