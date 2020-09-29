package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

/* renamed from: fth reason: default package */
public final class fth implements fte {
    private final Paint a = new Paint(1);
    private Shader b;
    private Shader c;
    private final Matrix d = new Matrix();

    public fth(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 1.0f, 1.0f, 0.0f, i, i2, TileMode.REPEAT);
        this.b = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i, i2, TileMode.REPEAT);
        this.c = linearGradient2;
    }

    public final void a(Canvas canvas) {
        this.a.setShader(this.b);
        this.d.reset();
        this.a.getShader().setLocalMatrix(this.d);
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.a);
        canvas.restore();
        this.a.setShader(this.c);
        this.d.reset();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        b(-0.1f, 0.8f, canvas);
        a(-75.0f, canvas);
        a(1.0f, 1.5f, canvas);
        c(3.0f, 0.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        Canvas canvas2 = canvas;
        canvas2.drawRect(-0.3f, -0.1f, 0.3f, 0.1f, this.a);
        canvas.restore();
        this.d.reset();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        b(0.2f, 1.0f, canvas);
        a(-63.0f, canvas);
        a(1.6f, 3.5f, canvas);
        c(4.0f, 0.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas2.drawRect(-0.4f, -0.1f, 0.4f, 0.1f, this.a);
        canvas.restore();
        this.d.reset();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        b(0.6f, 1.0f, canvas);
        a(-69.0f, canvas);
        a(1.3f, 2.0f, canvas);
        c(2.0f, 0.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.2f, -0.1f, 0.2f, 0.1f, this.a);
        canvas.restore();
    }

    private void a(float f, float f2, Canvas canvas) {
        canvas.scale(f, f2);
        this.d.postScale(1.0f / f, 1.0f / f2);
    }

    private void b(float f, float f2, Canvas canvas) {
        canvas.translate(f, f2);
        this.d.postTranslate(-f, -f2);
    }

    private void a(float f, Canvas canvas) {
        canvas.rotate(f);
        this.d.postRotate(-f);
    }

    private void c(float f, float f2, Canvas canvas) {
        canvas.skew(f, 0.0f);
        this.d.postSkew(-f, -0.0f);
    }
}
