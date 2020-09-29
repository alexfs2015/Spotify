package defpackage;

/* renamed from: aqh reason: default package */
final class aqh {
    public final axo a;
    public final Object b;
    public final axt[] c;
    public boolean d;
    public boolean e;
    public aqi f;
    public aqh g;
    public axx h;
    public bbg i;
    long j;
    private boolean[] k;
    private final aqp[] l;
    private final bbf m;
    private final axp n;
    private bbg o;

    public aqh(aqp[] aqpArr, long j2, bbf bbf, bbi bbi, axp axp, aqi aqi) {
        axf axf;
        this.l = aqpArr;
        this.j = j2 - aqi.b;
        this.m = bbf;
        this.n = axp;
        this.b = bcu.a(aqi.a.a);
        this.f = aqi;
        this.c = new axt[aqpArr.length];
        this.k = new boolean[aqpArr.length];
        axo a2 = axp.a(aqi.a, bbi);
        if (aqi.a.e != Long.MIN_VALUE) {
            axf axf2 = new axf(a2, true, 0, aqi.a.e);
            axf = axf2;
        } else {
            axf = a2;
        }
        this.a = axf;
    }

    public final boolean a() {
        return this.d && (!this.e || this.a.d() == Long.MIN_VALUE);
    }

    public final long a(boolean z) {
        if (!this.d) {
            return this.f.b;
        }
        long d2 = this.e ? this.a.d() : Long.MIN_VALUE;
        return (d2 != Long.MIN_VALUE || !z) ? d2 : this.f.d;
    }

    public final long b() {
        if (!this.d) {
            return 0;
        }
        return this.a.e();
    }

    public final void b(long j2) {
        if (this.d) {
            this.a.a(a(j2));
        }
    }

    public final void c(long j2) {
        this.a.c(a(j2));
    }

    public final boolean a(float f2) {
        bbd[] a2;
        bbg a3 = this.m.a(this.l, this.h);
        if (a3.a(this.o)) {
            return false;
        }
        this.i = a3;
        for (bbd bbd : this.i.c.a()) {
            if (bbd != null) {
                bbd.a(f2);
            }
        }
        return true;
    }

    public final long a(long j2, boolean z) {
        return a(j2, false, new boolean[this.l.length]);
    }

    public final long a(long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= this.i.a) {
                break;
            }
            boolean[] zArr2 = this.k;
            if (z || !this.i.a(this.o, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        a(this.c);
        a(this.i);
        bbe bbe = this.i.c;
        long a2 = this.a.a(bbe.a(), this.k, this.c, zArr, j2);
        b(this.c);
        this.e = false;
        int i3 = 0;
        while (true) {
            axt[] axtArr = this.c;
            if (i3 >= axtArr.length) {
                return a2;
            }
            if (axtArr[i3] != null) {
                bcu.b(this.i.a(i3));
                if (this.l[i3].a() != 6) {
                    this.e = true;
                }
            } else {
                bcu.b(bbe.b[i3] == null);
            }
            i3++;
        }
    }

    public final void c() {
        a((bbg) null);
        try {
            if (this.f.a.e != Long.MIN_VALUE) {
                this.n.a(((axf) this.a).a);
            } else {
                this.n.a(this.a);
            }
        } catch (RuntimeException e2) {
            bdd.b("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    private void a(bbg bbg) {
        this.o = bbg;
        bbg bbg2 = this.o;
        if (bbg2 != null) {
            b(bbg2);
        }
    }

    private static void b(bbg bbg) {
        for (int i2 = 0; i2 < bbg.a; i2++) {
            boolean a2 = bbg.a(i2);
            bbd bbd = bbg.c.b[i2];
            if (a2 && bbd != null) {
                bbd.d();
            }
        }
    }

    private void a(axt[] axtArr) {
        int i2 = 0;
        while (true) {
            aqp[] aqpArr = this.l;
            if (i2 < aqpArr.length) {
                if (aqpArr[i2].a() == 6) {
                    axtArr[i2] = null;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void b(axt[] axtArr) {
        int i2 = 0;
        while (true) {
            aqp[] aqpArr = this.l;
            if (i2 < aqpArr.length) {
                if (aqpArr[i2].a() == 6 && this.i.a(i2)) {
                    axtArr[i2] = new axl();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final long a(long j2) {
        return j2 - this.j;
    }
}
