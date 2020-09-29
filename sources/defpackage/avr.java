package defpackage;

import android.util.SparseArray;

/* renamed from: avr reason: default package */
public final class avr implements avp {
    private final awd a;
    private final boolean b;
    private final boolean c;
    private final avw d = new avw(7, 128);
    private final avw e = new avw(8, 128);
    private final avw f = new avw(6, 128);
    private long g;
    private final boolean[] h = new boolean[3];
    private String i;
    private atu j;
    private a k;
    private boolean l;
    private long m;
    private final bea n = new bea();

    /* renamed from: avr$a */
    static final class a {
        final atu a;
        final boolean b;
        final boolean c;
        int d;
        int e;
        long f;
        boolean g;
        long h;
        C0014a i = new C0014a(0);
        C0014a j = new C0014a(0);
        boolean k;
        long l;
        long m;
        boolean n;
        private final SparseArray<b> o = new SparseArray<>();
        private final SparseArray<defpackage.bdy.a> p = new SparseArray<>();
        private final beb q = new beb(this.r, 0, 0);
        private byte[] r = new byte[128];

        /* renamed from: avr$a$a reason: collision with other inner class name */
        static final class C0014a {
            boolean a;
            boolean b;
            b c;
            int d;
            int e;
            int f;
            int g;
            boolean h;
            boolean i;
            boolean j;
            boolean k;
            int l;
            int m;
            int n;
            int o;
            int p;

            private C0014a() {
            }

            /* synthetic */ C0014a(byte b2) {
                this();
            }

            public final void a() {
                this.b = false;
                this.a = false;
            }

            public final void a(int i2) {
                this.e = i2;
                this.b = true;
            }

            public final void a(b bVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.c = bVar;
                this.d = i2;
                this.e = i3;
                this.f = i4;
                this.g = i5;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i6;
                this.m = i7;
                this.n = i8;
                this.o = i9;
                this.p = i10;
                this.a = true;
                this.b = true;
            }
        }

        public a(atu atu, boolean z, boolean z2) {
            this.a = atu;
            this.b = z;
            this.c = z2;
            a();
        }

        public final void a() {
            this.g = false;
            this.k = false;
            this.j.a();
        }

        public final void a(defpackage.bdy.a aVar) {
            this.p.append(aVar.a, aVar);
        }

