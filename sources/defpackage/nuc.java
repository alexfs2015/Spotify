package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.missedconnections.MissedConnectionsABFlag;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: nuc reason: default package */
public final class nuc implements orr, oru, orw {
    private final nua a;
    private final a b;
    private final a c;

    public final String b() {
        return "missed connections";
    }

    public nuc(nua nua, a aVar, a aVar2) {
        this.a = nua;
        this.b = aVar;
        this.c = aVar2;
    }

    public final orm a(LicenseLayout licenseLayout) {
        nua nua = this.a;
        return nua.a.a().j().a(nua.a.a().b().j().g(true).a()).a((gjf) PageIdentifiers.MISSEDCONNECTIONS).a();
    }

    public final olm<?> a(fpt fpt) {
        return this.b.a((ohc) this.a.b.a());
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        MissedConnectionsABFlag missedConnectionsABFlag = (MissedConnectionsABFlag) fpt.a(ntt.a);
        return formatListType == FormatListType.MISSED_CONNECTIONS && (missedConnectionsABFlag == MissedConnectionsABFlag.ENABLED_FULL_TREATMENT || missedConnectionsABFlag == MissedConnectionsABFlag.ENABLED_NO_RECSPLANATIONS);
    }

    public final onq<?> b(fpt fpt) {
        return this.c.a((ItemListConfiguration) this.a.c.a(), ntw.b().a(this.a.d.a() == LicenseLayout.SHUFFLE_WHEN_FREE).a());
    }
}
