package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: ohp reason: default package */
public final class ohp implements vua<oho> {
    private final wlc<oif> a;
    private final wlc<LicenseLayoutProvider> b;

    private ohp(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ohp a(wlc<oif> wlc, wlc<LicenseLayoutProvider> wlc2) {
        return new ohp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oho((oif) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
