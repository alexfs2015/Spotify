package defpackage;

import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: pqz reason: default package */
public final class pqz implements vua<a<TriggerEngineModel, prf, pre>> {
    private final wlc<Observable<prf>> a;
    private final wlc<Observable<prf>> b;
    private final wlc<Observable<prf>> c;
    private final wlc<Observable<prf>> d;
    private final wlc<pqn> e;
    private final wlc<pri> f;
    private final wlc<pox> g;
    private final wlc<pqs> h;
    private final wlc<pse> i;
    private final wlc<hec> j;
    private final wlc<psg> k;
    private final wlc<jro> l;
    private final wlc<Scheduler> m;
    private final wlc<Scheduler> n;
    private final wlc<Observable<Boolean>> o;

    public static a<TriggerEngineModel, prf, pre> a(Observable<prf> observable, Observable<prf> observable2, Observable<prf> observable3, Observable<prf> observable4, pqn pqn, pri pri, pox pox, pqs pqs, pse pse, hec hec, psg psg, jro jro, Scheduler scheduler, Scheduler scheduler2, Observable<Boolean> observable5) {
        return (a) vuf.a(CC.a(observable, observable2, observable3, observable4, pqn, pri, pox, pqs, pse, hec, psg, jro, scheduler, scheduler2, observable5), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get(), (Observable) this.d.get(), (pqn) this.e.get(), (pri) this.f.get(), (pox) this.g.get(), (pqs) this.h.get(), (pse) this.i.get(), (hec) this.j.get(), (psg) this.k.get(), (jro) this.l.get(), (Scheduler) this.m.get(), (Scheduler) this.n.get(), (Observable) this.o.get());
    }
}
