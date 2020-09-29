package com.spotify.music.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class ShimmerLayout extends FrameLayout {
    private int a;
    private Rect b;
    private Paint c;
    private ValueAnimator d;
    private Bitmap e;
    private Bitmap f;
    private Canvas g;
    private boolean h;
    private final int i;
    private final int j;
    private int k;
    private float l;
    private float m;
    private OnPreDrawListener n;

    public ShimmerLayout(Context context) {
        this(context, null);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public ShimmerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.a, 0, 0);
        try {
            this.k = obtainStyledAttributes.getInteger(a.b, 20);
            this.i = obtainStyledAttributes.getInteger(a.c, 1500);
            this.j = obtainStyledAttributes.getColor(a.d, fr.c(getContext(), R.color.shimmer_color));
            this.l = obtainStyledAttributes.getFloat(a.f, 0.5f);
            this.m = obtainStyledAttributes.getFloat(a.e, 0.1f);
            obtainStyledAttributes.recycle();
            float f2 = this.l;
            if (f2 > 0.0f && 1.0f >= f2) {
                this.l = f2;
                b();
            }
            float f3 = this.m;
            if (f3 > 0.0f && 1.0f > f3) {
                this.m = f3;
                b();
            }
            int i3 = this.k;
            if (i3 >= -45 && 45 >= i3) {
                this.k = i3;
                b();
            }
            if (getVisibility() == 0) {
                a();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, int i3, ValueAnimator valueAnimator) {
        this.a = i2 + ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.a + i3 >= 0) {
            invalidate();
        }
    }

    private void b() {
        if (this.h) {
            c();
            a();
        }
    }

    private void c() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.d.removeAllUpdateListeners();
        }
        this.d = null;
        this.c = null;
        this.h = false;
        d();
    }

    private void d() {
        this.g = null;
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f = null;
        }
    }

    private Animator e() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.b == null) {
            this.b = f();
        }
        int width = getWidth();
        int i2 = getWidth() > this.b.width() ? -width : -this.b.width();
        int width2 = this.b.width();
        this.d = ValueAnimator.ofInt(new int[]{0, width - i2});
        this.d.setDuration((long) this.i);
        this.d.setRepeatCount(-1);
        this.d.addUpdateListener(new AnimatorUpdateListener(i2, width2) {
            private final /* synthetic */ int f$1;
            private final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShimmerLayout.this.a(this.f$1, this.f$2, valueAnimator);
            }
        });
        return this.d;
    }

    private Rect f() {
        return new Rect(0, 0, g(), getHeight());
    }

    private int g() {
        double width = (double) getWidth();
        Double.isNaN(width);
        double d2 = width / 2.0d;
        double d3 = (double) this.l;
        Double.isNaN(d3);
        double cos = (d2 * d3) / Math.cos(Math.toRadians((double) Math.abs(this.k)));
        double height = (double) getHeight();
        double tan = Math.tan(Math.toRadians((double) Math.abs(this.k)));
        Double.isNaN(height);
        return (int) (cos + (height * tan));
    }

    public final void a() {
        if (!this.h) {
            if (getWidth() == 0) {
                this.n = new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        ShimmerLayout.this.a();
                        return true;
                    }
                };
                getViewTreeObserver().addOnPreDrawListener(this.n);
                return;
            }
            e().start();
            this.h = true;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.h || getWidth() <= 0 || getHeight() <= 0) {
            Canvas canvas2 = canvas;
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
        if (this.f == null) {
            this.f = Bitmap.createBitmap(this.b.width(), getHeight(), Config.ALPHA_8);
        }
        this.e = this.f;
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            if (this.g == null) {
                this.g = new Canvas(bitmap);
            }
            this.g.drawColor(0, Mode.CLEAR);
            this.g.save();
            this.g.translate((float) (-this.a), 0.0f);
            super.dispatchDraw(this.g);
            this.g.restore();
            if (this.c == null) {
                int i2 = this.j;
                int argb = Color.argb(0, Color.red(i2), Color.green(i2), Color.blue(i2));
                float width = (((float) getWidth()) / 2.0f) * this.l;
                float height = this.k >= 0 ? (float) getHeight() : 0.0f;
                float cos = ((float) Math.cos(Math.toRadians((double) this.k))) * width;
                float sin = height + (((float) Math.sin(Math.toRadians((double) this.k))) * width);
                int i3 = this.j;
                int[] iArr = {argb, i3, i3, argb};
                float[] fArr = new float[4];
                fArr[0] = 0.0f;
                fArr[3] = 1.0f;
                float f2 = this.m;
                fArr[1] = 0.5f - (f2 / 2.0f);
                fArr[2] = (f2 / 2.0f) + 0.5f;
                LinearGradient linearGradient = new LinearGradient(0.0f, height, cos, sin, iArr, fArr, TileMode.CLAMP);
                Bitmap bitmap2 = this.e;
                TileMode tileMode = TileMode.CLAMP;
                ComposeShader composeShader = new ComposeShader(linearGradient, new BitmapShader(bitmap2, tileMode, tileMode), Mode.DST_IN);
                this.c = new Paint();
                this.c.setAntiAlias(true);
                this.c.setDither(true);
                this.c.setFilterBitmap(true);
                this.c.setShader(composeShader);
            }
            canvas.save();
            canvas.translate((float) this.a, 0.0f);
            canvas.drawRect((float) this.b.left, 0.0f, (float) this.b.width(), (float) this.b.height(), this.c);
            canvas.restore();
            this.e = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        c();
        super.onDetachedFromWindow();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            a();
            return;
        }
        if (this.n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.n);
        }
        c();
    }
}
