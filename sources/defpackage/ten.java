package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: ten reason: default package */
public final class ten implements tca {
    private final fqn a;

    public ten(fqn fqn) {
        this.a = fqn;
    }

    public final boolean a(PlayerState playerState) {
        return suu.a(this.a) && svo.a((PlayerTrack) fbp.a(playerState.track()));
    }
}
