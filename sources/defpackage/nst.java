package defpackage;

import android.content.res.Resources;

/* renamed from: nst reason: default package */
public final class nst implements vua<nss> {
    private final wlc<Resources> a;
    private final wlc<jry> b;

    private nst(wlc<Resources> wlc, wlc<jry> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nst a(wlc<Resources> wlc, wlc<jry> wlc2) {
        return new nst(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nss((Resources) this.a.get(), (jry) this.b.get());
    }
}
