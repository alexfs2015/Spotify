package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: lac reason: default package */
public final class lac implements wig<Player> {
    private final wzi<PlayerFactory> a;
    private final wzi<uqm> b;
    private final wzi<gkm> c;

    public static Player a(PlayerFactory playerFactory, uqm uqm, gkm gkm) {
        return (Player) wil.a(kzz.a(playerFactory, uqm, gkm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((PlayerFactory) this.a.get(), (uqm) this.b.get(), (gkm) this.c.get());
    }
}
