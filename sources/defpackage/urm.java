package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: urm reason: default package */
public final class urm implements vua<url> {
    private final wlc<Player> a;
    private final wlc<a> b;
    private final wlc<PlayerState> c;

    private urm(wlc<Player> wlc, wlc<a> wlc2, wlc<PlayerState> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static urm a(wlc<Player> wlc, wlc<a> wlc2, wlc<PlayerState> wlc3) {
        return new urm(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new url((Player) this.a.get(), (a) this.b.get(), this.c);
    }
}
