package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: fur reason: default package */
public final class fur implements vfr {
    private vfp a;
    private final vfp b;
    private final fut c;

    /* renamed from: fur$a */
    public static class a {
        public static final vgh<Integer> a = vgh.a(Integer.valueOf(0));
        public static final vgh<Integer> b = vgh.a(Integer.valueOf(266));
        public static final vgh<Float> c = vgh.a(Float.valueOf(0.0f));
        public static final vgh<Float> d = vgh.a(Float.valueOf(0.5f));
        public static final Interpolator e = fuh.d;
    }

    /* renamed from: fur$b */
    public static class b {
        public static final vgh<Integer> a = vgh.a(Integer.valueOf(0));
        public static final vgh<Integer> b = vgh.a(Integer.valueOf(266));
        public static final vgh<Float> c = vgh.a(Float.valueOf(1.0f));
        public static final vgh<Float> d = vgh.a(Float.valueOf(0.0f));
        public static final Interpolator e = fuh.d;
    }

    public fur(fut fut) {
        this.c = fut;
        float b2 = (float) b();
        vfp vfp = new vfp(((float) ((Integer) a.a.a()).intValue()) / b2, ((float) ((Integer) a.b.a()).intValue()) / b2, ((Float) a.c.a()).floatValue(), ((Float) a.d.a()).floatValue(), a.e);
        this.b = vfp;
    }

    public final void a() {
        float b2 = (float) b();
        vfp vfp = new vfp(((float) ((Integer) b.a.a()).intValue()) / b2, ((float) ((Integer) b.b.a()).intValue()) / b2, ((Float) b.c.a()).floatValue(), ((Float) b.d.a()).floatValue(), b.e);
        this.a = vfp;
    }

    public final void a(float f) {
        StretchingGradientDrawable a2 = this.c.a();
        float b2 = this.c.b();
        a2.a(this.b.a(f));
        a2.c = this.a.a(f) * b2;
        this.c.c();
    }

    public final int b() {
        return ((Integer) a.a.a()).intValue() + ((Integer) a.b.a()).intValue();
    }
}
