package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: rqz reason: default package */
public final class rqz implements vua<rra> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxRouter> b;

    private rqz(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rqz a(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        return new rqz(wlc, wlc2);
    }

    public static rra a(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return (rra) vuf.a(CC.a(cosmonaut, rxRouter), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxRouter) this.b.get());
    }
}
