package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: tgn reason: default package */
public final class tgn implements tml {
    public final boolean a(PlayerState playerState, fqn fqn) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        return !PlayerTrackUtil.isPodcastAd(playerTrack) && PlayerTrackUtil.isAd(playerTrack) && !PlayerTrackUtil.isVideo(playerState.track());
    }
}
