package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.stateful.StatefulPlayer;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: tlu reason: default package */
public final class tlu implements wig<Player> {
    private final wzi<PlayerFactory> a;

    private tlu(wzi<PlayerFactory> wzi) {
        this.a = wzi;
    }

    public static tlu a(wzi<PlayerFactory> wzi) {
        return new tlu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(new StatefulPlayer(((PlayerFactory) this.a.get()).create(ViewUris.X.toString(), uqo.ay, rta.s)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
