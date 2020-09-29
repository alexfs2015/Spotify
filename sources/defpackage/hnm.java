package defpackage;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.SessionClient;

/* renamed from: hnm reason: default package */
public final class hnm implements wig<hnl> {
    private final wzi<hnq> a;
    private final wzi<SessionClient> b;
    private final wzi<nxs> c;
    private final wzi<BootstrapHandler> d;
    private final wzi<gbm> e;

    private hnm(wzi<hnq> wzi, wzi<SessionClient> wzi2, wzi<nxs> wzi3, wzi<BootstrapHandler> wzi4, wzi<gbm> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static hnm a(wzi<hnq> wzi, wzi<SessionClient> wzi2, wzi<nxs> wzi3, wzi<BootstrapHandler> wzi4, wzi<gbm> wzi5) {
        hnm hnm = new hnm(wzi, wzi2, wzi3, wzi4, wzi5);
        return hnm;
    }

    public final /* synthetic */ Object get() {
        hnl hnl = new hnl((hnq) this.a.get(), (SessionClient) this.b.get(), (nxs) this.c.get(), (BootstrapHandler) this.d.get(), (gbm) this.e.get());
        return hnl;
    }
}
