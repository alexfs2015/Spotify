package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: utl reason: default package */
public final class utl implements a {
    private final Player a;
    private final url b;
    private final utk c;
    private utm d;

    public utl(Player player, url url, utk utk) {
        this.a = player;
        this.b = url;
        this.c = utk;
    }

    public final void a() {
        boolean shufflingContext = ((PlayerState) fay.a(this.a.getLastPlayerState())).options().shufflingContext();
        this.c.c(shufflingContext);
        this.a.setShufflingContext(!shufflingContext);
    }

    public final void a(utm utm) {
        this.d = (utm) fay.a(utm);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$utl$8eCaHzopRThA9aFFirnoSES38o<T>(this));
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        boolean shufflingContext = playerState.options().shufflingContext();
        boolean isEmpty = playerState.restrictions().disallowTogglingShuffleReasons().isEmpty();
        this.d.a(urw.a(shufflingContext, isEmpty));
        this.d.a(isEmpty);
    }
}
