package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: ttd reason: default package */
public final class ttd implements tsw {
    private final ttf a;
    private final Player b;
    private final tvw c;
    private final ttv d;
    private final sih e;

    public ttd(ttf ttf, Player player, tvw tvw, sih sih, ttv ttv) {
        this.a = ttf;
        this.b = player;
        this.c = tvw;
        this.d = ttv;
        this.e = sih;
    }

    public final void a(uys uys, uys[] uysArr, String str, int i) {
        if (a(uys)) {
            this.b.pause();
            this.c.c(uys.getUri(), str, i);
        } else if (!this.d.a() || !uys.i()) {
            b(uys, uysArr, str, i);
        } else {
            this.d.a(uys.getUri(), this.e.toString());
        }
    }

    private void b(uys uys, uys[] uysArr, String str, int i) {
        this.a.a(uys, uysArr, str, i);
    }

    private boolean a(uys uys) {
        PlayerState lastPlayerState = this.b.getLastPlayerState();
        PlayerTrack track = lastPlayerState != null ? lastPlayerState.track() : null;
        return lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused() && track != null && track.uri().equals(uys.getUri());
    }
}
