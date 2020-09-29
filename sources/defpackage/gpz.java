package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: gpz reason: default package */
public final class gpz implements vua<gpx> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private gpz(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gpz a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new gpz(wlc, wlc2);
    }

    public static gpx a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (gpx) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
