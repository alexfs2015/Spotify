package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: uuz reason: default package */
public final class uuz extends Drawable {
    private final Bitmap a;
    private final Paint b;
    private final BitmapShader c;
    private final Matrix d = new Matrix();
    private final float e;

    public uuz(Bitmap bitmap, float f) {
        if (bitmap != null) {
            this.e = f;
            this.a = bitmap;
            this.b = new Paint(1);
            this.b.setStyle(Style.FILL);
            Bitmap bitmap2 = this.a;
            TileMode tileMode = TileMode.CLAMP;
            this.c = new BitmapShader(bitmap2, tileMode, tileMode);
            this.b.setShader(this.c);
            return;
        }
        throw new NullPointerException("Bitmap cannot be null.");
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float min = ((float) Math.min(bounds.width(), bounds.height())) / 2.0f;
        this.d.reset();
        this.d.postTranslate(-exactCenterX, -exactCenterY);
        this.c.setLocalMatrix(this.d);
        canvas.save();
        canvas.translate(exactCenterX, exactCenterY);
        float f = this.e;
        if (f != 1.0f) {
            canvas.scale(f, f);
        }
        canvas.drawCircle(0.0f, 0.0f, min, this.b);
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        Paint paint = this.b;
        if (paint.getXfermode() == null) {
            int alpha = paint.getAlpha();
            if (alpha == 0) {
                return -2;
            }
            if (alpha == 255 && !this.a.hasAlpha()) {
                return -1;
            }
        }
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.a.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getWidth();
    }

    public static utt a() {
        return new utt(1.0f) {
            public final Drawable createDrawable(Bitmap bitmap) {
                return new uuz(bitmap, 1.0f);
            }
        };
    }
}
