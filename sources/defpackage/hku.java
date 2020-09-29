package defpackage;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.SessionClient;

/* renamed from: hku reason: default package */
public final class hku implements vua<hkt> {
    private final wlc<hky> a;
    private final wlc<SessionClient> b;
    private final wlc<nrp> c;
    private final wlc<BootstrapHandler> d;

    private hku(wlc<hky> wlc, wlc<SessionClient> wlc2, wlc<nrp> wlc3, wlc<BootstrapHandler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hku a(wlc<hky> wlc, wlc<SessionClient> wlc2, wlc<nrp> wlc3, wlc<BootstrapHandler> wlc4) {
        return new hku(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hkt((hky) this.a.get(), (SessionClient) this.b.get(), (nrp) this.c.get(), (BootstrapHandler) this.d.get());
    }
}
