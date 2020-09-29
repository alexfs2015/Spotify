package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: mla reason: default package */
public final class mla {
    public final Observable<mlh> a;
    private final rqd b;

    mla(rqd rqd) {
        this.b = (rqd) fay.a(rqd);
        this.a = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$mla$Y8S0isdUjOYHFo664XaRAOjyI<Object>(this, rqd)).a(1).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(rqd rqd) {
        if (!(rqd.e.a.get() != null)) {
            rqd.e.accept(Boolean.valueOf(rqd.a(false)));
        }
        return rqd.e.c((Function<? super T, ? extends R>) new $$Lambda$mla$uLR8BdVhLMH_vV0prVsg4a0lo<Object,Object>(this)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ mlh a(Boolean bool) {
        return new a().a(false).b(false).c(false).b(bool.booleanValue()).c(this.b.d.e(rqd.a)).a();
    }
}
