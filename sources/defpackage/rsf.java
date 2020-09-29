package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger;
import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger.UserIntent;

/* renamed from: rsf reason: default package */
public final class rsf implements gxk {
    private final Player b;
    private final HomePromotionPlayButtonLogger c;
    private final a d;

    public rsf(Player player, a aVar, HomePromotionPlayButtonLogger homePromotionPlayButtonLogger) {
        this.b = player;
        this.c = homePromotionPlayButtonLogger;
        this.d = aVar;
    }

    public static boolean a(PlayerState playerState, String str) {
        return playerState != null && str != null && str.equals(playerState.contextUri()) && playerState.isPlaying() && !playerState.isPaused();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (!fbo.a(string)) {
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            if (lastPlayerState == null || !string.equals(lastPlayerState.contextUri())) {
                PlayerContext a = hbr.a(hci.data());
                if (a != null) {
                    this.b.playWithViewUri(a, hbr.b(hci.data()), this.d.ae_().toString());
                }
                this.c.a(string, UserIntent.PLAY);
            } else if (!lastPlayerState.isPlaying() || lastPlayerState.isPaused()) {
                this.b.resume();
                this.c.a(string, UserIntent.RESUME);
            } else {
                this.b.pause();
                this.c.a(string, UserIntent.PAUSE);
            }
        }
    }
}
