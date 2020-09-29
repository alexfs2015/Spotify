package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.collect.Lists;
import java.util.List;

/* renamed from: fuv reason: default package */
public final class fuv implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Integer> b = vgh.a(Integer.valueOf(266));
    private static vgh<Integer> c = vgh.a(Integer.valueOf(16));
    private static vgh<Float> d = vgh.a(Float.valueOf(0.176f));
    private static vgh<Float> e;
    private static Interpolator f = fuh.d;
    private static vgh<Float> g;
    private static vgh<Float> h = vgh.a(Float.valueOf(1.0f));
    private final fut i;
    private final List<vfp> j = Lists.a();
    private final List<vfp> k = Lists.a();

    static {
        Float valueOf = Float.valueOf(0.0f);
        e = vgh.a(valueOf);
        g = vgh.a(valueOf);
    }

    public fuv(fut fut) {
        this.i = fut;
    }

    public final void a() {
        List f2 = this.i.f();
        float b2 = this.i.b();
        this.j.clear();
        this.k.clear();
        float b3 = (float) b();
        for (int i2 = 0; i2 < f2.size(); i2++) {
            int intValue = ((Integer) a.a()).intValue() + (((f2.size() - i2) - 1) * ((Integer) c.a()).intValue());
            List<vfp> list = this.k;
            float f3 = ((float) intValue) / b3;
            vfp vfp = new vfp(f3, ((float) ((Integer) b.a()).intValue()) / b3, ((Float) g.a()).floatValue(), ((Float) h.a()).floatValue(), f);
            list.add(vfp);
            List<vfp> list2 = this.j;
            vfp vfp2 = new vfp(f3, ((float) ((Integer) b.a()).intValue()) / b3, ((Float) d.a()).floatValue() * b2, ((Float) e.a()).floatValue() * b2, f);
            list2.add(vfp2);
        }
    }

    public final void a(float f2) {
        List f3 = this.i.f();
        for (int i2 = 0; i2 < f3.size(); i2++) {
            View view = (View) f3.get(i2);
            vfp vfp = (vfp) this.k.get(i2);
            view.setTranslationY(((vfp) this.j.get(i2)).a(f2));
            view.setAlpha(vfp.a(f2));
        }
        this.i.c();
    }

    public final int b() {
        List f2 = this.i.f();
        return (f2.size() * ((Integer) b.a()).intValue()) + ((f2.size() - 1) * ((Integer) c.a()).intValue());
    }
}
