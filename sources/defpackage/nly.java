package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: nly reason: default package */
public final class nly implements vua<nlx> {
    private final wlc<LicenseLayoutProvider> a;

    private nly(wlc<LicenseLayoutProvider> wlc) {
        this.a = wlc;
    }

    public static nly a(wlc<LicenseLayoutProvider> wlc) {
        return new nly(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nlx((LicenseLayoutProvider) this.a.get());
    }
}
