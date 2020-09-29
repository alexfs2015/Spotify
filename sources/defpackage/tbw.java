package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.UserIntent;

/* renamed from: tbw reason: default package */
public final class tbw implements a, a<Boolean> {
    public final tbu a;
    public tbx b;
    private final Player c;
    private final tkk d;
    private final tbp e;

    public tbw(Player player, tbu tbu, tkk tkk, tbp tbp) {
        this.c = player;
        this.a = tbu;
        this.d = tkk;
        this.e = tbp;
    }

    public final void a() {
        PlayerState lastPlayerState = this.c.getLastPlayerState();
        if (lastPlayerState != null) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null) {
                tkk tkk = this.d;
                tkk.a(PlayerStateUtil.getTrackUri(tkk.o()), SectionId.SLEEP_TIMER_BUTTON, UserIntent.OPEN_SLEEP_TIMER_MENU, InteractionType.HIT);
                this.e.a(track.uri());
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.b.a(((Boolean) obj).booleanValue());
    }
}
