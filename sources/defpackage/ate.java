package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;

/* renamed from: ate reason: default package */
public final class ate implements ast {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = bdw.c("#!AMR\n");
    private static final byte[] d = bdw.c("#!AMR-WB\n");
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
    private asv q;
    private atd r;
    private atb s;
    private boolean t;

    static {
        $$Lambda$ate$VxTj5c07OnSsMV_3p07DAktee9M r0 = $$Lambda$ate$VxTj5c07OnSsMV_3p07DAktee9M.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] a() {
        return new ast[]{new ate()};
    }

    public ate() {
        this(0);
    }

    public ate(int i2) {
        this.g = i2;
        this.f = new byte[1];
        this.n = -1;
    }

    public final boolean a(asu asu) {
        return b(asu);
    }

    public final void a(asv asv) {
        this.q = asv;
        this.r = asv.a(0, 1);
        asv.a();
    }

    public final int a(asu asu, ata ata) {
        if (asu.c() != 0 || b(asu)) {
            if (!this.t) {
                this.t = true;
                this.r.a(aqe.a((String) null, this.h ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, e, 1, this.h ? 16000 : 8000, -1, null, (asc) null, 0, (String) null));
            }
            int c2 = c(asu);
            long d2 = asu.d();
            if (!this.l) {
                if (!((this.g & 1) == 0 || d2 == -1)) {
                    int i2 = this.n;
                    if (i2 == -1 || i2 == this.j) {
                        if (this.o >= 20 || c2 == -1) {
                            int i3 = this.n;
                            asp asp = new asp(d2, this.m, (int) ((((long) (i3 << 3)) * 1000000) / 20000), i3);
                            this.s = asp;
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
            atb atb = this.s;
            if (atb instanceof asp) {
                this.p = ((asp) atb).b(j2);
                return;
            }
        }
        this.p = 0;
    }

    private boolean b(asu asu) {
        if (a(asu, c)) {
            this.h = false;
            asu.b(c.length);
            return true;
        } else if (!a(asu, d)) {
            return false;
        } else {
            this.h = true;
            asu.b(d.length);
            return true;
        }
    }

    private static boolean a(asu asu, byte[] bArr) {
        asu.a();
        byte[] bArr2 = new byte[bArr.length];
        asu.c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if ((!r11.h && (r0 < 12 || r0 > 14)) != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A[Catch:{ EOFException -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A[Catch:{ EOFException -> 0x00ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c(defpackage.asu r12) {
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
            atd r0 = r11.r
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
            atd r4 = r11.r
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ate.c(asu):int");
    }
}
