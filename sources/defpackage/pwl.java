package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: pwl reason: default package */
public final class pwl {
    private final qan a;
    private final qbe b;
    private final qbc c;
    private final jtz d;
    private final hgy e;
    private final pwp f;
    private final pxf g;
    private final Scheduler h;

    public pwl(qan qan, qbe qbe, qbc qbc, jtz jtz, hgy hgy, pwp pwp, pxf pxf, Scheduler scheduler) {
        this.a = qan;
        this.b = qbe;
        this.c = qbc;
        this.d = jtz;
        this.e = hgy;
        this.f = pwp;
        this.g = pxf;
        this.h = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe a() {
        return new kom(this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe b() {
        return new kom(this.h);
    }

    public c<pwy, pww, pwv> a(Observable<pww> observable) {
        return kok.a((kni<M, E, F>) $$Lambda$NECB4KPMrozDeXoxYxRzmEwGPA.INSTANCE, pxa.a(this.a, this.b, this.c, this.d, this.e, this.g)).a(pxb.a(observable, this.f)).b(new $$Lambda$pwl$DlH2gdZa8N8u7ib7IkUG0Jee6Og(this)).a((kny<koe>) new $$Lambda$pwl$5FXPSzrmDEN6jknrpinMkDfXh3o<koe>(this)).a(knq.a("TriggerEngineBanner"));
    }
}
