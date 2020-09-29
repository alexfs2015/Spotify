package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: ovs reason: default package */
public final class ovs implements orq, orr, oru, orw, osa {
    private final ovx a;
    private final ovv b;
    private final a c;
    private final b d;
    private final owb e;
    private final vfe f;
    private final a g;

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return true;
    }

    public final String b() {
        return "vanilla";
    }

    public ovs(ovx ovx, ovv ovv, a aVar, b bVar, owb owb, vfe vfe, a aVar2) {
        this.a = ovx;
        this.b = ovv;
        this.c = aVar;
        this.d = bVar;
        this.e = owb;
        this.f = vfe;
        this.g = aVar2;
    }

    public final Type a() {
        return Type.VANILLA;
    }

    public final olm<?> a(fpt fpt) {
        if (this.f.a()) {
            return this.g.a(((ohh) this.a.e.a()).h().f(true).a());
        }
        return this.c.a(((ohg) this.a.d.a()).i().g(true).a());
    }

    public final ova a_(fpt fpt) {
        return this.d.a((ohk) this.a.b.a());
    }

    public final onq<?> b(fpt fpt) {
        owb owb = this.e;
        return owb.b.a(owb.a, (ItemListConfiguration) this.a.c.a());
    }

    public final orm a(LicenseLayout licenseLayout) {
        DecorationPolicy decorationPolicy;
        ovx ovx = this.a;
        a a2 = ovx.a.a().j().a(ovx.a.a().a().b().a(ovx.a.a().b().h()).a());
        a l = ovx.a.a().f().l();
        if (licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE) {
            decorationPolicy = DecorationPolicy.LIMITED_WITHOUT_VIEWPORT;
        } else if (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
            decorationPolicy = DecorationPolicy.LARGE_WITHOUT_VIEWPORT;
        } else {
            decorationPolicy = DecorationPolicy.LARGE_WITH_VIEWPORT;
        }
        return a2.a(l.a(decorationPolicy).a()).a(ovx.a.a().e().d().a(ovx.a()).a()).a(ovx.a.a().d().k().a(ovx.a()).a()).a((gjf) (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM) ? PageIdentifiers.PLAYLIST_ONDEMAND : PageIdentifiers.PLAYLIST).a();
    }

    public final ofc c() {
        return new ovu();
    }
}
