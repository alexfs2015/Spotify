package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: ltp reason: default package */
public final class ltp implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Integer> b = vgh.a(Integer.valueOf(266));
    private final View c;
    private vfp d;
    private vfp e;

    /* renamed from: ltp$a */
    public static class a {
        public static final vgh<Float> a = vgh.a(Float.valueOf(1.0f));
        public static final Interpolator b = fuh.d;
    }

    /* renamed from: ltp$b */
    public static class b {
        public static final vgh<Float> a = vgh.a(Float.valueOf(10.0f));
        public static final Interpolator b = fuh.d;
    }

    public ltp(View view) {
        this.c = (View) fbp.a(view);
    }

    public final void a() {
        float b2 = (float) b();
        vfp vfp = new vfp(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.getScaleX(), ((Float) a.a.a()).floatValue(), a.b);
        this.d = vfp;
        vfp vfp2 = new vfp(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.getTranslationY(), ((Float) b.a.a()).floatValue(), b.b);
        this.e = vfp2;
    }

    public final void a(float f) {
        this.c.animate().scaleX(this.d.a(f));
        this.c.animate().scaleY(this.d.a(f));
        this.c.animate().translationY(this.e.a(f));
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }
}
