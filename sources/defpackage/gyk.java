package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: gyk reason: default package */
public final class gyk implements vua<gyj> {
    private final wlc<lkn> a;
    private final wlc<a> b;

    private gyk(wlc<lkn> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gyk a(wlc<lkn> wlc, wlc<a> wlc2) {
        return new gyk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new gyj((lkn) this.a.get(), (a) this.b.get());
    }
}
