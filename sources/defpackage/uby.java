package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uby reason: default package */
public final class uby implements vua<ucg> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private uby(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uby a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new uby(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ucg) vuf.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