        public final void a(b bVar) {
            this.o.append(bVar.d, bVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0150  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.g
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.r
                int r4 = r3.length
                int r5 = r0.d
                int r6 = r5 + r2
                r7 = 1
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r4 = r5 << 1
                byte[] r3 = java.util.Arrays.copyOf(r3, r4)
                r0.r = r3
            L_0x001e:
                byte[] r3 = r0.r
                int r4 = r0.d
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.d
                int r1 = r1 + r2
                r0.d = r1
                beb r1 = r0.q
                byte[] r2 = r0.r
                int r3 = r0.d
                r4 = 0
                r1.a(r2, r4, r3)
                beb r1 = r0.q
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x0041
                return
            L_0x0041:
                beb r1 = r0.q
                r1.a()
                beb r1 = r0.q
                r2 = 2
                int r10 = r1.c(r2)
                beb r1 = r0.q
                r3 = 5
                r1.a(r3)
                beb r1 = r0.q
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x005c
                return
            L_0x005c:
                beb r1 = r0.q
                r1.e()
                beb r1 = r0.q
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x006a
                return
            L_0x006a:
                beb r1 = r0.q
                int r11 = r1.e()
                boolean r1 = r0.c
                if (r1 != 0) goto L_0x007c
                r0.g = r4
                avr$a$a r1 = r0.j
                r1.a(r11)
                return
            L_0x007c:
                beb r1 = r0.q
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0085
                return
            L_0x0085:
                beb r1 = r0.q
                int r13 = r1.e()
                android.util.SparseArray<bdy$a> r1 = r0.p
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0096
                r0.g = r4
                return
            L_0x0096:
                android.util.SparseArray<bdy$a> r1 = r0.p
                java.lang.Object r1 = r1.get(r13)
                bdy$a r1 = (defpackage.bdy.a) r1
                android.util.SparseArray<bdy$b> r5 = r0.o
                int r6 = r1.b
                java.lang.Object r5 = r5.get(r6)
                r9 = r5
                bdy$b r9 = (defpackage.bdy.b) r9
                boolean r5 = r9.h
                if (r5 == 0) goto L_0x00bb
                beb r5 = r0.q
                boolean r5 = r5.b(r2)
                if (r5 != 0) goto L_0x00b6
                return
            L_0x00b6:
                beb r5 = r0.q
                r5.a(r2)
            L_0x00bb:
                beb r2 = r0.q
                int r5 = r9.j
                boolean r2 = r2.b(r5)
                if (r2 != 0) goto L_0x00c6
                return
            L_0x00c6:
                beb r2 = r0.q
                int r5 = r9.j
                int r12 = r2.c(r5)
                boolean r2 = r9.i
                if (r2 != 0) goto L_0x00f9
                beb r2 = r0.q
                boolean r2 = r2.b(r7)
                if (r2 != 0) goto L_0x00db
                return
            L_0x00db:
                beb r2 = r0.q
                boolean r2 = r2.b()
                if (r2 == 0) goto L_0x00f7
                beb r5 = r0.q
                boolean r5 = r5.b(r7)
                if (r5 != 0) goto L_0x00ec
                return
            L_0x00ec:
                beb r5 = r0.q
                boolean r5 = r5.b()
                r14 = r2
                r16 = r5
                r15 = 1
                goto L_0x00fd
            L_0x00f7:
                r14 = r2
                goto L_0x00fa
            L_0x00f9:
                r14 = 0
            L_0x00fa:
                r15 = 0
                r16 = 0
            L_0x00fd:
                int r2 = r0.e
                if (r2 != r3) goto L_0x0104
                r17 = 1
                goto L_0x0106
            L_0x0104:
                r17 = 0
            L_0x0106:
                if (r17 == 0) goto L_0x011a
                beb r2 = r0.q
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x0111
                return
            L_0x0111:
                beb r2 = r0.q
                int r2 = r2.e()
                r18 = r2
                goto L_0x011c
            L_0x011a:
                r18 = 0
            L_0x011c:
                int r2 = r9.k
                if (r2 != 0) goto L_0x0150
                beb r2 = r0.q
                int r3 = r9.l
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x012b
                return
            L_0x012b:
                beb r2 = r0.q
                int r3 = r9.l
                int r2 = r2.c(r3)
                boolean r1 = r1.c
                if (r1 == 0) goto L_0x014d
                if (r14 != 0) goto L_0x014d
                beb r1 = r0.q
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0142
                return
            L_0x0142:
                beb r1 = r0.q
                int r1 = r1.d()
                r20 = r1
                r19 = r2
                goto L_0x0190
            L_0x014d:
                r19 = r2
                goto L_0x018e
            L_0x0150:
                int r2 = r9.k
                if (r2 != r7) goto L_0x018c
                boolean r2 = r9.m
                if (r2 != 0) goto L_0x018c
                beb r2 = r0.q
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x0161
                return
            L_0x0161:
                beb r2 = r0.q
                int r2 = r2.d()
                boolean r1 = r1.c
                if (r1 == 0) goto L_0x0185
                if (r14 != 0) goto L_0x0185
                beb r1 = r0.q
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0176
                return
            L_0x0176:
                beb r1 = r0.q
                int r1 = r1.d()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0194
            L_0x0185:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0192
            L_0x018c:
                r19 = 0
            L_0x018e:
                r20 = 0
            L_0x0190:
                r21 = 0
            L_0x0192:
                r22 = 0
            L_0x0194:
                avr$a$a r8 = r0.j
                r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.avr.a.a(byte[], int, int):void");
        }
    }

