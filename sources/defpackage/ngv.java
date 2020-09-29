package defpackage;

import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.Reason;

/* renamed from: ngv reason: default package */
public final class ngv implements vua<heq<gzz>> {
    private final wlc<nfd> a;
    private final wlc<ngw> b;
    private final wlc<ndv> c;
    private final wlc<nhc> d;
    private final wlc<rfd> e;
    private final wlc<njf> f;

    private ngv(wlc<nfd> wlc, wlc<ngw> wlc2, wlc<ndv> wlc3, wlc<nhc> wlc4, wlc<rfd> wlc5, wlc<njf> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ngv a(wlc<nfd> wlc, wlc<ngw> wlc2, wlc<ndv> wlc3, wlc<nhc> wlc4, wlc<rfd> wlc5, wlc<njf> wlc6) {
        ngv ngv = new ngv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ngv;
    }

    public final /* synthetic */ Object get() {
        ngw ngw = (ngw) this.b.get();
        ndv ndv = (ndv) this.c.get();
        nhc nhc = (nhc) this.d.get();
        rfd rfd = (rfd) this.e.get();
        njf njf = (njf) this.f.get();
        njf.a((View) ((nfd) this.a.get()).a);
        njf.b = Reason.LOAD;
        return (heq) vuf.a(heq.a(new a().a(ngw).a(rfd).a(ndv).a(nhc).a(njf).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
