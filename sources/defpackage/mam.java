package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: mam reason: default package */
public final class mam implements orr, oru, orw {
    private final mao a;
    private final a b;
    private final mai c;
    private final mak d;

    public final String b() {
        return "charts";
    }

    public mam(mao mao, mai mai, a aVar, mak mak) {
        this.c = mai;
        this.a = mao;
        this.b = aVar;
        this.d = mak;
    }

    public final orm a(LicenseLayout licenseLayout) {
        mai mai = this.c;
        return mai.a.a().j().a(mai.a.a().f().l().a(Optional.b(Boolean.FALSE)).a()).a(mai.a.a().e().d().a(mai.a()).a()).a(mai.a.a().d().k().a(mai.a()).g(false).f(true).a()).a();
    }

    public final olm<?> a(fpt fpt) {
        return this.b.a((ohg) this.c.b.a(), Optional.b(this.d));
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return formatListType == FormatListType.CHART;
    }

    public final onq<?> b(fpt fpt) {
        mao mao = this.a;
        return mao.b.a(mao.a, (ItemListConfiguration) this.c.c.a());
    }
}
