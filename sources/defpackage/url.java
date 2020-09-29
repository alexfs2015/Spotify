package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: url reason: default package */
public final class url extends uru<PlayerState> implements PlayerStateObserver {
    private final Player a;
    private final wlc<PlayerState> b;

    public url(Player player, a aVar, wlc<PlayerState> wlc) {
        this.a = player;
        this.b = wlc;
        aVar.a(new c() {
            public final void c() {
                url.a(url.this);
            }

            public final void a() {
                url.this.a.unregisterPlayerStateObserver(url.this);
            }

            public final void aP_() {
                url.this.a.unregisterPlayerStateObserver(url.this);
            }
        });
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        if (playerState != null && playerState.track() != null) {
            a(playerState);
        }
    }

    static /* synthetic */ void a(url url) {
        url.a.registerPlayerStateObserver(url);
        PlayerState playerState = (PlayerState) url.b.get();
        if (playerState != null) {
            url.onPlayerStateReceived(playerState);
        }
        url.a.fetchState(url);
    }
}
