package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* renamed from: fap reason: default package */
public final class fap extends ae {
    private static double e = Math.cos(Math.toRadians(45.0d));
    public float b;
    public boolean c = true;
    public float d;
    private Paint f;
    private Paint g;
    private RectF h;
    private float i;
    private Path j;
    private float k;
    private float l;
    private float m;
    private boolean n = true;
    private final int o;
    private final int p;
    private final int q;
    private boolean r = false;

    public fap(Context context, Drawable drawable, float f2, float f3, float f4) {
        super(drawable);
        this.o = fr.c(context, R.color.design_fab_shadow_start_color);
        this.p = fr.c(context, R.color.design_fab_shadow_mid_color);
        this.q = fr.c(context, R.color.design_fab_shadow_end_color);
        this.f = new Paint(5);
        this.f.setStyle(Style.FILL);
        this.i = (float) Math.round(f2);
        this.h = new RectF();
        this.g = new Paint(this.f);
        this.g.setAntiAlias(false);
        a(f3, f4);
    }

    public static float a(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        double d2 = (double) (f2 * 1.5f);
        double d3 = 1.0d - e;
        double d4 = (double) f3;
        Double.isNaN(d4);
        double d5 = d3 * d4;
        Double.isNaN(d2);
        return (float) (d2 + d5);
    }

    public static float b(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = (double) f2;
        double d3 = 1.0d - e;
        double d4 = (double) f3;
        Double.isNaN(d4);
        double d5 = d3 * d4;
        Double.isNaN(d2);
        return (float) (d2 + d5);
    }

    private static int b(float f2) {
        int round = Math.round(f2);
        return round % 2 == 1 ? round - 1 : round;
    }

    public final void a(float f2) {
        a(f2, this.l);
    }

    public final void a(float f2, float f3) {
        if (f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b2 = (float) b(f2);
        float b3 = (float) b(f3);
        if (b2 > b3) {
            if (!this.r) {
                this.r = true;
            }
            b2 = b3;
        }
        if (this.b != b2 || this.l != b3) {
            this.b = b2;
            this.l = b3;
            this.m = (float) Math.round(b2 * 1.5f);
            this.k = b3;
            this.n = true;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        boolean z;
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        if (this.n) {
            Rect bounds = getBounds();
            float f2 = this.l * 1.5f;
            this.h.set(((float) bounds.left) + this.l, ((float) bounds.top) + f2, ((float) bounds.right) - this.l, ((float) bounds.bottom) - f2);
            this.a.setBounds((int) this.h.left, (int) this.h.top, (int) this.h.right, (int) this.h.bottom);
            float f3 = this.i;
            RectF rectF = new RectF(-f3, -f3, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f4 = this.m;
            rectF2.inset(-f4, -f4);
            Path path = this.j;
            if (path == null) {
                this.j = new Path();
            } else {
                path.reset();
            }
            this.j.setFillType(FillType.EVEN_ODD);
            this.j.moveTo(-this.i, 0.0f);
            this.j.rLineTo(-this.m, 0.0f);
            this.j.arcTo(rectF2, 180.0f, 90.0f, false);
            this.j.arcTo(rectF, 270.0f, -90.0f, false);
            this.j.close();
            float f5 = -rectF2.top;
            if (f5 > 0.0f) {
                float f6 = this.i / f5;
                float f7 = ((1.0f - f6) / 2.0f) + f6;
                Paint paint = this.f;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f5, new int[]{0, this.o, this.p, this.q}, new float[]{0.0f, f6, f7, 1.0f}, TileMode.CLAMP);
                paint.setShader(radialGradient);
            }
            Paint paint2 = this.g;
            z = true;
            LinearGradient linearGradient = new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.o, this.p, this.q}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
            paint2.setShader(linearGradient);
            this.g.setAntiAlias(false);
            this.n = false;
        } else {
            z = true;
        }
        int save = canvas.save();
        canvas2.rotate(this.d, this.h.centerX(), this.h.centerY());
        float f8 = this.i;
        float f9 = (-f8) - this.m;
        float f10 = f8 * 2.0f;
        boolean z2 = this.h.width() - f10 > 0.0f;
        if (this.h.height() - f10 <= 0.0f) {
            z = false;
        }
        float f11 = this.b;
        float f12 = f8 / ((f11 - (0.5f * f11)) + f8);
        float f13 = f8 / ((f11 - (0.25f * f11)) + f8);
        float f14 = f8 / ((f11 - f11) + f8);
        int save2 = canvas.save();
        canvas2.translate(this.h.left + f8, this.h.top + f8);
        canvas2.scale(f12, f13);
        canvas2.drawPath(this.j, this.f);
        if (z2) {
            canvas2.scale(1.0f / f12, 1.0f);
            i2 = save;
            i3 = save2;
            canvas.drawRect(0.0f, f9, this.h.width() - f10, -this.i, this.g);
        } else {
            i2 = save;
            i3 = save2;
        }
        canvas2.restoreToCount(i3);
        int save3 = canvas.save();
        canvas2.translate(this.h.right - f8, this.h.bottom - f8);
        canvas2.scale(f12, f14);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.j, this.f);
        if (z2) {
            canvas2.scale(1.0f / f12, 1.0f);
            canvas.drawRect(0.0f, f9, this.h.width() - f10, (-this.i) + this.m, this.g);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.h.left + f8, this.h.bottom - f8);
        canvas2.scale(f12, f14);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.j, this.f);
        if (z) {
            canvas2.scale(1.0f / f14, 1.0f);
            canvas.drawRect(0.0f, f9, this.h.height() - f10, -this.i, this.g);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.h.right - f8, this.h.top + f8);
        canvas2.scale(f12, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.j, this.f);
        if (z) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f9, this.h.height() - f10, -this.i, this.g);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i2);
        super.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) a(this.l, this.i, this.c));
        int ceil2 = (int) Math.ceil((double) b(this.l, this.i, this.c));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    public final void setAlpha(int i2) {
        super.setAlpha(i2);
        this.f.setAlpha(i2);
        this.g.setAlpha(i2);
    }
}
