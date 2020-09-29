package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: szm reason: default package */
public final class szm implements vua<szl> {
    private final wlc<Context> a;
    private final wlc<Player> b;
    private final wlc<usf> c;

    private szm(wlc<Context> wlc, wlc<Player> wlc2, wlc<usf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static szm a(wlc<Context> wlc, wlc<Player> wlc2, wlc<usf> wlc3) {
        return new szm(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new szl((Context) this.a.get(), (Player) this.b.get(), (usf) this.c.get());
    }
}
