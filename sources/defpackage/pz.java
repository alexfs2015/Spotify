package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: pz reason: default package */
public final class pz extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new kt();
    private static final int[] g = {-16777216};
    public final a a = new a();
    public Resources b;
    float c;
    boolean d;
    private float h;
    private Animator i;

    /* renamed from: pz$a */
    public static class a {
        final RectF a = new RectF();
        final Paint b = new Paint();
        final Paint c = new Paint();
        final Paint d = new Paint();
        float e = 0.0f;
        float f = 0.0f;
        float g = 0.0f;
        float h = 5.0f;
        int[] i;
        float j;
        float k;
        float l;
        boolean m;
        Path n;
        float o = 1.0f;
        public float p;
        public int q;
        public int r;
        int s = 255;
        int t;
        private int u;

        a() {
            this.b.setStrokeCap(Cap.SQUARE);
            this.b.setAntiAlias(true);
            this.b.setStyle(Style.STROKE);
            this.c.setStyle(Style.FILL);
            this.c.setAntiAlias(true);
            this.d.setColor(0);
        }

        public final void a(int i2) {
            this.u = i2;
            this.t = this.i[this.u];
        }

        /* access modifiers changed from: 0000 */
        public final int a() {
            return (this.u + 1) % this.i.length;
        }

        public final void a(float f2) {
            this.h = f2;
            this.b.setStrokeWidth(f2);
        }

        /* access modifiers changed from: 0000 */
        public final int b() {
            return this.i[this.u];
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z) {
            if (this.m != z) {
                this.m = z;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            this.j = this.e;
            this.k = this.f;
            this.l = this.g;
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public pz(Context context) {
        this.b = ((Context) hr.a(context)).getResources();
        a aVar = this.a;
        aVar.i = g;
        aVar.a(0);
        this.a.a(2.5f);
        invalidateSelf();
        final a aVar2 = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pz.this.a(floatValue, aVar2);
                pz.this.a(floatValue, aVar2, false);
                pz.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                pz.this.c = 0.0f;
            }

            public final void onAnimationRepeat(Animator animator) {
                pz.this.a(1.0f, aVar2, true);
                aVar2.c();
                a aVar = aVar2;
                aVar.a(aVar.a());
                if (pz.this.d) {
                    pz.this.d = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar2.a(false);
                    return;
                }
                pz.this.c += 1.0f;
            }
        });
        this.i = ofFloat;
    }

    public final void a(boolean z) {
        this.a.a(z);
        invalidateSelf();
    }

    public final void a(float f2) {
        a aVar = this.a;
        if (f2 != aVar.o) {
            aVar.o = f2;
        }
        invalidateSelf();
    }

    public final void a(float f2, float f3) {
        a aVar = this.a;
        aVar.e = 0.0f;
        aVar.f = f3;
        invalidateSelf();
    }

    public final void b(float f2) {
        this.a.g = f2;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.a;
        RectF rectF = aVar.a;
        float f2 = aVar.p + (aVar.h / 2.0f);
        if (aVar.p <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.q) * aVar.o) / 2.0f, aVar.h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = (aVar.e + aVar.g) * 360.0f;
        float f4 = ((aVar.f + aVar.g) * 360.0f) - f3;
        aVar.b.setColor(aVar.t);
        aVar.b.setAlpha(aVar.s);
        float f5 = aVar.h / 2.0f;
        rectF.inset(f5, f5);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.d);
        float f6 = -f5;
        rectF.inset(f6, f6);
        canvas.drawArc(rectF, f3, f4, false, aVar.b);
        if (aVar.m) {
            if (aVar.n == null) {
                aVar.n = new Path();
                aVar.n.setFillType(FillType.EVEN_ODD);
            } else {
                aVar.n.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f7 = (((float) aVar.q) * aVar.o) / 2.0f;
            aVar.n.moveTo(0.0f, 0.0f);
            aVar.n.lineTo(((float) aVar.q) * aVar.o, 0.0f);
            aVar.n.lineTo((((float) aVar.q) * aVar.o) / 2.0f, ((float) aVar.r) * aVar.o);
            aVar.n.offset((min + rectF.centerX()) - f7, rectF.centerY() + (aVar.h / 2.0f));
            aVar.n.close();
            aVar.c.setColor(aVar.t);
            aVar.c.setAlpha(aVar.s);
            canvas.save();
            canvas.rotate(f3 + f4, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.n, aVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void setAlpha(int i2) {
        this.a.s = i2;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.a.s;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean isRunning() {
        return this.i.isRunning();
    }

    public final void start() {
        this.i.cancel();
        this.a.c();
        if (this.a.f != this.a.e) {
            this.d = true;
            this.i.setDuration(666);
            this.i.start();
            return;
        }
        this.a.a(0);
        this.a.d();
        this.i.setDuration(1332);
        this.i.start();
    }

    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.a(false);
        this.a.a(0);
        this.a.d();
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    public final void a(float f2, a aVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int b2 = aVar.b();
            int i2 = aVar.i[aVar.a()];
            int i3 = b2 >>> 24;
            int i4 = (b2 >> 16) & 255;
            int i5 = (b2 >> 8) & 255;
            int i6 = b2 & 255;
            aVar.t = ((i3 + ((int) (((float) ((i2 >>> 24) - i3)) * f3))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f3))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f3))) << 8) | (i6 + ((int) (f3 * ((float) ((i2 & 255) - i6)))));
            return;
        }
        aVar.t = aVar.b();
    }

    /* access modifiers changed from: 0000 */
    public final void a(float f2, a aVar, boolean z) {
        float f3;
        float f4;
        if (this.d) {
            a(f2, aVar);
            float floor = (float) (Math.floor((double) (aVar.l / 0.8f)) + 1.0d);
            aVar.e = aVar.j + (((aVar.k - 0.01f) - aVar.j) * f2);
            aVar.f = aVar.k;
            aVar.g = aVar.l + ((floor - aVar.l) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f5 = aVar.l;
            if (f2 < 0.5f) {
                float f6 = f2 / 0.5f;
                float f7 = aVar.j;
                float f8 = f7;
                f3 = (f.getInterpolation(f6) * 0.79f) + 0.01f + f7;
                f4 = f8;
            } else {
                f3 = aVar.j + 0.79f;
                f4 = f3 - (((1.0f - f.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f9 = f5 + (0.20999998f * f2);
            float f10 = (f2 + this.c) * 216.0f;
            aVar.e = f4;
            aVar.f = f3;
            aVar.g = f9;
            this.h = f10;
        }
    }
}
