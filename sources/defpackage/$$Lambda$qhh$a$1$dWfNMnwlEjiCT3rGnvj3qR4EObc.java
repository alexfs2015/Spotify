package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.SingleEmitter;

/* renamed from: -$$Lambda$qhh$a$1$dWfNMnwlEjiCT3rGnvj3qR4EObc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qhh$a$1$dWfNMnwlEjiCT3rGnvj3qR4EObc implements PlayerStateObserver {
    private final /* synthetic */ SingleEmitter f$0;

    public /* synthetic */ $$Lambda$qhh$a$1$dWfNMnwlEjiCT3rGnvj3qR4EObc(SingleEmitter singleEmitter) {
        this.f$0 = singleEmitter;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.a(playerState.playbackId());
    }
}
