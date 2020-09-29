package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: azl reason: default package */
final class azl extends azb {
    private static final AtomicInteger d = new AtomicInteger();
    private final axf A;
    private final bea B;
    private atk C;
    private int D;
    private int E;
    private boolean F;
    private volatile boolean G;
    public final int a;
    azp b;
    boolean c;
    private int n;
    private a o;
    private final bce p;
    private final bcg q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final bek u;
    private final boolean v;
    private final azj w;
    private final List<aqv> x;
    private final ast y;
    private final atk z;

    public azl(azj azj, bce bce, bcg bcg, bcg bcg2, a aVar, List<aqv> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z2, boolean z3, bek bek, azl azl, ast ast, byte[] bArr, byte[] bArr2) {
        bce bce2 = bce;
        a aVar2 = aVar;
        int i3 = i2;
        azl azl2 = azl;
        byte[] bArr3 = bArr;
        bce aze = bArr3 != null ? new aze(bce2, bArr3, bArr2) : bce2;
        azl azl3 = azl2;
        super(aze, bcg, aVar2.b, i, obj, j, j2, j3);
        this.n = i3;
        this.q = bcg2;
        this.o = aVar2;
        this.s = z3;
        this.u = bek;
        boolean z4 = true;
        this.r = bArr != null;
        this.t = z2;
        this.w = azj;
        this.x = list;
        this.y = ast;
        atk atk = null;
        if (azl3 != null) {
            this.A = azl3.A;
            this.B = azl3.B;
            if (azl3.o == aVar2 && azl3.c) {
                z4 = false;
            }
            this.v = z4;
            if (azl3.n == i3 && !this.v) {
                atk = azl3.C;
            }
        } else {
            this.A = new axf();
            this.B = new bea(10);
            this.v = false;
        }
        this.z = atk;
        this.p = bce;
        this.a = d.getAndIncrement();
    }

