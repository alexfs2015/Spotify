package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: oih reason: default package */
public final class oih implements ohq<ohh> {
    private final oif a;
    private final LicenseLayoutProvider b;

    public oih(oif oif, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = oif;
        this.b = licenseLayoutProvider;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        boolean z = true;
        a b2 = ohh.i().a(!this.a.a() && !oif.b(b())).b(b() != LicenseLayout.SHUFFLE_WHEN_FREE);
        boolean z2 = b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE || b() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || b() == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || b() == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || this.a.e();
        if (!oif.a(b()) && this.a.f()) {
            z2 = false;
        }
        a d = b2.a(ohe.e().c(this.a.c()).d(!oif.b(b())).b(z2).a(this.a.d() ? false : z2).a()).c(b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE).d(false);
        if (!this.a.a() && !oif.b(b())) {
            z = false;
        }
        return d.e(z).f(false).a();
    }
}
