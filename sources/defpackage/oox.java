package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.LongClickAction;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: oox reason: default package */
public final class oox implements oou<ItemListConfiguration> {
    private final ozl a;
    private final hfx b;
    private final lap c;
    private final LicenseLayoutProvider d;
    private final AndroidLibsPlaylistEntityConfigurationProperties e;

    public oox(ozl ozl, hfx hfx, lap lap, LicenseLayoutProvider licenseLayoutProvider, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        this.a = ozl;
        this.b = hfx;
        this.c = lap;
        this.d = licenseLayoutProvider;
        this.e = androidLibsPlaylistEntityConfigurationProperties;
    }

    private a a(a aVar, boolean z) {
        boolean z2 = false;
        if (!z) {
            return aVar.u(false).v(false).t(false).w(false);
        }
        fqn flags = this.a.getFlags();
        boolean d2 = this.b.d(flags);
        boolean b2 = this.b.b(flags);
        boolean z3 = hfx.c(flags) || hfx.e(flags);
        if (d2 || b2) {
            z2 = true;
        }
        return aVar.u(z2).v(d2).t(b2).w(z3);
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
        return !opj.b(g()) ? LongClickAction.SHOW_CONTEXT_MENU : LongClickAction.DO_NOTHING;
    }

    private LicenseLayout g() {
        return this.d.a();
    }

    /* renamed from: b */
    public final ItemListConfiguration a() {
        fqn flags = this.a.getFlags();
        boolean z = false;
        boolean z2 = g() == LicenseLayout.PREVIEWS_WHEN_FREE;
        a p = ItemListConfiguration.A().a(opj.b(g())).b(this.c.a(flags)).c(!opj.b(g())).d(e()).e(!opj.b(g())).f(this.c.a(flags)).g(true).h(c()).i(d()).j(true).k(false).l(false).m(false).a(f()).n(this.c.a(flags)).o(!opj.b(g())).p(suu.a(flags));
        if (g() == LicenseLayout.MIXED_ON_DEMAND_WHEN_FREE) {
            z = true;
        }
        return a(p.q(z).a(Optional.e()).r(true).s(z2), z2).a();
    }
}
