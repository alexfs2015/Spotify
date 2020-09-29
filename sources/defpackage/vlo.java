package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: vlo reason: default package */
public final class vlo implements wig<vlm> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private vlo(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vlo a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new vlo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (vlm) wil.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
