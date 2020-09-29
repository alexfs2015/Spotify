package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import rx.Emitter;

/* renamed from: -$$Lambda$QPrurw829qt0OJk_vwfyQQ6_BLE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$QPrurw829qt0OJk_vwfyQQ6_BLE implements PlayerStateObserver {
    private final /* synthetic */ Emitter f$0;

    public /* synthetic */ $$Lambda$QPrurw829qt0OJk_vwfyQQ6_BLE(Emitter emitter) {
        this.f$0 = emitter;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.onNext(playerState);
    }
}
