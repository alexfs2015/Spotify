package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: vqi reason: default package */
public final class vqi implements vua<vpm> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxRouter> b;

    private vqi(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static vqi a(wlc<Cosmonaut> wlc, wlc<RxRouter> wlc2) {
        return new vqi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (vpm) vuf.a((vpm) ((Cosmonaut) this.a.get()).createCosmosService(vpm.class, (RxRouter) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
