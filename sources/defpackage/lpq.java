package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: lpq reason: default package */
public final class lpq implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(266));
    private final View c;
    private uty d;
    private uty e;

    /* renamed from: lpq$a */
    public static class a {
        public static final uuq<Float> a = uuq.a(Float.valueOf(1.0f));
        public static final Interpolator b = ftn.d;
    }

    /* renamed from: lpq$b */
    public static class b {
        public static final uuq<Float> a = uuq.a(Float.valueOf(10.0f));
        public static final Interpolator b = ftn.d;
    }

    public lpq(View view) {
        this.c = (View) fay.a(view);
    }

    public final void a() {
        float b2 = (float) b();
        uty uty = new uty(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.getScaleX(), ((Float) a.a.a()).floatValue(), a.b);
        this.d = uty;
        uty uty2 = new uty(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.getTranslationY(), ((Float) b.a.a()).floatValue(), b.b);
        this.e = uty2;
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
