package com.spotify.music.preview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class PreviewOverlayDrawable extends Drawable implements Runnable, a {
    private final ColorFilter A;
    private final jrp B;
    private final boolean C;
    private State D = State.IDLE;
    public Bitmap a;
    private int b;
    private int c;
    private final Drawable d;
    private final String e;
    private final String f;
    private final int g;
    private final Paint h = new Paint();
    private final Rect i = new Rect();
    private final RectF j = new RectF();
    private final RectF k = new RectF();
    private final SpotifyIconDrawable l;
    private final SpotifyIconDrawable m;
    private final twz n;
    private final float o;
    private boolean p;
    private txh q;
    private long r = Long.MAX_VALUE;
    private int s = 255;
    private int t = 255;
    private int u;
    private int v;
    private float w;
    private long x;
    private long y;
    private long z;

    /* renamed from: com.spotify.music.preview.PreviewOverlayDrawable$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.preview.PreviewOverlayDrawable$State[] r0 = com.spotify.music.preview.PreviewOverlayDrawable.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.preview.PreviewOverlayDrawable$State r1 = com.spotify.music.preview.PreviewOverlayDrawable.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.preview.PreviewOverlayDrawable$State r1 = com.spotify.music.preview.PreviewOverlayDrawable.State.LOADING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.preview.PreviewOverlayDrawable$State r1 = com.spotify.music.preview.PreviewOverlayDrawable.State.PROGRESS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.preview.PreviewOverlayDrawable.AnonymousClass1.<clinit>():void");
        }
    }

    enum State {
        IDLE,
        LOADING,
        PROGRESS
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public PreviewOverlayDrawable(Bitmap bitmap, int i2, int i3, int i4, SpotifyIconDrawable spotifyIconDrawable, SpotifyIconDrawable spotifyIconDrawable2, float f2, Drawable drawable, String str, String str2, boolean z2, twz twz, jrp jrp, boolean z3) {
        this.a = bitmap;
        this.b = i2;
        this.c = i3;
        this.l = spotifyIconDrawable;
        this.m = spotifyIconDrawable2;
        this.o = f2;
        this.d = drawable;
        this.e = str;
        this.f = str2;
        this.n = twz;
        this.B = jrp;
        this.C = z3;
        this.g = i4;
        a();
        int round = Math.round((z2 ? 0.4f : 0.8f) * 255.0f);
        this.A = new LightingColorFilter(Color.rgb(round, round, round), 0);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b = rect.width();
        this.c = rect.height();
        a();
    }

    public final void draw(Canvas canvas) {
        b();
        int i2 = (this.t * this.s) / 255;
        if (i2 > 0) {
            this.h.setAlpha(i2);
            if (this.C && this.l != null) {
                this.h.setColorFilter(this.A);
            }
            if (this.g > 0) {
                Path path = new Path();
                RectF rectF = this.j;
                int i3 = this.g;
                path.addRoundRect(rectF, (float) i3, (float) i3, Direction.CW);
                canvas.clipPath(path);
            }
            canvas.drawBitmap(this.a, this.i, this.j, this.h);
            this.h.setColorFilter(null);
            if (!TextUtils.isEmpty(this.e) && this.C) {
                SpotifyIconDrawable spotifyIconDrawable = this.l;
                if (spotifyIconDrawable != null) {
                    a(spotifyIconDrawable, canvas, i2);
                }
            }
        }
        if ((this.u * this.s) / 255 > 0) {
            int d2 = ((((int) this.B.d()) % 2000) * 10000) / 2000;
            this.d.setBounds(0, 0, this.b, this.c);
            this.d.setAlpha(this.u);
            this.d.setLevel(d2);
            this.d.draw(canvas);
        }
        int i4 = (this.v * this.s) / 255;
        if (i4 > 0) {
            this.h.setStyle(Style.STROKE);
            this.h.setColor(gd.c(-1, i4));
            this.h.setStrokeWidth(this.o);
            this.h.setAntiAlias(true);
            canvas.drawArc(this.k, -90.0f, this.w * 360.0f, false, this.h);
            a(this.m, canvas, i4);
        }
    }

    public final void a(txh txh) {
        State state;
        long d2 = this.B.d();
        if (!txh.a().equals(this.e)) {
            state = State.IDLE;
        } else if (TextUtils.isEmpty(this.f) || this.f.equals(txh.b())) {
            if (txh.h()) {
                if (!(!TextUtils.isEmpty(txh.a()) && txh.e().longValue() > 0 && txh.d().equals(txh.e()))) {
                    if (txh.c()) {
                        state = State.LOADING;
                    } else {
                        state = State.PROGRESS;
                    }
                }
            }
            state = State.IDLE;
        } else {
            state = State.IDLE;
        }
        if (this.D != state) {
            int i2 = AnonymousClass1.a[state.ordinal()];
            if (i2 == 1) {
                this.x = a(d2, this.t, 200, 0);
            } else if (i2 == 2) {
                this.z = a(d2, this.u, 200, 500);
            } else if (i2 == 3) {
                this.y = a(d2, this.v, 300, 0);
            }
            int i3 = AnonymousClass1.a[this.D.ordinal()];
            if (i3 == 1) {
                this.x = a(d2, this.t, 200);
            } else if (i3 == 2) {
                this.z = a(d2, this.u, 200);
            } else if (i3 == 3) {
                this.y = a(d2, this.v, 300);
            }
            this.D = state;
        }
        this.q = txh;
        b();
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        if (z2 && !this.p) {
            this.p = true;
            this.n.a((a) this);
        } else if (!z2 && this.p) {
            this.p = false;
            twz twz = this.n;
            Iterator it = twz.i.iterator();
            while (it.hasNext()) {
                if (this == ((WeakReference) it.next()).get()) {
                    it.remove();
                }
            }
            twz.a();
        }
        return super.setVisible(z2, z3);
    }

    public final void setAlpha(int i2) {
        this.s = i2;
        invalidateSelf();
    }

    public final void run() {
        invalidateSelf();
        long j2 = this.r;
        if (j2 != Long.MAX_VALUE) {
            scheduleSelf(this, j2);
        }
    }

    public void a() {
        int i2;
        this.j.set(0.0f, 0.0f, (float) this.b, (float) this.c);
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
        this.i.set(i2, i5, width - i2, height - i5);
        float intrinsicWidth = (((float) this.b) - (((float) this.m.getIntrinsicWidth()) * 2.0f)) / 2.0f;
        this.k.set(intrinsicWidth, intrinsicWidth, ((float) this.b) - intrinsicWidth, ((float) this.c) - intrinsicWidth);
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r10 = this;
            jrp r0 = r10.B
            long r0 = r0.d()
            com.spotify.music.preview.PreviewOverlayDrawable$State r2 = r10.D
            com.spotify.music.preview.PreviewOverlayDrawable$State r3 = com.spotify.music.preview.PreviewOverlayDrawable.State.IDLE
            r4 = 255(0xff, float:3.57E-43)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x0022
            int r2 = r10.t
            if (r2 >= r4) goto L_0x0030
            long r2 = r10.x
            int r2 = a(r0, r2, r7)
            r10.t = r2
            goto L_0x002e
        L_0x0022:
            int r2 = r10.t
            if (r2 <= 0) goto L_0x0030
            long r2 = r10.x
            int r2 = b(r0, r2, r7)
            r10.t = r2
        L_0x002e:
            r2 = r0
            goto L_0x0031
        L_0x0030:
            r2 = r5
        L_0x0031:
            com.spotify.music.preview.PreviewOverlayDrawable$State r8 = r10.D
            com.spotify.music.preview.PreviewOverlayDrawable$State r9 = com.spotify.music.preview.PreviewOverlayDrawable.State.LOADING
            if (r8 != r9) goto L_0x004b
            int r2 = r10.u
            if (r2 >= r4) goto L_0x0057
            long r2 = r10.z
            int r2 = a(r0, r2, r7)
            r10.u = r2
            int r2 = r10.u
            if (r2 <= 0) goto L_0x0048
            goto L_0x0057
        L_0x0048:
            long r2 = r10.z
            goto L_0x0058
        L_0x004b:
            int r8 = r10.u
            if (r8 <= 0) goto L_0x0058
            long r2 = r10.z
            int r2 = b(r0, r2, r7)
            r10.u = r2
        L_0x0057:
            r2 = r0
        L_0x0058:
            com.spotify.music.preview.PreviewOverlayDrawable$State r7 = r10.D
            com.spotify.music.preview.PreviewOverlayDrawable$State r8 = com.spotify.music.preview.PreviewOverlayDrawable.State.PROGRESS
            r9 = 300(0x12c, float:4.2E-43)
            if (r7 != r8) goto L_0x0092
            int r2 = r10.v
            if (r2 >= r4) goto L_0x006c
            long r2 = r10.y
            int r2 = a(r0, r2, r9)
            r10.v = r2
        L_0x006c:
            txh r2 = r10.q
            java.lang.Long r2 = r2.d()
            long r2 = r2.longValue()
            long r2 = r2 + r0
            txh r4 = r10.q
            java.lang.Long r4 = r4.f()
            long r7 = r4.longValue()
            long r2 = r2 - r7
            float r2 = (float) r2
            txh r3 = r10.q
            java.lang.Long r3 = r3.e()
            long r3 = r3.longValue()
            float r3 = (float) r3
            float r2 = r2 / r3
            r10.w = r2
            goto L_0x009e
        L_0x0092:
            int r4 = r10.v
            if (r4 <= 0) goto L_0x009f
            long r2 = r10.y
            int r2 = b(r0, r2, r9)
            r10.v = r2
        L_0x009e:
            r2 = r0
        L_0x009f:
            r7 = 16
            long r0 = r0 + r7
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = r10.r
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x00b4
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x00b4
            r10.scheduleSelf(r10, r0)
            goto L_0x00c0
        L_0x00b4:
            long r2 = r10.r
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c0
            r10.unscheduleSelf(r10)
            r10.scheduleSelf(r10, r0)
        L_0x00c0:
            r10.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.preview.PreviewOverlayDrawable.b():void");
    }

    private static long a(long j2, int i2, int i3, int i4) {
        if (i4 > 0 && i2 == 0) {
            j2 += (long) i4;
        }
        return j2 - ((long) ((i2 * i3) / 255));
    }

    private static long a(long j2, int i2, int i3) {
        return j2 - ((long) (((255 - i2) * i3) / 255));
    }

    private static int a(long j2, long j3, int i2) {
        return a((((int) (j2 - j3)) * 255) / i2);
    }

    private static int b(long j2, long j3, int i2) {
        return 255 - a((((int) (j2 - j3)) * 255) / i2);
    }

    private static int a(int i2) {
        return Math.max(0, Math.min(i2, 255));
    }
}