    public avr(awd awd, boolean z, boolean z2) {
        this.a = awd;
        this.b = z;
        this.c = z2;
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (!this.l || this.k.c) {
            this.d.a(bArr, i2, i3);
            this.e.a(bArr, i2, i3);
        }
        this.f.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    public final void a() {
        bdy.a(this.h);
        this.d.a();
        this.e.a();
        this.f.a();
        this.k.a();
        this.g = 0;
    }

    public final void a(long j2, boolean z) {
        this.m = j2;
    }

    public final void a(atm atm, d dVar) {
        dVar.a();
        this.i = dVar.c();
        this.j = atm.a(dVar.b(), 2);
        this.k = new a(this.j, this.b, this.c);
        this.a.a(atm, dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023e, code lost:
        if ((r2.b && (r2.e == 7 || r2.e == 2)) != false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0271, code lost:
        if (r3.e != 1) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ee, code lost:
        if ((r3.a && !(r4.a && r3.f == r4.f && r3.g == r4.g && r3.h == r4.h && ((!r3.i || !r4.i || r3.j == r4.j) && ((r3.d == r4.d || (r3.d != 0 && r4.d != 0)) && ((r3.c.k != 0 || r4.c.k != 0 || (r3.m == r4.m && r3.n == r4.n)) && ((r3.c.k != 1 || r4.c.k != 1 || (r3.o == r4.o && r3.p == r4.p)) && r3.k == r4.k && (!r3.k || !r4.k || r3.l == r4.l))))))) != false) goto L_0x01f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0298 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bea r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            int r2 = r1.b
            int r3 = r1.c
            byte[] r4 = r1.a
            long r5 = r0.g
            int r7 = r31.b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.g = r5
            atu r5 = r0.j
            int r6 = r31.b()
            r5.a(r1, r6)
        L_0x001d:
            boolean[] r1 = r0.h
            int r1 = defpackage.bdy.a(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x0029
            r0.a(r4, r2, r3)
            return
        L_0x0029:
            int r5 = defpackage.bdy.b(r4, r1)
            int r6 = r1 - r2
            if (r6 <= 0) goto L_0x0034
            r0.a(r4, r2, r1)
        L_0x0034:
            int r2 = r3 - r1
            long r7 = r0.g
            long r9 = (long) r2
            long r7 = r7 - r9
            if (r6 >= 0) goto L_0x003e
            int r6 = -r6
            goto L_0x003f
        L_0x003e:
            r6 = 0
        L_0x003f:
            long r10 = r0.m
            boolean r12 = r0.l
            if (r12 == 0) goto L_0x0054
            avr$a r12 = r0.k
            boolean r12 = r12.c
            if (r12 == 0) goto L_0x004c
            goto L_0x0054
        L_0x004c:
            r29 = r1
            r27 = r3
            r28 = r4
            goto L_0x0136
        L_0x0054:
            avw r12 = r0.d
            r12.b(r6)
            avw r12 = r0.e
            r12.b(r6)
            boolean r12 = r0.l
            r14 = 3
            if (r12 != 0) goto L_0x00f7
            avw r12 = r0.d
            boolean r12 = r12.a
            if (r12 == 0) goto L_0x004c
            avw r12 = r0.e
            boolean r12 = r12.a
            if (r12 == 0) goto L_0x004c
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            avw r15 = r0.d
            byte[] r15 = r15.b
            avw r9 = r0.d
            int r9 = r9.c
            byte[] r9 = java.util.Arrays.copyOf(r15, r9)
            r12.add(r9)
            avw r9 = r0.e
            byte[] r9 = r9.b
            avw r15 = r0.e
            int r15 = r15.c
            byte[] r9 = java.util.Arrays.copyOf(r9, r15)
            r12.add(r9)
            avw r9 = r0.d
            byte[] r9 = r9.b
            avw r15 = r0.d
            int r15 = r15.c
            bdy$b r9 = defpackage.bdy.a(r9, r14, r15)
            avw r15 = r0.e
            byte[] r15 = r15.b
            avw r13 = r0.e
            int r13 = r13.c
            bdy$a r13 = defpackage.bdy.b(r15, r14, r13)
            atu r14 = r0.j
            java.lang.String r15 = r0.i
            r27 = r3
            int r3 = r9.a
            r28 = r4
            int r4 = r9.b
            r29 = r1
            int r1 = r9.c
            java.lang.String r17 = defpackage.bdo.b(r3, r4, r1)
            r18 = -1
            r19 = -1
            int r1 = r9.e
            int r3 = r9.f
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            float r4 = r9.g
            r26 = 0
            java.lang.String r16 = "video/avc"
            r20 = r1
            r21 = r3
            r23 = r12
            r25 = r4
            aqv r1 = defpackage.aqv.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14.a(r1)
            r1 = 1
            r0.l = r1
            avr$a r1 = r0.k
            r1.a(r9)
            avr$a r1 = r0.k
            r1.a(r13)
            avw r1 = r0.d
            r1.a()
            avw r1 = r0.e
            r1.a()
            goto L_0x0136
        L_0x00f7:
            r29 = r1
            r27 = r3
            r28 = r4
            avw r1 = r0.d
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x011a
            avw r1 = r0.d
            byte[] r1 = r1.b
            avw r3 = r0.d
            int r3 = r3.c
            bdy$b r1 = defpackage.bdy.a(r1, r14, r3)
            avr$a r3 = r0.k
            r3.a(r1)
            avw r1 = r0.d
            r1.a()
            goto L_0x0136
        L_0x011a:
            avw r1 = r0.e
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x0136
            avw r1 = r0.e
            byte[] r1 = r1.b
            avw r3 = r0.e
            int r3 = r3.c
            bdy$a r1 = defpackage.bdy.b(r1, r14, r3)
            avr$a r3 = r0.k
            r3.a(r1)
            avw r1 = r0.e
            r1.a()
        L_0x0136:
            avw r1 = r0.f
            boolean r1 = r1.b(r6)
            if (r1 == 0) goto L_0x0160
            avw r1 = r0.f
            byte[] r1 = r1.b
            avw r3 = r0.f
            int r3 = r3.c
            int r1 = defpackage.bdy.a(r1, r3)
            bea r3 = r0.n
            avw r4 = r0.f
            byte[] r4 = r4.b
            r3.a(r4, r1)
            bea r1 = r0.n
            r3 = 4
            r1.c(r3)
            awd r1 = r0.a
            bea r3 = r0.n
            r1.a(r10, r3)
        L_0x0160:
            avr$a r1 = r0.k
            int r3 = r1.e
            r4 = 9
            if (r3 == r4) goto L_0x01f3
            boolean r3 = r1.c
            if (r3 == 0) goto L_0x01f1
            avr$a$a r3 = r1.j
            avr$a$a r4 = r1.i
            boolean r6 = r3.a
            if (r6 == 0) goto L_0x01ed
            boolean r6 = r4.a
            if (r6 == 0) goto L_0x01eb
            int r6 = r3.f
            int r9 = r4.f
            if (r6 != r9) goto L_0x01eb
            int r6 = r3.g
            int r9 = r4.g
            if (r6 != r9) goto L_0x01eb
            boolean r6 = r3.h
            boolean r9 = r4.h
            if (r6 != r9) goto L_0x01eb
            boolean r6 = r3.i
            if (r6 == 0) goto L_0x0198
            boolean r6 = r4.i
            if (r6 == 0) goto L_0x0198
            boolean r6 = r3.j
            boolean r9 = r4.j
            if (r6 != r9) goto L_0x01eb
        L_0x0198:
            int r6 = r3.d
            int r9 = r4.d
            if (r6 == r9) goto L_0x01a6
            int r6 = r3.d
            if (r6 == 0) goto L_0x01eb
            int r6 = r4.d
            if (r6 == 0) goto L_0x01eb
        L_0x01a6:
            bdy$b r6 = r3.c
            int r6 = r6.k
            if (r6 != 0) goto L_0x01be
            bdy$b r6 = r4.c
            int r6 = r6.k
            if (r6 != 0) goto L_0x01be
            int r6 = r3.m
            int r9 = r4.m
            if (r6 != r9) goto L_0x01eb
            int r6 = r3.n
            int r9 = r4.n
            if (r6 != r9) goto L_0x01eb
        L_0x01be:
            bdy$b r6 = r3.c
            int r6 = r6.k
            r9 = 1
            if (r6 != r9) goto L_0x01d7
            bdy$b r6 = r4.c
            int r6 = r6.k
            if (r6 != r9) goto L_0x01d7
            int r6 = r3.o
            int r9 = r4.o
            if (r6 != r9) goto L_0x01eb
            int r6 = r3.p
            int r9 = r4.p
            if (r6 != r9) goto L_0x01eb
        L_0x01d7:
            boolean r6 = r3.k
            boolean r9 = r4.k
            if (r6 != r9) goto L_0x01eb
            boolean r6 = r3.k
            if (r6 == 0) goto L_0x01ed
            boolean r6 = r4.k
            if (r6 == 0) goto L_0x01ed
            int r3 = r3.l
            int r4 = r4.l
            if (r3 == r4) goto L_0x01ed
        L_0x01eb:
            r3 = 1
            goto L_0x01ee
        L_0x01ed:
            r3 = 0
        L_0x01ee:
            if (r3 == 0) goto L_0x01f1
            goto L_0x01f3
        L_0x01f1:
            r2 = 1
            goto L_0x021c
        L_0x01f3:
            boolean r3 = r1.k
            if (r3 == 0) goto L_0x020e
            long r3 = r1.f
            long r3 = r7 - r3
            int r4 = (int) r3
            int r14 = r2 + r4
            boolean r12 = r1.n
            long r2 = r1.f
            long r9 = r1.l
            long r2 = r2 - r9
            int r13 = (int) r2
            atu r9 = r1.a
            long r10 = r1.m
            r15 = 0
            r9.a(r10, r12, r13, r14, r15)
        L_0x020e:
            long r2 = r1.f
            r1.l = r2
            long r2 = r1.h
            r1.m = r2
            r2 = 0
            r1.n = r2
            r2 = 1
            r1.k = r2
        L_0x021c:
            boolean r3 = r1.n
            int r4 = r1.e
            r6 = 2
            r9 = 5
            if (r4 == r9) goto L_0x0243
            boolean r4 = r1.b
            if (r4 == 0) goto L_0x0241
            int r4 = r1.e
            if (r4 != r2) goto L_0x0241
            avr$a$a r2 = r1.j
            boolean r4 = r2.b
            if (r4 == 0) goto L_0x023d
            int r4 = r2.e
            r10 = 7
            if (r4 == r10) goto L_0x023b
            int r2 = r2.e
            if (r2 != r6) goto L_0x023d
        L_0x023b:
            r2 = 1
            goto L_0x023e
        L_0x023d:
            r2 = 0
        L_0x023e:
            if (r2 == 0) goto L_0x0241
            goto L_0x0243
        L_0x0241:
            r2 = 0
            goto L_0x0244
        L_0x0243:
            r2 = 1
        L_0x0244:
            r2 = r2 | r3
            r1.n = r2
            long r1 = r0.m
            boolean r3 = r0.l
            if (r3 == 0) goto L_0x0253
            avr$a r3 = r0.k
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x025d
        L_0x0253:
            avw r3 = r0.d
            r3.a(r5)
            avw r3 = r0.e
            r3.a(r5)
        L_0x025d:
            avw r3 = r0.f
            r3.a(r5)
            avr$a r3 = r0.k
            r3.e = r5
            r3.h = r1
            r3.f = r7
            boolean r1 = r3.b
            if (r1 == 0) goto L_0x0274
            int r1 = r3.e
            r2 = 1
            if (r1 == r2) goto L_0x0285
            goto L_0x0275
        L_0x0274:
            r2 = 1
        L_0x0275:
            boolean r1 = r3.c
            if (r1 == 0) goto L_0x0298
            int r1 = r3.e
            if (r1 == r9) goto L_0x0285
            int r1 = r3.e
            if (r1 == r2) goto L_0x0285
            int r1 = r3.e
            if (r1 != r6) goto L_0x0298
        L_0x0285:
            avr$a$a r1 = r3.i
            avr$a$a r2 = r3.j
            r3.i = r2
            r3.j = r1
            avr$a$a r1 = r3.j
            r1.a()
            r1 = 0
            r3.d = r1
            r1 = 1
            r3.g = r1
        L_0x0298:
            int r2 = r29 + 3
            r3 = r27
            r4 = r28
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avr.a(bea):void");
    }

    public final void b() {
    }
}
