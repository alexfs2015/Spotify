package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: veg reason: default package */
public final class veg implements a {
    private final Player a;
    private final vcq b;
    private final vef c;
    private veh d;

    public veg(Player player, vcq vcq, vef vef) {
        this.a = player;
        this.b = vcq;
        this.c = vef;
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(playerState.restrictions().disallowSeekingReasons().isEmpty());
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fbp.a(this.a.getLastPlayerState());
        this.c.f();
        this.a.seekTo(Math.min(playerState.currentPlaybackPosition() + 15000, playerState.duration()));
    }

    public final void a(veh veh) {
        this.d = (veh) fbp.a(veh);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$veg$gipdmOITsKAuvXEe9MWPFku2pXU<T>(this));
    }
}
