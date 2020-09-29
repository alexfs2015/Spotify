package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: opo reason: default package */
public final class opo implements wig<opn> {
    private final wzi<opj> a;
    private final wzi<LicenseLayoutProvider> b;

    private opo(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static opn a(Object obj, LicenseLayoutProvider licenseLayoutProvider) {
        return new opn((opj) obj, licenseLayoutProvider);
    }

    public static opo a(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        return new opo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new opn((opj) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
