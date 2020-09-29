package defpackage;

/* renamed from: axw reason: default package */
public final class axw implements ayf, defpackage.ayf.a {
    public final ayf a;
    long b = 0;
    long c;
    private defpackage.ayf.a d;
    private a[] e = new a[0];
    private long f = 0;

    /* renamed from: axw$a */
    final class a implements ayk {
        public final ayk a;
        boolean b;

        public a(ayk ayk) {
            this.a = ayk;
        }

        public final int a(aqw aqw, asm asm, boolean z) {
            if (axw.this.f()) {
                return -3;
            }
            if (this.b) {
                asm.a = 4;
                return -4;
            }
            int a2 = this.a.a(aqw, asm, z);
            if (a2 == -5) {
                aqv aqv = aqw.a;
                if (!(aqv.t == 0 && aqv.u == 0)) {
                    int i = 0;
                    int i2 = axw.this.b != 0 ? 0 : aqv.t;
                    if (axw.this.c == Long.MIN_VALUE) {
                        i = aqv.u;
                    }
                    aqw.a = aqv.a(i2, i);
                }
                return -5;
            } else if (axw.this.c == Long.MIN_VALUE || ((a2 != -4 || asm.d < axw.this.c) && (a2 != -3 || axw.this.d() != Long.MIN_VALUE))) {
                return a2;
            } else {
                asm.a();
                asm.a = 4;
                this.b = true;
                return -4;
            }
        }

        public final boolean a() {
            return !axw.this.f() && this.a.a();
        }

        public final void b() {
            this.a.b();
        }

        public final int b_(long j) {
            if (axw.this.f()) {
                return -3;
            }
            return this.a.b_(j);
        }
    }

    public axw(ayf ayf, boolean z, long j, long j2) {
        this.a = ayf;
        this.c = j2;
    }

    public final long a(long j, arj arj) {
        long j2 = this.b;
        if (j == j2) {
            return j2;
        }
        long a2 = ben.a(arj.c, 0, j - this.b);
        long j3 = arj.d;
        long j4 = this.c;
        long a3 = ben.a(j3, 0, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (!(a2 == arj.c && a3 == arj.d)) {
            arj = new arj(a2, a3);
        }
        return this.a.a(j, arj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r1 > r5) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bbu[] r16, boolean[] r17, defpackage.ayk[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            axw$a[] r1 = new defpackage.axw.a[r1]
            r0.e = r1
            int r1 = r9.length
            ayk[] r10 = new defpackage.ayk[r1]
            r11 = 0
            r1 = 0
        L_0x000f:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0028
            axw$a[] r2 = r0.e
            r3 = r9[r1]
            axw$a r3 = (defpackage.axw.a) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L_0x0023
            r2 = r2[r1]
            ayk r12 = r2.a
        L_0x0023:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0028:
            ayf r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.a(r2, r3, r4, r5, r6)
            boolean r3 = r15.f()
            r4 = 1
            if (r3 == 0) goto L_0x0068
            long r5 = r0.b
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0068
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0063
            int r3 = r8.length
            r5 = 0
        L_0x004c:
            if (r5 >= r3) goto L_0x0063
            r6 = r8[r5]
            if (r6 == 0) goto L_0x0060
            aqv r6 = r6.g()
            java.lang.String r6 = r6.f
            boolean r6 = defpackage.bdx.a(r6)
            if (r6 != 0) goto L_0x0060
            r3 = 1
            goto L_0x0064
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0068
            r5 = r1
            goto L_0x006d
        L_0x0068:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006d:
            r0.f = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0087
            long r5 = r0.b
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0086
            long r5 = r0.c
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0087
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            defpackage.bdl.b(r4)
        L_0x008a:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00b8
            r3 = r10[r11]
            if (r3 != 0) goto L_0x0096
            axw$a[] r3 = r0.e
            r3[r11] = r12
            goto L_0x00af
        L_0x0096:
            r3 = r9[r11]
            if (r3 == 0) goto L_0x00a4
            axw$a[] r3 = r0.e
            r3 = r3[r11]
            ayk r3 = r3.a
            r4 = r10[r11]
            if (r3 == r4) goto L_0x00af
        L_0x00a4:
            axw$a[] r3 = r0.e
            axw$a r4 = new axw$a
            r5 = r10[r11]
            r4.<init>(r5)
            r3[r11] = r4
        L_0x00af:
            axw$a[] r3 = r0.e
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x008a
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axw.a(bbu[], boolean[], ayk[], boolean[], long):long");
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public final void a(long j, boolean z) {
        this.a.a(j, z);
    }

    public final void a(defpackage.ayf.a aVar, long j) {
        this.d = aVar;
        this.a.a((defpackage.ayf.a) this, j);
    }

    public final void a(ayf ayf) {
        this.d.a(this);
    }

    public final /* bridge */ /* synthetic */ void a(ayl ayl) {
        this.d.a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > r7) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f = r0
            axw$a[] r0 = r6.e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.b = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            ayf r0 = r6.a
            long r0 = r0.b(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            long r7 = r6.b
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0034
            long r7 = r6.c
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0033
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            defpackage.bdl.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axw.b(long):long");
    }

    public final ayo b() {
        return this.a.b();
    }

    public final long c() {
        if (f()) {
            long j = this.f;
            this.f = -9223372036854775807L;
            long c2 = c();
            return c2 != -9223372036854775807L ? c2 : j;
        }
        long c3 = this.a.c();
        if (c3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        bdl.b(c3 >= this.b);
        long j2 = this.c;
        if (j2 != Long.MIN_VALUE && c3 > j2) {
            z = false;
        }
        bdl.b(z);
        return c3;
    }

    public final boolean c(long j) {
        return this.a.c(j);
    }

    public final long d() {
        long d2 = this.a.d();
        if (d2 != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || d2 < j) {
                return d2;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long e() {
        long e2 = this.a.e();
        if (e2 != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || e2 < j) {
                return e2;
            }
        }
        return Long.MIN_VALUE;
    }

    /* access modifiers changed from: 0000 */
    public final boolean f() {
        return this.f != -9223372036854775807L;
    }

    public final void m_() {
        this.a.m_();
    }
}
