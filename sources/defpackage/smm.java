package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: smm reason: default package */
public final class smm implements ObservableTransformer<c, slz> {
    private final sin a;

    public smm(sin sin) {
        this.a = sin;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(c cVar) {
        return (this.a.c() ? Observable.b(this.a.a().a()) : this.a.a().c().j()).c((Function<? super T, ? extends R>) $$Lambda$smm$qpt6R7b6YUjW9giBeCx30y5qJY.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$smm$q6gJDJ8PfwfYl_RUEENemvZjFw.INSTANCE);
    }

    public final ObservableSource<slz> apply(Observable<c> observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$smm$fl48a6AgBDxv3B0zt5l0hpgfTCI<Object,Object>(this), false);
    }
}
