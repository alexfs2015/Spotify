package defpackage;

import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.Reason;

/* renamed from: niv reason: default package */
public final class niv implements vua<heq<gzz>> {
    private final wlc<nfd> a;
    private final wlc<ndv> b;
    private final wlc<njf> c;

    private niv(wlc<nfd> wlc, wlc<ndv> wlc2, wlc<njf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static niv a(wlc<nfd> wlc, wlc<ndv> wlc2, wlc<njf> wlc3) {
        return new niv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        ndv ndv = (ndv) this.b.get();
        njf njf = (njf) this.c.get();
        njf.a((View) ((nfd) this.a.get()).a);
        njf.b = Reason.LOAD;
        return (heq) vuf.a(heq.a(new a().a(ndv).a(njf).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
