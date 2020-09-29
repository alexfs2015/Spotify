package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: vgt reason: default package */
public final class vgt extends Drawable {
    private final Bitmap a;
    private final Paint b;
    private final BitmapShader c;
    private final Matrix d = new Matrix();
    private final float e;
    private final RectF f = new RectF();
    private final Paint g = new Paint();

    public vgt(Bitmap bitmap, float f2) {
        if (bitmap != null) {
            this.e = f2;
            this.a = bitmap;
            this.b = new Paint(3);
            this.b.setStyle(Style.FILL);
            Bitmap bitmap2 = this.a;
            TileMode tileMode = TileMode.CLAMP;
            this.c = new BitmapShader(bitmap2, tileMode, tileMode);
            this.b.setShader(this.c);
            return;
        }
        throw new NullPointerException("Bitmap cannot be null.");
    }

    public static vfk a(final float f2) {
        return new vfk() {
            public final Drawable createDrawable(Bitmap bitmap) {
                return new vgt(bitmap, f2);
            }
        };
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        this.d.reset();
        this.d.setScale(((float) bounds.width()) / ((float) this.a.getWidth()), ((float) bounds.height()) / ((float) this.a.getHeight()));
        this.c.setLocalMatrix(this.d);
        this.g.setColor(-65536);
        this.f.set(bounds);
        RectF rectF = this.f;
        float f2 = this.e;
        canvas.drawRoundRect(rectF, f2, f2, this.b);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
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

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
