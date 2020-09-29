package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nowplaying.core.repeat.RepeatState;

/* renamed from: utg reason: default package */
public final class utg implements a {
    private final Player a;
    private final url b;
    private final utf c;
    private uth d;

    public utg(Player player, url url, utf utf) {
        this.a = player;
        this.b = url;
        this.c = utf;
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fay.a(this.a.getLastPlayerState());
        RepeatState a2 = urv.a(playerState);
        RepeatState a3 = urv.a(a2, playerState.restrictions());
        this.c.a(a3);
        if (a2 != a3) {
            this.a.setRepeatingContext(a3.mRepeatContext);
            this.a.setRepeatingTrack(a3.mRepeatTrack);
        }
    }

    public final void a(uth uth) {
        this.d = (uth) fay.a(uth);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$utg$dgBCqEZvQN7b8fEb90iSieg50lo<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        RepeatState a2 = urv.a(playerState);
        this.d.a(a2);
        this.d.a(a2 != RepeatState.DISABLED);
    }
}
