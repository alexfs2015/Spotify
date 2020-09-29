package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: ope reason: default package */
public final class ope implements wig<opd> {
    private final wzi<LicenseLayoutProvider> a;
    private final wzi<AndroidLibsPlaylistEntityConfigurationProperties> b;

    private ope(wzi<LicenseLayoutProvider> wzi, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ope a(wzi<LicenseLayoutProvider> wzi, wzi<AndroidLibsPlaylistEntityConfigurationProperties> wzi2) {
        return new ope(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new opd((LicenseLayoutProvider) this.a.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.b.get());
    }
}
