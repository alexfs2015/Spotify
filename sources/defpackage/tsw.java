package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: tsw reason: default package */
public final class tsw implements wig<tsx> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private tsw(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tsw a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new tsw(wzi, wzi2);
    }

    public static tsx a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (tsx) wil.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
