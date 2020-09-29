package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: pay reason: default package */
public final class pay {
    public final oou<ItemListConfiguration> a;
    public final oyt b;
    public final heg c;
    private final hfx d;
    private final LicenseLayoutProvider e;

    public pay(LicenseLayoutProvider licenseLayoutProvider, hfx hfx, oyt oyt, oou<ItemListConfiguration> oou, heg heg) {
        this.d = hfx;
        this.e = licenseLayoutProvider;
        this.b = oyt;
        this.a = oou;
        this.c = heg;
    }

    public static boolean a(LicenseLayout licenseLayout) {
        return b(licenseLayout) && licenseLayout != LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    private static boolean b(LicenseLayout licenseLayout) {
        return licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE;
    }

    public LicenseLayout a() {
        return this.e.a();
    }
}
