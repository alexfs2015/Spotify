package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: oep reason: default package */
final class oep implements orr, orw {
    private final oen a;
    private final a b;
    private final oer c;

    public final String b() {
        return "editorial";
    }

    public oep(oen oen, a aVar, oer oer) {
        this.a = oen;
        this.b = aVar;
        this.c = oer;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return formatListType == FormatListType.EDITORIAL && fpt.b(oem.a);
    }

    public final orm a(LicenseLayout licenseLayout) {
        oen oen = this.a;
        return oen.a.a().j().a(oen.a.a().d().k().a(oen.a()).a()).a(oen.a.a().e().d().a(oen.a()).a()).a();
    }

    public final onq<?> b(fpt fpt) {
        a aVar = this.b;
        oer oer = this.c;
        oen oen = this.a;
        return aVar.a(oer, ((ItemListConfiguration) oen.b.a()).A().m(fpt.b(oem.a)).a());
    }
}
