package defpackage;

/* renamed from: avj reason: default package */
public final class avj implements avp {
    long a;
    private final bdz b;
    private final bea c;
    private final String d;
    private String e;
    private atu f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private aqv k;
    private int l;

    public avj() {
        this(null);
    }

    public avj(String str) {
        this.b = new bdz(new byte[128]);
        this.c = new bea(this.b.a);
        this.g = 0;
        this.d = str;
    }

    private boolean a(bea bea, byte[] bArr, int i2) {
        int min = Math.min(bea.b(), 128 - this.h);
        bea.a(bArr, this.h, min);
        this.h += min;
        return this.h == 128;
    }

    private boolean b(bea bea) {
        while (true) {
            boolean z = false;
            if (bea.b() <= 0) {
                return false;
            }
            if (!this.i) {
                if (bea.c() == 11) {
                    z = true;
                }
                this.i = z;
            } else {
                int c2 = bea.c();
                if (c2 == 119) {
                    this.i = false;
                    return true;
                }
                if (c2 == 11) {
                    z = true;
                }
                this.i = z;
            }
        }
    }

    private void c() {
        this.b.a(0);
        a a2 = aro.a(this.b);
        if (!(this.k != null && a2.c == this.k.q && a2.b == this.k.r && a2.a == this.k.f)) {
            this.k = aqv.a(this.e, a2.a, (String) null, -1, -1, a2.c, a2.b, null, (ast) null, 0, this.d);
            this.f.a(this.k);
        }
        this.l = a2.d;
        this.j = (((long) a2.e) * 1000000) / ((long) this.k.r);
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    public final void a(long j2, boolean z) {
        this.a = j2;
    }

    public final void a(atm atm, d dVar) {
        dVar.a();
        this.e = dVar.c();
        this.f = atm.a(dVar.b(), 1);
    }

    public final void a(bea bea) {
        while (bea.b() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(bea.b(), this.l - this.h);
                        this.f.a(bea, min);
                        this.h += min;
                        int i3 = this.h;
                        int i4 = this.l;
                        if (i3 == i4) {
                            this.f.a(this.a, 1, i4, 0, null);
                            this.a += this.j;
                            this.g = 0;
                        }
                    }
                } else if (a(bea, this.c.a, 128)) {
                    c();
                    this.c.c(0);
                    this.f.a(this.c, 128);
                    this.g = 2;
                }
            } else if (b(bea)) {
                this.g = 1;
                this.c.a[0] = 11;
                this.c.a[1] = 119;
                this.h = 2;
            }
        }
    }

    public final void b() {
    }
}