package defpackage;

import io.reactivex.Scheduler;

/* renamed from: pxh reason: default package */
public final class pxh {
    private final qbc a;
    private final pxf b;
    private final pzo c;
    private final rtj d;
    private final Scheduler e;

    public pxh(qbc qbc, pxf pxf, pzo pzo, rtj rtj, Scheduler scheduler) {
        this.a = qbc;
        this.b = pxf;
        this.c = pzo;
        this.d = rtj;
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe a() {
        return new kom(this.e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe b() {
        return new kom(this.e);
    }

    public final a<pxp, pxn, pxm> a(pxd pxd, pwj pwj, pxy pxy) {
        $$Lambda$tiC6X4G0M5LSbh6IQYVAoHe9ho r0 = $$Lambda$tiC6X4G0M5LSbh6IQYVAoHe9ho.INSTANCE;
        rtj rtj = this.d;
        a a2 = kok.a((kni<M, E, F>) r0, kok.a().a(a.class, pxr.a(this.a)).a(b.class, pxr.a(pxd, pwj, pxy)).a(c.class, pxr.a(rtj)).a());
        pzo pzo = this.c;
        pxf pxf = this.b;
        return a2.a(koj.a(pxs.a(pzo), pxf.a())).b(new $$Lambda$pxh$EJp2Bfm8XpHyCX0dITozpHwmNUM(this)).a((kny<koe>) new $$Lambda$pxh$0q6r15SEtry3GtfbAM97wb5t4LA<koe>(this)).a(knq.a("TriggerEngineDisplayController"));
    }
}
