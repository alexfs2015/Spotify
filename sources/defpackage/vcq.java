package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: vcq reason: default package */
public final class vcq extends vcz<PlayerState> implements PlayerStateObserver {
    private final Player a;
    private final wzi<PlayerState> b;

    public vcq(Player player, a aVar, wzi<PlayerState> wzi) {
        this.a = player;
        this.b = wzi;
        aVar.a(new c() {
            public final void a() {
                vcq.this.a.unregisterPlayerStateObserver(vcq.this);
            }

            public final void aN_() {
                vcq.this.a.unregisterPlayerStateObserver(vcq.this);
            }

            public final void c() {
                vcq.a(vcq.this);
            }
        });
    }

    static /* synthetic */ void a(vcq vcq) {
        vcq.a.registerPlayerStateObserver(vcq);
        PlayerState playerState = (PlayerState) vcq.b.get();
        if (playerState != null) {
            vcq.onPlayerStateReceived(playerState);
        }
        vcq.a.fetchState(vcq);
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        if (playerState != null && playerState.track() != null) {
            a(playerState);
        }
    }
}
