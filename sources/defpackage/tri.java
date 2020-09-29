package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

/* renamed from: tri reason: default package */
public final class tri implements trh {
    private Shader a;
    private Bitmap b;

    public final void a(Canvas canvas, Paint paint, RectF rectF, float f, float f2) {
        paint.setAlpha((int) (f * 255.0f));
        paint.setShader(this.a);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setShader(null);
        paint.setAlpha(255);
    }

    public final void a(Rect rect) {
        b(rect);
    }

    public final void b() {
        this.b = null;
        this.a = null;
    }

    private void b(Rect rect) {
        if (this.b != null && this.a != null) {
            this.a.setLocalMatrix(tru.a((float) this.b.getWidth(), (float) this.b.getHeight(), (float) rect.width(), (float) rect.height()));
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
}
