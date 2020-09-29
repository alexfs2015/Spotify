package defpackage;

import android.content.res.Resources;

/* renamed from: tmz reason: default package */
public final class tmz implements vua<tmy> {
    private final wlc<Resources> a;
    private final wlc<gbd> b;

    private tmz(wlc<Resources> wlc, wlc<gbd> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tmz a(wlc<Resources> wlc, wlc<gbd> wlc2) {
        return new tmz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tmy((Resources) this.a.get(), (gbd) this.b.get());
    }
}
