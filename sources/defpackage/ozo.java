package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import io.reactivex.Scheduler;

/* renamed from: ozo reason: default package */
public final class ozo implements vua<ozn> {
    private final wlc<String> a;
    private final wlc<QueueManager> b;
    private final wlc<Player> c;
    private final wlc<Scheduler> d;
    private final wlc<Scheduler> e;
    private final wlc<jrp> f;

    private ozo(wlc<String> wlc, wlc<QueueManager> wlc2, wlc<Player> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5, wlc<jrp> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ozo a(wlc<String> wlc, wlc<QueueManager> wlc2, wlc<Player> wlc3, wlc<Scheduler> wlc4, wlc<Scheduler> wlc5, wlc<jrp> wlc6) {
        ozo ozo = new ozo(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ozo;
    }

    public final /* synthetic */ Object get() {
        ozn ozn = new ozn((String) this.a.get(), (QueueManager) this.b.get(), (Player) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get(), (jrp) this.f.get());
        return ozn;
    }
}
