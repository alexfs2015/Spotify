package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

@Deprecated
/* renamed from: hpk reason: default package */
public final class hpk implements hpn {
    private final Player b;

    public hpk(Player player) {
        this.b = (Player) fbp.a(player);
    }

    public final boolean a() {
        return a(a);
    }

    public final boolean a(int i) {
        PlayerState playerState = (PlayerState) fbp.a(this.b.getLastPlayerState());
        this.b.seekTo((long) ((int) Math.max(0, Math.min(playerState.currentPlaybackPosition() + ((long) i), playerState.duration()))));
        return true;
    }

    public final boolean a(ActionCallback actionCallback) {
        PlayerState lastPlayerState = this.b.getLastPlayerState();
        if (lastPlayerState == null || lastPlayerState.isPaused()) {
            this.b.resume(actionCallback);
        } else {
            this.b.pause(actionCallback);
        }
        return true;
    }

    public final boolean a(boolean z) {
        return a(z, a);
    }

    public final boolean a(boolean z, ActionCallback actionCallback) {
        if (z) {
            this.b.pause(actionCallback);
        } else {
            this.b.resume(actionCallback);
        }
        return true;
    }

    public final boolean b() {
        this.b.skipToPreviousTrack(null);
        return true;
    }

    public final boolean c() {
        this.b.skipToNextTrack((ActionCallback) null);
        return true;
    }
}