package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: ayd reason: default package */
final class ayd implements atm, ayf, defpackage.ayj.b, com.google.android.exoplayer2.upstream.Loader.a<a>, com.google.android.exoplayer2.upstream.Loader.e {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private long E;
    private long F;
    private long G;
    private boolean H;
    private int I;
    final defpackage.ayh.a a;
    final String b;
    final long c;
    final Loader d = new Loader("Loader:ExtractorMediaPeriod");
    final Runnable e;
    final Handler f;
    defpackage.ayf.a g;
    ayj[] h;
    boolean i;
    long j;
    boolean k;
    boolean l;
    private final Uri m;
    private final bce n;
    private final bcp o;
    private final c p;
    private final bbz q;
    private final b r;
    private final bdq s;
    private final Runnable t;
    private ats u;
    private int[] v;
    private boolean w;
    private d x;
    private boolean y;
    private int z;

    /* renamed from: ayd$a */
    final class a implements com.google.android.exoplayer2.upstream.Loader.d {
        final bcs a;
        long b;
        bcg c;
        long d = -1;
        private final Uri e;
        private final b f;
        private final atm g;
        private final bdq h;
        private final atr i = new atr();
        private volatile boolean j;
        private boolean k = true;

        public a(Uri uri, bce bce, b bVar, atm atm, bdq bdq) {
            this.e = uri;
            this.a = new bcs(bce);
            this.f = bVar;
            this.g = atm;
            this.h = bdq;
            bcg bcg = new bcg(uri, this.i.a, -1, ayd.this.b);
            this.c = bcg;
        }

        public final void a() {
            this.j = true;
        }

        /* access modifiers changed from: 0000 */
        public void a(long j2, long j3) {
            this.i.a = j2;
            this.b = j3;
            this.k = true;
        }

        public final void b() {
            int i2 = 0;
            while (i2 == 0 && !this.j) {
                ath ath = null;
                try {
                    long j2 = this.i.a;
                    bcg bcg = new bcg(this.e, j2, -1, ayd.this.b);
                    this.c = bcg;
                    this.d = this.a.a(this.c);
                    if (this.d != -1) {
                        this.d += j2;
                    }
                    Uri uri = (Uri) bdl.a(this.a.a());
                    ath ath2 = new ath(this.a, j2, this.d);
                    try {
                        atk a2 = this.f.a(ath2, this.g, uri);
                        if (this.k) {
                            a2.a(j2, this.b);
                            this.k = false;
                        }
                        while (i2 == 0 && !this.j) {
                            this.h.c();
                            i2 = a2.a((atl) ath2, this.i);
                            if (ath2.c() > ayd.this.c + j2) {
                                j2 = ath2.c();
                                this.h.b();
                                ayd.this.f.post(ayd.this.e);
                            }
                        }
                        if (i2 == 1) {
                            i2 = 0;
                        } else {
                            this.i.a = ath2.c();
                        }
                        ben.a((bce) this.a);
                    } catch (Throwable th) {
                        th = th;
                        ath = ath2;
                        if (!(i2 == 1 || ath == null)) {
                            this.i.a = ath.c();
                        }
                        ben.a((bce) this.a);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.i.a = ath.c();
                    ben.a((bce) this.a);
                    throw th;
                }
            }
        }
    }

    /* renamed from: ayd$b */
    static final class b {
        atk a;
        private final atk[] b;

        public b(atk[] atkArr) {
            this.b = atkArr;
        }

        public final atk a(atl atl, atm atm, Uri uri) {
            atk atk = this.a;
            if (atk != null) {
                return atk;
            }
            atk[] atkArr = this.b;
            int length = atkArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                atk atk2 = atkArr[i];
                try {
                    if (atk2.a(atl)) {
                        this.a = atk2;
                        atl.a();
                        break;
                    }
                    atl.a();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    atl.a();
                    throw th;
                }
            }
            atk atk3 = this.a;
            if (atk3 != null) {
                atk3.a(atm);
                return this.a;
            }
            StringBuilder sb = new StringBuilder("None of the available extractors (");
            sb.append(ben.b((Object[]) this.b));
            sb.append(") could read the stream.");
            throw new UnrecognizedInputFormatException(sb.toString(), uri);
        }
    }

