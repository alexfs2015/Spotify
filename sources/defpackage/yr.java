package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: yr reason: default package */
public final class yr {
    public final yd<PointF, PointF> a;
    public final yd<?, PointF> b;
    public final yd<aca, aca> c;
    public final yd<Float, Float> d;
    public final yd<Integer, Integer> e;
    public final yd<?, Float> f;
    public final yd<?, Float> g;
    private final Matrix h = new Matrix();

    public yr(zo zoVar) {
        this.a = zoVar.a.a();
        this.b = zoVar.b.a();
        this.c = zoVar.c.a();
        this.d = zoVar.d.a();
        this.e = zoVar.e.a();
        if (zoVar.f != null) {
            this.f = zoVar.f.a();
        } else {
            this.f = null;
        }
        if (zoVar.g != null) {
            this.g = zoVar.g.a();
        } else {
            this.g = null;
        }
    }

    public final void a(aac aac) {
        aac.a(this.a);
        aac.a(this.b);
        aac.a(this.c);
        aac.a(this.d);
        aac.a(this.e);
        yd<?, Float> ydVar = this.f;
        if (ydVar != null) {
            aac.a(ydVar);
        }
        yd<?, Float> ydVar2 = this.g;
        if (ydVar2 != null) {
            aac.a(ydVar2);
        }
    }

    public final void a(a aVar) {
        this.a.a(aVar);
        this.b.a(aVar);
        this.c.a(aVar);
        this.d.a(aVar);
        this.e.a(aVar);
        yd<?, Float> ydVar = this.f;
        if (ydVar != null) {
            ydVar.a(aVar);
        }
        yd<?, Float> ydVar2 = this.g;
        if (ydVar2 != null) {
            ydVar2.a(aVar);
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
        aca aca = (aca) this.c.d();
        if (!(aca.a == 1.0f && aca.b == 1.0f)) {
            this.h.preScale(aca.a, aca.b);
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
        aca aca = (aca) this.c.d();
        float floatValue = ((Float) this.d.d()).floatValue();
        this.h.reset();
        this.h.preTranslate(pointF.x * f2, pointF.y * f2);
        double d2 = (double) f2;
        this.h.preScale((float) Math.pow((double) aca.a, d2), (float) Math.pow((double) aca.b, d2));
        this.h.preRotate(floatValue * f2, pointF2.x, pointF2.y);
        return this.h;
    }

    public final <T> boolean a(T t, abz<T> abz) {
        if (t == xf.e) {
            this.a.a(abz);
        } else if (t == xf.f) {
            this.b.a(abz);
        } else if (t == xf.i) {
            this.c.a(abz);
        } else if (t == xf.j) {
            this.d.a(abz);
        } else if (t == xf.c) {
            this.e.a(abz);
        } else {
            if (t == xf.u) {
                yd<?, Float> ydVar = this.f;
                if (ydVar != null) {
                    ydVar.a(abz);
                }
            }
            if (t == xf.v) {
                yd<?, Float> ydVar2 = this.g;
                if (ydVar2 != null) {
                    ydVar2.a(abz);
                }
            }
            return false;
        }
        return true;
    }
}
