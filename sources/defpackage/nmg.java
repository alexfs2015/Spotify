package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import io.reactivex.Scheduler;

/* renamed from: nmg reason: default package */
public final class nmg implements vua<nmf> {
    private final wlc<oix> a;
    private final wlc<Scheduler> b;
    private final wlc<uxh> c;
    private final wlc<nke> d;
    private final wlc<HomeMixInteractionLogger> e;
    private final wlc<njy> f;
    private final wlc<String> g;
    private final wlc<HomeMixFormatListAttributesHelper> h;
    private final wlc<kxz> i;

    private nmg(wlc<oix> wlc, wlc<Scheduler> wlc2, wlc<uxh> wlc3, wlc<nke> wlc4, wlc<HomeMixInteractionLogger> wlc5, wlc<njy> wlc6, wlc<String> wlc7, wlc<HomeMixFormatListAttributesHelper> wlc8, wlc<kxz> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static nmg a(wlc<oix> wlc, wlc<Scheduler> wlc2, wlc<uxh> wlc3, wlc<nke> wlc4, wlc<HomeMixInteractionLogger> wlc5, wlc<njy> wlc6, wlc<String> wlc7, wlc<HomeMixFormatListAttributesHelper> wlc8, wlc<kxz> wlc9) {
        nmg nmg = new nmg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return nmg;
    }

    public final /* synthetic */ Object get() {
        nmf nmf = new nmf((oix) this.a.get(), (Scheduler) this.b.get(), (uxh) this.c.get(), (nke) this.d.get(), (HomeMixInteractionLogger) this.e.get(), (njy) this.f.get(), (String) this.g.get(), (HomeMixFormatListAttributesHelper) this.h.get(), (kxz) this.i.get());
        return nmf;
    }
}
