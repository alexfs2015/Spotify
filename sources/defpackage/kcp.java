package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.List;

/* renamed from: kcp reason: default package */
public final class kcp implements kdc {
    private final bcq a;
    private final kde b;
    private final int c;
    private final bbu d;
    private final bce e;
    private final int f;
    private final long g;
    private final List<kcv> h = b().b;
    private final kcz i;
    private boolean j;
    private int k;
    private IOException l;

    /* renamed from: kcp$a */
    public static final class a implements defpackage.kdc.a {
        private final defpackage.bce.a a;
        private final int b;
        private final kcz c;

        public a(defpackage.bce.a aVar, kcz kcz) {
            this(aVar, kcz, 1);
        }

        private a(defpackage.bce.a aVar, kcz kcz, int i) {
            this.a = aVar;
            this.c = kcz;
            this.b = 1;
        }

        public final kdc a(bcq bcq, kde kde, int i, int i2, bbu bbu, bcu bcu) {
            bcq bcq2 = bcq;
            kde kde2 = kde;
            int i3 = i;
            int i4 = i2;
            bbu bbu2 = bbu;
            kcp kcp = new kcp(this.c, bcq2, kde2, i3, i4, bbu2, this.a.a(), this.b, bcu);
            return kcp;
        }
    }

    public kcp(kcz kcz, bcq bcq, kde kde, int i2, int i3, bbu bbu, bce bce, int i4, bcu bcu) {
        this.i = kcz;
        this.a = bcq;
        this.b = kde;
        this.c = i3;
        this.d = bbu;
        this.e = bce;
        this.f = i2;
        this.g = (long) i4;
        if (bcu != null) {
            bce.a(bcu);
        }
    }

    private kcv a() {
        aqv g2 = this.d.g();
        for (kcv kcv : this.h) {
            if (kcv.f.equals(g2)) {
                return kcv;
            }
        }
        return null;
    }

    private kcw b() {
        return this.b.a(this.f).a(this.c);
    }

    public final int a(long j2, List<? extends azb> list) {
        return (this.l != null || this.d.f() < 2) ? list.size() : this.d.a(j2, list);
    }

