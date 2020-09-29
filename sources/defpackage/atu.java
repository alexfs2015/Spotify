package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: atu reason: default package */
final class atu {
    private static final int a = bdw.g("vide");
    private static final int b = bdw.g("soun");
    private static final int c = bdw.g("text");
    private static final int d = bdw.g("sbtl");
    private static final int e = bdw.g("subt");
    private static final int f = bdw.g("clcp");
    private static final int g = bdw.g("meta");

    /* renamed from: atu$a */
    static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final bdj f;
        private final bdj g;
        private int h;
        private int i;

        public a(bdj bdj, bdj bdj2, boolean z) {
            this.g = bdj;
            this.f = bdj2;
            this.e = z;
            bdj2.c(12);
            this.a = bdj2.n();
            bdj.c(12);
            this.i = bdj.n();
            boolean z2 = true;
            if (bdj.i() != 1) {
                z2 = false;
            }
            bcu.b(z2, "first_chunk must be 1");
            this.b = -1;
        }

        public final boolean a() {
            long j;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == this.a) {
                return false;
            }
            if (this.e) {
                j = this.f.p();
            } else {
                j = this.f.g();
            }
            this.d = j;
            if (this.b == this.h) {
                this.c = this.g.n();
                this.g.d(4);
                int i3 = this.i - 1;
                this.i = i3;
                this.h = i3 > 0 ? this.g.n() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: atu$b */
    interface b {
        int a();

        int b();

        boolean c();
    }

    /* renamed from: atu$c */
    static final class c {
        public final aud[] a;
        public aqe b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.a = new aud[i];
        }
    }

    /* renamed from: atu$d */
    static final class d implements b {
        private final int a = this.c.n();
        private final int b = this.c.n();
        private final bdj c;

        public d(b bVar) {
            this.c = bVar.aR;
            this.c.c(12);
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            int i = this.a;
            return i == 0 ? this.c.n() : i;
        }

        public final boolean c() {
            return this.a != 0;
        }
    }

    /* renamed from: atu$e */
    static final class e implements b {
        private final bdj a;
        private final int b = this.a.n();
        private final int c = (this.a.n() & 255);
        private int d;
        private int e;

        public final boolean c() {
            return false;
        }

        public e(b bVar) {
            this.a = bVar.aR;
            this.a.c(12);
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            int i = this.c;
            if (i == 8) {
                return this.a.c();
            }
            if (i == 16) {
                return this.a.d();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            this.e = this.a.c();
            return (this.e & 240) >> 4;
        }
    }

    /* renamed from: atu$f */
    static final class f {
        final int a;
        final long b;
        final int c;

