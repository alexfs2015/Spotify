package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nse reason: default package */
public final class nse implements wig<nsd> {
    private final wzi<a> a;
    private final wzi<a> b;
    private final wzi<HomeMixFormatListAttributesHelper> c;
    private final wzi<nth> d;
    private final wzi<hxx> e;
    private final wzi<HomeMixInteractionLogger> f;

    private nse(wzi<a> wzi, wzi<a> wzi2, wzi<HomeMixFormatListAttributesHelper> wzi3, wzi<nth> wzi4, wzi<hxx> wzi5, wzi<HomeMixInteractionLogger> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static nse a(wzi<a> wzi, wzi<a> wzi2, wzi<HomeMixFormatListAttributesHelper> wzi3, wzi<nth> wzi4, wzi<hxx> wzi5, wzi<HomeMixInteractionLogger> wzi6) {
        nse nse = new nse(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return nse;
    }

    public final /* synthetic */ Object get() {
        nsd nsd = new nsd(this.a, this.b, this.c, this.d, this.e, this.f);
        return nsd;
    }
}
