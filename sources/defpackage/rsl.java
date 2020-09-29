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

/* renamed from: rsl reason: default package */
public final class rsl extends Drawable {
    public final rsn a;
    public final rso b;
    public final rsb c;
    private final Paint d;
    private final Matrix e;
    private final int f;

    public rsl(Context context, int i) {
        this(new rsn(), new rso(context), context.getResources().getDimensionPixelSize(i), new Matrix());
    }

    private rsl(rsn rsn, rso rso, int i, Matrix matrix) {
        this.d = new Paint(1);
        this.f = i;
        this.a = rsn;
        this.b = rso;
        this.e = matrix;
        this.c = new rsb(this);
    }

    public final void draw(Canvas canvas) {
        ValueAnimator valueAnimator = this.c.a;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        if (this.a.a()) {
            this.a.a(canvas, this.d, animatedFraction, (float) this.f);
        }
        rso rso = this.b;
        Paint paint = this.d;
        float f2 = (float) this.f;
        paint.setAlpha((int) (animatedFraction * 255.0f));
        paint.setShader(rso.c);
        canvas.drawRoundRect(rso.d, f2, f2, rso.b);
        canvas.drawRoundRect(rso.d, f2, f2, rso.a);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Rect bounds = getBounds();
        this.a.a(bounds);
        this.b.a(bounds);
        RectF rectF = new RectF(bounds);
        this.e.reset();
        this.e.setScale(rectF.width(), rectF.height());
        rso rso = this.b;
        rso.c.setLocalMatrix(this.e);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
