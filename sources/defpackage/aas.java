package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;

/* renamed from: aas reason: default package */
public final class aas extends aaq {
    private final Paint g = new Paint(3);
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private yr<ColorFilter, ColorFilter> j;

    aas(xq xqVar, Layer layer) {
        super(xqVar, layer);
    }

    private Bitmap c() {
        return this.b.a(this.c.g);
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        Bitmap c = c();
        if (c != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) c.getWidth()), Math.min(rectF.bottom, (float) c.getHeight()));
            this.a.mapRect(rectF);
        }
    }

    public final <T> void a(T t, acn<T> acn) {
        super.a(t, acn);
        if (t == xt.x) {
            if (acn == null) {
                this.j = null;
                return;
            }
            this.j = new zg(acn);
        }
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        Bitmap c = c();
        if (c != null && !c.isRecycled()) {
            float a = ack.a();
            this.g.setAlpha(i2);
            yr<ColorFilter, ColorFilter> yrVar = this.j;
            if (yrVar != null) {
                this.g.setColorFilter((ColorFilter) yrVar.d());
            }
            canvas.save();
            canvas.concat(matrix);
            this.h.set(0, 0, c.getWidth(), c.getHeight());
            this.i.set(0, 0, (int) (((float) c.getWidth()) * a), (int) (((float) c.getHeight()) * a));
            canvas.drawBitmap(c, this.h, this.i, this.g);
            canvas.restore();
        }
    }
}
