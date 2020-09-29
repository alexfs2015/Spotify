package defpackage;

/* renamed from: axr reason: default package */
public final class axr {
    int[] a;
    int b;
    int c;
    int d;
    private int e = 1000;
    private long[] f;
    private int[] g;
    private int[] h;
    private long[] i;
    private defpackage.atd.a[] j;
    private aqe[] k;
    private int l;
    private int m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;
    private aqe r;

    /* renamed from: axr$a */
    public static final class a {
        public int a;
        public long b;
        public defpackage.atd.a c;
    }

    public axr() {
        int i2 = this.e;
        this.a = new int[i2];
        this.f = new long[i2];
        this.i = new long[i2];
        this.h = new int[i2];
        this.g = new int[i2];
        this.j = new defpackage.atd.a[i2];
        this.k = new aqe[i2];
        this.n = Long.MIN_VALUE;
        this.o = Long.MIN_VALUE;
        this.q = true;
        this.p = true;
    }

    public final void a(boolean z) {
        this.l = 0;
        this.b = 0;
        this.m = 0;
        this.c = 0;
        this.p = true;
        this.n = Long.MIN_VALUE;
        this.o = Long.MIN_VALUE;
        if (z) {
            this.r = null;
            this.q = true;
        }
    }

    public final int a() {
        return this.b + this.l;
    }

    public final long a(int i2) {
        int a2 = a() - i2;
        bcu.a(a2 >= 0 && a2 <= this.l - this.c);
        this.l -= a2;
        this.o = Math.max(this.n, e(this.l));
        int i3 = this.l;
        if (i3 == 0) {
            return 0;
        }
        int c2 = c(i3 - 1);
        return this.f[c2] + ((long) this.g[c2]);
    }

    public final int b() {
        return this.b + this.c;
    }

    public final synchronized boolean c() {
        return this.c != this.l;
    }

    public final synchronized aqe d() {
        if (this.q) {
            return null;
        }
        return this.r;
    }

    public final synchronized long e() {
        return this.o;
    }

    public final synchronized long f() {
        if (this.l == 0) {
            return Long.MIN_VALUE;
        }
        return this.i[this.m];
    }

