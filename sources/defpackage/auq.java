package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: auq reason: default package */
public final class auq implements atk, ats {
    private static final int a = ben.g("qt  ");
    private final int b;
    private final bea c;
    private final bea d;
    private final bea e;
    private final ArrayDeque<a> f;
    private int g;
    private int h;
    private long i;
    private int j;
    private bea k;
    private int l;
    private int m;
    private int n;
    private atm o;
    private a[] p;
    private long[][] q;
    private int r;
    private long s;
    private boolean t;

    /* renamed from: auq$a */
    static final class a {
        public final aut a;
        public final auw b;
        public final atu c;
        public int d;

        public a(aut aut, auw auw, atu atu) {
            this.a = aut;
            this.b = auw;
            this.c = atu;
        }
    }

    static {
        $$Lambda$auq$XBseVFLKrf_RoxYOG6xFmrBdpXc r0 = $$Lambda$auq$XBseVFLKrf_RoxYOG6xFmrBdpXc.INSTANCE;
    }

    public auq() {
        this(0);
    }

    public auq(int i2) {
        this.b = i2;
        this.e = new bea(16);
        this.f = new ArrayDeque<>();
        this.c = new bea(bdy.a);
        this.d = new bea(4);
        this.l = -1;
    }

    private static int a(auw auw, long j2) {
        int a2 = auw.a(j2);
        return a2 == -1 ? auw.b(j2) : a2;
    }

    private static long a(auw auw, long j2, long j3) {
        int a2 = a(auw, j2);
        return a2 == -1 ? j3 : Math.min(auw.c[a2], j3);
    }

