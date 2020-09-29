package defpackage;

import android.content.res.Resources;

/* renamed from: ndz reason: default package */
public final class ndz implements vua<ndy> {
    private final wlc<Resources> a;

    private ndz(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static ndz a(wlc<Resources> wlc) {
        return new ndz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ndy((Resources) this.a.get());
    }
}
