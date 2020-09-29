package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: hgf reason: default package */
public final class hgf implements wig<hgd> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    public static hgd a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (hgd) wil.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
