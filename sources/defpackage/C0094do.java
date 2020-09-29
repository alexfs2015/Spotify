package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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

/* renamed from: do reason: invalid class name and default package and case insensitive filesystem */
final class C0094do extends Drawable {
    static a a;
    private static final double e = Math.cos(Math.toRadians(45.0d));
    float b;
    boolean c = true;
    boolean d = true;
    private final int f;
    private Paint g;
    private Paint h;
    private Paint i;
    private final RectF j;
    private Path k;
    private float l;
    private float m;
    private float n;
    private ColorStateList o;
    private final int p;
    private final int q;
    private boolean r = false;

    /* renamed from: do$a */
    interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0094do(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.p = resources.getColor(R.color.cardview_shadow_start_color);
        this.q = resources.getColor(R.color.cardview_shadow_end_color);
        this.f = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        this.g = new Paint(5);
        a(colorStateList);
        this.h = new Paint(5);
        this.h.setStyle(Style.FILL);
        this.b = (float) ((int) (f2 + 0.5f));
        this.j = new RectF();
        this.i = new Paint(this.h);
        this.i.setAntiAlias(false);
        String str = ". Must be >= 0";
        if (f3 < 0.0f) {
            StringBuilder sb = new StringBuilder("Invalid shadow size ");
            sb.append(f3);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f4 >= 0.0f) {
            float a2 = (float) a(f3);
            float a3 = (float) a(f4);
            if (a2 > a3) {
                if (!this.r) {
                    this.r = true;
                }
                a2 = a3;
            }
            if (this.n != a2 || this.l != a3) {
                this.n = a2;
                this.l = a3;
                this.m = (float) ((int) ((a2 * 1.5f) + ((float) this.f) + 0.5f));
                this.c = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid max shadow size ");
            sb2.append(f4);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static float a(float f2, float f3, boolean z) {
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

    private static int a(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    static float b(float f2, float f3, boolean z) {
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

    /* access modifiers changed from: 0000 */
    public final float a() {
        float f2 = this.l;
        return (Math.max(f2, this.b + ((float) this.f) + (f2 / 2.0f)) * 2.0f) + ((this.l + ((float) this.f)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.o = colorStateList;
        this.g.setColor(this.o.getColorForState(getState(), this.o.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    public final float b() {
        float f2 = this.l;
        return (Math.max(f2, this.b + ((float) this.f) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.l * 1.5f) + ((float) this.f)) * 2.0f);
    }

    public final void draw(Canvas canvas) {
        int i2;
        Canvas canvas2 = canvas;
        if (this.c) {
            Rect bounds = getBounds();
            float f2 = this.l * 1.5f;
            this.j.set(((float) bounds.left) + this.l, ((float) bounds.top) + f2, ((float) bounds.right) - this.l, ((float) bounds.bottom) - f2);
            float f3 = this.b;
            RectF rectF = new RectF(-f3, -f3, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f4 = this.m;
            rectF2.inset(-f4, -f4);
            Path path = this.k;
            if (path == null) {
                this.k = new Path();
            } else {
                path.reset();
            }
            this.k.setFillType(FillType.EVEN_ODD);
            this.k.moveTo(-this.b, 0.0f);
            this.k.rLineTo(-this.m, 0.0f);
            this.k.arcTo(rectF2, 180.0f, 90.0f, false);
            this.k.arcTo(rectF, 270.0f, -90.0f, false);
            this.k.close();
            float f5 = this.b;
            float f6 = this.m;
            float f7 = f5 / (f5 + f6);
            Paint paint = this.h;
            float f8 = f5 + f6;
            int i3 = this.p;
            RadialGradient radialGradient = r12;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f8, new int[]{i3, i3, this.q}, new float[]{0.0f, f7, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
            Paint paint2 = this.i;
            float f9 = this.b;
            float f10 = -f9;
            float f11 = this.m;
            float f12 = f10 + f11;
            float f13 = (-f9) - f11;
            int i4 = this.p;
            LinearGradient linearGradient = new LinearGradient(0.0f, f12, 0.0f, f13, new int[]{i4, i4, this.q}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
            paint2.setShader(linearGradient);
            this.i.setAntiAlias(false);
            this.c = false;
        }
        canvas2.translate(0.0f, this.n / 2.0f);
        float f14 = this.b;
        float f15 = (-f14) - this.m;
        float f16 = f14 + ((float) this.f) + (this.n / 2.0f);
        float f17 = f16 * 2.0f;
        boolean z = this.j.width() - f17 > 0.0f;
        boolean z2 = this.j.height() - f17 > 0.0f;
        int save = canvas.save();
        canvas2.translate(this.j.left + f16, this.j.top + f16);
        canvas2.drawPath(this.k, this.h);
        if (z) {
            i2 = save;
            canvas.drawRect(0.0f, f15, this.j.width() - f17, -this.b, this.i);
        } else {
            i2 = save;
        }
        canvas2.restoreToCount(i2);
        int save2 = canvas.save();
        canvas2.translate(this.j.right - f16, this.j.bottom - f16);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.k, this.h);
        if (z) {
            canvas.drawRect(0.0f, f15, this.j.width() - f17, (-this.b) + this.m, this.i);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        canvas2.translate(this.j.left + f16, this.j.bottom - f16);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.k, this.h);
        if (z2) {
            canvas.drawRect(0.0f, f15, this.j.height() - f17, -this.b, this.i);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.j.right - f16, this.j.top + f16);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.k, this.h);
        if (z2) {
            canvas.drawRect(0.0f, f15, this.j.height() - f17, -this.b, this.i);
        }
        canvas2.restoreToCount(save4);
        canvas2.translate(0.0f, (-this.n) / 2.0f);
        a.a(canvas2, this.j, this.b, this.g);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) a(this.l, this.b, this.d));
        int ceil2 = (int) Math.ceil((double) b(this.l, this.b, this.d));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.o;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c = true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.o;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.g.getColor() == colorForState) {
            return false;
        }
        this.g.setColor(colorForState);
        this.c = true;
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i2) {
        this.g.setAlpha(i2);
        this.h.setAlpha(i2);
        this.i.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }
}
