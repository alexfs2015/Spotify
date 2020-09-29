package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: gti reason: default package */
public final class gti implements vua<Player> {
    private final wlc<PlayerFactory> a;

    private gti(wlc<PlayerFactory> wlc) {
        this.a = wlc;
    }

    public static gti a(wlc<PlayerFactory> wlc) {
        return new gti(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(((PlayerFactory) this.a.get()).create(ViewUris.v.toString(), udt.N, rju.e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
