package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.Scheduler;

/* renamed from: tqa reason: default package */
public final class tqa implements wig<tpz> {
    private final wzi<Scheduler> a;
    private final wzi<tpx> b;
    private final wzi<vcq> c;
    private final wzi<Player> d;
    private final wzi<tnr> e;

    public static tpz a(Scheduler scheduler, Object obj, vcq vcq, wzi<Player> wzi, tnr tnr) {
        tpz tpz = new tpz(scheduler, (tpx) obj, vcq, wzi, tnr);
        return tpz;
    }

    public final /* synthetic */ Object get() {
        tpz tpz = new tpz((Scheduler) this.a.get(), (tpx) this.b.get(), (vcq) this.c.get(), this.d, (tnr) this.e.get());
        return tpz;
    }
}
