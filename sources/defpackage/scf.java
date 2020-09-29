package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: scf reason: default package */
public final class scf implements ObservableTransformer<c, sbs> {
    private final ryz a;

    public scf(ryz ryz) {
        this.a = ryz;
    }

    public final ObservableSource<sbs> apply(Observable<c> observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$scf$jcDp5MKo7qAuniQf9ivauJf5oe8<Object,Object>(this), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(c cVar) {
        Observable observable;
        if (this.a.c()) {
            observable = Observable.b(this.a.a().a());
        } else {
            observable = this.a.a().c().j();
        }
        return observable.c((Function<? super T, ? extends R>) $$Lambda$scf$Ff9KfGsM18bHp0OkH0wLCsCGOc.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$scf$qmM6RG2sxOSl8VxaGZ_SPm2RVtA.INSTANCE);
    }
}
