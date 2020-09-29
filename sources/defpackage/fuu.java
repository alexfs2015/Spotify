package defpackage;

import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: fuu reason: default package */
public final class fuu implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Integer> b = vgh.a(Integer.valueOf(266));
    private final fut c;
    private vfp d;

    public fuu(fut fut) {
        this.c = fut;
    }

    public final void a() {
        float b2 = this.c.b();
        float b3 = (float) b();
        vfp vfp = new vfp(((float) ((Integer) a.a()).intValue()) / b3, ((float) ((Integer) b.a()).intValue()) / b3, (((0.5f * b2) - ((float) this.c.a().a())) / b2) * b2, 0.0f, fuh.d);
        this.d = vfp;
    }

    public final void a(float f) {
        StretchingGradientDrawable a2 = this.c.a();
        a2.b = (int) this.d.a(f);
        a2.b();
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }
}
