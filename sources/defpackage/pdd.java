package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: pdd reason: default package */
public final class pdd implements oyw, oyx, oza, ozc, ozg {
    private final pdi a;
    private final pdg b;
    private final a c;
    private final b d;
    private final pdm e;
    private final vse f;
    private final a g;

    public pdd(pdi pdi, pdg pdg, a aVar, b bVar, pdm pdm, vse vse, a aVar2) {
        this.a = pdi;
        this.b = pdg;
        this.c = aVar;
        this.d = bVar;
        this.e = pdm;
        this.f = vse;
        this.g = aVar2;
    }

    public final Type a() {
        return Type.VANILLA;
    }

    public final osq<?> a(fqn fqn) {
        return this.f.a() ? this.g.a(((ool) this.a.e.a()).h().f(true).a()) : this.c.a(((ook) this.a.d.a()).i().g(true).a());
    }

    public final oys a(LicenseLayout licenseLayout) {
        pdi pdi = this.a;
        a a2 = pdi.a.a().j().a(pdi.a.a().a().b().a(pdi.a.a().b().h()).a());
        a l = pdi.a.a().f().l();
        DecorationPolicy decorationPolicy = licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE ? DecorationPolicy.LIMITED_WITHOUT_VIEWPORT : licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN ? DecorationPolicy.LARGE_WITHOUT_VIEWPORT : DecorationPolicy.LARGE_WITH_VIEWPORT;
        return a2.a(l.a(decorationPolicy).a()).a(pdi.a.a().e().d().a(pdi.a()).a()).a(pdi.a.a().d().k().a(pdi.a()).a()).a((gkq) (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM) ? PageIdentifiers.PLAYLIST_ONDEMAND : PageIdentifiers.PLAYLIST).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return true;
    }

    public final pcl a_(fqn fqn) {
        return this.d.a((ooo) this.a.b.a());
    }

    public final String b() {
        return "vanilla";
    }

    public final ouw<?> b(fqn fqn) {
        pdm pdm = this.e;
        return pdm.b.a(pdm.a, (ItemListConfiguration) this.a.c.a());
    }

    public final omg c() {
        return new pdf();
    }
}
