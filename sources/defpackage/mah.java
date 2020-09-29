package defpackage;

import android.content.res.Resources;

/* renamed from: mah reason: default package */
public final class mah implements vua<mag> {
    private final wlc<Resources> a;

    private mah(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static mah a(wlc<Resources> wlc) {
        return new mah(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mag((Resources) this.a.get());
    }
}
