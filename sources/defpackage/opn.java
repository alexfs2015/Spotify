package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: opn reason: default package */
public final class opn implements oou<ooo> {
    private final opj a;
    private final LicenseLayoutProvider b;

    public opn(opj opj, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = opj;
        this.b = licenseLayoutProvider;
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

    /* renamed from: b */
    public final ooo a() {
        return ooo.p().a(opj.b(d()) || this.a.a()).b(opj.b(d()) || this.a.a()).c(opj.b(d()) || this.a.a()).d(opj.b(d())).e(c()).f(true).g(!opj.b(d())).h(!opj.b(d())).i(this.a.c(d())).j(true).k(false).l(!opj.b(d())).m(a(d())).n(opj.a(d())).a();
    }
}
