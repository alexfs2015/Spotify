package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;

/* renamed from: avd reason: default package */
public final class avd implements auy {
    private final String a;
    private final bdj b = new bdj(1024);
    private final bdi c = new bdi(this.b.a);
    private atd d;
    private aqe e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    public final void b() {
    }

    public avd(String str) {
        this.a = str;
    }

    public final void a() {
        this.g = 0;
        this.l = false;
    }

    public final void a(asv asv, d dVar) {
        dVar.a();
        this.d = asv.a(dVar.b(), 1);
        this.f = dVar.c();
    }

    public final void a(long j2, boolean z) {
        this.k = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        if (r0.l != false) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bdj r24) {
        /*
            r23 = this;
            r0 = r23
        L_0x0002:
            int r1 = r24.b()
            if (r1 <= 0) goto L_0x0207
            int r1 = r0.g
            r2 = 86
            r3 = 1
            if (r1 == 0) goto L_0x01fb
            r4 = 2
            r5 = 0
            if (r1 == r3) goto L_0x01e3
            r2 = 8
            r6 = 3
            if (r1 == r4) goto L_0x01b5
            if (r1 != r6) goto L_0x01af
            int r1 = r24.b()
            int r4 = r0.i
            int r7 = r0.h
            int r4 = r4 - r7
            int r1 = java.lang.Math.min(r1, r4)
            bdi r4 = r0.c
            byte[] r4 = r4.a
            int r7 = r0.h
            r8 = r24
            r8.a(r4, r7, r1)
            int r4 = r0.h
            int r4 = r4 + r1
            r0.h = r4
            int r1 = r0.h
            int r4 = r0.i
            if (r1 != r4) goto L_0x0002
            bdi r1 = r0.c
            r1.a(r5)
            bdi r1 = r0.c
            boolean r4 = r1.e()
            if (r4 != 0) goto L_0x014e
            r0.l = r3
            int r4 = r1.c(r3)
            if (r4 != r3) goto L_0x0057
            int r7 = r1.c(r3)
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            r0.m = r7
            int r7 = r0.m
            if (r7 != 0) goto L_0x0148
            if (r4 != r3) goto L_0x0063
            c(r1)
        L_0x0063:
            boolean r7 = r1.e()
            if (r7 == 0) goto L_0x0142
            r7 = 6
            int r9 = r1.c(r7)
            r0.n = r9
            r9 = 4
            int r10 = r1.c(r9)
            int r11 = r1.c(r6)
            if (r10 != 0) goto L_0x013c
            if (r11 != 0) goto L_0x013c
            if (r4 != 0) goto L_0x00cd
            int r10 = r1.b()
            int r11 = r0.a(r1)
            r1.a(r10)
            int r10 = r11 + 7
            int r10 = r10 / r2
            byte[] r10 = new byte[r10]
            r1.a(r10, r5, r11)
            java.lang.String r12 = r0.f
            r14 = 0
            r15 = -1
            r16 = -1
            int r11 = r0.t
            int r13 = r0.r
            java.util.List r19 = java.util.Collections.singletonList(r10)
            r20 = 0
            r21 = 0
            java.lang.String r10 = r0.a
            java.lang.String r17 = "audio/mp4a-latm"
            r18 = r13
            r13 = r17
            r17 = r11
            r22 = r10
            aqe r10 = defpackage.aqe.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            aqe r11 = r0.e
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x00da
            r0.e = r10
            r11 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r13 = r10.r
            long r13 = (long) r13
            long r11 = r11 / r13
            r0.s = r11
            atd r11 = r0.d
            r11.a(r10)
            goto L_0x00da
        L_0x00cd:
            long r10 = c(r1)
            int r11 = (int) r10
            int r10 = r0.a(r1)
            int r11 = r11 - r10
            r1.b(r11)
        L_0x00da:
            int r10 = r1.c(r6)
            r0.o = r10
            int r10 = r0.o
            if (r10 == 0) goto L_0x0107
            if (r10 == r3) goto L_0x0101
            if (r10 == r6) goto L_0x00fd
            if (r10 == r9) goto L_0x00fd
            r6 = 5
            if (r10 == r6) goto L_0x00fd
            if (r10 == r7) goto L_0x00f9
            r6 = 7
            if (r10 != r6) goto L_0x00f3
            goto L_0x00f9
        L_0x00f3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00f9:
            r1.b(r3)
            goto L_0x010a
        L_0x00fd:
            r1.b(r7)
            goto L_0x010a
        L_0x0101:
            r6 = 9
            r1.b(r6)
            goto L_0x010a
        L_0x0107:
            r1.b(r2)
        L_0x010a:
            boolean r6 = r1.e()
            r0.p = r6
            r6 = 0
            r0.q = r6
            boolean r6 = r0.p
            if (r6 == 0) goto L_0x0132
            if (r4 != r3) goto L_0x0121
            long r3 = c(r1)
            r0.q = r3
            goto L_0x0132
        L_0x0121:
            boolean r3 = r1.e()
            long r6 = r0.q
            long r6 = r6 << r2
            int r4 = r1.c(r2)
            long r9 = (long) r4
            long r6 = r6 + r9
            r0.q = r6
            if (r3 != 0) goto L_0x0121
        L_0x0132:
            boolean r3 = r1.e()
            if (r3 == 0) goto L_0x0152
            r1.b(r2)
            goto L_0x0152
        L_0x013c:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r1.<init>()
            throw r1
        L_0x0142:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r1.<init>()
            throw r1
        L_0x0148:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r1.<init>()
            throw r1
        L_0x014e:
            boolean r2 = r0.l
            if (r2 == 0) goto L_0x01ab
        L_0x0152:
            int r2 = r0.m
            if (r2 != 0) goto L_0x01a5
            int r2 = r0.n
            if (r2 != 0) goto L_0x019f
            int r13 = r0.b(r1)
            int r2 = r1.b()
            r3 = r2 & 7
            if (r3 != 0) goto L_0x016e
            bdj r3 = r0.b
            int r2 = r2 >> 3
            r3.c(r2)
            goto L_0x017c
        L_0x016e:
            bdj r2 = r0.b
            byte[] r2 = r2.a
            int r3 = r13 << 3
            r1.a(r2, r5, r3)
            bdj r2 = r0.b
            r2.c(r5)
        L_0x017c:
            atd r2 = r0.d
            bdj r3 = r0.b
            r2.a(r3, r13)
            atd r9 = r0.d
            long r10 = r0.k
            r12 = 1
            r14 = 0
            r15 = 0
            r9.a(r10, r12, r13, r14, r15)
            long r2 = r0.k
            long r6 = r0.s
            long r2 = r2 + r6
            r0.k = r2
            boolean r2 = r0.p
            if (r2 == 0) goto L_0x01ab
            long r2 = r0.q
            int r3 = (int) r2
            r1.b(r3)
            goto L_0x01ab
        L_0x019f:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r1.<init>()
            throw r1
        L_0x01a5:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r1.<init>()
            throw r1
        L_0x01ab:
            r0.g = r5
            goto L_0x0002
        L_0x01af:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x01b5:
            r8 = r24
            int r1 = r0.j
            r1 = r1 & -225(0xffffffffffffff1f, float:NaN)
            int r1 = r1 << r2
            int r2 = r24.c()
            r1 = r1 | r2
            r0.i = r1
            int r1 = r0.i
            bdj r2 = r0.b
            byte[] r2 = r2.a
            int r2 = r2.length
            if (r1 <= r2) goto L_0x01dd
            int r1 = r0.i
            bdj r2 = r0.b
            r2.a(r1)
            bdi r1 = r0.c
            bdj r2 = r0.b
            byte[] r2 = r2.a
            int r3 = r2.length
            r1.a(r2, r3)
        L_0x01dd:
            r0.h = r5
            r0.g = r6
            goto L_0x0002
        L_0x01e3:
            r8 = r24
            int r1 = r24.c()
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r3 != r6) goto L_0x01f5
            r0.j = r1
            r0.g = r4
            goto L_0x0002
        L_0x01f5:
            if (r1 == r2) goto L_0x0002
            r0.g = r5
            goto L_0x0002
        L_0x01fb:
            r8 = r24
            int r1 = r24.c()
            if (r1 != r2) goto L_0x0002
            r0.g = r3
            goto L_0x0002
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avd.a(bdj):void");
    }

    private int a(bdi bdi) {
        int a2 = bdi.a();
        Pair a3 = bcx.a(bdi, true);
        this.r = ((Integer) a3.first).intValue();
        this.t = ((Integer) a3.second).intValue();
        return a2 - bdi.a();
    }

    private int b(bdi bdi) {
        int c2;
        if (this.o == 0) {
            int i2 = 0;
            do {
                c2 = bdi.c(8);
                i2 += c2;
            } while (c2 == 255);
            return i2;
        }
        throw new ParserException();
    }

    private static long c(bdi bdi) {
        return (long) bdi.c((bdi.c(2) + 1) << 3);
    }
}
