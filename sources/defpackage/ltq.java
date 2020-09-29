package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: ltq reason: default package */
public final class ltq implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Integer> b = vgh.a(Integer.valueOf(266));
    private vfp c;
    private final View d;

    /* renamed from: ltq$a */
    public static class a {
        public static final vgh<Float> a = vgh.a(Float.valueOf(0.0f));
        public static final Interpolator b = fuh.d;
    }

    public ltq(View view) {
        this.d = view;
    }

    public final void a() {
        float b2 = (float) b();
        vfp vfp = new vfp(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.d.getAlpha(), ((Float) a.a.a()).floatValue(), a.b);
        this.c = vfp;
    }

    public final void a(float f) {
        this.d.animate().alpha(this.c.a(f));
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }
}
