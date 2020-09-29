package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: oif reason: default package */
final class oif {
    private final osf a;
    private final hdb b;
    private final AndroidLibsPlaylistEntityConfigurationProperties c;

    public oif(osf osf, hdb hdb, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = osf;
        this.b = hdb;
        this.c = androidLibsPlaylistEntityConfigurationProperties;
    }

    public static boolean a(LicenseLayout licenseLayout) {
        return licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE;
    }

    public static boolean b(LicenseLayout licenseLayout) {
        return a(licenseLayout) && licenseLayout != LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    public final boolean a() {
        return hdb.a(this.a.getFlags());
    }

    public final boolean c(LicenseLayout licenseLayout) {
        if (!b(licenseLayout)) {
            return true;
        }
        if (!((licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) ? false : true) || !((Boolean) this.a.getFlags().a(guf.d)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.c.c()) {
            return ((Boolean) this.a.getFlags().a(ind.c)).booleanValue();
        }
        return true;
    }

    public final boolean c() {
        return hdb.c(this.a.getFlags()) || hdb.b(this.a.getFlags());
    }

    public final boolean d() {
        return hdb.b(this.a.getFlags());
    }

    public final boolean e() {
        return hdb.d(this.a.getFlags());
    }

    public final boolean f() {
        return hdb.e(this.a.getFlags());
    }
}
