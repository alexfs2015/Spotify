package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: kew reason: default package */
public final class kew implements kev {
    private final Player a;
    private boolean b;

    public kew(Player player) {
        this.a = player;
    }

    public final void b() {
        if (this.b) {
            this.a.resume();
        }
    }

    public final void a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        this.b = lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused();
        this.a.pause();
    }
}
