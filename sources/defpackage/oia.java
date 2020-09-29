package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: oia reason: default package */
public final class oia implements vua<ohz> {
    private final wlc<LicenseLayoutProvider> a;
    private final wlc<AndroidLibsPlaylistEntityConfigurationProperties> b;

    private oia(wlc<LicenseLayoutProvider> wlc, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oia a(wlc<LicenseLayoutProvider> wlc, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc2) {
        return new oia(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ohz((LicenseLayoutProvider) this.a.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.b.get());
    }
}
