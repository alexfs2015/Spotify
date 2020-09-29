package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: tes reason: default package */
public final class tes implements tca {
    public final boolean a(PlayerState playerState) {
        return !PlayerTrackUtil.isVideo(playerState.track());
    }
}
