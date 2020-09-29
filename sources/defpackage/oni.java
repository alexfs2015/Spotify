package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: oni reason: default package */
public final class oni implements oyx, oza, ozc, ozg {
    private final onk a;
    private final b b;
    private final a c;
    private final onm d;

    public oni(onk onk, b bVar, a aVar, onm onm) {
        this.a = onk;
        this.b = bVar;
        this.c = aVar;
        this.d = onm;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final osq<?> a(fqn fqn) {
        return this.c.a(((oog) this.a.d.a()).g().e(true).a());
    }

    public final oys a(LicenseLayout licenseLayout) {
        onk onk = this.a;
        return onk.a.a().j().a(onk.a.a().b().j().e(false).b(false).h(false).a()).a(onk.a.a().f().l().a(Optional.b(Boolean.FALSE)).a()).a(onk.a.a().e().d().a(true).a(onk.a()).a()).a(onk.a.a().d().k().d(true).e(true).a(onk.a()).a()).a((gkq) (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM) ? PageIdentifiers.PLAYLIST_ONDEMAND : PageIdentifiers.PLAYLIST).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return formatListType == FormatListType.CAR_MIX;
    }

    public final pcl a_(fqn fqn) {
        return this.b.a(((ooo) this.a.b.a()).o().k(true).n(false).m(false).a());
    }

    public final String b() {
        return "car-mix";
    }

    public final ouw<?> b(fqn fqn) {
        onm onm = this.d;
        return onm.b.a(onm.a, ((ItemListConfiguration) this.a.c.a()).z().k(true).l(true).m(true).a(Optional.b(Boolean.TRUE)).g(false).a());
    }
}
