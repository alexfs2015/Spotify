package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: ixd reason: default package */
public final class ixd implements wig<Player> {
    private final wzi<PlayerFactory> a;

    public static Player a(PlayerFactory playerFactory) {
        return (Player) wil.a(CC.a(playerFactory), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((PlayerFactory) this.a.get());
    }
}
