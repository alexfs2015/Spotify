package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.model.content.ShapeStroke;

/* renamed from: yb reason: default package */
public final class yb extends xl {
    private final aac b;
    private final String c;
    private final yd<Integer, Integer> d;
    private yd<ColorFilter, ColorFilter> e;

    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.a.setColor(((Integer) this.d.d()).intValue());
        if (this.e != null) {
            this.a.setColorFilter((ColorFilter) this.e.d());
        }
        super.a(canvas, matrix, i);
    }

    public final String b() {
        return this.c;
    }

    public final <T> void a(T t, abz<T> abz) {
        super.a(t, abz);
        if (t == xf.b) {
            this.d.a(abz);
            return;
        }
        if (t == xf.x) {
            if (abz == null) {
                this.e = null;
                return;
            }
            this.e = new ys(abz);
            this.e.a((a) this);
            this.b.a(this.d);
        }
    }

    public yb(xc xcVar, aac aac, ShapeStroke shapeStroke) {
        super(xcVar, aac, shapeStroke.g.a(), shapeStroke.h.a(), shapeStroke.i, shapeStroke.e, shapeStroke.f, shapeStroke.c, shapeStroke.b);
        this.b = aac;
        this.c = shapeStroke.a;
        this.d = shapeStroke.d.a();
        this.d.a((a) this);
        aac.a(this.d);
    }
}
