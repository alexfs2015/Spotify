package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: atq reason: default package */
public final class atq implements ast {
    private static final int a = bdw.g("Xing");
    private static final int b = bdw.g("Info");
    private static final int c = bdw.g("VBRI");
    private final int d;
    private final long e;
    private final bdj f;
    private final asz g;
    private final asx h;
    private final asy i;
    private asv j;
    private atd k;
    private int l;
    private awa m;
    private a n;
    private long o;
    private long p;
    private int q;

    /* renamed from: atq$a */
    interface a extends atb {
        long c(long j);
    }

    private static boolean a(int i2, long j2) {
        return ((long) (i2 & -128000)) == (j2 & -128000);
    }

    static {
        $$Lambda$atq$DjMIaykBqV1nhmx0L_dslefqU8 r0 = $$Lambda$atq$DjMIaykBqV1nhmx0L_dslefqU8.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] a() {
        return new ast[]{new atq()};
    }

    public atq() {
        this(0);
    }

    public atq(int i2) {
        this(i2, -9223372036854775807L);
    }

    public atq(int i2, long j2) {
        this.d = i2;
        this.e = j2;
        this.f = new bdj(10);
        this.g = new asz();
        this.h = new asx();
        this.o = -9223372036854775807L;
        this.i = new asy();
    }

    public final boolean a(asu asu) {
        return a(asu, true);
    }

    public final void a(asv asv) {
        this.j = asv;
        this.k = this.j.a(0, 1);
        this.j.a();
    }

    public final void a(long j2, long j3) {
        this.l = 0;
        this.o = -9223372036854775807L;
        this.p = 0;
        this.q = 0;
    }

