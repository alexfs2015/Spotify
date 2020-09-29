package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.LongClickAction;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.Wiggle;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: oht reason: default package */
public final class oht implements ohq<ItemListConfiguration> {
    private final osf a;
    private final hdb b;
    private final kxg c;
    private final LicenseLayoutProvider d;
    private final AndroidLibsPlaylistEntityConfigurationProperties e;

    public oht(osf osf, hdb hdb, kxg kxg, LicenseLayoutProvider licenseLayoutProvider, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = osf;
        this.b = hdb;
        this.c = kxg;
        this.d = licenseLayoutProvider;
        this.e = androidLibsPlaylistEntityConfigurationProperties;
    }

    /* renamed from: b */
    public final ItemListConfiguration a() {
        fpt flags = this.a.getFlags();
        boolean z = false;
        boolean z2 = g() == LicenseLayout.PREVIEWS_WHEN_FREE;
        a p = ItemListConfiguration.B().a(oif.b(g())).b(this.c.a(flags)).c(!oif.b(g())).d(e()).e(!oif.b(g())).f(this.c.a(flags)).g(true).h(c()).i(d()).j(true).k(false).l(false).m(false).a(f()).n(this.c.a(flags)).o(!oif.b(g())).p(skn.a(flags));
        if (g() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) {
            z = true;
        }
        return a(p.q(z).a(Optional.e()).r(true).s(z2), z2).a();
    }

    private boolean c() {
        return g() == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || g() == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || g() == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || g() == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    private boolean d() {
        return this.e.a() || g() != LicenseLayout.SHUFFLE_WHEN_FREE;
    }

    private boolean e() {
        LicenseLayout g = g();
        return g == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || g == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || g == LicenseLayout.ON_DEMAND_WHEN_PREMIUM;
    }

    private LongClickAction f() {
        if (!oif.b(g())) {
            return LongClickAction.SHOW_CONTEXT_MENU;
        }
        return LongClickAction.DO_NOTHING;
    }

    private a a(a aVar, boolean z) {
        boolean z2 = false;
        if (!z) {
            return aVar.a(Wiggle.NEVER).u(false).v(false).t(false).w(false);
        }
        fpt flags = this.a.getFlags();
        boolean h = this.b.h(flags);
        boolean f = this.b.f(flags);
        boolean z3 = hdb.g(flags) || hdb.i(flags);
        a a2 = aVar.a(Wiggle.NEVER);
        if (h || f) {
            z2 = true;
        }
        return a2.u(z2).v(h).t(f).w(z3);
    }

    private LicenseLayout g() {
        return this.d.a();
    }
}
