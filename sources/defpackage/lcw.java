package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lcw reason: default package */
public final class lcw implements vua<Player> {
    private final wlc<PlayerFactory> a;

    private lcw(wlc<PlayerFactory> wlc) {
        this.a = wlc;
    }

    public static lcw a(wlc<PlayerFactory> wlc) {
        return new lcw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Player) vuf.a(((PlayerFactory) this.a.get()).create(ViewUris.w.toString(), udt.P, rju.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
