package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Scheduler;
import io.reactivex.Single;

/* renamed from: pfe reason: default package */
public final class pfe {
    private final Single<String> a;
    private final Scheduler b;
    private final Scheduler c;
    private final ObjectMapper d;
    private final sia e;
    private final spi f;
    private final phh g;

    public pfe(Single<String> single, Scheduler scheduler, Scheduler scheduler2, rnf rnf, sia sia, spi spi, phh phh) {
        this.a = single;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.e = sia;
        this.f = spi;
        this.g = phh;
    }

    /* access modifiers changed from: 0000 */
    public c<pga, pfy, pfx> a() {
        return klb.a((kjz<M, E, F>) $$Lambda$vbs5jdU8BVBz19FytnIi1mV9wfs.INSTANCE, pgb.a(this.a, this.d, this.c, this.f, this.g)).b(new $$Lambda$pfe$aShmDX9agjDINKnBRqzztbNaSdA(this)).a((kkp<kkv>) new $$Lambda$pfe$lE5Yko7MoVbz_oYVFfTt2IXmqg<kkv>(this)).a((kjo<M, F>) $$Lambda$Gsjtd81h1xnerWWihN6KPtbH0cg.INSTANCE).a(pgc.a(this.e)).a(kkh.a("PremiumPage Feature"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv c() {
        return new kld(this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv b() {
        return new kld(this.c);
    }
}
