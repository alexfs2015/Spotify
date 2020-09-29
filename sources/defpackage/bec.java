package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: bec reason: default package */
public class bec extends MediaCodecRenderer {
    private static final int[] l = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean m;
    private static boolean n;
    private int A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private int F;
    private int G;
    private int H;
    private long I;
    private int J;
    private float K;
    private int L;
    private int M;
    private int N;
    private float O;
    private int P;
    private int Q;
    private int R;
    private float S;
    private boolean T;
    private int U;
    private long V;
    private long W;
    private int X;
    private bed Y;
    b k;
    private final Context o;
    private final bee p = new bee(this.o);
    private final defpackage.beg.a q;
    private final long r;
    private final int s;
    private final boolean t;
    private final long[] u;
    private final long[] v;
    private a w;
    private boolean x;
    private Surface y;
    private Surface z;

    /* renamed from: bec$a */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* renamed from: bec$b */
    final class b implements OnFrameRenderedListener {
        /* synthetic */ b(bec bec, MediaCodec mediaCodec, byte b) {
            this(mediaCodec);
        }

        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (this == bec.this.k) {
                bec.this.e(j);
            }
        }
    }

    private static boolean f(long j) {
        return j < -30000;
    }

    public bec(Context context, avy avy, long j, asd<ash> asd, boolean z2, Handler handler, beg beg, int i) {
        boolean z3;
        super(2, avy, asd, z2, 30.0f);
        this.r = j;
        this.s = i;
        this.o = context.getApplicationContext();
        this.q = new defpackage.beg.a(handler, beg);
        if (bdw.a <= 22) {
            if ("foster".equals(bdw.b)) {
                if ("NVIDIA".equals(bdw.c)) {
                    z3 = true;
                    this.t = z3;
                    this.u = new long[10];
                    this.v = new long[10];
                    this.W = -9223372036854775807L;
                    this.V = -9223372036854775807L;
                    this.D = -9223372036854775807L;
                    this.L = -1;
                    this.M = -1;
                    this.O = -1.0f;
                    this.K = -1.0f;
                    this.A = 1;
                    A();
                }
            }
        }
        z3 = false;
        this.t = z3;
        this.u = new long[10];
        this.v = new long[10];
        this.W = -9223372036854775807L;
        this.V = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.L = -1;
        this.M = -1;
        this.O = -1.0f;
        this.K = -1.0f;
        this.A = 1;
        A();
    }

    public final int a(avy avy, asd<ash> asd, aqe aqe) {
        boolean z2;
        int i = 0;
        if (!bdg.b(aqe.f)) {
            return 0;
        }
        asc asc = aqe.i;
        if (asc != null) {
            z2 = false;
            for (int i2 = 0; i2 < asc.c; i2++) {
                z2 |= asc.a[i2].d;
            }
        } else {
            z2 = false;
        }
        List a2 = avy.a(aqe.f, z2);
        if (a2.isEmpty()) {
            if (!z2 || avy.a(aqe.f, false).isEmpty()) {
                return 1;
            }
            return 2;
        } else if (!a(asd, asc)) {
            return 2;
        } else {
            avx avx = (avx) a2.get(0);
            boolean a3 = avx.a(aqe);
            int i3 = avx.b(aqe) ? 16 : 8;
            if (avx.d) {
                i = 32;
            }
            return (a3 ? 4 : 3) | i3 | i;
        }
    }

    public final void a(boolean z2) {
        super.a(z2);
        this.U = this.a.b;
        this.T = this.U != 0;
        this.q.a(this.j);
        bee bee = this.p;
        bee.i = false;
        if (bee.a != null) {
            bee.b.b.sendEmptyMessage(1);
            if (bee.c != null) {
                a aVar = bee.c;
                aVar.a.registerDisplayListener(aVar, null);
            }
            bee.a();
        }
    }

    public final void a(aqe[] aqeArr, long j) {
        if (this.W == -9223372036854775807L) {
            this.W = j;
        } else {
            int i = this.X;
            if (i == 10) {
                StringBuilder sb = new StringBuilder("Too many stream changes, so dropping offset: ");
                sb.append(this.u[this.X - 1]);
                bdd.c("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.X = i + 1;
            }
            long[] jArr = this.u;
            int i2 = this.X;
            jArr[i2 - 1] = j;
            this.v[i2 - 1] = this.V;
        }
        super.a(aqeArr, j);
    }

    public final void a(long j, boolean z2) {
        super.a(j, z2);
        y();
        this.C = -9223372036854775807L;
        this.G = 0;
        this.V = -9223372036854775807L;
        int i = this.X;
        if (i != 0) {
            this.W = this.u[i - 1];
            this.X = 0;
        }
        if (z2) {
            x();
        } else {
            this.D = -9223372036854775807L;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r9.T != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9.y == r0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r9 = this;
            boolean r0 = super.q()
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0023
            boolean r0 = r9.B
            if (r0 != 0) goto L_0x0020
            android.view.Surface r0 = r9.z
            if (r0 == 0) goto L_0x0018
            android.view.Surface r4 = r9.y
            if (r4 == r0) goto L_0x0020
        L_0x0018:
            android.media.MediaCodec r0 = r9.h
            if (r0 == 0) goto L_0x0020
            boolean r0 = r9.T
            if (r0 == 0) goto L_0x0023
        L_0x0020:
            r9.D = r2
            return r1
        L_0x0023:
            long r4 = r9.D
            r0 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x002b
            return r0
        L_0x002b:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r9.D
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            r9.D = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bec.q():boolean");
    }

    public final void n() {
        super.n();
        this.F = 0;
        this.E = SystemClock.elapsedRealtime();
        this.I = SystemClock.elapsedRealtime() * 1000;
    }

    public final void o() {
        this.D = -9223372036854775807L;
        D();
        super.o();
    }

    public final void p() {
        this.L = -1;
        this.M = -1;
        this.O = -1.0f;
        this.K = -1.0f;
        this.W = -9223372036854775807L;
        this.V = -9223372036854775807L;
        this.X = 0;
        A();
        y();
        bee bee = this.p;
        if (bee.a != null) {
            if (bee.c != null) {
                a aVar = bee.c;
                aVar.a.unregisterDisplayListener(aVar);
            }
            bee.b.b.sendEmptyMessage(2);
        }
        this.k = null;
        this.T = false;
        try {
            super.p();
        } finally {
            this.q.b(this.j);
        }
    }

    public void handleMessage(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.z;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    avx avx = this.i;
                    if (avx != null && b(avx)) {
                        this.z = bea.a(this.o, avx.e);
                        surface = this.z;
                    }
                }
            }
            if (this.y != surface) {
                this.y = surface;
                int i2 = this.c;
                if (i2 == 1 || i2 == 2) {
                    MediaCodec mediaCodec = this.h;
                    if (bdw.a < 23 || mediaCodec == null || surface == null || this.x) {
                        v();
                        t();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.z) {
                    A();
                    y();
                } else {
                    C();
                    y();
                    if (i2 == 2) {
                        x();
                    }
                }
            } else if (!(surface == null || surface == this.z)) {
                C();
                if (this.B) {
                    this.q.a(this.y);
                }
            }
        } else if (i == 4) {
            this.A = ((Integer) obj).intValue();
            MediaCodec mediaCodec2 = this.h;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(this.A);
            }
        } else if (i == 6) {
            this.Y = (bed) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    public final boolean a(avx avx) {
        return this.y != null || b(avx);
    }

    public final boolean u() {
        return this.T;
    }

    public final int a(avx avx, aqe aqe, aqe aqe2) {
        if (!avx.a(aqe, aqe2, true) || aqe2.k > this.w.a || aqe2.l > this.w.b || b(avx, aqe2) > this.w.c) {
            return 0;
        }
        if (aqe.b(aqe2)) {
            return 1;
        }
        return 3;
    }

    public final void v() {
        try {
            super.v();
        } finally {
            this.H = 0;
            Surface surface = this.z;
            if (surface != null) {
                if (this.y == surface) {
                    this.y = null;
                }
                this.z.release();
                this.z = null;
            }
        }
    }

    public final void w() {
        super.w();
        this.H = 0;
    }

    public final float a(float f, aqe[] aqeArr) {
        float f2 = -1.0f;
        for (aqe aqe : aqeArr) {
            float f3 = aqe.m;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    public final void a(String str, long j, long j2) {
        this.q.a(str, j, j2);
        this.x = a(str);
    }

    public final void b(aqe aqe) {
        super.b(aqe);
        this.q.a(aqe);
        this.K = aqe.o;
        this.J = aqe.n;
    }

    public final void a(arv arv) {
        this.H++;
        this.V = Math.max(arv.d, this.V);
        if (bdw.a < 23 && this.T) {
            e(arv.d);
        }
    }

    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        String str = "crop-right";
        String str2 = "crop-top";
        String str3 = "crop-bottom";
        String str4 = "crop-left";
        boolean z2 = mediaFormat.containsKey(str) && mediaFormat.containsKey(str4) && mediaFormat.containsKey(str3) && mediaFormat.containsKey(str2);
        if (z2) {
            i = (mediaFormat.getInteger(str) - mediaFormat.getInteger(str4)) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z2) {
            i2 = (mediaFormat.getInteger(str3) - mediaFormat.getInteger(str2)) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        a(mediaCodec, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if ((f(r11) && r15 - r0.I > 100000) != false) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r24, long r26, android.media.MediaCodec r28, java.nio.ByteBuffer r29, int r30, int r31, long r32, boolean r34, defpackage.aqe r35) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r3 = r28
            r4 = r30
            r5 = r32
            long r7 = r0.C
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0017
            r0.C = r1
        L_0x0017:
            r7 = 1
            if (r34 == 0) goto L_0x001e
            r0.a(r3, r4)
            return r7
        L_0x001e:
            long r11 = r5 - r1
            android.view.Surface r8 = r0.y
            android.view.Surface r13 = r0.z
            r14 = 0
            if (r8 != r13) goto L_0x0032
            boolean r1 = f(r11)
            if (r1 == 0) goto L_0x0031
            r0.a(r3, r4)
            return r7
        L_0x0031:
            return r14
        L_0x0032:
            long r15 = android.os.SystemClock.elapsedRealtime()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 * r17
            int r8 = r0.c
            r13 = 2
            if (r8 != r13) goto L_0x0041
            r8 = 1
            goto L_0x0042
        L_0x0041:
            r8 = 0
        L_0x0042:
            boolean r13 = r0.B
            if (r13 == 0) goto L_0x0190
            if (r8 == 0) goto L_0x0060
            long r9 = r0.I
            long r9 = r15 - r9
            boolean r13 = f(r11)
            if (r13 == 0) goto L_0x005b
            r19 = 100000(0x186a0, double:4.94066E-319)
            int r13 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r13 <= 0) goto L_0x005b
            r9 = 1
            goto L_0x005c
        L_0x005b:
            r9 = 0
        L_0x005c:
            if (r9 == 0) goto L_0x0060
            goto L_0x0190
        L_0x0060:
            if (r8 == 0) goto L_0x018e
            long r8 = r0.C
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x006a
            goto L_0x018e
        L_0x006a:
            long r15 = r15 - r26
            long r11 = r11 - r15
            long r8 = java.lang.System.nanoTime()
            long r11 = r11 * r17
            long r11 = r11 + r8
            bee r10 = r0.p
            r26 = r8
            long r7 = r5 * r17
            boolean r9 = r10.i
            if (r9 == 0) goto L_0x00c2
            long r14 = r10.f
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x008f
            long r13 = r10.l
            r15 = 1
            long r13 = r13 + r15
            r10.l = r13
            long r13 = r10.h
            r10.g = r13
        L_0x008f:
            long r13 = r10.l
            r15 = 6
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x00b9
            long r13 = r10.k
            long r13 = r7 - r13
            long r1 = r10.l
            long r13 = r13 / r1
            long r1 = r10.g
            long r1 = r1 + r13
            boolean r9 = r10.a(r1, r11)
            if (r9 == 0) goto L_0x00ab
            r9 = 0
            r10.i = r9
            goto L_0x00c2
        L_0x00ab:
            r9 = 0
            long r13 = r10.j
            long r13 = r13 + r1
            r34 = r1
            long r1 = r10.k
            long r1 = r13 - r1
            r13 = r1
            r1 = r34
            goto L_0x00c4
        L_0x00b9:
            r9 = 0
            boolean r1 = r10.a(r7, r11)
            if (r1 == 0) goto L_0x00c2
            r10.i = r9
        L_0x00c2:
            r1 = r7
            r13 = r11
        L_0x00c4:
            boolean r9 = r10.i
            if (r9 != 0) goto L_0x00d3
            r10.k = r7
            r10.j = r11
            r7 = 0
            r10.l = r7
            r7 = 1
            r10.i = r7
        L_0x00d3:
            r10.f = r5
            r10.h = r1
            bee$b r1 = r10.b
            if (r1 == 0) goto L_0x0112
            long r1 = r10.d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00e7
            goto L_0x0112
        L_0x00e7:
            bee$b r1 = r10.b
            long r1 = r1.a
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00f0
            goto L_0x0112
        L_0x00f0:
            long r5 = r10.d
            long r7 = r13 - r1
            long r7 = r7 / r5
            long r7 = r7 * r5
            long r1 = r1 + r7
            int r7 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r7 > 0) goto L_0x0104
            long r5 = r1 - r5
            r21 = r1
            r1 = r5
            r5 = r21
            goto L_0x0105
        L_0x0104:
            long r5 = r5 + r1
        L_0x0105:
            long r7 = r5 - r13
            long r13 = r13 - r1
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r5 = r1
        L_0x010e:
            long r1 = r10.e
            long r13 = r5 - r1
        L_0x0112:
            long r1 = r13 - r26
            long r1 = r1 / r17
            r5 = -500000(0xfffffffffff85ee0, double:NaN)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x011f
            r5 = 1
            goto L_0x0120
        L_0x011f:
            r5 = 0
        L_0x0120:
            if (r5 == 0) goto L_0x0140
            int r5 = r23.b(r24)
            if (r5 != 0) goto L_0x012a
            r5 = 0
            goto L_0x013c
        L_0x012a:
            aru r6 = r0.j
            int r7 = r6.i
            r8 = 1
            int r7 = r7 + r8
            r6.i = r7
            int r6 = r0.H
            int r6 = r6 + r5
            r0.b(r6)
            r23.w()
            r5 = 1
        L_0x013c:
            if (r5 == 0) goto L_0x0140
            r5 = 0
            return r5
        L_0x0140:
            r5 = 0
            boolean r6 = f(r1)
            if (r6 == 0) goto L_0x0157
            java.lang.String r1 = "dropVideoBuffer"
            defpackage.bdu.a(r1)
            r3.releaseOutputBuffer(r4, r5)
            defpackage.bdu.a()
            r5 = 1
            r0.b(r5)
            return r5
        L_0x0157:
            r5 = 1
            int r6 = defpackage.bdw.a
            r7 = 21
            if (r6 < r7) goto L_0x0169
            r6 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x018c
            r0.a(r3, r4, r13)
            return r5
        L_0x0169:
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x018c
            r5 = 11000(0x2af8, double:5.4347E-320)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0187
            r5 = 10000(0x2710, double:4.9407E-320)
            long r1 = r1 - r5
            long r1 = r1 / r17
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x017e }
            goto L_0x0187
        L_0x017e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
        L_0x0187:
            r0.b(r3, r4)
            r1 = 1
            return r1
        L_0x018c:
            r1 = 0
            return r1
        L_0x018e:
            r1 = 0
            return r1
        L_0x0190:
            long r1 = java.lang.System.nanoTime()
            int r5 = defpackage.bdw.a
            r6 = 21
            if (r5 < r6) goto L_0x019e
            r0.a(r3, r4, r1)
            goto L_0x01a1
        L_0x019e:
            r0.b(r3, r4)
        L_0x01a1:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bec.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, aqe):boolean");
    }

    private void a(MediaCodec mediaCodec, int i, int i2) {
        this.L = i;
        this.M = i2;
        this.O = this.K;
        if (bdw.a >= 21) {
            int i3 = this.J;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.L;
                this.L = this.M;
                this.M = i4;
                this.O = 1.0f / this.O;
            }
        } else {
            this.N = this.J;
        }
        mediaCodec.setVideoScalingMode(this.A);
    }

    /* access modifiers changed from: protected */
    public final void e(long j) {
        aqe d = d(j);
        if (d != null) {
            a(this.h, d.k, d.l);
        }
        B();
        z();
        c(j);
    }

    public final void c(long j) {
        this.H--;
        while (true) {
            int i = this.X;
            if (i != 0 && j >= this.v[0]) {
                long[] jArr = this.u;
                this.W = jArr[0];
                this.X = i - 1;
                System.arraycopy(jArr, 1, jArr, 0, this.X);
                long[] jArr2 = this.v;
                System.arraycopy(jArr2, 1, jArr2, 0, this.X);
            } else {
                return;
            }
        }
    }

    private void a(MediaCodec mediaCodec, int i) {
        bdu.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        bdu.a();
        this.j.f++;
    }

    private void b(int i) {
        this.j.g += i;
        this.F += i;
        this.G += i;
        this.j.h = Math.max(this.G, this.j.h);
        int i2 = this.s;
        if (i2 > 0 && this.F >= i2) {
            D();
        }
    }

    private void b(MediaCodec mediaCodec, int i) {
        B();
        bdu.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        bdu.a();
        this.I = SystemClock.elapsedRealtime() * 1000;
        this.j.e++;
        this.G = 0;
        z();
    }

    private void a(MediaCodec mediaCodec, int i, long j) {
        B();
        bdu.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        bdu.a();
        this.I = SystemClock.elapsedRealtime() * 1000;
        this.j.e++;
        this.G = 0;
        z();
    }

    private boolean b(avx avx) {
        return bdw.a >= 23 && !this.T && !a(avx.a) && (!avx.e || bea.a(this.o));
    }

    private void x() {
        this.D = this.r > 0 ? SystemClock.elapsedRealtime() + this.r : -9223372036854775807L;
    }

    private void y() {
        this.B = false;
        if (bdw.a >= 23 && this.T) {
            MediaCodec mediaCodec = this.h;
            if (mediaCodec != null) {
                this.k = new b(this, mediaCodec, 0);
            }
        }
    }

    private void z() {
        if (!this.B) {
            this.B = true;
            this.q.a(this.y);
        }
    }

    private void A() {
        this.P = -1;
        this.Q = -1;
        this.S = -1.0f;
        this.R = -1;
    }

    private void B() {
        if (this.L != -1 || this.M != -1) {
            if (this.P != this.L || this.Q != this.M || this.R != this.N || this.S != this.O) {
                this.q.a(this.L, this.M, this.N, this.O);
                this.P = this.L;
                this.Q = this.M;
                this.R = this.N;
                this.S = this.O;
            }
        }
    }

    private void C() {
        if (this.P != -1 || this.Q != -1) {
            this.q.a(this.P, this.Q, this.R, this.S);
        }
    }

    private void D() {
        if (this.F > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.q.a(this.F, elapsedRealtime - this.E);
            this.F = 0;
            this.E = elapsedRealtime;
        }
    }

    private static Point a(avx avx, aqe aqe) {
        int i = 0;
        boolean z2 = aqe.l > aqe.k;
        int i2 = z2 ? aqe.l : aqe.k;
        int i3 = z2 ? aqe.k : aqe.l;
        float f = ((float) i3) / ((float) i2);
        int[] iArr = l;
        while (true) {
            Point point = null;
            if (i >= 9) {
                break;
            }
            int i4 = iArr[i];
            int i5 = (int) (((float) i4) * f);
            if (i4 <= i2 || i5 <= i3) {
                break;
            }
            if (bdw.a >= 21) {
                int i6 = z2 ? i5 : i4;
                if (!z2) {
                    i4 = i5;
                }
                if (avx.c == null) {
                    avx.a("align.caps");
                } else {
                    VideoCapabilities videoCapabilities = avx.c.getVideoCapabilities();
                    if (videoCapabilities == null) {
                        avx.a("align.vCaps");
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(bdw.a(i6, widthAlignment) * widthAlignment, bdw.a(i4, heightAlignment) * heightAlignment);
                    }
                }
                if (avx.a(point.x, point.y, (double) aqe.m)) {
                    return point;
                }
            } else {
                int a2 = bdw.a(i4, 16) << 4;
                int a3 = bdw.a(i5, 16) << 4;
                if (a2 * a3 <= MediaCodecUtil.b()) {
                    int i7 = z2 ? a3 : a2;
                    if (!z2) {
                        a2 = a3;
                    }
                    return new Point(i7, a2);
                }
            }
            i++;
        }
        return null;
    }

    private static int b(avx avx, aqe aqe) {
        if (aqe.g == -1) {
            return a(avx, aqe.f, aqe.k, aqe.l);
        }
        int i = 0;
        for (int i2 = 0; i2 < aqe.h.size(); i2++) {
            i += ((byte[]) aqe.h.get(i2)).length;
        }
        return aqe.g + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r7.e != false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(defpackage.avx r7, java.lang.String r8, int r9, int r10) {
        /*
            r0 = -1
            if (r9 == r0) goto L_0x00a9
            if (r10 != r0) goto L_0x0007
            goto L_0x00a9
        L_0x0007:
            int r1 = r8.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 0
            goto L_0x0051
        L_0x0050:
            r8 = -1
        L_0x0051:
            if (r8 == 0) goto L_0x00a0
            if (r8 == r3) goto L_0x00a0
            if (r8 == r6) goto L_0x0061
            if (r8 == r4) goto L_0x00a0
            if (r8 == r5) goto L_0x005e
            if (r8 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r9 = r9 * r10
            goto L_0x00a3
        L_0x0061:
            java.lang.String r8 = defpackage.bdw.d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009f
            java.lang.String r8 = defpackage.bdw.c
            java.lang.String r1 = "Amazon"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008e
            java.lang.String r8 = defpackage.bdw.d
            java.lang.String r1 = "KFSOWI"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009f
            java.lang.String r8 = defpackage.bdw.d
            java.lang.String r1 = "AFTS"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008e
            boolean r7 = r7.e
            if (r7 == 0) goto L_0x008e
            goto L_0x009f
        L_0x008e:
            r7 = 16
            int r8 = defpackage.bdw.a(r9, r7)
            int r7 = defpackage.bdw.a(r10, r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r9 = r7 << 4
            goto L_0x00a2
        L_0x009f:
            return r0
        L_0x00a0:
            int r9 = r9 * r10
        L_0x00a2:
            r5 = 2
        L_0x00a3:
            int r9 = r9 * 3
            int r5 = r5 * 2
            int r9 = r9 / r5
            return r9
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bec.a(avx, java.lang.String, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:366:0x059a, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x059b, code lost:
        switch(r1) {
            case 0: goto L_0x059f;
            case 1: goto L_0x059f;
            case 2: goto L_0x059f;
            case 3: goto L_0x059f;
            case 4: goto L_0x059f;
            case 5: goto L_0x059f;
            case 6: goto L_0x059f;
            case 7: goto L_0x059f;
            case 8: goto L_0x059f;
            case 9: goto L_0x059f;
            case 10: goto L_0x059f;
            case 11: goto L_0x059f;
            case 12: goto L_0x059f;
            case 13: goto L_0x059f;
            case 14: goto L_0x059f;
            case 15: goto L_0x059f;
            case 16: goto L_0x059f;
            case 17: goto L_0x059f;
            case 18: goto L_0x059f;
            case 19: goto L_0x059f;
            case 20: goto L_0x059f;
            case 21: goto L_0x059f;
            case 22: goto L_0x059f;
            case 23: goto L_0x059f;
            case 24: goto L_0x059f;
            case 25: goto L_0x059f;
            case 26: goto L_0x059f;
            case 27: goto L_0x059f;
            case 28: goto L_0x059f;
            case 29: goto L_0x059f;
            case 30: goto L_0x059f;
            case 31: goto L_0x059f;
            case 32: goto L_0x059f;
            case 33: goto L_0x059f;
            case 34: goto L_0x059f;
            case 35: goto L_0x059f;
            case 36: goto L_0x059f;
            case 37: goto L_0x059f;
            case 38: goto L_0x059f;
            case 39: goto L_0x059f;
            case 40: goto L_0x059f;
            case 41: goto L_0x059f;
            case 42: goto L_0x059f;
            case 43: goto L_0x059f;
            case 44: goto L_0x059f;
            case 45: goto L_0x059f;
            case 46: goto L_0x059f;
            case 47: goto L_0x059f;
            case 48: goto L_0x059f;
            case 49: goto L_0x059f;
            case 50: goto L_0x059f;
            case 51: goto L_0x059f;
            case 52: goto L_0x059f;
            case 53: goto L_0x059f;
            case 54: goto L_0x059f;
            case 55: goto L_0x059f;
            case 56: goto L_0x059f;
            case 57: goto L_0x059f;
            case 58: goto L_0x059f;
            case 59: goto L_0x059f;
            case eu.b.bo :int: goto L_0x059f;
            case eu.b.bp :int: goto L_0x059f;
            case eu.b.bq :int: goto L_0x059f;
            case eu.b.br :int: goto L_0x059f;
            case eu.b.bs :int: goto L_0x059f;
            case eu.b.bt :int: goto L_0x059f;
            case eu.b.bu :int: goto L_0x059f;
            case eu.b.bv :int: goto L_0x059f;
            case eu.b.bw :int: goto L_0x059f;
            case eu.b.bx :int: goto L_0x059f;
            case eu.b.by :int: goto L_0x059f;
            case eu.b.bz :int: goto L_0x059f;
            case eu.b.bA :int: goto L_0x059f;
            case eu.b.bB :int: goto L_0x059f;
            case eu.b.bC :int: goto L_0x059f;
            case eu.b.bD :int: goto L_0x059f;
            case eu.b.bE :int: goto L_0x059f;
            case eu.b.bF :int: goto L_0x059f;
            case eu.b.bG :int: goto L_0x059f;
            case eu.b.bH :int: goto L_0x059f;
            case com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_80 :int: goto L_0x059f;
            case 81: goto L_0x059f;
            case 82: goto L_0x059f;
            case 83: goto L_0x059f;
            case o.a.aA :int: goto L_0x059f;
            case 85: goto L_0x059f;
            case 86: goto L_0x059f;
            case 87: goto L_0x059f;
            case 88: goto L_0x059f;
            case 89: goto L_0x059f;
            case 90: goto L_0x059f;
            case 91: goto L_0x059f;
            case 92: goto L_0x059f;
            case 93: goto L_0x059f;
            case 94: goto L_0x059f;
            case 95: goto L_0x059f;
            case 96: goto L_0x059f;
            case 97: goto L_0x059f;
            case 98: goto L_0x059f;
            case 99: goto L_0x059f;
            case 100: goto L_0x059f;
            case 101: goto L_0x059f;
            case 102: goto L_0x059f;
            case 103: goto L_0x059f;
            case 104: goto L_0x059f;
            case 105: goto L_0x059f;
            case 106: goto L_0x059f;
            case 107: goto L_0x059f;
            case 108: goto L_0x059f;
            case 109: goto L_0x059f;
            case 110: goto L_0x059f;
            case com.comscore.streaming.ContentType.SHORT_FORM_ON_DEMAND :int: goto L_0x059f;
            case com.comscore.streaming.ContentType.LONG_FORM_ON_DEMAND :int: goto L_0x059f;
            case com.comscore.streaming.ContentType.LIVE :int: goto L_0x059f;
            case o.a.aB :int: goto L_0x059f;
            case o.a.aC :int: goto L_0x059f;
            case o.a.aD :int: goto L_0x059f;
            case o.a.aE :int: goto L_0x059f;
            default: goto L_0x059e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x059f, code lost:
        n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05a1, code lost:
        r0 = defpackage.bdw.d;
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x05aa, code lost:
        if (r1 == 2006354) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x05af, code lost:
        if (r1 == 2006367) goto L_0x05b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x05b8, code lost:
        if (r0.equals("AFTN") == false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x05ba, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x05c2, code lost:
        if (r0.equals("AFTA") == false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x05c5, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x05c6, code lost:
        if (r2 == 0) goto L_0x05cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x05c8, code lost:
        if (r2 == 1) goto L_0x05cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x05cb, code lost:
        n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x05cd, code lost:
        m = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r6) {
        /*
            int r0 = defpackage.bdw.a
            r1 = 27
            r2 = 0
            if (r0 >= r1) goto L_0x05d6
            java.lang.String r0 = "OMX.google"
            boolean r6 = r6.startsWith(r0)
            if (r6 == 0) goto L_0x0011
            goto L_0x05d6
        L_0x0011:
            java.lang.Class<bec> r6 = defpackage.bec.class
            monitor-enter(r6)
            boolean r0 = m     // Catch:{ all -> 0x05d3 }
            if (r0 != 0) goto L_0x05cf
            java.lang.String r0 = defpackage.bdw.b     // Catch:{ all -> 0x05d3 }
            int r3 = r0.hashCode()     // Catch:{ all -> 0x05d3 }
            r4 = -1
            r5 = 1
            switch(r3) {
                case -2144781245: goto L_0x058f;
                case -2144781185: goto L_0x0584;
                case -2144781160: goto L_0x0579;
                case -2097309513: goto L_0x056e;
                case -2022874474: goto L_0x0563;
                case -1978993182: goto L_0x0558;
                case -1978990237: goto L_0x054d;
                case -1936688988: goto L_0x0542;
                case -1936688066: goto L_0x0537;
                case -1936688065: goto L_0x052b;
                case -1931988508: goto L_0x051f;
                case -1696512866: goto L_0x0513;
                case -1680025915: goto L_0x0507;
                case -1615810839: goto L_0x04fb;
                case -1554255044: goto L_0x04ef;
                case -1481772737: goto L_0x04e3;
                case -1481772730: goto L_0x04d7;
                case -1481772729: goto L_0x04cb;
                case -1320080169: goto L_0x04bf;
                case -1217592143: goto L_0x04b3;
                case -1180384755: goto L_0x04a7;
                case -1139198265: goto L_0x049b;
                case -1052835013: goto L_0x048f;
                case -993250464: goto L_0x0484;
                case -965403638: goto L_0x0478;
                case -958336948: goto L_0x046c;
                case -879245230: goto L_0x0460;
                case -842500323: goto L_0x0454;
                case -821392978: goto L_0x0449;
                case -797483286: goto L_0x043d;
                case -794946968: goto L_0x0431;
                case -788334647: goto L_0x0425;
                case -782144577: goto L_0x0419;
                case -575125681: goto L_0x040d;
                case -521118391: goto L_0x0401;
                case -430914369: goto L_0x03f5;
                case -290434366: goto L_0x03e9;
                case -282781963: goto L_0x03dd;
                case -277133239: goto L_0x03d1;
                case -173639913: goto L_0x03c5;
                case -56598463: goto L_0x03b9;
                case 2126: goto L_0x03ad;
                case 2564: goto L_0x03a1;
                case 2715: goto L_0x0395;
                case 2719: goto L_0x0389;
                case 3483: goto L_0x037d;
                case 73405: goto L_0x0371;
                case 75739: goto L_0x0365;
                case 76779: goto L_0x0359;
                case 78669: goto L_0x034d;
                case 79305: goto L_0x0341;
                case 80618: goto L_0x0335;
                case 88274: goto L_0x0329;
                case 98846: goto L_0x031d;
                case 98848: goto L_0x0311;
                case 99329: goto L_0x0305;
                case 101481: goto L_0x02f9;
                case 1513190: goto L_0x02ee;
                case 1514184: goto L_0x02e3;
                case 1514185: goto L_0x02d8;
                case 2436959: goto L_0x02cc;
                case 2463773: goto L_0x02c0;
                case 2464648: goto L_0x02b4;
                case 2689555: goto L_0x02a8;
                case 3351335: goto L_0x029c;
                case 3386211: goto L_0x0290;
                case 41325051: goto L_0x0284;
                case 55178625: goto L_0x0278;
                case 61542055: goto L_0x026d;
                case 65355429: goto L_0x0261;
                case 66214468: goto L_0x0255;
                case 66214470: goto L_0x0249;
                case 66214473: goto L_0x023d;
                case 66215429: goto L_0x0231;
                case 66215431: goto L_0x0225;
                case 66215433: goto L_0x0219;
                case 66216390: goto L_0x020d;
                case 76402249: goto L_0x0201;
                case 76404105: goto L_0x01f5;
                case 76404911: goto L_0x01e9;
                case 80963634: goto L_0x01dd;
                case 82882791: goto L_0x01d1;
                case 102844228: goto L_0x01c5;
                case 165221241: goto L_0x01ba;
                case 182191441: goto L_0x01ae;
                case 245388979: goto L_0x01a2;
                case 287431619: goto L_0x0196;
                case 307593612: goto L_0x018a;
                case 308517133: goto L_0x017e;
                case 316215098: goto L_0x0172;
                case 316215116: goto L_0x0166;
                case 316246811: goto L_0x015a;
                case 316246818: goto L_0x014e;
                case 407160593: goto L_0x0142;
                case 507412548: goto L_0x0136;
                case 793982701: goto L_0x012a;
                case 794038622: goto L_0x011e;
                case 794040393: goto L_0x0112;
                case 835649806: goto L_0x0106;
                case 917340916: goto L_0x00fb;
                case 958008161: goto L_0x00ef;
                case 1060579533: goto L_0x00e3;
                case 1150207623: goto L_0x00d7;
                case 1176899427: goto L_0x00cb;
                case 1280332038: goto L_0x00bf;
                case 1306947716: goto L_0x00b5;
                case 1349174697: goto L_0x00a9;
                case 1522194893: goto L_0x009d;
                case 1691543273: goto L_0x0091;
                case 1709443163: goto L_0x0085;
                case 1865889110: goto L_0x0079;
                case 1906253259: goto L_0x006d;
                case 1977196784: goto L_0x0061;
                case 2029784656: goto L_0x0055;
                case 2030379515: goto L_0x0049;
                case 2047190025: goto L_0x003d;
                case 2047252157: goto L_0x0031;
                case 2048319463: goto L_0x0025;
                default: goto L_0x0023;
            }     // Catch:{ all -> 0x05d3 }
        L_0x0023:
            goto L_0x059a
        L_0x0025:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 50
            goto L_0x059b
        L_0x0031:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 25
            goto L_0x059b
        L_0x003d:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 24
            goto L_0x059b
        L_0x0049:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 49
            goto L_0x059b
        L_0x0055:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 48
            goto L_0x059b
        L_0x0061:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 52
            goto L_0x059b
        L_0x006d:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 79
            goto L_0x059b
        L_0x0079:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 95
            goto L_0x059b
        L_0x0085:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 51
            goto L_0x059b
        L_0x0091:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 17
            goto L_0x059b
        L_0x009d:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x059b
        L_0x00a9:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 46
            goto L_0x059b
        L_0x00b5:
            java.lang.String r3 = "EverStar_S"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            goto L_0x059b
        L_0x00bf:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 47
            goto L_0x059b
        L_0x00cb:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 54
            goto L_0x059b
        L_0x00d7:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 59
            goto L_0x059b
        L_0x00e3:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 75
            goto L_0x059b
        L_0x00ef:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 55
            goto L_0x059b
        L_0x00fb:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 7
            goto L_0x059b
        L_0x0106:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 61
            goto L_0x059b
        L_0x0112:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 44
            goto L_0x059b
        L_0x011e:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 43
            goto L_0x059b
        L_0x012a:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 42
            goto L_0x059b
        L_0x0136:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 93
            goto L_0x059b
        L_0x0142:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 85
            goto L_0x059b
        L_0x014e:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x059b
        L_0x015a:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x059b
        L_0x0166:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x059b
        L_0x0172:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 100
            goto L_0x059b
        L_0x017e:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 9
            goto L_0x059b
        L_0x018a:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 8
            goto L_0x059b
        L_0x0196:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 45
            goto L_0x059b
        L_0x01a2:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 62
            goto L_0x059b
        L_0x01ae:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 18
            goto L_0x059b
        L_0x01ba:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 5
            goto L_0x059b
        L_0x01c5:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 58
            goto L_0x059b
        L_0x01d1:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x059b
        L_0x01dd:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x059b
        L_0x01e9:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 91
            goto L_0x059b
        L_0x01f5:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 89
            goto L_0x059b
        L_0x0201:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 87
            goto L_0x059b
        L_0x020d:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 34
            goto L_0x059b
        L_0x0219:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 33
            goto L_0x059b
        L_0x0225:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 32
            goto L_0x059b
        L_0x0231:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 31
            goto L_0x059b
        L_0x023d:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 30
            goto L_0x059b
        L_0x0249:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 29
            goto L_0x059b
        L_0x0255:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 28
            goto L_0x059b
        L_0x0261:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 22
            goto L_0x059b
        L_0x026d:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 4
            goto L_0x059b
        L_0x0278:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 11
            goto L_0x059b
        L_0x0284:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 63
            goto L_0x059b
        L_0x0290:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 72
            goto L_0x059b
        L_0x029c:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 65
            goto L_0x059b
        L_0x02a8:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x059b
        L_0x02b4:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 90
            goto L_0x059b
        L_0x02c0:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 88
            goto L_0x059b
        L_0x02cc:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 73
            goto L_0x059b
        L_0x02d8:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 2
            goto L_0x059b
        L_0x02e3:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 1
            goto L_0x059b
        L_0x02ee:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 0
            goto L_0x059b
        L_0x02f9:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 35
            goto L_0x059b
        L_0x0305:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 21
            goto L_0x059b
        L_0x0311:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 20
            goto L_0x059b
        L_0x031d:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 19
            goto L_0x059b
        L_0x0329:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x059b
        L_0x0335:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 94
            goto L_0x059b
        L_0x0341:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 86
            goto L_0x059b
        L_0x034d:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 74
            goto L_0x059b
        L_0x0359:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 66
            goto L_0x059b
        L_0x0365:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 60
            goto L_0x059b
        L_0x0371:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 56
            goto L_0x059b
        L_0x037d:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 64
            goto L_0x059b
        L_0x0389:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x059b
        L_0x0395:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x059b
        L_0x03a1:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 92
            goto L_0x059b
        L_0x03ad:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 14
            goto L_0x059b
        L_0x03b9:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x059b
        L_0x03c5:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 23
            goto L_0x059b
        L_0x03d1:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x059b
        L_0x03dd:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 12
            goto L_0x059b
        L_0x03e9:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 99
            goto L_0x059b
        L_0x03f5:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 84
            goto L_0x059b
        L_0x0401:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 38
            goto L_0x059b
        L_0x040d:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 36
            goto L_0x059b
        L_0x0419:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 71
            goto L_0x059b
        L_0x0425:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x059b
        L_0x0431:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x059b
        L_0x043d:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 97
            goto L_0x059b
        L_0x0449:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 6
            goto L_0x059b
        L_0x0454:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 68
            goto L_0x059b
        L_0x0460:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x059b
        L_0x046c:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 26
            goto L_0x059b
        L_0x0478:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 98
            goto L_0x059b
        L_0x0484:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 3
            goto L_0x059b
        L_0x048f:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 67
            goto L_0x059b
        L_0x049b:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 96
            goto L_0x059b
        L_0x04a7:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 53
            goto L_0x059b
        L_0x04b3:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 13
            goto L_0x059b
        L_0x04bf:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 37
            goto L_0x059b
        L_0x04cb:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 78
            goto L_0x059b
        L_0x04d7:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 77
            goto L_0x059b
        L_0x04e3:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 76
            goto L_0x059b
        L_0x04ef:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x059b
        L_0x04fb:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 83
            goto L_0x059b
        L_0x0507:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 15
            goto L_0x059b
        L_0x0513:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x059b
        L_0x051f:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 10
            goto L_0x059b
        L_0x052b:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 82
            goto L_0x059b
        L_0x0537:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 81
            goto L_0x059b
        L_0x0542:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 80
            goto L_0x059b
        L_0x054d:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 70
            goto L_0x059b
        L_0x0558:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 69
            goto L_0x059b
        L_0x0563:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 16
            goto L_0x059b
        L_0x056e:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 57
            goto L_0x059b
        L_0x0579:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 41
            goto L_0x059b
        L_0x0584:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 40
            goto L_0x059b
        L_0x058f:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x059a
            r1 = 39
            goto L_0x059b
        L_0x059a:
            r1 = -1
        L_0x059b:
            switch(r1) {
                case 0: goto L_0x059f;
                case 1: goto L_0x059f;
                case 2: goto L_0x059f;
                case 3: goto L_0x059f;
                case 4: goto L_0x059f;
                case 5: goto L_0x059f;
                case 6: goto L_0x059f;
                case 7: goto L_0x059f;
                case 8: goto L_0x059f;
                case 9: goto L_0x059f;
                case 10: goto L_0x059f;
                case 11: goto L_0x059f;
                case 12: goto L_0x059f;
                case 13: goto L_0x059f;
                case 14: goto L_0x059f;
                case 15: goto L_0x059f;
                case 16: goto L_0x059f;
                case 17: goto L_0x059f;
                case 18: goto L_0x059f;
                case 19: goto L_0x059f;
                case 20: goto L_0x059f;
                case 21: goto L_0x059f;
                case 22: goto L_0x059f;
                case 23: goto L_0x059f;
                case 24: goto L_0x059f;
                case 25: goto L_0x059f;
                case 26: goto L_0x059f;
                case 27: goto L_0x059f;
                case 28: goto L_0x059f;
                case 29: goto L_0x059f;
                case 30: goto L_0x059f;
                case 31: goto L_0x059f;
                case 32: goto L_0x059f;
                case 33: goto L_0x059f;
                case 34: goto L_0x059f;
                case 35: goto L_0x059f;
                case 36: goto L_0x059f;
                case 37: goto L_0x059f;
                case 38: goto L_0x059f;
                case 39: goto L_0x059f;
                case 40: goto L_0x059f;
                case 41: goto L_0x059f;
                case 42: goto L_0x059f;
                case 43: goto L_0x059f;
                case 44: goto L_0x059f;
                case 45: goto L_0x059f;
                case 46: goto L_0x059f;
                case 47: goto L_0x059f;
                case 48: goto L_0x059f;
                case 49: goto L_0x059f;
                case 50: goto L_0x059f;
                case 51: goto L_0x059f;
                case 52: goto L_0x059f;
                case 53: goto L_0x059f;
                case 54: goto L_0x059f;
                case 55: goto L_0x059f;
                case 56: goto L_0x059f;
                case 57: goto L_0x059f;
                case 58: goto L_0x059f;
                case 59: goto L_0x059f;
                case 60: goto L_0x059f;
                case 61: goto L_0x059f;
                case 62: goto L_0x059f;
                case 63: goto L_0x059f;
                case 64: goto L_0x059f;
                case 65: goto L_0x059f;
                case 66: goto L_0x059f;
                case 67: goto L_0x059f;
                case 68: goto L_0x059f;
                case 69: goto L_0x059f;
                case 70: goto L_0x059f;
                case 71: goto L_0x059f;
                case 72: goto L_0x059f;
                case 73: goto L_0x059f;
                case 74: goto L_0x059f;
                case 75: goto L_0x059f;
                case 76: goto L_0x059f;
                case 77: goto L_0x059f;
                case 78: goto L_0x059f;
                case 79: goto L_0x059f;
                case 80: goto L_0x059f;
                case 81: goto L_0x059f;
                case 82: goto L_0x059f;
                case 83: goto L_0x059f;
                case 84: goto L_0x059f;
                case 85: goto L_0x059f;
                case 86: goto L_0x059f;
                case 87: goto L_0x059f;
                case 88: goto L_0x059f;
                case 89: goto L_0x059f;
                case 90: goto L_0x059f;
                case 91: goto L_0x059f;
                case 92: goto L_0x059f;
                case 93: goto L_0x059f;
                case 94: goto L_0x059f;
                case 95: goto L_0x059f;
                case 96: goto L_0x059f;
                case 97: goto L_0x059f;
                case 98: goto L_0x059f;
                case 99: goto L_0x059f;
                case 100: goto L_0x059f;
                case 101: goto L_0x059f;
                case 102: goto L_0x059f;
                case 103: goto L_0x059f;
                case 104: goto L_0x059f;
                case 105: goto L_0x059f;
                case 106: goto L_0x059f;
                case 107: goto L_0x059f;
                case 108: goto L_0x059f;
                case 109: goto L_0x059f;
                case 110: goto L_0x059f;
                case 111: goto L_0x059f;
                case 112: goto L_0x059f;
                case 113: goto L_0x059f;
                case 114: goto L_0x059f;
                case 115: goto L_0x059f;
                case 116: goto L_0x059f;
                case 117: goto L_0x059f;
                default: goto L_0x059e;
            }     // Catch:{ all -> 0x05d3 }
        L_0x059e:
            goto L_0x05a1
        L_0x059f:
            n = r5     // Catch:{ all -> 0x05d3 }
        L_0x05a1:
            java.lang.String r0 = defpackage.bdw.d     // Catch:{ all -> 0x05d3 }
            int r1 = r0.hashCode()     // Catch:{ all -> 0x05d3 }
            r3 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r1 == r3) goto L_0x05bc
            r2 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r1 == r2) goto L_0x05b2
            goto L_0x05c5
        L_0x05b2:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x05c5
            r2 = 1
            goto L_0x05c6
        L_0x05bc:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x05c5
            goto L_0x05c6
        L_0x05c5:
            r2 = -1
        L_0x05c6:
            if (r2 == 0) goto L_0x05cb
            if (r2 == r5) goto L_0x05cb
            goto L_0x05cd
        L_0x05cb:
            n = r5     // Catch:{ all -> 0x05d3 }
        L_0x05cd:
            m = r5     // Catch:{ all -> 0x05d3 }
        L_0x05cf:
            monitor-exit(r6)     // Catch:{ all -> 0x05d3 }
            boolean r6 = n
            return r6
        L_0x05d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x05d3 }
            throw r0
        L_0x05d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bec.a(java.lang.String):boolean");
    }

    public final void a(avx avx, MediaCodec mediaCodec, aqe aqe, MediaCrypto mediaCrypto, float f) {
        a aVar;
        avx avx2 = avx;
        MediaCodec mediaCodec2 = mediaCodec;
        aqe aqe2 = aqe;
        float f2 = f;
        aqe[] aqeArr = this.e;
        int i = aqe2.k;
        int i2 = aqe2.l;
        int b2 = b(avx2, aqe2);
        if (aqeArr.length == 1) {
            if (b2 != -1) {
                int a2 = a(avx2, aqe2.f, aqe2.k, aqe2.l);
                if (a2 != -1) {
                    b2 = Math.min((int) (((float) b2) * 1.5f), a2);
                }
            }
            aVar = new a(i, i2, b2);
        } else {
            int i3 = i2;
            int i4 = b2;
            boolean z2 = false;
            int i5 = i;
            for (aqe aqe3 : aqeArr) {
                if (avx2.a(aqe2, aqe3, false)) {
                    z2 |= aqe3.k == -1 || aqe3.l == -1;
                    i5 = Math.max(i5, aqe3.k);
                    int max = Math.max(i3, aqe3.l);
                    i4 = Math.max(i4, b(avx2, aqe3));
                    i3 = max;
                }
            }
            if (z2) {
                StringBuilder sb = new StringBuilder("Resolutions unknown. Codec max resolution: ");
                sb.append(i5);
                String str = "x";
                sb.append(str);
                sb.append(i3);
                String str2 = "MediaCodecVideoRenderer";
                bdd.c(str2, sb.toString());
                Point a3 = a(avx2, aqe2);
                if (a3 != null) {
                    i5 = Math.max(i5, a3.x);
                    i3 = Math.max(i3, a3.y);
                    i4 = Math.max(i4, a(avx2, aqe2.f, i5, i3));
                    StringBuilder sb2 = new StringBuilder("Codec max resolution adjusted to: ");
                    sb2.append(i5);
                    sb2.append(str);
                    sb2.append(i3);
                    bdd.c(str2, sb2.toString());
                }
            }
            aVar = new a(i5, i3, i4);
        }
        this.w = aVar;
        a aVar2 = this.w;
        boolean z3 = this.t;
        int i6 = this.U;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", aqe2.f);
        mediaFormat.setInteger("width", aqe2.k);
        mediaFormat.setInteger("height", aqe2.l);
        avz.a(mediaFormat, aqe2.h);
        float f3 = aqe2.m;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        avz.a(mediaFormat, "rotation-degrees", aqe2.n);
        bdz bdz = aqe2.p;
        if (bdz != null) {
            avz.a(mediaFormat, "color-transfer", bdz.c);
            avz.a(mediaFormat, "color-standard", bdz.a);
            avz.a(mediaFormat, "color-range", bdz.b);
            byte[] bArr = bdz.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar2.a);
        mediaFormat.setInteger("max-height", aVar2.b);
        avz.a(mediaFormat, "max-input-size", aVar2.c);
        if (bdw.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z3) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i6 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i6);
        }
        if (this.y == null) {
            bcu.b(b(avx));
            if (this.z == null) {
                this.z = bea.a(this.o, avx2.e);
            }
            this.y = this.z;
        }
        mediaCodec2.configure(mediaFormat, this.y, mediaCrypto, 0);
        if (bdw.a >= 23 && this.T) {
            this.k = new b(this, mediaCodec2, 0);
        }
    }
}
