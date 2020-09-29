package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: mra reason: default package */
public final class mra implements oyx, oza, ozc {
    private final mqy a;
    private final a b;
    private final a c;

    public mra(mqy mqy, a aVar, a aVar2) {
        this.a = mqy;
        this.b = aVar;
        this.c = aVar2;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final osq<?> a(fqn fqn) {
        return this.b.a((ook) this.a.b.a());
    }

    public final oys a(LicenseLayout licenseLayout) {
        mqy mqy = this.a;
        return mqy.a.a().j().a(mqy.a.a().c().g().a(Optional.b(licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE ? Boolean.TRUE : Boolean.FALSE)).b(Optional.b(Boolean.FALSE)).a()).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return formatListType == FormatListType.DISCOVER_WEEKLY;
    }

    public final String b() {
        return "discover weekly";
    }

    public final ouw<?> b(fqn fqn) {
        return this.c.a(((ItemListConfiguration) this.a.c.a()).z().n(true).a());
    }
}
