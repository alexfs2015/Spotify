package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;

/* renamed from: aae reason: default package */
public final class aae extends aac {
    private final Paint g = new Paint(3);
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private yd<ColorFilter, ColorFilter> j;

    aae(xc xcVar, Layer layer) {
        super(xcVar, layer);
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        Bitmap c = c();
        if (c != null && !c.isRecycled()) {
            float a = abw.a();
            this.g.setAlpha(i2);
            yd<ColorFilter, ColorFilter> ydVar = this.j;
            if (ydVar != null) {
                this.g.setColorFilter((ColorFilter) ydVar.d());
            }
            canvas.save();
            canvas.concat(matrix);
            this.h.set(0, 0, c.getWidth(), c.getHeight());
            this.i.set(0, 0, (int) (((float) c.getWidth()) * a), (int) (((float) c.getHeight()) * a));
            canvas.drawBitmap(c, this.h, this.i, this.g);
            canvas.restore();
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        Bitmap c = c();
        if (c != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) c.getWidth()), Math.min(rectF.bottom, (float) c.getHeight()));
            this.a.mapRect(rectF);
        }
    }

    private Bitmap c() {
        return this.b.a(this.c.g);
    }

    public final <T> void a(T t, abz<T> abz) {
        super.a(t, abz);
        if (t == xf.x) {
            if (abz == null) {
                this.j = null;
                return;
            }
            this.j = new ys(abz);
        }
    }
}
