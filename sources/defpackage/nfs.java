package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import io.reactivex.Scheduler;

/* renamed from: nfs reason: default package */
public final class nfs implements vua<vit<gzz>> {
    private final wlc<Scheduler> a;
    private final wlc<nde> b;

    private nfs(wlc<Scheduler> wlc, wlc<nde> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nfs a(wlc<Scheduler> wlc, wlc<nde> wlc2) {
        return new nfs(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        nde nde = (nde) this.b.get();
        String str = "home-loading-empty-view";
        a aVar = new a(gyi.b().c(hae.builder().a("home:shimmeringProgress", HubsComponentCategory.HEADER.mId).e(nde.a(str)).c(HubsImmutableComponentBundle.builder().a("ui:group", str).a()).a()).a(), (Scheduler) this.a.get());
        aVar.a = 200;
        return (vit) vuf.a(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
