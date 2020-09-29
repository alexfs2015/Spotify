package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: rjj reason: default package */
public final class rjj extends Drawable {
    public final rjl a;
    public final rjm b;
    public final riz c;
    private final Paint d;
    private final Matrix e;
    private final int f;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public rjj(Context context, int i) {
        this(new rjl(), new rjm(context), context.getResources().getDimensionPixelSize(i), new Matrix());
    }

    private rjj(rjl rjl, rjm rjm, int i, Matrix matrix) {
        this.d = new Paint(1);
        this.f = i;
        this.a = rjl;
        this.b = rjm;
        this.e = matrix;
        this.c = new riz(this);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Rect bounds = getBounds();
        this.a.a(bounds);
        this.b.a(bounds);
        RectF rectF = new RectF(bounds);
        this.e.reset();
        this.e.setScale(rectF.width(), rectF.height());
        rjm rjm = this.b;
        rjm.c.setLocalMatrix(this.e);
    }

    public final void draw(Canvas canvas) {
        float f2;
        ValueAnimator valueAnimator = this.c.a;
        if (valueAnimator != null) {
            f2 = valueAnimator.getAnimatedFraction();
        } else {
            f2 = 0.0f;
        }
        if (this.a.a()) {
            this.a.a(canvas, this.d, f2, (float) this.f);
        }
        rjm rjm = this.b;
        Paint paint = this.d;
        float f3 = (float) this.f;
        paint.setAlpha((int) (f2 * 255.0f));
        paint.setShader(rjm.c);
        canvas.drawRoundRect(rjm.d, f3, f3, rjm.b);
        canvas.drawRoundRect(rjm.d, f3, f3, rjm.a);
    }
}
