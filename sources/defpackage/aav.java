package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;

/* renamed from: aav reason: default package */
public final class aav extends aaq {
    private final RectF g = new RectF();
    private final Paint h = new Paint();
    private final float[] i = new float[8];
    private final Path j = new Path();
    private final Layer k;
    private yr<ColorFilter, ColorFilter> l;

    aav(xq xqVar, Layer layer) {
        super(xqVar, layer);
        this.k = layer;
        this.h.setAlpha(0);
        this.h.setStyle(Style.FILL);
        this.h.setColor(layer.l);
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.set(0.0f, 0.0f, (float) this.k.j, (float) this.k.k);
        this.a.mapRect(this.g);
        rectF.set(this.g);
    }

    public final <T> void a(T t, acn<T> acn) {
        super.a(t, acn);
        if (t == xt.x) {
            if (acn == null) {
                this.l = null;
                return;
            }
            this.l = new zg(acn);
        }
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        int alpha = Color.alpha(this.k.l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i2) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) ((Integer) this.f.e.d()).intValue())) / 100.0f) * 255.0f);
            this.h.setAlpha(intValue);
            yr<ColorFilter, ColorFilter> yrVar = this.l;
            if (yrVar != null) {
                this.h.setColorFilter((ColorFilter) yrVar.d());
            }
            if (intValue > 0) {
                float[] fArr = this.i;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.k.j;
                float[] fArr2 = this.i;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.k.j;
                this.i[5] = (float) this.k.k;
                float[] fArr3 = this.i;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.k.k;
                matrix.mapPoints(this.i);
                this.j.reset();
                Path path = this.j;
                float[] fArr4 = this.i;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.j;
                float[] fArr5 = this.i;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.j;
                float[] fArr6 = this.i;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.j;
                float[] fArr7 = this.i;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.j;
                float[] fArr8 = this.i;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.j.close();
                canvas.drawPath(this.j, this.h);
            }
        }
    }
}
