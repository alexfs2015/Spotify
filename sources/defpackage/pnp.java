package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: pnp reason: default package */
public final class pnp {
    private final prr a;
    private final psi b;
    private final psg c;
    private final jrp d;
    private final hec e;
    private final pnt f;
    private final poj g;
    private final Scheduler h;
    private final Scheduler i;

    public pnp(prr prr, psi psi, psg psg, jrp jrp, hec hec, pnt pnt, poj poj, Scheduler scheduler, Scheduler scheduler2) {
        this.a = prr;
        this.b = psi;
        this.c = psg;
        this.d = jrp;
        this.e = hec;
        this.f = pnt;
        this.g = poj;
        this.h = scheduler;
        this.i = scheduler2;
    }

    public c<poc, poa, pnz> a(Observable<poa> observable) {
        return klb.a((kjz<M, E, F>) $$Lambda$QoGlFVGoMwjVsw438d1R_lAEvXU.INSTANCE, poe.a(this.a, this.b, this.c, this.d, this.e, this.g)).a(pof.a(observable, this.f)).b(new $$Lambda$pnp$8o87w42EJ8DgGdW36SUoQ3pCWo(this)).a((kkp<kkv>) new $$Lambda$pnp$rSZlal45AGVAISYIY1oiFFJTw9o<kkv>(this)).a(kkh.a("TriggerEngineBanner"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv b() {
        return new kld(this.h);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv a() {
        return new kld(this.i);
    }
}
