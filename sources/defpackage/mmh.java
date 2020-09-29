package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: mmh reason: default package */
public final class mmh implements orr, oru, orw {
    private final mmf a;
    private final a b;
    private final a c;

    public final String b() {
        return "discover weekly";
    }

    public mmh(mmf mmf, a aVar, a aVar2) {
        this.a = mmf;
        this.b = aVar;
        this.c = aVar2;
    }

    public final orm a(LicenseLayout licenseLayout) {
        Boolean bool;
        mmf mmf = this.a;
        a j = mmf.a.a().j();
        a g = mmf.a.a().c().g();
        if (licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        return j.a(g.a(Optional.b(bool)).b(Optional.b(Boolean.FALSE)).a()).a();
    }

    public final olm<?> a(fpt fpt) {
        return this.b.a((ohg) this.a.b.a());
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return formatListType == FormatListType.DISCOVER_WEEKLY;
    }

    public final onq<?> b(fpt fpt) {
        return this.c.a(((ItemListConfiguration) this.a.c.a()).A().n(true).a());
    }
}
