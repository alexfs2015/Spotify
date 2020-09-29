package defpackage;

import android.view.animation.Interpolator;

/* renamed from: fud reason: default package */
public final class fud implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(266));
    private static uuq<Float> c = uuq.a(Float.valueOf(0.0f));
    private static uuq<Float> d = uuq.a(Float.valueOf(1.0f));
    private static Interpolator e = ftn.d;
    private final uty f;
    private final ftz g;

    public final void a() {
    }

    public fud(ftz ftz) {
        this.g = ftz;
        float b2 = (float) b();
        uty uty = new uty(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, ((Float) c.a()).floatValue(), ((Float) d.a()).floatValue(), e);
        this.f = uty;
    }

    public final void a(float f2) {
        this.g.g().setAlpha(this.f.a(f2));
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }
}
