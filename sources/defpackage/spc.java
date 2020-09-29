package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: spc reason: default package */
public final class spc implements soz {
    private final soz a;
    private final wlc<Boolean> b;

    public spc(soz soz, wlc<Boolean> wlc) {
        this.a = soz;
        this.b = wlc;
    }

    public final void a(sot sot, Fragment fragment, sou sou, soq soq) {
        if (((Boolean) this.b.get()).booleanValue()) {
            this.a.a(sot, fragment, sou, soq);
        }
    }
}
