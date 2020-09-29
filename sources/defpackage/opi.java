package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: opi reason: default package */
public final class opi implements wig<oph> {
    private final wzi<opj> a;
    private final wzi<LicenseLayoutProvider> b;

    private opi(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static opi a(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        return new opi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new oph((opj) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
