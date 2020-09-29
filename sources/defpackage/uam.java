package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: uam reason: default package */
public final class uam implements vua<Player> {
    private final wlc<PlayerFactory> a;

    private uam(wlc<PlayerFactory> wlc) {
        this.a = wlc;
    }

    public static uam a(wlc<PlayerFactory> wlc) {
        return new uam(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(((PlayerFactory) this.a.get()).create(ViewUris.V.toString(), udt.aO, rju.y), "Cannot return null from a non-@Nullable @Provides method");
    }
}
