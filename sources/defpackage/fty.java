package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: fty reason: default package */
public final class fty implements uua {
    private uty a;
    private uty b;
    private uty c;
    private final ftz d;

    /* renamed from: fty$a */
    public static class a {
        public static final uuq<Integer> a = uuq.a(Integer.valueOf(0));
        public static final uuq<Integer> b = uuq.a(Integer.valueOf(100));
        public static final uuq<Float> c = uuq.a(Float.valueOf(0.0f));
        public static final Interpolator d = ftn.c;
    }

    /* renamed from: fty$b */
    public static class b {
        public static final uuq<Integer> a = uuq.a(Integer.valueOf(0));
        public static final uuq<Integer> b = uuq.a(Integer.valueOf(100));
        public static final uuq<Float> c = uuq.a(Float.valueOf(1.0f));
        public static final Interpolator d = ftn.c;
    }

    /* renamed from: fty$c */
    public static class c {
        public static final uuq<Integer> a = uuq.a(Integer.valueOf(0));
        public static final uuq<Integer> b = uuq.a(Integer.valueOf(100));
        public static final uuq<Float> c = uuq.a(Float.valueOf(0.0f));
        public static final Interpolator d = ftn.a;
    }

    public fty(ftz ftz) {
        this.d = ftz;
    }

    public final void a() {
        int d2 = this.d.d();
        float b2 = (float) b();
        StretchingGradientDrawable a2 = this.d.a();
        View e = this.d.e();
        uty uty = new uty(((float) ((Integer) b.a.a()).intValue()) / b2, ((float) (((Integer) b.b.a()).intValue() + d2)) / b2, a2.c, ((Float) b.c.a()).floatValue() * this.d.b(), b.d);
        this.a = uty;
        uty uty2 = new uty(((float) ((Integer) a.a.a()).intValue()) / b2, ((float) (((Integer) a.b.a()).intValue() + d2)) / b2, ((float) a2.a.getAlpha()) / 255.0f, ((Float) a.c.a()).floatValue(), a.d);
        this.b = uty2;
        uty uty3 = new uty(((float) ((Integer) c.a.a()).intValue()) / b2, ((float) (d2 + ((Integer) c.b.a()).intValue())) / b2, e.getAlpha(), ((Float) c.c.a()).floatValue(), c.d);
        this.c = uty3;
    }

    public final int b() {
        return this.d.d() + ((Integer) b.b.a()).intValue();
    }

    public final void a(float f) {
        StretchingGradientDrawable a2 = this.d.a();
        View e = this.d.e();
        a2.c = this.a.a(f);
        a2.a(this.b.a(f));
        e.setAlpha(this.c.a(f));
        this.d.c();
    }
}
