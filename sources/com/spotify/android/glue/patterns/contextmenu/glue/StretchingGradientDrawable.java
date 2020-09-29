package com.spotify.android.glue.patterns.contextmenu.glue;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

public class StretchingGradientDrawable extends Drawable {
    public final Paint a;
    public int b;
    public float c;
    private final LinearGradient d;
    private final Paint e;
    private final Paint f;
    private int g;
    private final Matrix h = new Matrix();

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int a() {
        return this.g + this.b;
    }

    public StretchingGradientDrawable(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, i, i2, TileMode.CLAMP);
        this.d = linearGradient;
        this.e = new Paint(1);
        this.e.setShader(this.d);
        this.f = new Paint();
        this.f.setColor(i2);
        this.a = new Paint();
        this.a.setColor(-16777216);
        this.a.setAlpha(0);
        this.b = 0;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (float) bounds.width(), (float) bounds.height(), this.a);
        canvas.translate(0.0f, this.c);
        canvas.drawRect(0.0f, 0.0f, (float) bounds.width(), (float) bounds.height(), this.e);
        canvas.restore();
    }

    public void setGradientHeight(int i) {
        this.g = i;
        b();
    }

    public void b() {
        this.h.setScale((float) getBounds().width(), (float) a());
        this.d.setLocalMatrix(this.h);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f.getAlpha();
    }

    public void setAlpha(int i) {
        this.e.setAlpha(i);
        this.f.setAlpha(i);
        invalidateSelf();
    }

    public final void a(float f2) {
        this.a.setAlpha((int) (f2 * 255.0f));
    }
}
