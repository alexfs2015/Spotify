package defpackage;

import com.spotify.cosmos.router.RxRouter;

/* renamed from: uwt reason: default package */
public final class uwt implements vua<uws> {
    private final wlc<RxRouter> a;
    private final wlc<rnf> b;

    private uwt(wlc<RxRouter> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uwt a(wlc<RxRouter> wlc, wlc<rnf> wlc2) {
        return new uwt(wlc, wlc2);
    }

    public static uws a(RxRouter rxRouter, rnf rnf) {
        return new uws(rxRouter, rnf);
    }

    public final /* synthetic */ Object get() {
        return new uws((RxRouter) this.a.get(), (rnf) this.b.get());
    }
}
