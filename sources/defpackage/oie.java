package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: oie reason: default package */
public final class oie implements vua<oid> {
    private final wlc<oif> a;
    private final wlc<LicenseLayoutProvider> b;

    private oie(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oie a(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        return new oie(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oid((oif) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
