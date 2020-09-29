package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: opj reason: default package */
final class opj {
    private final ozl a;
    private final hfx b;
    private final AndroidLibsPlaylistEntityConfigurationProperties c;

    public opj(ozl ozl, hfx hfx, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = ozl;
        this.b = hfx;
        this.c = androidLibsPlaylistEntityConfigurationProperties;
    }

    static boolean a(LicenseLayout licenseLayout) {
        return licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE || licenseLayout == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    public static boolean b(LicenseLayout licenseLayout) {
        return d(licenseLayout) && licenseLayout != LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    private static boolean d(LicenseLayout licenseLayout) {
        return licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE;
    }

    public final boolean a() {
        return hfx.a(this.a.getFlags());
    }

    public final boolean b() {
        if (this.c.c()) {
            return ((Boolean) this.a.getFlags().a(ipq.c)).booleanValue();
        }
        return true;
    }

    public final boolean c() {
        return new heg(this.a.getFlags()).a();
    }

    public final boolean c(LicenseLayout licenseLayout) {
        if (!b(licenseLayout)) {
            return true;
        }
        return (licenseLayout != LicenseLayout.SHUFFLE_WHEN_FREE && licenseLayout != LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) && ((Boolean) this.a.getFlags().a(gwf.d)).booleanValue();
    }

    public final boolean d() {
        return new heg(this.a.getFlags()).b();
    }
}