    public final synchronized void g() {
        this.c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(defpackage.aqf r5, defpackage.arv r6, boolean r7, boolean r8, defpackage.aqe r9, defpackage.axr.a r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.c()     // Catch:{ all -> 0x006f }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0023
            if (r8 == 0) goto L_0x0011
            r5 = 4
            r6.a = r5     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r3
        L_0x0011:
            aqe r6 = r4.r     // Catch:{ all -> 0x006f }
            if (r6 == 0) goto L_0x0021
            if (r7 != 0) goto L_0x001b
            aqe r6 = r4.r     // Catch:{ all -> 0x006f }
            if (r6 == r9) goto L_0x0021
        L_0x001b:
            aqe r6 = r4.r     // Catch:{ all -> 0x006f }
            r5.a = r6     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r1
        L_0x0021:
            monitor-exit(r4)
            return r2
        L_0x0023:
            int r8 = r4.c     // Catch:{ all -> 0x006f }
            int r8 = r4.c(r8)     // Catch:{ all -> 0x006f }
            if (r7 != 0) goto L_0x0067
            aqe[] r7 = r4.k     // Catch:{ all -> 0x006f }
            r7 = r7[r8]     // Catch:{ all -> 0x006f }
            if (r7 == r9) goto L_0x0032
            goto L_0x0067
        L_0x0032:
            java.nio.ByteBuffer r5 = r6.c     // Catch:{ all -> 0x006f }
            r7 = 1
            if (r5 != 0) goto L_0x003d
            int r5 = r6.e     // Catch:{ all -> 0x006f }
            if (r5 != 0) goto L_0x003d
            r5 = 1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            if (r5 == 0) goto L_0x0042
            monitor-exit(r4)
            return r2
        L_0x0042:
            long[] r5 = r4.i     // Catch:{ all -> 0x006f }
            r0 = r5[r8]     // Catch:{ all -> 0x006f }
            r6.d = r0     // Catch:{ all -> 0x006f }
            int[] r5 = r4.h     // Catch:{ all -> 0x006f }
            r5 = r5[r8]     // Catch:{ all -> 0x006f }
            r6.a = r5     // Catch:{ all -> 0x006f }
            int[] r5 = r4.g     // Catch:{ all -> 0x006f }
            r5 = r5[r8]     // Catch:{ all -> 0x006f }
            r10.a = r5     // Catch:{ all -> 0x006f }
            long[] r5 = r4.f     // Catch:{ all -> 0x006f }
            r0 = r5[r8]     // Catch:{ all -> 0x006f }
            r10.b = r0     // Catch:{ all -> 0x006f }
            atd$a[] r5 = r4.j     // Catch:{ all -> 0x006f }
            r5 = r5[r8]     // Catch:{ all -> 0x006f }
            r10.c = r5     // Catch:{ all -> 0x006f }
            int r5 = r4.c     // Catch:{ all -> 0x006f }
            int r5 = r5 + r7
            r4.c = r5     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r3
        L_0x0067:
            aqe[] r6 = r4.k     // Catch:{ all -> 0x006f }
            r6 = r6[r8]     // Catch:{ all -> 0x006f }
            r5.a = r6     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r1
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axr.a(aqf, arv, boolean, boolean, aqe, axr$a):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.c     // Catch:{ all -> 0x0039 }
            int r2 = r8.c(r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r8.c()     // Catch:{ all -> 0x0039 }
            r7 = -1
            if (r0 == 0) goto L_0x0037
            long[] r0 = r8.i     // Catch:{ all -> 0x0039 }
            r3 = r0[r2]     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            long r0 = r8.o     // Catch:{ all -> 0x0039 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            int r12 = r8.l     // Catch:{ all -> 0x0039 }
            int r0 = r8.c     // Catch:{ all -> 0x0039 }
            int r3 = r12 - r0
            r1 = r8
            r4 = r9
            r6 = r11
            int r9 = r1.a(r2, r3, r4, r6)     // Catch:{ all -> 0x0039 }
            if (r9 != r7) goto L_0x0030
            monitor-exit(r8)
            return r7
        L_0x0030:
            int r10 = r8.c     // Catch:{ all -> 0x0039 }
            int r10 = r10 + r9
            r8.c = r10     // Catch:{ all -> 0x0039 }
            monitor-exit(r8)
            return r9
        L_0x0037:
            monitor-exit(r8)
            return r7
        L_0x0039:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axr.a(long, boolean, boolean):int");
    }

    public final synchronized int h() {
        int i2;
        i2 = this.l - this.c;
        this.c = this.l;
        return i2;
    }

    public final synchronized boolean b(int i2) {
        if (this.b > i2 || i2 > this.b + this.l) {
            return false;
        }
        this.c = i2 - this.b;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long b(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.l     // Catch:{ all -> 0x0038 }
            r1 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r9.i     // Catch:{ all -> 0x0038 }
            int r3 = r9.m     // Catch:{ all -> 0x0038 }
            r3 = r0[r3]     // Catch:{ all -> 0x0038 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            int r13 = r9.c     // Catch:{ all -> 0x0038 }
            int r0 = r9.l     // Catch:{ all -> 0x0038 }
            if (r13 == r0) goto L_0x001f
            int r13 = r9.c     // Catch:{ all -> 0x0038 }
            int r13 = r13 + 1
            goto L_0x0021
        L_0x001f:
            int r13 = r9.l     // Catch:{ all -> 0x0038 }
        L_0x0021:
            r5 = r13
            int r4 = r9.m     // Catch:{ all -> 0x0038 }
            r3 = r9
            r6 = r10
            r8 = r12
            int r10 = r3.a(r4, r5, r6, r8)     // Catch:{ all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            monitor-exit(r9)
            return r1
        L_0x0030:
            long r10 = r9.d(r10)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return r10
        L_0x0036:
            monitor-exit(r9)
            return r1
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axr.b(long, boolean, boolean):long");
    }

    public final synchronized long i() {
        if (this.l == 0) {
            return -1;
        }
        return d(this.l);
    }

    public final synchronized boolean a(aqe aqe) {
        if (aqe == null) {
            this.q = true;
            return false;
        }
        this.q = false;
        if (bdw.a((Object) aqe, (Object) this.r)) {
            return false;
        }
        this.r = aqe;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r6, int r8, long r9, int r11, defpackage.atd.a r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.p     // Catch:{ all -> 0x00d2 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.p = r1     // Catch:{ all -> 0x00d2 }
        L_0x000e:
            boolean r0 = r5.q     // Catch:{ all -> 0x00d2 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            defpackage.bcu.b(r0)     // Catch:{ all -> 0x00d2 }
            r5.b(r6)     // Catch:{ all -> 0x00d2 }
            int r0 = r5.l     // Catch:{ all -> 0x00d2 }
            int r0 = r5.c(r0)     // Catch:{ all -> 0x00d2 }
            long[] r3 = r5.i     // Catch:{ all -> 0x00d2 }
            r3[r0] = r6     // Catch:{ all -> 0x00d2 }
            long[] r6 = r5.f     // Catch:{ all -> 0x00d2 }
            r6[r0] = r9     // Catch:{ all -> 0x00d2 }
            int[] r6 = r5.g     // Catch:{ all -> 0x00d2 }
            r6[r0] = r11     // Catch:{ all -> 0x00d2 }
            int[] r6 = r5.h     // Catch:{ all -> 0x00d2 }
            r6[r0] = r8     // Catch:{ all -> 0x00d2 }
            atd$a[] r6 = r5.j     // Catch:{ all -> 0x00d2 }
            r6[r0] = r12     // Catch:{ all -> 0x00d2 }
            aqe[] r6 = r5.k     // Catch:{ all -> 0x00d2 }
            aqe r7 = r5.r     // Catch:{ all -> 0x00d2 }
            r6[r0] = r7     // Catch:{ all -> 0x00d2 }
            int[] r6 = r5.a     // Catch:{ all -> 0x00d2 }
            int r7 = r5.d     // Catch:{ all -> 0x00d2 }
            r6[r0] = r7     // Catch:{ all -> 0x00d2 }
            int r6 = r5.l     // Catch:{ all -> 0x00d2 }
            int r6 = r6 + r2
            r5.l = r6     // Catch:{ all -> 0x00d2 }
            int r6 = r5.l     // Catch:{ all -> 0x00d2 }
            int r7 = r5.e     // Catch:{ all -> 0x00d2 }
            if (r6 != r7) goto L_0x00d0
            int r6 = r5.e     // Catch:{ all -> 0x00d2 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00d2 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00d2 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00d2 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00d2 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00d2 }
            atd$a[] r12 = new defpackage.atd.a[r6]     // Catch:{ all -> 0x00d2 }
            aqe[] r0 = new defpackage.aqe[r6]     // Catch:{ all -> 0x00d2 }
            int r2 = r5.e     // Catch:{ all -> 0x00d2 }
            int r3 = r5.m     // Catch:{ all -> 0x00d2 }
            int r2 = r2 - r3
            long[] r3 = r5.f     // Catch:{ all -> 0x00d2 }
            int r4 = r5.m     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00d2 }
            long[] r3 = r5.i     // Catch:{ all -> 0x00d2 }
            int r4 = r5.m     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00d2 }
            int[] r3 = r5.h     // Catch:{ all -> 0x00d2 }
            int r4 = r5.m     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00d2 }
            int[] r3 = r5.g     // Catch:{ all -> 0x00d2 }
            int r4 = r5.m     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00d2 }
            atd$a[] r3 = r5.j     // Catch:{ all -> 0x00d2 }
            int r4 = r5.m     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00d2 }
            aqe[] r3 = r5.k     // Catch:{ all -> 0x00d2 }
            int r4 = r5.m     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00d2 }
            int[] r3 = r5.a     // Catch:{ all -> 0x00d2 }
            int r4 = r5.m     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00d2 }
            int r3 = r5.m     // Catch:{ all -> 0x00d2 }
            long[] r4 = r5.f     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00d2 }
            long[] r4 = r5.i     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00d2 }
            int[] r4 = r5.h     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00d2 }
            int[] r4 = r5.g     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00d2 }
            atd$a[] r4 = r5.j     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00d2 }
            aqe[] r4 = r5.k     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00d2 }
            int[] r4 = r5.a     // Catch:{ all -> 0x00d2 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00d2 }
            r5.f = r8     // Catch:{ all -> 0x00d2 }
            r5.i = r9     // Catch:{ all -> 0x00d2 }
            r5.h = r10     // Catch:{ all -> 0x00d2 }
            r5.g = r11     // Catch:{ all -> 0x00d2 }
            r5.j = r12     // Catch:{ all -> 0x00d2 }
            r5.k = r0     // Catch:{ all -> 0x00d2 }
            r5.a = r7     // Catch:{ all -> 0x00d2 }
            r5.m = r1     // Catch:{ all -> 0x00d2 }
            int r7 = r5.e     // Catch:{ all -> 0x00d2 }
            r5.l = r7     // Catch:{ all -> 0x00d2 }
            r5.e = r6     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            monitor-exit(r5)
            return
        L_0x00d2:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axr.a(long, int, long, int, atd$a):void");
    }

    private synchronized void b(long j2) {
        this.o = Math.max(this.o, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r8 <= r7.n) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.l     // Catch:{ all -> 0x004a }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            long r3 = r7.n     // Catch:{ all -> 0x004a }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            monitor-exit(r7)
            if (r0 <= 0) goto L_0x000f
            return r2
        L_0x000f:
            return r1
        L_0x0010:
            long r3 = r7.n     // Catch:{ all -> 0x004a }
            int r0 = r7.c     // Catch:{ all -> 0x004a }
            long r5 = r7.e(r0)     // Catch:{ all -> 0x004a }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x004a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            monitor-exit(r7)
            return r1
        L_0x0022:
            int r0 = r7.l     // Catch:{ all -> 0x004a }
            int r1 = r7.l     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            int r1 = r7.c(r1)     // Catch:{ all -> 0x004a }
        L_0x002b:
            int r3 = r7.c     // Catch:{ all -> 0x004a }
            if (r0 <= r3) goto L_0x0042
            long[] r3 = r7.i     // Catch:{ all -> 0x004a }
            r4 = r3[r1]     // Catch:{ all -> 0x004a }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0042
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x002b
            int r1 = r7.e     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            goto L_0x002b
        L_0x0042:
            int r8 = r7.b     // Catch:{ all -> 0x004a }
            int r8 = r8 + r0
            r7.a(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r2
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x004e
        L_0x004d:
            throw r8
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axr.a(long):boolean");
    }

    private int a(int i2, int i3, long j2, boolean z) {
        int i4 = i2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && this.i[i4] <= j2; i6++) {
            if (!z || (this.h[i4] & 1) != 0) {
                i5 = i6;
            }
            i4++;
            if (i4 == this.e) {
                i4 = 0;
            }
        }
        return i5;
    }

    private long d(int i2) {
        this.n = Math.max(this.n, e(i2));
        this.l -= i2;
        this.b += i2;
        this.m += i2;
        int i3 = this.m;
        int i4 = this.e;
        if (i3 >= i4) {
            this.m = i3 - i4;
        }
        this.c -= i2;
        if (this.c < 0) {
            this.c = 0;
        }
        if (this.l != 0) {
            return this.f[this.m];
        }
        int i5 = this.m;
        if (i5 == 0) {
            i5 = this.e;
        }
        int i6 = i5 - 1;
        return this.f[i6] + ((long) this.g[i6]);
    }

    private long e(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int c2 = c(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.i[c2]);
            if ((this.h[c2] & 1) != 0) {
                break;
            }
            c2--;
            if (c2 == -1) {
                c2 = this.e - 1;
            }
        }
        return j2;
    }

    /* access modifiers changed from: 0000 */
    public int c(int i2) {
        int i3 = this.m + i2;
        int i4 = this.e;
        return i3 < i4 ? i3 : i3 - i4;
    }
}
