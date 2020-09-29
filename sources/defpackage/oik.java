package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: oik reason: default package */
public final class oik implements vua<oij> {
    private final wlc<oif> a;
    private final wlc<LicenseLayoutProvider> b;

    private oik(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oik a(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        return new oik(wlc, wlc2);
    }

    public static oij a(Object obj, LicenseLayoutProvider licenseLayoutProvider) {
        return new oij((oif) obj, licenseLayoutProvider);
    }

    public final /* synthetic */ Object get() {
        return new oij((oif) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
