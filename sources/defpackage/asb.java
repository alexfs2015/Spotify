package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.AudioSink.ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink.InitializationException;
import com.google.android.exoplayer2.audio.AudioSink.WriteException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: asb reason: default package */
public final class asb extends MediaCodecRenderer implements bdw {
    private int A;
    private final Context k;
    /* access modifiers changed from: private */
    public final defpackage.art.a l;
    private final AudioSink m;
    private final long[] n;
    private int o;
    private boolean p;
    private boolean q;
    private MediaFormat r;
    private int s;
    private int t;
    private int u;
    private int v;
    private long w;
    private boolean x;
    /* access modifiers changed from: private */
    public boolean y;
    private long z;

    /* renamed from: asb$a */
    final class a implements com.google.android.exoplayer2.audio.AudioSink.a {
        private a() {
        }

        /* synthetic */ a(asb asb, byte b) {
            this();
        }

        public final void a() {
            asb.this.y = true;
        }

        public final void a(int i) {
            asb.this.l.a(i);
        }

        public final void a(int i, long j, long j2) {
            asb.this.l.a(i, j, j2);
        }
    }

    public asb(Context context, awp awp, asu<asy> asu, boolean z2, Handler handler, art art, arq arq, AudioProcessor... audioProcessorArr) {
        arq arq2 = arq;
        this(context, awp, asu, false, handler, art, new ary(arq, audioProcessorArr));
    }

    private asb(Context context, awp awp, asu<asy> asu, boolean z2, Handler handler, art art, AudioSink audioSink) {
        super(1, awp, asu, z2, 44100.0f);
        this.k = context.getApplicationContext();
        this.m = audioSink;
        this.z = -9223372036854775807L;
        this.n = new long[10];
        this.l = new defpackage.art.a(handler, art);
        audioSink.a((com.google.android.exoplayer2.audio.AudioSink.a) new a(this, 0));
    }

    private int a(awo awo, aqv aqv) {
        if (ben.a < 24) {
            if ("OMX.google.raw.decoder".equals(awo.a)) {
                boolean z2 = true;
                if (ben.a == 23) {
                    PackageManager packageManager = this.k.getPackageManager();
                    if (packageManager != null && packageManager.hasSystemFeature("android.software.leanback")) {
                        z2 = false;
                    }
                }
                if (z2) {
                    return -1;
                }
            }
        }
        return aqv.g;
    }

    private boolean a(String str) {
        int h = bdx.h(str);
        return h != 0 && this.m.a(h);
    }

    private void x() {
        long a2 = this.m.a(r());
        if (a2 != Long.MIN_VALUE) {
            if (!this.y) {
                a2 = Math.max(this.w, a2);
            }
            this.w = a2;
            this.y = false;
        }
    }

