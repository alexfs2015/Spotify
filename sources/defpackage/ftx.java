package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

/* renamed from: ftx reason: default package */
public final class ftx implements fty {
    private final Paint a = new Paint(1);
    private Shader b;

    public ftx(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 1.0f, 1.0f, 0.0f, i, i2, TileMode.REPEAT);
        this.b = linearGradient;
    }

    public final void a(Canvas canvas) {
        this.a.setShader(this.b);
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.a);
        canvas.restore();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.translate(0.15f, 0.85f);
        canvas.scale(0.3f, 0.3f);
        canvas.drawCircle(0.0f, 0.0f, 0.7f, this.a);
        canvas.restore();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.translate(0.2f, -0.0f);
        canvas.scale(0.2f, 0.2f);
        canvas.drawCircle(0.0f, 0.0f, 0.7f, this.a);
        canvas.restore();
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.translate(0.9f, 0.4f);
        canvas.scale(0.5f, 0.5f);
        canvas.drawCircle(0.0f, 0.0f, 0.7f, this.a);
        canvas.restore();
    }
}
