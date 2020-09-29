package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: vji reason: default package */
public final class vji implements wig<vjf> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private vji(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vjf a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (vjf) wil.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vji a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new vji(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
