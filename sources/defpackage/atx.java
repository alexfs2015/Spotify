package defpackage;

/* renamed from: atx reason: default package */
public final class atx implements atk {
    private static final int a = ben.g("FLV");
    private final bea b = new bea(4);
    private final bea c = new bea(9);
    private final bea d = new bea(11);
    private final bea e = new bea();
    private final aty f = new aty();
    private atm g;
    private int h = 1;
    private long i = -9223372036854775807L;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private atw o;
    private atz p;

    static {
        $$Lambda$atx$aYJGna6WY2YT_xtrXLC9tsDNdg r0 = $$Lambda$atx$aYJGna6WY2YT_xtrXLC9tsDNdg.INSTANCE;
    }

    private void a() {
        if (!this.n) {
            this.g.a(new b(-9223372036854775807L));
            this.n = true;
        }
        if (this.i == -9223372036854775807L) {
            this.i = this.f.a == -9223372036854775807L ? -this.m : 0;
        }
    }

    private bea b(atl atl) {
        if (this.l > this.e.a.length) {
            bea bea = this.e;
            bea.a(new byte[Math.max(bea.a.length << 1, this.l)], 0);
        } else {
            this.e.c(0);
        }
        this.e.b(this.l);
        atl.b(this.e.a, 0, this.l);
        return this.e;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] b() {
        return new atk[]{new atx()};
    }

    public final int a(atl atl, atr atr) {
        while (true) {
            int i2 = this.h;
            boolean z = false;
            boolean z2 = true;
            if (i2 == 1) {
                if (atl.a(this.c.a, 0, 9, true)) {
                    this.c.c(0);
                    this.c.d(4);
                    int c2 = this.c.c();
                    boolean z3 = (c2 & 4) != 0;
                    if ((c2 & 1) != 0) {
                        z = true;
                    }
                    if (z3 && this.o == null) {
                        this.o = new atw(this.g.a(8, 1));
                    }
                    if (z && this.p == null) {
                        this.p = new atz(this.g.a(9, 2));
                    }
                    this.g.a();
                    this.j = (this.c.i() - 9) + 4;
                    this.h = 2;
                    z = true;
                }
                if (!z) {
                    return -1;
                }
            } else if (i2 == 2) {
                atl.b(this.j);
                this.j = 0;
                this.h = 3;
            } else if (i2 == 3) {
                if (atl.a(this.d.a, 0, 11, true)) {
                    this.d.c(0);
                    this.k = this.d.c();
                    this.l = this.d.f();
                    this.m = (long) this.d.f();
                    this.m = (((long) (this.d.c() << 24)) | this.m) * 1000;
                    this.d.d(3);
                    this.h = 4;
                    z = true;
                }
                if (!z) {
                    return -1;
                }
            } else if (i2 == 4) {
                if (this.k == 8 && this.o != null) {
                    a();
                    this.o.b(b(atl), this.i + this.m);
                } else if (this.k == 9 && this.p != null) {
                    a();
                    this.p.b(b(atl), this.i + this.m);
                } else if (this.k != 18 || this.n) {
                    atl.b(this.l);
                    z2 = false;
                } else {
                    this.f.b(b(atl), this.m);
                    long j2 = this.f.a;
                    if (j2 != -9223372036854775807L) {
                        this.g.a(new b(j2));
                        this.n = true;
                    }
                }
                this.j = 4;
                this.h = 2;
                if (z2) {
                    return 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void a(long j2, long j3) {
        this.h = 1;
        this.i = -9223372036854775807L;
        this.j = 0;
    }

    public final void a(atm atm) {
        this.g = atm;
    }

    public final boolean a(atl atl) {
        atl.c(this.b.a, 0, 3);
        this.b.c(0);
        if (this.b.f() != a) {
            return false;
        }
        atl.c(this.b.a, 0, 2);
        this.b.c(0);
        if ((this.b.d() & 250) != 0) {
            return false;
        }
        atl.c(this.b.a, 0, 4);
        this.b.c(0);
        int i2 = this.b.i();
        atl.a();
        atl.c(i2);
        atl.c(this.b.a, 0, 4);
        this.b.c(0);
        return this.b.i() == 0;
    }
}
