package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

class OuterHighlightDrawable extends Drawable {
    private final Paint a;
    private float b;
    private float c;
    private float d;

    public void draw(Canvas canvas) {
        canvas.drawCircle(this.c + 0.0f, this.d + 0.0f, this.b * 0.0f, this.a);
    }

    public int getAlpha() {
        return this.a.getAlpha();
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

    public void setScale(float f) {
        this.b = f;
        invalidateSelf();
    }

    public void setTranslationX(float f) {
        this.c = f;
        invalidateSelf();
    }

    public void setTranslationY(float f) {
        this.d = f;
        invalidateSelf();
    }
}
