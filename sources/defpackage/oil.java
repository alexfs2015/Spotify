package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: oil reason: default package */
public final class oil implements ohq<ohl> {
    private final osf a;
    private final LicenseLayoutProvider b;
    private final kvb c;
    private final AndroidLibsPlaylistEntityConfigurationProperties d;

    public oil(osf osf, LicenseLayoutProvider licenseLayoutProvider, kvb kvb, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = osf;
        this.b = licenseLayoutProvider;
        this.c = kvb;
        this.d = androidLibsPlaylistEntityConfigurationProperties;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        boolean z = true;
        a g = ohl.l().a(true).b(false).c(this.d.a() || !(b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE)).d(false).e(false).f(false).g(true);
        if (b() != LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) {
            z = false;
        }
        return g.h(z).a(AllSongsConfiguration.a).i(this.c.e(this.a.getFlags())).a();
    }
}
