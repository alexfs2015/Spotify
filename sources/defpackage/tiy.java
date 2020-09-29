package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tiy reason: default package */
public final class tiy implements vua<tix> {
    private final wlc<Player> a;
    private final wlc<a> b;

    private tiy(wlc<Player> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tiy a(wlc<Player> wlc, wlc<a> wlc2) {
        return new tiy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tix((Player) this.a.get(), (a) this.b.get());
    }
}
