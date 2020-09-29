package defpackage;

import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.Reason;

/* renamed from: nor reason: default package */
public final class nor implements wig<hhm<hcs>> {
    private final wzi<nks> a;
    private final wzi<njk> b;
    private final wzi<npb> c;

    private nor(wzi<nks> wzi, wzi<njk> wzi2, wzi<npb> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nor a(wzi<nks> wzi, wzi<njk> wzi2, wzi<npb> wzi3) {
        return new nor(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        njk njk = (njk) this.b.get();
        npb npb = (npb) this.c.get();
        npb.a((View) ((nks) this.a.get()).a);
        npb.b = Reason.LOAD;
        return (hhm) wil.a(hhm.a(new a().a(njk).a(npb).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
