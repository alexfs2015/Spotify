package defpackage;

/* renamed from: aug reason: default package */
final class aug implements aul {
    final long a;
    final long b;
    final aun c;
    long d;
    private final auk e = new auk();
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    /* renamed from: aug$a */
    class a implements atb {
        public final boolean l_() {
            return true;
        }

        private a() {
        }

        /* synthetic */ a(aug aug, byte b) {
            this();
        }

        public final defpackage.atb.a a(long j) {
            if (j == 0) {
                return new defpackage.atb.a(new atc(0, aug.this.a));
            }
            long b = aug.this.c.b(j);
            aug aug = aug.this;
            long j2 = aug.a + (((b * (aug.b - aug.a)) / aug.d) - 30000);
            if (j2 < aug.a) {
                j2 = aug.a;
            }
            return new defpackage.atb.a(new atc(j, j2 >= aug.b ? aug.b - 1 : j2));
        }

        public final long b() {
            return aug.this.c.a(aug.this.d);
        }
    }

    public aug(long j2, long j3, aun aun, long j4, long j5, boolean z) {
        bcu.a(j2 >= 0 && j3 > j2);
        this.c = aun;
        this.a = j2;
        this.b = j3;
        if (j4 == j3 - j2 || z) {
            this.d = j5;
            this.f = 3;
            return;
        }
        this.f = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.asu r17) {
        /*
            r16 = this;
            r6 = r16
            r1 = r17
            int r0 = r6.f
            r2 = 0
            r3 = 1
            r7 = 3
            if (r0 == 0) goto L_0x0109
            if (r0 == r3) goto L_0x011e
            r3 = 2
            if (r0 == r3) goto L_0x001b
            if (r0 != r7) goto L_0x0015
            r0 = -1
            return r0
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x001b:
            long r3 = r6.h
            r8 = 2
            r10 = 0
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0029
            r7 = r8
        L_0x0026:
            r0 = 3
            goto L_0x0104
        L_0x0029:
            long r12 = r6.i
            long r14 = r6.j
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            long r2 = r6.k
        L_0x0033:
            long r2 = r2 + r8
            long r2 = -r2
        L_0x0035:
            r4 = r10
            goto L_0x00ed
        L_0x0038:
            long r12 = r17.c()
            long r14 = r6.j
            boolean r0 = r6.a(r1, r14)
            if (r0 != 0) goto L_0x0053
            long r2 = r6.i
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x004b
            goto L_0x0035
        L_0x004b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No ogg page can be found."
            r0.<init>(r1)
            throw r0
        L_0x0053:
            auk r0 = r6.e
            r0.a(r1, r2)
            r17.a()
            auk r0 = r6.e
            long r14 = r0.b
            long r3 = r3 - r14
            auk r0 = r6.e
            int r0 = r0.d
            auk r2 = r6.e
            int r2 = r2.e
            int r0 = r0 + r2
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x007d
            r14 = 72000(0x11940, double:3.55727E-319)
            int r2 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            r1.b(r0)
            auk r0 = r6.e
            long r2 = r0.b
            goto L_0x0033
        L_0x007d:
            r14 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x008d
            r6.j = r12
            auk r2 = r6.e
            long r12 = r2.b
            r6.l = r12
            goto L_0x00b1
        L_0x008d:
            long r12 = r17.c()
            long r10 = (long) r0
            long r12 = r12 + r10
            r6.i = r12
            auk r2 = r6.e
            long r12 = r2.b
            r6.k = r12
            long r12 = r6.j
            long r7 = r6.i
            long r12 = r12 - r7
            long r12 = r12 + r10
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b1
            r1.b(r0)
            long r2 = r6.k
            r4 = 2
            long r2 = r2 + r4
            long r2 = -r2
        L_0x00ae:
            r4 = 0
            goto L_0x00ed
        L_0x00b1:
            long r7 = r6.j
            long r9 = r6.i
            long r7 = r7 - r9
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x00be
            r6.j = r9
            r2 = r9
            goto L_0x00ae
        L_0x00be:
            long r7 = (long) r0
            r11 = 0
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x00c8
            r11 = 2
            goto L_0x00ca
        L_0x00c8:
            r11 = 1
        L_0x00ca:
            long r7 = r7 * r11
            long r11 = r17.c()
            long r11 = r11 - r7
            long r7 = r6.j
            long r13 = r6.i
            long r7 = r7 - r13
            long r3 = r3 * r7
            long r7 = r6.l
            long r9 = r6.k
            long r7 = r7 - r9
            long r3 = r3 / r7
            long r11 = r11 + r3
            long r2 = java.lang.Math.max(r11, r13)
            long r4 = r6.j
            r7 = 1
            long r4 = r4 - r7
            long r2 = java.lang.Math.min(r2, r4)
            goto L_0x00ae
        L_0x00ed:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00f2
            return r2
        L_0x00f2:
            long r4 = r6.h
            r7 = 2
            long r2 = r2 + r7
            long r9 = -r2
            r0 = r16
            r1 = r17
            r2 = r4
            r4 = r9
            long r10 = r0.a(r1, r2, r4)
            goto L_0x0026
        L_0x0104:
            r6.f = r0
            long r10 = r10 + r7
            long r0 = -r10
            return r0
        L_0x0109:
            long r4 = r17.c()
            r6.g = r4
            r6.f = r3
            long r3 = r6.b
            r7 = 65307(0xff1b, double:3.2266E-319)
            long r3 = r3 - r7
            long r7 = r6.g
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x011e
            return r3
        L_0x011e:
            long r3 = r6.b
            boolean r0 = r6.a(r1, r3)
            if (r0 == 0) goto L_0x015b
            auk r0 = r6.e
            r0.a()
        L_0x012b:
            auk r0 = r6.e
            int r0 = r0.a
            r3 = 4
            r0 = r0 & r3
            if (r0 == r3) goto L_0x014f
            long r3 = r17.c()
            long r7 = r6.b
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x014f
            auk r0 = r6.e
            r0.a(r1, r2)
            auk r0 = r6.e
            int r0 = r0.d
            auk r3 = r6.e
            int r3 = r3.e
            int r0 = r0 + r3
            r1.b(r0)
            goto L_0x012b
        L_0x014f:
            auk r0 = r6.e
            long r0 = r0.b
            r6.d = r0
            r0 = 3
            r6.f = r0
            long r0 = r6.g
            return r0
        L_0x015b:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            goto L_0x0162
        L_0x0161:
            throw r0
        L_0x0162:
            goto L_0x0161
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aug.a(asu):long");
    }

    public final long a_(long j2) {
        long j3;
        int i2 = this.f;
        bcu.a(i2 == 3 || i2 == 2);
        if (j2 == 0) {
            j3 = 0;
        } else {
            j3 = this.c.b(j2);
        }
        this.h = j3;
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0;
        this.l = this.d;
        return this.h;
    }

    private boolean a(asu asu, long j2) {
        int i2;
        long min = Math.min(j2 + 3, this.b);
        int i3 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i4 = 0;
            if (asu.c() + ((long) i3) > min) {
                i3 = (int) (min - asu.c());
                if (i3 < 4) {
                    return false;
                }
            }
            asu.b(bArr, 0, i3, false);
            while (true) {
                i2 = i3 - 3;
                if (i4 >= i2) {
                    break;
                } else if (bArr[i4] == 79 && bArr[i4 + 1] == 103 && bArr[i4 + 2] == 103 && bArr[i4 + 3] == 83) {
                    asu.b(i4);
                    return true;
                } else {
                    i4++;
                }
            }
            asu.b(i2);
        }
    }

    private long a(asu asu, long j2, long j3) {
        this.e.a(asu, false);
        while (this.e.b < j2) {
            asu.b(this.e.d + this.e.e);
            j3 = this.e.b;
            this.e.a(asu, false);
        }
        asu.a();
        return j3;
    }

    public final /* synthetic */ atb a() {
        if (this.d != 0) {
            return new a(this, 0);
        }
        return null;
    }
}
