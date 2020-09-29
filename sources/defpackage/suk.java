package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: suk reason: default package */
public final class suk implements gxk {
    private final Player b;
    private final a c;
    private final hcf d;
    private final wbt e;
    private final hbc f;

    public suk(Player player, a aVar, hbc hbc, hcf hcf, wbt wbt) {
        this.b = player;
        this.c = (a) fbp.a(aVar);
        this.f = hbc;
        this.d = hcf;
        this.e = wbt;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string != null) {
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            boolean z = true;
            if (lastPlayerState != null && lastPlayerState.contextUri().equals(string) && lastPlayerState.isPlaying() && !lastPlayerState.isPaused()) {
                this.b.pause();
                return;
            }
            if (lastPlayerState != null && lastPlayerState.contextUri().equals(string) && lastPlayerState.isPaused() && lastPlayerState.isPlaying()) {
                this.b.resume();
                return;
            }
            hcm hcm = gwy.b;
            PlayerContext a = hbr.a(hci.data());
            if (a != null) {
                PlayOptions b2 = hbr.b(hci.data());
                String str = null;
                PlayOptionsSkipTo skipTo = b2 != null ? b2.skipTo() : null;
                if (skipTo != null) {
                    str = skipTo.trackUri();
                }
                this.e.a(this.d.a(gwy).a(str != null ? str : ""));
                if (this.f.a(lpa.a(hcm))) {
                    if (b2 == null || b2.skipTo() == null) {
                        z = false;
                    }
                    if (z && str != null) {
                        this.f.a(str, a.uri());
                        return;
                    }
                }
                this.b.playWithViewUri(a, b2, this.c.ae_().toString());
            }
        }
    }
}
