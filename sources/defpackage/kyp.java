package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: kyp reason: default package */
public final class kyp implements wig<kyo> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxRouter> b;

    private kyp(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kyp a(wzi<Cosmonaut> wzi, wzi<RxRouter> wzi2) {
        return new kyp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (kyo) wil.a((kyo) ((Cosmonaut) this.a.get()).createCosmosService(kyo.class, (RxRouter) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
