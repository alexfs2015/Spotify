package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: vga reason: default package */
public final class vga implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(VERSION.SDK_INT < 21 ? 0 : 200));
    private final vfy b;
    private vfp c;
    private vfp d;
    private vfp e;

    public vga(vfy vfy) {
        this.b = vfy;
    }

    public final void a() {
        Interpolator a2 = vft.a(this.b.b().getContext());
        vfp vfp = new vfp(0.0f, 1.0f, this.b.b().getScaleX(), 1.0f, a2);
        this.c = vfp;
        if (!this.b.c().isEmpty()) {
            vfp vfp2 = new vfp(0.0f, 1.0f, ((View) this.b.c().get(0)).getAlpha(), 1.0f, a2);
            this.d = vfp2;
        }
        if (!this.b.d().isEmpty()) {
            vfp vfp3 = new vfp(0.0f, 1.0f, ((View) this.b.d().get(0)).getAlpha(), 1.0f, a2);
            this.e = vfp3;
        }
    }

    public final void a(float f) {
        this.b.b().setScaleX(this.c.a(f));
        this.b.b().setScaleY(this.c.a(f));
        if (!this.b.c().isEmpty()) {
            for (View alpha : this.b.c()) {
                alpha.setAlpha(this.d.a(f));
            }
        }
        if (!this.b.d().isEmpty()) {
            for (View alpha2 : this.b.d()) {
                alpha2.setAlpha(this.e.a(f));
            }
        }
    }

    public final int b() {
        return ((Integer) a.a()).intValue();
    }
}
