package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hwl reason: default package */
public final class hwl implements vua<hxi> {
    private final wlc<rnf> a;
    private final wlc<RxResolver> b;
    private final wlc<gkz> c;

    private hwl(wlc<rnf> wlc, wlc<RxResolver> wlc2, wlc<gkz> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hwl a(wlc<rnf> wlc, wlc<RxResolver> wlc2, wlc<gkz> wlc3) {
        return new hwl(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (hxi) vuf.a(CC.a((rnf) this.a.get(), (RxResolver) this.b.get(), (gkz) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
