package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;

/* renamed from: pky reason: default package */
public abstract class pky {
    public static pky a(PlayerState playerState) {
        return new pkx(playerState.contextUri(), PlayerStateUtil.getTrackUri(playerState));
    }

    public abstract String a();

    public abstract String b();
}
