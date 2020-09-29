package defpackage;

import android.content.res.Resources;

/* renamed from: ndf reason: default package */
public final class ndf implements vua<nde> {
    private final wlc<Resources> a;

    private ndf(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static ndf a(wlc<Resources> wlc) {
        return new ndf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nde((Resources) this.a.get());
    }
}
