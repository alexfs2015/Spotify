package defpackage;

/* renamed from: aym reason: default package */
public final class aym extends arl {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final Object k;

    public aym(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj) {
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = z;
        this.j = z2;
        this.k = obj;
    }

    private aym(long j2, long j3, long j4, long j5, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j2, j3, 0, 0, z, z2, obj);
    }

    public aym(long j2, boolean z, boolean z2) {
        this(j2, true, false, null);
    }

    public aym(long j2, boolean z, boolean z2, Object obj) {
        this(j2, j2, 0, 0, z, z2, obj);
    }

    public final int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
    }

    public final a a(int i2, a aVar, boolean z) {
        bdl.a(i2, 0, 1);
        Object obj = z ? b : null;
        long j2 = this.e;
        long j3 = -this.g;
        ayp ayp = ayp.a;
        aVar.a = null;
        aVar.b = obj;
        aVar.c = 0;
        aVar.d = j2;
        aVar.e = j3;
        aVar.f = ayp;
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r1 > r5) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.arl.b a(int r11, defpackage.arl.b r12, boolean r13, long r14) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            defpackage.bdl.a(r11, r0, r1)
            if (r13 == 0) goto L_0x000a
            java.lang.Object r11 = r10.k
            goto L_0x000b
        L_0x000a:
            r11 = 0
        L_0x000b:
            long r1 = r10.h
            boolean r13 = r10.j
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r13 == 0) goto L_0x002a
            r5 = 0
            int r13 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r13 == 0) goto L_0x002a
            long r5 = r10.f
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0024
        L_0x0022:
            r1 = r3
            goto L_0x002a
        L_0x0024:
            long r1 = r1 + r14
            int r13 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x002a
            goto L_0x0022
        L_0x002a:
            long r13 = r10.c
            long r3 = r10.d
            boolean r15 = r10.i
            boolean r5 = r10.j
            long r6 = r10.f
            long r8 = r10.g
            r12.a = r11
            r12.b = r13
            r12.c = r3
            r12.d = r15
            r12.e = r5
            r12.h = r1
            r12.i = r6
            r12.f = r0
            r12.g = r0
            r12.j = r8
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aym.a(int, arl$b, boolean, long):arl$b");
    }

    public final Object a(int i2) {
        bdl.a(i2, 0, 1);
        return b;
    }

    public final int b() {
        return 1;
    }

    public final int d() {
        return 1;
    }
}