    private long a(atl atl) {
        atl.a();
        if (atl.d() >= 10 && atl.b(this.B.a, 0, 10, true)) {
            this.B.a(10);
            if (this.B.f() != axf.a) {
                return -9223372036854775807L;
            }
            this.B.d(3);
            int m = this.B.m();
            int i = m + 10;
            if (i > this.B.a.length) {
                byte[] bArr = this.B.a;
                this.B.a(i);
                System.arraycopy(bArr, 0, this.B.a, 0, 10);
            }
            if (!atl.b(this.B.a, 10, m, true)) {
                return -9223372036854775807L;
            }
            awr a2 = this.A.a(this.B.a, m);
            if (a2 == null) {
                return -9223372036854775807L;
            }
            for (a aVar : a2.a) {
                if (aVar instanceof axi) {
                    axi axi = (axi) aVar;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(axi.a)) {
                        System.arraycopy(axi.b, 0, this.B.a, 0, 8);
                        this.B.a(8);
                        return this.B.k() & 8589934591L;
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    private ath a(bce bce, bcg bcg) {
        bcg bcg2 = bcg;
        ath ath = new ath(bce, bcg2.d, bce.a(bcg));
        if (this.C != null) {
            return ath;
        }
        long a2 = a(ath);
        boolean z2 = false;
        ath.b = 0;
        azj azj = this.w;
        atk atk = this.z;
        Uri uri = bcg2.a;
        aqv aqv = this.g;
        List<aqv> list = this.x;
        ast ast = this.y;
        bek bek = this.u;
        bce.b();
        ath ath2 = ath;
        Pair a3 = azj.a(atk, uri, aqv, list, ast, bek, ath);
        this.C = (atk) a3.first;
        boolean z3 = this.C == this.z;
        if (((Boolean) a3.second).booleanValue()) {
            this.b.b(a2 != -9223372036854775807L ? this.u.b(a2) : this.j);
        }
        if (z3 && this.q != null) {
            z2 = true;
        }
        this.F = z2;
        this.b.a(this.a, this.v, z3);
        if (z3) {
            return ath2;
        }
        this.C.a((atm) this.b);
        return ath2;
    }

    public final void a() {
        this.G = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090 A[Catch:{ all -> 0x00a2, all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0097 A[SYNTHETIC, Splitter:B:44:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r10 = this;
            boolean r0 = r10.F
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x004c
            bcg r0 = r10.q
            if (r0 != 0) goto L_0x000c
            goto L_0x004c
        L_0x000c:
            int r4 = r10.D
            long r4 = (long) r4
            bcg r0 = r0.a(r4)
            bce r4 = r10.p     // Catch:{ all -> 0x0045 }
            ath r0 = r10.a(r4, r0)     // Catch:{ all -> 0x0045 }
            r4 = 0
        L_0x001a:
            if (r4 != 0) goto L_0x0033
            boolean r4 = r10.G     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0033
            atk r4 = r10.C     // Catch:{ all -> 0x0027 }
            int r4 = r4.a(r0, r1)     // Catch:{ all -> 0x0027 }
            goto L_0x001a
        L_0x0027:
            r1 = move-exception
            long r2 = r0.a     // Catch:{ all -> 0x0045 }
            bcg r0 = r10.q     // Catch:{ all -> 0x0045 }
            long r4 = r0.d     // Catch:{ all -> 0x0045 }
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch:{ all -> 0x0045 }
            r10.D = r0     // Catch:{ all -> 0x0045 }
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0033:
            long r4 = r0.a     // Catch:{ all -> 0x0045 }
            bcg r0 = r10.q     // Catch:{ all -> 0x0045 }
            long r6 = r0.d     // Catch:{ all -> 0x0045 }
            long r4 = r4 - r6
            int r0 = (int) r4     // Catch:{ all -> 0x0045 }
            r10.D = r0     // Catch:{ all -> 0x0045 }
            bce r0 = r10.p
            defpackage.ben.a(r0)
            r10.F = r2
            goto L_0x004c
        L_0x0045:
            r0 = move-exception
            bce r1 = r10.p
            defpackage.ben.a(r1)
            throw r0
        L_0x004c:
            boolean r0 = r10.G
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r10.t
            if (r0 != 0) goto L_0x00c9
            boolean r0 = r10.r
            if (r0 == 0) goto L_0x0060
            bcg r0 = r10.e
            int r4 = r10.E
            if (r4 == 0) goto L_0x0069
            r4 = 1
            goto L_0x006a
        L_0x0060:
            bcg r0 = r10.e
            int r4 = r10.E
            long r4 = (long) r4
            bcg r0 = r0.a(r4)
        L_0x0069:
            r4 = 0
        L_0x006a:
            boolean r5 = r10.s
            if (r5 != 0) goto L_0x0074
            bek r5 = r10.u
            r5.b()
            goto L_0x0088
        L_0x0074:
            bek r5 = r10.u
            long r5 = r5.a
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0088
            bek r5 = r10.u
            long r6 = r10.j
            r5.a(r6)
        L_0x0088:
            bcs r5 = r10.l     // Catch:{ all -> 0x00c2 }
            ath r0 = r10.a(r5, r0)     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x0095
            int r4 = r10.E     // Catch:{ all -> 0x00c2 }
            r0.b(r4)     // Catch:{ all -> 0x00c2 }
        L_0x0095:
            if (r3 != 0) goto L_0x00b0
            boolean r3 = r10.G     // Catch:{ all -> 0x00a2 }
            if (r3 != 0) goto L_0x00b0
            atk r3 = r10.C     // Catch:{ all -> 0x00a2 }
            int r3 = r3.a(r0, r1)     // Catch:{ all -> 0x00a2 }
            goto L_0x0095
        L_0x00a2:
            r1 = move-exception
            long r2 = r0.c()     // Catch:{ all -> 0x00c2 }
            bcg r0 = r10.e     // Catch:{ all -> 0x00c2 }
            long r4 = r0.d     // Catch:{ all -> 0x00c2 }
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch:{ all -> 0x00c2 }
            r10.E = r0     // Catch:{ all -> 0x00c2 }
            throw r1     // Catch:{ all -> 0x00c2 }
        L_0x00b0:
            long r0 = r0.c()     // Catch:{ all -> 0x00c2 }
            bcg r3 = r10.e     // Catch:{ all -> 0x00c2 }
            long r3 = r3.d     // Catch:{ all -> 0x00c2 }
            long r0 = r0 - r3
            int r1 = (int) r0     // Catch:{ all -> 0x00c2 }
            r10.E = r1     // Catch:{ all -> 0x00c2 }
            bcs r0 = r10.l
            defpackage.ben.a(r0)
            goto L_0x00c9
        L_0x00c2:
            r0 = move-exception
            bcs r1 = r10.l
            defpackage.ben.a(r1)
            throw r0
        L_0x00c9:
            r10.c = r2
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azl.b():void");
    }

    public final boolean g() {
        return this.c;
    }
}
