package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.model.content.ShapeStroke;

/* renamed from: yp reason: default package */
public final class yp extends xz {
    private final aaq b;
    private final String c;
    private final yr<Integer, Integer> d;
    private yr<ColorFilter, ColorFilter> e;

    public yp(xq xqVar, aaq aaq, ShapeStroke shapeStroke) {
        super(xqVar, aaq, shapeStroke.g.a(), shapeStroke.h.a(), shapeStroke.i, shapeStroke.e, shapeStroke.f, shapeStroke.c, shapeStroke.b);
        this.b = aaq;
        this.c = shapeStroke.a;
        this.d = shapeStroke.d.a();
        this.d.a((a) this);
        aaq.a(this.d);
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.a.setColor(((Integer) this.d.d()).intValue());
        if (this.e != null) {
            this.a.setColorFilter((ColorFilter) this.e.d());
        }
        super.a(canvas, matrix, i);
    }

    public final <T> void a(T t, acn<T> acn) {
        super.a(t, acn);
        if (t == xt.b) {
            this.d.a(acn);
            return;
        }
        if (t == xt.x) {
            if (acn == null) {
                this.e = null;
                return;
            }
            this.e = new zg(acn);
            this.e.a((a) this);
            this.b.a(this.d);
        }
    }

    public final String b() {
        return this.c;
    }
}
