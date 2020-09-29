package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: arv reason: default package */
final class arv {
    final a a;
    AudioTrack b;
    int c;
    int d;
    aru e;
    int f;
    boolean g;
    long h;
    long i;
    boolean j;
    boolean k;
    long l;
    long m;
    long n;
    long o;
    long p;
    long q;
    long r;
    private final long[] s;
    private long t;
    private long u;
    private Method v;
    private long w;
    private int x;
    private int y;

    /* renamed from: arv$a */
    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j, long j2, long j3, long j4);
    }

    public arv(a aVar) {
        this.a = (a) bdl.a(aVar);
        if (ben.a >= 18) {
            try {
                this.v = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.s = new long[10];
    }

    private void d(long j2) {
        if (this.k) {
            Method method = this.v;
            if (method != null && j2 - this.w >= 500000) {
                try {
                    this.i = (((long) ((Integer) ben.a((Integer) method.invoke(bdl.a(this.b), new Object[0]))).intValue()) * 1000) - this.h;
                    this.i = Math.max(this.i, 0);
                    if (this.i > 5000000) {
                        this.a.a(this.i);
                        this.i = 0;
                    }
                } catch (Exception unused) {
                    this.v = null;
                }
                this.w = j2;
            }
        }
    }

    private boolean e() {
        return this.g && ((AudioTrack) bdl.a(this.b)).getPlayState() == 2 && d() == 0;
    }

    private long f() {
        return c(d());
    }

    public final int a(long j2) {
        return this.d - ((int) (j2 - (d() * ((long) this.c))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(boolean r22) {
        /*
            r21 = this;
            r0 = r21
            android.media.AudioTrack r1 = r0.b
            java.lang.Object r1 = defpackage.bdl.a(r1)
            android.media.AudioTrack r1 = (android.media.AudioTrack) r1
            int r1 = r1.getPlayState()
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r1 != r4) goto L_0x014a
            long r15 = r21.f()
            r8 = 0
            int r1 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x014a
            long r10 = java.lang.System.nanoTime()
            long r13 = r10 / r2
            long r10 = r0.u
            long r10 = r13 - r10
            r17 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 < 0) goto L_0x005e
            long[] r1 = r0.s
            int r10 = r0.x
            long r11 = r15 - r13
            r1[r10] = r11
            int r10 = r10 + r7
            r1 = 10
            int r10 = r10 % r1
            r0.x = r10
            int r10 = r0.y
            if (r10 >= r1) goto L_0x0045
            int r10 = r10 + r7
            r0.y = r10
        L_0x0045:
            r0.u = r13
            r0.t = r8
            r1 = 0
        L_0x004a:
            int r8 = r0.y
            if (r1 >= r8) goto L_0x005e
            long r9 = r0.t
            long[] r11 = r0.s
            r17 = r11[r1]
            long r11 = (long) r8
            long r17 = r17 / r11
            long r9 = r9 + r17
            r0.t = r9
            int r1 = r1 + 1
            goto L_0x004a
        L_0x005e:
            boolean r1 = r0.g
            if (r1 != 0) goto L_0x014a
            aru r1 = r0.e
            java.lang.Object r1 = defpackage.bdl.a(r1)
            aru r1 = (defpackage.aru) r1
            aru$a r8 = r1.a
            if (r8 == 0) goto L_0x0102
            long r8 = r1.e
            long r8 = r13 - r8
            long r2 = r1.d
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x007a
            goto L_0x0102
        L_0x007a:
            r1.e = r13
            aru$a r2 = r1.a
            android.media.AudioTrack r3 = r2.a
            android.media.AudioTimestamp r8 = r2.b
            boolean r3 = r3.getTimestamp(r8)
            if (r3 == 0) goto L_0x00a4
            android.media.AudioTimestamp r8 = r2.b
            long r8 = r8.framePosition
            long r11 = r2.d
            int r10 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x009a
            long r10 = r2.c
            r19 = 1
            long r10 = r10 + r19
            r2.c = r10
        L_0x009a:
            r2.d = r8
            long r10 = r2.c
            r12 = 32
            long r10 = r10 << r12
            long r8 = r8 + r10
            r2.e = r8
        L_0x00a4:
            int r2 = r1.b
            if (r2 == 0) goto L_0x00db
            if (r2 == r7) goto L_0x00c6
            if (r2 == r5) goto L_0x00bf
            if (r2 == r4) goto L_0x00b8
            r11 = 4
            if (r2 != r11) goto L_0x00b2
            goto L_0x0103
        L_0x00b2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00b8:
            r11 = 4
            if (r3 == 0) goto L_0x0103
            r1.a()
            goto L_0x0103
        L_0x00bf:
            r11 = 4
            if (r3 != 0) goto L_0x0103
            r1.a()
            goto L_0x0103
        L_0x00c6:
            r11 = 4
            if (r3 == 0) goto L_0x00d7
            aru$a r2 = r1.a
            long r8 = r2.e
            long r11 = r1.f
            int r2 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0103
            r1.a(r5)
            goto L_0x0103
        L_0x00d7:
            r1.a()
            goto L_0x0103
        L_0x00db:
            if (r3 == 0) goto L_0x00f3
            aru$a r2 = r1.a
            long r8 = r2.a()
            long r10 = r1.c
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0102
            aru$a r2 = r1.a
            long r8 = r2.e
            r1.f = r8
            r1.a(r7)
            goto L_0x0103
        L_0x00f3:
            long r8 = r1.c
            long r8 = r13 - r8
            r10 = 500000(0x7a120, double:2.47033E-318)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0103
            r1.a(r4)
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            if (r3 == 0) goto L_0x0146
            long r11 = r1.b()
            long r9 = r1.c()
            long r2 = r11 - r13
            long r2 = java.lang.Math.abs(r2)
            r19 = 5000000(0x4c4b40, double:2.470328E-317)
            int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x0125
            arv$a r8 = r0.a
            r2 = 4
            r3 = r13
            r8.b(r9, r11, r13, r15)
            r1.a(r2)
            goto L_0x0147
        L_0x0125:
            r3 = r13
            r2 = 4
            long r13 = r0.c(r9)
            long r13 = r13 - r15
            long r13 = java.lang.Math.abs(r13)
            int r8 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r8 <= 0) goto L_0x013e
            arv$a r8 = r0.a
            r13 = r3
            r8.a(r9, r11, r13, r15)
            r1.a(r2)
            goto L_0x0147
        L_0x013e:
            int r8 = r1.b
            if (r8 != r2) goto L_0x0147
            r1.a()
            goto L_0x0147
        L_0x0146:
            r3 = r13
        L_0x0147:
            r0.d(r3)
        L_0x014a:
            long r1 = java.lang.System.nanoTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            aru r3 = r0.e
            java.lang.Object r3 = defpackage.bdl.a(r3)
            aru r3 = (defpackage.aru) r3
            int r4 = r3.b
            if (r4 == r7) goto L_0x0164
            int r4 = r3.b
            if (r4 != r5) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r4 = 0
            goto L_0x0165
        L_0x0164:
            r4 = 1
        L_0x0165:
            if (r4 == 0) goto L_0x017e
            long r8 = r3.c()
            long r8 = r0.c(r8)
            int r4 = r3.b
            if (r4 != r5) goto L_0x0174
            r6 = 1
        L_0x0174:
            if (r6 != 0) goto L_0x0177
            return r8
        L_0x0177:
            long r3 = r3.b()
            long r1 = r1 - r3
            long r8 = r8 + r1
            return r8
        L_0x017e:
            int r3 = r0.y
            if (r3 != 0) goto L_0x0187
            long r1 = r21.f()
            goto L_0x018a
        L_0x0187:
            long r3 = r0.t
            long r1 = r1 + r3
        L_0x018a:
            if (r22 != 0) goto L_0x018f
            long r3 = r0.i
            long r1 = r1 - r3
        L_0x018f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arv.a(boolean):long");
    }

    public final boolean a() {
        return ((AudioTrack) bdl.a(this.b)).getPlayState() == 3;
    }

    public final void b() {
        c();
        this.b = null;
        this.e = null;
    }

    public final boolean b(long j2) {
        return j2 > d() || e();
    }

    /* access modifiers changed from: 0000 */
    public long c(long j2) {
        return (j2 * 1000000) / ((long) this.f);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.t = 0;
        this.y = 0;
        this.x = 0;
        this.u = 0;
    }

    /* access modifiers changed from: 0000 */
    public long d() {
        AudioTrack audioTrack = (AudioTrack) bdl.a(this.b);
        if (this.o != -9223372036854775807L) {
            return Math.min(this.r, this.q + ((((SystemClock.elapsedRealtime() * 1000) - this.o) * ((long) this.f)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.n = this.l;
            }
            playbackHeadPosition += this.n;
        }
        if (ben.a <= 28) {
            if (playbackHeadPosition == 0 && this.l > 0 && playState == 3) {
                if (this.p == -9223372036854775807L) {
                    this.p = SystemClock.elapsedRealtime();
                }
                return this.l;
            }
            this.p = -9223372036854775807L;
        }
        if (this.l > playbackHeadPosition) {
            this.m++;
        }
        this.l = playbackHeadPosition;
        return playbackHeadPosition + (this.m << 32);
    }
}
