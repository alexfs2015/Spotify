package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: svg reason: default package */
public final class svg implements vua<svf> {
    private final wlc<Player> a;

    private svg(wlc<Player> wlc) {
        this.a = wlc;
    }

    public static svg a(wlc<Player> wlc) {
        return new svg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new svf((Player) this.a.get());
    }
}
