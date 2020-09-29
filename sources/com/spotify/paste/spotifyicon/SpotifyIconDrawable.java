package com.spotify.paste.spotifyicon;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;

public final class SpotifyIconDrawable extends Drawable {
    /* access modifiers changed from: 0000 */
    public final Paint a;
    private SpotifyIconV2 b;
    private float c;
    /* access modifiers changed from: private */
    public com.spotify.android.paste.graphics.SpotifyIconV2.a d;
    /* access modifiers changed from: private */
    public boolean e;
    private int f;
    private int g;
    /* access modifiers changed from: private */
    public Path h;
    private ColorStateList i;
    /* access modifiers changed from: private */
    public final Rect j;
    /* access modifiers changed from: private */
    public final float[] k;
    /* access modifiers changed from: private */
    public float l;
    /* access modifiers changed from: private */
    public float m;
    private final b n;
    private final c o;
    private final a p;
    private d q;
    private float r;
    private LayoutDirectionOverride s;

    public enum LayoutDirectionOverride {
        DEVICE,
        LTR,
        RTL
    }

    class a implements d {
        private a() {
        }

        /* synthetic */ a(SpotifyIconDrawable spotifyIconDrawable, byte b) {
            this();
        }

        public final void a(Canvas canvas) {
            int save = canvas.save();
            Rect bounds = SpotifyIconDrawable.this.getBounds();
            if (SpotifyIconDrawable.a(SpotifyIconDrawable.this)) {
                SpotifyIconDrawable.b(SpotifyIconDrawable.this).setColor(-16776961);
                canvas.drawRect(bounds, SpotifyIconDrawable.b(SpotifyIconDrawable.this));
            }
            canvas.translate((float) (-SpotifyIconDrawable.this.j.left), ((float) SpotifyIconDrawable.this.j.height()) + ((float) (-SpotifyIconDrawable.this.j.bottom)));
            if (SpotifyIconDrawable.this.e) {
                canvas.drawPath(SpotifyIconDrawable.this.h, SpotifyIconDrawable.this.a);
            } else {
                canvas.drawText(SpotifyIconDrawable.this.a(), 0, 1, 0.0f, 0.0f, SpotifyIconDrawable.this.a);
            }
            canvas.restoreToCount(save);
        }

        public final int a() {
            return SpotifyIconDrawable.this.j.width();
        }

        public final int b() {
            return SpotifyIconDrawable.this.j.height();
        }
    }

    class b implements d {
        private b() {
        }

        /* synthetic */ b(SpotifyIconDrawable spotifyIconDrawable, byte b) {
            this();
        }

        public final void a(Canvas canvas) {
            float f;
            int save = canvas.save();
            Rect bounds = SpotifyIconDrawable.this.getBounds();
            if (SpotifyIconDrawable.a(SpotifyIconDrawable.this)) {
                SpotifyIconDrawable.b(SpotifyIconDrawable.this).setColor(-16776961);
                canvas.drawRect(bounds, SpotifyIconDrawable.b(SpotifyIconDrawable.this));
            }
            canvas.translate((float) bounds.centerX(), (float) bounds.centerY());
            canvas.rotate(SpotifyIconDrawable.c(SpotifyIconDrawable.this));
            canvas.translate(0.0f, -SpotifyIconDrawable.this.m);
            float f2 = SpotifyIconDrawable.this.k[0];
            float f3 = SpotifyIconDrawable.this.l;
            if (f2 / f3 > ((float) bounds.width()) / ((float) bounds.height())) {
                f = f2 / ((float) bounds.width());
            } else {
                f = f3 / ((float) bounds.height());
            }
            if (!SpotifyIconDrawable.this.f() || !SpotifyIconDrawable.this.d.c) {
                canvas.scale(f, f);
            } else {
                canvas.scale(-f, f);
            }
            canvas.translate((-f2) / 2.0f, (-f3) / 2.0f);
            if (SpotifyIconDrawable.a(SpotifyIconDrawable.this)) {
                SpotifyIconDrawable.b(SpotifyIconDrawable.this).setColor(-65536);
                canvas.drawRect(SpotifyIconDrawable.this.j, SpotifyIconDrawable.b(SpotifyIconDrawable.this));
            }
            if (SpotifyIconDrawable.this.e) {
                canvas.drawPath(SpotifyIconDrawable.this.h, SpotifyIconDrawable.this.a);
            } else {
                canvas.drawText(SpotifyIconDrawable.this.a(), 0, 1, 0.0f, 0.0f, SpotifyIconDrawable.this.a);
            }
            canvas.restoreToCount(save);
        }

        public final int b() {
            return (int) Math.ceil((double) SpotifyIconDrawable.this.l);
        }

        public final int a() {
            return (int) Math.ceil((double) SpotifyIconDrawable.this.k[0]);
        }
    }

    class c implements d {
        private int a;
        private int b;
        private int c;
        private int d;

        private c() {
        }

