package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: ixs reason: default package */
public final class ixs implements PlayerStateObserver {
    public final Player a;
    private final ixt b;

    public ixs(Player player, ixt ixt) {
        this.a = (Player) fbp.a(player);
        this.b = ixt;
    }

    public final void a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (lastPlayerState != null && lastPlayerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
            this.a.skipToNextTrack();
        }
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        ixt ixt = this.b;
        if (ixt != null && playerState != null) {
            fbp.a(ixt);
            playerState.isPaused();
            PlayerRestrictions restrictions = playerState.restrictions();
            if (playerState.isPaused()) {
                restrictions.disallowResumingReasons().isEmpty();
            } else {
                restrictions.disallowPausingReasons().isEmpty();
            }
            fbp.a(this.b);
            PlayerRestrictions restrictions2 = playerState.restrictions();
            restrictions2.disallowSkippingPrevReasons().isEmpty();
            restrictions2.disallowSeekingReasons().isEmpty();
            restrictions2.disallowSkippingNextReasons().isEmpty();
            fbp.a(this.b);
            playerState.restrictions().disallowSeekingReasons().isEmpty();
            playerState.currentPlaybackPosition();
            playerState.duration();
            playerState.playbackSpeed();
            playerState.duration();
            playerState.playbackSpeed();
        }
    }
}
