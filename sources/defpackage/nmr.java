package defpackage;

import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.Reason;

/* renamed from: nmr reason: default package */
public final class nmr implements wig<hhm<hcs>> {
    private final wzi<nks> a;
    private final wzi<nms> b;
    private final wzi<njk> c;
    private final wzi<nmy> d;
    private final wzi<rof> e;
    private final wzi<npb> f;

    private nmr(wzi<nks> wzi, wzi<nms> wzi2, wzi<njk> wzi3, wzi<nmy> wzi4, wzi<rof> wzi5, wzi<npb> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static nmr a(wzi<nks> wzi, wzi<nms> wzi2, wzi<njk> wzi3, wzi<nmy> wzi4, wzi<rof> wzi5, wzi<npb> wzi6) {
        nmr nmr = new nmr(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return nmr;
    }

    public final /* synthetic */ Object get() {
        nms nms = (nms) this.b.get();
        njk njk = (njk) this.c.get();
        nmy nmy = (nmy) this.d.get();
        rof rof = (rof) this.e.get();
        npb npb = (npb) this.f.get();
        npb.a((View) ((nks) this.a.get()).a);
        npb.b = Reason.LOAD;
        return (hhm) wil.a(hhm.a(new a().a(nms).a(rof).a(njk).a(nmy).a(npb).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
