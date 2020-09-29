package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;

/* renamed from: atv reason: default package */
public final class atv implements atk {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = ben.c("#!AMR\n");
    private static final byte[] d = ben.c("#!AMR-WB\n");
    private static final int e = b[8];
    private final byte[] f;
    private final int g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private boolean l;
    private long m;
    private int n;
    private int o;
    private long p;
    private atm q;
    private atu r;
    private ats s;
    private boolean t;

    static {
        $$Lambda$atv$AaXSem92_FB4e4dvMAysGUKSssY r0 = $$Lambda$atv$AaXSem92_FB4e4dvMAysGUKSssY.INSTANCE;
    }

    public atv() {
        this(0);
    }

    public atv(int i2) {
        this.g = i2;
        this.f = new byte[1];
        this.n = -1;
    }

    private static boolean a(atl atl, byte[] bArr) {
        atl.a();
        byte[] bArr2 = new byte[bArr.length];
        atl.c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] a() {
        return new atk[]{new atv()};
    }

    private boolean b(atl atl) {
        if (a(atl, c)) {
            this.h = false;
            atl.b(c.length);
            return true;
        } else if (!a(atl, d)) {
            return false;
        } else {
            this.h = true;
            atl.b(d.length);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if ((!r11.h && (r0 < 12 || r0 > 14)) != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A[Catch:{ EOFException -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A[Catch:{ EOFException -> 0x00ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c(defpackage.atl r12) {
        /*
            r11 = this;
            int r0 = r11.k
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x00ae
            r12.a()     // Catch:{ EOFException -> 0x00ad }
            byte[] r0 = r11.f     // Catch:{ EOFException -> 0x00ad }
            r12.c(r0, r3, r2)     // Catch:{ EOFException -> 0x00ad }
            byte[] r0 = r11.f     // Catch:{ EOFException -> 0x00ad }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x00ad }
            r4 = r0 & 131(0x83, float:1.84E-43)
            if (r4 > 0) goto L_0x0099
            int r0 = r0 >> 3
            r4 = 15
            r0 = r0 & r4
            if (r0 < 0) goto L_0x0044
            if (r0 > r4) goto L_0x0044
            boolean r4 = r11.h     // Catch:{ EOFException -> 0x00ad }
            if (r4 == 0) goto L_0x002e
            r4 = 10
            if (r0 < r4) goto L_0x002c
            r4 = 13
            if (r0 <= r4) goto L_0x002e
        L_0x002c:
            r4 = 1
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            if (r4 != 0) goto L_0x0042
            boolean r4 = r11.h     // Catch:{ EOFException -> 0x00ad }
            if (r4 != 0) goto L_0x003f
            r4 = 12
            if (r0 < r4) goto L_0x003d
            r4 = 14
            if (r0 <= r4) goto L_0x003f
        L_0x003d:
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r4 == 0) goto L_0x0044
        L_0x0042:
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 != 0) goto L_0x006c
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException     // Catch:{ EOFException -> 0x00ad }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00ad }
            java.lang.String r3 = "Illegal AMR "
            r2.<init>(r3)     // Catch:{ EOFException -> 0x00ad }
            boolean r3 = r11.h     // Catch:{ EOFException -> 0x00ad }
            if (r3 == 0) goto L_0x0057
            java.lang.String r3 = "WB"
            goto L_0x0059
        L_0x0057:
            java.lang.String r3 = "NB"
        L_0x0059:
            r2.append(r3)     // Catch:{ EOFException -> 0x00ad }
            java.lang.String r3 = " frame type "
            r2.append(r3)     // Catch:{ EOFException -> 0x00ad }
            r2.append(r0)     // Catch:{ EOFException -> 0x00ad }
            java.lang.String r0 = r2.toString()     // Catch:{ EOFException -> 0x00ad }
            r12.<init>(r0)     // Catch:{ EOFException -> 0x00ad }
            throw r12     // Catch:{ EOFException -> 0x00ad }
        L_0x006c:
            boolean r4 = r11.h     // Catch:{ EOFException -> 0x00ad }
            if (r4 == 0) goto L_0x0075
            int[] r4 = b     // Catch:{ EOFException -> 0x00ad }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x00ad }
            goto L_0x0079
        L_0x0075:
            int[] r4 = a     // Catch:{ EOFException -> 0x00ad }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x00ad }
        L_0x0079:
            r11.j = r0     // Catch:{ EOFException -> 0x00ad }
            int r0 = r11.j
            r11.k = r0
            int r0 = r11.n
            if (r0 != r1) goto L_0x008d
            long r4 = r12.c()
            r11.m = r4
            int r0 = r11.j
            r11.n = r0
        L_0x008d:
            int r0 = r11.n
            int r4 = r11.j
            if (r0 != r4) goto L_0x00ae
            int r0 = r11.o
            int r0 = r0 + r2
            r11.o = r0
            goto L_0x00ae
        L_0x0099:
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException     // Catch:{ EOFException -> 0x00ad }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00ad }
            java.lang.String r3 = "Invalid padding bits for frame header "
            r2.<init>(r3)     // Catch:{ EOFException -> 0x00ad }
            r2.append(r0)     // Catch:{ EOFException -> 0x00ad }
            java.lang.String r0 = r2.toString()     // Catch:{ EOFException -> 0x00ad }
            r12.<init>(r0)     // Catch:{ EOFException -> 0x00ad }
            throw r12     // Catch:{ EOFException -> 0x00ad }
        L_0x00ad:
            return r1
        L_0x00ae:
            atu r0 = r11.r
            int r4 = r11.k
            int r12 = r0.a(r12, r4, r2)
            if (r12 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            int r0 = r11.k
            int r0 = r0 - r12
            r11.k = r0
            int r12 = r11.k
            if (r12 <= 0) goto L_0x00c3
            return r3
        L_0x00c3:
            atu r4 = r11.r
            long r0 = r11.p
            long r5 = r11.i
            long r5 = r5 + r0
            r7 = 1
            int r8 = r11.j
            r9 = 0
            r10 = 0
            r4.a(r5, r7, r8, r9, r10)
            long r0 = r11.i
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.i = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atv.c(atl):int");
    }

    public final int a(atl atl, atr atr) {
        if (atl.c() != 0 || b(atl)) {
            if (!this.t) {
                this.t = true;
                this.r.a(aqv.a((String) null, this.h ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, e, 1, this.h ? 16000 : 8000, -1, null, (ast) null, 0, (String) null));
            }
            int c2 = c(atl);
            long d2 = atl.d();
            if (!this.l) {
                if (!((this.g & 1) == 0 || d2 == -1)) {
                    int i2 = this.n;
                    if (i2 == -1 || i2 == this.j) {
                        if (this.o >= 20 || c2 == -1) {
                            int i3 = this.n;
                            atg atg = new atg(d2, this.m, (int) ((((long) (i3 << 3)) * 1000000) / 20000), i3);
                            this.s = atg;
                            this.q.a(this.s);
                            this.l = true;
                        }
                    }
                }
                this.s = new b(-9223372036854775807L);
                this.q.a(this.s);
                this.l = true;
            }
            return c2;
        }
        throw new ParserException("Could not find AMR header.");
    }

    public final void a(long j2, long j3) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        if (j2 != 0) {
            ats ats = this.s;
            if (ats instanceof atg) {
                this.p = ((atg) ats).b(j2);
                return;
            }
        }
        this.p = 0;
    }

    public final void a(atm atm) {
        this.q = atm;
        this.r = atm.a(0, 1);
        atm.a();
    }

    public final boolean a(atl atl) {
        return b(atl);
    }
}
