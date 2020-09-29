package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;

/* renamed from: pyl reason: default package */
public final class pyl {
    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(qan qan, f fVar, qbe qbe, qbc qbc, fqn fqn) {
        qan.a(fVar.a, fqn);
        qbe.a(fVar.a);
        qbc.b(fVar.b, fVar.a.getButtonType());
        return Observable.b(new a(fVar.a));
    }

    private static ObservableTransformer<f, pyi> a(qan qan, qbe qbe, qbc qbc, hgy hgy) {
        return new $$Lambda$pyl$gXNaA_bTvCLRz2AhobFxGKK8bAI(hgy, qan, qbe, qbc);
    }

    public static ObservableTransformer<pyh, pyi> a(qan qan, qbe qbe, qbc qbc, jtz jtz, hgy hgy, pxf pxf) {
        return kok.a().a(f.class, a(qan, qbe, qbc, hgy)).a(a.class, (Consumer<G>) new $$Lambda$pyl$VxbV10BlNYoGtSYsgpvruU4Ycc<G>(qbe, qbc)).a(c.class, (Consumer<G>) new $$Lambda$pyl$c4NDeiZTgeAYb1lPr1sGbt4c3ko<G>(qbc, jtz)).a(d.class, (Consumer<G>) new $$Lambda$pyl$tmtxhq7rL_j6Trvgcn6u4a7UoY<G>(qbc)).a(e.class, (Consumer<G>) new $$Lambda$pyl$1xkCKIvbYE6qUSjGPxPfEmTU<G>(pxf)).a(b.class, (Consumer<G>) new $$Lambda$pyl$pxhDCaOmiyrmSnc9Dz0wr_DXws<G>(qbc)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, jtz jtz, c cVar) {
        qbc qbc2 = qbc;
        qbc2.a(cVar.a, jtz.c() - cVar.c, "notes", cVar.b.getTriggerString(), cVar.b.getType());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, b bVar) {
        qbc qbc2 = qbc;
        qbc2.a(bVar.c, bVar.a.getTriggerString(), bVar.a.getType(), "notes", bVar.b.getId());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbc qbc, d dVar) {
        qbc qbc2 = qbc;
        qbc2.a("notes", dVar.a, dVar.b, dVar.c, dVar.d, dVar.e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(qbe qbe, qbc qbc, a aVar) {
        qbe.a(aVar.a);
        qbc.a(aVar.b, "notes");
    }
}
