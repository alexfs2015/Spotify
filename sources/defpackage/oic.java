package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: oic reason: default package */
public final class oic implements vua<oib> {
    private final wlc<oif> a;
    private final wlc<hdb> b;
    private final wlc<LicenseLayoutProvider> c;

    private oic(wlc<oif> wlc, wlc<hdb> wlc2, wlc<LicenseLayoutProvider> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static oic a(wlc<oif> wlc, wlc<hdb> wlc2, wlc<LicenseLayoutProvider> wlc3) {
        return new oic(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new oib((oif) this.a.get(), (hdb) this.b.get(), (LicenseLayoutProvider) this.c.get());
    }
}
