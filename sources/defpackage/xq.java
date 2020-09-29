package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xq reason: default package */
public final class xq implements xo, xu, a {
    private final Path a = new Path();
    private final Paint b = new Paint(1);
    private final aac c;
    private final String d;
    private final List<xw> e = new ArrayList();
    private final yd<Integer, Integer> f;
    private final yd<Integer, Integer> g;
    private yd<ColorFilter, ColorFilter> h;
    private final xc i;

    public xq(xc xcVar, aac aac, zz zzVar) {
        this.c = aac;
        this.d = zzVar.b;
        this.i = xcVar;
        if (zzVar.c == null || zzVar.d == null) {
            this.f = null;
            this.g = null;
            return;
        }
        this.a.setFillType(zzVar.a);
        this.f = zzVar.c.a();
        this.f.a((a) this);
        aac.a(this.f);
        this.g = zzVar.d.a();
        this.g.a((a) this);
        aac.a(this.g);
    }

    public final void a() {
        this.i.invalidateSelf();
    }

    public final void a(List<xm> list, List<xm> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            xm xmVar = (xm) list2.get(i2);
            if (xmVar instanceof xw) {
                this.e.add((xw) xmVar);
            }
        }
    }

    public final String b() {
        return this.d;
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        String str = "FillContent#draw";
        wz.c(str);
        this.b.setColor(((Integer) this.f.d()).intValue());
        this.b.setAlpha(abv.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.g.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        yd<ColorFilter, ColorFilter> ydVar = this.h;
        if (ydVar != null) {
            this.b.setColorFilter((ColorFilter) ydVar.d());
        }
        this.a.reset();
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            this.a.addPath(((xw) this.e.get(i3)).e(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        wz.d(str);
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.a.reset();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            this.a.addPath(((xw) this.e.get(i2)).e(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void a(yz yzVar, int i2, List<yz> list, yz yzVar2) {
        abv.a(yzVar, i2, list, yzVar2, this);
    }

    public final <T> void a(T t, abz<T> abz) {
        if (t == xf.a) {
            this.f.a(abz);
        } else if (t == xf.d) {
            this.g.a(abz);
        } else {
            if (t == xf.x) {
                if (abz == null) {
                    this.h = null;
                    return;
                }
                this.h = new ys(abz);
                this.h.a((a) this);
                this.c.a(this.h);
            }
        }
    }
}
