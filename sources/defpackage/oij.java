package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: oij reason: default package */
public final class oij implements ohq<ohk> {
    private final oif a;
    private final LicenseLayoutProvider b;

    public oij(oif oif, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = oif;
        this.b = licenseLayoutProvider;
    }

    /* renamed from: b */
    public final ohk a() {
        return ohk.p().a(oif.b(d()) || this.a.a()).b(oif.b(d()) || this.a.a()).c(oif.b(d()) || this.a.a()).d(oif.b(d())).e(c()).f(true).g(!oif.b(d())).h(!oif.b(d())).i(this.a.c(d())).j(true).k(false).l(!oif.b(d())).m(a(d())).n(e()).a();
    }

    private static boolean a(LicenseLayout licenseLayout) {
        return licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    private boolean c() {
        LicenseLayout d = d();
        return d == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || d == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || d == LicenseLayout.ON_DEMAND_WHEN_PREMIUM;
    }

    private LicenseLayout d() {
        return this.b.a();
    }

    private boolean e() {
        boolean z = d() == LicenseLayout.SHUFFLE_WHEN_FREE || d() == LicenseLayout.PREVIEWS_WHEN_FREE || d() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || d() == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || d() == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || this.a.e();
        if (oif.a(d()) || !this.a.f()) {
            return z;
        }
        return false;
    }
}
