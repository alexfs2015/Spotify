package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: pys reason: default package */
public final class pys implements wig<pyr> {
    private final wzi<pyt> a;
    private final wzi<pzo> b;
    private final wzi<pwe> c;
    private final wzi<rtg> d;
    private final wzi<Flowable<PlayerState>> e;
    private final wzi<pzl> f;
    private final wzi<Scheduler> g;

    private pys(wzi<pyt> wzi, wzi<pzo> wzi2, wzi<pwe> wzi3, wzi<rtg> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<pzl> wzi6, wzi<Scheduler> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static pys a(wzi<pyt> wzi, wzi<pzo> wzi2, wzi<pwe> wzi3, wzi<rtg> wzi4, wzi<Flowable<PlayerState>> wzi5, wzi<pzl> wzi6, wzi<Scheduler> wzi7) {
        pys pys = new pys(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return pys;
    }

    public final /* synthetic */ Object get() {
        pyr pyr = new pyr((pyt) this.a.get(), (pzo) this.b.get(), (pwe) this.c.get(), (rtg) this.d.get(), (Flowable) this.e.get(), (pzl) this.f.get(), (Scheduler) this.g.get());
        return pyr;
    }
}
