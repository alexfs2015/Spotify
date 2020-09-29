package defpackage;

import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: pxa reason: default package */
public final class pxa {
    public static ObservableTransformer<pwv, pww> a(qan qan, qbe qbe, qbc qbc, jtz jtz, hgy hgy, pxf pxf) {
        return kok.a().a(g.class, (ObservableTransformer<G, E>) new $$Lambda$pxa$N87YxBhNj73QJxXqyHVZwkJzFk<G,E>(hgy, a(qan, qbe, qbc))).a(b.class, (Consumer<G>) new $$Lambda$pxa$9sZC4JAry4ArlGPrbDmMjy25xLw<G>(qbe, qbc)).a(d.class, (Consumer<G>) new $$Lambda$pxa$Qw_DUzKj1CLHTupkM4b6PUCTBdA<G>(qbc, jtz)).a(e.class, (Consumer<G>) new $$Lambda$pxa$ZKZBStormkaaLsHlCHoyXcnoNDQ<G>(qbc)).a(c.class, (Consumer<G>) new $$Lambda$pxa$NRr8FI54xlhXdm3YXHXapeg2IYE<G>(qbc)).a(f.class, (Consumer<G>) new $$Lambda$pxa$miCEWNd6_qEpEIjzG4a9XORres<G>(pxf)).a(a.class, (Consumer<G>) new $$Lambda$pxa$5qQLx20B4mYwyMPzJmYEpBPJy0<G>(qbc)).a();
    }

    private static Consumer<ho<g, fqn>> a(qan qan, qbe qbe, qbc qbc) {
        return new $$Lambda$pxa$Qe96UZ3CQM6HtscOSxsQqnzjwxk(qan, qbe, qbc);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qan qan, qbe qbe, qbc qbc, ho hoVar) {
        qan.a(((g) fbp.a(hoVar.a)).a, (fqn) hoVar.b);
        qbe.a(((g) hoVar.a).a);
        qbc.b(((g) hoVar.a).b, ((g) hoVar.a).a.getButtonType());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, jtz jtz, d dVar) {
        qbc qbc2 = qbc;
        qbc2.a(dVar.a, jtz.c() - dVar.c, "banners", dVar.b.getTriggerString(), dVar.b.getType());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, a aVar) {
        String str = aVar.a;
        jlr jlr = qbc.a;
        bh bhVar = new bh(str, "com.spotify.music.features.quicksilver", null, null, 0, null, null, "banner-expanded", (double) qbc.b.a(), null);
        jlr.a(bhVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, c cVar) {
        qbc qbc2 = qbc;
        qbc2.a(cVar.c, cVar.a.getTriggerString(), cVar.a.getType(), "banners", cVar.b.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, e eVar) {
        qbc qbc2 = qbc;
        qbc2.a("banners", eVar.a, eVar.b, eVar.c, eVar.d, eVar.e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbe qbe, qbc qbc, b bVar) {
        qbe.a(bVar.a);
        qbc.a(bVar.b, "banners");
    }
}
