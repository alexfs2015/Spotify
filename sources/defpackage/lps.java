package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: lps reason: default package */
public final class lps implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(266));
    private final View c;
    private uty d;
    private uty e;

    /* renamed from: lps$a */
    public static class a {
        public static final uuq<Float> a = uuq.a(Float.valueOf(-10.0f));
        public static final Interpolator b = ftn.d;
    }

    /* renamed from: lps$b */
    public static class b {
        public static final uuq<Float> a = uuq.a(Float.valueOf(1.07f));
        public static final Interpolator b = ftn.d;
    }

    public lps(View view) {
        this.c = (View) fay.a(view);
    }

    public final void a() {
        float b2 = (float) b();
        uty uty = new uty(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.getScaleX(), ((Float) b.a.a()).floatValue(), b.b);
        this.d = uty;
        uty uty2 = new uty(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.getTranslationY(), ((Float) a.a.a()).floatValue(), a.b);
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
