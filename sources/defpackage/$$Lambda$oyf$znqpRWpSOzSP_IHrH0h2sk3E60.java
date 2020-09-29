package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: -$$Lambda$oyf$znqpRWpSO-zSP_IHrH0h2sk3E60 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$oyf$znqpRWpSOzSP_IHrH0h2sk3E60 implements PlayerStateObserver {
    private final /* synthetic */ oyf f$0;

    public /* synthetic */ $$Lambda$oyf$znqpRWpSOzSP_IHrH0h2sk3E60(oyf oyf) {
        this.f$0 = oyf;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.b(playerState);
    }
}
