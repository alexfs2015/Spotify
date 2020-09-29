package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

/* renamed from: ftg reason: default package */
public final class ftg implements fte {
    private final Paint a = new Paint(1);
    private Shader b;
    private Shader c;
    private final Matrix d = new Matrix();

    public ftg(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 1.0f, 1.0f, 0.0f, i, i2, TileMode.REPEAT);
        this.b = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i2, i, TileMode.REPEAT);
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
        a();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        b(0.0f, 0.8f, canvas);
        a(-75.0f, canvas);
        a(8.25f, 0.65f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
        a();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        b(0.13f, 0.8f, canvas);
        a(-70.0f, canvas);
        a(10.0f, 0.85f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
        a();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        b(0.39f, 1.0f, canvas);
        a(-58.0f, canvas);
        a(8.9f, 2.8f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
        a();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        b(1.0f, 0.9f, canvas);
        a(-42.0f, canvas);
        a(8.9f, 2.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
    }

    private void a() {
        this.d.reset();
        this.d.postScale(2.0f, 2.0f);
        this.d.postTranslate(-0.5f, -0.5f);
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
}
