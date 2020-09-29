package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: axm reason: default package */
final class axm implements asv, axo, defpackage.axs.b, com.google.android.exoplayer2.upstream.Loader.a<a>, com.google.android.exoplayer2.upstream.Loader.e {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private long E;
    private long F;
    private long G;
    private boolean H;
    private int I;
    final defpackage.axq.a a;
    final String b;
    final long c;
    final Loader d = new Loader("Loader:ExtractorMediaPeriod");
    final Runnable e;
    final Handler f;
    defpackage.axo.a g;
    axs[] h;
    boolean i;
    long j;
    boolean k;
    boolean l;
    private final Uri m;
    private final bbn n;
    private final bby o;
    private final c p;
    private final bbi q;
    private final b r;
    private final bcz s;
    private final Runnable t;
    private atb u;
    private int[] v;
    private boolean w;
    private d x;
    private boolean y;
    private int z;

    /* renamed from: axm$a */
    final class a implements com.google.android.exoplayer2.upstream.Loader.d {
        final bcb a;
        long b;
        bbp c;
        long d = -1;
        private final Uri e;
        private final b f;
        private final asv g;
        private final bcz h;
        private final ata i = new ata();
        private volatile boolean j;
        private boolean k = true;

        public a(Uri uri, bbn bbn, b bVar, asv asv, bcz bcz) {
            this.e = uri;
            this.a = new bcb(bbn);
            this.f = bVar;
            this.g = asv;
            this.h = bcz;
            bbp bbp = new bbp(uri, this.i.a, -1, axm.this.b);
            this.c = bbp;
        }

        public final void a() {
            this.j = true;
        }

