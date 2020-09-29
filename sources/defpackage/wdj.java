package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: wdj reason: default package */
public final class wdj implements wig<wcn> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxRouter> b;

    private wdj(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static wdj a(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        return new wdj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (wcn) wil.a((wcn) ((Cosmonaut) this.a.get()).createCosmosService(wcn.class, (RxRouter) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
