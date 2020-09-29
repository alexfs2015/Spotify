package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.DecorationPolicy;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration.a;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: oti reason: default package */
public final class oti implements orr, oru, orw {
    private final otn a;
    private final a b;
    private final a c;
    private final oug d;
    private final rsl e;
    private final String f;
    private final boolean g;

    public final String b() {
        return "playlist story";
    }

    public oti(otn otn, a aVar, a aVar2, oug oug, rsl rsl, String str, boolean z) {
        this.a = otn;
        this.b = aVar;
        this.c = aVar2;
        this.d = oug;
        this.e = rsl;
        this.f = str;
        this.g = z;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return this.g && ((Boolean) fpt.a(rsk.a)).booleanValue() && this.e.a(this.f);
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final olm<?> a(fpt fpt) {
        a aVar = this.b;
        otn otn = this.a;
        boolean z = true;
        a c2 = otr.e().a(otn.a() != LicenseLayout.SHUFFLE_WHEN_FREE).b(otn.a() == LicenseLayout.SHUFFLE_WHEN_FREE).c(!hdb.a(fpt) && !otn.a(otn.a()));
        if (!hdb.a(fpt) && !otn.a(otn.a())) {
            z = false;
        }
        return aVar.a(c2.d(z).a(), fpt);
    }

    public final onq<?> b(fpt fpt) {
        return this.c.a(this.d, ((ItemListConfiguration) this.a.a.a()).A().a(false).a());
    }

    public final orm a(LicenseLayout licenseLayout) {
        DecorationPolicy decorationPolicy;
        otn otn = this.a;
        a j = otn.b.a().j();
        a l = otn.b.a().f().l();
        if (licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE) {
            decorationPolicy = DecorationPolicy.LIMITED_WITHOUT_VIEWPORT;
        } else if (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
            decorationPolicy = DecorationPolicy.LARGE_WITHOUT_VIEWPORT;
        } else {
            decorationPolicy = DecorationPolicy.LARGE_WITH_VIEWPORT;
        }
        return j.a(l.a(decorationPolicy).a()).a();
    }
}
