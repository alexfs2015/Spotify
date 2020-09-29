package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Scheduler;
import io.reactivex.Single;

/* renamed from: pmq reason: default package */
public final class pmq {
    private final Single<String> a;
    private final Scheduler b;
    private final ObjectMapper c;
    private final ssh d;
    private final szp e;
    private final pny f;

    public pmq(Single<String> single, Scheduler scheduler, rwl rwl, ssh ssh, szp szp, pny pny) {
        this.a = single;
        this.b = scheduler;
        this.c = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.d = ssh;
        this.e = szp;
        this.f = pny;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe b() {
        return new kom(this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe c() {
        return new kom(this.b);
    }

    /* access modifiers changed from: 0000 */
    public c<pnm, pnk, pnj> a() {
        return kok.a((kni<M, E, F>) $$Lambda$bhxv8npNn1xy7njG3Ct4Iz1No0.INSTANCE, pnn.a(this.a, this.c, this.b, this.e, this.f)).b(new $$Lambda$pmq$CDtP_Hvzx0t8g3_0B1Hj_C5Tjw(this)).a((kny<koe>) new $$Lambda$pmq$FSVTkBs_2WqGdMgyXTkJWlo1UkI<koe>(this)).a((kmx<M, F>) $$Lambda$huLqfE61vlhPjN4jRnJxDVUtgOE.INSTANCE).a(pno.a(this.d)).a(knq.a("PremiumPage Feature"));
    }
}
