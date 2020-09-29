package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: ukt reason: default package */
public final class ukt implements gxk {
    private final Player b;
    private final ukp c;
    private final hbj d;

    public ukt(Player player, ukp ukp, hbj hbj) {
        this.b = player;
        this.c = ukp;
        this.d = hbj;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        if (this.c.a()) {
            String string = hci.data().string("uri");
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            if (lastPlayerState != null && string != null && lastPlayerState.contextUri().equals(string) && lastPlayerState.isPlaying() && !lastPlayerState.isPaused()) {
                this.b.pause();
                return;
            }
        }
        this.d.handleCommand(hci, gwy);
    }
}
