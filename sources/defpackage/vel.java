package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nowplaying.core.repeat.RepeatState;

/* renamed from: vel reason: default package */
public final class vel implements a {
    private final Player a;
    private final vcq b;
    private final vek c;
    private vem d;

    public vel(Player player, vcq vcq, vek vek) {
        this.a = player;
        this.b = vcq;
        this.c = vek;
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        RepeatState a2 = vda.a(playerState);
        this.d.a(a2);
        this.d.a(a2 != RepeatState.DISABLED);
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fbp.a(this.a.getLastPlayerState());
        RepeatState a2 = vda.a(playerState);
        RepeatState a3 = vda.a(a2, playerState.restrictions());
        this.c.a(a3);
        if (a2 != a3) {
            this.a.setRepeatingContext(a3.mRepeatContext);
            this.a.setRepeatingTrack(a3.mRepeatTrack);
        }
    }

    public final void a(vem vem) {
        this.d = (vem) fbp.a(vem);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$vel$djmEpci18YbAksmCssSO3QxtFng<T>(this));
    }
}
