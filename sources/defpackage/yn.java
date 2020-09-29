package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: yn reason: default package */
public final class yn implements yc, yh, yi, yk, a {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final xq c;
    private final aaq d;
    private final String e;
    private final yr<Float, Float> f;
    private final yr<Float, Float> g;
    private final zf h;
    private yb i;

    public yn(xq xqVar, aaq aaq, aal aal) {
        this.c = xqVar;
        this.d = aaq;
        this.e = aal.a;
        this.f = aal.b.a();
        aaq.a(this.f);
        this.f.a((a) this);
        this.g = aal.c.a();
        aaq.a(this.g);
        this.g.a((a) this);
        this.h = aal.d.a();
        this.h.a(aaq);
        this.h.a((a) this);
    }

    public final void a() {
        this.c.invalidateSelf();
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

    public final <T> void a(T t, acn<T> acn) {
        if (!this.h.a(t, acn)) {
            if (t == xt.m) {
                this.f.a(acn);
                return;
            }
            if (t == xt.n) {
                this.g.a(acn);
            }
        }
    }

    public final void a(List<ya> list, List<ya> list2) {
        this.i.a(list, list2);
    }

    public final void a(ListIterator<ya> listIterator) {
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
            yb ybVar = new yb(this.c, this.d, "Repeater", arrayList, null);
            this.i = ybVar;
        }
    }

    public final void a(zn znVar, int i2, List<zn> list, zn znVar2) {
        acj.a(znVar, i2, list, znVar2, this);
    }

    public final String b() {
        return this.e;
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
}
