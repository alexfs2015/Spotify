package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: njr reason: default package */
public final class njr implements vua<njq> {
    private final wlc<nlx> a;
    private final wlc<oij> b;
    private final wlc<oht> c;
    private final wlc<LicenseLayoutProvider> d;
    private final wlc<String> e;

    private njr(wlc<nlx> wlc, wlc<oij> wlc2, wlc<oht> wlc3, wlc<LicenseLayoutProvider> wlc4, wlc<String> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static njr a(wlc<nlx> wlc, wlc<oij> wlc2, wlc<oht> wlc3, wlc<LicenseLayoutProvider> wlc4, wlc<String> wlc5) {
        njr njr = new njr(wlc, wlc2, wlc3, wlc4, wlc5);
        return njr;
    }

    public final /* synthetic */ Object get() {
        njq njq = new njq((nlx) this.a.get(), (oij) this.b.get(), (oht) this.c.get(), (LicenseLayoutProvider) this.d.get(), (String) this.e.get());
        return njq;
    }
}
