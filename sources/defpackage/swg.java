package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: swg reason: default package */
public final class swg implements tce {
    public final boolean a(PlayerState playerState, fpt fpt) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        if (!PlayerTrackUtil.isPodcastAd(playerTrack) && PlayerTrackUtil.isAd(playerTrack) && !PlayerTrackUtil.isVideo(playerState.track())) {
            return true;
        }
        return false;
    }
}
