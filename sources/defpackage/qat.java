package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: qat reason: default package */
public final class qat {
    public static boolean a(PlayerState playerState) {
        if (playerState != null) {
            PlayerTrack track = playerState.track();
            if (track != null && (PlayerTrackUtil.isAd(track) || InterruptionUtil.isInterruptionUri(track.uri()))) {
                return true;
            }
        }
        return false;
    }
}
