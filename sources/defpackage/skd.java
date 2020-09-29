package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: skd reason: default package */
public final class skd implements gvk {
    private final Player b;
    private final a c;
    private final gzm d;
    private final vol e;
    private final gyj f;

    public skd(Player player, a aVar, gyj gyj, gzm gzm, vol vol) {
        this.b = player;
        this.c = (a) fay.a(aVar);
        this.f = gyj;
        this.d = gzm;
        this.e = vol;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
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
            gzt gzt = guy.b;
            PlayerContext a = gyy.a(gzp.data());
            if (a != null) {
                PlayOptions b2 = gyy.b(gzp.data());
                String str = null;
                PlayOptionsSkipTo skipTo = b2 != null ? b2.skipTo() : null;
                if (skipTo != null) {
                    str = skipTo.trackUri();
                }
                this.e.a(this.d.a(guy).a(str != null ? str : ""));
                if (this.f.a(lla.a(gzt))) {
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