    /* renamed from: ayd$c */
    interface c {
        void a(long j, boolean z);
    }

    /* renamed from: ayd$d */
    static final class d {
        public final ats a;
        public final ayo b;
        public final boolean[] c;
        public final boolean[] d;
        public final boolean[] e;

        public d(ats ats, ayo ayo, boolean[] zArr) {
            this.a = ats;
            this.b = ayo;
            this.c = zArr;
            this.d = new boolean[ayo.b];
            this.e = new boolean[ayo.b];
        }
    }

    /* renamed from: ayd$e */
    final class e implements ayk {
        final int a;

        public e(int i) {
            this.a = i;
        }

        public final int a(aqw aqw, asm asm, boolean z) {
            ayd ayd = ayd.this;
            int i = this.a;
            if (ayd.g()) {
                return -3;
            }
            ayd.a(i);
            int a2 = ayd.h[i].a(aqw, asm, z, ayd.k, ayd.j);
            if (a2 == -3) {
                ayd.b(i);
            }
            return a2;
        }

        public final boolean a() {
            ayd ayd = ayd.this;
            return !ayd.g() && (ayd.k || ayd.h[this.a].a.c());
        }

        public final void b() {
        }

        public final int b_(long j) {
            ayd ayd = ayd.this;
            int i = this.a;
            int i2 = 0;
            if (ayd.g()) {
                return 0;
            }
            ayd.a(i);
            ayj ayj = ayd.h[i];
            if (!ayd.k || j <= ayj.a.e()) {
                int b2 = ayj.b(j, true, true);
                if (b2 != -1) {
                    i2 = b2;
                }
            } else {
                i2 = ayj.a.h();
            }
            if (i2 == 0) {
                ayd.b(i);
            }
            return i2;
        }
    }

    public ayd(Uri uri, bce bce, atk[] atkArr, bcp bcp, defpackage.ayh.a aVar, c cVar, bbz bbz, String str, int i2) {
        this.m = uri;
        this.n = bce;
        this.o = bcp;
        this.a = aVar;
        this.p = cVar;
        this.q = bbz;
        this.b = str;
        this.c = (long) i2;
        this.r = new b(atkArr);
        this.s = new bdq();
        this.t = new $$Lambda$ayd$12ox8v9DaJyeulKmPkcgRLx6xY(this);
        this.e = new $$Lambda$ayd$UWqeZdEK_lLMrofU7YxVMXz7mpk(this);
        this.f = new Handler();
        this.v = new int[0];
        this.h = new ayj[0];
        this.G = -9223372036854775807L;
        this.F = -1;
        this.E = -9223372036854775807L;
        this.z = 1;
        aVar.a();
    }

    private void a(a aVar) {
        if (this.F == -1) {
            this.F = aVar.d;
        }
    }

    private boolean a(boolean[] zArr, long j2) {
        int length = this.h.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                return true;
            }
            ayj ayj = this.h[i2];
            ayj.c();
            if (ayj.b(j2, true, false) == -1) {
                z2 = false;
            }
            if (z2 || (!zArr[i2] && this.y)) {
                i2++;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void i() {
        ats ats = this.u;
        if (!this.l && !this.i && this.w && ats != null) {
            ayj[] ayjArr = this.h;
            int length = ayjArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (ayjArr[i2].a.d() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.s.b();
            int length2 = this.h.length;
            ayn[] aynArr = new ayn[length2];
            boolean[] zArr = new boolean[length2];
            this.E = ats.b();
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 >= length2) {
                    break;
                }
                aqv d2 = this.h[i3].a.d();
                aynArr[i3] = new ayn(d2);
                String str = d2.f;
                if (!bdx.b(str) && !bdx.a(str)) {
                    z2 = false;
                }
                zArr[i3] = z2;
                this.y = z2 | this.y;
                i3++;
            }
            this.z = (this.F == -1 && ats.b() == -9223372036854775807L) ? 7 : 1;
            this.x = new d(ats, new ayo(aynArr), zArr);
            this.i = true;
            this.p.a(this.E, ats.l_());
            ((defpackage.ayf.a) bdl.a(this.g)).a(this);
        }
    }

