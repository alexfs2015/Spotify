package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: pap reason: default package */
public final class pap implements oyx, oza, ozc {
    private final pay a;
    private final a b;
    private final a c;
    private final pbr d;
    private final sbs e;
    private final String f;
    private final boolean g;

    public pap(pay pay, a aVar, a aVar2, pbr pbr, sbs sbs, String str, boolean z) {
        this.a = pay;
        this.b = aVar;
        this.c = aVar2;
        this.d = pbr;
        this.e = sbs;
        this.f = str;
        this.g = z;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final osq<?> a(fqn fqn) {
        a aVar = this.b;
        pay pay = this.a;
        boolean z = true;
        a c2 = pbc.g().a(pay.a() != LicenseLayout.SHUFFLE_WHEN_FREE).b(pay.a() == LicenseLayout.SHUFFLE_WHEN_FREE).c(!hfx.a(fqn) && !pay.a(pay.a()));
        if (!hfx.a(fqn) && !pay.a(pay.a())) {
            z = false;
        }
        return aVar.a(c2.d(z).e(pay.c.a()).f(pay.c.b()).a(), fqn);
    }

    public final oys a(LicenseLayout licenseLayout) {
        pay pay = this.a;
        a j = pay.b.a().j();
        a l = pay.b.a().f().l();
        DecorationPolicy decorationPolicy = licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE ? DecorationPolicy.LIMITED_WITHOUT_VIEWPORT : licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN ? DecorationPolicy.LARGE_WITHOUT_VIEWPORT : DecorationPolicy.LARGE_WITH_VIEWPORT;
        return j.a(l.a(decorationPolicy).a()).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return this.g && ((Boolean) fqn.a(sbr.a)).booleanValue() && this.e.a(this.f);
    }

    public final String b() {
        return "playlist story";
    }

    public final ouw<?> b(fqn fqn) {
        return this.c.a(this.d, ((ItemListConfiguration) this.a.a.a()).z().a(false).a());
    }
}
