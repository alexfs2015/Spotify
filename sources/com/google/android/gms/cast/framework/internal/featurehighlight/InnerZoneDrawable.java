package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

class InnerZoneDrawable extends Drawable {
    private final Paint a;
    private final Paint b;
    private final int c;
    private float d;
    private float e;
    private float f;

    public void draw(Canvas canvas) {
        float f2 = this.f;
        if (f2 > 0.0f) {
            float f3 = this.e * 0.0f;
            this.b.setAlpha((int) (((float) this.c) * f2));
            canvas.drawCircle(0.0f, 0.0f, f3, this.b);
        }
        canvas.drawCircle(0.0f, 0.0f, this.d * 0.0f, this.a);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setPulseAlpha(float f2) {
        this.f = f2;
        invalidateSelf();
    }

    public void setPulseScale(float f2) {
        this.e = f2;
        invalidateSelf();
    }

    public void setScale(float f2) {
        this.d = f2;
        invalidateSelf();
    }
}