    private d j() {
        return (d) bdl.a(this.x);
    }

    private void k() {
        a aVar = new a(this.m, this.n, this.r, this, this.s);
        if (this.i) {
            ats ats = j().a;
            bdl.b(n());
            long j2 = this.E;
            if (j2 == -9223372036854775807L || this.G < j2) {
                aVar.a(ats.a(this.G).a.c, this.G);
                this.G = -9223372036854775807L;
            } else {
                this.k = true;
                this.G = -9223372036854775807L;
                return;
            }
        }
        this.I = l();
        long a2 = this.d.a(aVar, this, this.o.a(this.z));
        this.a.a(aVar.c, 1, -1, (aqv) null, 0, (Object) null, aVar.b, this.E, a2);
    }

    private int l() {
        int i2 = 0;
        for (ayj ayj : this.h) {
            i2 += ayj.a.a();
        }
        return i2;
    }

    private long m() {
        long j2 = Long.MIN_VALUE;
        for (ayj ayj : this.h) {
            j2 = Math.max(j2, ayj.a.e());
        }
        return j2;
    }

    private boolean n() {
        return this.G != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (!this.l) {
            ((defpackage.ayf.a) bdl.a(this.g)).a(this);
        }
    }

    public final long a(long j2, arj arj) {
        ats ats = j().a;
        if (!ats.l_()) {
            return 0;
        }
        defpackage.ats.a a2 = ats.a(j2);
        return ben.a(j2, arj, a2.a.b, a2.b.b);
    }

