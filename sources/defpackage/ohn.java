package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: ohn reason: default package */
public final class ohn implements vua<ohm> {
    private final wlc<oif> a;
    private final wlc<LicenseLayoutProvider> b;

    private ohn(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ohn a(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        return new ohn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ohm((oif) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
