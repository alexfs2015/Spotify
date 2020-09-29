package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.moat.analytics.mobile.MoatAdEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@cfp
/* renamed from: crf reason: default package */
public final class crf extends crr implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map<Integer, String> d = new HashMap();
    /* access modifiers changed from: 0000 */
    public crq a;
    private final csi e;
    private final boolean f;
    private int g = 0;
    private int h = 0;
    private MediaPlayer i;
    private Uri j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private csf p;
    private boolean q;
    private int r;

    static {
        if (VERSION.SDK_INT >= 17) {
            d.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            d.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            d.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            d.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            d.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        d.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        d.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        d.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        d.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        d.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        d.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        d.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        d.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        d.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            d.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            d.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public crf(Context context, boolean z, boolean z2, csi csi) {
        super(context);
        setSurfaceTextureListener(this);
        this.e = csi;
        this.q = z;
        this.f = z2;
        csi csi2 = this.e;
        dtm.a(csi2.e, csi2.d, "vpc2");
        csi2.i = true;
        if (csi2.e != null) {
            csi2.e.a("vpn", a());
        }
        csi2.n = this;
    }

    private final void a(float f2) {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            cpn.a(5);
        }
    }

    private final void a(boolean z) {
        cml.a();
        csf csf = this.p;
        if (csf != null) {
            csf.b();
            this.p = null;
        }
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.i.release();
            this.i = null;
            b(0);
            if (z) {
                this.h = 0;
                this.h = 0;
            }
        }
    }

    private final void b(int i2) {
        if (i2 == 3) {
            this.e.a();
            this.c.a();
        } else if (this.g == 3) {
            this.e.m = false;
            this.c.b();
        }
        this.g = i2;
    }

    private final void j() {
        cml.a();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (!(this.j == null || surfaceTexture == null)) {
            a(false);
            try {
                bkc.v();
                this.i = new MediaPlayer();
                this.i.setOnBufferingUpdateListener(this);
                this.i.setOnCompletionListener(this);
                this.i.setOnErrorListener(this);
                this.i.setOnInfoListener(this);
                this.i.setOnPreparedListener(this);
                this.i.setOnVideoSizeChangedListener(this);
                this.m = 0;
                if (this.q) {
                    this.p = new csf(getContext());
                    this.p.a(surfaceTexture, getWidth(), getHeight());
                    this.p.start();
                    SurfaceTexture c = this.p.c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.p.b();
                        this.p = null;
                    }
                }
                this.i.setDataSource(getContext(), this.j);
                bkc.w();
                this.i.setSurface(new Surface(surfaceTexture));
                this.i.setAudioStreamType(3);
                this.i.setScreenOnWhilePlaying(true);
                this.i.prepareAsync();
                b(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
                String valueOf = String.valueOf(this.j);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                sb.toString();
                cpn.a(5);
                onError(this.i, 1, 0);
            }
        }
    }

    private final void k() {
        if (this.f && l() && this.i.getCurrentPosition() > 0 && this.h != 3) {
            cml.a();
            a(0.0f);
            this.i.start();
            int currentPosition = this.i.getCurrentPosition();
            long a2 = bkc.l().a();
            while (l() && this.i.getCurrentPosition() == currentPosition) {
                if (bkc.l().a() - a2 > 250) {
                    break;
                }
            }
            this.i.pause();
            i();
        }
    }

    private final boolean l() {
        if (this.i != null) {
            int i2 = this.g;
            if (!(i2 == -1 || i2 == 0 || i2 == 1)) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        String str = this.q ? " spherical" : "";
        String str2 = "MediaPlayer";
        return str.length() != 0 ? str2.concat(str) : new String(str2);
    }

    public final void a(float f2, float f3) {
        float f4;
        float f5;
        int i2;
        csf csf = this.p;
        if (csf != null) {
            float f6 = f2 * 1.7453293f;
            if (csf.d > csf.c) {
                f5 = f6 / ((float) csf.d);
                f4 = f3 * 1.7453293f;
                i2 = csf.d;
            } else {
                f5 = f6 / ((float) csf.c);
                f4 = f3 * 1.7453293f;
                i2 = csf.c;
            }
            float f7 = f4 / ((float) i2);
            csf.a -= f5;
            csf.b -= f7;
            if (csf.b < -1.5707964f) {
                csf.b = -1.5707964f;
            }
            if (csf.b > 1.5707964f) {
                csf.b = 1.5707964f;
            }
        }
    }

    public final void a(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        sb.toString();
        cml.a();
        if (l()) {
            this.i.seekTo(i2);
            this.r = 0;
            return;
        }
        this.r = i2;
    }

    public final void a(crq crq) {
        this.a = crq;
    }

    public final void a(String str) {
        Uri parse = Uri.parse(str);
        dnr a2 = dnr.a(parse);
        if (a2 != null) {
            parse = Uri.parse(a2.a);
        }
        this.j = parse;
        this.r = 0;
        j();
        requestLayout();
        invalidate();
    }

    public final void b() {
        cml.a();
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.i.release();
            this.i = null;
            b(0);
            this.h = 0;
        }
        csi csi = this.e;
        if (((Boolean) dqe.f().a(dtg.t)).booleanValue() && !csi.o) {
            Bundle bundle = new Bundle();
            bundle.putString(MoatAdEvent.EVENT_TYPE, "native-player-metrics");
            bundle.putString("request", csi.b);
            bundle.putString("player", csi.n.a());
            for (coa coa : csi.f.a()) {
                String str = "fps_c_";
                String valueOf = String.valueOf(coa.a);
                bundle.putString(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.toString(coa.c));
                String str2 = "fps_p_";
                String valueOf2 = String.valueOf(coa.a);
                bundle.putString(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), Double.toString(coa.b));
            }
            for (int i2 = 0; i2 < csi.g.length; i2++) {
                String str3 = csi.h[i2];
                if (str3 != null) {
                    String valueOf3 = String.valueOf(Long.valueOf(csi.g[i2]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf3);
                    bundle.putString(sb.toString(), str3);
                }
            }
            bkc.e().a(csi.a, csi.c.a, "gmob-apps", bundle, true);
            csi.o = true;
        }
    }

    public final void c() {
        cml.a();
        if (l()) {
            this.i.start();
            b(3);
            this.b.c = true;
            cmu.a.post(new cro(this));
        }
        this.h = 3;
    }

    public final void d() {
        cml.a();
        if (l() && this.i.isPlaying()) {
            this.i.pause();
            b(4);
            cmu.a.post(new crp(this));
        }
        this.h = 4;
    }

    public final int e() {
        if (l()) {
            return this.i.getDuration();
        }
        return -1;
    }

    public final int f() {
        if (l()) {
            return this.i.getCurrentPosition();
        }
        return 0;
    }

    public final int g() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final int h() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final void i() {
        csk csk = this.c;
        float f2 = csk.b ? 0.0f : csk.c;
        if (!csk.a) {
            f2 = 0.0f;
        }
        a(f2);
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.m = i2;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        cml.a();
        b(5);
        this.h = 5;
        cmu.a.post(new cri(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = (String) d.get(Integer.valueOf(i2));
        String str2 = (String) d.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.toString();
        cpn.a(5);
        b(-1);
        this.h = -1;
        cmu.a.post(new crj(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = (String) d.get(Integer.valueOf(i2));
        String str2 = (String) d.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.toString();
        cml.a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r7 != r1) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.k
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.l
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.k
            if (r2 <= 0) goto L_0x0088
            int r2 = r5.l
            if (r2 <= 0) goto L_0x0088
            csf r2 = r5.p
            if (r2 != 0) goto L_0x0088
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0048
            if (r1 != r2) goto L_0x0048
            int r0 = r5.k
            int r1 = r0 * r7
            int r2 = r5.l
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003d
            int r0 = r0 * r7
            int r0 = r0 / r2
            r1 = r7
            goto L_0x0088
        L_0x003d:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L_0x0069
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L_0x0089
        L_0x0048:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x005a
            int r0 = r5.l
            int r0 = r0 * r6
            int r2 = r5.k
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0058
            if (r0 <= r7) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            r1 = r0
            goto L_0x0089
        L_0x005a:
            if (r1 != r2) goto L_0x006b
            int r1 = r5.k
            int r1 = r1 * r7
            int r2 = r5.l
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0068
            if (r1 <= r6) goto L_0x0068
        L_0x0067:
            goto L_0x0069
        L_0x0068:
            r6 = r1
        L_0x0069:
            r1 = r7
            goto L_0x0089
        L_0x006b:
            int r2 = r5.k
            int r4 = r5.l
            if (r1 != r3) goto L_0x0078
            if (r4 <= r7) goto L_0x0078
            int r2 = r2 * r7
            int r2 = r2 / r4
            r1 = r7
            goto L_0x0079
        L_0x0078:
            r1 = r4
        L_0x0079:
            if (r0 != r3) goto L_0x0086
            if (r2 <= r6) goto L_0x0086
            int r7 = r5.l
            int r7 = r7 * r6
            int r0 = r5.k
            int r1 = r7 / r0
            goto L_0x0089
        L_0x0086:
            r6 = r2
            goto L_0x0089
        L_0x0088:
            r6 = r0
        L_0x0089:
            r5.setMeasuredDimension(r6, r1)
            csf r7 = r5.p
            if (r7 == 0) goto L_0x0093
            r7.a(r6, r1)
        L_0x0093:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r7 != r0) goto L_0x00ac
            int r7 = r5.n
            if (r7 <= 0) goto L_0x009f
            if (r7 != r6) goto L_0x00a5
        L_0x009f:
            int r7 = r5.o
            if (r7 <= 0) goto L_0x00a8
            if (r7 == r1) goto L_0x00a8
        L_0x00a5:
            r5.k()
        L_0x00a8:
            r5.n = r6
            r5.o = r1
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crf.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        cml.a();
        b(2);
        csi csi = this.e;
        if (csi.i && !csi.j) {
            dtm.a(csi.e, csi.d, "vfr2");
            csi.j = true;
        }
        cmu.a.post(new crh(this));
        this.k = mediaPlayer.getVideoWidth();
        this.l = mediaPlayer.getVideoHeight();
        int i2 = this.r;
        if (i2 != 0) {
            a(i2);
        }
        k();
        int i3 = this.k;
        int i4 = this.l;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        sb.toString();
        cpn.a(4);
        if (this.h == 3) {
            c();
        }
        i();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        cml.a();
        j();
        cmu.a.post(new crl(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cml.a();
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null && this.r == 0) {
            this.r = mediaPlayer.getCurrentPosition();
        }
        csf csf = this.p;
        if (csf != null) {
            csf.b();
        }
        cmu.a.post(new crn(this));
        a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        cml.a();
        boolean z = true;
        boolean z2 = this.h == 3;
        if (!(this.k == i2 && this.l == i3)) {
            z = false;
        }
        if (this.i != null && z2 && z) {
            int i4 = this.r;
            if (i4 != 0) {
                a(i4);
            }
            c();
        }
        csf csf = this.p;
        if (csf != null) {
            csf.a(i2, i3);
        }
        cmu.a.post(new crm(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        csi csi = this.e;
        if (csi.k && !csi.l) {
            if (cml.a() && !csi.l) {
                cml.a();
            }
            dtm.a(csi.e, csi.d, "vff2");
            csi.l = true;
        }
        long c = bkc.l().c();
        if (csi.m && csi.p && csi.q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d2 = (double) (c - csi.q);
            Double.isNaN(nanos);
            Double.isNaN(d2);
            double d3 = nanos / d2;
            cnz cnz = csi.f;
            cnz.d++;
            for (int i2 = 0; i2 < cnz.b.length; i2++) {
                if (cnz.b[i2] <= d3 && d3 < cnz.a[i2]) {
                    int[] iArr = cnz.c;
                    iArr[i2] = iArr[i2] + 1;
                }
                if (d3 < cnz.b[i2]) {
                    break;
                }
            }
        }
        csi.p = csi.m;
        csi.q = c;
        long longValue = ((Long) dqe.f().a(dtg.v)).longValue();
        long f2 = (long) f();
        int i3 = 0;
        while (true) {
            if (i3 >= csi.h.length) {
                break;
            } else if (csi.h[i3] != null || longValue <= Math.abs(f2 - csi.g[i3])) {
                i3++;
            } else {
                String[] strArr = csi.h;
                int i4 = 8;
                Bitmap bitmap = getBitmap(8, 8);
                long j2 = 63;
                int i5 = 0;
                long j3 = 0;
                while (i5 < i4) {
                    long j4 = j2;
                    int i6 = 0;
                    while (i6 < i4) {
                        int pixel = bitmap.getPixel(i6, i5);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j4);
                        i6++;
                        j4--;
                        i4 = 8;
                    }
                    i5++;
                    j2 = j4;
                    i4 = 8;
                }
                strArr[i3] = String.format("%016X", new Object[]{Long.valueOf(j3)});
            }
        }
        csa csa = this.b;
        crq crq = this.a;
        if (crq != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (csa.c || Math.abs(timestamp - csa.b) >= csa.a) {
                csa.c = false;
                csa.b = timestamp;
                cmu.a.post(new csb(crq));
            }
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        sb.toString();
        cml.a();
        this.k = mediaPlayer.getVideoWidth();
        this.l = mediaPlayer.getVideoHeight();
        if (this.k != 0 && this.l != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        sb.toString();
        cml.a();
        cmu.a.post(new crg(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
