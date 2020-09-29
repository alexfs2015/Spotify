package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;

/* renamed from: pdm reason: default package */
public abstract class pdm {
    public abstract String a();

    public abstract String b();

    public static pdm a(PlayerState playerState) {
        return new pdl(playerState.contextUri(), PlayerStateUtil.getTrackUri(playerState));
    }
}