        public f(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r12 == 0) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.auc a(defpackage.att.a r24, defpackage.att.b r25, long r26, defpackage.asc r28, boolean r29, boolean r30) {
        /*
            r0 = r24
            int r1 = defpackage.att.E
            att$a r1 = r0.e(r1)
            int r2 = defpackage.att.S
            att$b r2 = r1.d(r2)
            bdj r2 = r2.aR
            r3 = 16
            r2.c(r3)
            int r2 = r2.i()
            int r4 = b
            r5 = -1
            r7 = 4
            if (r2 != r4) goto L_0x0021
            r10 = 1
            goto L_0x0043
        L_0x0021:
            int r4 = a
            if (r2 != r4) goto L_0x0028
            r2 = 2
            r10 = 2
            goto L_0x0043
        L_0x0028:
            int r4 = c
            if (r2 == r4) goto L_0x0041
            int r4 = d
            if (r2 == r4) goto L_0x0041
            int r4 = e
            if (r2 == r4) goto L_0x0041
            int r4 = f
            if (r2 != r4) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r4 = g
            if (r2 != r4) goto L_0x003f
            r10 = 4
            goto L_0x0043
        L_0x003f:
            r10 = -1
            goto L_0x0043
        L_0x0041:
            r2 = 3
            r10 = 3
        L_0x0043:
            r2 = 0
            if (r10 != r5) goto L_0x0047
            return r2
        L_0x0047:
            int r4 = defpackage.att.O
            att$b r4 = r0.d(r4)
            bdj r4 = r4.aR
            r8 = 8
            r4.c(r8)
            int r9 = r4.i()
            int r9 = defpackage.att.a(r9)
            if (r9 != 0) goto L_0x0061
            r11 = 8
            goto L_0x0063
        L_0x0061:
            r11 = 16
        L_0x0063:
            r4.d(r11)
            int r11 = r4.i()
            r4.d(r7)
            int r12 = r4.b
            if (r9 != 0) goto L_0x0073
            r13 = 4
            goto L_0x0075
        L_0x0073:
            r13 = 8
        L_0x0075:
            r15 = 0
        L_0x0076:
            if (r15 >= r13) goto L_0x0086
            byte[] r6 = r4.a
            int r17 = r12 + r15
            byte r6 = r6[r17]
            if (r6 == r5) goto L_0x0083
            r16 = 0
            goto L_0x0088
        L_0x0083:
            int r15 = r15 + 1
            goto L_0x0076
        L_0x0086:
            r16 = 1
        L_0x0088:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r16 == 0) goto L_0x0094
            r4.d(r13)
        L_0x0092:
            r12 = r5
            goto L_0x00a6
        L_0x0094:
            if (r9 != 0) goto L_0x009b
            long r12 = r4.g()
            goto L_0x009f
        L_0x009b:
            long r12 = r4.p()
        L_0x009f:
            r15 = 0
            int r9 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x00a6
            goto L_0x0092
        L_0x00a6:
            r4.d(r3)
            int r9 = r4.i()
            int r15 = r4.i()
            r4.d(r7)
            int r3 = r4.i()
            int r4 = r4.i()
            r7 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            if (r9 != 0) goto L_0x00cb
            if (r15 != r7) goto L_0x00cb
            if (r3 != r14) goto L_0x00cb
            if (r4 != 0) goto L_0x00cb
            r14 = 90
            goto L_0x00e2
        L_0x00cb:
            if (r9 != 0) goto L_0x00d6
            if (r15 != r14) goto L_0x00d6
            if (r3 != r7) goto L_0x00d6
            if (r4 != 0) goto L_0x00d6
            r14 = 270(0x10e, float:3.78E-43)
            goto L_0x00e2
        L_0x00d6:
            if (r9 != r14) goto L_0x00e1
            if (r15 != 0) goto L_0x00e1
            if (r3 != 0) goto L_0x00e1
            if (r4 != r14) goto L_0x00e1
            r14 = 180(0xb4, float:2.52E-43)
            goto L_0x00e2
        L_0x00e1:
            r14 = 0
        L_0x00e2:
            atu$f r3 = new atu$f
            r3.<init>(r11, r12, r14)
            int r4 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x00f2
            long r11 = r3.b
            r4 = r25
            r18 = r11
            goto L_0x00f6
        L_0x00f2:
            r4 = r25
            r18 = r26
        L_0x00f6:
            bdj r4 = r4.aR
            r4.c(r8)
            int r7 = r4.i()
            int r7 = defpackage.att.a(r7)
            if (r7 != 0) goto L_0x0108
            r7 = 8
            goto L_0x010a
        L_0x0108:
            r7 = 16
        L_0x010a:
            r4.d(r7)
            long r13 = r4.g()
            int r4 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0117
            r4 = r5
            goto L_0x0120
        L_0x0117:
            r20 = 1000000(0xf4240, double:4.940656E-318)
            r22 = r13
            long r4 = defpackage.bdw.b(r18, r20, r22)
        L_0x0120:
            int r6 = defpackage.att.F
            att$a r6 = r1.e(r6)
            int r7 = defpackage.att.G
            att$a r6 = r6.e(r7)
            int r7 = defpackage.att.R
            att$b r1 = r1.d(r7)
            bdj r1 = r1.aR
            r1.c(r8)
            int r7 = r1.i()
            int r7 = defpackage.att.a(r7)
            if (r7 != 0) goto L_0x0144
            r9 = 8
            goto L_0x0146
        L_0x0144:
            r9 = 16
        L_0x0146:
            r1.d(r9)
            long r11 = r1.g()
            if (r7 != 0) goto L_0x0150
            r8 = 4
        L_0x0150:
            r1.d(r8)
            int r1 = r1.d()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = r1 >> 10
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            r7.append(r8)
            int r8 = r1 >> 5
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            r7.append(r8)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            android.util.Pair r1 = android.util.Pair.create(r7, r1)
            int r7 = defpackage.att.T
            att$b r6 = r6.d(r7)
            bdj r15 = r6.aR
            int r6 = r3.a
            int r7 = r3.c
            java.lang.Object r8 = r1.second
            r18 = r8
            java.lang.String r18 = (java.lang.String) r18
            r16 = r6
            r17 = r7
            r19 = r28
            r20 = r30
            atu$c r6 = a(r15, r16, r17, r18, r19, r20)
            if (r29 != 0) goto L_0x01bb
            int r7 = defpackage.att.P
            att$a r0 = r0.e(r7)
            android.util.Pair r0 = a(r0)
            java.lang.Object r7 = r0.first
            long[] r7 = (long[]) r7
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r22 = r0
            r21 = r7
            goto L_0x01bf
        L_0x01bb:
            r21 = r2
            r22 = r21
        L_0x01bf:
            aqe r0 = r6.b
            if (r0 != 0) goto L_0x01c4
            return r2
        L_0x01c4:
            auc r0 = new auc
            int r9 = r3.a
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r11 = r1.longValue()
            aqe r1 = r6.b
            int r2 = r6.d
            aud[] r3 = r6.a
            int r6 = r6.c
            r8 = r0
            r15 = r4
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r6
            r8.<init>(r9, r10, r11, r13, r15, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atu.a(att$a, att$b, long, asc, boolean, boolean):auc");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.auf a(defpackage.auc r40, defpackage.att.a r41, defpackage.asx r42) {
        /*
            r1 = r40
            r0 = r41
            r2 = r42
            int r3 = defpackage.att.ap
            att$b r3 = r0.d(r3)
            if (r3 == 0) goto L_0x0014
            atu$d r4 = new atu$d
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = defpackage.att.aq
            att$b r3 = r0.d(r3)
            if (r3 == 0) goto L_0x04b9
            atu$e r4 = new atu$e
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.a()
            r5 = 0
            if (r3 != 0) goto L_0x0042
            auf r9 = new auf
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r9
            r1 = r40
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0042:
            int r6 = defpackage.att.ar
            att$b r6 = r0.d(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0053
            int r6 = defpackage.att.as
            att$b r6 = r0.d(r6)
            r8 = 1
            goto L_0x0054
        L_0x0053:
            r8 = 0
        L_0x0054:
            bdj r6 = r6.aR
            int r9 = defpackage.att.ao
            att$b r9 = r0.d(r9)
            bdj r9 = r9.aR
            int r10 = defpackage.att.al
            att$b r10 = r0.d(r10)
            bdj r10 = r10.aR
            int r11 = defpackage.att.am
            att$b r11 = r0.d(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0072
            bdj r11 = r11.aR
            goto L_0x0073
        L_0x0072:
            r11 = r12
        L_0x0073:
            int r13 = defpackage.att.an
            att$b r0 = r0.d(r13)
            if (r0 == 0) goto L_0x007e
            bdj r0 = r0.aR
            goto L_0x007f
        L_0x007e:
            r0 = r12
        L_0x007f:
            atu$a r13 = new atu$a
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.c(r6)
            int r8 = r10.n()
            int r8 = r8 - r7
            int r9 = r10.n()
            int r14 = r10.n()
            if (r0 == 0) goto L_0x00a0
            r0.c(r6)
            int r15 = r0.n()
            goto L_0x00a1
        L_0x00a0:
            r15 = 0
        L_0x00a1:
            r16 = -1
            if (r11 == 0) goto L_0x00b7
            r11.c(r6)
            int r6 = r11.n()
            if (r6 <= 0) goto L_0x00b5
            int r12 = r11.n()
            int r16 = r12 + -1
            goto L_0x00b8
        L_0x00b5:
            r11 = r12
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            boolean r12 = r4.c()
            if (r12 == 0) goto L_0x00d2
            aqe r12 = r1.f
            java.lang.String r12 = r12.f
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x00d2
            if (r8 != 0) goto L_0x00d2
            if (r15 != 0) goto L_0x00d2
            if (r6 != 0) goto L_0x00d2
            r5 = 1
            goto L_0x00d3
        L_0x00d2:
            r5 = 0
        L_0x00d3:
            r18 = 0
            if (r5 != 0) goto L_0x0218
            long[] r5 = new long[r3]
            int[] r12 = new int[r3]
            long[] r7 = new long[r3]
            r41 = r6
            int[] r6 = new int[r3]
            r27 = r8
            r26 = r9
            r25 = r10
            r10 = r14
            r23 = r15
            r2 = r16
            r14 = r18
            r21 = r14
            r1 = 0
            r8 = 0
            r16 = 0
            r24 = 0
            r9 = r41
            r41 = 0
        L_0x00fa:
            if (r8 >= r3) goto L_0x01a1
            r28 = r21
            r21 = r41
        L_0x0100:
            if (r21 != 0) goto L_0x011a
            boolean r21 = r13.a()
            defpackage.bcu.b(r21)
            r22 = r9
            r30 = r10
            long r9 = r13.d
            r28 = r9
            int r9 = r13.c
            r21 = r9
            r9 = r22
            r10 = r30
            goto L_0x0100
        L_0x011a:
            r22 = r9
            r30 = r10
            if (r0 == 0) goto L_0x0131
        L_0x0120:
            if (r16 != 0) goto L_0x012f
            if (r23 <= 0) goto L_0x012f
            int r16 = r0.n()
            int r24 = r0.i()
            int r23 = r23 + -1
            goto L_0x0120
        L_0x012f:
            int r16 = r16 + -1
        L_0x0131:
            r9 = r24
            r5[r8] = r28
            int r10 = r4.b()
            r12[r8] = r10
            r10 = r12[r8]
            if (r10 <= r1) goto L_0x0141
            r1 = r12[r8]
        L_0x0141:
            r10 = r4
            r24 = r5
            long r4 = (long) r9
            long r4 = r4 + r14
            r7[r8] = r4
            if (r11 != 0) goto L_0x014c
            r4 = 1
            goto L_0x014d
        L_0x014c:
            r4 = 0
        L_0x014d:
            r6[r8] = r4
            if (r8 != r2) goto L_0x0162
            r4 = 1
            r6[r8] = r4
            int r5 = r22 + -1
            if (r5 <= 0) goto L_0x015d
            int r2 = r11.n()
            int r2 = r2 - r4
        L_0x015d:
            r41 = r2
            r22 = r5
            goto L_0x0164
        L_0x0162:
            r41 = r2
        L_0x0164:
            r2 = r30
            long r4 = (long) r2
            long r14 = r14 + r4
            int r26 = r26 + -1
            r4 = r27
            if (r26 != 0) goto L_0x017e
            if (r4 <= 0) goto L_0x017e
            int r2 = r25.n()
            int r5 = r25.i()
            int r27 = r4 + -1
            r26 = r2
            r2 = r5
            goto L_0x0180
        L_0x017e:
            r27 = r4
        L_0x0180:
            r4 = r12[r8]
            long r4 = (long) r4
            long r4 = r28 + r4
            int r21 = r21 + -1
            int r8 = r8 + 1
            r37 = r2
            r2 = r41
            r41 = r21
            r38 = r10
            r10 = r37
            r39 = r24
            r24 = r9
            r9 = r22
            r21 = r4
            r4 = r38
            r5 = r39
            goto L_0x00fa
        L_0x01a1:
            r22 = r9
            r9 = r24
            r4 = r27
            r24 = r5
            long r8 = (long) r9
            long r14 = r14 + r8
            if (r16 != 0) goto L_0x01af
            r2 = 1
            goto L_0x01b0
        L_0x01af:
            r2 = 0
        L_0x01b0:
            defpackage.bcu.a(r2)
        L_0x01b3:
            if (r23 <= 0) goto L_0x01c7
            int r2 = r0.n()
            if (r2 != 0) goto L_0x01bd
            r2 = 1
            goto L_0x01be
        L_0x01bd:
            r2 = 0
        L_0x01be:
            defpackage.bcu.a(r2)
            r0.i()
            int r23 = r23 + -1
            goto L_0x01b3
        L_0x01c7:
            if (r22 != 0) goto L_0x01d4
            if (r26 != 0) goto L_0x01d4
            if (r41 != 0) goto L_0x01d4
            if (r4 == 0) goto L_0x01d0
            goto L_0x01d4
        L_0x01d0:
            r2 = r1
            r1 = r40
            goto L_0x0212
        L_0x01d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent stbl box for track "
            r0.<init>(r2)
            r2 = r1
            r1 = r40
            int r5 = r1.a
            r0.append(r5)
            java.lang.String r5 = ": remainingSynchronizationSamples "
            r0.append(r5)
            r5 = r22
            r0.append(r5)
            java.lang.String r5 = ", remainingSamplesAtTimestampDelta "
            r0.append(r5)
            r9 = r26
            r0.append(r9)
            java.lang.String r5 = ", remainingSamplesInChunk "
            r0.append(r5)
            r5 = r41
            r0.append(r5)
            java.lang.String r5 = ", remainingTimestampDeltaChanges "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "AtomParsers"
            defpackage.bdd.c(r4, r0)
        L_0x0212:
            r5 = r7
            r4 = r12
            r7 = r2
            r2 = r24
            goto L_0x0256
        L_0x0218:
            int r0 = r13.a
            long[] r0 = new long[r0]
            int r2 = r13.a
            int[] r2 = new int[r2]
        L_0x0220:
            boolean r4 = r13.a()
            if (r4 == 0) goto L_0x0233
            int r4 = r13.b
            long r5 = r13.d
            r0[r4] = r5
            int r4 = r13.b
            int r5 = r13.c
            r2[r4] = r5
            goto L_0x0220
        L_0x0233:
            aqe r4 = r1.f
            int r4 = r4.s
            aqe r5 = r1.f
            int r5 = r5.q
            int r4 = defpackage.bdw.b(r4, r5)
            long r5 = (long) r14
            atw$a r0 = defpackage.atw.a(r4, r0, r2, r5)
            long[] r2 = r0.a
            int[] r4 = r0.b
            int r5 = r0.c
            long[] r6 = r0.d
            int[] r7 = r0.e
            long r14 = r0.f
            r37 = r7
            r7 = r5
            r5 = r6
            r6 = r37
        L_0x0256:
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r1.c
            r8 = r14
            long r8 = defpackage.bdw.b(r8, r10, r12)
            long[] r0 = r1.h
            if (r0 == 0) goto L_0x049d
            boolean r0 = r42.a()
            if (r0 == 0) goto L_0x026c
            goto L_0x049d
        L_0x026c:
            long[] r0 = r1.h
            int r0 = r0.length
            r8 = 1
            if (r0 != r8) goto L_0x031e
            int r0 = r1.b
            if (r0 != r8) goto L_0x031e
            int r0 = r5.length
            r8 = 2
            if (r0 < r8) goto L_0x031e
            long[] r0 = r1.i
            r8 = 0
            r12 = r0[r8]
            long[] r0 = r1.h
            r21 = r0[r8]
            long r10 = r1.c
            long r8 = r1.d
            r23 = r10
            r25 = r8
            long r8 = defpackage.bdw.b(r21, r23, r25)
            long r8 = r8 + r12
            int r0 = r5.length
            r10 = 1
            int r0 = r0 - r10
            r10 = 3
            r11 = 0
            int r16 = defpackage.bdw.a(r10, r11, r0)
            r21 = r3
            int r3 = r5.length
            int r3 = r3 - r10
            int r0 = defpackage.bdw.a(r3, r11, r0)
            r22 = r5[r11]
            int r3 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x02b9
            r10 = r5[r16]
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x02b9
            r10 = r5[r0]
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b9
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x02b9
            r0 = 1
            goto L_0x02ba
        L_0x02b9:
            r0 = 0
        L_0x02ba:
            if (r0 == 0) goto L_0x0320
            long r29 = r14 - r8
            r0 = 0
            r8 = r5[r0]
            long r31 = r12 - r8
            aqe r0 = r1.f
            int r0 = r0.r
            long r8 = (long) r0
            long r10 = r1.c
            r33 = r8
            r35 = r10
            long r8 = defpackage.bdw.b(r31, r33, r35)
            aqe r0 = r1.f
            int r0 = r0.r
            long r10 = (long) r0
            long r12 = r1.c
            r31 = r10
            r33 = r12
            long r10 = defpackage.bdw.b(r29, r31, r33)
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x02e9
            int r0 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0320
        L_0x02e9:
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0320
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0320
            int r0 = (int) r8
            r3 = r42
            r3.b = r0
            int r0 = (int) r10
            r3.c = r0
            long r8 = r1.c
            r10 = 1000000(0xf4240, double:4.940656E-318)
            defpackage.bdw.a(r5, r10, r8)
            long[] r0 = r1.h
            r3 = 0
            r8 = r0[r3]
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r1.d
            long r8 = defpackage.bdw.b(r8, r10, r12)
            auf r10 = new auf
            r0 = r10
            r1 = r40
            r3 = r4
            r4 = r7
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x031e:
            r21 = r3
        L_0x0320:
            long[] r0 = r1.h
            int r0 = r0.length
            r3 = 1
            if (r0 != r3) goto L_0x0364
            long[] r0 = r1.h
            r3 = 0
            r8 = r0[r3]
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0364
            long[] r0 = r1.i
            r8 = r0[r3]
            r0 = 0
        L_0x0334:
            int r3 = r5.length
            if (r0 >= r3) goto L_0x034b
            r10 = r5[r0]
            long r16 = r10 - r8
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r1.c
            r20 = r10
            long r10 = defpackage.bdw.b(r16, r18, r20)
            r5[r0] = r10
            int r0 = r0 + 1
            goto L_0x0334
        L_0x034b:
            long r16 = r14 - r8
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r1.c
            r20 = r8
            long r8 = defpackage.bdw.b(r16, r18, r20)
            auf r10 = new auf
            r0 = r10
            r1 = r40
            r3 = r4
            r4 = r7
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x0364:
            int r0 = r1.b
            r3 = 1
            if (r0 != r3) goto L_0x036b
            r0 = 1
            goto L_0x036c
        L_0x036b:
            r0 = 0
        L_0x036c:
            long[] r3 = r1.h
            int r3 = r3.length
            int[] r3 = new int[r3]
            long[] r8 = r1.h
            int r8 = r8.length
            int[] r8 = new int[r8]
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x037a:
            long[] r13 = r1.h
            int r13 = r13.length
            if (r9 >= r13) goto L_0x03e4
            long[] r13 = r1.i
            r14 = r13[r9]
            r22 = -1
            int r13 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r13 == 0) goto L_0x03d6
            long[] r13 = r1.h
            r22 = r13[r9]
            r16 = r12
            long r12 = r1.c
            r41 = r10
            r42 = r11
            long r10 = r1.d
            r24 = r12
            r26 = r10
            long r10 = defpackage.bdw.b(r22, r24, r26)
            r12 = 1
            int r13 = defpackage.bdw.b(r5, r14, r12, r12)
            r3[r9] = r13
            long r14 = r14 + r10
            r10 = 0
            int r11 = defpackage.bdw.b(r5, r14, r0, r10)
            r8[r9] = r11
        L_0x03ae:
            r11 = r3[r9]
            r13 = r8[r9]
            if (r11 >= r13) goto L_0x03c1
            r11 = r3[r9]
            r11 = r6[r11]
            r11 = r11 & r12
            if (r11 != 0) goto L_0x03c1
            r11 = r3[r9]
            int r11 = r11 + r12
            r3[r9] = r11
            goto L_0x03ae
        L_0x03c1:
            r11 = r8[r9]
            r13 = r3[r9]
            int r11 = r11 - r13
            int r11 = r42 + r11
            r13 = r3[r9]
            r14 = r16
            if (r14 == r13) goto L_0x03d0
            r13 = 1
            goto L_0x03d1
        L_0x03d0:
            r13 = 0
        L_0x03d1:
            r13 = r41 | r13
            r14 = r8[r9]
            goto L_0x03df
        L_0x03d6:
            r41 = r10
            r42 = r11
            r14 = r12
            r10 = 0
            r12 = 1
            r13 = r41
        L_0x03df:
            int r9 = r9 + 1
            r10 = r13
            r12 = r14
            goto L_0x037a
        L_0x03e4:
            r41 = r10
            r9 = r21
            r10 = 0
            r12 = 1
            if (r11 == r9) goto L_0x03ed
            goto L_0x03ee
        L_0x03ed:
            r12 = 0
        L_0x03ee:
            r0 = r41 | r12
            if (r0 == 0) goto L_0x03f5
            long[] r9 = new long[r11]
            goto L_0x03f6
        L_0x03f5:
            r9 = r2
        L_0x03f6:
            if (r0 == 0) goto L_0x03fb
            int[] r12 = new int[r11]
            goto L_0x03fc
        L_0x03fb:
            r12 = r4
        L_0x03fc:
            if (r0 == 0) goto L_0x03ff
            r7 = 0
        L_0x03ff:
            if (r0 == 0) goto L_0x0404
            int[] r13 = new int[r11]
            goto L_0x0405
        L_0x0404:
            r13 = r6
        L_0x0405:
            long[] r11 = new long[r11]
            r20 = r18
            r14 = 0
        L_0x040a:
            long[] r15 = r1.h
            int r15 = r15.length
            if (r10 >= r15) goto L_0x0481
            long[] r15 = r1.i
            r22 = r15[r10]
            r15 = r3[r10]
            r24 = r3
            r3 = r8[r10]
            r25 = r8
            if (r0 == 0) goto L_0x0428
            int r8 = r3 - r15
            java.lang.System.arraycopy(r2, r15, r9, r14, r8)
            java.lang.System.arraycopy(r4, r15, r12, r14, r8)
            java.lang.System.arraycopy(r6, r15, r13, r14, r8)
        L_0x0428:
            r8 = r14
            r14 = r7
            r7 = r15
        L_0x042b:
            if (r7 >= r3) goto L_0x0469
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r41 = r2
            r42 = r3
            long r2 = r1.d
            r26 = r6
            r6 = r14
            r14 = r20
            r18 = r2
            long r2 = defpackage.bdw.b(r14, r16, r18)
            r14 = r5[r7]
            long r27 = r14 - r22
            r29 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r1.c
            r31 = r14
            long r14 = defpackage.bdw.b(r27, r29, r31)
            long r2 = r2 + r14
            r11[r8] = r2
            if (r0 == 0) goto L_0x045d
            r2 = r12[r8]
            if (r2 <= r6) goto L_0x045d
            r2 = r4[r7]
            r14 = r2
            goto L_0x045e
        L_0x045d:
            r14 = r6
        L_0x045e:
            int r8 = r8 + 1
            int r7 = r7 + 1
            r2 = r41
            r3 = r42
            r6 = r26
            goto L_0x042b
        L_0x0469:
            r41 = r2
            r26 = r6
            r6 = r14
            long[] r2 = r1.h
            r14 = r2[r10]
            long r20 = r20 + r14
            int r10 = r10 + 1
            r2 = r41
            r7 = r6
            r14 = r8
            r3 = r24
            r8 = r25
            r6 = r26
            goto L_0x040a
        L_0x0481:
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r1.d
            r14 = r20
            r18 = r2
            long r14 = defpackage.bdw.b(r14, r16, r18)
            auf r10 = new auf
            r0 = r10
            r1 = r40
            r2 = r9
            r3 = r12
            r4 = r7
            r5 = r11
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x049d:
            r41 = r2
            r26 = r6
            long r2 = r1.c
            r10 = 1000000(0xf4240, double:4.940656E-318)
            defpackage.bdw.a(r5, r10, r2)
            auf r10 = new auf
            r0 = r10
            r1 = r40
            r2 = r41
            r3 = r4
            r4 = r7
            r6 = r26
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x04b9:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            goto L_0x04c2
        L_0x04c1:
            throw r0
        L_0x04c2:
            goto L_0x04c1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atu.a(auc, att$a, asx):auf");
    }

    public static awa a(b bVar, boolean z) {
        if (z) {
            return null;
        }
        bdj bdj = bVar.aR;
        bdj.c(8);
        while (bdj.b() >= 8) {
            int i = bdj.b;
            int i2 = bdj.i();
            if (bdj.i() == att.aA) {
                bdj.c(i);
                int i3 = i + i2;
                bdj.d(12);
                while (true) {
                    if (bdj.b >= i3) {
                        break;
                    }
                    int i4 = bdj.b;
                    int i5 = bdj.i();
                    if (bdj.i() == att.aB) {
                        bdj.c(i4);
                        int i6 = i4 + i5;
                        bdj.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (bdj.b < i6) {
                            defpackage.awa.a a2 = aty.a(bdj);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new awa((List<? extends defpackage.awa.a>) arrayList);
                        }
                    } else {
                        bdj.d(i5 - 8);
                    }
                }
                return null;
            }
            bdj.d(i2 - 8);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:199:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x038c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.atu.c a(defpackage.bdj r49, int r50, int r51, java.lang.String r52, defpackage.asc r53, boolean r54) {
        /*
            r0 = r49
            r13 = r52
            r14 = r53
            r1 = 12
            r0.c(r1)
            int r15 = r49.i()
            atu$c r12 = new atu$c
            r12.<init>(r15)
            r11 = 0
            r9 = 0
        L_0x0016:
            if (r9 >= r15) goto L_0x059b
            int r10 = r0.b
            int r8 = r49.i()
            r7 = 1
            if (r8 <= 0) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.String r6 = "childAtomSize should be positive"
            defpackage.bcu.a(r1, r6)
            int r1 = r49.i()
            int r2 = defpackage.att.b
            r4 = -1
            r3 = 0
            r5 = 8
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.c
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.Z
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.ak
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.d
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.e
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.f
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.aJ
            if (r1 == r2) goto L_0x03ec
            int r2 = defpackage.att.aK
            if (r1 != r2) goto L_0x0057
            goto L_0x03ec
        L_0x0057:
            int r2 = defpackage.att.i
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.aa
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.n
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.p
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.r
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.u
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.s
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.t
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.ax
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.ay
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.l
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.m
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.j
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.aN
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.aO
            if (r1 == r2) goto L_0x013c
            int r2 = defpackage.att.aP
            if (r1 != r2) goto L_0x0099
            goto L_0x013c
        L_0x0099:
            int r2 = defpackage.att.aj
            if (r1 == r2) goto L_0x00c9
            int r2 = defpackage.att.at
            if (r1 == r2) goto L_0x00c9
            int r2 = defpackage.att.au
            if (r1 == r2) goto L_0x00c9
            int r2 = defpackage.att.av
            if (r1 == r2) goto L_0x00c9
            int r2 = defpackage.att.aw
            if (r1 != r2) goto L_0x00ae
            goto L_0x00c9
        L_0x00ae:
            int r2 = defpackage.att.aM
            if (r1 != r2) goto L_0x00be
            java.lang.String r1 = java.lang.Integer.toString(r50)
            java.lang.String r2 = "application/x-camera-motion"
            aqe r1 = defpackage.aqe.a(r1, r2, r3, r4, r3)
            r12.b = r1
        L_0x00be:
            r5 = r8
            r19 = r9
            r13 = r10
            r22 = r15
            r17 = 0
            r15 = r12
            goto L_0x058c
        L_0x00c9:
            int r2 = r10 + 8
            int r2 = r2 + r5
            r0.c(r2)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = defpackage.att.aj
            java.lang.String r4 = "application/ttml+xml"
            if (r1 != r2) goto L_0x00de
        L_0x00da:
            r18 = r3
            r2 = r4
            goto L_0x010f
        L_0x00de:
            int r2 = defpackage.att.at
            if (r1 != r2) goto L_0x00f3
            int r1 = r8 + -8
            int r1 = r1 - r5
            byte[] r2 = new byte[r1]
            r0.a(r2, r11, r1)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = "application/x-quicktime-tx3g"
            r18 = r1
            goto L_0x010f
        L_0x00f3:
            int r2 = defpackage.att.au
            if (r1 != r2) goto L_0x00fd
            java.lang.String r1 = "application/x-mp4-vtt"
        L_0x00f9:
            r2 = r1
            r18 = r3
            goto L_0x010f
        L_0x00fd:
            int r2 = defpackage.att.av
            if (r1 != r2) goto L_0x0106
            r1 = 0
            r16 = r1
            goto L_0x00da
        L_0x0106:
            int r2 = defpackage.att.aw
            if (r1 != r2) goto L_0x0136
            r12.d = r7
            java.lang.String r1 = "application/x-mp4-cea-608"
            goto L_0x00f9
        L_0x010f:
            java.lang.String r1 = java.lang.Integer.toString(r50)
            r3 = 0
            r4 = -1
            r5 = 0
            r7 = -1
            r19 = 0
            r6 = r52
            r20 = r8
            r8 = r19
            r19 = r9
            r21 = r10
            r9 = r16
            r22 = r15
            r15 = 0
            r11 = r18
            aqe r1 = defpackage.aqe.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r12.b = r1
            r15 = r12
            r5 = r20
            r13 = r21
            goto L_0x0186
        L_0x0136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x013c:
            r20 = r8
            r19 = r9
            r21 = r10
            r22 = r15
            r15 = 0
            r11 = r21
            int r10 = r11 + 8
            int r10 = r10 + r5
            r0.c(r10)
            r2 = 6
            if (r54 == 0) goto L_0x0158
            int r8 = r49.d()
            r0.d(r2)
            goto L_0x015c
        L_0x0158:
            r0.d(r5)
            r8 = 0
        L_0x015c:
            if (r8 == 0) goto L_0x018a
            if (r8 != r7) goto L_0x0161
            goto L_0x018a
        L_0x0161:
            r9 = 2
            if (r8 != r9) goto L_0x0182
            r2 = 16
            r0.d(r2)
            long r8 = r49.k()
            double r8 = java.lang.Double.longBitsToDouble(r8)
            long r8 = java.lang.Math.round(r8)
            int r2 = (int) r8
            int r5 = r49.n()
            r8 = 20
            r0.d(r8)
            r9 = r5
            r5 = 2
            goto L_0x01b8
        L_0x0182:
            r13 = r11
            r15 = r12
            r5 = r20
        L_0x0186:
            r17 = 0
            goto L_0x058c
        L_0x018a:
            int r9 = r49.d()
            r0.d(r2)
            byte[] r2 = r0.a
            int r10 = r0.b
            int r3 = r10 + 1
            r0.b = r3
            byte r2 = r2[r10]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r5
            byte[] r3 = r0.a
            int r5 = r0.b
            int r10 = r5 + 1
            r0.b = r10
            byte r3 = r3[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            int r3 = r0.b
            r5 = 2
            int r3 = r3 + r5
            r0.b = r3
            if (r8 != r7) goto L_0x01b8
            r3 = 16
            r0.d(r3)
        L_0x01b8:
            int r3 = r0.b
            int r8 = defpackage.att.aa
            r10 = r20
            if (r1 != r8) goto L_0x01eb
            android.util.Pair r8 = a(r0, r11, r10)
            if (r8 == 0) goto L_0x01e5
            java.lang.Object r1 = r8.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r14 != 0) goto L_0x01d2
            r4 = 0
            goto L_0x01dc
        L_0x01d2:
            java.lang.Object r4 = r8.second
            aud r4 = (defpackage.aud) r4
            java.lang.String r4 = r4.b
            asc r4 = r14.a(r4)
        L_0x01dc:
            aud[] r5 = r12.a
            java.lang.Object r8 = r8.second
            aud r8 = (defpackage.aud) r8
            r5[r19] = r8
            goto L_0x01e6
        L_0x01e5:
            r4 = r14
        L_0x01e6:
            r0.c(r3)
            r8 = r4
            goto L_0x01ec
        L_0x01eb:
            r8 = r14
        L_0x01ec:
            int r4 = defpackage.att.n
            java.lang.String r5 = "audio/raw"
            if (r1 != r4) goto L_0x01f6
            java.lang.String r1 = "audio/ac3"
            goto L_0x024d
        L_0x01f6:
            int r4 = defpackage.att.p
            if (r1 != r4) goto L_0x01fd
            java.lang.String r1 = "audio/eac3"
            goto L_0x024d
        L_0x01fd:
            int r4 = defpackage.att.r
            if (r1 != r4) goto L_0x0204
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x024d
        L_0x0204:
            int r4 = defpackage.att.s
            if (r1 == r4) goto L_0x024b
            int r4 = defpackage.att.t
            if (r1 != r4) goto L_0x020d
            goto L_0x024b
        L_0x020d:
            int r4 = defpackage.att.u
            if (r1 != r4) goto L_0x0214
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x024d
        L_0x0214:
            int r4 = defpackage.att.ax
            if (r1 != r4) goto L_0x021b
            java.lang.String r1 = "audio/3gpp"
            goto L_0x024d
        L_0x021b:
            int r4 = defpackage.att.ay
            if (r1 != r4) goto L_0x0222
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x024d
        L_0x0222:
            int r4 = defpackage.att.l
            if (r1 == r4) goto L_0x0249
            int r4 = defpackage.att.m
            if (r1 != r4) goto L_0x022b
            goto L_0x0249
        L_0x022b:
            int r4 = defpackage.att.j
            if (r1 != r4) goto L_0x0232
            java.lang.String r1 = "audio/mpeg"
            goto L_0x024d
        L_0x0232:
            int r4 = defpackage.att.aN
            if (r1 != r4) goto L_0x0239
            java.lang.String r1 = "audio/alac"
            goto L_0x024d
        L_0x0239:
            int r4 = defpackage.att.aO
            if (r1 != r4) goto L_0x0240
            java.lang.String r1 = "audio/g711-alaw"
            goto L_0x024d
        L_0x0240:
            int r4 = defpackage.att.aP
            if (r1 != r4) goto L_0x0247
            java.lang.String r1 = "audio/g711-mlaw"
            goto L_0x024d
        L_0x0247:
            r1 = 0
            goto L_0x024d
        L_0x0249:
            r1 = r5
            goto L_0x024d
        L_0x024b:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x024d:
            r4 = r1
            r21 = r2
            r20 = r9
            r23 = 0
            r9 = r3
        L_0x0255:
            int r1 = r9 - r11
            if (r1 >= r10) goto L_0x039d
            r0.c(r9)
            int r3 = r49.i()
            if (r3 <= 0) goto L_0x0264
            r1 = 1
            goto L_0x0265
        L_0x0264:
            r1 = 0
        L_0x0265:
            defpackage.bcu.a(r1, r6)
            int r1 = r49.i()
            int r2 = defpackage.att.J
            if (r1 == r2) goto L_0x0319
            if (r54 == 0) goto L_0x0278
            int r2 = defpackage.att.k
            if (r1 != r2) goto L_0x0278
            goto L_0x0319
        L_0x0278:
            int r2 = defpackage.att.o
            if (r1 != r2) goto L_0x029d
            int r1 = r9 + 8
            r0.c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r50)
            aqe r1 = defpackage.aqx.a(r0, r1, r13, r8)
            r12.b = r1
        L_0x028b:
            r15 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            r16 = r8
            r3 = r9
            r33 = r10
            r13 = r11
            r11 = 0
            r18 = 0
            goto L_0x0312
        L_0x029d:
            int r2 = defpackage.att.q
            if (r1 != r2) goto L_0x02b1
            int r1 = r9 + 8
            r0.c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r50)
            aqe r1 = defpackage.aqx.b(r0, r1, r13, r8)
            r12.b = r1
            goto L_0x028b
        L_0x02b1:
            int r2 = defpackage.att.v
            if (r1 != r2) goto L_0x02ed
            java.lang.String r1 = java.lang.Integer.toString(r50)
            r24 = 0
            r25 = -1
            r26 = -1
            r27 = 0
            r28 = 0
            r2 = r4
            r15 = r3
            r18 = 0
            r3 = r24
            r29 = r4
            r4 = r25
            r30 = r5
            r5 = r26
            r31 = r6
            r6 = r20
            r7 = r21
            r16 = r8
            r8 = r27
            r32 = r9
            r9 = r16
            r33 = r10
            r10 = r28
            r13 = r11
            r11 = r52
            aqe r1 = defpackage.aqe.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.b = r1
            goto L_0x030f
        L_0x02ed:
            r15 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            r16 = r8
            r32 = r9
            r33 = r10
            r13 = r11
            r18 = 0
            int r2 = defpackage.att.aN
            if (r1 != r2) goto L_0x030f
            byte[] r1 = new byte[r15]
            r3 = r32
            r0.c(r3)
            r11 = 0
            r0.a(r1, r11, r15)
            r23 = r1
            goto L_0x0312
        L_0x030f:
            r3 = r32
            r11 = 0
        L_0x0312:
            r4 = r29
            r6 = r31
            r2 = -1
            goto L_0x038e
        L_0x0319:
            r15 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            r16 = r8
            r3 = r9
            r33 = r10
            r13 = r11
            r11 = 0
            r18 = 0
            int r2 = defpackage.att.J
            if (r1 != r2) goto L_0x0332
            r4 = r3
            r6 = r31
        L_0x0330:
            r2 = -1
            goto L_0x035b
        L_0x0332:
            int r1 = r0.b
            r4 = r1
        L_0x0335:
            int r1 = r4 - r3
            if (r1 >= r15) goto L_0x0357
            r0.c(r4)
            int r1 = r49.i()
            r6 = r31
            if (r1 <= 0) goto L_0x0346
            r2 = 1
            goto L_0x0347
        L_0x0346:
            r2 = 0
        L_0x0347:
            defpackage.bcu.a(r2, r6)
            int r2 = r49.i()
            int r5 = defpackage.att.J
            if (r2 != r5) goto L_0x0353
            goto L_0x0330
        L_0x0353:
            int r4 = r4 + r1
            r31 = r6
            goto L_0x0335
        L_0x0357:
            r6 = r31
            r2 = -1
            r4 = -1
        L_0x035b:
            if (r4 == r2) goto L_0x038c
            android.util.Pair r1 = a(r0, r4)
            java.lang.Object r4 = r1.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.second
            r23 = r1
            byte[] r23 = (byte[]) r23
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x038e
            android.util.Pair r1 = defpackage.bcx.a(r23)
            java.lang.Object r5 = r1.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r20 = r1
            r21 = r5
            goto L_0x038e
        L_0x038c:
            r4 = r29
        L_0x038e:
            int r9 = r3 + r15
            r11 = r13
            r8 = r16
            r5 = r30
            r10 = r33
            r7 = 1
            r15 = 0
            r13 = r52
            goto L_0x0255
        L_0x039d:
            r29 = r4
            r30 = r5
            r16 = r8
            r33 = r10
            r13 = r11
            r2 = -1
            r11 = 0
            r18 = 0
            aqe r1 = r12.b
            if (r1 != 0) goto L_0x03e5
            r4 = r29
            if (r4 == 0) goto L_0x03e5
            r1 = r30
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x03bc
            r8 = 2
            goto L_0x03bd
        L_0x03bc:
            r8 = -1
        L_0x03bd:
            java.lang.String r1 = java.lang.Integer.toString(r50)
            r3 = 0
            r5 = -1
            r6 = -1
            if (r23 != 0) goto L_0x03c9
            r9 = r18
            goto L_0x03ce
        L_0x03c9:
            java.util.List r2 = java.util.Collections.singletonList(r23)
            r9 = r2
        L_0x03ce:
            r15 = 0
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r20
            r7 = r21
            r10 = r16
            r17 = 0
            r11 = r15
            r15 = r12
            r12 = r52
            aqe r1 = defpackage.aqe.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.b = r1
            goto L_0x03e8
        L_0x03e5:
            r15 = r12
            r17 = 0
        L_0x03e8:
            r5 = r33
            goto L_0x058c
        L_0x03ec:
            r18 = r3
            r33 = r8
            r19 = r9
            r13 = r10
            r22 = r15
            r2 = -1
            r17 = 0
            r15 = r12
            int r10 = r13 + 8
            int r10 = r10 + r5
            r0.c(r10)
            r3 = 16
            r0.d(r3)
            int r39 = r49.d()
            int r40 = r49.d()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 50
            r0.d(r4)
            int r4 = r0.b
            int r5 = defpackage.att.Z
            if (r1 != r5) goto L_0x0448
            r5 = r33
            android.util.Pair r7 = a(r0, r13, r5)
            if (r7 == 0) goto L_0x0441
            java.lang.Object r1 = r7.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r14 != 0) goto L_0x042e
            r8 = r18
            goto L_0x0438
        L_0x042e:
            java.lang.Object r8 = r7.second
            aud r8 = (defpackage.aud) r8
            java.lang.String r8 = r8.b
            asc r8 = r14.a(r8)
        L_0x0438:
            aud[] r9 = r15.a
            java.lang.Object r7 = r7.second
            aud r7 = (defpackage.aud) r7
            r9[r19] = r7
            goto L_0x0442
        L_0x0441:
            r8 = r14
        L_0x0442:
            r0.c(r4)
            r48 = r8
            goto L_0x044c
        L_0x0448:
            r5 = r33
            r48 = r14
        L_0x044c:
            r35 = r18
            r42 = r35
            r45 = r42
            r2 = 0
            r44 = 1065353216(0x3f800000, float:1.0)
            r46 = -1
        L_0x0457:
            int r3 = r4 - r13
            if (r3 >= r5) goto L_0x0574
            r0.c(r4)
            int r3 = r0.b
            int r7 = r49.i()
            if (r7 != 0) goto L_0x046b
            int r8 = r0.b
            int r8 = r8 - r13
            if (r8 == r5) goto L_0x0574
        L_0x046b:
            if (r7 <= 0) goto L_0x046f
            r8 = 1
            goto L_0x0470
        L_0x046f:
            r8 = 0
        L_0x0470:
            defpackage.bcu.a(r8, r6)
            int r8 = r49.i()
            int r9 = defpackage.att.H
            r11 = 3
            if (r8 != r9) goto L_0x049c
            if (r35 != 0) goto L_0x0480
            r8 = 1
            goto L_0x0481
        L_0x0480:
            r8 = 0
        L_0x0481:
            defpackage.bcu.b(r8)
            int r3 = r3 + 8
            r0.c(r3)
            bdy r3 = defpackage.bdy.a(r49)
            java.util.List<byte[]> r8 = r3.a
            int r9 = r3.b
            r15.c = r9
            if (r2 != 0) goto L_0x0499
            float r3 = r3.e
            r44 = r3
        L_0x0499:
            java.lang.String r3 = "video/avc"
            goto L_0x04b9
        L_0x049c:
            int r9 = defpackage.att.I
            if (r8 != r9) goto L_0x04c1
            if (r35 != 0) goto L_0x04a4
            r8 = 1
            goto L_0x04a5
        L_0x04a4:
            r8 = 0
        L_0x04a5:
            defpackage.bcu.b(r8)
            int r3 = r3 + 8
            r0.c(r3)
            beb r3 = defpackage.beb.a(r49)
            java.util.List<byte[]> r8 = r3.a
            int r3 = r3.b
            r15.c = r3
            java.lang.String r3 = "video/hevc"
        L_0x04b9:
            r35 = r3
            r42 = r8
        L_0x04bd:
            r8 = 1
            r9 = 2
            goto L_0x0571
        L_0x04c1:
            int r9 = defpackage.att.aL
            if (r8 != r9) goto L_0x04d7
            if (r35 != 0) goto L_0x04c9
            r3 = 1
            goto L_0x04ca
        L_0x04c9:
            r3 = 0
        L_0x04ca:
            defpackage.bcu.b(r3)
            int r3 = defpackage.att.aJ
            if (r1 != r3) goto L_0x04d4
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x04e5
        L_0x04d4:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x04e5
        L_0x04d7:
            int r9 = defpackage.att.g
            if (r8 != r9) goto L_0x04e8
            if (r35 != 0) goto L_0x04df
            r3 = 1
            goto L_0x04e0
        L_0x04df:
            r3 = 0
        L_0x04e0:
            defpackage.bcu.b(r3)
            java.lang.String r3 = "video/3gpp"
        L_0x04e5:
            r35 = r3
            goto L_0x04bd
        L_0x04e8:
            int r9 = defpackage.att.J
            if (r8 != r9) goto L_0x0507
            if (r35 != 0) goto L_0x04f0
            r8 = 1
            goto L_0x04f1
        L_0x04f0:
            r8 = 0
        L_0x04f1:
            defpackage.bcu.b(r8)
            android.util.Pair r3 = a(r0, r3)
            java.lang.Object r8 = r3.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r3.second
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r42 = r3
            r35 = r8
            goto L_0x04bd
        L_0x0507:
            int r9 = defpackage.att.ai
            if (r8 != r9) goto L_0x051e
            int r3 = r3 + 8
            r0.c(r3)
            int r2 = r49.n()
            int r3 = r49.n()
            float r2 = (float) r2
            float r3 = (float) r3
            float r44 = r2 / r3
            r2 = 1
            goto L_0x04bd
        L_0x051e:
            int r9 = defpackage.att.aH
            if (r8 != r9) goto L_0x0547
            int r8 = r3 + 8
        L_0x0524:
            int r9 = r8 - r3
            if (r9 >= r7) goto L_0x0541
            r0.c(r8)
            int r9 = r49.i()
            int r10 = r49.i()
            int r11 = defpackage.att.aI
            if (r10 != r11) goto L_0x053f
            byte[] r3 = r0.a
            int r9 = r9 + r8
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r8, r9)
            goto L_0x0543
        L_0x053f:
            int r8 = r8 + r9
            goto L_0x0524
        L_0x0541:
            r3 = r18
        L_0x0543:
            r45 = r3
            goto L_0x04bd
        L_0x0547:
            int r3 = defpackage.att.aG
            if (r8 != r3) goto L_0x04bd
            int r3 = r49.c()
            r0.d(r11)
            if (r3 != 0) goto L_0x04bd
            int r3 = r49.c()
            if (r3 == 0) goto L_0x056d
            r8 = 1
            if (r3 == r8) goto L_0x0569
            r9 = 2
            if (r3 == r9) goto L_0x0566
            if (r3 == r11) goto L_0x0563
            goto L_0x0571
        L_0x0563:
            r46 = 3
            goto L_0x0571
        L_0x0566:
            r46 = 2
            goto L_0x0571
        L_0x0569:
            r9 = 2
            r46 = 1
            goto L_0x0571
        L_0x056d:
            r8 = 1
            r9 = 2
            r46 = 0
        L_0x0571:
            int r4 = r4 + r7
            goto L_0x0457
        L_0x0574:
            if (r35 == 0) goto L_0x058c
            java.lang.String r34 = java.lang.Integer.toString(r50)
            r36 = 0
            r37 = -1
            r38 = -1
            r41 = -1082130432(0xffffffffbf800000, float:-1.0)
            r47 = 0
            r43 = r51
            aqe r1 = defpackage.aqe.a(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r15.b = r1
        L_0x058c:
            int r10 = r13 + r5
            r0.c(r10)
            int r9 = r19 + 1
            r13 = r52
            r12 = r15
            r15 = r22
            r11 = 0
            goto L_0x0016
        L_0x059b:
            r15 = r12
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atu.a(bdj, int, int, java.lang.String, asc, boolean):atu$c");
    }

    private static Pair<long[], long[]> a(a aVar) {
        long j;
        if (aVar != null) {
            b d2 = aVar.d(att.Q);
            if (d2 != null) {
                bdj bdj = d2.aR;
                bdj.c(8);
                int a2 = att.a(bdj.i());
                int n = bdj.n();
                long[] jArr = new long[n];
                long[] jArr2 = new long[n];
                int i = 0;
                while (i < n) {
                    jArr[i] = a2 == 1 ? bdj.p() : bdj.g();
                    if (a2 == 1) {
                        j = bdj.k();
                    } else {
                        j = (long) bdj.i();
                    }
                    jArr2[i] = j;
                    byte[] bArr = bdj.a;
                    int i2 = bdj.b;
                    bdj.b = i2 + 1;
                    int i3 = (bArr[i2] & 255) << 8;
                    byte[] bArr2 = bdj.a;
                    int i4 = bdj.b;
                    bdj.b = i4 + 1;
                    if (((short) (i3 | (bArr2[i4] & 255))) == 1) {
                        bdj.d(2);
                        i++;
                    } else {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                }
                return Pair.create(jArr, jArr2);
            }
        }
        return Pair.create(null, null);
    }

    private static Pair<String, byte[]> a(bdj bdj, int i) {
        bdj.c(i + 8 + 4);
        bdj.d(1);
        a(bdj);
        bdj.d(2);
        int c2 = bdj.c();
        if ((c2 & 128) != 0) {
            bdj.d(2);
        }
        if ((c2 & 64) != 0) {
            bdj.d(bdj.d());
        }
        if ((c2 & 32) != 0) {
            bdj.d(2);
        }
        bdj.d(1);
        a(bdj);
        String a2 = bdg.a(bdj.c());
        if ("audio/mpeg".equals(a2) || "audio/vnd.dts".equals(a2) || "audio/vnd.dts.hd".equals(a2)) {
            return Pair.create(a2, null);
        }
        bdj.d(12);
        bdj.d(1);
        int a3 = a(bdj);
        byte[] bArr = new byte[a3];
        bdj.a(bArr, 0, a3);
        return Pair.create(a2, bArr);
    }

    private static Pair<Integer, aud> b(bdj bdj, int i, int i2) {
        int i3 = i + 8;
        String str = null;
        Object obj = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            bdj.c(i3);
            int i6 = bdj.i();
            int i7 = bdj.i();
            if (i7 == att.ab) {
                obj = Integer.valueOf(bdj.i());
            } else if (i7 == att.W) {
                bdj.d(4);
                str = bdj.e(4);
            } else if (i7 == att.X) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        boolean z = true;
        bcu.a(obj != null, "frma atom is mandatory");
        bcu.a(i4 != -1, "schi atom is mandatory");
        aud a2 = a(bdj, i4, i5, str);
        if (a2 == null) {
            z = false;
        }
        bcu.a(z, "tenc atom is mandatory");
        return Pair.create(obj, a2);
    }

    private static aud a(bdj bdj, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            bdj.c(i5);
            int i6 = bdj.i();
            if (bdj.i() == att.Y) {
                int a2 = att.a(bdj.i());
                bdj.d(1);
                if (a2 == 0) {
                    bdj.d(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int c2 = bdj.c();
                    i3 = c2 & 15;
                    i4 = (c2 & 240) >> 4;
                }
                boolean z = bdj.c() == 1;
                int c3 = bdj.c();
                byte[] bArr2 = new byte[16];
                bdj.a(bArr2, 0, 16);
                if (z && c3 == 0) {
                    int c4 = bdj.c();
                    bArr = new byte[c4];
                    bdj.a(bArr, 0, c4);
                }
                aud aud = new aud(z, str, c3, bArr2, i4, i3, bArr);
                return aud;
            }
            i5 += i6;
        }
    }

    private static int a(bdj bdj) {
        int c2 = bdj.c();
        int i = c2 & 127;
        while ((c2 & 128) == 128) {
            c2 = bdj.c();
            i = (i << 7) | (c2 & 127);
        }
        return i;
    }

    private static Pair<Integer, aud> a(bdj bdj, int i, int i2) {
        int i3 = bdj.b;
        while (i3 - i < i2) {
            bdj.c(i3);
            int i4 = bdj.i();
            bcu.a(i4 > 0, "childAtomSize should be positive");
            if (bdj.i() == att.V) {
                Pair<Integer, aud> b2 = b(bdj, i3, i4);
                if (b2 != null) {
                    return b2;
                }
            }
            i3 += i4;
        }
        return null;
    }
}
