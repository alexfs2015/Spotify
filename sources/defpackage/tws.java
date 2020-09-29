package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: tws reason: default package */
public final class tws implements vua<twr> {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;

    private tws(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tws a(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        return new tws(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new twr((RxResolver) this.a.get(), (rnf) this.b.get());
    }
}
