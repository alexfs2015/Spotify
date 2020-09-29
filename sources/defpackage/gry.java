package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: gry reason: default package */
public final class gry implements wig<grw> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private gry(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static grw a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (grw) wil.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static gry a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new gry(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
