package defpackage;

import android.content.res.Resources;

/* renamed from: saz reason: default package */
public final class saz implements vua<say> {
    private final wlc<Resources> a;

    private saz(wlc<Resources> wlc) {
        this.a = wlc;
    }

    public static saz a(wlc<Resources> wlc) {
        return new saz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new say((Resources) this.a.get());
    }
}
