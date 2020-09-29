package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ye reason: default package */
public final class ye implements yc, yi, a {
    private final Path a = new Path();
    private final Paint b = new Paint(1);
    private final aaq c;
    private final String d;
    private final List<yk> e = new ArrayList();
    private final yr<Integer, Integer> f;
    private final yr<Integer, Integer> g;
    private yr<ColorFilter, ColorFilter> h;
    private final xq i;

    public ye(xq xqVar, aaq aaq, aan aan) {
        this.c = aaq;
        this.d = aan.b;
        this.i = xqVar;
        if (aan.c == null || aan.d == null) {
            this.f = null;
            this.g = null;
            return;
        }
        this.a.setFillType(aan.a);
        this.f = aan.c.a();
        this.f.a((a) this);
        aaq.a(this.f);
        this.g = aan.d.a();
        this.g.a((a) this);
        aaq.a(this.g);
    }

    public final void a() {
        this.i.invalidateSelf();
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        String str = "FillContent#draw";
        xn.c(str);
        this.b.setColor(((Integer) this.f.d()).intValue());
        this.b.setAlpha(acj.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.g.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        yr<ColorFilter, ColorFilter> yrVar = this.h;
        if (yrVar != null) {
            this.b.setColorFilter((ColorFilter) yrVar.d());
        }
        this.a.reset();
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            this.a.addPath(((yk) this.e.get(i3)).e(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        xn.d(str);
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.a.reset();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            this.a.addPath(((yk) this.e.get(i2)).e(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final <T> void a(T t, acn<T> acn) {
        if (t == xt.a) {
            this.f.a(acn);
        } else if (t == xt.d) {
            this.g.a(acn);
        } else {
            if (t == xt.x) {
                if (acn == null) {
                    this.h = null;
                    return;
                }
                this.h = new zg(acn);
                this.h.a((a) this);
                this.c.a(this.h);
            }
        }
    }

    public final void a(List<ya> list, List<ya> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ya yaVar = (ya) list2.get(i2);
            if (yaVar instanceof yk) {
                this.e.add((yk) yaVar);
            }
        }
    }

    public final void a(zn znVar, int i2, List<zn> list, zn znVar2) {
        acj.a(znVar, i2, list, znVar2, this);
    }

    public final String b() {
        return this.d;
    }
}
