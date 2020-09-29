package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a;

/* renamed from: oib reason: default package */
public final class oib implements ohq<PlaylistDataSourceConfiguration> {
    private final oif a;
    private final hdb b;
    private final LicenseLayoutProvider c;

    public oib(oif oif, hdb hdb, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = oif;
        this.b = hdb;
        this.c = licenseLayoutProvider;
    }

    /* renamed from: b */
    public final PlaylistDataSourceConfiguration a() {
        Optional optional;
        Optional optional2;
        Optional optional3;
        boolean z = false;
        a c2 = PlaylistDataSourceConfiguration.m().a(this.b.a.a()).b(e() == LicenseLayout.SHUFFLE_WHEN_FREE || e() == LicenseLayout.PREVIEWS_WHEN_FREE).c(this.a.b());
        if (e() == LicenseLayout.SHUFFLE_WHEN_FREE || e() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) {
            optional = Optional.b(Boolean.FALSE);
        } else {
            optional = Optional.e();
        }
        a a2 = c2.a(optional);
        if (oif.b(e())) {
            optional2 = Optional.b(Boolean.FALSE);
        } else {
            optional2 = Optional.e();
        }
        a b2 = a2.b(optional2);
        if (e() == LicenseLayout.SHUFFLE_WHEN_FREE || e() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) {
            optional3 = Optional.b(Boolean.FALSE);
        } else {
            optional3 = Optional.e();
        }
        a d = b2.c(optional3).d(c());
        if (e() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
            z = true;
        }
        return d.d(z).e(oif.b(e())).f(d()).a(DecorationPolicy.LARGE_WITHOUT_VIEWPORT).a();
    }

    private Optional<Integer> c() {
        if (e() == LicenseLayout.SHUFFLE_WHEN_FREE) {
            return Optional.b(Integer.valueOf(500));
        }
        if (e() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
            return Optional.b(Integer.valueOf(50));
        }
        return Optional.e();
    }

    private boolean d() {
        return e() == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || e() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || e() == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || e() == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    private LicenseLayout e() {
        return this.c.a();
    }
}
