package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: -$$Lambda$hkm$srcv0kYj7t6LlEQRj1fTZvuLma4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hkm$srcv0kYj7t6LlEQRj1fTZvuLma4 implements PlayerStateObserver {
    private final /* synthetic */ hkm f$0;

    public /* synthetic */ $$Lambda$hkm$srcv0kYj7t6LlEQRj1fTZvuLma4(hkm hkm) {
        this.f$0 = hkm;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.b(playerState);
    }
}
