package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger;
import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayButtonLogger.UserIntent;

/* renamed from: rjd reason: default package */
public final class rjd implements gvk {
    private final Player b;
    private final HomePromotionPlayButtonLogger c;
    private final a d;

    public rjd(Player player, a aVar, HomePromotionPlayButtonLogger homePromotionPlayButtonLogger) {
        this.b = player;
        this.c = homePromotionPlayButtonLogger;
        this.d = aVar;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri");
        if (!fax.a(string)) {
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            if (lastPlayerState == null || !string.equals(a(lastPlayerState))) {
                PlayerContext a = gyy.a(gzp.data());
                if (a != null) {
                    this.b.playWithViewUri(a, gyy.b(gzp.data()), this.d.ae_().toString());
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

    public static boolean a(PlayerState playerState, String str) {
        if (playerState == null || str == null || !str.equals(a(playerState)) || !playerState.isPlaying() || playerState.isPaused()) {
            return false;
        }
        return true;
    }

    private static String a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track != null) {
            return track.uri();
        }
        return null;
    }
}
