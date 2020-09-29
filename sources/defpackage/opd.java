package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: opd reason: default package */
public final class opd implements oou<ooj> {
    private final LicenseLayoutProvider a;
    private final AndroidLibsPlaylistEntityConfigurationProperties b;

    public opd(LicenseLayoutProvider licenseLayoutProvider, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = licenseLayoutProvider;
        this.b = androidLibsPlaylistEntityConfigurationProperties;
    }

    private LicenseLayout c() {
        return this.a.a();
    }

    /* renamed from: b */
    public final ooj a() {
        boolean z = true;
        a c = ooj.h().a((c() == LicenseLayout.SHUFFLE_WHEN_FREE || c() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || c() == LicenseLayout.PREVIEWS_WHEN_FREE) ? Optional.b(Boolean.TRUE) : Optional.e()).b(Optional.e()).a((c() == LicenseLayout.SHUFFLE_WHEN_FREE || c() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || c() == LicenseLayout.PREVIEWS_WHEN_FREE) && this.b.b()).b(c() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN).c(false);
        if (!(c() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || c() == LicenseLayout.PREVIEWS_WHEN_FREE)) {
            z = false;
        }
        return c.d(z).a();
    }
}
