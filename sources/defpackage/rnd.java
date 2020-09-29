package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: rnd reason: default package */
public final class rnd implements wig<rne> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxRouter> b;

    public static rne a(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return (rne) wil.a(CC.a(cosmonaut, rxRouter), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxRouter) this.b.get());
    }
}
