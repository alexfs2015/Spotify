package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import io.reactivex.Scheduler;

/* renamed from: nrv reason: default package */
public final class nrv implements wig<nru> {
    private final wzi<Scheduler> a;
    private final wzi<vjj> b;
    private final wzi<npy> c;
    private final wzi<HomeMixInteractionLogger> d;
    private final wzi<nps> e;
    private final wzi<String> f;
    private final wzi<HomeMixFormatListAttributesHelper> g;
    private final wzi<lbi> h;

    private nrv(wzi<Scheduler> wzi, wzi<vjj> wzi2, wzi<npy> wzi3, wzi<HomeMixInteractionLogger> wzi4, wzi<nps> wzi5, wzi<String> wzi6, wzi<HomeMixFormatListAttributesHelper> wzi7, wzi<lbi> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static nrv a(wzi<Scheduler> wzi, wzi<vjj> wzi2, wzi<npy> wzi3, wzi<HomeMixInteractionLogger> wzi4, wzi<nps> wzi5, wzi<String> wzi6, wzi<HomeMixFormatListAttributesHelper> wzi7, wzi<lbi> wzi8) {
        nrv nrv = new nrv(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return nrv;
    }

    public final /* synthetic */ Object get() {
        nru nru = new nru((Scheduler) this.a.get(), (vjj) this.b.get(), (npy) this.c.get(), (HomeMixInteractionLogger) this.d.get(), (nps) this.e.get(), (String) this.f.get(), (HomeMixFormatListAttributesHelper) this.g.get(), (lbi) this.h.get());
        return nru;
    }
}
