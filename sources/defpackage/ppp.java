package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: ppp reason: default package */
public final class ppp {
    public static ObservableTransformer<ppl, ppm> a(prr prr, psi psi, psg psg, jrp jrp, hec hec, poj poj) {
        return klb.a().a(f.class, a(prr, psi, psg, hec)).a(a.class, (Consumer<G>) new $$Lambda$ppp$97XXwPpUpQJzRtwyfleFhHixATw<G>(psi, psg)).a(c.class, (Consumer<G>) new $$Lambda$ppp$ftUq0v1NhZWQgOYnYiuRDvTiT4<G>(psg, jrp)).a(d.class, (Consumer<G>) new $$Lambda$ppp$F1bJnuUEFR5R2ycPM1bPS8rlUt8<G>(psg)).a(e.class, (Consumer<G>) new $$Lambda$ppp$XAod7S7zpG7Evih1VXrOK8jXRs<G>(poj)).a(b.class, (Consumer<G>) new $$Lambda$ppp$mJJfT2JADgAm6HcwDoE5SYjFmM<G>(psg)).a();
    }

    private static ObservableTransformer<f, ppm> a(prr prr, psi psi, psg psg, hec hec) {
        return new $$Lambda$ppp$IwJwr4djXgGArp1AmHM99F3JfM(hec, prr, psi, psg);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, b bVar) {
        psg psg2 = psg;
        psg2.a(bVar.c, bVar.a.getTriggerString(), bVar.a.getType(), "notes", bVar.b.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, d dVar) {
        psg psg2 = psg;
        psg2.a("notes", dVar.a, dVar.b, dVar.c, dVar.d, dVar.e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, jrp jrp, c cVar) {
        psg psg2 = psg;
        psg2.a(cVar.a, jrp.c() - cVar.c, "notes", cVar.b.getTriggerString(), cVar.b.getType());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psi psi, psg psg, a aVar) {
        psi.a(aVar.a);
        psg.a(aVar.b, "notes");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(prr prr, f fVar, psi psi, psg psg, fpt fpt) {
        prr.a(fVar.a, fpt);
        psi.a(fVar.a);
        psg.b(fVar.b, fVar.a.getButtonType());
        return Observable.b(new a(fVar.a));
    }
}
