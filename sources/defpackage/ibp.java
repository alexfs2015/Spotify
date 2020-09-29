package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ibp reason: default package */
public final class ibp implements vua<hzy> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;

    public static hzy a(RxResolver rxResolver, rnf rnf) {
        return (hzy) vuf.a(CC.a(rxResolver, rnf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((RxResolver) this.a.get(), (rnf) this.b.get());
    }
}
