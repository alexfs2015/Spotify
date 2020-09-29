package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.collect.Lists;
import java.util.List;

/* renamed from: fuw reason: default package */
public final class fuw implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Integer> b = vgh.a(Integer.valueOf(100));
    private static vgh<Integer> c = vgh.a(Integer.valueOf(16));
    private static vgh<Float> d = vgh.a(Float.valueOf(0.176f));
    private static Interpolator e = fuh.c;
    private static vgh<Float> f = vgh.a(Float.valueOf(0.0f));
    private final fut g;
    private final List<vfp> h = Lists.a();
    private final List<vfp> i = Lists.a();

    public fuw(fut fut) {
        this.g = fut;
    }

    public final void a() {
        List f2 = this.g.f();
        float b2 = (float) b();
        this.h.clear();
        this.i.clear();
        for (int i2 = 0; i2 < f2.size(); i2++) {
            int intValue = ((Integer) a.a()).intValue();
            int intValue2 = ((Integer) b.a()).intValue() + (((f2.size() - i2) - 1) * ((Integer) c.a()).intValue());
            View view = (View) f2.get(i2);
            List<vfp> list = this.i;
            float f3 = ((float) intValue) / b2;
            float f4 = ((float) intValue2) / b2;
            vfp vfp = new vfp(f3, f4, view.getAlpha(), ((Float) f.a()).floatValue(), e);
            list.add(vfp);
            List<vfp> list2 = this.h;
            vfp vfp2 = new vfp(f3, f4, view.getTranslationY(), ((Float) d.a()).floatValue() * this.g.b(), e);
            list2.add(vfp2);
        }
    }

    public final void a(float f2) {
        List f3 = this.g.f();
        for (int i2 = 0; i2 < f3.size(); i2++) {
            View view = (View) f3.get(i2);
            view.setTranslationY(((vfp) this.h.get(i2)).a(f2));
            view.setAlpha(((vfp) this.i.get(i2)).a(f2));
        }
        this.g.c();
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue() + (((Integer) c.a()).intValue() * (this.g.f().size() - 1));
    }
}
