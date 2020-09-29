package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: uot reason: default package */
public final class uot implements wig<upb> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private uot(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uot a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new uot(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (upb) wil.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
