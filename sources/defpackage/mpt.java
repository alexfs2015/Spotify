package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: mpt reason: default package */
public final class mpt {
    public final Observable<mqa> a;
    private final rzo b;

    mpt(rzo rzo) {
        this.b = (rzo) fbp.a(rzo);
        this.a = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$mpt$EIDwpBu5wtwpMco2hYKcc6yyNg<Object>(this, rzo)).a(1).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(rzo rzo) {
        if (!(rzo.e.a.get() != null)) {
            rzo.e.accept(Boolean.valueOf(rzo.a(false)));
        }
        return rzo.e.c((Function<? super T, ? extends R>) new $$Lambda$mpt$IA05xgRcPA5f_dJ0pY30d71rMsk<Object,Object>(this)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ mqa a(Boolean bool) {
        return new a().a(false).b(false).c(false).b(bool.booleanValue()).c(this.b.d.e(rzo.a)).a();
    }
}
