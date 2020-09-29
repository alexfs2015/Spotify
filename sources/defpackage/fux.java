package defpackage;

import android.view.animation.Interpolator;

/* renamed from: fux reason: default package */
public final class fux implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Integer> b = vgh.a(Integer.valueOf(266));
    private static vgh<Float> c = vgh.a(Float.valueOf(0.0f));
    private static vgh<Float> d = vgh.a(Float.valueOf(1.0f));
    private static Interpolator e = fuh.d;
    private final vfp f;
    private final fut g;

    public fux(fut fut) {
        this.g = fut;
        float b2 = (float) b();
        vfp vfp = new vfp(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, ((Float) c.a()).floatValue(), ((Float) d.a()).floatValue(), e);
        this.f = vfp;
    }

    public final void a() {
    }

    public final void a(float f2) {
        this.g.g().setAlpha(this.f.a(f2));
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }
}
