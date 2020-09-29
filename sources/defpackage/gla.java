package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: gla reason: default package */
public final class gla implements vua<gkz> {
    private final wlc<RxResolver> a;
    private final wlc<wug> b;
    private final wlc<rnf> c;

    private gla(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<rnf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gla a(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<rnf> wlc3) {
        return new gla(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gkz((RxResolver) this.a.get(), (wug) this.b.get(), (rnf) this.c.get());
    }
}
