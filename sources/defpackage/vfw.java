package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: vfw reason: default package */
public final class vfw implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Float> b;
    private static vgh<Float> c;
    private final vfy d;
    private vfp e;
    private vfp f;
    private vfp g;

    static {
        Float valueOf = Float.valueOf(0.6f);
        b = vgh.a(valueOf);
        c = vgh.a(valueOf);
    }

    public vfw(vfy vfy) {
        this.d = vfy;
    }

    public final void a() {
        Interpolator a2 = vft.a(this.d.b().getContext());
        vfp vfp = new vfp(0.0f, 1.0f, this.d.b().getScaleX(), this.d.e(), a2);
        this.e = vfp;
        if (!this.d.c().isEmpty()) {
            vfp vfp2 = new vfp(0.0f, 1.0f, ((View) this.d.c().get(0)).getAlpha(), ((Float) b.a()).floatValue(), a2);
            this.f = vfp2;
        }
        if (!this.d.d().isEmpty()) {
            vfp vfp3 = new vfp(0.0f, 1.0f, ((View) this.d.d().get(0)).getAlpha(), ((Float) c.a()).floatValue(), a2);
            this.g = vfp3;
        }
    }

    public final void a(float f2) {
        this.d.b().setScaleX(this.e.a(f2));
        this.d.b().setScaleY(this.e.a(f2));
        if (!this.d.c().isEmpty()) {
            for (View alpha : this.d.c()) {
                alpha.setAlpha(this.f.a(f2));
            }
        }
        if (!this.d.d().isEmpty()) {
            for (View alpha2 : this.d.d()) {
                alpha2.setAlpha(this.g.a(f2));
            }
        }
    }

    public final int b() {
        return ((Integer) a.a()).intValue();
    }
}
