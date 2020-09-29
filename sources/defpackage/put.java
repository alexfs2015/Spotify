package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: put reason: default package */
public final class put implements orr, oru, orw {
    private final a a;
    private final a b;
    private final pur c;

    public final String b() {
        return "release radar";
    }

    public put(pur pur, a aVar, a aVar2) {
        this.c = pur;
        this.a = aVar;
        this.b = aVar2;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return formatListType == FormatListType.RELEASE_RADAR;
    }

    public final olm<?> a(fpt fpt) {
        return this.a.a((ohg) this.c.b.a());
    }

    public final orm a(LicenseLayout licenseLayout) {
        Boolean bool;
        pur pur = this.c;
        a j = pur.a.a().j();
        a g = pur.a.a().c().g();
        if (licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        return j.a(g.a(Optional.b(bool)).b(Optional.b(Boolean.FALSE)).a()).a();
    }

    public final onq<?> b(fpt fpt) {
        return this.b.a(((ItemListConfiguration) this.c.c.a()).A().n(true).a());
    }
}
