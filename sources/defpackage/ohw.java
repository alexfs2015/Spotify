package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: ohw reason: default package */
public final class ohw implements vua<ohv> {
    private final wlc<oif> a;
    private final wlc<LicenseLayoutProvider> b;

    private ohw(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ohw a(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        return new ohw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ohv((oif) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
