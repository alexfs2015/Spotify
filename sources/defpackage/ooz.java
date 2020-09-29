package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: ooz reason: default package */
public final class ooz implements oou<oog> {
    private final opj a;
    private final LicenseLayoutProvider b;

    public ooz(opj opj, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = opj;
        this.b = licenseLayoutProvider;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        boolean z = true;
        a b2 = oog.h().a(b() != LicenseLayout.SHUFFLE_WHEN_FREE).b(b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE);
        boolean z2 = b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE || b() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE;
        boolean c = this.a.c();
        a c2 = b2.a(ooi.e().c(c).d(false).b(z2).a(z2 && (!c || !this.a.d())).a()).c(!this.a.a() && !opj.b(b()));
        if (!this.a.a() && !opj.b(b())) {
            z = false;
        }
        return c2.d(z).e(false).a();
    }
}
