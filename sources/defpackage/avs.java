package defpackage;

/* renamed from: avs reason: default package */
public final class avs implements avp {
    private final awd a;
    private String b;
    private atu c;
    private a d;
    private boolean e;
    private final boolean[] f = new boolean[3];
    private final avw g = new avw(32, 128);
    private final avw h = new avw(33, 128);
    private final avw i = new avw(34, 128);
    private final avw j = new avw(39, 128);
    private final avw k = new avw(40, 128);
    private long l;
    private long m;
    private final bea n = new bea();

    /* renamed from: avs$a */
    static final class a {
        long a;
        boolean b;
        int c;
        long d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        long j;
        long k;
        boolean l;
        private final atu m;

        public a(atu atu) {
            this.m = atu;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2) {
            int i3 = (int) (this.a - this.j);
            int i4 = i2;
            this.m.a(this.k, this.l ? 1 : 0, i3, i4, null);
        }

        public final void a(byte[] bArr, int i2, int i3) {
            if (this.e) {
                int i4 = i2 + 2;
                int i5 = this.c;
                int i6 = i4 - i5;
                if (i6 < i3) {
                    this.f = (bArr[i6] & 128) != 0;
                    this.e = false;
                    return;
                }
                this.c = i5 + (i3 - i2);
            }
        }
    }

