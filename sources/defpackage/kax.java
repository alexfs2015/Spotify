package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: kax reason: default package */
public final class kax implements axo, a<ayf<kbc>> {
    ayf<kbc>[] a;
    private final a b;
    private final int c;
    private final a d;
    private final long e;
    private final bbz f;
    private final bbi g;
    private final axx h;
    private final kbe i;
    private final int j = 0;
    private final List<kaw> k;
    private final bcd l;
    private a m;
    private axh n;

    public final void a(long j2) {
    }

    public final long c() {
        return -9223372036854775807L;
    }

    public final void m_() {
    }

    public kax(kbe kbe, int i2, bcd bcd, a aVar, int i3, a aVar2, long j2, bbz bbz, bbi bbi) {
        this.i = kbe;
        this.l = bcd;
        this.b = aVar;
        this.c = i3;
        this.d = aVar2;
        this.e = 0;
        this.f = bbz;
        this.g = bbi;
        this.a = new ayf[0];
        this.n = new axh(this.a);
        this.k = kbe.a(0).a;
        this.h = a(this.k);
    }

    public final void a(a aVar, long j2) {
        this.m = aVar;
        aVar.a(this);
    }

    public final axx b() {
        return this.h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ("track-sync-renderer".equals(r0.g().a) != false) goto L_0x003d;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=axt[], code=java.lang.Object[], for r22v0, types: [java.lang.Object[], axt[]] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bbd[] r20, boolean[] r21, java.lang.Object[] r22, boolean[] r23, long r24) {
        /*
            r19 = this;
            r11 = r19
            r12 = r20
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r15 = 0
        L_0x000a:
            int r0 = r12.length
            if (r15 >= r0) goto L_0x00d6
            r0 = r12[r15]
            r16 = 1
            if (r0 == 0) goto L_0x003f
            aqe r1 = r0.g()
            java.lang.String r1 = r1.a
            java.lang.String r2 = "track-debug-renderer"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            aqe r1 = r0.g()
            java.lang.String r1 = r1.a
            java.lang.String r2 = "track-progress-renderer"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            aqe r0 = r0.g()
            java.lang.String r0 = r0.a
            java.lang.String r1 = "track-sync-renderer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003f
        L_0x003d:
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x004b
            axl r0 = new axl
            r0.<init>()
            r22[r15] = r0
            goto L_0x00d2
        L_0x004b:
            r0 = r22[r15]
            boolean r0 = r0 instanceof defpackage.ayf
            if (r0 == 0) goto L_0x0078
            r0 = r22[r15]
            ayf r0 = (defpackage.ayf) r0
            r1 = r12[r15]
            if (r1 == 0) goto L_0x0072
            boolean r1 = r21[r15]
            if (r1 != 0) goto L_0x005e
            goto L_0x0072
        L_0x005e:
            axx r1 = r11.h
            r2 = r12[r15]
            axw r2 = r2.e()
            int r1 = r1.a(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.put(r1, r0)
            goto L_0x0078
        L_0x0072:
            r0.c()
            r0 = 0
            r22[r15] = r0
        L_0x0078:
            r0 = r22[r15]
            if (r0 != 0) goto L_0x00d2
            r0 = r12[r15]
            if (r0 == 0) goto L_0x00d2
            axx r0 = r11.h
            r1 = r12[r15]
            axw r1 = r1.e()
            int r10 = r0.a(r1)
            r0 = -1
            if (r10 == r0) goto L_0x00d2
            r7 = r12[r15]
            java.util.List<kaw> r0 = r11.k
            java.lang.Object r0 = r0.get(r10)
            kaw r0 = (defpackage.kaw) r0
            kbc$a r2 = r11.b
            bbz r3 = r11.f
            kbe r4 = r11.i
            int r5 = r11.j
            bcd r8 = r11.l
            r6 = r10
            kbc r4 = r2.a(r3, r4, r5, r6, r7, r8)
            ayf r9 = new ayf
            int r1 = r0.a
            r2 = 0
            r3 = 0
            bbi r6 = r11.g
            int r7 = r11.c
            axq$a r8 = r11.d
            r0 = r9
            r5 = r19
            r17 = r7
            r18 = r8
            r7 = r24
            r14 = r9
            r9 = r17
            r17 = r10
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r13.put(r0, r14)
            r22[r15] = r14
            r23[r15] = r16
        L_0x00d2:
            int r15 = r15 + 1
            goto L_0x000a
        L_0x00d6:
            int r0 = r13.size()
            ayf[] r0 = new defpackage.ayf[r0]
            r11.a = r0
            java.util.Collection r0 = r13.values()
            ayf<kbc>[] r1 = r11.a
            r0.toArray(r1)
            axh r0 = new axh
            ayf<kbc>[] r1 = r11.a
            r0.<init>(r1)
            r11.n = r0
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kax.a(bbd[], boolean[], axt[], boolean[], long):long");
    }

    public final void a(long j2, boolean z) {
        ayf<kbc>[] ayfArr = this.a;
        int length = ayfArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ayf<kbc> ayf = ayfArr[i2];
            if (!ayf.g()) {
                int a2 = ayf.e.a();
                ayf.e.a(j2, z, true);
                int a3 = ayf.e.a();
                if (a3 > a2) {
                    long f2 = ayf.e.a.f();
                    for (int i3 = 0; i3 < ayf.f.length; i3++) {
                        ayf.f[i3].a(f2, z, ayf.b[i3]);
                    }
                }
                int min = Math.min(ayf.a(a3, 0), ayf.g);
                if (min > 0) {
                    bdw.a((List<T>) ayf.d, 0, min);
                    ayf.g -= min;
                }
            }
        }
    }

    public final boolean c(long j2) {
        return this.n.c(j2);
    }

    public final long e() {
        return this.n.e();
    }

    public final long d() {
        long j2 = Long.MAX_VALUE;
        for (ayf<kbc> d2 : this.a) {
            long d3 = d2.d();
            if (d3 != Long.MIN_VALUE) {
                j2 = Math.min(j2, d3);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    public final long b(long j2) {
        for (ayf<kbc> b2 : this.a) {
            b2.b(j2);
        }
        return j2;
    }

    public final long a(long j2, aqs aqs) {
        ayf<kbc>[] ayfArr;
        for (ayf<kbc> ayf : this.a) {
            if (ayf.a == 2) {
                return ayf.c.a(j2, aqs);
            }
        }
        return j2;
    }

    private static axx a(List<kaw> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                List<kav> list2 = ((kaw) it.next()).b;
                aqe[] aqeArr = new aqe[list2.size()];
                for (int i2 = 0; i2 < aqeArr.length; i2++) {
                    aqeArr[i2] = ((kav) list2.get(i2)).f;
                }
                arrayList.add(new axw(aqeArr));
            } else {
                arrayList.add(new axw(aqe.a("track-debug-renderer", null, 0)));
                arrayList.add(new axw(aqe.a("track-progress-renderer", null, 0)));
                arrayList.add(new axw(aqe.a("track-sync-renderer", null, 0)));
                axw[] axwArr = new axw[arrayList.size()];
                arrayList.toArray(axwArr);
                return new axx(axwArr);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(axu axu) {
        this.m.a(this);
    }
}