        public final void b() {
            int i2 = 0;
            while (i2 == 0 && !this.j) {
                asq asq = null;
                try {
                    long j2 = this.i.a;
                    bbp bbp = new bbp(this.e, j2, -1, axm.this.b);
                    this.c = bbp;
                    this.d = this.a.a(this.c);
                    if (this.d != -1) {
                        this.d += j2;
                    }
                    Uri uri = (Uri) bcu.a(this.a.a());
                    asq asq2 = new asq(this.a, j2, this.d);
                    try {
                        ast a2 = this.f.a(asq2, this.g, uri);
                        if (this.k) {
                            a2.a(j2, this.b);
                            this.k = false;
                        }
                        while (i2 == 0 && !this.j) {
                            this.h.c();
                            i2 = a2.a((asu) asq2, this.i);
                            if (asq2.c() > axm.this.c + j2) {
                                j2 = asq2.c();
                                this.h.b();
                                axm.this.f.post(axm.this.e);
                            }
                        }
                        if (i2 == 1) {
                            i2 = 0;
                        } else {
                            this.i.a = asq2.c();
                        }
                        bdw.a((bbn) this.a);
                    } catch (Throwable th) {
                        th = th;
                        asq = asq2;
                        if (!(i2 == 1 || asq == null)) {
                            this.i.a = asq.c();
                        }
                        bdw.a((bbn) this.a);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.i.a = asq.c();
                    bdw.a((bbn) this.a);
                    throw th;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(long j2, long j3) {
            this.i.a = j2;
            this.b = j3;
            this.k = true;
        }
    }

    /* renamed from: axm$b */
    static final class b {
        ast a;
        private final ast[] b;

        public b(ast[] astArr) {
            this.b = astArr;
        }

        public final ast a(asu asu, asv asv, Uri uri) {
            ast ast = this.a;
            if (ast != null) {
                return ast;
            }
            ast[] astArr = this.b;
            int length = astArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ast ast2 = astArr[i];
                try {
                    if (ast2.a(asu)) {
                        this.a = ast2;
                        asu.a();
                        break;
                    }
                    asu.a();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    asu.a();
                    throw th;
                }
            }
            ast ast3 = this.a;
            if (ast3 != null) {
                ast3.a(asv);
                return this.a;
            }
            StringBuilder sb = new StringBuilder("None of the available extractors (");
            sb.append(bdw.b((Object[]) this.b));
            sb.append(") could read the stream.");
            throw new UnrecognizedInputFormatException(sb.toString(), uri);
        }
    }

    /* renamed from: axm$c */
    interface c {
        void a(long j, boolean z);
    }

    /* renamed from: axm$d */
    static final class d {
        public final atb a;
        public final axx b;
        public final boolean[] c;
        public final boolean[] d;
        public final boolean[] e;

        public d(atb atb, axx axx, boolean[] zArr) {
            this.a = atb;
            this.b = axx;
            this.c = zArr;
            this.d = new boolean[axx.b];
            this.e = new boolean[axx.b];
        }
    }

    /* renamed from: axm$e */
    final class e implements axt {
        final int a;

        public final void b() {
        }

        public e(int i) {
            this.a = i;
        }

        public final boolean a() {
            axm axm = axm.this;
            return !axm.g() && (axm.k || axm.h[this.a].a.c());
        }

        public final int a(aqf aqf, arv arv, boolean z) {
            axm axm = axm.this;
            int i = this.a;
            if (axm.g()) {
                return -3;
            }
            axm.a(i);
            int a2 = axm.h[i].a(aqf, arv, z, axm.k, axm.j);
            if (a2 == -3) {
                axm.b(i);
            }
            return a2;
        }

        public final int b_(long j) {
            axm axm = axm.this;
            int i = this.a;
            int i2 = 0;
            if (axm.g()) {
                return 0;
            }
            axm.a(i);
            axs axs = axm.h[i];
            if (!axm.k || j <= axs.a.e()) {
                int b2 = axs.b(j, true, true);
                if (b2 != -1) {
                    i2 = b2;
                }
            } else {
                i2 = axs.a.h();
            }
            if (i2 == 0) {
                axm.b(i);
            }
            return i2;
        }
    }

    public final void a(long j2) {
    }

    public final void m_() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.exoplayer2.upstream.Loader.b a(com.google.android.exoplayer2.upstream.Loader.d r25, long r26, long r28, java.io.IOException r30, int r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            axm$a r1 = (defpackage.axm.a) r1
            r0.a(r1)
            bby r2 = r0.o
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
            atb r10 = r0.u
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
            axs[] r7 = r0.h
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
            axq$a r3 = r0.a
            bbp r4 = r1.c
            bcb r5 = r1.a
            android.net.Uri r5 = r5.b
            bcb r7 = r1.a
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r7.c
            r8 = 1
            r9 = -1
            r10 = 0
            long r12 = r1.b
            r15 = r12
            long r11 = r0.E
            bcb r1 = r1.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axm.a(com.google.android.exoplayer2.upstream.Loader$d, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$b");
    }

    public final /* synthetic */ void a(com.google.android.exoplayer2.upstream.Loader.d dVar, long j2, long j3) {
        a aVar = (a) dVar;
        if (this.E == -9223372036854775807L) {
            atb atb = (atb) bcu.a(this.u);
            long m2 = m();
            this.E = m2 == Long.MIN_VALUE ? 0 : m2 + 10000;
            this.p.a(this.E, atb.l_());
        }
        this.a.a(aVar.c, aVar.a.b, aVar.a.c, 1, -1, null, 0, null, aVar.b, this.E, j2, j3, aVar.a.a);
        a(aVar);
        this.k = true;
        ((defpackage.axo.a) bcu.a(this.g)).a(this);
    }

    public final /* synthetic */ void a(com.google.android.exoplayer2.upstream.Loader.d dVar, long j2, long j3, boolean z2) {
        a aVar = (a) dVar;
        a aVar2 = aVar;
        this.a.b(aVar.c, aVar.a.b, aVar.a.c, 1, -1, null, 0, null, aVar.b, this.E, j2, j3, aVar.a.a);
        if (!z2) {
            a aVar3 = aVar2;
            a(aVar3);
            for (axs a2 : this.h) {
                a2.a(false);
            }
            if (this.D > 0) {
                ((defpackage.axo.a) bcu.a(this.g)).a(this);
                return;
            }
            return;
        }
    }

    public axm(Uri uri, bbn bbn, ast[] astArr, bby bby, defpackage.axq.a aVar, c cVar, bbi bbi, String str, int i2) {
        this.m = uri;
        this.n = bbn;
        this.o = bby;
        this.a = aVar;
        this.p = cVar;
        this.q = bbi;
        this.b = str;
        this.c = (long) i2;
        this.r = new b(astArr);
        this.s = new bcz();
        this.t = new $$Lambda$axm$SExZgYejetesRpJXbgkBVWSSXhM(this);
        this.e = new $$Lambda$axm$Wm0maO14xwPx_UfqMzxDm7UCx0Q(this);
        this.f = new Handler();
        this.v = new int[0];
        this.h = new axs[0];
        this.G = -9223372036854775807L;
        this.F = -1;
        this.E = -9223372036854775807L;
        this.z = 1;
        aVar.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (!this.l) {
            ((defpackage.axo.a) bcu.a(this.g)).a(this);
        }
    }

    public final void f() {
        for (axs a2 : this.h) {
            a2.a(false);
        }
        b bVar = this.r;
        if (bVar.a != null) {
            bVar.a = null;
        }
    }

    public final void a(defpackage.axo.a aVar, long j2) {
        this.g = aVar;
        this.s.a();
        k();
    }

    public final axx b() {
        return j().b;
    }

    public final long a(bbd[] bbdArr, boolean[] zArr, axt[] axtArr, boolean[] zArr2, long j2) {
        d j3 = j();
        axx axx = j3.b;
        boolean[] zArr3 = j3.d;
        int i2 = this.D;
        int i3 = 0;
        for (int i4 = 0; i4 < bbdArr.length; i4++) {
            if (axtArr[i4] != null && (bbdArr[i4] == null || !zArr[i4])) {
                int i5 = axtArr[i4].a;
                bcu.b(zArr3[i5]);
                this.D--;
                zArr3[i5] = false;
                axtArr[i4] = null;
            }
        }
        boolean z2 = !this.A ? j2 != 0 : i2 == 0;
        for (int i6 = 0; i6 < bbdArr.length; i6++) {
            if (axtArr[i6] == null && bbdArr[i6] != null) {
                bbd bbd = bbdArr[i6];
                bcu.b(bbd.f() == 1);
                bcu.b(bbd.b(0) == 0);
                int a2 = axx.a(bbd.e());
                bcu.b(!zArr3[a2]);
                this.D++;
                zArr3[a2] = true;
                axtArr[i6] = new e(a2);
                zArr2[i6] = true;
                if (!z2) {
                    axs axs = this.h[a2];
                    axs.c();
                    z2 = axs.b(j2, true, true) == -1 && axs.a.b() != 0;
                }
            }
        }
        if (this.D == 0) {
            this.H = false;
            this.B = false;
            if (this.d.a()) {
                axs[] axsArr = this.h;
                int length = axsArr.length;
                while (i3 < length) {
                    axsArr[i3].d();
                    i3++;
                }
                this.d.b();
            } else {
                for (axs a3 : this.h) {
                    a3.a(false);
                }
            }
        } else if (z2) {
            j2 = b(j2);
            while (i3 < axtArr.length) {
                if (axtArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A = true;
        return j2;
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

    public final long e() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return d();
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

    public final long b(long j2) {
        d j3 = j();
        atb atb = j3.a;
        boolean[] zArr = j3.c;
        if (!atb.l_()) {
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
                for (axs a2 : this.h) {
                    a2.a(false);
                }
            }
            return j2;
        }
    }

    public final long a(long j2, aqs aqs) {
        atb atb = j().a;
        if (!atb.l_()) {
            return 0;
        }
        defpackage.atb.a a2 = atb.a(j2);
        return bdw.a(j2, aqs, a2.a.b, a2.b.b);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        d j2 = j();
        boolean[] zArr = j2.e;
        if (!zArr[i2]) {
            aqe aqe = j2.b.c[i2].b[0];
            this.a.a(bdg.g(aqe.f), aqe, 0, (Object) null, this.j);
            zArr[i2] = true;
        }
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
            for (axs a2 : this.h) {
                a2.a(false);
            }
            ((defpackage.axo.a) bcu.a(this.g)).a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean g() {
        return this.B || n();
    }

    public final atd a(int i2, int i3) {
        int length = this.h.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.v[i4] == i2) {
                return this.h[i4];
            }
        }
        axs axs = new axs(this.q);
        axs.c = this;
        int i5 = length + 1;
        this.v = Arrays.copyOf(this.v, i5);
        this.v[length] = i2;
        axs[] axsArr = (axs[]) Arrays.copyOf(this.h, i5);
        axsArr[length] = axs;
        this.h = (axs[]) bdw.a((T[]) axsArr);
        return axs;
    }

    public final void a() {
        this.w = true;
        this.f.post(this.t);
    }

    public final void a(atb atb) {
        this.u = atb;
        this.f.post(this.t);
    }

    public final void h() {
        this.f.post(this.t);
    }

    /* access modifiers changed from: private */
    public void i() {
        atb atb = this.u;
        if (!this.l && !this.i && this.w && atb != null) {
            axs[] axsArr = this.h;
            int length = axsArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (axsArr[i2].a.d() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.s.b();
            int length2 = this.h.length;
            axw[] axwArr = new axw[length2];
            boolean[] zArr = new boolean[length2];
            this.E = atb.b();
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 >= length2) {
                    break;
                }
                aqe d2 = this.h[i3].a.d();
                axwArr[i3] = new axw(d2);
                String str = d2.f;
                if (!bdg.b(str) && !bdg.a(str)) {
                    z2 = false;
                }
                zArr[i3] = z2;
                this.y = z2 | this.y;
                i3++;
            }
            this.z = (this.F == -1 && atb.b() == -9223372036854775807L) ? 7 : 1;
            this.x = new d(atb, new axx(axwArr), zArr);
            this.i = true;
            this.p.a(this.E, atb.l_());
            ((defpackage.axo.a) bcu.a(this.g)).a(this);
        }
    }

    private d j() {
        return (d) bcu.a(this.x);
    }

    private void a(a aVar) {
        if (this.F == -1) {
            this.F = aVar.d;
        }
    }

    private void k() {
        a aVar = new a(this.m, this.n, this.r, this, this.s);
        if (this.i) {
            atb atb = j().a;
            bcu.b(n());
            long j2 = this.E;
            if (j2 == -9223372036854775807L || this.G < j2) {
                aVar.a(atb.a(this.G).a.c, this.G);
                this.G = -9223372036854775807L;
            } else {
                this.k = true;
                this.G = -9223372036854775807L;
                return;
            }
        }
        this.I = l();
        long a2 = this.d.a(aVar, this, this.o.a(this.z));
        this.a.a(aVar.c, 1, -1, (aqe) null, 0, (Object) null, aVar.b, this.E, a2);
    }

    private boolean a(boolean[] zArr, long j2) {
        int length = this.h.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                return true;
            }
            axs axs = this.h[i2];
            axs.c();
            if (axs.b(j2, true, false) == -1) {
                z2 = false;
            }
            if (z2 || (!zArr[i2] && this.y)) {
                i2++;
            }
        }
        return false;
    }

    private int l() {
        int i2 = 0;
        for (axs axs : this.h) {
            i2 += axs.a.a();
        }
        return i2;
    }

    private long m() {
        long j2 = Long.MIN_VALUE;
        for (axs axs : this.h) {
            j2 = Math.max(j2, axs.a.e());
        }
        return j2;
    }

    private boolean n() {
        return this.G != -9223372036854775807L;
    }
}