    public final float a(float f, aqv[] aqvArr) {
        int i = -1;
        for (aqv aqv : aqvArr) {
            int i2 = aqv.r;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final int a(awo awo, aqv aqv, aqv aqv2) {
        return (a(awo, aqv2) <= this.o && awo.a(aqv, aqv2, true) && aqv.t == 0 && aqv.u == 0 && aqv2.t == 0 && aqv2.u == 0) ? 1 : 0;
    }

    public final int a(awp awp, asu<asy> asu, aqv aqv) {
        boolean z2;
        String str = aqv.f;
        if (!bdx.a(str)) {
            return 0;
        }
        int i = ben.a >= 21 ? 32 : 0;
        boolean a2 = a(asu, aqv.i);
        int i2 = 4;
        int i3 = 8;
        if (a2 && a(str) && awp.a() != null) {
            return i | 8 | 4;
        }
        if (("audio/raw".equals(str) && !this.m.a(aqv.s)) || !this.m.a(2)) {
            return 1;
        }
        ast ast = aqv.i;
        if (ast != null) {
            z2 = false;
            for (int i4 = 0; i4 < ast.c; i4++) {
                z2 |= ast.a[i4].d;
            }
        } else {
            z2 = false;
        }
        List a3 = awp.a(aqv.f, z2);
        if (a3.isEmpty()) {
            return (!z2 || awp.a(aqv.f, false).isEmpty()) ? 1 : 2;
        }
        if (!a2) {
            return 2;
        }
        awo awo = (awo) a3.get(0);
        boolean a4 = awo.a(aqv);
        if (a4 && awo.b(aqv)) {
            i3 = 16;
        }
        if (!a4) {
            i2 = 3;
        }
        return i3 | i | i2;
    }

    public final arc a(arc arc) {
        return this.m.a(arc);
    }

    public final List<awo> a(awp awp, aqv aqv, boolean z2) {
        if (a(aqv.f)) {
            awo a2 = awp.a();
            if (a2 != null) {
                return Collections.singletonList(a2);
            }
        }
        return super.a(awp, aqv, z2);
    }

    public final void a(long j, boolean z2) {
        super.a(j, z2);
        this.m.i();
        this.w = j;
        this.x = true;
        this.y = true;
        this.z = -9223372036854775807L;
        this.A = 0;
    }

    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        MediaFormat mediaFormat2 = this.r;
        if (mediaFormat2 != null) {
            i = bdx.h(mediaFormat2.getString("mime"));
            mediaFormat = this.r;
        } else {
            i = this.s;
        }
        int i2 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.q && integer == 6) {
            int i3 = this.t;
            if (i3 < 6) {
                iArr = new int[i3];
                for (int i4 = 0; i4 < this.t; i4++) {
                    iArr[i4] = i4;
                }
                this.m.a(i2, integer, integer2, 0, iArr, this.u, this.v);
            }
        }
        iArr = null;
        try {
            this.m.a(i2, integer, integer2, 0, iArr, this.u, this.v);
        } catch (ConfigurationException e) {
            throw ExoPlaybackException.a(e, this.b);
        }
    }

