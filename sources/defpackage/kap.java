package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.List;

/* renamed from: kap reason: default package */
public final class kap implements kbc {
    private final bbz a;
    private final kbe b;
    private final int c;
    private final bbd d;
    private final bbn e;
    private final int f;
    private final long g;
    private final List<kav> h = b().b;
    private final kaz i;
    private boolean j;
    private int k;
    private IOException l;

    /* renamed from: kap$a */
    public static final class a implements defpackage.kbc.a {
        private final defpackage.bbn.a a;
        private final int b;
        private final kaz c;

        public a(defpackage.bbn.a aVar, kaz kaz) {
            this(aVar, kaz, 1);
        }

        private a(defpackage.bbn.a aVar, kaz kaz, int i) {
            this.a = aVar;
            this.c = kaz;
            this.b = 1;
        }

        public final kbc a(bbz bbz, kbe kbe, int i, int i2, bbd bbd, bcd bcd) {
            bbz bbz2 = bbz;
            kbe kbe2 = kbe;
            int i3 = i;
            int i4 = i2;
            bbd bbd2 = bbd;
            kap kap = new kap(this.c, bbz2, kbe2, i3, i4, bbd2, this.a.a(), this.b, bcd);
            return kap;
        }
    }

    public kap(kaz kaz, bbz bbz, kbe kbe, int i2, int i3, bbd bbd, bbn bbn, int i4, bcd bcd) {
        this.i = kaz;
        this.a = bbz;
        this.b = kbe;
        this.c = i3;
        this.d = bbd;
        this.e = bbn;
        this.f = i2;
        this.g = (long) i4;
        if (bcd != null) {
            bbn.a(bcd);
        }
    }

    public final long a(long j2, aqs aqs) {
        if (this.h.size() <= 0) {
            return j2;
        }
        kav kav = (kav) this.h.get(0);
        int a2 = kav.a(j2);
        long j3 = ((long) a2) * kav.a;
        return bdw.a(j2, aqs, j3, (j3 >= j2 || a2 >= kav.a() + -1) ? j3 : ((long) (a2 + 1)) * kav.a);
    }

