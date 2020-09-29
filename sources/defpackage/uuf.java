package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: uuf reason: default package */
public final class uuf implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Float> b;
    private static uuq<Float> c;
    private final uuh d;
    private uty e;
    private uty f;
    private uty g;

    static {
        Float valueOf = Float.valueOf(0.6f);
        b = uuq.a(valueOf);
        c = uuq.a(valueOf);
    }

    public uuf(uuh uuh) {
        this.d = uuh;
    }

    public final void a() {
        Interpolator a2 = uuc.a(this.d.b().getContext());
        uty uty = new uty(0.0f, 1.0f, this.d.b().getScaleX(), this.d.e(), a2);
        this.e = uty;
        if (!this.d.c().isEmpty()) {
            uty uty2 = new uty(0.0f, 1.0f, ((View) this.d.c().get(0)).getAlpha(), ((Float) b.a()).floatValue(), a2);
            this.f = uty2;
        }
        if (!this.d.d().isEmpty()) {
            uty uty3 = new uty(0.0f, 1.0f, ((View) this.d.d().get(0)).getAlpha(), ((Float) c.a()).floatValue(), a2);
            this.g = uty3;
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
