package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: ghf reason: default package */
public final class ghf implements vua<ghe> {
    private final wlc<FireAndForgetResolver> a;
    private final wlc<rnf> b;

    private ghf(wlc<FireAndForgetResolver> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ghf a(wlc<FireAndForgetResolver> wlc, wlc<rnf> wlc2) {
        return new ghf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ghe((FireAndForgetResolver) this.a.get(), (rnf) this.b.get());
    }
}
