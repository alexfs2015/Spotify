package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

/* renamed from: tos reason: default package */
public final class tos implements a {
    private final wzi<Player> a;

    public tos(wzi<Player> wzi) {
        this.a = wzi;
    }

    public final void a(String str) {
        if (!fbo.a(str)) {
            StringBuilder sb = new StringBuilder("context://");
            sb.append(str);
            ((Player) this.a.get()).play(PlayerContext.createFromContextUrl(str, sb.toString()), null);
        }
    }
}
