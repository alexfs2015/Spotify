package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: veq reason: default package */
public final class veq implements a {
    private final Player a;
    private final vcq b;
    private final vep c;
    private ver d;

    public veq(Player player, vcq vcq, vep vep) {
        this.a = player;
        this.b = vcq;
        this.c = vep;
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        boolean shufflingContext = playerState.options().shufflingContext();
        boolean isEmpty = playerState.restrictions().disallowTogglingShuffleReasons().isEmpty();
        this.d.a(vdb.a(shufflingContext, isEmpty));
        this.d.a(isEmpty);
    }

    public final void a() {
        boolean shufflingContext = ((PlayerState) fbp.a(this.a.getLastPlayerState())).options().shufflingContext();
        this.c.c(shufflingContext);
        this.a.setShufflingContext(!shufflingContext);
    }

    public final void a(ver ver) {
        this.d = (ver) fbp.a(ver);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$veq$UbQNiKweaTAxn3aY5_mwWUTsVnE<T>(this));
    }
}
