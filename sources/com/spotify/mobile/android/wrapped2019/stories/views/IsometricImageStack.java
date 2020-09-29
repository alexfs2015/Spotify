package com.spotify.mobile.android.wrapped2019.stories.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class IsometricImageStack extends View {
    public int a;
    public int b;
    private final Paint c;
    private List<a> d;
    private final PointF e;
    private final PointF f;
    private float g;
    private float h;

    static class a {
        final Bitmap a;
        final Matrix b;

        /* synthetic */ a(Bitmap bitmap, byte b2) {
            this(bitmap);
        }

        private a(Bitmap bitmap) {
            this.a = bitmap;
            this.b = new Matrix();
        }
    }

    public IsometricImageStack(Context context) {
        this(context, null, 0);
    }

    public IsometricImageStack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IsometricImageStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Paint();
        this.d = Collections.emptyList();
        this.e = new PointF();
        this.f = new PointF();
        this.a = -1;
        this.b = -1;
        a(context, attributeSet, i, 0);
    }

    public IsometricImageStack(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new Paint();
        this.d = Collections.emptyList();
        this.e = new PointF();
        this.f = new PointF();
        this.a = -1;
        this.b = -1;
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.kdn.a.a, i, i2);
        try {
            this.g = obtainStyledAttributes.getDimension(defpackage.kdn.a.c, 200.0f);
            this.h = obtainStyledAttributes.getDimension(defpackage.kdn.a.b, 64.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(Bitmap bitmap) {
        return new a(bitmap, 0);
    }

    public final void a(List<Bitmap> list) {
        this.d = Lists.a(list, $$Lambda$IsometricImageStack$zRKWRGcKYx5XYjGkSS2XS43Suc.INSTANCE);
        a(getWidth(), getHeight());
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }

    private void a(int i, int i2) {
        float f2 = ((float) i) / 2.0f;
        float f3 = ((float) i2) / 2.0f;
        float f4 = this.h / 2.0f;
        double size = (double) this.d.size();
        Double.isNaN(size);
        float floor = this.h * ((float) ((int) Math.floor((size - 1.0d) / 2.0d)));
        this.e.set(f2 + f4 + floor, (f3 - f4) - floor);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f.set(this.e);
        int i = 0;
        while (i < this.d.size()) {
            a aVar = (a) this.d.get(i);
            float f2 = this.f.x;
            float f3 = this.f.y;
            float f4 = this.g;
            float f5 = (this.b == i || this.a != i) ? 0.0f : 1.0f;
            Paint paint = this.c;
            float width = (float) aVar.a.getWidth();
            float height = (float) aVar.a.getHeight();
            float f6 = width / 2.0f;
            float f7 = height / 2.0f;
            float f8 = 0.94f * f4;
            float f9 = f4 * 1.26f;
            aVar.b.reset();
            aVar.b.postScale(f4 / width, (f4 / height) * 0.86062f);
            aVar.b.postSkew(0.364f, 0.0f, f6, f7);
            aVar.b.postRotate(20.0f, f6, f7);
            aVar.b.postTranslate(width * -0.029f, height * 0.205f);
            aVar.b.postTranslate((-f8) / 2.0f, (-f9) / 2.0f);
            aVar.b.postTranslate(f2, f3);
            if (f5 > 0.0f) {
                float f10 = (f5 * 0.2f) + 1.0f;
                float f11 = (f9 * f10) - f9;
                aVar.b.postScale(f10, f10, f2, f3 + (f9 / 2.0f));
                aVar.b.postTranslate(0.0f, f11 / 8.0f);
            }
            canvas.drawBitmap(aVar.a, aVar.b, paint);
            PointF pointF = this.f;
            float f12 = this.h;
            pointF.offset(-f12, f12);
            i++;
        }
    }
}
