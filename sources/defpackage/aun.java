package defpackage;

/* renamed from: aun reason: default package */
abstract class aun {
    private final auj a = new auj();
    long b;
    int c;
    private atd d;
    private asv e;
    private aul f;
    private long g;
    private long h;
    private int i;
    private a j;
    private long k;
    private boolean l;
    private boolean m;

    /* renamed from: aun$a */
    static class a {
        aqe a;
        aul b;

        a() {
        }
    }

    /* renamed from: aun$b */
    static final class b implements aul {
        public final long a(asu asu) {
            return -1;
        }

        public final long a_(long j) {
            return 0;
        }

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final atb a() {
            return new defpackage.atb.b(-9223372036854775807L);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(bdj bdj, long j2, a aVar);

    /* access modifiers changed from: protected */
    public abstract long b(bdj bdj);

    /* access modifiers changed from: 0000 */
    public final void a(asv asv, atd atd) {
        this.e = asv;
        this.d = atd;
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

    /* access modifiers changed from: 0000 */
    public final void a(long j2, long j3) {
        auj auj = this.a;
        auj.a.a();
        auj.b.a();
        auj.c = -1;
        auj.d = false;
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
    public int a(asu asu) {
        boolean z = true;
        while (z) {
            if (!this.a.a(asu)) {
                this.c = 3;
                return -1;
            }
            this.k = asu.c() - this.b;
            z = a(this.a.b, this.b, this.j);
            if (z) {
                this.b = asu.c();
            }
        }
        asu asu2 = asu;
        this.i = this.j.a.r;
        if (!this.m) {
            this.d.a(this.j.a);
            this.m = true;
        }
        if (this.j.b != null) {
            this.f = this.j.b;
        } else if (asu.d() == -1) {
            this.f = new b(0);
        } else {
            auk auk = this.a.a;
            aug aug = new aug(this.b, asu.d(), this, (long) (auk.d + auk.e), auk.b, (auk.a & 4) != 0);
            this.f = aug;
        }
        this.j = null;
        this.c = 2;
        this.a.a();
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int a(asu asu, ata ata) {
        asu asu2 = asu;
        long a2 = this.f.a(asu2);
        if (a2 >= 0) {
            ata.a = a2;
            return 1;
        }
        if (a2 < -1) {
            c(-(a2 + 2));
        }
        if (!this.l) {
            this.e.a(this.f.a());
            this.l = true;
        }
        if (this.k > 0 || this.a.a(asu2)) {
            this.k = 0;
            bdj bdj = this.a.b;
            long b2 = b(bdj);
            if (b2 >= 0) {
                long j2 = this.h;
                if (j2 + b2 >= this.g) {
                    long a3 = a(j2);
                    this.d.a(bdj, bdj.c);
                    this.d.a(a3, 1, bdj.c, 0, null);
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

    /* access modifiers changed from: protected */
    public final long b(long j2) {
        return (((long) this.i) * j2) / 1000000;
    }

    /* access modifiers changed from: protected */
    public void c(long j2) {
        this.h = j2;
    }
}
