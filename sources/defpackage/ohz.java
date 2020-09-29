package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: ohz reason: default package */
public final class ohz implements ohq<ohf> {
    private final LicenseLayoutProvider a;
    private final AndroidLibsPlaylistEntityConfigurationProperties b;

    public ohz(LicenseLayoutProvider licenseLayoutProvider, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = licenseLayoutProvider;
        this.b = androidLibsPlaylistEntityConfigurationProperties;
    }

    /* renamed from: b */
    public final ohf a() {
        Optional optional;
        a h = ohf.h();
        if (c() == LicenseLayout.SHUFFLE_WHEN_FREE || c() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || c() == LicenseLayout.PREVIEWS_WHEN_FREE) {
            optional = Optional.b(Boolean.TRUE);
        } else {
            optional = Optional.e();
        }
        boolean z = true;
        a c = h.a(optional).b(Optional.e()).a((c() == LicenseLayout.SHUFFLE_WHEN_FREE || c() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || c() == LicenseLayout.PREVIEWS_WHEN_FREE) && this.b.b()).b(c() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN).c(false);
        if (!(c() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || c() == LicenseLayout.PREVIEWS_WHEN_FREE)) {
            z = false;
        }
        return c.d(z).a();
    }

    private LicenseLayout c() {
        return this.a.a();
    }
}
