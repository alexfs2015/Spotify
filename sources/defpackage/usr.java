package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: usr reason: default package */
public final class usr implements a {
    private final Player a;
    private final url b;
    private final usq c;
    private uss d;

    public usr(Player player, url url, usq usq) {
        this.a = player;
        this.b = url;
        this.c = usq;
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fay.a(this.a.getLastPlayerState());
        this.c.e();
        this.a.seekTo(Math.max(0, playerState.currentPlaybackPosition() - 15000));
    }

    public final void a(uss uss) {
        this.d = (uss) fay.a(uss);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$usr$P5SRpPnuqdwKDGcxuFB8EfJ1cg<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(playerState.restrictions().disallowSeekingReasons().isEmpty());
    }
}
