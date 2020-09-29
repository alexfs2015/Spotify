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

/* renamed from: ark reason: default package */
public final class ark extends MediaCodecRenderer implements bdf {
    private int A;
    private final Context k;
    /* access modifiers changed from: private */
    public final defpackage.arc.a l;
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

    /* renamed from: ark$a */
    final class a implements com.google.android.exoplayer2.audio.AudioSink.a {
        private a() {
        }

        /* synthetic */ a(ark ark, byte b) {
            this();
        }

        public final void a(int i) {
            ark.this.l.a(i);
        }

        public final void a() {
            ark.this.y = true;
        }

        public final void a(int i, long j, long j2) {
            ark.this.l.a(i, j, j2);
        }
    }

    public final bdf c() {
        return this;
    }

    public ark(Context context, avy avy, asd<ash> asd, boolean z2, Handler handler, arc arc, aqz aqz, AudioProcessor... audioProcessorArr) {
        aqz aqz2 = aqz;
        this(context, avy, asd, false, handler, arc, new arh(aqz, audioProcessorArr));
    }

    private ark(Context context, avy avy, asd<ash> asd, boolean z2, Handler handler, arc arc, AudioSink audioSink) {
        super(1, avy, asd, z2, 44100.0f);
        this.k = context.getApplicationContext();
        this.m = audioSink;
        this.z = -9223372036854775807L;
        this.n = new long[10];
        this.l = new defpackage.arc.a(handler, arc);
        audioSink.a((com.google.android.exoplayer2.audio.AudioSink.a) new a(this, 0));
    }

    public final int a(avy avy, asd<ash> asd, aqe aqe) {
        boolean z2;
        String str = aqe.f;
        if (!bdg.a(str)) {
            return 0;
        }
        int i = bdw.a >= 21 ? 32 : 0;
        boolean a2 = a(asd, aqe.i);
        int i2 = 4;
        int i3 = 8;
        if (a2 && a(str) && avy.a() != null) {
            return i | 8 | 4;
        }
        if (("audio/raw".equals(str) && !this.m.a(aqe.s)) || !this.m.a(2)) {
            return 1;
        }
        asc asc = aqe.i;
        if (asc != null) {
            z2 = false;
            for (int i4 = 0; i4 < asc.c; i4++) {
                z2 |= asc.a[i4].d;
            }
        } else {
            z2 = false;
        }
        List a3 = avy.a(aqe.f, z2);
        if (a3.isEmpty()) {
            return (!z2 || avy.a(aqe.f, false).isEmpty()) ? 1 : 2;
        }
        if (!a2) {
            return 2;
        }
        avx avx = (avx) a3.get(0);
        boolean a4 = avx.a(aqe);
        if (a4 && avx.b(aqe)) {
            i3 = 16;
        }
        if (!a4) {
            i2 = 3;
        }
        return i3 | i | i2;
    }

    public final List<avx> a(avy avy, aqe aqe, boolean z2) {
        if (a(aqe.f)) {
            avx a2 = avy.a();
            if (a2 != null) {
                return Collections.singletonList(a2);
            }
        }
        return super.a(avy, aqe, z2);
    }

    private boolean a(String str) {
        int h = bdg.h(str);
        return h != 0 && this.m.a(h);
    }

    public final int a(avx avx, aqe aqe, aqe aqe2) {
        if (a(avx, aqe2) <= this.o && avx.a(aqe, aqe2, true) && aqe.t == 0 && aqe.u == 0 && aqe2.t == 0 && aqe2.u == 0) {
            return 1;
        }
        return 0;
    }

    public final float a(float f, aqe[] aqeArr) {
        int i = -1;
        for (aqe aqe : aqeArr) {
            int i2 = aqe.r;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final void a(String str, long j, long j2) {
        this.l.a(str, j, j2);
    }

    public final void b(aqe aqe) {
        super.b(aqe);
        this.l.a(aqe);
        this.s = "audio/raw".equals(aqe.f) ? aqe.s : 2;
        this.t = aqe.q;
        this.u = aqe.t;
        this.v = aqe.u;
    }

    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        MediaFormat mediaFormat2 = this.r;
        if (mediaFormat2 != null) {
            i = bdg.h(mediaFormat2.getString("mime"));
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

    public final void a(aqe[] aqeArr, long j) {
        super.a(aqeArr, j);
        if (this.z != -9223372036854775807L) {
            int i = this.A;
            if (i == 10) {
                StringBuilder sb = new StringBuilder("Too many stream changes, so dropping change at ");
                sb.append(this.n[this.A - 1]);
                bdd.c("MediaCodecAudioRenderer", sb.toString());
            } else {
                this.A = i + 1;
            }
            this.n[this.A - 1] = this.z;
        }
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

    public final boolean r() {
        return super.r() && this.m.d();
    }

    public final boolean q() {
        return this.m.e() || super.q();
    }

    public final aql a(aql aql) {
        return this.m.a(aql);
    }

    public final aql e() {
        return this.m.f();
    }

    public final void a(arv arv) {
        if (this.x && !arv.n_()) {
            if (Math.abs(arv.d - this.w) > 500000) {
                this.w = arv.d;
            }
            this.x = false;
        }
        this.z = Math.max(arv.d, this.z);
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

    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z2, aqe aqe) {
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

    public final void s() {
        try {
            this.m.c();
        } catch (WriteException e) {
            throw ExoPlaybackException.a(e, this.b);
        }
    }

    public final void handleMessage(int i, Object obj) {
        if (i == 2) {
            this.m.a(((Float) obj).floatValue());
        } else if (i == 3) {
            this.m.a((aqy) obj);
        } else if (i != 5) {
            super.handleMessage(i, obj);
        } else {
            this.m.a((arf) obj);
        }
    }

    private int a(avx avx, aqe aqe) {
        if (bdw.a < 24) {
            if ("OMX.google.raw.decoder".equals(avx.a)) {
                boolean z2 = true;
                if (bdw.a == 23) {
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
        return aqe.g;
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

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (defpackage.bdw.b.startsWith("heroqlte") != false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.avx r9, android.media.MediaCodec r10, defpackage.aqe r11, android.media.MediaCrypto r12, float r13) {
        /*
            r8 = this;
            aqe[] r0 = r8.e
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
            int r1 = defpackage.bdw.a
            r2 = 24
            if (r1 >= r2) goto L_0x005f
            java.lang.String r1 = "OMX.SEC.aac.dec"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = defpackage.bdw.c
            java.lang.String r1 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = defpackage.bdw.b
            java.lang.String r1 = "zeroflte"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = defpackage.bdw.b
            java.lang.String r1 = "herolte"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = defpackage.bdw.b
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
            defpackage.avz.a(r1, r9)
            java.lang.String r9 = "max-input-size"
            defpackage.avz.a(r1, r9, r0)
            int r9 = defpackage.bdw.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ark.a(avx, android.media.MediaCodec, aqe, android.media.MediaCrypto, float):void");
    }

    public final long d() {
        if (this.c == 2) {
            x();
        }
        return this.w;
    }
}
