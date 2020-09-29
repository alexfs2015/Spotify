package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: kqu reason: default package */
public final class kqu implements vua<Player> {
    private final wlc<PlayerFactory> a;

    public static Player a(PlayerFactory playerFactory) {
        return (Player) vuf.a(CC.a(playerFactory), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((PlayerFactory) this.a.get());
    }
}
