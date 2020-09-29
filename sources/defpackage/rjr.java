package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: rjr reason: default package */
final class rjr extends Drawable {
    private final int a;
    private final Paint b = new Paint(1);
    private final int c;
    private final int d;
    private final float e;
    private final int f;
    private Shader g;
    private Shader h;

    public final int getOpacity() {
        return -3;
    }

    public rjr(int i, int i2, int i3, float f2, int i4) {
        this.f = i4;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        if (this.g == null) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) (this.f == 0 ? 0 : canvas.getWidth()), (float) this.a, this.c, this.d, TileMode.CLAMP);
            this.g = linearGradient;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.a, Color.argb((int) (this.e * 255.0f), 0, 0, 0), this.d, TileMode.CLAMP);
            this.h = linearGradient2;
        }
        this.b.setShader(this.g);
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) this.a, this.b);
        this.b.setShader(this.h);
        canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) this.a, this.b);
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
