package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ulg reason: default package */
public final class ulg implements vua<Player> {
    private final wlc<PlayerFactory> a;

    private ulg(wlc<PlayerFactory> wlc) {
        this.a = wlc;
    }

    public static ulg a(wlc<PlayerFactory> wlc) {
        return new ulg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(((PlayerFactory) this.a.get()).create(ViewUris.bV.toString(), udt.bg, rju.B), "Cannot return null from a non-@Nullable @Provides method");
    }
}
