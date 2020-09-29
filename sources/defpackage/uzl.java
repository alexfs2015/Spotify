package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uzl reason: default package */
public final class uzl implements vua<uzj> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private uzl(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uzl a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new uzl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (uzj) vuf.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
