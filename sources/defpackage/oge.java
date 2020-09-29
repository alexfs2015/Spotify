package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: oge reason: default package */
public final class oge implements orr, oru, orw, osa {
    private final ogg a;
    private final b b;
    private final a c;
    private final ogi d;

    public final String b() {
        return "car-mix";
    }

    public oge(ogg ogg, b bVar, a aVar, ogi ogi) {
        this.a = ogg;
        this.b = bVar;
        this.c = aVar;
        this.d = ogi;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return formatListType == FormatListType.CAR_MIX;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final olm<?> a(fpt fpt) {
        return this.c.a(((ohc) this.a.d.a()).g().e(true).a());
    }

    public final ova a_(fpt fpt) {
        return this.b.a(((ohk) this.a.b.a()).o().k(true).n(false).m(false).a());
    }

    public final onq<?> b(fpt fpt) {
        ogi ogi = this.d;
        return ogi.b.a(ogi.a, ((ItemListConfiguration) this.a.c.a()).A().k(true).l(true).m(true).a(Optional.b(Boolean.TRUE)).g(false).a());
    }

    public final orm a(LicenseLayout licenseLayout) {
        ogg ogg = this.a;
        return ogg.a.a().j().a(ogg.a.a().b().j().e(false).b(false).h(false).a()).a(ogg.a.a().f().l().a(Optional.b(Boolean.FALSE)).a()).a(ogg.a.a().e().d().a(true).a(ogg.a()).a()).a(ogg.a.a().d().k().d(true).e(true).a(ogg.a()).a()).a((gjf) (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM) ? PageIdentifiers.PLAYLIST_ONDEMAND : PageIdentifiers.PLAYLIST).a();
    }
}
