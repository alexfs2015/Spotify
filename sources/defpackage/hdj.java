package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: hdj reason: default package */
public final class hdj implements vua<hdh> {
    private final wlc<Cosmonaut> a;
    private final wlc<RxResolver> b;

    public static hdh a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (hdh) vuf.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
