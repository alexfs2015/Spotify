package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: vjo reason: default package */
public final class vjo implements wig<vjk> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private vjo(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vjk a(Cosmonaut cosmonaut, RxResolver rxResolver) {
        return (vjk) wil.a(CC.a(cosmonaut, rxResolver), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static vjo a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new vjo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((Cosmonaut) this.a.get(), (RxResolver) this.b.get());
    }
}
