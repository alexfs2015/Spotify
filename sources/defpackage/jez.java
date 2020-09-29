package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: jez reason: default package */
public final class jez {
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    private final Scheduler b;
    private final Scheduler c;
    private final hvl d;
    private final jfd e;
    private final jen f;
    private final jex g;

    jez(Scheduler scheduler, Scheduler scheduler2, hvl hvl, jfd jfd, jen jen, jex jex) {
        this.b = scheduler;
        this.c = scheduler2;
        this.d = hvl;
        this.e = jfd;
        this.f = jen;
        this.g = jex;
    }

    public final ObservableTransformer<jes, jet> a(jff jff) {
        jff.getClass();
        return klb.a().a(k.class, (Action) new $$Lambda$obECg49sq7BxTAwSu8gSVJPOaw8(jff)).a(g.class, (Consumer<G>) new $$Lambda$jez$PmJ0KBNlFpi1x1AFYrhXifUa9qc<G>(jff), this.c).a(h.class, (Consumer<G>) new $$Lambda$jez$ypyeecaGGnnO3mmf6vnSrPREbdE<G>(jff), this.c).a(i.class, (Consumer<G>) new $$Lambda$jez$BROUwesaqc4onFCc4D3koUnTcKE<G>(jff), this.c).a(d.class, (Consumer<G>) new $$Lambda$jez$I2TxEjxr_QkVGtiGwpVMW1pM<G>(jff), this.c).a(a.class, (Consumer<G>) new $$Lambda$jez$5j55tJtxpxEjw6UJLuiSuShk0Y0<G>(jff), this.c).a(b.class, (Consumer<G>) new $$Lambda$jez$5gnKcoD3aYLFX_zizcJek2MJC4<G>(jff), this.c).a(f.class, (ObservableTransformer<G, E>) new $$Lambda$jez$1c0Xp_c_FVX4LEmuUa_d1tBxpQ<G,E>(this.f)).a(e.class, this.g.a()).a(j.class, (ObservableTransformer<G, E>) new $$Lambda$jez$7DuAAbUD_XboNvWtcnKh4Ijp4A<G,E>(this)).a(l.class, (ObservableTransformer<G, E>) new $$Lambda$jez$xUpGJR9FeVDVvsJwXvdb4KN62W4<G,E>(this.d)).a(c.class, (ObservableTransformer<G, E>) new $$Lambda$jez$GIcbTW87BQzh5eH0mm5aorgT4Q<G,E>(this.e)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jet a(Throwable th) {
        return new c(th.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.h(new $$Lambda$jez$sDGHj8Nxr6VW1uX8nLewXbMSyP8(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(j jVar) {
        return Observable.b(new a()).c(a, TimeUnit.MILLISECONDS, this.b);
    }
}