    private ArrayList<auw> a(a aVar, ato ato, boolean z) {
        ArrayList<auw> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < aVar.aT.size(); i2++) {
            a aVar2 = (a) aVar.aT.get(i2);
            if (aVar2.aQ == auk.D) {
                aut a2 = aul.a(aVar2, aVar.d(auk.C), -9223372036854775807L, (ast) null, z, this.t);
                if (a2 != null) {
                    auw a3 = aul.a(a2, aVar2.e(auk.E).e(auk.F).e(auk.G), ato);
                    if (a3.b != 0) {
                        arrayList.add(a3);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(a aVar) {
        awr awr;
        a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        ato ato = new ato();
        b d2 = aVar2.d(auk.az);
        if (d2 != null) {
            awr = aul.a(d2, this.t);
            if (awr != null) {
                ato.a(awr);
            }
        } else {
            awr = null;
        }
        int i2 = 1;
        int i3 = 0;
        ArrayList a2 = a(aVar2, ato, (this.b & 1) != 0);
        int size = a2.size();
        int i4 = -1;
        long j2 = -9223372036854775807L;
        while (i3 < size) {
            auw auw = (auw) a2.get(i3);
            aut aut = auw.a;
            a aVar3 = new a(aut, auw, this.o.a(i3, aut.b));
            aqv a3 = aut.f.a(auw.e + 30);
            if (aut.b == i2) {
                if (ato.a()) {
                    a3 = a3.a(ato.b, ato.c);
                }
                if (awr != null) {
                    a3 = a3.a(awr);
                }
            }
            aVar3.c.a(a3);
            j2 = Math.max(j2, aut.e != -9223372036854775807L ? aut.e : auw.h);
            if (aut.b == 2) {
                if (i4 == -1) {
                    i4 = arrayList.size();
                }
            }
            arrayList.add(aVar3);
            i3++;
            i2 = 1;
        }
        this.r = i4;
        this.s = j2;
        this.p = (a[]) arrayList.toArray(new a[arrayList.size()]);
        this.q = a(this.p);
        this.o.a();
        this.o.a(this);
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].b.b];
            jArr2[i2] = aVarArr[i2].b.f[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            int i4 = -1;
            long j3 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5] && jArr2[i5] <= j3) {
                    j3 = jArr2[i5];
                    i4 = i5;
                }
            }
            int i6 = iArr[i4];
            jArr[i4][i6] = j2;
            j2 += (long) aVarArr[i4].b.d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr[i4].length) {
                jArr2[i4] = aVarArr[i4].b.f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private void b(long j2) {
        while (!this.f.isEmpty() && ((a) this.f.peek()).aR == j2) {
            a aVar = (a) this.f.pop();
            if (aVar.aQ == auk.B) {
                a(aVar);
                this.f.clear();
                this.g = 2;
            } else if (!this.f.isEmpty()) {
                ((a) this.f.peek()).a(aVar);
            }
        }
        if (this.g != 2) {
            c();
        }
    }

    private void c() {
        this.g = 0;
        this.j = 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] d() {
        return new atk[]{new auq()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:190:0x034b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x01fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.atl r32, defpackage.atr r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
        L_0x0006:
            int r3 = r0.g
            r4 = 0
            r6 = -1
            r7 = 8
            r8 = 1
            if (r3 == 0) goto L_0x01ff
            r10 = 262144(0x40000, double:1.295163E-318)
            r12 = 2
            if (r3 == r8) goto L_0x0177
            if (r3 != r12) goto L_0x0171
            long r14 = r32.c()
            int r3 = r0.l
            if (r3 != r6) goto L_0x009b
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r20 = r18
            r24 = r20
            r3 = 0
            r7 = 1
            r13 = 1
            r22 = -1
            r23 = -1
        L_0x0032:
            auq$a[] r12 = r0.p
            int r9 = r12.length
            if (r3 >= r9) goto L_0x007f
            r9 = r12[r3]
            int r12 = r9.d
            auw r8 = r9.b
            int r8 = r8.b
            if (r12 == r8) goto L_0x007b
            auw r8 = r9.b
            long[] r8 = r8.c
            r27 = r8[r12]
            long[][] r8 = r0.q
            r8 = r8[r3]
            r29 = r8[r12]
            long r8 = r27 - r14
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 < 0) goto L_0x005a
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r12 = 0
            goto L_0x005b
        L_0x005a:
            r12 = 1
        L_0x005b:
            if (r12 != 0) goto L_0x005f
            if (r13 != 0) goto L_0x0065
        L_0x005f:
            if (r12 != r13) goto L_0x006b
            int r27 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r27 >= 0) goto L_0x006b
        L_0x0065:
            r23 = r3
            r13 = r12
            r20 = r29
            goto L_0x006d
        L_0x006b:
            r8 = r24
        L_0x006d:
            int r24 = (r29 > r18 ? 1 : (r29 == r18 ? 0 : -1))
            if (r24 >= 0) goto L_0x0079
            r22 = r3
            r24 = r8
            r7 = r12
            r18 = r29
            goto L_0x007b
        L_0x0079:
            r24 = r8
        L_0x007b:
            int r3 = r3 + 1
            r8 = 1
            goto L_0x0032
        L_0x007f:
            int r3 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x0092
            if (r7 == 0) goto L_0x0092
            r7 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r7
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r3 = r22
            goto L_0x0094
        L_0x0092:
            r3 = r23
        L_0x0094:
            r0.l = r3
            int r3 = r0.l
            if (r3 != r6) goto L_0x009b
            return r6
        L_0x009b:
            auq$a[] r3 = r0.p
            int r7 = r0.l
            r3 = r3[r7]
            atu r7 = r3.c
            int r8 = r3.d
            auw r9 = r3.b
            long[] r9 = r9.c
            r12 = r9[r8]
            auw r9 = r3.b
            int[] r9 = r9.d
            r9 = r9[r8]
            long r14 = r12 - r14
            int r6 = r0.m
            long r10 = (long) r6
            long r14 = r14 + r10
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x016d
            r4 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x00c4
            goto L_0x016d
        L_0x00c4:
            aut r2 = r3.a
            int r2 = r2.g
            r4 = 1
            if (r2 != r4) goto L_0x00d0
            r4 = 8
            long r14 = r14 + r4
            int r9 = r9 + -8
        L_0x00d0:
            int r2 = (int) r14
            r1.b(r2)
            aut r2 = r3.a
            int r2 = r2.j
            if (r2 == 0) goto L_0x0131
            bea r2 = r0.d
            byte[] r2 = r2.a
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r5 = 2
            r2[r5] = r4
            aut r2 = r3.a
            int r2 = r2.j
            aut r4 = r3.a
            int r4 = r4.j
            r5 = 4
            int r13 = 4 - r4
        L_0x00f2:
            int r4 = r0.m
            if (r4 >= r9) goto L_0x0147
            int r4 = r0.n
            if (r4 != 0) goto L_0x0121
            bea r4 = r0.d
            byte[] r4 = r4.a
            r1.b(r4, r13, r2)
            bea r4 = r0.d
            r5 = 0
            r4.c(r5)
            bea r4 = r0.d
            int r4 = r4.n()
            r0.n = r4
            bea r4 = r0.c
            r4.c(r5)
            bea r4 = r0.c
            r6 = 4
            r7.a(r4, r6)
            int r4 = r0.m
            int r4 = r4 + r6
            r0.m = r4
            int r9 = r9 + r13
            goto L_0x00f2
        L_0x0121:
            r5 = 0
            int r4 = r7.a(r1, r4, r5)
            int r5 = r0.m
            int r5 = r5 + r4
            r0.m = r5
            int r5 = r0.n
            int r5 = r5 - r4
            r0.n = r5
            goto L_0x00f2
        L_0x0131:
            int r2 = r0.m
            if (r2 >= r9) goto L_0x0147
            int r2 = r9 - r2
            r4 = 0
            int r2 = r7.a(r1, r2, r4)
            int r4 = r0.m
            int r4 = r4 + r2
            r0.m = r4
            int r4 = r0.n
            int r4 = r4 - r2
            r0.n = r4
            goto L_0x0131
        L_0x0147:
            r20 = r9
            auw r1 = r3.b
            long[] r1 = r1.f
            r17 = r1[r8]
            auw r1 = r3.b
            int[] r1 = r1.g
            r19 = r1[r8]
            r21 = 0
            r22 = 0
            r16 = r7
            r16.a(r17, r19, r20, r21, r22)
            int r1 = r3.d
            r4 = 1
            int r1 = r1 + r4
            r3.d = r1
            r1 = -1
            r0.l = r1
            r1 = 0
            r0.m = r1
            r0.n = r1
            return r1
        L_0x016d:
            r4 = 1
            r2.a = r12
            return r4
        L_0x0171:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0177:
            long r3 = r0.i
            int r5 = r0.j
            long r5 = (long) r5
            long r3 = r3 - r5
            long r5 = r32.c()
            long r5 = r5 + r3
            bea r8 = r0.k
            if (r8 == 0) goto L_0x01d7
            byte[] r8 = r8.a
            int r9 = r0.j
            int r4 = (int) r3
            r1.b(r8, r9, r4)
            int r3 = r0.h
            int r4 = defpackage.auk.a
            if (r3 != r4) goto L_0x01ba
            bea r3 = r0.k
            r3.c(r7)
            int r4 = r3.i()
            int r7 = a
            if (r4 != r7) goto L_0x01a3
        L_0x01a1:
            r3 = 1
            goto L_0x01b7
        L_0x01a3:
            r4 = 4
            r3.d(r4)
        L_0x01a7:
            int r4 = r3.b()
            if (r4 <= 0) goto L_0x01b6
            int r4 = r3.i()
            int r7 = a
            if (r4 != r7) goto L_0x01a7
            goto L_0x01a1
        L_0x01b6:
            r3 = 0
        L_0x01b7:
            r0.t = r3
            goto L_0x01e2
        L_0x01ba:
            java.util.ArrayDeque<auk$a> r3 = r0.f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x01e2
            java.util.ArrayDeque<auk$a> r3 = r0.f
            java.lang.Object r3 = r3.peek()
            auk$a r3 = (defpackage.auk.a) r3
            auk$b r4 = new auk$b
            int r7 = r0.h
            bea r8 = r0.k
            r4.<init>(r7, r8)
            r3.a(r4)
            goto L_0x01e2
        L_0x01d7:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x01e4
            int r4 = (int) r3
            r1.b(r4)
        L_0x01e2:
            r3 = 0
            goto L_0x01ec
        L_0x01e4:
            long r7 = r32.c()
            long r7 = r7 + r3
            r2.a = r7
            r3 = 1
        L_0x01ec:
            r0.b(r5)
            if (r3 == 0) goto L_0x01f9
            int r3 = r0.g
            r4 = 2
            if (r3 == r4) goto L_0x01f9
            r26 = 1
            goto L_0x01fb
        L_0x01f9:
            r26 = 0
        L_0x01fb:
            if (r26 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x01ff:
            r3 = 1
            int r6 = r0.j
            if (r6 != 0) goto L_0x0229
            bea r6 = r0.e
            byte[] r6 = r6.a
            r8 = 0
            boolean r6 = r1.a(r6, r8, r7, r3)
            if (r6 != 0) goto L_0x0212
            r4 = 0
            goto L_0x0349
        L_0x0212:
            r0.j = r7
            bea r3 = r0.e
            r3.c(r8)
            bea r3 = r0.e
            long r8 = r3.g()
            r0.i = r8
            bea r3 = r0.e
            int r3 = r3.i()
            r0.h = r3
        L_0x0229:
            long r8 = r0.i
            r10 = 1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0246
            bea r3 = r0.e
            byte[] r3 = r3.a
            r1.b(r3, r7, r7)
            int r3 = r0.j
            int r3 = r3 + r7
            r0.j = r3
            bea r3 = r0.e
            long r3 = r3.p()
            r0.i = r3
            goto L_0x0275
        L_0x0246:
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0275
            long r3 = r32.d()
            r5 = -1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0266
            java.util.ArrayDeque<auk$a> r8 = r0.f
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0266
            java.util.ArrayDeque<auk$a> r3 = r0.f
            java.lang.Object r3 = r3.peek()
            auk$a r3 = (defpackage.auk.a) r3
            long r3 = r3.aR
        L_0x0266:
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0275
            long r5 = r32.c()
            long r3 = r3 - r5
            int r5 = r0.j
            long r5 = (long) r5
            long r3 = r3 + r5
            r0.i = r3
        L_0x0275:
            long r3 = r0.i
            int r5 = r0.j
            long r5 = (long) r5
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x034d
            int r3 = r0.h
            int r4 = defpackage.auk.B
            if (r3 == r4) goto L_0x029b
            int r4 = defpackage.auk.D
            if (r3 == r4) goto L_0x029b
            int r4 = defpackage.auk.E
            if (r3 == r4) goto L_0x029b
            int r4 = defpackage.auk.F
            if (r3 == r4) goto L_0x029b
            int r4 = defpackage.auk.G
            if (r3 == r4) goto L_0x029b
            int r4 = defpackage.auk.P
            if (r3 != r4) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r3 = 0
            goto L_0x029c
        L_0x029b:
            r3 = 1
        L_0x029c:
            if (r3 == 0) goto L_0x02c8
            long r3 = r32.c()
            long r5 = r0.i
            long r3 = r3 + r5
            int r5 = r0.j
            long r5 = (long) r5
            long r3 = r3 - r5
            java.util.ArrayDeque<auk$a> r5 = r0.f
            auk$a r6 = new auk$a
            int r7 = r0.h
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.i
            int r7 = r0.j
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x02c2
            r0.b(r3)
            goto L_0x02c5
        L_0x02c2:
            r31.c()
        L_0x02c5:
            r4 = 1
            goto L_0x0349
        L_0x02c8:
            int r3 = r0.h
            int r4 = defpackage.auk.R
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.C
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.S
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.T
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.al
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.am
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.an
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.Q
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.ao
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.ap
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.aq
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.ar
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.as
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.O
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.a
            if (r3 == r4) goto L_0x030d
            int r4 = defpackage.auk.az
            if (r3 != r4) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r3 = 0
            goto L_0x030e
        L_0x030d:
            r3 = 1
        L_0x030e:
            if (r3 == 0) goto L_0x0343
            int r3 = r0.j
            if (r3 != r7) goto L_0x0316
            r3 = 1
            goto L_0x0317
        L_0x0316:
            r3 = 0
        L_0x0317:
            defpackage.bdl.b(r3)
            long r3 = r0.i
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0325
            r3 = 1
            goto L_0x0326
        L_0x0325:
            r3 = 0
        L_0x0326:
            defpackage.bdl.b(r3)
            bea r3 = new bea
            long r4 = r0.i
            int r5 = (int) r4
            r3.<init>(r5)
            r0.k = r3
            bea r3 = r0.e
            byte[] r3 = r3.a
            bea r4 = r0.k
            byte[] r4 = r4.a
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r7)
            r4 = 1
            r0.g = r4
            goto L_0x0349
        L_0x0343:
            r4 = 1
            r3 = 0
            r0.k = r3
            r0.g = r4
        L_0x0349:
            if (r4 != 0) goto L_0x0006
            r3 = -1
            return r3
        L_0x034d:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            goto L_0x0356
        L_0x0355:
            throw r1
        L_0x0356:
            goto L_0x0355
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auq.a(atl, atr):int");
    }

