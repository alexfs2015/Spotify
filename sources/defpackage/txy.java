package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: txy reason: default package */
public final class txy implements gvk {
    private final Player b;
    private final txu c;
    private final gyq d;

    public txy(Player player, txu txu, gyq gyq) {
        this.b = player;
        this.c = txu;
        this.d = gyq;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        if (this.c.a()) {
            String string = gzp.data().string("uri");
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            if (lastPlayerState != null && string != null && lastPlayerState.contextUri().equals(string) && lastPlayerState.isPlaying() && !lastPlayerState.isPaused()) {
                this.b.pause();
                return;
            }
        }
        this.d.handleCommand(gzp, guy);
    }
}
