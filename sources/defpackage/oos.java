package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: oos reason: default package */
public final class oos implements oou<ood> {
    private final opj a;
    private final LicenseLayoutProvider b;

    public oos(opj opj, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = opj;
        this.b = licenseLayoutProvider;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        boolean z = false;
        a c = ood.k().a(b() == LicenseLayout.SHUFFLE_WHEN_FREE).b(!opj.b(b()) || b() == LicenseLayout.PREVIEWS_WHEN_FREE).d(this.a.c(b())).c(!this.a.c(b()) && (b() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE || b() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || b() == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS));
        LicenseLayout b2 = b();
        a f = c.e(b2 == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || b2 == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || b2 == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || b2 == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT).f(b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE);
        if (b() != LicenseLayout.SHUFFLE_WHEN_FREE) {
            z = true;
        }
        return f.g(z).i(opj.b(b())).h(!opj.b(b())).a();
    }
}
