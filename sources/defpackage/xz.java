package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: xz reason: default package */
public final class xz implements xo, xt, xu, xw, a {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final xc c;
    private final aac d;
    private final String e;
    private final yd<Float, Float> f;
    private final yd<Float, Float> g;
    private final yr h;
    private xn i;

    public xz(xc xcVar, aac aac, zx zxVar) {
        this.c = xcVar;
        this.d = aac;
        this.e = zxVar.a;
        this.f = zxVar.b.a();
        aac.a(this.f);
        this.f.a((a) this);
        this.g = zxVar.c.a();
        aac.a(this.g);
        this.g.a((a) this);
        this.h = zxVar.d.a();
        this.h.a(aac);
        this.h.a((a) this);
    }

    public final void a(ListIterator<xm> listIterator) {
        if (this.i == null) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() == this) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            xn xnVar = new xn(this.c, this.d, "Repeater", arrayList, null);
            this.i = xnVar;
        }
    }

    public final String b() {
        return this.e;
    }

    public final void a(List<xm> list, List<xm> list2) {
        this.i.a(list, list2);
    }

    public final Path e() {
        Path e2 = this.i.e();
        this.b.reset();
        float floatValue = ((Float) this.f.d()).floatValue();
        float floatValue2 = ((Float) this.g.d()).floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(this.h.a(((float) i2) + floatValue2));
            this.b.addPath(e2, this.a);
        }
        return this.b;
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = ((Float) this.f.d()).floatValue();
        float floatValue2 = ((Float) this.g.d()).floatValue();
        float floatValue3 = ((Float) this.h.f.d()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.h.g.d()).floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.a.set(matrix);
            float f2 = (float) i3;
            this.a.preConcat(this.h.a(f2 + floatValue2));
            this.i.a(canvas, this.a, (int) (((float) i2) * (((f2 / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.i.a(rectF, matrix);
    }

    public final void a() {
        this.c.invalidateSelf();
    }

    public final void a(yz yzVar, int i2, List<yz> list, yz yzVar2) {
        abv.a(yzVar, i2, list, yzVar2, this);
    }

    public final <T> void a(T t, abz<T> abz) {
        if (!this.h.a(t, abz)) {
            if (t == xf.m) {
                this.f.a(abz);
                return;
            }
            if (t == xf.n) {
                this.g.a(abz);
            }
        }
    }
}
