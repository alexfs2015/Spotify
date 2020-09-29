package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: oor reason: default package */
public final class oor implements wig<ooq> {
    private final wzi<opj> a;
    private final wzi<LicenseLayoutProvider> b;

    private oor(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oor a(wzi<opj> wzi, wzi<LicenseLayoutProvider> wzi2) {
        return new oor(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ooq((opj) this.a.get(), (LicenseLayoutProvider) this.b.get());
    }
}
