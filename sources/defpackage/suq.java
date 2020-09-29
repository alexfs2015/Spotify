package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: suq reason: default package */
public final class suq implements srt {
    public final boolean a(PlayerState playerState) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        return jst.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE && !PlayerTrackUtil.isVideo(playerTrack);
    }
}
