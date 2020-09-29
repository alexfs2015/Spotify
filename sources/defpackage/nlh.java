package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import io.reactivex.Scheduler;

/* renamed from: nlh reason: default package */
public final class nlh implements wig<vvy<hcs>> {
    private final wzi<Scheduler> a;
    private final wzi<nit> b;

    private nlh(wzi<Scheduler> wzi, wzi<nit> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nlh a(wzi<Scheduler> wzi, wzi<nit> wzi2) {
        return new nlh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        nit nit = (nit) this.b.get();
        String str = "home-loading-empty-view";
        a aVar = new a(hbb.b().c(hcx.builder().a("home:shimmeringProgress", HubsComponentCategory.HEADER.mId).e(nit.a(str)).c(HubsImmutableComponentBundle.builder().a("ui:group", str).a()).a()).a(), (Scheduler) this.a.get());
        aVar.a = 200;
        return (vvy) wil.a(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
