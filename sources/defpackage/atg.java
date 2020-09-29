package defpackage;

/* renamed from: atg reason: default package */
public final class atg implements ast {
    private static final int a = bdw.g("FLV");
    private final bdj b = new bdj(4);
    private final bdj c = new bdj(9);
    private final bdj d = new bdj(11);
    private final bdj e = new bdj();
    private final ath f = new ath();
    private asv g;
    private int h = 1;
    private long i = -9223372036854775807L;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private atf o;
    private ati p;

    static {
        $$Lambda$atg$L1RnoLnnBpamq1UuUW80Yha7mGA r0 = $$Lambda$atg$L1RnoLnnBpamq1UuUW80Yha7mGA.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] b() {
        return new ast[]{new atg()};
    }

    public final boolean a(asu asu) {
        asu.c(this.b.a, 0, 3);
        this.b.c(0);
        if (this.b.f() != a) {
            return false;
        }
        asu.c(this.b.a, 0, 2);
        this.b.c(0);
        if ((this.b.d() & 250) != 0) {
            return false;
        }
        asu.c(this.b.a, 0, 4);
        this.b.c(0);
        int i2 = this.b.i();
        asu.a();
        asu.c(i2);
        asu.c(this.b.a, 0, 4);
        this.b.c(0);
        if (this.b.i() == 0) {
            return true;
        }
        return false;
    }

    public final void a(asv asv) {
        this.g = asv;
    }

    public final void a(long j2, long j3) {
        this.h = 1;
        this.i = -9223372036854775807L;
        this.j = 0;
    }

    public final int a(asu asu, ata ata) {
        while (true) {
            int i2 = this.h;
            boolean z = false;
            boolean z2 = true;
            if (i2 == 1) {
                if (asu.a(this.c.a, 0, 9, true)) {
                    this.c.c(0);
                    this.c.d(4);
                    int c2 = this.c.c();
                    boolean z3 = (c2 & 4) != 0;
                    if ((c2 & 1) != 0) {
                        z = true;
                    }
                    if (z3 && this.o == null) {
                        this.o = new atf(this.g.a(8, 1));
                    }
                    if (z && this.p == null) {
                        this.p = new ati(this.g.a(9, 2));
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
                asu.b(this.j);
                this.j = 0;
                this.h = 3;
            } else if (i2 == 3) {
                if (asu.a(this.d.a, 0, 11, true)) {
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
                    this.o.b(b(asu), this.i + this.m);
                } else if (this.k == 9 && this.p != null) {
                    a();
                    this.p.b(b(asu), this.i + this.m);
                } else if (this.k != 18 || this.n) {
                    asu.b(this.l);
                    z2 = false;
                } else {
                    this.f.b(b(asu), this.m);
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

    private bdj b(asu asu) {
        if (this.l > this.e.a.length) {
            bdj bdj = this.e;
            bdj.a(new byte[Math.max(bdj.a.length << 1, this.l)], 0);
        } else {
            this.e.c(0);
        }
        this.e.b(this.l);
        asu.b(this.e.a, 0, this.l);
        return this.e;
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
}
