package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: ozx reason: default package */
public final class ozx implements vua<ozw> {
    private final wlc<lkn> a;
    private final wlc<wug> b;
    private final wlc<a> c;

    private ozx(wlc<lkn> wlc, wlc<wug> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ozx a(wlc<lkn> wlc, wlc<wug> wlc2, wlc<a> wlc3) {
        return new ozx(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ozw((lkn) this.a.get(), (wug) this.b.get(), (a) this.c.get());
    }
}
