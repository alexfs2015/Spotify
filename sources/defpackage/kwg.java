package defpackage;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: kwg reason: default package */
public final class kwg {
    public final kwi a;

    public kwg(kwi kwi) {
        this.a = (kwi) fay.a(kwi);
    }

    public final Observable<kwn> a() {
        return Single.a((SingleSource<? extends T1>) this.a.d(), (SingleSource<? extends T2>) this.a.e().d().c((Function<? super T, ? extends R>) $$Lambda$By_T6LmBjro9YGCjVASWDfzxmgI.INSTANCE).h(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$kwg$hVTHC1iWMuzyADyWQu0UXFUYcE.INSTANCE).d();
    }
}
