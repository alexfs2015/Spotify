package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: olv reason: default package */
final class olv implements oyx, ozc {
    private final olt a;
    private final a b;
    private final olx c;

    public olv(olt olt, a aVar, olx olx) {
        this.a = olt;
        this.b = aVar;
        this.c = olx;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final oys a(LicenseLayout licenseLayout) {
        olt olt = this.a;
        return olt.a.a().j().a(olt.a.a().d().k().a(olt.a()).a()).a(olt.a.a().e().d().a(olt.a()).a()).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return formatListType == FormatListType.EDITORIAL && fqn.b(ols.a);
    }

    public final String b() {
        return "editorial";
    }

    public final ouw<?> b(fqn fqn) {
        a aVar = this.b;
        olx olx = this.c;
        olt olt = this.a;
        return aVar.a(olx, ((ItemListConfiguration) olt.b.a()).z().m(fqn.b(ols.a)).a());
    }
}
