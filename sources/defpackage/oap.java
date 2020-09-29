package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.missedconnections.MissedConnectionsABFlag;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: oap reason: default package */
public final class oap implements oyx, oza, ozc {
    private final oan a;
    private final a b;
    private final a c;

    public oap(oan oan, a aVar, a aVar2) {
        this.a = oan;
        this.b = aVar;
        this.c = aVar2;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final osq<?> a(fqn fqn) {
        return this.b.a((oog) this.a.b.a());
    }

    public final oys a(LicenseLayout licenseLayout) {
        oan oan = this.a;
        return oan.a.a().j().a(oan.a.a().b().j().g(true).a()).a((gkq) PageIdentifiers.MISSEDCONNECTIONS).a();
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        MissedConnectionsABFlag missedConnectionsABFlag = (MissedConnectionsABFlag) fqn.a(oag.a);
        return formatListType == FormatListType.MISSED_CONNECTIONS && (missedConnectionsABFlag == MissedConnectionsABFlag.ENABLED_FULL_TREATMENT || missedConnectionsABFlag == MissedConnectionsABFlag.ENABLED_NO_RECSPLANATIONS);
    }

    public final String b() {
        return "missed connections";
    }

    public final ouw<?> b(fqn fqn) {
        return this.c.a((ItemListConfiguration) this.a.c.a(), oaj.b().a(this.a.d.a() == LicenseLayout.SHUFFLE_WHEN_FREE).a());
    }
}
