package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import rx.Emitter;

/* renamed from: -$$Lambda$gY5dM9d2sPsgGBCO49dFQNIFxpc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gY5dM9d2sPsgGBCO49dFQNIFxpc implements PlayerStateObserver {
    private final /* synthetic */ Emitter f$0;

    public /* synthetic */ $$Lambda$gY5dM9d2sPsgGBCO49dFQNIFxpc(Emitter emitter) {
        this.f$0 = emitter;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.onNext(playerState);
    }
}
