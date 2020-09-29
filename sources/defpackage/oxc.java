package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: oxc reason: default package */
public final class oxc implements oyx, oza, ozc, ozg {
    private final oxe a;
    private final b b;
    private final a c;
    private final oxi d;
    private final vsb e;
    private final a f;

    public oxc(oxe oxe, b bVar, a aVar, oxi oxi, vsb vsb, a aVar2) {
        this.a = oxe;
        this.b = bVar;
        this.c = aVar;
        this.d = oxi;
        this.e = vsb;
        this.f = aVar2;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final osq<?> a(fqn fqn) {
        return this.e.a() ? this.f.a(((ool) this.a.e.a()).h().a()) : this.c.a(((oog) this.a.d.a()).g().e(true).a());
    }

    public final oys a(LicenseLayout licenseLayout) {
        oxe oxe = this.a;
        return oxe.a.a().j().a(oxe.a.a().b().j().e(false).b(false).h(false).a()).a(oxe.a.a().f().l().a(Optional.b(Boolean.FALSE)).a()).a(oxe.a.a().e().d().a(true).a(oxe.a()).a()).a(oxe.a.a().d().k().d(true).e(true).a(oxe.a()).a()).a((gkq) (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM) ? PageIdentifiers.PLAYLIST_ONDEMAND : PageIdentifiers.PLAYLIST).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return formatListType == FormatListType.P2S;
    }

    public final pcl a_(fqn fqn) {
        return this.b.a(((ooo) this.a.b.a()).o().k(true).n(false).m(false).a());
    }

    public final String b() {
        return "p2s";
    }

    public final ouw<?> b(fqn fqn) {
        oxi oxi = this.d;
        return oxi.b.a(oxi.a, ((ItemListConfiguration) this.a.c.a()).z().k(true).l(true).m(true).a(Optional.b(Boolean.TRUE)).g(false).a());
    }
}
