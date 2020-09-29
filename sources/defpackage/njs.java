package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: njs reason: default package */
public final class njs implements vua<HomeMixFormatListAttributesHelper> {
    private final wlc<rnf> a;

    private njs(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static njs a(wlc<rnf> wlc) {
        return new njs(wlc);
    }

    public final /* synthetic */ Object get() {
        return new HomeMixFormatListAttributesHelper((rnf) this.a.get());
    }
}
