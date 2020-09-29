package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: tex reason: default package */
public final class tex implements tca {
    public final boolean a(PlayerState playerState) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        return jva.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE && !PlayerTrackUtil.isVideo(playerTrack);
    }
}
