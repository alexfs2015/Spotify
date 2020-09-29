package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: mvh reason: default package */
public final class mvh {
    private final muf a;
    private final Scheduler b;
    private final Scheduler c;
    private final mwc d;
    private final mwg e;
    private final mwe f;

    public mvh(muf muf, Scheduler scheduler, Scheduler scheduler2, mwc mwc, mwg mwg, mwe mwe) {
        this.a = muf;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = mwc;
        this.e = mwg;
        this.f = mwe;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        this.a.ak();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        this.a.ai();
    }

    public final b<mvz, mvx> a(mvz mvz, Observable<mvx> observable) {
        $$Lambda$qcCLevv6kAJzJyhG3HAJXJTI6hU r0 = $$Lambda$qcCLevv6kAJzJyhG3HAJXJTI6hU.INSTANCE;
        muf muf = this.a;
        muf.getClass();
        return knk.a(kok.a((kni<M, E, F>) r0, kok.a().a(a.class, (ObservableTransformer<G, E>) this.d).a(h.class, (Action) new $$Lambda$ciggGm5z668GKo1A8Tlcvebb0(muf), this.b).a(c.class, (Consumer<G>) this.e, this.b).a(b.class, (Consumer<G>) this.f, this.c).a(f.class, (Consumer<G>) new $$Lambda$mvh$5p2GJMaFHGvkS49DWljk_SRbvI<G>(this), this.b).a(g.class, (Consumer<G>) new $$Lambda$mvh$ZURgw3GAVTJU2oco38IOUMSHit4<G>(this), this.b).a(d.class, (Consumer<G>) $$Lambda$mvh$3UgTZGw0sBA6TXeZrgouNz6vu0.INSTANCE).a()).a(koj.a(observable)).a(knq.a("FollowFeed")), mvz);
    }
}
