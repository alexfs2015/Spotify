package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.util.Assertion;
import java.util.Collections;

/* renamed from: qer reason: default package */
public final class qer implements gxk {
    private final hbl b;
    private final sin c;
    private final sqb d;
    private final squ e;
    private final Player f;
    private final has g;
    private final skq h;

    public qer(sin sin, sqb sqb, squ squ, hbl hbl, Player player, has has, skq skq) {
        this.b = hbl;
        this.c = sin;
        this.d = sqb;
        this.e = squ;
        this.f = player;
        this.g = has;
        this.h = skq;
    }

    public static hci a(String str) {
        fbp.a(str);
        return hct.builder().a("playAndSaveToHistoryAndNavigate").a("uri", str).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.e.a();
        String string = hci.data().string("uri");
        String string2 = gwy.b.metadata().string("album_uri");
        if (string == null) {
            Assertion.b("empty trackUri");
        }
        Player player = this.f;
        qlk.a(string2);
        StringBuilder sb = new StringBuilder("context://");
        sb.append(string2);
        PlayerContext playerContext = (PlayerContext) fbp.a(PlayerContext.createFromContextUrl(string2, sb.toString()));
        qlk.a(string);
        Builder suppressions = new Builder().suppressions(new PlayerSuppressions(Collections.singleton(PlayerProviders.MFT)));
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, string, 0);
        player.play(playerContext, suppressions.skipTo(playOptionsSkipTo).build());
        this.h.a(string2);
        this.g.logInteraction(string2, gwy.b, "navigate-forward", null);
        this.g.logInteraction(string, gwy.b, "play", null);
        hcm hcm = gwy.b;
        if (!six.a(hcm) && !this.b.a(gwy)) {
            this.c.a(this.d.a(string, hcm));
        }
    }
}
