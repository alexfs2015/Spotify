package com.spotify.mobile.android.wrapped2019.stories.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class PerspectiveImageStack extends View {
    private final Paint a;
    private float b;
    private float c;
    private boolean d;
    private PointF e;
    private PointF f;
    private List<a> g;

    static class a {
        final Bitmap a;
        final Matrix b;
        final RectF c;
        float d;
        float e;

        private a(Bitmap bitmap) {
            this.b = new Matrix();
            this.c = new RectF();
            this.d = 1.0f;
            this.e = 1.0f;
            this.a = bitmap;
        }

        /* synthetic */ a(Bitmap bitmap, byte b2) {
            this(bitmap);
        }

        /* access modifiers changed from: private */
        public void a(float f, float f2, float f3, float f4) {
            this.c.set(f, f2, f3, f4);
            a();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.b.reset();
            this.b.postScale(this.c.width() / ((float) this.a.getWidth()), this.c.height() / ((float) this.a.getHeight()));
            Matrix matrix = this.b;
            float f = this.e;
            matrix.postScale(f, f, this.c.width() / 2.0f, this.c.height() / 2.0f);
            this.b.postTranslate(this.c.left, this.c.top);
        }
    }

    public PerspectiveImageStack(Context context) {
        this(context, null, 0);
    }

    public PerspectiveImageStack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PerspectiveImageStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.c = -1.0f;
        this.e = new PointF();
        this.g = Collections.emptyList();
        a(context, attributeSet, 0, 0);
    }

    public PerspectiveImageStack(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Paint();
        this.c = -1.0f;
        this.e = new PointF();
        this.g = Collections.emptyList();
        a(context, attributeSet, i, i2);
    }

    private static double a(float f2, float f3, float f4, float f5) {
        return Math.sqrt(Math.pow((double) (f4 - f2), 2.0d) + Math.pow((double) (f5 - f3), 2.0d));
    }

    private static float a(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    private a a(int i) {
        if (i >= 0) {
            if (i < this.g.size()) {
                return (a) this.g.get(i);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(Bitmap bitmap) {
        return new a(bitmap, 0);
    }

    private static void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, PointF pointF) {
        float f10 = (f5 - f3) / (f4 - f2);
        float f11 = (f9 - f7) / (f8 - f6);
        float f12 = f3 - (f2 * f10);
        float f13 = ((f7 - (f6 * f11)) - f12) / (f10 - f11);
        pointF.set(f13, (f10 * f13) + f12);
    }

    private void a(int i, int i2) {
        if (!g()) {
            b(i, i2);
            c();
            d();
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.kfo.a.d, i, i2);
        try {
            this.b = (float) obtainStyledAttributes.getDimensionPixelSize(defpackage.kfo.a.f, 200);
            this.d = obtainStyledAttributes.getBoolean(defpackage.kfo.a.e, true);
            this.e.set(obtainStyledAttributes.getDimension(defpackage.kfo.a.i, 0.0f), obtainStyledAttributes.getDimension(defpackage.kfo.a.j, 0.0f));
            if (obtainStyledAttributes.hasValue(defpackage.kfo.a.g) && obtainStyledAttributes.hasValue(defpackage.kfo.a.h)) {
                this.f = new PointF(obtainStyledAttributes.getDimension(defpackage.kfo.a.g, 0.0f), obtainStyledAttributes.getDimension(defpackage.kfo.a.h, 0.0f));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static float b(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    private void b() {
        a(getWidth(), getHeight());
    }

    private void b(int i, int i2) {
        float f2;
        float f3;
        float f4;
        float f5 = this.b / 2.0f;
        if (e()) {
            f3 = (((float) i) - f5) - this.e.x;
            f2 = ((float) i2) - f5;
            f5 = this.e.y;
        } else {
            f3 = this.f.x - f5;
            f2 = this.f.y;
        }
        float f6 = f2 - f5;
        if (this.d) {
            f4 = Math.max(feu.a(f3, (((float) i) - this.b) - ((float) ip.j(this))), (float) ip.i(this));
            f6 = Math.max(feu.a(f6, (((float) i2) - this.b) - ((float) getPaddingBottom())), (float) getPaddingTop());
        } else {
            float f7 = f3;
            f4 = f3;
        }
        a a2 = a(0);
        if (a2 != null) {
            float f8 = this.b;
            a2.a(f4, f6, f4 + f8, f8 + f6);
        }
    }

    private void c() {
        a a2 = a(0);
        if (a2 != null) {
            RectF rectF = a2.c;
            float a3 = (float) a(rectF.left + (this.b / 2.0f), rectF.top + (this.b / 2.0f), this.e.x, this.e.y);
            float f2 = this.c;
            if (f()) {
                f2 = (a3 / ((float) h())) / (a3 * 2.0f);
            }
            a a4 = a(1);
            float a5 = a(rectF.left, this.e.x, f2);
            float b2 = b(rectF.top, this.e.y, f2);
            float a6 = a(rectF.right, this.e.x, f2);
            float b3 = b(rectF.bottom, this.e.y, f2);
            if (a4 != null) {
                a4.a(a5, b2, a6, b3);
            }
        }
    }

    private void d() {
        for (int i = 2; i < h(); i++) {
            a a2 = a(i);
            a a3 = a(i - 2);
            a a4 = a(i - 1);
            PointF pointF = new PointF();
            PointF pointF2 = new PointF();
            if (!(a2 == null || a3 == null || a4 == null)) {
                float height = a4.c.top + (a4.c.height() / 2.0f);
                float f2 = height;
                float f3 = height;
                PointF pointF3 = pointF;
                a(a3.c.left, a3.c.top, a4.c.left, f3, a3.c.left, a3.c.bottom, this.e.x, this.e.y, pointF);
                PointF pointF4 = pointF2;
                a(a3.c.right, a3.c.bottom, a4.c.right, f3, a3.c.right, a3.c.top, this.e.x, this.e.y, pointF2);
                a2.a(pointF.x, pointF2.y, pointF2.x, pointF.y);
            }
        }
    }

    private boolean e() {
        return this.f == null;
    }

    private boolean f() {
        return this.c == -1.0f;
    }

    private boolean g() {
        return this.g.isEmpty();
    }

    private int h() {
        return this.g.size();
    }

    public final int a() {
        return this.g.size();
    }

    public final void a(int i, float f2) {
        a a2 = a(i);
        if (a2 != null) {
            a2.d = f2;
            a2.a();
            invalidate();
        }
    }

    public final void a(Bitmap bitmap, int i) {
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        for (int i2 = 0; i2 < i; i2++) {
            g2.c(new a(bitmap, 0));
        }
        this.g = g2.a();
        b();
        invalidate();
    }

    public final void a(List<Bitmap> list) {
        this.g = ImmutableList.a(fcp.a((Iterable<E>) list).a((Function<? super E, T>) $$Lambda$PerspectiveImageStack$tFmU3NlyphbvX8wJxUo34lW8Xw.INSTANCE).a());
        b();
        invalidate();
    }

    public final void b(int i, float f2) {
        a a2 = a(i);
        if (a2 != null) {
            a2.e = f2;
            a2.a();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int h = h() - 1; h >= 0; h--) {
            a a2 = a(h);
            if (a2 != null) {
                Paint paint = this.a;
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (a2.d * 255.0f));
                canvas.drawBitmap(a2.a, a2.b, paint);
                paint.setAlpha(alpha);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }
}
