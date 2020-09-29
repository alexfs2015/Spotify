package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: opg reason: default package */
public final class opg implements wig<opf> {
    private final wzi<opj> a;
    private final wzi<hfx> b;
    private final wzi<LicenseLayoutProvider> c;

    private opg(wzi<opj> wzi, wzi<hfx> wzi2, wzi<LicenseLayoutProvider> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static opf a(Object obj, hfx hfx, LicenseLayoutProvider licenseLayoutProvider) {
        return new opf((opj) obj, hfx, licenseLayoutProvider);
    }

    public static opg a(wzi<opj> wzi, wzi<hfx> wzi2, wzi<LicenseLayoutProvider> wzi3) {
        return new opg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new opf((opj) this.a.get(), (hfx) this.b.get(), (LicenseLayoutProvider) this.c.get());
    }
}
