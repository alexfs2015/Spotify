package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.UserIntent;

/* renamed from: srp reason: default package */
public final class srp implements a, a<Boolean> {
    public final srn a;
    public srq b;
    private final Player c;
    private final tad d;
    private final sri e;

    public final /* synthetic */ void onChanged(Object obj) {
        this.b.a(((Boolean) obj).booleanValue());
    }

    public srp(Player player, srn srn, tad tad, sri sri) {
        this.c = player;
        this.a = srn;
        this.d = tad;
        this.e = sri;
    }

    public final void a() {
        PlayerState lastPlayerState = this.c.getLastPlayerState();
        if (lastPlayerState != null) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null) {
                tad tad = this.d;
                tad.a(PlayerStateUtil.getTrackUri(tad.o()), SectionId.SLEEP_TIMER_BUTTON, UserIntent.OPEN_SLEEP_TIMER_MENU, InteractionType.HIT);
                this.e.a(track.uri());
            }
        }
    }
}
