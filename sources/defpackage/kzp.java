package defpackage;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: kzp reason: default package */
public final class kzp {
    public final kzr a;

    public kzp(kzr kzr) {
        this.a = (kzr) fbp.a(kzr);
    }

    public final Observable<kzw> a() {
        return Single.a((SingleSource<? extends T1>) this.a.d(), (SingleSource<? extends T2>) this.a.e().d().c((Function<? super T, ? extends R>) $$Lambda$By_T6LmBjro9YGCjVASWDfzxmgI.INSTANCE).h(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$kzp$wDKqgfUHC9YtTvlUcF3HFQkepn0.INSTANCE).d();
    }
}
