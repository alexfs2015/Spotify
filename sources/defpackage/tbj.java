package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: tbj reason: default package */
public final class tbj implements tml {
    public final boolean a(PlayerState playerState, fqn fqn) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        return (jva.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE && !"video".equals((String) playerTrack.metadata().get("media.type"))) || PlayerTrackUtil.isPodcastAd(playerTrack);
    }
}
