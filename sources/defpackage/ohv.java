package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: ohv reason: default package */
public final class ohv implements ohq<ohc> {
    private final oif a;
    private final LicenseLayoutProvider b;

    public ohv(oif oif, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = oif;
        this.b = licenseLayoutProvider;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        boolean z = true;
        a b2 = ohc.h().a(b() != LicenseLayout.SHUFFLE_WHEN_FREE).b(b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE);
        boolean z2 = b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE || b() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE || this.a.e();
        a c = b2.a(ohe.e().c(this.a.c()).d(false).b(z2).a(this.a.d() ? false : z2).a()).c(!this.a.a() && !oif.b(b()));
        if (!this.a.a() && !oif.b(b())) {
            z = false;
        }
        return c.d(z).e(false).a();
    }
}
