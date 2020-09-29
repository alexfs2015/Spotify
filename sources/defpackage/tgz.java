package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: tgz reason: default package */
public final class tgz implements tce {
    public final boolean a(PlayerState playerState, fpt fpt) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        return (PlayerTrackUtil.isAd(playerTrack) && PlayerTrackUtil.isVideo(playerTrack)) || InterruptionUtil.isInterruptionUri(playerTrack.uri());
    }
}
