package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hwj reason: default package */
public final class hwj implements vua<hxf> {
    private final wlc<rnf> a;
    private final wlc<RxResolver> b;

    private hwj(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hwj a(wlc<rnf> wlc, wlc<RxResolver> wlc2) {
        return new hwj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (hxf) vuf.a(CC.a((rnf) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
