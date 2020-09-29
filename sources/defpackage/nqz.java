package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: nqz reason: default package */
public final class nqz implements vua<nrc> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    public static nrc a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (nrc) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
