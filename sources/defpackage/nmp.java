package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nmp reason: default package */
public final class nmp implements vua<nmo> {
    private final wlc<oix> a;
    private final wlc<a> b;
    private final wlc<orf> c;
    private final wlc<a> d;
    private final wlc<HomeMixFormatListAttributesHelper> e;
    private final wlc<nng> f;
    private final wlc<hvl> g;
    private final wlc<HomeMixInteractionLogger> h;

    private nmp(wlc<oix> wlc, wlc<a> wlc2, wlc<orf> wlc3, wlc<a> wlc4, wlc<HomeMixFormatListAttributesHelper> wlc5, wlc<nng> wlc6, wlc<hvl> wlc7, wlc<HomeMixInteractionLogger> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static nmp a(wlc<oix> wlc, wlc<a> wlc2, wlc<orf> wlc3, wlc<a> wlc4, wlc<HomeMixFormatListAttributesHelper> wlc5, wlc<nng> wlc6, wlc<hvl> wlc7, wlc<HomeMixInteractionLogger> wlc8) {
        nmp nmp = new nmp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return nmp;
    }

    public final /* synthetic */ Object get() {
        nmo nmo = new nmo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        return nmo;
    }
}
