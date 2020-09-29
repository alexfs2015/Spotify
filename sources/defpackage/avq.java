package defpackage;

import java.util.Arrays;

/* renamed from: avq reason: default package */
public final class avq implements avp {
    private static final double[] c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private atu b;
    private boolean d;
    private long e;
    private final awk f;
    private final bea g;
    private final boolean[] h;
    private final a i;
    private final avw j;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    /* renamed from: avq$a */
    static final class a {
        static final byte[] a = {0, 0, 1};
        boolean b;
        public int c;
        public int d;
        public byte[] e = new byte[128];

        public a(int i) {
        }

        public final void a(byte[] bArr, int i, int i2) {
            if (this.b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c;
                if (length < i4 + i3) {
                    this.e = Arrays.copyOf(bArr2, (i4 + i3) << 1);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }
    }

    public avq() {
        this(null);
    }

    public avq(awk awk) {
        this.f = awk;
        this.h = new boolean[4];
        this.i = new a(128);
        if (awk != null) {
            this.j = new avw(178, 128);
            this.g = new bea();
            return;
        }
        this.j = null;
        this.g = null;
    }

    public final void a() {
        bdy.a(this.h);
        a aVar = this.i;
        aVar.b = false;
        aVar.c = 0;
        aVar.d = 0;
        if (this.f != null) {
            this.j.a();
        }
        this.k = 0;
        this.l = false;
    }

    public final void a(long j2, boolean z) {
        this.m = j2;
    }

    public final void a(atm atm, d dVar) {
        atm atm2 = atm;
        dVar.a();
        this.a = dVar.c();
        this.b = atm2.a(dVar.b(), 2);
        awk awk = this.f;
        if (awk != null) {
            for (int i2 = 0; i2 < awk.b.length; i2++) {
                dVar.a();
                atu a2 = atm2.a(dVar.b(), 3);
                aqv aqv = (aqv) awk.a.get(i2);
                String str = aqv.f;
                boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                StringBuilder sb = new StringBuilder("Invalid closed caption mime type provided: ");
                sb.append(str);
                bdl.a(z, sb.toString());
                a2.a(aqv.a(dVar.c(), str, (String) null, -1, aqv.v, aqv.w, aqv.x, (ast) null, Long.MAX_VALUE, aqv.h));
                awk.b[i2] = a2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bea r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            int r2 = r1.b
            int r3 = r1.c
            byte[] r4 = r1.a
            long r5 = r0.k
            int r7 = r30.b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.k = r5
            atu r5 = r0.b
            int r6 = r30.b()
            r5.a(r1, r6)
        L_0x001d:
            boolean[] r5 = r0.h
            int r5 = defpackage.bdy.a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0038
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x002e
            avq$a r1 = r0.i
            r1.a(r4, r2, r3)
        L_0x002e:
            awk r1 = r0.f
            if (r1 == 0) goto L_0x0037
            avw r1 = r0.j
            r1.a(r4, r2, r3)
        L_0x0037:
            return
        L_0x0038:
            byte[] r6 = r1.a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.d
            r12 = 179(0xb3, float:2.51E-43)
            r14 = 3
            r15 = 0
            r10 = 1
            if (r9 != 0) goto L_0x014b
            if (r8 <= 0) goto L_0x0052
            avq$a r9 = r0.i
            r9.a(r4, r2, r5)
        L_0x0052:
            if (r8 >= 0) goto L_0x0056
            int r9 = -r8
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            avq$a r11 = r0.i
            boolean r13 = r11.b
            if (r13 == 0) goto L_0x0073
            int r13 = r11.c
            int r13 = r13 - r9
            r11.c = r13
            int r9 = r11.d
            if (r9 != 0) goto L_0x006f
            r9 = 181(0xb5, float:2.54E-43)
            if (r6 != r9) goto L_0x006f
            int r9 = r11.c
            r11.d = r9
            goto L_0x0077
        L_0x006f:
            r11.b = r15
            r9 = 1
            goto L_0x007d
        L_0x0073:
            if (r6 != r12) goto L_0x0077
            r11.b = r10
        L_0x0077:
            byte[] r9 = defpackage.avq.a.a
            r11.a(r9, r15, r14)
            r9 = 0
        L_0x007d:
            if (r9 == 0) goto L_0x014b
            avq$a r9 = r0.i
            java.lang.String r11 = r0.a
            byte[] r13 = r9.e
            int r15 = r9.c
            byte[] r13 = java.util.Arrays.copyOf(r13, r15)
            r15 = 4
            byte r12 = r13[r15]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r28 = 5
            byte r10 = r13[r28]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r16 = 6
            byte r14 = r13[r16]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r12 = r12 << r15
            int r16 = r10 >> 4
            r21 = r12 | r16
            r10 = r10 & 15
            r12 = 8
            int r10 = r10 << r12
            r22 = r10 | r14
            r14 = 7
            byte r10 = r13[r14]
            r10 = r10 & 240(0xf0, float:3.36E-43)
            int r10 = r10 >> r15
            r12 = 2
            if (r10 == r12) goto L_0x00c5
            r12 = 3
            if (r10 == r12) goto L_0x00bf
            if (r10 == r15) goto L_0x00b9
            r26 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ce
        L_0x00b9:
            int r10 = r22 * 121
            float r10 = (float) r10
            int r12 = r21 * 100
            goto L_0x00ca
        L_0x00bf:
            int r10 = r22 * 16
            float r10 = (float) r10
            int r12 = r21 * 9
            goto L_0x00ca
        L_0x00c5:
            int r10 = r22 * 4
            float r10 = (float) r10
            int r12 = r21 * 3
        L_0x00ca:
            float r12 = (float) r12
            float r10 = r10 / r12
            r26 = r10
        L_0x00ce:
            r18 = 0
            r19 = -1
            r20 = -1
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r24 = java.util.Collections.singletonList(r13)
            r25 = -1
            r27 = 0
            java.lang.String r17 = "video/mpeg2"
            r16 = r11
            aqv r10 = defpackage.aqv.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            byte r11 = r13[r14]
            r11 = r11 & 15
            r12 = 1
            int r11 = r11 - r12
            if (r11 < 0) goto L_0x0127
            r12 = 8
            if (r11 >= r12) goto L_0x0127
            double[] r12 = c
            r11 = r12[r11]
            int r9 = r9.d
            r14 = 9
            int r9 = r9 + r14
            byte r14 = r13[r9]
            r14 = r14 & 96
            int r14 = r14 >> 5
            byte r9 = r13[r9]
            r9 = r9 & 31
            if (r14 == r9) goto L_0x011c
            double r13 = (double) r14
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r13)
            double r13 = r13 + r16
            int r9 = r9 + 1
            r16 = r6
            r15 = r7
            double r6 = (double) r9
            java.lang.Double.isNaN(r6)
            double r13 = r13 / r6
            double r11 = r11 * r13
            goto L_0x011f
        L_0x011c:
            r16 = r6
            r15 = r7
        L_0x011f:
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 / r11
            long r6 = (long) r6
            goto L_0x012c
        L_0x0127:
            r16 = r6
            r15 = r7
            r6 = 0
        L_0x012c:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            android.util.Pair r6 = android.util.Pair.create(r10, r6)
            atu r7 = r0.b
            java.lang.Object r9 = r6.first
            aqv r9 = (defpackage.aqv) r9
            r7.a(r9)
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r0.e = r6
            r6 = 1
            r0.d = r6
            goto L_0x014e
        L_0x014b:
            r16 = r6
            r15 = r7
        L_0x014e:
            awk r6 = r0.f
            if (r6 == 0) goto L_0x01b8
            if (r8 <= 0) goto L_0x015b
            avw r6 = r0.j
            r6.a(r4, r2, r5)
            r2 = 0
            goto L_0x015c
        L_0x015b:
            int r2 = -r8
        L_0x015c:
            avw r6 = r0.j
            boolean r2 = r6.b(r2)
            if (r2 == 0) goto L_0x01a3
            avw r2 = r0.j
            byte[] r2 = r2.b
            avw r6 = r0.j
            int r6 = r6.c
            int r2 = defpackage.bdy.a(r2, r6)
            bea r6 = r0.g
            avw r7 = r0.j
            byte[] r7 = r7.b
            r6.a(r7, r2)
            awk r2 = r0.f
            long r6 = r0.o
            bea r8 = r0.g
            int r9 = r8.b()
            r10 = 9
            if (r9 < r10) goto L_0x01a3
            int r9 = r8.i()
            int r10 = r8.i()
            int r11 = r8.c()
            r12 = 434(0x1b2, float:6.08E-43)
            if (r9 != r12) goto L_0x01a3
            int r9 = defpackage.bap.a
            if (r10 != r9) goto L_0x01a3
            r9 = 3
            if (r11 != r9) goto L_0x01a3
            atu[] r2 = r2.b
            defpackage.bap.b(r6, r8, r2)
        L_0x01a3:
            r2 = 178(0xb2, float:2.5E-43)
            r6 = r16
            if (r6 != r2) goto L_0x01ba
            byte[] r2 = r1.a
            int r7 = r5 + 2
            byte r2 = r2[r7]
            r7 = 1
            if (r2 != r7) goto L_0x01ba
            avw r2 = r0.j
            r2.a(r6)
            goto L_0x01ba
        L_0x01b8:
            r6 = r16
        L_0x01ba:
            if (r6 == 0) goto L_0x01c9
            r2 = 179(0xb3, float:2.51E-43)
            if (r6 != r2) goto L_0x01c1
            goto L_0x01c9
        L_0x01c1:
            r2 = 184(0xb8, float:2.58E-43)
            if (r6 != r2) goto L_0x0224
            r2 = 1
            r0.p = r2
            goto L_0x0224
        L_0x01c9:
            int r2 = r3 - r5
            boolean r5 = r0.l
            if (r5 == 0) goto L_0x01ea
            boolean r5 = r0.q
            if (r5 == 0) goto L_0x01ea
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x01ea
            boolean r10 = r0.p
            long r7 = r0.k
            long r11 = r0.n
            long r7 = r7 - r11
            int r5 = (int) r7
            int r11 = r5 - r2
            atu r7 = r0.b
            long r8 = r0.o
            r13 = 0
            r12 = r2
            r7.a(r8, r10, r11, r12, r13)
        L_0x01ea:
            boolean r5 = r0.l
            if (r5 == 0) goto L_0x01f6
            boolean r5 = r0.q
            if (r5 == 0) goto L_0x01f3
            goto L_0x01f6
        L_0x01f3:
            r2 = 0
            r12 = 1
            goto L_0x021f
        L_0x01f6:
            long r7 = r0.k
            long r9 = (long) r2
            long r7 = r7 - r9
            r0.n = r7
            long r10 = r0.m
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0209
            r9 = r10
            goto L_0x0215
        L_0x0209:
            boolean r2 = r0.l
            if (r2 == 0) goto L_0x0213
            long r9 = r0.o
            long r11 = r0.e
            long r9 = r9 + r11
            goto L_0x0215
        L_0x0213:
            r9 = 0
        L_0x0215:
            r0.o = r9
            r2 = 0
            r0.p = r2
            r0.m = r7
            r12 = 1
            r0.l = r12
        L_0x021f:
            if (r6 != 0) goto L_0x0222
            r2 = 1
        L_0x0222:
            r0.q = r2
        L_0x0224:
            r2 = r15
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avq.a(bea):void");
    }

    public final void b() {
    }
}