    /* JADX WARNING: type inference failed for: r2v30, types: [atq$a] */
    /* JADX WARNING: type inference failed for: r3v18, types: [atq$a] */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r2v39, types: [atq$a] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41, types: [atr] */
    /* JADX WARNING: type inference failed for: r2v52 */
    /* JADX WARNING: type inference failed for: r2v53 */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r2 != b) goto L_0x005e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.asu r42, defpackage.ata r43) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            int r2 = r0.l
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.a(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            atq$a r2 = r0.n
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r7 = 1
            if (r2 != 0) goto L_0x01e1
            bdj r13 = new bdj
            asz r2 = r0.g
            int r2 = r2.c
            r13.<init>(r2)
            byte[] r2 = r13.a
            asz r8 = r0.g
            int r8 = r8.c
            r1.c(r2, r4, r8)
            asz r2 = r0.g
            int r2 = r2.a
            r2 = r2 & r7
            r8 = 36
            r9 = 21
            if (r2 == 0) goto L_0x003d
            asz r2 = r0.g
            int r2 = r2.e
            if (r2 == r7) goto L_0x0048
            r9 = 36
            goto L_0x0048
        L_0x003d:
            asz r2 = r0.g
            int r2 = r2.e
            if (r2 == r7) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            r2 = 13
            r9 = 13
        L_0x0048:
            int r2 = r13.c
            int r10 = r9 + 4
            if (r2 < r10) goto L_0x005e
            r13.c(r9)
            int r2 = r13.i()
            int r10 = a
            if (r2 == r10) goto L_0x0072
            int r10 = b
            if (r2 != r10) goto L_0x005e
            goto L_0x0072
        L_0x005e:
            int r2 = r13.c
            r10 = 40
            if (r2 < r10) goto L_0x0071
            r13.c(r8)
            int r2 = r13.i()
            int r8 = c
            if (r2 != r8) goto L_0x0071
            r2 = r8
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            int r8 = a
            if (r2 == r8) goto L_0x009c
            int r8 = b
            if (r2 != r8) goto L_0x007b
            goto L_0x009c
        L_0x007b:
            int r8 = c
            if (r2 != r8) goto L_0x0096
            long r8 = r42.d()
            long r10 = r42.c()
            asz r12 = r0.g
            atr r2 = defpackage.atr.a(r8, r10, r12, r13)
            asz r8 = r0.g
            int r8 = r8.c
            r1.b(r8)
            goto L_0x017c
        L_0x0096:
            r42.a()
            r2 = 0
            goto L_0x017c
        L_0x009c:
            long r10 = r42.d()
            long r16 = r42.c()
            asz r8 = r0.g
            int r12 = r8.g
            int r15 = r8.d
            int r18 = r13.i()
            r14 = r18 & 1
            if (r14 != r7) goto L_0x012e
            int r14 = r13.n()
            if (r14 != 0) goto L_0x00ba
            goto L_0x012e
        L_0x00ba:
            long r3 = (long) r14
            r25 = r8
            long r7 = (long) r12
            long r21 = r7 * r5
            long r7 = (long) r15
            r19 = r3
            r23 = r7
            long r19 = defpackage.bdw.b(r19, r21, r23)
            r3 = 6
            r4 = r18 & 6
            if (r4 == r3) goto L_0x00db
            ats r3 = new ats
            r4 = r25
            int r4 = r4.c
            r15 = r3
            r18 = r4
            r15.<init>(r16, r18, r19)
            goto L_0x012f
        L_0x00db:
            r4 = r25
            int r3 = r13.n()
            long r7 = (long) r3
            r3 = 100
            long[] r12 = new long[r3]
            r15 = 0
        L_0x00e7:
            if (r15 >= r3) goto L_0x00f8
            int r3 = r13.c()
            long r5 = (long) r3
            r12[r15] = r5
            int r15 = r15 + 1
            r3 = 100
            r5 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x00e7
        L_0x00f8:
            r5 = -1
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x011f
            long r5 = r16 + r7
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x011f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r13 = "XING data size mismatch: "
            r3.<init>(r13)
            r3.append(r10)
            java.lang.String r10 = ", "
            r3.append(r10)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "XingSeeker"
            defpackage.bdd.c(r5, r3)
        L_0x011f:
            ats r3 = new ats
            int r4 = r4.c
            r15 = r3
            r18 = r4
            r21 = r7
            r23 = r12
            r15.<init>(r16, r18, r19, r21, r23)
            goto L_0x012f
        L_0x012e:
            r3 = 0
        L_0x012f:
            if (r3 == 0) goto L_0x0163
            asx r4 = r0.h
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x0163
            r42.a()
            int r9 = r9 + 141
            r1.c(r9)
            bdj r4 = r0.f
            byte[] r4 = r4.a
            r5 = 3
            r6 = 0
            r1.c(r4, r6, r5)
            bdj r4 = r0.f
            r4.c(r6)
            asx r4 = r0.h
            bdj r5 = r0.f
            int r5 = r5.f()
            int r6 = r5 >> 12
            r5 = r5 & 4095(0xfff, float:5.738E-42)
            if (r6 > 0) goto L_0x015f
            if (r5 <= 0) goto L_0x0163
        L_0x015f:
            r4.b = r6
            r4.c = r5
        L_0x0163:
            asz r4 = r0.g
            int r4 = r4.c
            r1.b(r4)
            if (r3 == 0) goto L_0x017b
            boolean r4 = r3.l_()
            if (r4 != 0) goto L_0x017b
            int r4 = b
            if (r2 != r4) goto L_0x017b
            atq$a r2 = r41.b(r42)
            goto L_0x017c
        L_0x017b:
            r2 = r3
        L_0x017c:
            r0.n = r2
            atq$a r2 = r0.n
            if (r2 == 0) goto L_0x018e
            boolean r2 = r2.l_()
            if (r2 != 0) goto L_0x0194
            int r2 = r0.d
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0194
        L_0x018e:
            atq$a r2 = r41.b(r42)
            r0.n = r2
        L_0x0194:
            asv r2 = r0.j
            atq$a r3 = r0.n
            r2.a(r3)
            atd r2 = r0.k
            r26 = 0
            asz r3 = r0.g
            java.lang.String r3 = r3.b
            r28 = 0
            r29 = -1
            r30 = 4096(0x1000, float:5.74E-42)
            asz r4 = r0.g
            int r4 = r4.e
            asz r5 = r0.g
            int r5 = r5.d
            r33 = -1
            asx r6 = r0.h
            int r6 = r6.b
            asx r7 = r0.h
            int r7 = r7.c
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            int r8 = r0.d
            r8 = r8 & 2
            if (r8 == 0) goto L_0x01cc
            r40 = 0
            goto L_0x01d0
        L_0x01cc:
            awa r8 = r0.m
            r40 = r8
        L_0x01d0:
            r27 = r3
            r31 = r4
            r32 = r5
            r34 = r6
            r35 = r7
            aqe r3 = defpackage.aqe.a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r2.a(r3)
        L_0x01e1:
            int r2 = r0.q
            if (r2 != 0) goto L_0x0254
            r42.a()
            bdj r2 = r0.f
            byte[] r2 = r2.a
            r3 = 4
            r4 = 1
            r5 = 0
            boolean r2 = r1.b(r2, r5, r3, r4)
            if (r2 != 0) goto L_0x01f7
            r2 = -1
            return r2
        L_0x01f7:
            r2 = -1
            bdj r3 = r0.f
            r3.c(r5)
            bdj r3 = r0.f
            int r3 = r3.i()
            int r4 = r0.l
            long r4 = (long) r4
            boolean r4 = a(r3, r4)
            if (r4 == 0) goto L_0x024c
            int r4 = defpackage.asz.a(r3)
            if (r4 != r2) goto L_0x0213
            goto L_0x024c
        L_0x0213:
            asz r2 = r0.g
            defpackage.asz.a(r3, r2)
            long r2 = r0.o
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0245
            atq$a r2 = r0.n
            long r6 = r42.c()
            long r2 = r2.c(r6)
            r0.o = r2
            long r2 = r0.e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0245
            atq$a r2 = r0.n
            r3 = 0
            long r2 = r2.c(r3)
            long r4 = r0.o
            long r6 = r0.e
            long r6 = r6 - r2
            long r4 = r4 + r6
            r0.o = r4
        L_0x0245:
            asz r2 = r0.g
            int r2 = r2.c
            r0.q = r2
            goto L_0x0254
        L_0x024c:
            r2 = 1
            r1.b(r2)
            r1 = 0
            r0.l = r1
            return r1
        L_0x0254:
            r2 = 1
            atd r3 = r0.k
            int r4 = r0.q
            int r1 = r3.a(r1, r4, r2)
            r2 = -1
            if (r1 != r2) goto L_0x0261
            return r2
        L_0x0261:
            int r2 = r0.q
            int r2 = r2 - r1
            r0.q = r2
            int r1 = r0.q
            if (r1 <= 0) goto L_0x026c
            r1 = 0
            return r1
        L_0x026c:
            long r1 = r0.o
            long r3 = r0.p
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            asz r5 = r0.g
            int r5 = r5.d
            long r5 = (long) r5
            long r3 = r3 / r5
            long r6 = r1 + r3
            atd r5 = r0.k
            r8 = 1
            asz r1 = r0.g
            int r9 = r1.c
            r10 = 0
            r11 = 0
            r5.a(r6, r8, r9, r10, r11)
            long r1 = r0.p
            asz r3 = r0.g
            int r3 = r3.g
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.p = r1
            r1 = 0
            r0.q = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atq.a(asu, ata):int");
    }

    private boolean a(asu asu, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = z ? 16384 : 131072;
        asu.a();
        if (asu.c() == 0) {
            this.m = this.i.a(asu, (this.d & 2) != 0 ? asx.a : null);
            awa awa = this.m;
            if (awa != null) {
                this.h.a(awa);
            }
            int b2 = (int) asu.b();
            if (!z) {
                asu.b(b2);
            }
            i2 = b2;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        while (true) {
            if (!asu.b(this.f.a, 0, 4, i5 > 0)) {
                break;
            }
            this.f.c(0);
            int i8 = this.f.i();
            if (i4 == 0 || a(i8, (long) i4)) {
                int a2 = asz.a(i8);
                if (a2 != -1) {
                    i6 = i5 + 1;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        asz.a(i8, this.g);
                        i4 = i8;
                    }
                    asu.c(a2 - 4);
                }
            }
            int i9 = i3 + 1;
            if (i3 != i7) {
                if (z) {
                    asu.a();
                    asu.c(i2 + i9);
                } else {
                    asu.b(1);
                }
                i3 = i9;
                i6 = 0;
                i4 = 0;
            } else if (z) {
                return false;
            } else {
                throw new ParserException("Searched too many bytes.");
            }
        }
        if (z) {
            asu.b(i2 + i3);
        } else {
            asu.a();
        }
        this.l = i4;
        return true;
    }

    private a b(asu asu) {
        asu.c(this.f.a, 0, 4);
        this.f.c(0);
        asz.a(this.f.i(), this.g);
        atp atp = new atp(asu.d(), asu.c(), this.g);
        return atp;
    }
}
