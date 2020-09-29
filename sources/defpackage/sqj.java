package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: sqj reason: default package */
public final class sqj implements tce {
    private final raq a;

    public sqj(raq raq) {
        this.a = raq;
    }

    public final boolean a(PlayerState playerState, fpt fpt) {
        return this.a.a(playerState) || uhq.g(playerState.contextUri()) || uhq.f(playerState.contextUri());
    }
}
