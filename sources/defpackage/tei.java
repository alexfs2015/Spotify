package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

/* renamed from: tei reason: default package */
public final class tei implements a {
    private final Player a;

    public tei(Player player) {
        this.a = player;
    }

    public final void a(String str) {
        if (!fax.a(str)) {
            StringBuilder sb = new StringBuilder("context://");
            sb.append(str);
            this.a.play(PlayerContext.createFromContextUrl(str, sb.toString()), null);
        }
    }
}
