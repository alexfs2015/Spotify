package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import io.reactivex.Scheduler;

/* renamed from: qba reason: default package */
public final class qba implements vua<vit<gzz>> {
    private final wlc<sgr> a;
    private final wlc<fpt> b;
    private final wlc<qbw> c;
    private final wlc<Scheduler> d;

    private qba(wlc<sgr> wlc, wlc<fpt> wlc2, wlc<qbw> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qba a(wlc<sgr> wlc, wlc<fpt> wlc2, wlc<qbw> wlc3, wlc<Scheduler> wlc4) {
        return new qba(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        vit vit;
        sgr sgr = (sgr) this.a.get();
        qbw qbw = (qbw) this.c.get();
        Scheduler scheduler = (Scheduler) this.d.get();
        if (((Boolean) ((fpt) fay.a((fpt) this.b.get())).a(ses.g)).booleanValue()) {
            a aVar = new a(gyi.b().c(hae.builder().a("search:shimmeringProgress", HubsComponentCategory.HEADER.mId).a()).a("tag", "search-spinner").a(), scheduler);
            aVar.a = 400;
            vit = aVar.a();
        } else {
            vit = new a(qbw.a(), scheduler).a();
        }
        return (vit) vuf.a(vit, "Cannot return null from a non-@Nullable @Provides method");
    }
}
