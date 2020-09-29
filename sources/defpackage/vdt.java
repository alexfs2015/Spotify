package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: vdt reason: default package */
public final class vdt implements a {
    private final Player a;
    private final vcq b;
    private final vds c;
    private vdu d;

    public vdt(Player player, vcq vcq, vds vds) {
        this.a = player;
        this.b = vcq;
        this.c = vds;
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.d.a(playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty());
    }

    public final void a() {
        this.c.c();
        this.a.skipToPreviousTrack();
    }

    public final void a(vdu vdu) {
        this.d = (vdu) fbp.a(vdu);
        this.d.a((a) this);
        this.b.a((a<T>) new $$Lambda$vdt$AJnh1oWXAyL53v0niPXiMPsJIV4<T>(this));
    }
}
