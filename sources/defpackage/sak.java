package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: sak reason: default package */
public final class sak implements wig<sal> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxRouter> b;

    private sak(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sak a(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        return new sak(wzi, wzi2);
    }

    public static sal a(Cosmonaut cosmonaut, RxRouter rxRouter) {
        return (sal) wil.a(CC.a(cosmonaut, rxRouter), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxRouter) this.b.get());
    }
}