    public final int a(long j2, List<? extends ayk> list) {
        if (this.l != null || this.d.f() < 2) {
            return list.size();
        }
        return this.d.a(j2, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x021f A[LOOP:1: B:50:0x018b->B:78:0x021f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0232 A[EDGE_INSN: B:85:0x0232->B:80:0x0232 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r37, long r39, java.util.List<? extends defpackage.ayk> r41, defpackage.aye r42) {
        /*
            r36 = this;
            r0 = r36
            r8 = r37
            r10 = r42
            java.io.IOException r1 = r0.l
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            long r4 = r39 - r8
            bbd r1 = r0.d
            int r1 = r1.f()
            ayl[] r1 = new defpackage.ayl[r1]
            r2 = 0
            r3 = 0
        L_0x0017:
            int r6 = r1.length
            r11 = 1
            if (r3 >= r6) goto L_0x003d
            kaw r6 = r36.b()
            java.util.List<kav> r6 = r6.b
            java.lang.Object r6 = r6.get(r3)
            kav r6 = (defpackage.kav) r6
            int r7 = r6.a(r8)
            int r12 = r6.a()
            int r12 = r12 + r2
            int r12 = r12 - r11
            kbb r11 = new kbb
            kaz r13 = r0.i
            r11.<init>(r6, r13, r7, r12)
            r1[r3] = r11
            int r3 = r3 + 1
            goto L_0x0017
        L_0x003d:
            bbd r1 = r0.d
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = r37
            r1.a(r2, r4, r6)
            kav r1 = r36.a()
            java.lang.Object r1 = defpackage.fay.a(r1)
            kav r1 = (defpackage.kav) r1
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x005e
            ayd r2 = r1.c
            if (r2 != 0) goto L_0x005e
            r10.b = r11
            return
        L_0x005e:
            bbd r2 = r0.d
            aqe r2 = r2.g()
            kaz r3 = r0.i
            java.util.List<java.lang.String> r4 = r1.g
            r3.d = r4
            ho r3 = r3.a(r4)
            F r3 = r3.a
            java.lang.String r3 = (java.lang.String) r3
            ayd r4 = r1.c
            if (r4 == 0) goto L_0x00c5
            ayd r4 = r1.c
            aqe[] r4 = r4.b
            if (r4 != 0) goto L_0x0095
            fao r4 = new fao
            java.lang.String r6 = r1.h
            long r12 = r1.e
            java.lang.String r7 = java.lang.String.valueOf(r12)
            java.lang.String r12 = "{{profile_id}}"
            java.lang.String r13 = r6.replace(r12, r7)
            r14 = 0
            r16 = -1
            r12 = r4
            r12.<init>(r13, r14, r16)
            goto L_0x0096
        L_0x0095:
            r4 = 0
        L_0x0096:
            if (r4 == 0) goto L_0x00c5
            bbn r5 = r0.e
            bbd r6 = r0.d
            int r7 = r6.b()
            bbd r6 = r0.d
            java.lang.Object r8 = r6.c()
            bbp r6 = new bbp
            android.net.Uri r12 = r4.a(r3)
            long r13 = r4.a
            long r3 = r4.b
            r17 = 0
            r11 = r6
            r15 = r3
            r11.<init>(r12, r13, r15, r17)
            ayj r11 = new ayj
            ayd r9 = r1.c
            r3 = r11
            r4 = r5
            r5 = r6
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.a = r11
            return
        L_0x00c5:
            int r4 = r1.a()
            long r6 = (long) r4
            r12 = 1
            long r6 = r6 - r12
            boolean r4 = r41.isEmpty()
            if (r4 == 0) goto L_0x00d7
            r14 = r41
            r4 = 0
            goto L_0x00e4
        L_0x00d7:
            int r4 = r41.size()
            int r4 = r4 - r11
            r14 = r41
            java.lang.Object r4 = r14.get(r4)
            ayk r4 = (defpackage.ayk) r4
        L_0x00e4:
            if (r4 != 0) goto L_0x00f5
            int r4 = r1.a(r8)
            long r8 = (long) r4
            r16 = 0
            r14 = r8
            r18 = r6
            long r8 = defpackage.bdw.a(r14, r16, r18)
            goto L_0x0107
        L_0x00f5:
            long r8 = r4.f()
            r14 = 0
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x0107
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r1.<init>()
            r0.l = r1
            return
        L_0x0107:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x010e
            r10.b = r11
            return
        L_0x010e:
            boolean r4 = r41.isEmpty()
            if (r4 == 0) goto L_0x0117
            r22 = r39
            goto L_0x011e
        L_0x0117:
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r22 = r14
        L_0x011e:
            long r14 = r0.g
            long r6 = r6 - r8
            long r6 = r6 + r12
            long r6 = java.lang.Math.min(r14, r6)
            int r4 = (int) r6
            bbn r13 = r0.e
            bbd r6 = r0.d
            int r16 = r6.b()
            bbd r6 = r0.d
            java.lang.Object r17 = r6.c()
            long r6 = r1.a
            long r18 = r8 * r6
            int r6 = r1.a()
            r7 = -1
            if (r6 == r7) goto L_0x0152
            int r6 = r1.a()
            int r6 = r6 - r11
            long r6 = (long) r6
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x0152
            long r6 = r1.b
            long r14 = r1.a
            long r14 = r14 * r8
            long r6 = r6 - r14
            goto L_0x0159
        L_0x0152:
            long r6 = r1.d
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r14
        L_0x0159:
            long r20 = r18 + r6
            fao r6 = r1.b(r8)
            ayd r7 = r1.c
            if (r7 != 0) goto L_0x0189
            bbp r1 = new bbp
            android.net.Uri r25 = r6.a(r3)
            long r3 = r6.a
            long r5 = r6.b
            r30 = 0
            r24 = r1
            r26 = r3
            r28 = r5
            r24.<init>(r25, r26, r28, r30)
            aym r3 = new aym
            r24 = 3
            r12 = r3
            r14 = r1
            r15 = r2
            r22 = r8
            r25 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24, r25)
            r0 = r3
            goto L_0x025b
        L_0x0189:
            r28 = 1
        L_0x018b:
            if (r11 >= r4) goto L_0x022e
            long r14 = (long) r11
            long r14 = r14 + r8
            fao r7 = r1.b(r14)
            java.lang.String r12 = r6.b(r3)
            if (r7 == 0) goto L_0x0216
            java.lang.String r14 = r7.b(r3)
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L_0x01a5
            goto L_0x0216
        L_0x01a5:
            long r14 = r6.b
            r24 = -1
            int r26 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r26 == 0) goto L_0x01e0
            long r14 = r6.a
            r27 = r4
            long r4 = r6.b
            long r14 = r14 + r4
            long r4 = r7.a
            int r29 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r29 != 0) goto L_0x01de
            fao r4 = new fao
            long r14 = r6.a
            r37 = r8
            long r8 = r7.b
            int r5 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r5 != 0) goto L_0x01ca
            r5 = r1
            r33 = r24
            goto L_0x01d2
        L_0x01ca:
            long r8 = r6.b
            r5 = r1
            long r0 = r7.b
            long r8 = r8 + r0
            r33 = r8
        L_0x01d2:
            r29 = r4
            r30 = r12
            r31 = r14
            r29.<init>(r30, r31, r33)
            r0 = r4
            r4 = r2
            goto L_0x021d
        L_0x01de:
            r5 = r1
            goto L_0x01e3
        L_0x01e0:
            r5 = r1
            r27 = r4
        L_0x01e3:
            r37 = r8
            long r0 = r7.b
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 == 0) goto L_0x021b
            long r0 = r7.a
            long r8 = r7.b
            long r0 = r0 + r8
            long r8 = r6.a
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x021b
            fao r0 = new fao
            long r8 = r7.a
            long r14 = r6.b
            int r1 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r1 != 0) goto L_0x0204
            r4 = r2
            r33 = r24
            goto L_0x020c
        L_0x0204:
            long r14 = r7.b
            r4 = r2
            long r1 = r6.b
            long r14 = r14 + r1
            r33 = r14
        L_0x020c:
            r29 = r0
            r30 = r12
            r31 = r8
            r29.<init>(r30, r31, r33)
            goto L_0x021d
        L_0x0216:
            r5 = r1
            r27 = r4
            r37 = r8
        L_0x021b:
            r4 = r2
            r0 = 0
        L_0x021d:
            if (r0 == 0) goto L_0x0232
            int r28 = r28 + 1
            int r11 = r11 + 1
            r8 = r37
            r6 = r0
            r2 = r4
            r1 = r5
            r4 = r27
            r0 = r36
            goto L_0x018b
        L_0x022e:
            r5 = r1
            r4 = r2
            r37 = r8
        L_0x0232:
            bbp r29 = new bbp
            r14 = r29
            android.net.Uri r30 = r6.a(r3)
            long r0 = r6.a
            long r2 = r6.b
            r35 = 0
            r31 = r0
            r33 = r2
            r29.<init>(r30, r31, r33, r35)
            ayh r0 = new ayh
            r12 = r0
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = 0
            ayd r1 = r5.c
            r31 = r1
            r15 = r4
            r26 = r37
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r29, r31)
        L_0x025b:
            r10.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kap.a(long, long, java.util.List, aye):void");
    }

    public final void a(ayc ayc) {
        kaz kaz = this.i;
        String a2 = kaz.a(ayc.e.a);
        kaz.c.put(a2, Integer.valueOf(Math.max(0, ((Integer) jtc.a(kaz.c.get(a2), Integer.valueOf(0))).intValue() - 1)));
        kaz.b.remove(a2);
        this.k = 0;
        this.l = null;
    }

    public final boolean a(ayc ayc, boolean z, Exception exc) {
        kaz kaz = this.i;
        String a2 = kaz.a(ayc.e.a);
        boolean z2 = false;
        kaz.c.put(a2, Integer.valueOf(((Integer) jtc.a(kaz.c.get(a2), Integer.valueOf(0))).intValue() + 1));
        kaz.b.put(a2, Long.valueOf(kaz.a.c()));
        kav a3 = a();
        if (a3 != null && ((Boolean) fay.a(this.i.a(a3.g).b)).booleanValue()) {
            this.k++;
        }
        if (a3 == null || this.k >= 3) {
            if (!(ayc == null || ayc.g == null || !TextUtils.equals(ayc.g.f, "text/vtt"))) {
                z2 = true;
            }
            if (z2) {
                this.j = true;
            } else {
                this.l = exc instanceof IOException ? (IOException) exc : new IOException("Failed to retrieve chunk from CDN", exc);
            }
        }
        return z;
    }

    private kav a() {
        aqe g2 = this.d.g();
        for (kav kav : this.h) {
            if (kav.f.equals(g2)) {
                return kav;
            }
        }
        return null;
    }

    private kaw b() {
        return this.b.a(this.f).a(this.c);
    }
}
