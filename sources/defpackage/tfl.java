package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: tfl reason: default package */
public final class tfl implements wig<tfk> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<tfm> b;
    private final wzi<tfc> c;
    private final wzi<Scheduler> d;
    private final wzi<tfg> e;
    private final wzi<szp> f;

    private tfl(wzi<Flowable<PlayerState>> wzi, wzi<tfm> wzi2, wzi<tfc> wzi3, wzi<Scheduler> wzi4, wzi<tfg> wzi5, wzi<szp> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static tfl a(wzi<Flowable<PlayerState>> wzi, wzi<tfm> wzi2, wzi<tfc> wzi3, wzi<Scheduler> wzi4, wzi<tfg> wzi5, wzi<szp> wzi6) {
        tfl tfl = new tfl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return tfl;
    }

    public final /* synthetic */ Object get() {
        tfk tfk = new tfk((Flowable) this.a.get(), (tfm) this.b.get(), (tfc) this.c.get(), (Scheduler) this.d.get(), (tfg) this.e.get(), (szp) this.f.get());
        return tfk;
    }
}
