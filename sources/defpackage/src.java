package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: src reason: default package */
public final class src implements tce {
    public final boolean a(PlayerState playerState, fpt fpt) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        return (jst.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE && !"video".equals((String) playerTrack.metadata().get("media.type"))) || PlayerTrackUtil.isPodcastAd(playerTrack);
    }
}
