package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: mep reason: default package */
public final class mep implements oyx, oza, ozc {
    private final mer a;
    private final a b;
    private final mel c;
    private final men d;

    public mep(mer mer, mel mel, a aVar, men men) {
        this.c = mel;
        this.a = mer;
        this.b = aVar;
        this.d = men;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final osq<?> a(fqn fqn) {
        return this.b.a((ook) this.c.b.a(), Optional.b(this.d));
    }

    public final oys a(LicenseLayout licenseLayout) {
        mel mel = this.c;
        return mel.a.a().j().a(mel.a.a().f().l().a(Optional.b(Boolean.FALSE)).a()).a(mel.a.a().e().d().a(mel.a()).a()).a(mel.a.a().d().k().a(mel.a()).g(false).f(true).a()).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return formatListType == FormatListType.CHART;
    }

    public final String b() {
        return "charts";
    }

    public final ouw<?> b(fqn fqn) {
        mer mer = this.a;
        return mer.b.a(mer.a, (ItemListConfiguration) this.c.c.a());
    }
}
