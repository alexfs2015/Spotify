package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

/* renamed from: opl reason: default package */
public final class opl implements oou<ool> {
    private final opj a;
    private final LicenseLayoutProvider b;

    public opl(opj opj, LicenseLayoutProvider licenseLayoutProvider) {
        this.a = opj;
        this.b = licenseLayoutProvider;
    }

    private LicenseLayout b() {
        return this.b.a();
    }

    public final /* synthetic */ Object a() {
        boolean z = true;
        a b2 = ool.i().a(!this.a.a() && !opj.b(b())).b(b() != LicenseLayout.SHUFFLE_WHEN_FREE);
        boolean a2 = opj.a(b());
        boolean c = this.a.c();
        a d = b2.a(ooi.e().c(c).d(!opj.b(b())).b(a2).a(a2 && (!c || !this.a.d())).a()).c(b() == LicenseLayout.SHUFFLE_WHEN_FREE || b() == LicenseLayout.PREVIEWS_WHEN_FREE).d(false);
        if (!this.a.a() && !opj.b(b())) {
            z = false;
        }
        return d.e(z).f(false).a();
    }
}