    public avs(awd awd) {
        this.a = awd;
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (this.e) {
            this.d.a(bArr, i2, i3);
        } else {
            this.g.a(bArr, i2, i3);
            this.h.a(bArr, i2, i3);
            this.i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    public final void a() {
        bdy.a(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        a aVar = this.d;
        aVar.e = false;
        aVar.f = false;
        aVar.g = false;
        aVar.h = false;
        aVar.i = false;
        this.l = 0;
    }

    public final void a(long j2, boolean z) {
        this.m = j2;
    }

    public final void a(atm atm, d dVar) {
        dVar.a();
        this.b = dVar.c();
        this.c = atm.a(dVar.b(), 2);
        this.d = new a(this.c);
        this.a.a(atm, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x039b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bea r34) {
        /*
            r33 = this;
            r0 = r33
        L_0x0002:
            r1 = r34
            int r2 = r34.b()
            if (r2 <= 0) goto L_0x03be
            int r2 = r1.b
            int r3 = r1.c
            byte[] r4 = r1.a
            long r5 = r0.l
            int r7 = r34.b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.l = r5
            atu r5 = r0.c
            int r6 = r34.b()
            r5.a(r1, r6)
        L_0x0023:
            if (r2 >= r3) goto L_0x0002
            boolean[] r5 = r0.f
            int r5 = defpackage.bdy.a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0031
            r0.a(r4, r2, r3)
            return
        L_0x0031:
            int r6 = defpackage.bdy.c(r4, r5)
            int r7 = r5 - r2
            if (r7 <= 0) goto L_0x003c
            r0.a(r4, r2, r5)
        L_0x003c:
            int r2 = r3 - r5
            long r8 = r0.l
            long r10 = (long) r2
            long r8 = r8 - r10
            r10 = 0
            if (r7 >= 0) goto L_0x0047
            int r7 = -r7
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            long r11 = r0.m
            boolean r13 = r0.e
            r15 = 1
            if (r13 == 0) goto L_0x0095
            avs$a r13 = r0.d
            boolean r14 = r13.i
            if (r14 == 0) goto L_0x0069
            boolean r14 = r13.f
            if (r14 == 0) goto L_0x0069
            boolean r14 = r13.b
            r13.l = r14
            r13.i = r10
            r30 = r3
            r31 = r4
            r32 = r5
            r16 = r11
            goto L_0x02f7
        L_0x0069:
            boolean r14 = r13.g
            if (r14 != 0) goto L_0x0076
            boolean r14 = r13.f
            if (r14 == 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            r16 = r11
            goto L_0x02f1
        L_0x0076:
            boolean r14 = r13.h
            r16 = r11
            if (r14 == 0) goto L_0x0085
            long r10 = r13.a
            long r10 = r8 - r10
            int r11 = (int) r10
            int r11 = r11 + r2
            r13.a(r11)
        L_0x0085:
            long r10 = r13.a
            r13.j = r10
            long r10 = r13.d
            r13.k = r10
            r13.h = r15
            boolean r10 = r13.b
            r13.l = r10
            goto L_0x02f1
        L_0x0095:
            r16 = r11
            avw r10 = r0.g
            r10.b(r7)
            avw r10 = r0.h
            r10.b(r7)
            avw r10 = r0.i
            r10.b(r7)
            avw r10 = r0.g
            boolean r10 = r10.a
            if (r10 == 0) goto L_0x02f1
            avw r10 = r0.h
            boolean r10 = r10.a
            if (r10 == 0) goto L_0x02f1
            avw r10 = r0.i
            boolean r10 = r10.a
            if (r10 == 0) goto L_0x02f1
            atu r10 = r0.c
            java.lang.String r11 = r0.b
            avw r12 = r0.g
            avw r13 = r0.h
            avw r14 = r0.i
            int r15 = r12.c
            int r1 = r13.c
            int r15 = r15 + r1
            int r1 = r14.c
            int r15 = r15 + r1
            byte[] r1 = new byte[r15]
            byte[] r15 = r12.b
            r30 = r3
            int r3 = r12.c
            r31 = r4
            r4 = 0
            java.lang.System.arraycopy(r15, r4, r1, r4, r3)
            byte[] r3 = r13.b
            int r15 = r12.c
            r32 = r5
            int r5 = r13.c
            java.lang.System.arraycopy(r3, r4, r1, r15, r5)
            byte[] r3 = r14.b
            int r5 = r12.c
            int r12 = r13.c
            int r5 = r5 + r12
            int r12 = r14.c
            java.lang.System.arraycopy(r3, r4, r1, r5, r12)
            beb r3 = new beb
            byte[] r5 = r13.b
            int r12 = r13.c
            r3.<init>(r5, r4, r12)
            r4 = 44
            r3.a(r4)
            r15 = 3
            int r4 = r3.c(r15)
            r3.a()
            r5 = 88
            r3.a(r5)
            r5 = 8
            r3.a(r5)
            r12 = 0
            r13 = 0
        L_0x0111:
            if (r12 >= r4) goto L_0x0126
            boolean r18 = r3.b()
            if (r18 == 0) goto L_0x011b
            int r13 = r13 + 89
        L_0x011b:
            boolean r18 = r3.b()
            if (r18 == 0) goto L_0x0123
            int r13 = r13 + 8
        L_0x0123:
            int r12 = r12 + 1
            goto L_0x0111
        L_0x0126:
            r3.a(r13)
            r12 = 2
            if (r4 <= 0) goto L_0x0133
            int r13 = 8 - r4
            int r13 = r13 * 2
            r3.a(r13)
        L_0x0133:
            r3.e()
            int r13 = r3.e()
            if (r13 != r15) goto L_0x013f
            r3.a()
        L_0x013f:
            int r18 = r3.e()
            int r19 = r3.e()
            boolean r20 = r3.b()
            if (r20 == 0) goto L_0x0179
            int r20 = r3.e()
            int r21 = r3.e()
            int r22 = r3.e()
            int r23 = r3.e()
            r14 = 1
            if (r13 == r14) goto L_0x0166
            if (r13 != r12) goto L_0x0163
            goto L_0x0166
        L_0x0163:
            r24 = 1
            goto L_0x0168
        L_0x0166:
            r24 = 2
        L_0x0168:
            if (r13 != r14) goto L_0x016c
            r13 = 2
            goto L_0x016d
        L_0x016c:
            r13 = 1
        L_0x016d:
            int r20 = r20 + r21
            int r24 = r24 * r20
            int r18 = r18 - r24
            int r22 = r22 + r23
            int r13 = r13 * r22
            int r19 = r19 - r13
        L_0x0179:
            r23 = r18
            r24 = r19
            r3.e()
            r3.e()
            int r13 = r3.e()
            boolean r14 = r3.b()
            if (r14 == 0) goto L_0x018f
            r14 = 0
            goto L_0x0190
        L_0x018f:
            r14 = r4
        L_0x0190:
            if (r14 > r4) goto L_0x019e
            r3.e()
            r3.e()
            r3.e()
            int r14 = r14 + 1
            goto L_0x0190
        L_0x019e:
            r3.e()
            r3.e()
            r3.e()
            r3.e()
            r3.e()
            r3.e()
            boolean r4 = r3.b()
            r14 = 4
            if (r4 == 0) goto L_0x01fc
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x01fc
            r4 = 0
        L_0x01be:
            if (r4 >= r14) goto L_0x01fc
            r5 = 0
        L_0x01c1:
            r12 = 6
            if (r5 >= r12) goto L_0x01f3
            boolean r12 = r3.b()
            if (r12 != 0) goto L_0x01cf
            r3.e()
        L_0x01cd:
            r12 = 3
            goto L_0x01ea
        L_0x01cf:
            r12 = 64
            int r20 = r4 << 1
            int r20 = r20 + 4
            r14 = 1
            int r15 = r14 << r20
            int r12 = java.lang.Math.min(r12, r15)
            if (r4 <= r14) goto L_0x01e1
            r3.d()
        L_0x01e1:
            r14 = 0
        L_0x01e2:
            if (r14 >= r12) goto L_0x01cd
            r3.d()
            int r14 = r14 + 1
            goto L_0x01e2
        L_0x01ea:
            if (r4 != r12) goto L_0x01ee
            r14 = 3
            goto L_0x01ef
        L_0x01ee:
            r14 = 1
        L_0x01ef:
            int r5 = r5 + r14
            r14 = 4
            r15 = 3
            goto L_0x01c1
        L_0x01f3:
            r12 = 3
            int r4 = r4 + 1
            r5 = 8
            r12 = 2
            r14 = 4
            r15 = 3
            goto L_0x01be
        L_0x01fc:
            r4 = 2
            r3.a(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0214
            r4 = 8
            r3.a(r4)
            r3.e()
            r3.e()
            r3.a()
        L_0x0214:
            int r4 = r3.e()
            r5 = 0
            r12 = 0
            r14 = 0
        L_0x021b:
            if (r5 >= r4) goto L_0x0268
            if (r5 == 0) goto L_0x0223
            boolean r12 = r3.b()
        L_0x0223:
            if (r12 == 0) goto L_0x023d
            r3.a()
            r3.e()
            r15 = 0
        L_0x022c:
            if (r15 > r14) goto L_0x023a
            boolean r20 = r3.b()
            if (r20 == 0) goto L_0x0237
            r3.a()
        L_0x0237:
            int r15 = r15 + 1
            goto L_0x022c
        L_0x023a:
            r22 = r4
            goto L_0x0263
        L_0x023d:
            int r14 = r3.e()
            int r15 = r3.e()
            int r20 = r14 + r15
            r22 = r4
            r4 = 0
        L_0x024a:
            if (r4 >= r14) goto L_0x0255
            r3.e()
            r3.a()
            int r4 = r4 + 1
            goto L_0x024a
        L_0x0255:
            r4 = 0
        L_0x0256:
            if (r4 >= r15) goto L_0x0261
            r3.e()
            r3.a()
            int r4 = r4 + 1
            goto L_0x0256
        L_0x0261:
            r14 = r20
        L_0x0263:
            int r5 = r5 + 1
            r4 = r22
            goto L_0x021b
        L_0x0268:
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0280
            r4 = 0
        L_0x026f:
            int r5 = r3.e()
            if (r4 >= r5) goto L_0x0280
            r5 = 4
            int r14 = r13 + 4
            r12 = 1
            int r14 = r14 + r12
            r3.a(r14)
            int r4 = r4 + 1
            goto L_0x026f
        L_0x0280:
            r4 = 2
            r3.a(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            boolean r5 = r3.b()
            if (r5 == 0) goto L_0x02d0
            boolean r5 = r3.b()
            if (r5 == 0) goto L_0x02d0
            r5 = 8
            int r5 = r3.c(r5)
            r12 = 255(0xff, float:3.57E-43)
            if (r5 != r12) goto L_0x02b0
            r12 = 16
            int r5 = r3.c(r12)
            int r3 = r3.c(r12)
            if (r5 == 0) goto L_0x02ad
            if (r3 == 0) goto L_0x02ad
            float r4 = (float) r5
            float r3 = (float) r3
            float r4 = r4 / r3
        L_0x02ad:
            r28 = r4
            goto L_0x02d2
        L_0x02b0:
            float[] r3 = defpackage.bdy.b
            r3 = 17
            if (r5 >= r3) goto L_0x02bd
            float[] r3 = defpackage.bdy.b
            r3 = r3[r5]
            r28 = r3
            goto L_0x02d2
        L_0x02bd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r12 = "Unexpected aspect_ratio_idc value: "
            r3.<init>(r12)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "H265Reader"
            defpackage.bdu.c(r5, r3)
        L_0x02d0:
            r28 = 1065353216(0x3f800000, float:1.0)
        L_0x02d2:
            r20 = 0
            r21 = -1
            r22 = -1
            r25 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r26 = java.util.Collections.singletonList(r1)
            r27 = -1
            r29 = 0
            java.lang.String r19 = "video/hevc"
            r18 = r11
            aqv r1 = defpackage.aqv.a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10.a(r1)
            r1 = 1
            r0.e = r1
            goto L_0x02f7
        L_0x02f1:
            r30 = r3
            r31 = r4
            r32 = r5
        L_0x02f7:
            avw r1 = r0.j
            boolean r1 = r1.b(r7)
            r3 = 5
            if (r1 == 0) goto L_0x0324
            avw r1 = r0.j
            byte[] r1 = r1.b
            avw r4 = r0.j
            int r4 = r4.c
            int r1 = defpackage.bdy.a(r1, r4)
            bea r4 = r0.n
            avw r5 = r0.j
            byte[] r5 = r5.b
            r4.a(r5, r1)
            bea r1 = r0.n
            r1.d(r3)
            awd r1 = r0.a
            bea r4 = r0.n
            r10 = r16
            r1.a(r10, r4)
            goto L_0x0326
        L_0x0324:
            r10 = r16
        L_0x0326:
            avw r1 = r0.k
            boolean r1 = r1.b(r7)
            if (r1 == 0) goto L_0x034f
            avw r1 = r0.k
            byte[] r1 = r1.b
            avw r4 = r0.k
            int r4 = r4.c
            int r1 = defpackage.bdy.a(r1, r4)
            bea r4 = r0.n
            avw r5 = r0.k
            byte[] r5 = r5.b
            r4.a(r5, r1)
            bea r1 = r0.n
            r1.d(r3)
            awd r1 = r0.a
            bea r3 = r0.n
            r1.a(r10, r3)
        L_0x034f:
            long r3 = r0.m
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x039b
            avs$a r1 = r0.d
            r5 = 0
            r1.f = r5
            r1.g = r5
            r1.d = r3
            r1.c = r5
            r1.a = r8
            r3 = 32
            if (r6 < r3) goto L_0x0380
            boolean r3 = r1.i
            if (r3 != 0) goto L_0x0373
            boolean r3 = r1.h
            if (r3 == 0) goto L_0x0373
            r1.a(r2)
            r1.h = r5
        L_0x0373:
            r2 = 34
            if (r6 > r2) goto L_0x0380
            boolean r2 = r1.i
            r4 = 1
            r2 = r2 ^ r4
            r1.g = r2
            r1.i = r4
            goto L_0x0381
        L_0x0380:
            r4 = 1
        L_0x0381:
            r2 = 16
            if (r6 < r2) goto L_0x038b
            r2 = 21
            if (r6 > r2) goto L_0x038b
            r2 = 1
            goto L_0x038c
        L_0x038b:
            r2 = 0
        L_0x038c:
            r1.b = r2
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x0398
            r2 = 9
            if (r6 > r2) goto L_0x0397
            goto L_0x0398
        L_0x0397:
            r4 = 0
        L_0x0398:
            r1.e = r4
            goto L_0x03aa
        L_0x039b:
            avw r1 = r0.g
            r1.a(r6)
            avw r1 = r0.h
            r1.a(r6)
            avw r1 = r0.i
            r1.a(r6)
        L_0x03aa:
            avw r1 = r0.j
            r1.a(r6)
            avw r1 = r0.k
            r1.a(r6)
            int r2 = r32 + 3
            r1 = r34
            r3 = r30
            r4 = r31
            goto L_0x0023
        L_0x03be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avs.a(bea):void");
    }

    public final void b() {
    }
}
