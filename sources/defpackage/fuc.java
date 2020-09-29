package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.collect.Lists;
import java.util.List;

/* renamed from: fuc reason: default package */
public final class fuc implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(100));
    private static uuq<Integer> c = uuq.a(Integer.valueOf(16));
    private static uuq<Float> d = uuq.a(Float.valueOf(0.176f));
    private static Interpolator e = ftn.c;
    private static uuq<Float> f = uuq.a(Float.valueOf(0.0f));
    private final ftz g;
    private final List<uty> h = Lists.a();
    private final List<uty> i = Lists.a();

    public fuc(ftz ftz) {
        this.g = ftz;
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
            List<uty> list = this.i;
            float f3 = ((float) intValue) / b2;
            float f4 = ((float) intValue2) / b2;
            uty uty = new uty(f3, f4, view.getAlpha(), ((Float) f.a()).floatValue(), e);
            list.add(uty);
            List<uty> list2 = this.h;
            uty uty2 = new uty(f3, f4, view.getTranslationY(), ((Float) d.a()).floatValue() * this.g.b(), e);
            list2.add(uty2);
        }
    }

    public final void a(float f2) {
        List f3 = this.g.f();
        for (int i2 = 0; i2 < f3.size(); i2++) {
            View view = (View) f3.get(i2);
            view.setTranslationY(((uty) this.h.get(i2)).a(f2));
            view.setAlpha(((uty) this.i.get(i2)).a(f2));
        }
        this.g.c();
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue() + (((Integer) c.a()).intValue() * (this.g.f().size() - 1));
    }
}
