package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: ivh reason: default package */
public final class ivh implements PlayerStateObserver {
    public final Player a;
    private final ivi b;

    public ivh(Player player, ivi ivi) {
        this.a = (Player) fay.a(player);
        this.b = ivi;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        ivi ivi = this.b;
        if (ivi != null && playerState != null) {
            fay.a(ivi);
            playerState.isPaused();
            PlayerRestrictions restrictions = playerState.restrictions();
            if (playerState.isPaused()) {
                restrictions.disallowResumingReasons().isEmpty();
            } else {
                restrictions.disallowPausingReasons().isEmpty();
            }
            fay.a(this.b);
            PlayerRestrictions restrictions2 = playerState.restrictions();
            restrictions2.disallowSkippingPrevReasons().isEmpty();
            restrictions2.disallowSeekingReasons().isEmpty();
            restrictions2.disallowSkippingNextReasons().isEmpty();
            fay.a(this.b);
            playerState.restrictions().disallowSeekingReasons().isEmpty();
            playerState.currentPlaybackPosition();
            playerState.duration();
            playerState.playbackSpeed();
            playerState.duration();
            playerState.playbackSpeed();
        }
    }

    public final void a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (lastPlayerState != null && lastPlayerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
            this.a.skipToNextTrack();
        }
    }
}
