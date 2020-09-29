package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uxy reason: default package */
public final class uxy implements vua<uxu> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private uxy(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uxy a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new uxy(wlc, wlc2);
    }

    public static uxu a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (uxu) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
