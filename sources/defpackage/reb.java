package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: reb reason: default package */
public final class reb implements vua<rec> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxRouter> b;

    public static rec a(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return (rec) vuf.a(CC.a(cosmonaut, rxRouter), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxRouter) this.b.get());
    }
}
