package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: otn reason: default package */
public final class otn {
    public final ohq<ItemListConfiguration> a;
    public final orn b;
    private final hdb c;
    private final LicenseLayoutProvider d;

    public otn(LicenseLayoutProvider licenseLayoutProvider, hdb hdb, orn orn, ohq<ItemListConfiguration> ohq) {
        this.c = hdb;
        this.d = licenseLayoutProvider;
        this.b = orn;
        this.a = ohq;
    }

    public LicenseLayout a() {
        return this.d.a();
    }

    private static boolean b(LicenseLayout licenseLayout) {
        return licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE;
    }

    public static boolean a(LicenseLayout licenseLayout) {
        return b(licenseLayout) && licenseLayout != LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }
}
