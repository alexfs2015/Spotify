package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.SingleEmitter;

/* renamed from: -$$Lambda$qpv$a$1$TNumftT8hDZonVpO1uey36WvuxM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qpv$a$1$TNumftT8hDZonVpO1uey36WvuxM implements PlayerStateObserver {
    private final /* synthetic */ SingleEmitter f$0;

    public /* synthetic */ $$Lambda$qpv$a$1$TNumftT8hDZonVpO1uey36WvuxM(SingleEmitter singleEmitter) {
        this.f$0 = singleEmitter;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.a(playerState.playbackId());
    }
}
