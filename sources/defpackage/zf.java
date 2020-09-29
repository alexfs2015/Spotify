package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: zf reason: default package */
public final class zf {
    public final yr<PointF, PointF> a;
    public final yr<?, PointF> b;
    public final yr<aco, aco> c;
    public final yr<Float, Float> d;
    public final yr<Integer, Integer> e;
    public final yr<?, Float> f;
    public final yr<?, Float> g;
    private final Matrix h = new Matrix();

    public zf(aac aac) {
        this.a = aac.a.a();
        this.b = aac.b.a();
        this.c = aac.c.a();
        this.d = aac.d.a();
        this.e = aac.e.a();
        if (aac.f != null) {
            this.f = aac.f.a();
        } else {
            this.f = null;
        }
        if (aac.g != null) {
            this.g = aac.g.a();
        } else {
            this.g = null;
        }
    }

    public final Matrix a() {
        this.h.reset();
        PointF pointF = (PointF) this.b.d();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.h.preTranslate(pointF.x, pointF.y);
        }
        float floatValue = ((Float) this.d.d()).floatValue();
        if (floatValue != 0.0f) {
            this.h.preRotate(floatValue);
        }
        aco aco = (aco) this.c.d();
        if (!(aco.a == 1.0f && aco.b == 1.0f)) {
            this.h.preScale(aco.a, aco.b);
        }
        PointF pointF2 = (PointF) this.a.d();
        if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
            this.h.preTranslate(-pointF2.x, -pointF2.y);
        }
        return this.h;
    }

    public final Matrix a(float f2) {
        PointF pointF = (PointF) this.b.d();
        PointF pointF2 = (PointF) this.a.d();
        aco aco = (aco) this.c.d();
        float floatValue = ((Float) this.d.d()).floatValue();
        this.h.reset();
        this.h.preTranslate(pointF.x * f2, pointF.y * f2);
        double d2 = (double) f2;
        this.h.preScale((float) Math.pow((double) aco.a, d2), (float) Math.pow((double) aco.b, d2));
        this.h.preRotate(floatValue * f2, pointF2.x, pointF2.y);
        return this.h;
    }

    public final void a(aaq aaq) {
        aaq.a(this.a);
        aaq.a(this.b);
        aaq.a(this.c);
        aaq.a(this.d);
        aaq.a(this.e);
        yr<?, Float> yrVar = this.f;
        if (yrVar != null) {
            aaq.a(yrVar);
        }
        yr<?, Float> yrVar2 = this.g;
        if (yrVar2 != null) {
            aaq.a(yrVar2);
        }
    }

    public final void a(a aVar) {
        this.a.a(aVar);
        this.b.a(aVar);
        this.c.a(aVar);
        this.d.a(aVar);
        this.e.a(aVar);
        yr<?, Float> yrVar = this.f;
        if (yrVar != null) {
            yrVar.a(aVar);
        }
        yr<?, Float> yrVar2 = this.g;
        if (yrVar2 != null) {
            yrVar2.a(aVar);
        }
    }

    public final <T> boolean a(T t, acn<T> acn) {
        if (t == xt.e) {
            this.a.a(acn);
        } else if (t == xt.f) {
            this.b.a(acn);
        } else if (t == xt.i) {
            this.c.a(acn);
        } else if (t == xt.j) {
            this.d.a(acn);
        } else if (t == xt.c) {
            this.e.a(acn);
        } else {
            if (t == xt.u) {
                yr<?, Float> yrVar = this.f;
                if (yrVar != null) {
                    yrVar.a(acn);
                }
            }
            if (t == xt.v) {
                yr<?, Float> yrVar2 = this.g;
                if (yrVar2 != null) {
                    yrVar2.a(acn);
                }
            }
            return false;
        }
        return true;
    }
}
