package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: opw reason: default package */
public final class opw implements orr, oru, orw, osa {
    private final opy a;
    private final b b;
    private final a c;
    private final oqc d;
    private final vfb e;
    private final a f;

    public final String b() {
        return "p2s";
    }

    public opw(opy opy, b bVar, a aVar, oqc oqc, vfb vfb, a aVar2) {
        this.a = opy;
        this.b = bVar;
        this.c = aVar;
        this.d = oqc;
        this.e = vfb;
        this.f = aVar2;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return formatListType == FormatListType.P2S;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final olm<?> a(fpt fpt) {
        if (this.e.a()) {
            return this.f.a(((ohh) this.a.e.a()).h().a());
        }
        return this.c.a(((ohc) this.a.d.a()).g().e(true).a());
    }

    public final ova a_(fpt fpt) {
        return this.b.a(((ohk) this.a.b.a()).o().k(true).n(false).m(false).a());
    }

    public final onq<?> b(fpt fpt) {
        oqc oqc = this.d;
        return oqc.b.a(oqc.a, ((ItemListConfiguration) this.a.c.a()).A().k(true).l(true).m(true).a(Optional.b(Boolean.TRUE)).g(false).a());
    }

    public final orm a(LicenseLayout licenseLayout) {
        opy opy = this.a;
        return opy.a.a().j().a(opy.a.a().b().j().e(false).b(false).h(false).a()).a(opy.a.a().f().l().a(Optional.b(Boolean.FALSE)).a()).a(opy.a.a().e().d().a(true).a(opy.a()).a()).a(opy.a.a().d().k().d(true).e(true).a(opy.a()).a()).a((gjf) (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM) ? PageIdentifiers.PLAYLIST_ONDEMAND : PageIdentifiers.PLAYLIST).a();
    }
}
