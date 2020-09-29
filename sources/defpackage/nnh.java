package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nnh reason: default package */
public final class nnh implements vua<nng> {
    private final wlc<HomeMixFormatListAttributesHelper> a;
    private final wlc<fpt> b;

    private nnh(wlc<HomeMixFormatListAttributesHelper> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nnh a(wlc<HomeMixFormatListAttributesHelper> wlc, wlc<fpt> wlc2) {
        return new nnh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nng((HomeMixFormatListAttributesHelper) this.a.get(), (fpt) this.b.get());
    }
}
