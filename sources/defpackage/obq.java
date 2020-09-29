package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: obq reason: default package */
public final class obq implements vua<gmf<oas>> {
    private final wlc<oci> a;
    private final wlc<a> b;
    private final wlc<gkg> c;
    private final wlc<Scheduler> d;
    private final wlc<Scheduler> e;
    private final wlc<b> f;
    private final wlc<a<oas>> g;

    private obq(wlc<oci> wlc, wlc<a> wlc2, wlc<gkg> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5, wlc<b> wlc6, wlc<a<oas>> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static obq a(wlc<oci> wlc, wlc<a> wlc2, wlc<gkg> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5, wlc<b> wlc6, wlc<a<oas>> wlc7) {
        obq obq = new obq(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return obq;
    }

    public final /* synthetic */ Object get() {
        oci oci = (oci) this.a.get();
        rvc rvc = new rvc(oci.o(), oci, (a) this.b.get(), (gkg) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get(), (b) this.f.get(), (a) this.g.get());
        return (gmf) vuf.a(rvc, "Cannot return null from a non-@Nullable @Provides method");
    }
}
