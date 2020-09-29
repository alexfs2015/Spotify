package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hqz reason: default package */
public final class hqz implements vua<hqy> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;
    private final wlc<hth> c;

    private hqz(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<hth> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hqz a(wlc<RxResolver> wlc, wlc<rnf> wlc2, wlc<hth> wlc3) {
        return new hqz(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hqy((RxResolver) this.a.get(), (rnf) this.b.get(), (hth) this.c.get());
    }
}
