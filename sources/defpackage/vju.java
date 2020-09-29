package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: vju reason: default package */
public final class vju implements wig<vjq> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private vju(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vjq a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (vjq) wil.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vju a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new vju(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
