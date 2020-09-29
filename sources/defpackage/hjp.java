package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: hjp reason: default package */
final class hjp {
    final CompositeDisposable a = new CompositeDisposable();
    private final jwo b;
    private final hjo c;

    public hjp(jwo jwo, hjo hjo) {
        this.b = (jwo) fbp.a(jwo);
        this.c = (hjo) fbp.a(hjo);
    }

    public final void a() {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = this.b.n.c((Function<? super T, ? extends R>) $$Lambda$CqiVEaI_oXpQyMRaBZ5VdfOm_EY.INSTANCE).a(Functions.a());
        hjo hjo = this.c;
        hjo.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$NONmCd76aNDgJC1Gt2qrO9yp9oo<Object>(hjo), (Consumer<? super Throwable>) $$Lambda$hjp$4Qn2tCwk5Nh9fo9rnj2ITHMlvbA.INSTANCE));
    }
}
