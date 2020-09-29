package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ulr reason: default package */
public final class ulr implements vua<ulq> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<ulo> c;

    private ulr(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<ulo> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ulr a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<ulo> wlc3) {
        return new ulr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ulq((RxResolver) this.a.get(), (rnf) this.b.get(), (ulo) this.c.get());
    }
}
