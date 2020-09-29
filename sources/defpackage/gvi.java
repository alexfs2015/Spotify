package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: gvi reason: default package */
public final class gvi implements wig<Player> {
    private final wzi<PlayerFactory> a;

    private gvi(wzi<PlayerFactory> wzi) {
        this.a = wzi;
    }

    public static gvi a(wzi<PlayerFactory> wzi) {
        return new gvi(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(((PlayerFactory) this.a.get()).create(ViewUris.u.toString(), uqo.N, rta.e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
