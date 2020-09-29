package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: poe reason: default package */
public final class poe {
    public static ObservableTransformer<pnz, poa> a(prr prr, psi psi, psg psg, jrp jrp, hec hec, poj poj) {
        return klb.a().a(g.class, (ObservableTransformer<G, E>) new $$Lambda$poe$RUIUMTz2B5XhA4qsWfvD1GsDO08<G,E>(hec, a(prr, psi, psg))).a(b.class, (Consumer<G>) new $$Lambda$poe$d6woPnj6SsLKNk6Vx9ME6naNMs<G>(psi, psg)).a(d.class, (Consumer<G>) new $$Lambda$poe$nooV3kzdBRdmFDSuWL81lgm1h0<G>(psg, jrp)).a(e.class, (Consumer<G>) new $$Lambda$poe$378CxMQOJ9UzJhBpPekVNWtLGA<G>(psg)).a(c.class, (Consumer<G>) new $$Lambda$poe$woJgw3gax4J0iC1Ci4xalPcitl0<G>(psg)).a(f.class, (Consumer<G>) new $$Lambda$poe$teAdeiGAljvoh2HpgKJMQ8c9qAM<G>(poj)).a(a.class, (Consumer<G>) new $$Lambda$poe$kx_HJshcRMJrEDZfS4lz1t3uGU<G>(psg)).a();
    }

    private static Consumer<ho<g, fpt>> a(prr prr, psi psi, psg psg) {
        return new $$Lambda$poe$ZLK1FDyxYs6NSpZzjKwff6_Teo(prr, psi, psg);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(prr prr, psi psi, psg psg, ho hoVar) {
        prr.a(((g) fay.a(hoVar.a)).a, (fpt) hoVar.b);
        psi.a(((g) hoVar.a).a);
        psg.b(((g) hoVar.a).b, ((g) hoVar.a).a.getButtonType());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, a aVar) {
        String str = aVar.a;
        jjf jjf = psg.a;
        bi biVar = new bi(str, "com.spotify.music.features.quicksilver", null, null, 0, null, null, "banner-expanded", (double) psg.b.a(), null);
        jjf.a(biVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, c cVar) {
        psg psg2 = psg;
        psg2.a(cVar.c, cVar.a.getTriggerString(), cVar.a.getType(), "banners", cVar.b.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, e eVar) {
        psg psg2 = psg;
        psg2.a("banners", eVar.a, eVar.b, eVar.c, eVar.d, eVar.e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psg psg, jrp jrp, d dVar) {
        psg psg2 = psg;
        psg2.a(dVar.a, jrp.c() - dVar.c, "banners", dVar.b.getTriggerString(), dVar.b.getType());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(psi psi, psg psg, b bVar) {
        psi.a(bVar.a);
        psg.a(bVar.b, "banners");
    }
}
