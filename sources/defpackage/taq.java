package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: taq reason: default package */
public final class taq implements tml {
    private final rjm a;

    public taq(rjm rjm) {
        this.a = rjm;
    }

    public final boolean a(PlayerState playerState, fqn fqn) {
        return this.a.a(playerState) || ute.f(playerState.contextUri()) || ute.e(playerState.contextUri());
    }
}