    public final defpackage.ats.a a(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        a[] aVarArr = this.p;
        if (aVarArr.length == 0) {
            return new defpackage.ats.a(att.a);
        }
        int i2 = this.r;
        if (i2 != -1) {
            auw auw = aVarArr[i2].b;
            int a2 = a(auw, j2);
            if (a2 == -1) {
                return new defpackage.ats.a(att.a);
            }
            long j7 = auw.f[a2];
            j3 = auw.c[a2];
            if (j7 < j2 && a2 < auw.b - 1) {
                int b2 = auw.b(j2);
                if (!(b2 == -1 || b2 == a2)) {
                    j5 = auw.f[b2];
                    j6 = auw.c[b2];
                    j4 = j6;
                    j2 = j7;
                }
            }
            j6 = -1;
            j5 = -9223372036854775807L;
            j4 = j6;
            j2 = j7;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.p;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.r) {
                auw auw2 = aVarArr2[i3].b;
                long a3 = a(auw2, j2, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = a(auw2, j5, j4);
                }
                j3 = a3;
            }
            i3++;
        }
        att att = new att(j2, j3);
        return j5 == -9223372036854775807L ? new defpackage.ats.a(att) : new defpackage.ats.a(att, new att(j5, j4));
    }

    public final void a(long j2, long j3) {
        this.f.clear();
        this.j = 0;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        if (j2 == 0) {
            c();
            return;
        }
        a[] aVarArr = this.p;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                auw auw = aVar.b;
                int a2 = auw.a(j3);
                if (a2 == -1) {
                    a2 = auw.b(j3);
                }
                aVar.d = a2;
            }
        }
    }

    public final void a(atm atm) {
        this.o = atm;
    }

    public final boolean a(atl atl) {
        return aus.b(atl);
    }

    public final long b() {
        return this.s;
    }

    public final boolean l_() {
        return true;
    }
}
