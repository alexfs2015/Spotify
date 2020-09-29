package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: utb reason: default package */
public final class utb implements a {
    private final Player a;
    private final url b;
    private final uta c;
    private utc d;

    public utb(Player player, url url, uta uta) {
        this.a = player;
        this.b = url;
        this.c = uta;
    }

    public final void a() {
        PlayerState playerState = (PlayerState) fay.a(this.a.getLastPlayerState());
        this.c.f();
        this.a.seekTo(Math.min(playerState.currentPlaybackPosition() + 15000, playerState.duration()));
    }

    public final void a(utc utc) {
        this.d = (utc) fay.a(utc);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$utb$WbuszR48RoWZISsfqO_RTc5UaUU<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(playerState.restrictions().disallowSeekingReasons().isEmpty());
    }
}
