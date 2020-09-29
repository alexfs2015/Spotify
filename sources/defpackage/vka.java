package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: vka reason: default package */
public final class vka implements wig<vjw> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private vka(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vjw a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (vjw) wil.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vka a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new vka(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
