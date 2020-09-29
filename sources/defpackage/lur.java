package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: lur reason: default package */
public final class lur implements vua<luq> {
    private final wlc<Player> a;

    private lur(wlc<Player> wlc) {
        this.a = wlc;
    }

    public static lur a(wlc<Player> wlc) {
        return new lur(wlc);
    }

    public final /* synthetic */ Object get() {
        return new luq((Player) this.a.get());
    }
}
