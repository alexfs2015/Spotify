package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: fus reason: default package */
public final class fus implements vfr {
    private vfp a;
    private vfp b;
    private vfp c;
    private final fut d;

    /* renamed from: fus$a */
    public static class a {
        public static final vgh<Integer> a = vgh.a(Integer.valueOf(0));
        public static final vgh<Integer> b = vgh.a(Integer.valueOf(100));
        public static final vgh<Float> c = vgh.a(Float.valueOf(0.0f));
        public static final Interpolator d = fuh.c;
    }

    /* renamed from: fus$b */
    public static class b {
        public static final vgh<Integer> a = vgh.a(Integer.valueOf(0));
        public static final vgh<Integer> b = vgh.a(Integer.valueOf(100));
        public static final vgh<Float> c = vgh.a(Float.valueOf(1.0f));
        public static final Interpolator d = fuh.c;
    }

    /* renamed from: fus$c */
    public static class c {
        public static final vgh<Integer> a = vgh.a(Integer.valueOf(0));
        public static final vgh<Integer> b = vgh.a(Integer.valueOf(100));
        public static final vgh<Float> c = vgh.a(Float.valueOf(0.0f));
        public static final Interpolator d = fuh.a;
    }

    public fus(fut fut) {
        this.d = fut;
    }

    public final void a() {
        int d2 = this.d.d();
        float b2 = (float) b();
        StretchingGradientDrawable a2 = this.d.a();
        View e = this.d.e();
        vfp vfp = new vfp(((float) ((Integer) b.a.a()).intValue()) / b2, ((float) (((Integer) b.b.a()).intValue() + d2)) / b2, a2.c, ((Float) b.c.a()).floatValue() * this.d.b(), b.d);
        this.a = vfp;
        vfp vfp2 = new vfp(((float) ((Integer) a.a.a()).intValue()) / b2, ((float) (((Integer) a.b.a()).intValue() + d2)) / b2, ((float) a2.a.getAlpha()) / 255.0f, ((Float) a.c.a()).floatValue(), a.d);
        this.b = vfp2;
        vfp vfp3 = new vfp(((float) ((Integer) c.a.a()).intValue()) / b2, ((float) (d2 + ((Integer) c.b.a()).intValue())) / b2, e.getAlpha(), ((Float) c.c.a()).floatValue(), c.d);
        this.c = vfp3;
    }

    public final void a(float f) {
        StretchingGradientDrawable a2 = this.d.a();
        View e = this.d.e();
        a2.c = this.a.a(f);
        a2.a(this.b.a(f));
        e.setAlpha(this.c.a(f));
        this.d.c();
    }

    public final int b() {
        return this.d.d() + ((Integer) b.b.a()).intValue();
    }
}
