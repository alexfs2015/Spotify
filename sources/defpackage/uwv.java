package defpackage;

import com.spotify.cosmos.router.RxRouter;

/* renamed from: uwv reason: default package */
public final class uwv implements vua<uwu> {
    private final wlc<RxRouter> a;
    private final wlc<rnf> b;

    private uwv(wlc<RxRouter> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uwv a(wlc<RxRouter> wlc, wlc<rnf> wlc2) {
        return new uwv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new uwu((RxRouter) this.a.get(), (rnf) this.b.get());
    }
}
