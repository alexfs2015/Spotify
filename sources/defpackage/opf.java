package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a;

/* renamed from: opf reason: default package */
public final class opf implements oou<PlaylistDataSourceConfiguration> {
    private final opj a;
    private final hfx b;
    private final LicenseLayoutProvider c;

    public opf(opj opj, hfx hfx, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = opj;
        this.b = hfx;
        this.c = licenseLayoutProvider;
    }

    private Optional<Integer> c() {
        return e() == LicenseLayout.SHUFFLE_WHEN_FREE ? Optional.b(Integer.valueOf(500)) : e() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN ? Optional.b(Integer.valueOf(50)) : Optional.e();
    }

    private boolean d() {
        return e() == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || e() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || e() == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || e() == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    private LicenseLayout e() {
        return this.c.a();
    }

    /* renamed from: b */
    public final PlaylistDataSourceConfiguration a() {
        boolean z = false;
        a d = PlaylistDataSourceConfiguration.m().a(this.b.a.a()).b(e() == LicenseLayout.SHUFFLE_WHEN_FREE || e() == LicenseLayout.PREVIEWS_WHEN_FREE).c(this.a.b()).a((e() == LicenseLayout.SHUFFLE_WHEN_FREE || e() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) ? Optional.b(Boolean.FALSE) : Optional.e()).b(opj.b(e()) ? Optional.b(Boolean.FALSE) : Optional.e()).c((e() == LicenseLayout.SHUFFLE_WHEN_FREE || e() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) ? Optional.b(Boolean.FALSE) : Optional.e()).d(c());
        if (e() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
            z = true;
        }
        return d.d(z).e(opj.b(e())).f(d()).a(DecorationPolicy.LARGE_WITHOUT_VIEWPORT).a();
    }
}
