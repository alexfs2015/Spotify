package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: san reason: default package */
public final class san implements vua<sal> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    private san(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static san a(wlc<Cosmonaut> wlc, wlc<RxResolver> wlc2) {
        return new san(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (sal) vuf.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
