package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: lpp reason: default package */
public final class lpp implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(266));
    private uty c;
    private final View d;

    /* renamed from: lpp$a */
    public static class a {
        public static final uuq<Float> a = uuq.a(Float.valueOf(1.0f));
        public static final Interpolator b = ftn.d;
    }

    public lpp(View view) {
        this.d = view;
    }

    public final void a() {
        float b2 = (float) b();
        uty uty = new uty(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.d.getAlpha(), ((Float) a.a.a()).floatValue(), a.b);
        this.c = uty;
    }

    public final void a(float f) {
        this.d.animate().alpha(this.c.a(f));
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }
}
