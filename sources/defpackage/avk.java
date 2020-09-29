package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: avk reason: default package */
public final class avk implements atk {
    private static final int a = ben.g("ID3");
    private final int b;
    private final avl c;
    private final bea d;
    private final bea e;
    private final bdz f;
    private final long g;
    private atm h;
    private long i;
    private long j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;

    static {
        $$Lambda$avk$nSwHGgk9fITP91yvRaLV5Z3Awe8 r0 = $$Lambda$avk$nSwHGgk9fITP91yvRaLV5Z3Awe8.INSTANCE;
    }

    public avk() {
        this(0);
    }

    private avk(long j2) {
        this(0, 0);
    }

    public avk(long j2, int i2) {
        this.g = j2;
        this.i = j2;
        this.b = i2;
        this.c = new avl(true);
        this.d = new bea(2048);
        this.k = -1;
        this.j = -1;
        this.e = new bea(10);
        this.f = new bdz(this.e.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] a() {
        return new atk[]{new avk()};
    }

    private int b(atl atl) {
        int i2 = 0;
        while (true) {
            atl.c(this.e.a, 0, 10);
            this.e.c(0);
            if (this.e.f() != a) {
                break;
            }
            this.e.d(3);
            int m2 = this.e.m();
            i2 += m2 + 10;
            atl.c(m2);
        }
        atl.a();
        atl.c(i2);
        if (this.j == -1) {
            this.j = (long) i2;
        }
        return i2;
    }

    public final int a(atl atl, atr atr) {
        atl atl2 = atl;
        long d2 = atl.d();
        boolean z = ((this.b & 1) == 0 || d2 == -1) ? false : true;
        if (z && !this.l) {
            this.k = -1;
            atl.a();
            long j2 = 0;
            if (atl.c() == 0) {
                b(atl);
            }
            int i2 = 0;
            while (true) {
                if (!atl2.b(this.e.a, 0, 2, true)) {
                    break;
                }
                this.e.c(0);
                if (avl.a(this.e.d())) {
                    if (!atl2.b(this.e.a, 0, 4, true)) {
                        break;
                    }
                    this.f.a(14);
                    int c2 = this.f.c(13);
                    if (c2 > 6) {
                        j2 += (long) c2;
                        i2++;
                        if (i2 != 1000) {
                            if (!atl2.a(c2 - 6, true)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        this.l = true;
                        throw new ParserException("Malformed ADTS stream");
                    }
                } else {
                    i2 = 0;
                    break;
                }
            }
            atl.a();
            if (i2 > 0) {
                this.k = (int) (j2 / ((long) i2));
            } else {
                this.k = -1;
            }
            this.l = true;
        }
        int a2 = atl2.a(this.d.a, 0, 2048);
        boolean z2 = a2 == -1;
        if (!this.n) {
            boolean z3 = z && this.k > 0;
            if (!z3 || this.c.a != -9223372036854775807L || z2) {
                atm atm = (atm) bdl.a(this.h);
                if (!z3 || this.c.a == -9223372036854775807L) {
                    atm.a(new b(-9223372036854775807L));
                } else {
                    atg atg = new atg(d2, this.j, (int) ((((long) (this.k << 3)) * 1000000) / this.c.a), this.k);
                    atm.a(atg);
                }
                this.n = true;
            }
        }
        if (z2) {
            return -1;
        }
        this.d.c(0);
        this.d.b(a2);
        if (!this.m) {
            this.c.b = this.i;
            this.m = true;
        }
        this.c.a(this.d);
        return 0;
    }

    public final void a(long j2, long j3) {
        this.m = false;
        this.c.c();
        this.i = this.g + j3;
    }

    public final void a(atm atm) {
        this.h = atm;
        this.c.a(atm, new d(0, 1));
        atm.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.a();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.atl r9) {
        /*
            r8 = this;
            int r0 = r8.b(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            bea r5 = r8.e
            byte[] r5 = r5.a
            r6 = 2
            r9.c(r5, r1, r6)
            bea r5 = r8.e
            r5.c(r1)
            bea r5 = r8.e
            int r5 = r5.d()
            boolean r5 = defpackage.avl.a(r5)
            if (r5 != 0) goto L_0x0031
            r9.a()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.c(r3)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            bea r5 = r8.e
            byte[] r5 = r5.a
            r9.c(r5, r1, r6)
            bdz r5 = r8.f
            r6 = 14
            r5.a(r6)
            bdz r5 = r8.f
            r6 = 13
            int r5 = r5.c(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.c(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avk.a(atl):boolean");
    }
}
