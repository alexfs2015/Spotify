package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.collect.Lists;
import java.util.List;

/* renamed from: fub reason: default package */
public final class fub implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(266));
    private static uuq<Integer> c = uuq.a(Integer.valueOf(16));
    private static uuq<Float> d = uuq.a(Float.valueOf(0.176f));
    private static uuq<Float> e;
    private static Interpolator f = ftn.d;
    private static uuq<Float> g;
    private static uuq<Float> h = uuq.a(Float.valueOf(1.0f));
    private final ftz i;
    private final List<uty> j = Lists.a();
    private final List<uty> k = Lists.a();

    static {
        Float valueOf = Float.valueOf(0.0f);
        e = uuq.a(valueOf);
        g = uuq.a(valueOf);
    }

    public fub(ftz ftz) {
        this.i = ftz;
    }

    public final void a() {
        List f2 = this.i.f();
        float b2 = this.i.b();
        this.j.clear();
        this.k.clear();
        float b3 = (float) b();
        for (int i2 = 0; i2 < f2.size(); i2++) {
            int intValue = ((Integer) a.a()).intValue() + (((f2.size() - i2) - 1) * ((Integer) c.a()).intValue());
            List<uty> list = this.k;
            float f3 = ((float) intValue) / b3;
            uty uty = new uty(f3, ((float) ((Integer) b.a()).intValue()) / b3, ((Float) g.a()).floatValue(), ((Float) h.a()).floatValue(), f);
            list.add(uty);
            List<uty> list2 = this.j;
            uty uty2 = new uty(f3, ((float) ((Integer) b.a()).intValue()) / b3, ((Float) d.a()).floatValue() * b2, ((Float) e.a()).floatValue() * b2, f);
            list2.add(uty2);
        }
    }

    public final int b() {
        List f2 = this.i.f();
        return (f2.size() * ((Integer) b.a()).intValue()) + ((f2.size() - 1) * ((Integer) c.a()).intValue());
    }

    public final void a(float f2) {
        List f3 = this.i.f();
        for (int i2 = 0; i2 < f3.size(); i2++) {
            View view = (View) f3.get(i2);
            uty uty = (uty) this.k.get(i2);
            view.setTranslationY(((uty) this.j.get(i2)).a(f2));
            view.setAlpha(uty.a(f2));
        }
        this.i.c();
    }
}
