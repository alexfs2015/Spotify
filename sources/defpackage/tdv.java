package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tdv reason: default package */
public final class tdv implements tca {
    private final kuz a;

    public tdv(kuz kuz) {
        this.a = kuz;
    }

    public final boolean a(PlayerState playerState) {
        PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
        return !svo.a(playerTrack) && this.a.a.a().containsTrack(playerTrack.uri());
    }
}
