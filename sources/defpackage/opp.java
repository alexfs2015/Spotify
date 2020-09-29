package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: opp reason: default package */
public final class opp implements oou<oop> {
    private final ozl a;
    private final LicenseLayoutProvider b;
    private final kyk c;
    private final AndroidLibsPlaylistEntityConfigurationProperties d;

    public opp(ozl ozl, LicenseLayoutProvider licenseLayoutProvider, kyk kyk, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = ozl;
        this.b = licenseLayoutProvider;
        this.c = kyk;
        this.d = androidLibsPlaylistEntityConfigurationProperties;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        boolean z = true;
        a g = oop.l().a(true).b(false).c(this.d.a() || !(b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE)).d(false).e(false).f(false).g(true);
        if (b() != LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) {
            z = false;
        }
        return g.h(z).a(AllSongsConfiguration.a).i(this.c.e(this.a.getFlags())).a();
    }
}