        /* synthetic */ c(SpotifyIconDrawable spotifyIconDrawable, byte b2) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final void a(Canvas canvas) {
            int save = canvas.save();
            Rect bounds = SpotifyIconDrawable.this.getBounds();
            if (SpotifyIconDrawable.a(SpotifyIconDrawable.this)) {
                SpotifyIconDrawable.b(SpotifyIconDrawable.this).setColor(-16776961);
                canvas.drawRect(bounds, SpotifyIconDrawable.b(SpotifyIconDrawable.this));
            }
            canvas.translate((float) (this.a - SpotifyIconDrawable.this.j.left), ((float) this.b) + SpotifyIconDrawable.this.l);
            if (SpotifyIconDrawable.this.e) {
                canvas.drawPath(SpotifyIconDrawable.this.h, SpotifyIconDrawable.this.a);
            } else {
                canvas.drawText(SpotifyIconDrawable.this.a(), 0, 1, 0.0f, 0.0f, SpotifyIconDrawable.this.a);
            }
            canvas.restoreToCount(save);
        }

        public final int a() {
            return (SpotifyIconDrawable.this.j.right - SpotifyIconDrawable.this.j.left) + this.a + this.c;
        }

        public final int b() {
            return this.b + SpotifyIconDrawable.this.j.height() + this.d;
        }
    }

    interface d {
        int a();

        void a(Canvas canvas);

        int b();
    }

    static /* synthetic */ boolean a(SpotifyIconDrawable spotifyIconDrawable) {
        return false;
    }

    static /* synthetic */ Paint b(SpotifyIconDrawable spotifyIconDrawable) {
        return null;
    }

    static /* synthetic */ float c(SpotifyIconDrawable spotifyIconDrawable) {
        return 0.0f;
    }

    public SpotifyIconDrawable(Context context, SpotifyIcon spotifyIcon, float f2) {
        this(context, SpotifyIconV2.a(spotifyIcon), f2);
    }

    public SpotifyIconDrawable(Context context, SpotifyIconV2 spotifyIconV2, float f2) {
        this(context, spotifyIconV2, f2, null);
    }

    private SpotifyIconDrawable(Context context, SpotifyIconV2 spotifyIconV2, float f2, Float f3) {
        this.f = -1;
        this.g = 255;
        this.j = new Rect();
        this.k = new float[1];
        this.n = new b(this, 0);
        this.o = new c(this, 0);
        this.p = new a(this, 0);
        this.q = this.n;
        this.s = LayoutDirectionOverride.DEVICE;
        this.b = spotifyIconV2;
        this.c = f2;
        this.r = context.getResources().getDisplayMetrics().density;
        c();
        Typeface a2 = utw.a(context, "spoticon.ttf");
        this.a = new Paint();
        this.a.setColor(this.f);
        this.a.setTypeface(a2);
        this.a.setTextSize(f2);
        this.a.setTextAlign(Align.LEFT);
        this.a.setAntiAlias(true);
        d();
    }

    public final void a(SpotifyIconV2 spotifyIconV2) {
        this.b = spotifyIconV2;
        c();
        d();
        invalidateSelf();
    }

    public final void a(int i2) {
        this.i = null;
        this.f = i2;
        this.a.setColor(i2);
        e();
        invalidateSelf();
    }

    public final void a(ColorStateList colorStateList) {
        this.i = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    public final boolean isStateful() {
        return this.i != null;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.i;
        if (colorStateList == null) {
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, this.f);
        this.f = colorForState;
        this.a.setColor(colorForState);
        e();
        invalidateSelf();
        return true;
    }

    public final void a(float f2) {
        this.c = f2;
        this.a.setTextSize(f2);
        c();
        d();
        invalidateSelf();
    }

    private void c() {
        this.d = this.b.a(Math.round(this.c / this.r));
    }

    public String a() {
        if (this.d.c) {
            return this.d.a;
        }
        if (f()) {
            return this.d.b;
        }
        return this.d.a;
    }

    private void d() {
        this.a.getTextBounds(this.d.a, 0, 1, this.j);
        this.a.getTextWidths(this.d.a, 0, 1, this.k);
        this.m = this.a.getFontMetrics().top;
        this.l = this.a.getFontMetrics().bottom - this.m;
        if (this.e) {
            this.h.reset();
            this.a.getTextPath(this.d.a, 0, 1, 0.0f, 0.0f, this.h);
            this.h.close();
        }
    }

    private void e() {
        this.a.setAlpha((Color.alpha(this.f) * this.g) / 255);
    }

    public final void a(boolean z) {
        if (!this.e) {
            this.h = new Path();
        }
        this.e = true;
        d();
        invalidateSelf();
    }

    /* access modifiers changed from: private */
    public boolean f() {
        if (this.s == LayoutDirectionOverride.RTL || (this.s == LayoutDirectionOverride.DEVICE && gm.h(this) == 1)) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        this.q.a(canvas);
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.o.a(i2, 0, i4, 0);
        this.q = this.o;
        invalidateSelf();
    }

    public final void b() {
        this.q = this.p;
        invalidateSelf();
    }

    public final void setAlpha(int i2) {
        this.g = i2;
        e();
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.q.b();
    }

    public final int getIntrinsicWidth() {
        return this.q.a();
    }

    public final int getOpacity() {
        Paint paint = this.a;
        if (paint.getXfermode() == null) {
            int alpha = paint.getAlpha();
            if (alpha == 0) {
                return -2;
            }
            if (alpha == 255) {
                return -1;
            }
        }
        return -3;
    }

    public SpotifyIconDrawable(Context context, SpotifyIcon spotifyIcon) {
        this(context, spotifyIcon, (float) uts.b((float) spotifyIcon.mDefaultSize, context.getResources()));
    }
}
