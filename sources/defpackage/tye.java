package defpackage;

import android.content.res.Resources;

/* renamed from: tye reason: default package */
public final class tye implements vua<tyd> {
    private final wlc<Resources> a;
    private final wlc<txu> b;

    private tye(wlc<Resources> wlc, wlc<txu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tye a(wlc<Resources> wlc, wlc<txu> wlc2) {
        return new tye(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tyd((Resources) this.a.get(), (txu) this.b.get());
    }
}
