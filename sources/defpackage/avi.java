package defpackage;

/* renamed from: avi reason: default package */
public final class avi implements atk {
    private static final int a = ben.g("ID3");
    private final long b;
    private final avj c;
    private final bea d;
    private boolean e;

    static {
        $$Lambda$avi$BrjeHTRQHtRMHy9nMZWtMsgdy8E r0 = $$Lambda$avi$BrjeHTRQHtRMHy9nMZWtMsgdy8E.INSTANCE;
    }

    public avi() {
        this(0);
    }

    private avi(long j) {
        this.b = 0;
        this.c = new avj();
        this.d = new bea(2786);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] a() {
        return new atk[]{new avi()};
    }

    public final int a(atl atl, atr atr) {
        int a2 = atl.a(this.d.a, 0, 2786);
        if (a2 == -1) {
            return -1;
        }
        this.d.c(0);
        this.d.b(a2);
        if (!this.e) {
            this.c.a = this.b;
            this.e = true;
        }
        this.c.a(this.d);
        return 0;
    }

    public final void a(long j, long j2) {
        this.e = false;
        this.c.a();
    }

    public final void a(atm atm) {
        this.c.a(atm, new d(0, 1));
        atm.a();
        atm.a(new b(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        r8.a();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        if ((r4 - r3) < 8192) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.atl r8) {
        /*
            r7 = this;
            bea r0 = new bea
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.a
            r8.c(r4, r2, r1)
            r0.c(r2)
            int r4 = r0.f()
            int r5 = a
            if (r4 != r5) goto L_0x0028
            r4 = 3
            r0.d(r4)
            int r4 = r0.m()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.c(r4)
            goto L_0x0009
        L_0x0028:
            r8.a()
            r8.c(r3)
            r4 = r3
        L_0x002f:
            r1 = 0
        L_0x0030:
            byte[] r5 = r0.a
            r6 = 6
            r8.c(r5, r2, r6)
            r0.c(r2)
            int r5 = r0.d()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0051
            r8.a()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x004d
            return r2
        L_0x004d:
            r8.c(r4)
            goto L_0x002f
        L_0x0051:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0057
            return r5
        L_0x0057:
            byte[] r5 = r0.a
            int r5 = defpackage.aro.a(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0061
            return r2
        L_0x0061:
            int r5 = r5 + -6
            r8.c(r5)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avi.a(atl):boolean");
    }
}
