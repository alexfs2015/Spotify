package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hwq reason: default package */
public final class hwq implements vua<hxk> {
    private final wlc<rnf> a;
    private final wlc<RxResolver> b;

    private hwq(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hwq a(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        return new hwq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (hxk) vuf.a(CC.c((rnf) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
