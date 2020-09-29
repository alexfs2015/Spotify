package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: opq reason: default package */
public final class opq implements wig<opp> {
    private final wzi<ozl> a;
    private final wzi<LicenseLayoutProvider> b;
    private final wzi<kyk> c;
    private final wzi<AndroidLibsPlaylistEntityConfigurationProperties> d;

    private opq(wzi<ozl> wzi, wzi<LicenseLayoutProvider> wzi2, wzi<kyk> wzi3, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static opq a(wzi<ozl> wzi, wzi<LicenseLayoutProvider> wzi2, wzi<kyk> wzi3, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi4) {
        return new opq(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new opp((ozl) this.a.get(), (LicenseLayoutProvider) this.b.get(), (kyk) this.c.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.d.get());
    }
}
