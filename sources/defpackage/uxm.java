package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uxm reason: default package */
public final class uxm implements vua<uxi> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private uxm(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uxm a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new uxm(wlc, wlc2);
    }

    public static uxi a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (uxi) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
