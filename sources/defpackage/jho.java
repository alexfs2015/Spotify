package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: jho reason: default package */
public final class jho {
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    private final Scheduler b;
    private final Scheduler c;
    private final hxx d;
    private final jhs e;
    private final jhc f;
    private final jhm g;

    jho(Scheduler scheduler, Scheduler scheduler2, hxx hxx, jhs jhs, jhc jhc, jhm jhm) {
        this.b = scheduler;
        this.c = scheduler2;
        this.d = hxx;
        this.e = jhs;
        this.f = jhc;
        this.g = jhm;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.h(new $$Lambda$jho$FpWIJgvYVB8qk_ns50HxyvYHrOs(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(j jVar) {
        return Observable.b(new a()).c(a, TimeUnit.MILLISECONDS, this.b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jhi a(Throwable th) {
        return new c(th.toString());
    }

    public final ObservableTransformer<jhh, jhi> a(jhu jhu) {
        jhu.getClass();
        return kok.a().a(k.class, (Action) new $$Lambda$UAXx7GmmPPE2FDdvfJGN00IbvQo(jhu)).a(g.class, (Consumer<G>) new $$Lambda$jho$dAqj5dTS6jjXHH_UVjtvPHWNKjo<G>(jhu), this.c).a(h.class, (Consumer<G>) new $$Lambda$jho$objI8dkCGV9XgY6KGfk7hOAnsyw<G>(jhu), this.c).a(i.class, (Consumer<G>) new $$Lambda$jho$SZddhI1V_gyIdFNiiLgHbogyV5w<G>(jhu), this.c).a(d.class, (Consumer<G>) new $$Lambda$jho$4spaXw9JSTx0K4pWQPVl3ohVtI<G>(jhu), this.c).a(a.class, (Consumer<G>) new $$Lambda$jho$r1kouXCioDeSiY4EwZI38VARJhc<G>(jhu), this.c).a(b.class, (Consumer<G>) new $$Lambda$jho$xP07EzeElU0OVvFBKVAAAxvyLgs<G>(jhu), this.c).a(f.class, (ObservableTransformer<G, E>) new $$Lambda$jho$fm_XjhRNKFVHndoZiac8UKVDbAc<G,E>(this.f)).a(e.class, this.g.a()).a(j.class, (ObservableTransformer<G, E>) new $$Lambda$jho$X_ryB7Pfcal85PUeMvp56pZ8A<G,E>(this)).a(l.class, (ObservableTransformer<G, E>) new $$Lambda$jho$2xDgYbGYN_3DyYdql3qrfzSzvw<G,E>(this.d)).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$jho$fcqDZUN36f41rXvW84F5byY_zS8<G,E>(this.e)).a();
    }
}
