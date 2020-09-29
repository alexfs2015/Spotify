package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: avg reason: default package */
final class avg extends ave {
    private a a;
    private int d;
    private boolean e;
    private d f;
    private b g;

    /* renamed from: avg$a */
    static final class a {
        public final d a;
        public final byte[] b;
        public final c[] c;
        public final int d;
        private b e;

        public a(d dVar, b bVar, byte[] bArr, c[] cVarArr, int i) {
            this.a = dVar;
            this.e = bVar;
            this.b = bArr;
            this.c = cVarArr;
            this.d = i;
        }
    }

    avg() {
    }

    public static boolean a(bea bea) {
        try {
            return avh.a(1, bea, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.f = null;
            this.g = null;
        }
        this.d = 0;
        this.e = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bea r21, long r22, defpackage.ave.a r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            avg$a r2 = r0.a
            r3 = 0
            if (r2 == 0) goto L_0x000a
            return r3
        L_0x000a:
            avh$d r2 = r0.f
            r5 = 4
            r6 = 1
            if (r2 != 0) goto L_0x0066
            defpackage.avh.a(r6, r1, r3)
            long r8 = r21.h()
            int r10 = r21.c()
            long r11 = r21.h()
            int r13 = r21.j()
            int r14 = r21.j()
            int r15 = r21.j()
            int r2 = r21.c()
            r7 = r2 & 15
            double r3 = (double) r7
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r6, r3)
            int r3 = (int) r3
            r2 = r2 & 240(0xf0, float:3.36E-43)
            int r2 = r2 >> r5
            double r4 = (double) r2
            double r4 = java.lang.Math.pow(r6, r4)
            int r2 = (int) r4
            int r4 = r21.c()
            r5 = 1
            r4 = r4 & r5
            if (r4 <= 0) goto L_0x004d
            r18 = 1
            goto L_0x004f
        L_0x004d:
            r18 = 0
        L_0x004f:
            byte[] r4 = r1.a
            int r1 = r1.c
            byte[] r19 = java.util.Arrays.copyOf(r4, r1)
            avh$d r1 = new avh$d
            r7 = r1
            r16 = r3
            r17 = r2
            r7.<init>(r8, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            r0.f = r1
        L_0x0063:
            r1 = 0
            goto L_0x022b
        L_0x0066:
            avh$b r2 = r0.g
            r3 = 3
            if (r2 != 0) goto L_0x00bd
            r2 = 0
            defpackage.avh.a(r3, r1, r2)
            long r2 = r21.h()
            int r3 = (int) r2
            java.lang.String r2 = r1.e(r3)
            int r3 = r2.length()
            int r3 = r3 + 11
            long r6 = r21.h()
            int r4 = (int) r6
            java.lang.String[] r4 = new java.lang.String[r4]
            int r3 = r3 + r5
            r5 = r3
            r3 = 0
        L_0x0088:
            long r8 = (long) r3
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a4
            long r8 = r21.h()
            int r9 = (int) r8
            int r5 = r5 + 4
            java.lang.String r8 = r1.e(r9)
            r4[r3] = r8
            r8 = r4[r3]
            int r8 = r8.length()
            int r5 = r5 + r8
            int r3 = r3 + 1
            goto L_0x0088
        L_0x00a4:
            int r1 = r21.c()
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00b5
            int r5 = r5 + r3
            avh$b r1 = new avh$b
            r1.<init>(r2, r4, r5)
            r0.g = r1
            goto L_0x0063
        L_0x00b5:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "framing bit expected to be set"
            r1.<init>(r2)
            throw r1
        L_0x00bd:
            int r2 = r1.c
            byte[] r9 = new byte[r2]
            byte[] r2 = r1.a
            int r4 = r1.c
            r6 = 0
            java.lang.System.arraycopy(r2, r6, r9, r6, r4)
            avh$d r2 = r0.f
            int r2 = r2.a
            r4 = 5
            defpackage.avh.a(r4, r1, r6)
            int r7 = r21.c()
            r8 = 1
            int r7 = r7 + r8
            avf r8 = new avf
            byte[] r10 = r1.a
            r8.<init>(r10)
            int r1 = r1.b
            int r1 = r1 << r3
            r8.b(r1)
            r1 = 0
        L_0x00e5:
            r10 = 16
            if (r1 >= r7) goto L_0x01ec
            r11 = 24
            int r12 = r8.a(r11)
            r13 = 5653314(0x564342, float:7.92198E-39)
            if (r12 != r13) goto L_0x01d1
            int r15 = r8.a(r10)
            int r10 = r8.a(r11)
            long[] r11 = new long[r10]
            boolean r19 = r8.a()
            r12 = 0
            if (r19 != 0) goto L_0x012a
            boolean r14 = r8.a()
        L_0x010a:
            int r3 = r11.length
            if (r6 >= r3) goto L_0x0158
            if (r14 == 0) goto L_0x011a
            boolean r3 = r8.a()
            if (r3 != 0) goto L_0x011a
            r11[r6] = r12
            r16 = 1
            goto L_0x0125
        L_0x011a:
            int r3 = r8.a(r4)
            r16 = 1
            int r3 = r3 + 1
            long r12 = (long) r3
            r11[r6] = r12
        L_0x0125:
            int r6 = r6 + 1
            r12 = 0
            goto L_0x010a
        L_0x012a:
            r16 = 1
            int r3 = r8.a(r4)
            int r3 = r3 + 1
            r6 = r3
            r3 = 0
        L_0x0134:
            int r12 = r11.length
            if (r3 >= r12) goto L_0x0158
            int r12 = r10 - r3
            int r12 = defpackage.avh.a(r12)
            int r12 = r8.a(r12)
            r13 = r3
            r3 = 0
        L_0x0143:
            if (r3 >= r12) goto L_0x0152
            int r14 = r11.length
            if (r13 >= r14) goto L_0x0152
            long r4 = (long) r6
            r11[r13] = r4
            int r13 = r13 + 1
            int r3 = r3 + 1
            r4 = 5
            r5 = 4
            goto L_0x0143
        L_0x0152:
            int r6 = r6 + 1
            r3 = r13
            r4 = 5
            r5 = 4
            goto L_0x0134
        L_0x0158:
            r3 = 4
            int r4 = r8.a(r3)
            r5 = 2
            if (r4 > r5) goto L_0x01b9
            r6 = 1
            if (r4 == r6) goto L_0x0169
            if (r4 != r5) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r21 = r4
            goto L_0x01a6
        L_0x0169:
            r5 = 32
            r8.b(r5)
            r8.b(r5)
            int r5 = r8.a(r3)
            int r5 = r5 + r6
            r8.b(r6)
            if (r4 != r6) goto L_0x0199
            if (r15 == 0) goto L_0x0194
            long r12 = (long) r10
            r21 = r4
            long r3 = (long) r15
            double r12 = (double) r12
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r16 / r3
            double r3 = java.lang.Math.pow(r12, r3)
            double r3 = java.lang.Math.floor(r3)
            long r12 = (long) r3
            goto L_0x019f
        L_0x0194:
            r21 = r4
            r12 = 0
            goto L_0x019f
        L_0x0199:
            r21 = r4
            long r3 = (long) r10
            long r12 = (long) r15
            long r12 = r12 * r3
        L_0x019f:
            long r3 = (long) r5
            long r12 = r12 * r3
            int r3 = (int) r12
            r8.b(r3)
        L_0x01a6:
            avh$a r14 = new avh$a
            r16 = r10
            r17 = r11
            r18 = r21
            r14.<init>(r15, r16, r17, r18, r19)
            int r1 = r1 + 1
            r3 = 3
            r4 = 5
            r5 = 4
            r6 = 0
            goto L_0x00e5
        L_0x01b9:
            r21 = r4
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "lookup type greater than 2 not decodable: "
            r2.<init>(r3)
            r3 = r21
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d1:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r2.<init>(r3)
            int r3 = r8.a
            r4 = 3
            int r3 = r3 << r4
            int r4 = r8.b
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            r1 = 6
            int r1 = r8.a(r1)
            r3 = 1
            int r1 = r1 + r3
            r3 = 0
        L_0x01f4:
            if (r3 >= r1) goto L_0x0207
            int r4 = r8.a(r10)
            if (r4 != 0) goto L_0x01ff
            int r3 = r3 + 1
            goto L_0x01f4
        L_0x01ff:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>(r2)
            throw r1
        L_0x0207:
            defpackage.avh.c(r8)
            defpackage.avh.b(r8)
            defpackage.avh.a(r2, r8)
            avh$c[] r10 = defpackage.avh.a(r8)
            boolean r1 = r8.a()
            if (r1 == 0) goto L_0x026d
            int r1 = r10.length
            r2 = 1
            int r1 = r1 - r2
            int r11 = defpackage.avh.a(r1)
            avg$a r1 = new avg$a
            avh$d r7 = r0.f
            avh$b r8 = r0.g
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x022b:
            r0.a = r1
            avg$a r1 = r0.a
            if (r1 != 0) goto L_0x0233
            r1 = 1
            return r1
        L_0x0233:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            avg$a r1 = r0.a
            avh$d r1 = r1.a
            byte[] r1 = r1.f
            r9.add(r1)
            avg$a r1 = r0.a
            byte[] r1 = r1.b
            r9.add(r1)
            r2 = 0
            r4 = 0
            avg$a r1 = r0.a
            avh$d r1 = r1.a
            int r5 = r1.c
            r6 = -1
            avg$a r1 = r0.a
            avh$d r1 = r1.a
            int r7 = r1.a
            avg$a r1 = r0.a
            avh$d r1 = r1.a
            long r10 = r1.b
            int r8 = (int) r10
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r3 = "audio/vorbis"
            aqv r1 = defpackage.aqv.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r24
            r2.a = r1
            r1 = 1
            return r1
        L_0x026d:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>(r2)
            goto L_0x0276
        L_0x0275:
            throw r1
        L_0x0276:
            goto L_0x0275
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avg.a(bea, long, ave$a):boolean");
    }

    /* access modifiers changed from: protected */
    public final long b(bea bea) {
        int i = 0;
        if ((bea.a[0] & 1) == 1) {
            return -1;
        }
        byte b = bea.a[0];
        a aVar = this.a;
        int i2 = !aVar.c[(b >> 1) & (255 >>> (8 - aVar.d))].a ? aVar.a.d : aVar.a.e;
        if (this.e) {
            i = (this.d + i2) / 4;
        }
        long j = (long) i;
        bea.b(bea.c + 4);
        bea.a[bea.c - 4] = (byte) ((int) (j & 255));
        bea.a[bea.c - 3] = (byte) ((int) ((j >>> 8) & 255));
        bea.a[bea.c - 2] = (byte) ((int) ((j >>> 16) & 255));
        bea.a[bea.c - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.e = true;
        this.d = i2;
        return j;
    }

    /* access modifiers changed from: protected */
    public final void c(long j) {
        super.c(j);
        int i = 0;
        this.e = j != 0;
        d dVar = this.f;
        if (dVar != null) {
            i = dVar.d;
        }
        this.d = i;
    }
}
