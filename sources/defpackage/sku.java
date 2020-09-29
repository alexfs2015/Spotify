package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: sku reason: default package */
public final class sku implements wig<sks> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private sku(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sku a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new sku(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (sks) wil.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
