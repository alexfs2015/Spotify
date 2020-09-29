package com.spotify.music.podcast.ui.trailer;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class PodcastTrailerOverlayDrawable extends Drawable implements Runnable, a {
    private final jtz A;
    private State B = State.IDLE;
    public Bitmap a;
    private int b;
    private int c;
    private final int d;
    private final Paint e = new Paint();
    private final Rect f = new Rect();
    private final RectF g = new RectF();
    private final RectF h = new RectF();
    private final Paint i;
    private final BitmapShader j;
    private final Matrix k = new Matrix();
    private final RectF l = new RectF();
    private final SpotifyIconDrawable m;
    private final SpotifyIconDrawable n;
    private final uel o;
    private final float p;
    private boolean q;
    private uem r;
    private long s = Long.MAX_VALUE;
    private int t = 255;
    private int u = 255;
    private int v;
    private float w;
    private long x;
    private long y;
    private final ColorFilter z;

    /* renamed from: com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State[] r0 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r1 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r1 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.PROGRESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.AnonymousClass1.<clinit>():void");
        }
    }

    public enum State {
        IDLE,
        PROGRESS
    }

    public PodcastTrailerOverlayDrawable(Bitmap bitmap, int i2, int i3, int i4, SpotifyIconDrawable spotifyIconDrawable, SpotifyIconDrawable spotifyIconDrawable2, float f2, uel uel, jtz jtz) {
        this.a = bitmap;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.m = spotifyIconDrawable;
        this.n = spotifyIconDrawable2;
        this.p = f2;
        this.o = uel;
        this.A = jtz;
        this.i = new Paint(1);
        this.i.setStyle(Style.FILL);
        Bitmap bitmap2 = this.a;
        TileMode tileMode = TileMode.CLAMP;
        this.j = new BitmapShader(bitmap2, tileMode, tileMode);
        this.i.setShader(this.j);
        a();
        int round = Math.round(204.0f);
        this.z = new LightingColorFilter(Color.rgb(round, round, round), 0);
    }

    private static int a(int i2) {
        return Math.max(0, Math.min(i2, 255));
    }

    private static int a(long j2, long j3, int i2) {
        return a((((int) (j2 - j3)) * 255) / i2);
    }

    private static long a(long j2, int i2, int i3) {
        return j2 - ((long) (((255 - i2) * i3) / 255));
    }

    private static long a(long j2, int i2, int i3, int i4) {
        return j2 - ((long) ((i2 * i3) / 255));
    }

    private void a(SpotifyIconDrawable spotifyIconDrawable, Canvas canvas, int i2) {
        int intrinsicWidth = spotifyIconDrawable.getIntrinsicWidth();
        int intrinsicHeight = spotifyIconDrawable.getIntrinsicHeight();
        int i3 = (this.b - intrinsicWidth) / 2;
        int i4 = (this.c - intrinsicHeight) / 2;
        spotifyIconDrawable.setBounds(i3, i4, intrinsicWidth + i3, intrinsicHeight + i4);
        spotifyIconDrawable.setAlpha(i2);
        spotifyIconDrawable.draw(canvas);
    }

    private static int b(long j2, long j3, int i2) {
        return 255 - a((((int) (j2 - j3)) * 255) / i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r10 = this;
            jtz r0 = r10.A
            long r0 = r0.d()
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r2 = r10.B
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r3 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.IDLE
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 255(0xff, float:3.57E-43)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != r3) goto L_0x0022
            int r2 = r10.u
            if (r2 >= r5) goto L_0x0030
            long r2 = r10.x
            int r2 = a(r0, r2, r4)
            r10.u = r2
            goto L_0x002e
        L_0x0022:
            int r2 = r10.u
            if (r2 <= 0) goto L_0x0030
            long r2 = r10.x
            int r2 = b(r0, r2, r4)
            r10.u = r2
        L_0x002e:
            r2 = r0
            goto L_0x0031
        L_0x0030:
            r2 = r6
        L_0x0031:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r4 = r10.B
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r8 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.PROGRESS
            r9 = 300(0x12c, float:4.2E-43)
            if (r4 != r8) goto L_0x006b
            int r2 = r10.v
            if (r2 >= r5) goto L_0x0045
            long r2 = r10.y
            int r2 = a(r0, r2, r9)
            r10.v = r2
        L_0x0045:
            uem r2 = r10.r
            java.lang.Long r2 = r2.a()
            long r2 = r2.longValue()
            long r2 = r2 + r0
            uem r4 = r10.r
            java.lang.Long r4 = r4.c()
            long r4 = r4.longValue()
            long r2 = r2 - r4
            float r2 = (float) r2
            uem r3 = r10.r
            java.lang.Long r3 = r3.b()
            long r3 = r3.longValue()
            float r3 = (float) r3
            float r2 = r2 / r3
            r10.w = r2
            goto L_0x0077
        L_0x006b:
            int r4 = r10.v
            if (r4 <= 0) goto L_0x0078
            long r2 = r10.y
            int r2 = b(r0, r2, r9)
            r10.v = r2
        L_0x0077:
            r2 = r0
        L_0x0078:
            r4 = 16
            long r0 = r0 + r4
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = r10.s
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x008d
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x008d
            r10.scheduleSelf(r10, r0)
            goto L_0x0099
        L_0x008d:
            long r2 = r10.s
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0099
            r10.unscheduleSelf(r10)
            r10.scheduleSelf(r10, r0)
        L_0x0099:
            r10.s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.b():void");
    }

    public void a() {
        int i2;
        this.g.set(0.0f, 0.0f, (float) this.b, (float) this.c);
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        float f2 = (float) width;
        float f3 = (float) height;
        float f4 = f2 / f3;
        int i3 = this.b;
        float f5 = (float) i3;
        int i4 = this.c;
        int i5 = 0;
        if (f4 > f5 / ((float) i4)) {
            i2 = Math.round((f2 - (((float) i3) * (f3 / ((float) i4)))) / 2.0f);
        } else {
            i5 = Math.round((f3 - (((float) i4) * (f2 / ((float) i3)))) / 2.0f);
            i2 = 0;
        }
        this.f.set(i2, i5, width - i2, height - i5);
        float intrinsicWidth = (((float) this.b) - (((float) this.m.getIntrinsicWidth()) * 2.0f)) / 2.0f;
        this.h.set(intrinsicWidth, intrinsicWidth, ((float) this.b) - intrinsicWidth, ((float) this.c) - intrinsicWidth);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.uem r12) {
        /*
            r11 = this;
            jtz r0 = r11.A
            long r0 = r0.d()
            java.lang.Long r2 = r12.b()
            long r2 = r2.longValue()
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0027
            java.lang.Long r2 = r12.a()
            java.lang.Long r3 = r12.b()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x004d
            java.lang.Long r2 = r12.b()
            long r2 = r2.longValue()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0046
            java.lang.Long r2 = r12.a()
            java.lang.Long r3 = r12.b()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r2 == 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r2 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.PROGRESS
            goto L_0x004f
        L_0x004d:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r2 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.State.IDLE
        L_0x004f:
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r3 = r11.B
            if (r3 == r2) goto L_0x0098
            int[] r3 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.AnonymousClass1.a
            int r4 = r2.ordinal()
            r3 = r3[r4]
            r4 = 300(0x12c, float:4.2E-43)
            r5 = 200(0xc8, float:2.8E-43)
            r8 = 2
            if (r3 == r7) goto L_0x006e
            if (r3 == r8) goto L_0x0065
            goto L_0x0076
        L_0x0065:
            int r3 = r11.v
            long r9 = a(r0, r3, r4, r6)
            r11.y = r9
            goto L_0x0076
        L_0x006e:
            int r3 = r11.u
            long r9 = a(r0, r3, r5, r6)
            r11.x = r9
        L_0x0076:
            int[] r3 = com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.AnonymousClass1.a
            com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable$State r6 = r11.B
            int r6 = r6.ordinal()
            r3 = r3[r6]
            if (r3 == r7) goto L_0x008e
            if (r3 == r8) goto L_0x0085
            goto L_0x0096
        L_0x0085:
            int r3 = r11.v
            long r0 = a(r0, r3, r4)
            r11.y = r0
            goto L_0x0096
        L_0x008e:
            int r3 = r11.u
            long r0 = a(r0, r3, r5)
            r11.x = r0
        L_0x0096:
            r11.B = r2
        L_0x0098:
            r11.r = r12
            r11.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcast.ui.trailer.PodcastTrailerOverlayDrawable.a(uem):void");
    }

    public final void draw(Canvas canvas) {
        b();
        int i2 = (this.u * this.t) / 255;
        if (i2 > 0) {
            Rect bounds = getBounds();
            this.k.reset();
            this.k.setScale(((float) bounds.width()) / ((float) this.a.getWidth()), ((float) bounds.height()) / ((float) this.a.getHeight()));
            this.j.setLocalMatrix(this.k);
            this.i.setAlpha(i2);
            this.i.setColorFilter(this.z);
            this.l.set(bounds);
            RectF rectF = this.l;
            int i3 = this.d;
            canvas.drawRoundRect(rectF, (float) i3, (float) i3, this.i);
            this.i.setColorFilter(null);
            a(this.m, canvas, i2);
        }
        int i4 = (this.v * this.t) / 255;
        if (i4 > 0) {
            this.e.setStyle(Style.STROKE);
            this.e.setColor(gd.c(-1, i4));
            this.e.setStrokeWidth(this.p);
            this.e.setAntiAlias(true);
            canvas.drawArc(this.h, -90.0f, this.w * 360.0f, false, this.e);
            a(this.n, canvas, i4);
        }
    }

    public final int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b = rect.width();
        this.c = rect.height();
        a();
    }

    public final void run() {
        invalidateSelf();
        long j2 = this.s;
        if (j2 != Long.MAX_VALUE) {
            scheduleSelf(this, j2);
        }
    }

    public final void setAlpha(int i2) {
        this.t = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        if (z2 && !this.q) {
            this.q = true;
            this.o.a((a) this);
        } else if (!z2 && this.q) {
            this.q = false;
            uel uel = this.o;
            Iterator it = uel.h.iterator();
            while (it.hasNext()) {
                if (this == ((WeakReference) it.next()).get()) {
                    it.remove();
                }
            }
            uel.a();
        }
        return super.setVisible(z2, z3);
    }
}
