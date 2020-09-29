package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: oim reason: default package */
public final class oim implements vua<oil> {
    private final wlc<osf> a;
    private final wlc<LicenseLayoutProvider> b;
    private final wlc<kvb> c;
    private final wlc<AndroidLibsPlaylistEntityConfigurationProperties> d;

    private oim(wlc<osf> wlc, wlc<LicenseLayoutProvider> wlc2, wlc<kvb> wlc3, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static oim a(wlc<osf> wlc, wlc<LicenseLayoutProvider> wlc2, wlc<kvb> wlc3, wlc<AndroidLibsPlaylistEntityConfigurationProperties> wlc4) {
        return new oim(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new oil((osf) this.a.get(), (LicenseLayoutProvider) this.b.get(), (kvb) this.c.get(), (AndroidLibsPlaylistEntityConfigurationProperties) this.d.get());
    }
}
