package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: vmc reason: default package */
public final class vmc implements wig<vly> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private vmc(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vmc a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new vmc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (vly) wil.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
