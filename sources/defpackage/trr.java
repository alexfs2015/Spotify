package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: trr reason: default package */
public final class trr implements tml {
    public final boolean a(PlayerState playerState, fqn fqn) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        return (PlayerTrackUtil.isAd(playerTrack) && PlayerTrackUtil.isVideo(playerTrack)) || InterruptionUtil.isInterruptionUri(playerTrack.uri());
    }
}
