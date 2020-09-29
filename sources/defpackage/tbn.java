package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.stateful.StatefulPlayer;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: tbn reason: default package */
public final class tbn implements vua<Player> {
    private final wlc<PlayerFactory> a;

    private tbn(wlc<PlayerFactory> wlc) {
        this.a = wlc;
    }

    public static tbn a(wlc<PlayerFactory> wlc) {
        return new tbn(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(new StatefulPlayer(((PlayerFactory) this.a.get()).create(ViewUris.Y.toString(), udt.ay, rju.s)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
