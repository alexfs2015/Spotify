package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: hgv reason: default package */
final class hgv {
    final CompositeDisposable a = new CompositeDisposable();
    private final jug b;
    private final hgu c;

    public hgv(jug jug, hgu hgu) {
        this.b = (jug) fay.a(jug);
        this.c = (hgu) fay.a(hgu);
    }

    public final void a() {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = this.b.n.c((Function<? super T, ? extends R>) $$Lambda$CqiVEaI_oXpQyMRaBZ5VdfOm_EY.INSTANCE).a(Functions.a());
        hgu hgu = this.c;
        hgu.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$CAunEg8JNV7hsPfMarHEvWGnFo<Object>(hgu), (Consumer<? super Throwable>) $$Lambda$hgv$u3JImcqja6RkPPU1xen8Sscmwlw.INSTANCE));
    }
}
