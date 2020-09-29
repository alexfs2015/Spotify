package defpackage;

/* renamed from: aqy reason: default package */
final class aqy {
    public final ayf a;
    public final Object b;
    public final ayk[] c;
    public boolean d;
    public boolean e;
    public aqz f;
    public aqy g;
    public ayo h;
    public bbx i;
    long j;
    private boolean[] k;
    private final arg[] l;
    private final bbw m;
    private final ayg n;
    private bbx o;

    public aqy(arg[] argArr, long j2, bbw bbw, bbz bbz, ayg ayg, aqz aqz) {
        axw axw;
        this.l = argArr;
        this.j = j2 - aqz.b;
        this.m = bbw;
        this.n = ayg;
        this.b = bdl.a(aqz.a.a);
        this.f = aqz;
        this.c = new ayk[argArr.length];
        this.k = new boolean[argArr.length];
        ayf a2 = ayg.a(aqz.a, bbz);
        if (aqz.a.e != Long.MIN_VALUE) {
            axw axw2 = new axw(a2, true, 0, aqz.a.e);
            axw = axw2;
        } else {
            axw = a2;
        }
        this.a = axw;
    }

    private void a(bbx bbx) {
        this.o = bbx;
        bbx bbx2 = this.o;
        if (bbx2 != null) {
            b(bbx2);
        }
    }

    private void a(ayk[] aykArr) {
        int i2 = 0;
        while (true) {
            arg[] argArr = this.l;
            if (i2 < argArr.length) {
                if (argArr[i2].a() == 6) {
                    aykArr[i2] = null;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private static void b(bbx bbx) {
        for (int i2 = 0; i2 < bbx.a; i2++) {
            boolean a2 = bbx.a(i2);
            bbu bbu = bbx.c.b[i2];
            if (a2 && bbu != null) {
                bbu.d();
            }
        }
    }

    private void b(ayk[] aykArr) {
        int i2 = 0;
        while (true) {
            arg[] argArr = this.l;
            if (i2 < argArr.length) {
                if (argArr[i2].a() == 6 && this.i.a(i2)) {
                    aykArr[i2] = new ayc();
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
        bbv bbv = this.i.c;
        long a2 = this.a.a(bbv.a(), this.k, this.c, zArr, j2);
        b(this.c);
        this.e = false;
        int i3 = 0;
        while (true) {
            ayk[] aykArr = this.c;
            if (i3 >= aykArr.length) {
                return a2;
            }
            if (aykArr[i3] != null) {
                bdl.b(this.i.a(i3));
                if (this.l[i3].a() != 6) {
                    this.e = true;
                }
            } else {
                bdl.b(bbv.b[i3] == null);
            }
            i3++;
        }
    }

    public final long a(boolean z) {
        if (!this.d) {
            return this.f.b;
        }
        long d2 = this.e ? this.a.d() : Long.MIN_VALUE;
        return (d2 != Long.MIN_VALUE || !z) ? d2 : this.f.d;
    }

    public final boolean a() {
        return this.d && (!this.e || this.a.d() == Long.MIN_VALUE);
    }

    public final boolean a(float f2) {
        bbu[] a2;
        bbx a3 = this.m.a(this.l, this.h);
        if (a3.a(this.o)) {
            return false;
        }
        this.i = a3;
        for (bbu bbu : this.i.c.a()) {
            if (bbu != null) {
                bbu.a(f2);
            }
        }
        return true;
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

    public final void c() {
        a((bbx) null);
        try {
            if (this.f.a.e != Long.MIN_VALUE) {
                this.n.a(((axw) this.a).a);
            } else {
                this.n.a(this.a);
            }
        } catch (RuntimeException e2) {
            bdu.b("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final void c(long j2) {
        this.a.c(a(j2));
    }
}
