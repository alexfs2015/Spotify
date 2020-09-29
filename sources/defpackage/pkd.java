package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: pkd reason: default package */
public final class pkd implements pkc {
    private final pkg b;
    private final pkz c;
    private final pkv d;
    private final pkr e;

    /* renamed from: pkd$a */
    interface a {
        pkj transform(b bVar);
    }

    public pkd(pkg pkg, pkz pkz, pkv pkv, pkr pkr) {
        this.b = pkg;
        this.c = pkz;
        this.d = pkv;
        this.e = pkr;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pki a(b bVar) {
        return new c(bVar.a);
    }

    /* access modifiers changed from: private */
    public pkj a(pkj pkj) {
        return a(pkj, (a) new $$Lambda$pkd$DH3z8_xjKcJNAgElmrfJafSUe_k(this));
    }

    private static pkj a(pkj pkj, a aVar) {
        $$Lambda$pkd$JGbtCyya_aQ5nWeZFmXXEzxQDgc r0 = $$Lambda$pkd$JGbtCyya_aQ5nWeZFmXXEzxQDgc.INSTANCE;
        aVar.getClass();
        return (pkj) pkj.a(r0, new $$Lambda$49a32sAAe7egxE9EpPKT4pmRHso(aVar));
    }

    /* access modifiers changed from: private */
    public pkj a(pkj pkj, pky pky) {
        return a(pkj, (a) new $$Lambda$pkd$VeiFB9gtoiRmZg9wRrQK9PB7xiM(this, pky));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ pkj a(pky pky, b bVar) {
        return pkj.a(pkv.a(bVar.a, pky));
    }

    /* access modifiers changed from: private */
    public static pki b(pkj pkj) {
        return (pki) pkj.a($$Lambda$pkd$dkY_Lfi7VSirMn0Wq8k3yVgnAY.INSTANCE, $$Lambda$pkd$QFmnOR4vJurJ45Vyg4KtJuwrePc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pkj b(defpackage.pkj.a aVar) {
        return aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ pkj b(b bVar) {
        pkr pkr = this.e;
        return pkj.a(pkr.a.a(bVar.a));
    }

    public final Observable<pki> fetch(String str) {
        return Observable.a((ObservableSource<? extends T1>) this.b.a(str).f(new $$Lambda$pkd$AcxqP9hTNIzVuUILRKDkJeY8K0(this)).d(), (ObservableSource<? extends T2>) this.c.a(), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$pkd$GMlxyjj3QH__RhSzTYsnuoWTtI<Object,Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$pkd$qeWS7_Zh10JWKmVDOcovDf0VxMQ.INSTANCE).a(Functions.a());
    }
}
