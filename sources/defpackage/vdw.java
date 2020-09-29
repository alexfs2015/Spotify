package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: vdw reason: default package */
public final class vdw implements a {
    private final Player a;
    private final vcq b;
    private final vdv c;
    private vdx d;

    public vdw(Player player, vcq vcq, vdv vdv) {
        this.a = player;
        this.b = vcq;
        this.c = vdv;
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(playerState.restrictions().disallowSeekingReasons().isEmpty());
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fbp.a(this.a.getLastPlayerState());
        this.c.e();
        this.a.seekTo(Math.max(0, playerState.currentPlaybackPosition() - 15000));
    }

    public final void a(vdx vdx) {
        this.d = (vdx) fbp.a(vdx);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$vdw$ircV5HPmFmlddlAKXCp_wSa4<T>(this));
    }
}
