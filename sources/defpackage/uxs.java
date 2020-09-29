package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uxs reason: default package */
public final class uxs implements vua<uxo> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private uxs(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uxs a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new uxs(wlc, wlc2);
    }

    public static uxo a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (uxo) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
