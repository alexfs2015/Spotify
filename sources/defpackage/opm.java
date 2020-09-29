package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: opm reason: default package */
public final class opm implements wig<opl> {
    private final wzi<opj> a;
    private final wzi<LicenseLayoutProvider> b;

    private opm(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static opm a(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        return new opm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new opl((opj) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
