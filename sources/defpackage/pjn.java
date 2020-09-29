package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: pjn reason: default package */
public final class pjn implements vua<pju> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxRouter> b;

    public static pju a(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return (pju) vuf.a(CC.a(cosmonaut, rxRouter), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxRouter) this.b.get());
    }
}
