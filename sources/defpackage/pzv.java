package defpackage;

import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: pzv reason: default package */
public final class pzv implements wig<a<TriggerEngineModel, qab, qaa>> {
    private final wzi<Observable<qab>> a;
    private final wzi<Observable<qab>> b;
    private final wzi<Observable<qab>> c;
    private final wzi<Observable<qab>> d;
    private final wzi<pzj> e;
    private final wzi<qae> f;
    private final wzi<pxt> g;
    private final wzi<pzo> h;
    private final wzi<qba> i;
    private final wzi<hgy> j;
    private final wzi<qbc> k;
    private final wzi<jty> l;
    private final wzi<Scheduler> m;
    private final wzi<Observable<Boolean>> n;

    public static a<TriggerEngineModel, qab, qaa> a(Observable<qab> observable, Observable<qab> observable2, Observable<qab> observable3, Observable<qab> observable4, pzj pzj, qae qae, pxt pxt, pzo pzo, qba qba, hgy hgy, qbc qbc, jty jty, Scheduler scheduler, Observable<Boolean> observable5) {
        return (a) wil.a(CC.a(observable, observable2, observable3, observable4, pzj, qae, pxt, pzo, qba, hgy, qbc, jty, scheduler, observable5), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Observable) this.a.get(), (Observable) this.b.get(), (Observable) this.c.get(), (Observable) this.d.get(), (pzj) this.e.get(), (qae) this.f.get(), (pxt) this.g.get(), (pzo) this.h.get(), (qba) this.i.get(), (hgy) this.j.get(), (qbc) this.k.get(), (jty) this.l.get(), (Scheduler) this.m.get(), (Observable) this.n.get());
    }
}
