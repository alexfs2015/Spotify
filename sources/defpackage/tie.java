package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: tie reason: default package */
public final class tie implements vua<tif> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private tie(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tie a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new tie(wlc, wlc2);
    }

    public static tif a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (tif) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