    public final void a(asm asm) {
        if (this.x && !asm.n_()) {
            if (Math.abs(asm.d - this.w) > 500000) {
                this.w = asm.d;
            }
            this.x = false;
        }
        this.z = Math.max(asm.d, this.z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (defpackage.ben.b.startsWith("heroqlte") != false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.awo r9, android.media.MediaCodec r10, defpackage.aqv r11, android.media.MediaCrypto r12, float r13) {
        /*
            r8 = this;
            aqv[] r0 = r8.e
            int r1 = r8.a(r9, r11)
            int r2 = r0.length
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L_0x0024
            int r2 = r0.length
            r5 = r1
            r1 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x0023
            r6 = r0[r1]
            boolean r7 = r9.a(r11, r6, r4)
            if (r7 == 0) goto L_0x0020
            int r6 = r8.a(r9, r6)
            int r5 = java.lang.Math.max(r5, r6)
        L_0x0020:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0023:
            r1 = r5
        L_0x0024:
            r8.o = r1
            java.lang.String r0 = r9.a
            int r1 = defpackage.ben.a
            r2 = 24
            if (r1 >= r2) goto L_0x005f
            java.lang.String r1 = "OMX.SEC.aac.dec"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = defpackage.ben.c
            java.lang.String r1 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = defpackage.ben.b
            java.lang.String r1 = "zeroflte"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = defpackage.ben.b
            java.lang.String r1 = "herolte"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = defpackage.ben.b
            java.lang.String r1 = "heroqlte"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            r8.q = r3
            boolean r0 = r9.f
            r8.p = r0
            java.lang.String r0 = r9.b
            if (r0 != 0) goto L_0x006d
            java.lang.String r9 = "audio/raw"
            goto L_0x006f
        L_0x006d:
            java.lang.String r9 = r9.b
        L_0x006f:
            int r0 = r8.o
            android.media.MediaFormat r1 = new android.media.MediaFormat
            r1.<init>()
            java.lang.String r2 = "mime"
            r1.setString(r2, r9)
            int r9 = r11.q
            java.lang.String r3 = "channel-count"
            r1.setInteger(r3, r9)
            int r9 = r11.r
            java.lang.String r3 = "sample-rate"
            r1.setInteger(r3, r9)
            java.util.List<byte[]> r9 = r11.h
            defpackage.awq.a(r1, r9)
            java.lang.String r9 = "max-input-size"
            defpackage.awq.a(r1, r9, r0)
            int r9 = defpackage.ben.a
            r0 = 23
            if (r9 < r0) goto L_0x00a9
            java.lang.String r9 = "priority"
            r1.setInteger(r9, r4)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x00a9
            java.lang.String r9 = "operating-rate"
            r1.setFloat(r9, r13)
        L_0x00a9:
            r9 = 0
            r10.configure(r1, r9, r12, r4)
            boolean r10 = r8.p
            if (r10 == 0) goto L_0x00bb
            r8.r = r1
            android.media.MediaFormat r9 = r8.r
            java.lang.String r10 = r11.f
            r9.setString(r2, r10)
            return
        L_0x00bb:
            r8.r = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asb.a(awo, android.media.MediaCodec, aqv, android.media.MediaCrypto, float):void");
    }

    public final void a(String str, long j, long j2) {
        this.l.a(str, j, j2);
    }

    public final void a(boolean z2) {
        super.a(z2);
        this.l.a(this.j);
        int i = this.a.b;
        if (i != 0) {
            this.m.b(i);
        } else {
            this.m.g();
        }
    }

    public final void a(aqv[] aqvArr, long j) {
        super.a(aqvArr, j);
        if (this.z != -9223372036854775807L) {
            int i = this.A;
            if (i == 10) {
                StringBuilder sb = new StringBuilder("Too many stream changes, so dropping change at ");
                sb.append(this.n[this.A - 1]);
                bdu.c("MediaCodecAudioRenderer", sb.toString());
            } else {
                this.A = i + 1;
            }
            this.n[this.A - 1] = this.z;
        }
    }

    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z2, aqv aqv) {
        if (this.p && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z2) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.j.f++;
            this.m.b();
            return true;
        } else {
            try {
                if (!this.m.a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.j.e++;
                return true;
            } catch (InitializationException | WriteException e) {
                throw ExoPlaybackException.a(e, this.b);
            }
        }
    }

    public final void b(aqv aqv) {
        super.b(aqv);
        this.l.a(aqv);
        this.s = "audio/raw".equals(aqv.f) ? aqv.s : 2;
        this.t = aqv.q;
        this.u = aqv.t;
        this.v = aqv.u;
    }

    public final bdw c() {
        return this;
    }

    public final void c(long j) {
        super.c(j);
        while (this.A != 0 && j >= this.n[0]) {
            this.m.b();
            this.A--;
            long[] jArr = this.n;
            System.arraycopy(jArr, 1, jArr, 0, this.A);
        }
    }

    public final long d() {
        if (this.c == 2) {
            x();
        }
        return this.w;
    }

    public final arc e() {
        return this.m.f();
    }

    public final void handleMessage(int i, Object obj) {
        if (i == 2) {
            this.m.a(((Float) obj).floatValue());
        } else if (i == 3) {
            this.m.a((arp) obj);
        } else if (i != 5) {
            super.handleMessage(i, obj);
        } else {
            this.m.a((arw) obj);
        }
    }

    public final void n() {
        super.n();
        this.m.a();
    }

    public final void o() {
        x();
        this.m.h();
        super.o();
    }

    public final void p() {
        try {
            this.z = -9223372036854775807L;
            this.A = 0;
            this.m.j();
            try {
                super.p();
            } finally {
                this.l.b(this.j);
            }
        } catch (Throwable th) {
            super.p();
            throw th;
        } finally {
            this.l.b(this.j);
        }
    }

    public final boolean q() {
        return this.m.e() || super.q();
    }

    public final boolean r() {
        return super.r() && this.m.d();
    }

    public final void s() {
        try {
            this.m.c();
        } catch (WriteException e) {
            throw ExoPlaybackException.a(e, this.b);
        }
    }
}
