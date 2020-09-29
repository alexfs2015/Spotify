package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: ooq reason: default package */
public final class ooq implements oou<AllSongsConfiguration> {
    private final opj a;
    private final LicenseLayoutProvider b;

    public ooq(opj opj, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = opj;
        this.b = licenseLayoutProvider;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        return AllSongsConfiguration.g().a(b() != LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE && this.a.b()).a(Optional.e()).b(false).c(false).b(b() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN ? Optional.b(Integer.valueOf(50)) : Optional.e()).a();
    }
}
