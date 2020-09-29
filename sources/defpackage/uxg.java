package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uxg reason: default package */
public final class uxg implements vua<uxd> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private uxg(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uxg a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new uxg(wlc, wlc2);
    }

    public static uxd a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (uxd) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
