package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: qci reason: default package */
public final class qci implements sgp {
    private final Player a;
    private final saj b;

    public qci(saj saj, Player player) {
        this.a = player;
        this.b = (saj) fay.a(saj);
    }

    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        PlayerContext createFromContextUrl = PlayerContext.createFromContextUrl(str, sb.toString());
        this.a.play((PlayerContext) fay.a(createFromContextUrl), new Builder().build());
        String c = uhq.c(str);
        if (c != null) {
            this.b.b(c, str2);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Station for uri ");
        sb2.append(str);
        sb2.append("could not be created");
        Assertion.b(sb2.toString());
    }
}
