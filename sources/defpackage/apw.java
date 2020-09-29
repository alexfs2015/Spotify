package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: apw reason: default package */
public final class apw extends Drawable {
    public ValueAnimator a;
    private final AnimatorUpdateListener b = new AnimatorUpdateListener() {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            apw.this.invalidateSelf();
        }
    };
    private final Paint c = new Paint();
    private final Rect d = new Rect();
    private final Matrix e = new Matrix();
    private apv f;

    public apw() {
        this.c.setAntiAlias(true);
    }

    private void b() {
        RadialGradient radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0) {
            apv apv = this.f;
            if (apv != null) {
                int a2 = apv.a(width);
                int b2 = this.f.b(height);
                boolean z = true;
                if (this.f.f != 1) {
                    if (!(this.f.c == 1 || this.f.c == 3)) {
                        z = false;
                    }
                    if (z) {
                        a2 = 0;
                    }
                    if (!z) {
                        b2 = 0;
                    }
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) a2, (float) b2, this.f.b, this.f.a, TileMode.CLAMP);
                    radialGradient = linearGradient;
                } else {
                    float f2 = ((float) a2) / 2.0f;
                    float f3 = ((float) b2) / 2.0f;
                    double max = (double) Math.max(a2, b2);
                    double sqrt = Math.sqrt(2.0d);
                    Double.isNaN(max);
                    float f4 = (float) (max / sqrt);
                    int[] iArr = this.f.b;
                    RadialGradient radialGradient2 = new RadialGradient(f2, f3, f4, iArr, this.f.a, TileMode.CLAMP);
                    radialGradient = radialGradient2;
                }
                this.c.setShader(radialGradient);
            }
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            apv apv = this.f;
            if (apv != null && apv.o && getCallback() != null) {
                this.a.start();
            }
        }
    }

    public final void a(apv apv) {
        boolean z;
        this.f = apv;
        apv apv2 = this.f;
        if (apv2 != null) {
            this.c.setXfermode(new PorterDuffXfermode(apv2.p ? Mode.DST_IN : Mode.SRC_IN));
        }
        b();
        if (this.f != null) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.a.cancel();
                this.a.removeAllUpdateListeners();
            } else {
                z = false;
            }
            this.a = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (this.f.t / this.f.s)) + 1.0f});
            this.a.setRepeatMode(this.f.r);
            this.a.setRepeatCount(this.f.q);
            this.a.setDuration(this.f.s + this.f.t);
            this.a.addUpdateListener(this.b);
            if (z) {
                this.a.start();
            }
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f2;
        float f3;
        if (this.f != null && this.c.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f.m));
            float height = ((float) this.d.height()) + (((float) this.d.width()) * tan);
            float width = ((float) this.d.width()) + (tan * ((float) this.d.height()));
            ValueAnimator valueAnimator = this.a;
            float f4 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f.c;
            if (i != 1) {
                if (i == 2) {
                    f2 = width + (((-width) - width) * animatedFraction);
                } else if (i != 3) {
                    float f5 = -width;
                    f2 = f5 + ((width - f5) * animatedFraction);
                } else {
                    f3 = height + (((-height) - height) * animatedFraction);
                }
                this.e.reset();
                this.e.setRotate(this.f.m, ((float) this.d.width()) / 2.0f, ((float) this.d.height()) / 2.0f);
                this.e.postTranslate(f2, f4);
                this.c.getShader().setLocalMatrix(this.e);
                canvas.drawRect(this.d, this.c);
            }
            float f6 = -height;
            f3 = f6 + ((height - f6) * animatedFraction);
            f4 = f3;
            f2 = 0.0f;
            this.e.reset();
            this.e.setRotate(this.f.m, ((float) this.d.width()) / 2.0f, ((float) this.d.height()) / 2.0f);
            this.e.postTranslate(f2, f4);
            this.c.getShader().setLocalMatrix(this.e);
            canvas.drawRect(this.d, this.c);
        }
    }

    public final int getOpacity() {
        apv apv = this.f;
        return (apv == null || (!apv.n && !this.f.p)) ? -1 : -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
