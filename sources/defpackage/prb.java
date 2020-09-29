package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: prb reason: default package */
public final class prb implements wig<pqz> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxRouter> b;

    private prb(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pqz a(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return (pqz) wil.a(CC.a(cosmonaut, rxRouter), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static prb a(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        return new prb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxRouter) this.b.get());
    }
}
