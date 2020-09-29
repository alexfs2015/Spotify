package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

/* renamed from: rjl reason: default package */
public final class rjl {
    private Shader a;
    private Bitmap b;
    private RectF c;

    public final void a(Canvas canvas, Paint paint, float f, float f2) {
        paint.setAlpha((int) (f * 255.0f));
        paint.setShader(this.a);
        canvas.drawRoundRect(this.c, f2, f2, paint);
        paint.setAlpha(255);
    }

    public final void a(Rect rect) {
        this.c = new RectF(rect);
        b(rect);
    }

    private void b(Rect rect) {
        if (this.b != null && this.a != null) {
            this.a.setLocalMatrix(a((float) this.b.getWidth(), (float) this.b.getHeight(), (float) rect.width(), (float) rect.height()));
        }
    }

    public final void a(Bitmap bitmap, Rect rect) {
        this.b = bitmap;
        Bitmap bitmap2 = this.b;
        TileMode tileMode = TileMode.CLAMP;
        this.a = new BitmapShader(bitmap2, tileMode, tileMode);
        b(rect);
    }

    public final boolean a() {
        return this.b != null;
    }

    private static Matrix a(float f, float f2, float f3, float f4) {
        float f5;
        float max = Math.max(f3 / f, f4 / f2);
        float f6 = f * max;
        float f7 = f2 * max;
        float f8 = 0.0f;
        if (f6 > f3) {
            f8 = (f3 - f6) / 2.0f;
        } else if (f7 > f4) {
            f5 = (f4 - f7) / 2.0f;
            Matrix matrix = new Matrix();
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(f8, f5);
            return matrix;
        }
        f5 = 0.0f;
        Matrix matrix2 = new Matrix();
        matrix2.reset();
        matrix2.postScale(max, max);
        matrix2.postTranslate(f8, f5);
        return matrix2;
    }
}
