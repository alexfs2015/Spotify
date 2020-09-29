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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IsometricImageStack extends View {
    private final Paint a;
    private List<a> b;
    private final PointF c;
    private final PointF d;
    private float e;
    private float f;

    static class a {
        final Bitmap a;
        final Matrix b;
        float c;
        float d;

        private a(Bitmap bitmap) {
            this.a = bitmap;
            this.b = new Matrix();
        }

        /* synthetic */ a(Bitmap bitmap, byte b2) {
            this(bitmap);
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
        this.a = new Paint();
        this.b = Collections.emptyList();
        this.c = new PointF();
        this.d = new PointF();
        a(context, attributeSet, i, 0);
    }

    public IsometricImageStack(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new Paint();
        this.b = Collections.emptyList();
        this.c = new PointF();
        this.d = new PointF();
        a(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(Bitmap bitmap) {
        return new a(bitmap, 0);
    }

    private void a(int i, int i2) {
        float f2 = ((float) i) / 2.0f;
        float f3 = ((float) i2) / 2.0f;
        float f4 = this.f / 2.0f;
        double size = (double) this.b.size();
        Double.isNaN(size);
        float floor = this.f * ((float) ((int) Math.floor((size - 1.0d) / 2.0d)));
        this.c.set(f2 + f4 + floor, (f3 - f4) - floor);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.kfo.a.a, i, i2);
        try {
            this.e = obtainStyledAttributes.getDimension(defpackage.kfo.a.c, 200.0f);
            this.f = obtainStyledAttributes.getDimension(defpackage.kfo.a.b, 64.0f);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(int i, float f2) {
        if (i < 0) {
            return;
        }
        if (i <= this.b.size()) {
            ((a) this.b.get(i)).c = f2;
            invalidate();
        }
    }

    public final void a(List<Bitmap> list) {
        this.b = ImmutableList.a((Collection<? extends E>) Lists.a(list, $$Lambda$IsometricImageStack$zRKWRGcKYx5XYjGkSS2XS43Suc.INSTANCE));
        a(getWidth(), getHeight());
        invalidate();
    }

    public final void b(int i, float f2) {
        if (i < 0) {
            return;
        }
        if (i <= this.b.size()) {
            ((a) this.b.get(i)).d = f2;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d.set(this.c);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            float f2 = this.d.x;
            float f3 = this.d.y;
            float f4 = this.e;
            float width = (float) getWidth();
            Paint paint = this.a;
            float width2 = (float) aVar.a.getWidth();
            float height = (float) aVar.a.getHeight();
            float f5 = width2 / 2.0f;
            float f6 = height / 2.0f;
            float f7 = 0.94f * f4;
            float f8 = 1.26f * f4;
            float f9 = (-aVar.c) * width;
            float f10 = aVar.d * -40.0f;
            aVar.b.reset();
            Iterator it2 = it;
            Iterator it3 = it;
            aVar.b.postScale(f4 / width2, (f4 / height) * 0.86062f);
            aVar.b.postSkew(0.364f, 0.0f, f5, f6);
            aVar.b.postRotate(20.0f, f5, f6);
            aVar.b.postTranslate(width2 * -0.029f, height * 0.205f);
            aVar.b.postTranslate((-f7) / 2.0f, (-f8) / 2.0f);
            aVar.b.postTranslate(f2 - f9, f9 + f3 + f10);
            if (aVar.d > 0.0f) {
                float f11 = (aVar.d * 0.3f) + 1.0f;
                float f12 = (f8 * f11) - f8;
                aVar.b.postScale(f11, f11, f2, f3 + (f8 / 2.0f));
                aVar.b.postTranslate(0.0f, f12 / 8.0f);
            }
            Canvas canvas2 = canvas;
            canvas.drawBitmap(aVar.a, aVar.b, paint);
            PointF pointF = this.d;
            float f13 = this.f;
            pointF.offset(-f13, f13);
            Iterator it4 = it3;
            it = it3;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }
}
