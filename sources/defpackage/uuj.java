package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: uuj reason: default package */
public final class uuj implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(VERSION.SDK_INT < 21 ? 0 : 200));
    private final uuh b;
    private uty c;
    private uty d;
    private uty e;

    public uuj(uuh uuh) {
        this.b = uuh;
    }

    public final void a() {
        Interpolator a2 = uuc.a(this.b.b().getContext());
        uty uty = new uty(0.0f, 1.0f, this.b.b().getScaleX(), 1.0f, a2);
        this.c = uty;
        if (!this.b.c().isEmpty()) {
            uty uty2 = new uty(0.0f, 1.0f, ((View) this.b.c().get(0)).getAlpha(), 1.0f, a2);
            this.d = uty2;
        }
        if (!this.b.d().isEmpty()) {
            uty uty3 = new uty(0.0f, 1.0f, ((View) this.b.d().get(0)).getAlpha(), 1.0f, a2);
            this.e = uty3;
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
