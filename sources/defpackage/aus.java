package defpackage;

/* renamed from: aus reason: default package */
public final class aus implements auy {
    long a;
    private final bdi b;
    private final bdj c;
    private final String d;
    private String e;
    private atd f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private aqe k;
    private int l;

    public final void b() {
    }

    public aus() {
        this(null);
    }

    public aus(String str) {
        this.b = new bdi(new byte[128]);
        this.c = new bdj(this.b.a);
        this.g = 0;
        this.d = str;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    public final void a(asv asv, d dVar) {
        dVar.a();
        this.e = dVar.c();
        this.f = asv.a(dVar.b(), 1);
    }

    public final void a(long j2, boolean z) {
        this.a = j2;
    }

    public final void a(bdj bdj) {
        while (bdj.b() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(bdj.b(), this.l - this.h);
                        this.f.a(bdj, min);
                        this.h += min;
                        int i3 = this.h;
                        int i4 = this.l;
                        if (i3 == i4) {
                            this.f.a(this.a, 1, i4, 0, null);
                            this.a += this.j;
                            this.g = 0;
                        }
                    }
                } else if (a(bdj, this.c.a, 128)) {
                    c();
                    this.c.c(0);
                    this.f.a(this.c, 128);
                    this.g = 2;
                }
            } else if (b(bdj)) {
                this.g = 1;
                this.c.a[0] = 11;
                this.c.a[1] = 119;
                this.h = 2;
            }
        }
    }

    private boolean a(bdj bdj, byte[] bArr, int i2) {
        int min = Math.min(bdj.b(), 128 - this.h);
        bdj.a(bArr, this.h, min);
        this.h += min;
        return this.h == 128;
    }

    private boolean b(bdj bdj) {
        while (true) {
            boolean z = false;
            if (bdj.b() <= 0) {
                return false;
            }
            if (!this.i) {
                if (bdj.c() == 11) {
                    z = true;
                }
                this.i = z;
            } else {
                int c2 = bdj.c();
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
        a a2 = aqx.a(this.b);
        if (!(this.k != null && a2.c == this.k.q && a2.b == this.k.r && a2.a == this.k.f)) {
            this.k = aqe.a(this.e, a2.a, (String) null, -1, -1, a2.c, a2.b, null, (asc) null, 0, this.d);
            this.f.a(this.k);
        }
        this.l = a2.d;
        this.j = (((long) a2.e) * 1000000) / ((long) this.k.r);
    }
}
