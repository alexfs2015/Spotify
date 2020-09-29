package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: kgy reason: default package */
public final class kgy implements kgx {
    private final Player a;
    private boolean b;

    public kgy(Player player) {
        this.a = player;
    }

    public final void a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        this.b = lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused();
        this.a.pause();
    }

    public final void b() {
        if (this.b) {
            this.a.resume();
        }
    }
}
