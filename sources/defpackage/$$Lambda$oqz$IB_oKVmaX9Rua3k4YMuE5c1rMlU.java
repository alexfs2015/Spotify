package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: -$$Lambda$oqz$IB_oKVmaX9Rua3k4YMuE5c1rMlU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$oqz$IB_oKVmaX9Rua3k4YMuE5c1rMlU implements PlayerStateObserver {
    private final /* synthetic */ oqz f$0;

    public /* synthetic */ $$Lambda$oqz$IB_oKVmaX9Rua3k4YMuE5c1rMlU(oqz oqz) {
        this.f$0 = oqz;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        this.f$0.b(playerState);
    }
}
