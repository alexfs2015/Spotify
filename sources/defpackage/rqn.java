package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: rqn reason: default package */
public final class rqn implements vua<Player> {
    private final wlc<PlayerFactory> a;

    private rqn(wlc<PlayerFactory> wlc) {
        this.a = wlc;
    }

    public static rqn a(wlc<PlayerFactory> wlc) {
        return new rqn(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(((PlayerFactory) this.a.get()).create(ViewUris.ca.toString(), udt.aO, rju.y), "Cannot return null from a non-@Nullable @Provides method");
    }
}