    public final long a(bbu[] bbuArr, boolean[] zArr, ayk[] aykArr, boolean[] zArr2, long j2) {
        d j3 = j();
        ayo ayo = j3.b;
        boolean[] zArr3 = j3.d;
        int i2 = this.D;
        int i3 = 0;
        for (int i4 = 0; i4 < bbuArr.length; i4++) {
            if (aykArr[i4] != null && (bbuArr[i4] == null || !zArr[i4])) {
                int i5 = aykArr[i4].a;
                bdl.b(zArr3[i5]);
                this.D--;
                zArr3[i5] = false;
                aykArr[i4] = null;
            }
        }
        boolean z2 = !this.A ? j2 != 0 : i2 == 0;
        for (int i6 = 0; i6 < bbuArr.length; i6++) {
            if (aykArr[i6] == null && bbuArr[i6] != null) {
                bbu bbu = bbuArr[i6];
                bdl.b(bbu.f() == 1);
                bdl.b(bbu.b(0) == 0);
                int a2 = ayo.a(bbu.e());
                bdl.b(!zArr3[a2]);
                this.D++;
                zArr3[a2] = true;
                aykArr[i6] = new e(a2);
                zArr2[i6] = true;
                if (!z2) {
                    ayj ayj = this.h[a2];
                    ayj.c();
                    z2 = ayj.b(j2, true, true) == -1 && ayj.a.b() != 0;
                }
            }
        }
        if (this.D == 0) {
            this.H = false;
            this.B = false;
            if (this.d.a()) {
                ayj[] ayjArr = this.h;
                int length = ayjArr.length;
                while (i3 < length) {
                    ayjArr[i3].d();
                    i3++;
                }
                this.d.b();
            } else {
                for (ayj a3 : this.h) {
                    a3.a(false);
                }
            }
        } else if (z2) {
            j2 = b(j2);
            while (i3 < aykArr.length) {
                if (aykArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A = true;
        return j2;
    }

    public final atu a(int i2, int i3) {
        int length = this.h.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.v[i4] == i2) {
                return this.h[i4];
            }
        }
        ayj ayj = new ayj(this.q);
        ayj.c = this;
        int i5 = length + 1;
        this.v = Arrays.copyOf(this.v, i5);
        this.v[length] = i2;
        ayj[] ayjArr = (ayj[]) Arrays.copyOf(this.h, i5);
        ayjArr[length] = ayj;
        this.h = (ayj[]) ben.a((T[]) ayjArr);
        return ayj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.exoplayer2.upstream.Loader.b a(com.google.android.exoplayer2.upstream.Loader.d r25, long r26, long r28, java.io.IOException r30, int r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            ayd$a r1 = (defpackage.ayd.a) r1
            r0.a(r1)
            bcp r2 = r0.o
            r14 = r30
            r3 = r31
            long r2 = r2.a(r14, r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0020
            com.google.android.exoplayer2.upstream.Loader$b r2 = com.google.android.exoplayer2.upstream.Loader.b
            goto L_0x0076
        L_0x0020:
            int r7 = r24.l()
            int r8 = r0.I
            r9 = 0
            if (r7 <= r8) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            long r10 = r0.F
            r12 = -1
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 != 0) goto L_0x006a
            ats r10 = r0.u
            if (r10 == 0) goto L_0x0041
            long r10 = r10.b()
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0041
            goto L_0x006a
        L_0x0041:
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x004e
            boolean r4 = r24.g()
            if (r4 != 0) goto L_0x004e
            r0.H = r6
            goto L_0x006d
        L_0x004e:
            boolean r4 = r0.i
            r0.B = r4
            r4 = 0
            r0.j = r4
            r0.I = r9
            ayj[] r7 = r0.h
            int r10 = r7.length
            r11 = 0
        L_0x005c:
            if (r11 >= r10) goto L_0x0066
            r12 = r7[r11]
            r12.a(r9)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            r1.a(r4, r4)
            goto L_0x006c
        L_0x006a:
            r0.I = r7
        L_0x006c:
            r9 = 1
        L_0x006d:
            if (r9 == 0) goto L_0x0074
            com.google.android.exoplayer2.upstream.Loader$b r2 = com.google.android.exoplayer2.upstream.Loader.a(r8, r2)
            goto L_0x0076
        L_0x0074:
            com.google.android.exoplayer2.upstream.Loader$b r2 = com.google.android.exoplayer2.upstream.Loader.a
        L_0x0076:
            ayh$a r3 = r0.a
            bcg r4 = r1.c
            bcs r5 = r1.a
            android.net.Uri r5 = r5.b
            bcs r7 = r1.a
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r7.c
            r8 = 1
            r9 = -1
            r10 = 0
            long r12 = r1.b
            r15 = r12
            long r11 = r0.E
            bcs r1 = r1.a
            r17 = r11
            long r11 = r1.a
            boolean r1 = r2.a()
            r23 = r1 ^ 1
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r1 = 0
            r10 = r1
            r20 = r11
            r1 = 0
            r11 = r1
            r12 = r15
            r14 = r17
            r16 = r26
            r18 = r28
            r22 = r30
            r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r18, r20, r22, r23)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayd.a(com.google.android.exoplayer2.upstream.Loader$d, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$b");
    }

    public final void a() {
        this.w = true;
        this.f.post(this.t);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        d j2 = j();
        boolean[] zArr = j2.e;
        if (!zArr[i2]) {
            aqv aqv = j2.b.c[i2].b[0];
            this.a.a(bdx.g(aqv.f), aqv, 0, (Object) null, this.j);
            zArr[i2] = true;
        }
    }

    public final void a(long j2) {
    }

    public final void a(long j2, boolean z2) {
        if (!n()) {
            boolean[] zArr = j().d;
            int length = this.h.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.h[i2].a(j2, z2, zArr[i2]);
            }
        }
    }

    public final void a(ats ats) {
        this.u = ats;
        this.f.post(this.t);
    }

    public final void a(defpackage.ayf.a aVar, long j2) {
        this.g = aVar;
        this.s.a();
        k();
    }

    public final /* synthetic */ void a(com.google.android.exoplayer2.upstream.Loader.d dVar, long j2, long j3) {
        a aVar = (a) dVar;
        if (this.E == -9223372036854775807L) {
            ats ats = (ats) bdl.a(this.u);
            long m2 = m();
            this.E = m2 == Long.MIN_VALUE ? 0 : m2 + 10000;
            this.p.a(this.E, ats.l_());
        }
        this.a.a(aVar.c, aVar.a.b, aVar.a.c, 1, -1, null, 0, null, aVar.b, this.E, j2, j3, aVar.a.a);
        a(aVar);
        this.k = true;
        ((defpackage.ayf.a) bdl.a(this.g)).a(this);
    }

    public final /* synthetic */ void a(com.google.android.exoplayer2.upstream.Loader.d dVar, long j2, long j3, boolean z2) {
        a aVar = (a) dVar;
        a aVar2 = aVar;
        this.a.b(aVar.c, aVar.a.b, aVar.a.c, 1, -1, null, 0, null, aVar.b, this.E, j2, j3, aVar.a.a);
        if (!z2) {
            a aVar3 = aVar2;
            a(aVar3);
            for (ayj a2 : this.h) {
                a2.a(false);
            }
            if (this.D > 0) {
                ((defpackage.ayf.a) bdl.a(this.g)).a(this);
                return;
            }
            return;
        }
    }

    public final long b(long j2) {
        d j3 = j();
        ats ats = j3.a;
        boolean[] zArr = j3.c;
        if (!ats.l_()) {
            j2 = 0;
        }
        this.B = false;
        this.j = j2;
        if (n()) {
            this.G = j2;
            return j2;
        } else if (this.z != 7 && a(zArr, j2)) {
            return j2;
        } else {
            this.H = false;
            this.G = j2;
            this.k = false;
            if (this.d.a()) {
                this.d.b();
            } else {
                for (ayj a2 : this.h) {
                    a2.a(false);
                }
            }
            return j2;
        }
    }

    public final ayo b() {
        return j().b;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
        boolean[] zArr = j().c;
        if (this.H && zArr[i2] && !this.h[i2].a.c()) {
            this.G = 0;
            this.H = false;
            this.B = true;
            this.j = 0;
            this.I = 0;
            for (ayj a2 : this.h) {
                a2.a(false);
            }
            ((defpackage.ayf.a) bdl.a(this.g)).a(this);
        }
    }

    public final long c() {
        if (!this.C) {
            this.a.c();
            this.C = true;
        }
        if (!this.B || (!this.k && l() <= this.I)) {
            return -9223372036854775807L;
        }
        this.B = false;
        return this.j;
    }

    public final boolean c(long j2) {
        if (this.k || this.H || (this.i && this.D == 0)) {
            return false;
        }
        boolean a2 = this.s.a();
        if (!this.d.a()) {
            k();
            a2 = true;
        }
        return a2;
    }

    public final long d() {
        long j2;
        boolean[] zArr = j().c;
        if (this.k) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.G;
        }
        if (this.y) {
            j2 = Long.MAX_VALUE;
            int length = this.h.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2]) {
                    j2 = Math.min(j2, this.h[i2].a.e());
                }
            }
        } else {
            j2 = m();
        }
        return j2 == Long.MIN_VALUE ? this.j : j2;
    }

    public final long e() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    public final void f() {
        for (ayj a2 : this.h) {
            a2.a(false);
        }
        b bVar = this.r;
        if (bVar.a != null) {
            bVar.a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.B || n();
    }

    public final void h() {
        this.f.post(this.t);
    }

    public final void m_() {
    }
}
