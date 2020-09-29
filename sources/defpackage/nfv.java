package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: nfv reason: default package */
public final class nfv implements vua<hde> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<Boolean> c;

    private nfv(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nfv a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<Boolean> wlc3) {
        return new nfv(wlc, wlc2, wlc3);
    }

    public static hde a(RxResolver rxResolver, rnf rnf, boolean z) {
        return (hde) vuf.a(CC.a(rxResolver, rnf, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((RxResolver) this.a.get(), (rnf) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
