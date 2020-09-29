package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: qdp reason: default package */
public final class qdp implements oyx, oza, ozc {
    private final a a;
    private final a b;
    private final qdn c;

    public qdp(qdn qdn, a aVar, a aVar2) {
        this.c = qdn;
        this.a = aVar;
        this.b = aVar2;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final osq<?> a(fqn fqn) {
        return this.a.a((ook) this.c.b.a());
    }

    public final oys a(LicenseLayout licenseLayout) {
        qdn qdn = this.c;
        return qdn.a.a().j().a(qdn.a.a().c().g().a(Optional.b(licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE ? Boolean.TRUE : Boolean.FALSE)).b(Optional.b(Boolean.FALSE)).a()).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return formatListType == FormatListType.RELEASE_RADAR;
    }

    public final String b() {
        return "release radar";
    }

    public final ouw<?> b(fqn fqn) {
        return this.b.a(((ItemListConfiguration) this.c.c.a()).z().n(true).a());
    }
}
