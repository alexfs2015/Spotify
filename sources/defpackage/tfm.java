package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tfm reason: default package */
public final class tfm {
    final Map<String, PlayerSession> a = new HashMap();
    final Player b;

    public tfm(Player player) {
        this.b = (Player) fbp.a(player);
    }

    static PlayerContext a(String str) {
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        return PlayerContext.createFromContextUrl(str, sb.toString());
    }

    public final synchronized void a() {
        for (PlayerSession destroy : this.a.values()) {
            destroy.destroy();
        }
        this.a.clear();
    }

    public final synchronized void b(String str) {
        PlayerSession playerSession = (PlayerSession) this.a.get(str);
        if (playerSession != null) {
            playerSession.play();
        } else {
            this.b.play(a(str), null);
        }
    }
}
