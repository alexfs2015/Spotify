package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: kcx reason: default package */
public final class kcx implements ayf, a<ayw<kdc>> {
    ayw<kdc>[] a;
    private final a b;
    private final int c;
    private final a d;
    private final long e;
    private final bcq f;
    private final bbz g;
    private final ayo h;
    private final kde i;
    private final int j = 0;
    private final List<kcw> k;
    private final bcu l;
    private a m;
    private axy n;

    public kcx(kde kde, int i2, bcu bcu, a aVar, int i3, a aVar2, long j2, bcq bcq, bbz bbz) {
        this.i = kde;
        this.l = bcu;
        this.b = aVar;
        this.c = i3;
        this.d = aVar2;
        this.e = 0;
        this.f = bcq;
        this.g = bbz;
        this.a = new ayw[0];
        this.n = new axy(this.a);
        this.k = kde.a(0).a;
        this.h = a(this.k);
    }

    private static ayo a(List<kcw> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                List<kcv> list2 = ((kcw) it.next()).b;
                aqv[] aqvArr = new aqv[list2.size()];
                for (int i2 = 0; i2 < aqvArr.length; i2++) {
                    aqvArr[i2] = ((kcv) list2.get(i2)).f;
                }
                arrayList.add(new ayn(aqvArr));
            } else {
                arrayList.add(new ayn(aqv.a("track-debug-renderer", null, 0)));
                arrayList.add(new ayn(aqv.a("track-progress-renderer", null, 0)));
                arrayList.add(new ayn(aqv.a("track-sync-renderer", null, 0)));
                ayn[] aynArr = new ayn[arrayList.size()];
                arrayList.toArray(aynArr);
                return new ayo(aynArr);
            }
        }
    }

    public final long a(long j2, arj arj) {
        ayw<kdc>[] aywArr;
        for (ayw<kdc> ayw : this.a) {
            if (ayw.a == 2) {
                return ayw.c.a(j2, arj);
            }
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ("track-sync-renderer".equals(r0.g().a) != false) goto L_0x003d;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=ayk[], code=java.lang.Object[], for r22v0, types: [ayk[], java.lang.Object[]] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bbu[] r20, boolean[] r21, java.lang.Object[] r22, boolean[] r23, long r24) {
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
            aqv r1 = r0.g()
            java.lang.String r1 = r1.a
            java.lang.String r2 = "track-debug-renderer"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            aqv r1 = r0.g()
            java.lang.String r1 = r1.a
            java.lang.String r2 = "track-progress-renderer"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            aqv r0 = r0.g()
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
            ayc r0 = new ayc
            r0.<init>()
            r22[r15] = r0
            goto L_0x00d2
        L_0x004b:
            r0 = r22[r15]
            boolean r0 = r0 instanceof defpackage.ayw
            if (r0 == 0) goto L_0x0078
            r0 = r22[r15]
            ayw r0 = (defpackage.ayw) r0
            r1 = r12[r15]
            if (r1 == 0) goto L_0x0072
            boolean r1 = r21[r15]
            if (r1 != 0) goto L_0x005e
            goto L_0x0072
        L_0x005e:
            ayo r1 = r11.h
            r2 = r12[r15]
            ayn r2 = r2.e()
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
            ayo r0 = r11.h
            r1 = r12[r15]
            ayn r1 = r1.e()
            int r10 = r0.a(r1)
            r0 = -1
            if (r10 == r0) goto L_0x00d2
            r7 = r12[r15]
            java.util.List<kcw> r0 = r11.k
            java.lang.Object r0 = r0.get(r10)
            kcw r0 = (defpackage.kcw) r0
            kdc$a r2 = r11.b
            bcq r3 = r11.f
            kde r4 = r11.i
            int r5 = r11.j
            bcu r8 = r11.l
            r6 = r10
            kdc r4 = r2.a(r3, r4, r5, r6, r7, r8)
            ayw r9 = new ayw
            int r1 = r0.a
            r2 = 0
            r3 = 0
            bbz r6 = r11.g
            int r7 = r11.c
            ayh$a r8 = r11.d
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
            ayw[] r0 = new defpackage.ayw[r0]
            r11.a = r0
            java.util.Collection r0 = r13.values()
            ayw<kdc>[] r1 = r11.a
            r0.toArray(r1)
            axy r0 = new axy
            ayw<kdc>[] r1 = r11.a
            r0.<init>(r1)
            r11.n = r0
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcx.a(bbu[], boolean[], ayk[], boolean[], long):long");
    }

    public final void a(long j2) {
    }

    public final void a(long j2, boolean z) {
        ayw<kdc>[] aywArr = this.a;
        int length = aywArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ayw<kdc> ayw = aywArr[i2];
            if (!ayw.g()) {
                int a2 = ayw.e.a();
                ayw.e.a(j2, z, true);
                int a3 = ayw.e.a();
                if (a3 > a2) {
                    long f2 = ayw.e.a.f();
                    for (int i3 = 0; i3 < ayw.f.length; i3++) {
                        ayw.f[i3].a(f2, z, ayw.b[i3]);
                    }
                }
                int min = Math.min(ayw.a(a3, 0), ayw.g);
                if (min > 0) {
                    ben.a((List<T>) ayw.d, 0, min);
                    ayw.g -= min;
                }
            }
        }
    }

    public final void a(a aVar, long j2) {
        this.m = aVar;
        aVar.a(this);
    }

    public final /* bridge */ /* synthetic */ void a(ayl ayl) {
        this.m.a(this);
    }

    public final long b(long j2) {
        for (ayw<kdc> b2 : this.a) {
            b2.b(j2);
        }
        return j2;
    }

    public final ayo b() {
        return this.h;
    }

    public final long c() {
        return -9223372036854775807L;
    }

    public final boolean c(long j2) {
        return this.n.c(j2);
    }

    public final long d() {
        long j2 = Long.MAX_VALUE;
        for (ayw<kdc> d2 : this.a) {
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

    public final long e() {
        return this.n.e();
    }

    public final void m_() {
    }
}
