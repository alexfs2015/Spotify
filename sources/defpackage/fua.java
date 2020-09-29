package defpackage;

import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: fua reason: default package */
public final class fua implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(266));
    private final ftz c;
    private uty d;

    public fua(ftz ftz) {
        this.c = ftz;
    }

    public final void a() {
        float b2 = this.c.b();
        float b3 = (float) b();
        uty uty = new uty(((float) ((Integer) a.a()).intValue()) / b3, ((float) ((Integer) b.a()).intValue()) / b3, (((0.5f * b2) - ((float) this.c.a().a())) / b2) * b2, 0.0f, ftn.d);
        this.d = uty;
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
