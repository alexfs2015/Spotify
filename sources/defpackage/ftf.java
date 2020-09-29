package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;

/* renamed from: ftf reason: default package */
public final class ftf implements fte {
    private final float a;
    private final Paint b = new Paint(1);
    private final Matrix c = new Matrix();
    private final RectF d = new RectF();
    private Shader e;

    public ftf(int i, int i2, float f) {
        this.a = f;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i, i2, TileMode.CLAMP);
        this.e = linearGradient;
    }

    public final void a(Canvas canvas) {
        canvas.save();
        if (VERSION.SDK_INT > 16 && this.a != 0.0f) {
            this.d.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            this.c.setScale((float) canvas.getWidth(), (float) canvas.getHeight());
            this.e.setLocalMatrix(this.c);
            this.b.setShader(this.e);
            RectF rectF = this.d;
            float f = this.a;
            canvas.drawRoundRect(rectF, f, f, this.b);
        } else {
            canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
            this.b.setShader(this.e);
            canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.b);
        }
        canvas.restore();
    }
}
