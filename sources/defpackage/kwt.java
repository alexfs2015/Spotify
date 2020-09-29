package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: kwt reason: default package */
public final class kwt implements vua<Player> {
    private final wlc<PlayerFactory> a;
    private final wlc<udr> b;
    private final wlc<gjb> c;

    public static Player a(PlayerFactory playerFactory, udr udr, gjb gjb) {
        return (Player) vuf.a(kwq.a(playerFactory, udr, gjb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((PlayerFactory) this.a.get(), (udr) this.b.get(), (gjb) this.c.get());
    }
}
