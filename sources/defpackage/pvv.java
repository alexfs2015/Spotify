package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.util.Assertion;
import java.util.Collections;

/* renamed from: pvv reason: default package */
public final class pvv implements gvk {
    private final gys b;
    private final ryz c;
    private final sfu d;
    private final sgn e;
    private final Player f;
    private final gxz g;
    private final saj h;

    public pvv(ryz ryz, sfu sfu, sgn sgn, gys gys, Player player, gxz gxz, saj saj) {
        this.b = gys;
        this.c = ryz;
        this.d = sfu;
        this.e = sgn;
        this.f = player;
        this.g = gxz;
        this.h = saj;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.e.a();
        String string = gzp.data().string("uri");
        String string2 = guy.b.metadata().string("album_uri");
        if (string == null) {
            Assertion.b("empty trackUri");
        }
        Player player = this.f;
        qch.a(string2);
        StringBuilder sb = new StringBuilder("context://");
        sb.append(string2);
        PlayerContext playerContext = (PlayerContext) fay.a(PlayerContext.createFromContextUrl(string2, sb.toString()));
        qch.a(string);
        Builder suppressions = new Builder().suppressions(new PlayerSuppressions(Collections.singleton(PlayerProviders.MFT)));
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, string, 0);
        player.play(playerContext, suppressions.skipTo(playOptionsSkipTo).build());
        this.h.a(string2);
        this.g.logInteraction(string2, guy.b, "navigate-forward", null);
        this.g.logInteraction(string, guy.b, "play", null);
        gzt gzt = guy.b;
        if (!rzj.a(gzt) && !this.b.a(guy)) {
            this.c.a(this.d.a(string, gzt));
        }
    }

    public static gzp a(String str) {
        fay.a(str);
        return haa.builder().a("playAndSaveToHistoryAndNavigate").a("uri", str).a();
    }
}
