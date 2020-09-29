package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: ftx reason: default package */
public final class ftx implements uua {
    private uty a;
    private final uty b;
    private final ftz c;

    /* renamed from: ftx$a */
    public static class a {
        public static final uuq<Integer> a = uuq.a(Integer.valueOf(0));
        public static final uuq<Integer> b = uuq.a(Integer.valueOf(266));
        public static final uuq<Float> c = uuq.a(Float.valueOf(0.0f));
        public static final uuq<Float> d = uuq.a(Float.valueOf(0.5f));
        public static final Interpolator e = ftn.d;
    }

    /* renamed from: ftx$b */
    public static class b {
        public static final uuq<Integer> a = uuq.a(Integer.valueOf(0));
        public static final uuq<Integer> b = uuq.a(Integer.valueOf(266));
        public static final uuq<Float> c = uuq.a(Float.valueOf(1.0f));
        public static final uuq<Float> d = uuq.a(Float.valueOf(0.0f));
        public static final Interpolator e = ftn.d;
    }

    public ftx(ftz ftz) {
        this.c = ftz;
        float b2 = (float) b();
        uty uty = new uty(((float) ((Integer) a.a.a()).intValue()) / b2, ((float) ((Integer) a.b.a()).intValue()) / b2, ((Float) a.c.a()).floatValue(), ((Float) a.d.a()).floatValue(), a.e);
        this.b = uty;
    }

    public final void a() {
        float b2 = (float) b();
        uty uty = new uty(((float) ((Integer) b.a.a()).intValue()) / b2, ((float) ((Integer) b.b.a()).intValue()) / b2, ((Float) b.c.a()).floatValue(), ((Float) b.d.a()).floatValue(), b.e);
        this.a = uty;
    }

    public final int b() {
        return ((Integer) a.a.a()).intValue() + ((Integer) a.b.a()).intValue();
    }

    public final void a(float f) {
        StretchingGradientDrawable a2 = this.c.a();
        float b2 = this.c.b();
        a2.a(this.b.a(f));
        a2.c = this.a.a(f) * b2;
        this.c.c();
    }
}
