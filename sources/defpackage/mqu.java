package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Set;

/* renamed from: mqu reason: default package */
public final class mqu {
    private final mpw a;
    private final Scheduler b;
    private final Scheduler c;
    private final mrm d;
    private final mro e;
    private final mrn f;

    public mqu(mpw mpw, Scheduler scheduler, Scheduler scheduler2, mrm mrm, mro mro, mrn mrn) {
        this.a = mpw;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = mrm;
        this.e = mro;
        this.f = mrn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        this.a.ak();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        this.a.ai();
    }

    public final a<mrj, mrh, mrg> a() {
        Set a2 = kjk.a(new a());
        $$Lambda$6rakf1tM4Srfuth4tCiG1MjMBs r1 = $$Lambda$6rakf1tM4Srfuth4tCiG1MjMBs.INSTANCE;
        mpw mpw = this.a;
        mpw.getClass();
        return klb.a((kjz<M, E, F>) r1, klb.a().a(a.class, (ObservableTransformer<G, E>) this.d).a(h.class, (Action) new $$Lambda$dyerrJ172Oi7YJKvJ6HGt7YkNM8(mpw), this.b).a(c.class, (Consumer<G>) this.e, this.b).a(b.class, (Consumer<G>) this.f, this.c).a(f.class, (Consumer<G>) new $$Lambda$mqu$BU_DeTVwuAJ24NgGrBupTzv3n8<G>(this), this.b).a(g.class, (Consumer<G>) new $$Lambda$mqu$EUMLTTx4LonqnXPI5VDYbDNeK3M<G>(this), this.b).a(d.class, (Consumer<G>) $$Lambda$mqu$y9Mal01p_SupJY6euXa45kAm5PY.INSTANCE).a()).a((kjo<M, F>) new $$Lambda$mqu$jvw2fDa3D1fU1rlsULeyfBIXrc<M,F>(a2)).a(kkh.a("FollowFeed"));
    }
}
