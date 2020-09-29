package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration.a;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: ohm reason: default package */
public final class ohm implements ohq<AllSongsConfiguration> {
    private final oif a;
    private final LicenseLayoutProvider b;

    public ohm(oif oif, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = oif;
        this.b = licenseLayoutProvider;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        Optional optional;
        a c = AllSongsConfiguration.g().a(b() != LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE && this.a.b()).a(Optional.e()).b(false).c(false);
        if (b() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
            optional = Optional.b(Integer.valueOf(50));
        } else {
            optional = Optional.e();
        }
        return c.b(optional).a();
    }
}
