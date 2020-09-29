package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;

/* renamed from: plj reason: default package */
public final class plj implements vua<pli> {
    private final wlc<Player> a;
    private final wlc<plh> b;
    private final wlc<QueueManager> c;
    private final wlc<pmk> d;
    private final wlc<wug> e;

    private plj(wlc<Player> wlc, wlc<plh> wlc2, wlc<QueueManager> wlc3, wlc<pmk> wlc4, wlc<wug> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static plj a(wlc<Player> wlc, wlc<plh> wlc2, wlc<QueueManager> wlc3, wlc<pmk> wlc4, wlc<wug> wlc5) {
        plj plj = new plj(wlc, wlc2, wlc3, wlc4, wlc5);
        return plj;
    }

    public final /* synthetic */ Object get() {
        pli pli = new pli((Player) this.a.get(), (plh) this.b.get(), (QueueManager) this.c.get(), (pmk) this.d.get(), (wug) this.e.get());
        return pli;
    }
}
