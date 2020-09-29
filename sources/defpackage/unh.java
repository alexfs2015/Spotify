package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: unh reason: default package */
public final class unh implements wig<Player> {
    private final wzi<PlayerFactory> a;

    private unh(wzi<PlayerFactory> wzi) {
        this.a = wzi;
    }

    public static unh a(wzi<PlayerFactory> wzi) {
        return new unh(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Player) wil.a(((PlayerFactory) this.a.get()).create(ViewUris.U.toString(), uqo.aO, rta.y), "Cannot return null from a non-@Nullable @Provides method");
    }
}
