package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: oii reason: default package */
public final class oii implements vua<oih> {
    private final wlc<oif> a;
    private final wlc<LicenseLayoutProvider> b;

    private oii(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oii a(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        return new oii(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oih((oif) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
