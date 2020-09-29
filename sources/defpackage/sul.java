package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: sul reason: default package */
public final class sul implements srt {
    public final boolean a(PlayerState playerState) {
        return !PlayerTrackUtil.isVideo(playerState.track());
    }
}