    public final long a(long j2, arj arj) {
        if (this.h.size() <= 0) {
            return j2;
        }
        kcv kcv = (kcv) this.h.get(0);
        int a2 = kcv.a(j2);
        long j3 = ((long) a2) * kcv.a;
        return ben.a(j2, arj, j3, (j3 >= j2 || a2 >= kcv.a() + -1) ? j3 : ((long) (a2 + 1)) * kcv.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x021f A[LOOP:1: B:50:0x018b->B:78:0x021f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0232 A[EDGE_INSN: B:85:0x0232->B:80:0x0232 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r37, long r39, java.util.List<? extends defpackage.azb> r41, defpackage.ayv r42) {
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
            bbu r1 = r0.d
            int r1 = r1.f()
            azc[] r1 = new defpackage.azc[r1]
            r2 = 0
            r3 = 0
        L_0x0017:
            int r6 = r1.length
            r11 = 1
            if (r3 >= r6) goto L_0x003d
            kcw r6 = r36.b()
            java.util.List<kcv> r6 = r6.b
            java.lang.Object r6 = r6.get(r3)
            kcv r6 = (defpackage.kcv) r6
            int r7 = r6.a(r8)
            int r12 = r6.a()
            int r12 = r12 + r2
            int r12 = r12 - r11
            kdb r11 = new kdb
            kcz r13 = r0.i
            r11.<init>(r6, r13, r7, r12)
            r1[r3] = r11
            int r3 = r3 + 1
            goto L_0x0017
        L_0x003d:
            bbu r1 = r0.d
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = r37
            r1.a(r2, r4, r6)
            kcv r1 = r36.a()
            java.lang.Object r1 = defpackage.fbp.a(r1)
            kcv r1 = (defpackage.kcv) r1
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x005e
            ayu r2 = r1.c
            if (r2 != 0) goto L_0x005e
            r10.b = r11
            return
        L_0x005e:
            bbu r2 = r0.d
            aqv r2 = r2.g()
            kcz r3 = r0.i
            java.util.List<java.lang.String> r4 = r1.g
            r3.d = r4
            ho r3 = r3.a(r4)
            F r3 = r3.a
            java.lang.String r3 = (java.lang.String) r3
            ayu r4 = r1.c
            if (r4 == 0) goto L_0x00c5
            ayu r4 = r1.c
            aqv[] r4 = r4.b
            if (r4 != 0) goto L_0x0095
            fbf r4 = new fbf
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
            bce r5 = r0.e
            bbu r6 = r0.d
            int r7 = r6.b()
            bbu r6 = r0.d
            java.lang.Object r8 = r6.c()
            bcg r6 = new bcg
            android.net.Uri r12 = r4.a(r3)
            long r13 = r4.a
            long r3 = r4.b
            r17 = 0
            r11 = r6
            r15 = r3
            r11.<init>(r12, r13, r15, r17)
            aza r11 = new aza
            ayu r9 = r1.c
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
            azb r4 = (defpackage.azb) r4
        L_0x00e4:
            if (r4 != 0) goto L_0x00f5
            int r4 = r1.a(r8)
            long r8 = (long) r4
            r16 = 0
            r14 = r8
            r18 = r6
            long r8 = defpackage.ben.a(r14, r16, r18)
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
            bce r13 = r0.e
            bbu r6 = r0.d
            int r16 = r6.b()
            bbu r6 = r0.d
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
            fbf r6 = r1.b(r8)
            ayu r7 = r1.c
            if (r7 != 0) goto L_0x0189
            bcg r1 = new bcg
            android.net.Uri r25 = r6.a(r3)
            long r3 = r6.a
            long r5 = r6.b
            r30 = 0
            r24 = r1
            r26 = r3
            r28 = r5
            r24.<init>(r25, r26, r28, r30)
            azd r3 = new azd
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
            fbf r7 = r1.b(r14)
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
            fbf r4 = new fbf
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
            fbf r0 = new fbf
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
            bcg r29 = new bcg
            r14 = r29
            android.net.Uri r30 = r6.a(r3)
            long r0 = r6.a
            long r2 = r6.b
            r35 = 0
            r31 = r0
            r33 = r2
            r29.<init>(r30, r31, r33, r35)
            ayy r0 = new ayy
            r12 = r0
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = 0
            ayu r1 = r5.c
            r31 = r1
            r15 = r4
            r26 = r37
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r29, r31)
        L_0x025b:
            r10.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcp.a(long, long, java.util.List, ayv):void");
    }

    public final void a(ayt ayt) {
        kcz kcz = this.i;
        String a2 = kcz.a(ayt.e.a);
        kcz.c.put(a2, Integer.valueOf(Math.max(0, ((Integer) jvi.a(kcz.c.get(a2), Integer.valueOf(0))).intValue() - 1)));
        kcz.b.remove(a2);
        this.k = 0;
        this.l = null;
    }

    public final boolean a(ayt ayt, boolean z, Exception exc) {
        kcz kcz = this.i;
        String a2 = kcz.a(ayt.e.a);
        boolean z2 = false;
        kcz.c.put(a2, Integer.valueOf(((Integer) jvi.a(kcz.c.get(a2), Integer.valueOf(0))).intValue() + 1));
        kcz.b.put(a2, Long.valueOf(kcz.a.c()));
        kcv a3 = a();
        if (a3 != null && ((Boolean) fbp.a(this.i.a(a3.g).b)).booleanValue()) {
            this.k++;
        }
        if (a3 == null || this.k >= 3) {
            if (!(ayt == null || ayt.g == null || !TextUtils.equals(ayt.g.f, "text/vtt"))) {
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
}
