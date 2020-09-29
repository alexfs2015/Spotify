package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: kvg reason: default package */
public final class kvg implements vua<kvf> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxRouter> b;

    private kvg(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kvg a(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        return new kvg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (kvf) vuf.a((kvf) ((Cosmonaut) this.a.get()).createCosmosService(kvf.class, (RxRouter) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
